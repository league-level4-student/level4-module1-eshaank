package _03_Switch_Statement_Practice;

import javax.swing.JOptionPane;

public class CustomButtonOptionPanes {
	public static void main(String[] args) {
		String[] options = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int input = JOptionPane.showOptionDialog(null, "Choose a day of the week", "Custom Buttons", JOptionPane.YES_NO_OPTION, -1, null,
				options, 0);

		String choice = options[input];
		
		//use a switch statement to do something cool for each option
		
		switch(choice) {
		case "Sunday":
			System.out.println("Today is Sunday");
			break;
		case "Monday":
			System.out.println("Today is Monday");
			break;
		case "Tuesday":
			System.out.println("Today is the second day of the week");
			break;
		case "Wednesday":
			System.out.println("Today is the third day of the week. Half way through. Yay...");
			break;
		case "Thursday":
			System.out.println("Only one more day until Friday. The day after Thursday ");
			break;
		case "Friday":
			for (int i = 0; i < options.length; i++) {
				System.out.println("Friday");
			}
			break;
		case "Saturday":
			System.out.println("The last day of the week");
			break;
		}
	}
}
