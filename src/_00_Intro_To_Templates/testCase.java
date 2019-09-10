package _00_Intro_To_Templates;

public class testCase {
	private String name;
	private int age;

	public testCase() {
		name = "";
		age = 0;
		
	}
	
	public testCase(int ag, String nam) {
		age = ag;
		name = nam;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String s) {
		name =  s;
	}
	public void setAge(int a) {
		age =  a;
	}
	
}
