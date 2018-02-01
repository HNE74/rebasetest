package de.hne.playground;

/**
 * PlaygroundMain Kommentar.
 * @author 057530
 */
public class PlaygroundMain {
	
	public int a;
	
	public static final String CONST_ALPHA = "alpha";
	
	public String test;
	
	public static void main(String args[]) {
		System.out.println("Ausgabe!");		
	}
	
	public void randomize() {
		
	}
	
	public int getA() {
		return a;
	}
	
	public void hello() {
		System.out.println("Hello!");
	}
	
	public void doEnter() {
		// Enter Comment
	}
	
	public void setTest(String test) {
		this.test = test;
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
	}
}
