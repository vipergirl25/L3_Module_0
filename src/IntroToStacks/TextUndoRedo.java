package IntroToStacks;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener{
	JPanel panel = new JPanel();
	JLabel label = new JLabel();
	JFrame frame = new JFrame();
	Character text;
	Character undo;
	String textstring;
	Stack<Character>letters = new Stack<Character>();
	void UI() {
		panel.add(label);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.addKeyListener(this);
	}
	public static void main(String[] args) {
		new TextUndoRedo().UI();
	}
	@Override
	public void keyPressed(KeyEvent arg0) {
		textstring="";
		if(arg0.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
			undo = letters.pop();
			textstring+=letters.toString();
		}else if(arg0.getKeyCode()==KeyEvent.VK_UP) {
			letters.add(undo);
			textstring+=letters.toString();
		}else {
			text = arg0.getKeyChar();
			letters.add(text);
			for (int i = 0; i < letters.size(); i++) {
				textstring+=letters.get(i).toString();
				System.out.println(letters.get(i).toString());
			}
			label.setText(textstring);
			letters.push(arg0.getKeyChar());
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	}
	/* 
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	 * Save that deleted character onto a Stack of Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	 * off the Stack and added back to the JLabel.
	 * 
	 * */

