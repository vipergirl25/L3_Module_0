package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	JButton addentry = new JButton("Add Entry");
	JButton searchbyid  = new JButton("Search by ID");
	JButton viewlist = new JButton("View List");
	JButton remove = new JButton("Remove");
	void GUI() {
		map.put(123, "Harry Howard");
		map.put(245, "Polly Powers");
		map.put(433, "Oliver Ortegg");
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		panel.add(addentry);
		panel.add(searchbyid);
		panel.add(viewlist);
		panel.add(remove);
		frame.add(panel);
		frame.setVisible(true);
		addentry.addActionListener(this);
		searchbyid.addActionListener(this);
		viewlist.addActionListener(this);
		remove.addActionListener(this);
	}
	public static void main(String[] args) {
		new LogSearch().GUI();
	}
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("hellohi");
		if(e.getSource() == addentry) {
			String idNumberInput = JOptionPane.showInputDialog("Enter an ID Number");
			int idNumber = Integer.parseInt(idNumberInput);
			String name = JOptionPane.showInputDialog("Enter a Name");
			map.put(idNumber, name);
		}else if(e.getSource() == searchbyid) {
			String UserIdNumber = JOptionPane.showInputDialog("Enter an ID Number"); int getIDNumber = Integer.parseInt(UserIdNumber);
			if(map.containsKey(getIDNumber)) {
				JOptionPane.showMessageDialog(null, "Name: " + map.get(UserIdNumber));
			}
		}else if(e.getSource() == viewlist) {
			String string = new String();
			System.out.println("hello");
			for(Integer i: map.keySet()) {
				string+="ID: " + i + "Name: " + map.get(i);
			}
			JOptionPane.showMessageDialog(null, string);
		}else if(e.getSource() == remove) {
			String hello = JOptionPane.showInputDialog("Enter an ID Number: ");
				int hello2 = Integer.parseInt(hello);
				if(map.containsKey(hello2)) {
					map.remove(hello2);
				}
			}
		}
			
		
	}

