package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {
	public static void main(String[] args) {
		new TextUndoRedo().UI();
	}
	Stack<String>hello = new Stack<String>();
	Stack<String>deleted = new Stack<String>();
	JLabel label = new JLabel();
	void UI() {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		label.addKeyListener(this);
		panel.add(label);
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
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
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("hi");
		char add = e.getKeyChar();
		String letter = Character.toString(add);
		hello.add(letter);
		label.setText(letter);
		if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE) {
			deleted.add(hello.peek());
			hello.remove(hello.peek());
		}
		if(e.getKeyCode()==KeyEvent.VK_UP) {
			hello.add(deleted.peek());
			deleted.remove(deleted.peek());
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
