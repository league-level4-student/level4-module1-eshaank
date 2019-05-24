package Module_1_Checkpoint;

public class Checkpoint {
public static void main(String[] args) {
	int rand = (int) (Math.random() * 5);
	
	switch(rand) {
	case 0:
		System.out.println("0");
		break;
	case 1:
		System.out.println("1");
		break;
	case 2:
		System.out.println("2");
		break;
	case 3:
		System.out.println("3");
		break;
	case 4:
		System.out.println("4");
		break;
	default:
		System.out.println("This shouldn't be printed");
	}
}
}
