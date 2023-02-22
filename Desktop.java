package org.system;

public class Desktop extends Computer{

	public void desktopSize() {
		System.out.println("No of Desktops is 100");
	}
	
	public static void main(String[] args) {
		Desktop orderPC = new Desktop();
		orderPC.computerModel();
		orderPC.desktopSize();
		orderPC.moniterSize();
		orderPC.computerType();
	}
}
