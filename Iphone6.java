package oopExam;

public class Iphone6 extends Iphone5 {
	public void compass() {
		System.out.println("\tThe Compass app shows you the direction iPhone is pointing,"
				+ "\n\t your current location, and elevation.");
	}

	/*
	 * 
	 * 
	 * What kind of concept you can use to relate to Iphone1 to 6? Instantiate
	 * Iphone6 in TestPhone and show how many methods they can call in TestPhone.
	 * [points: 70] .
	 * 
	 * Sazzad vaia:write in the testphone
	 */



	public int ramPrice;
	public int cameraPrice;
	public String processorPrice;
	public int monitorPrice;

	public void material() {// void

	}

	public int material(int ramPrice, int cameraPrice) {
		return 0;
	}// return type parameterized

	public int material(int ramPrice,  int cameraPrice,String processorPrice) {
		int total = ramPrice + Integer.parseInt(processorPrice+cameraPrice);
		return total;
	}// return type  parameteraized

	public void material(int ramPrice,String processoPrice) {// void parameterized

	}

	public static int material(int ramPrice) {// Static return type parameterised method
		return 0;

	}

	public final int material(int ramPrice, int cameraPrice, int monitorPrice, String processorPrice) {// final return
																										// type
																										// parameterised
																										// method
		return 0;

	}
	/*
	 * The concept used here is called polymorphism
	 */
	/*
	 * Polymorphism is the ability of an object to take on many forms. Two types of
	 * polymorphism- 1. Static Polymorphism or early binding or method overloading
	 * or compile time polymorphism: happens in compile time. When different methods
	 * exist with the same method name but with different parameters or signature,
	 * it is called method overloading. 2. Dynamic Polymorphism or late binding or
	 * method overriding or run time polymorphism: happens in Run time. When
	 * different methods exist with the same method name with same parameters or
	 * signature but with different syntax or logic, it is called method overriding.
	 */
	/*

	 *  [points: 70]. Now think about a regular class Name ConfiguredIphone6
	 * which extends Iphone6. Override those methods of Iphone6 and change the logic
	 * at your own to show the changes. [points: 50]. Show the output in TestPhone
	 * (how many methods is possible to extends). [points: 50].
	 * 
	 * Please make sure you organize the code in every class
	 * 
	 * Paste the github link for the package below
	 * 
	 */
}
