package _00_Intro_To_Templates;

import java.awt.List;
import java.util.ArrayList;

public class test extends testCase {
	public static void main(String[] args) {

//		String[][] arry = { { "hi", "HI" }, 
//							{ "bye", "BYE" } };
//		for (int row = 0; row < arry.length; row++) {
//			for (int col = 0; col < arry.length; col++) {
//				System.out.print(arry[row][col] + " ");
//			}
//			System.out.println();
//		}

	testCase h = new testCase(23, "Bob");
	h.setAge(32);
	h.setName("joe");
			System.out.println(h.getName() + " " + h.getAge());
		
	}

}
