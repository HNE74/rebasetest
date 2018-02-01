package de.hne.playground;

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
	
	public void setTest(String test) {
		this.test = test;
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
	}
}
