package _02_Intro_to_Switch_Statements;

public class Test {
public static void main(String[] args) {
	int x = 0;
	switch(x){
	    case 0: x = 2;
	    break;
	    case 34: x = 4;
	    case 290: x = 6;
	    case 10292: x = 8;
	    default: x = 10;
	}
	System.out.println(x);
}
}
