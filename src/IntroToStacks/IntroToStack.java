package IntroToStacks;

import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class IntroToStack {
	public static void main(String[] args) {
		//1. Create a Stack of Doubles
		Stack<Double>hello = new Stack<Double>();
		//   Don't forget to import the Stack class
		
		//2. Use a loop to push 100 random doubles between 0 and 100 to the Stack.
		Random r1 = new Random();
		for (int i = 0; i < 100; i++) {
			hello.push(r1.nextDouble()*100);
		}
		//3. Ask the user to enter in two numbers between 0 and 100, inclusive. 
		String sfirstnumber = JOptionPane.showInputDialog("Enter in a number between 0 and 100: ");
		String ssecondnumber = JOptionPane.showInputDialog("Enter in a second number between 0 and 100: ");
		double firstnum = Integer.parseInt(sfirstnumber);
		double secnum = Integer.parseInt(ssecondnumber);
		
		//4. Pop all the elements off of the Stack. Every time a double is popped that is
		//   between the two numbers entered by the user, print it to the screen.
		for (int i = 0; i < hello.size(); i++) {
			hello.pop();
			if(hello.pop()>firstnum && hello.pop()<secnum) {
				JOptionPane.showMessageDialog(null, hello.pop());
			}
		}
		
		//   EXAMPLE:
		//   NUM 1: 65
		//   NUM 2: 75
		
		//   Popping elements off stack...
		//   Elements between 65 and 75:
		//   66.66876846
		//   74.51651681
		//   70.05110654
		//   69.21350456
		//   71.54506465
		//   66.47984807
		//   74.12121224
	}
}
