package oopExam;

public class Iphone2 extends Iphone1 {

	public char userOfIphone2 = 'F';

	public Iphone2() {
		super();
		/// need aattention!!!

	}

	public void iphone2(char userOfIphone2) {

		super.setInfo("this is from parametarazied constructor and the parameter is :" + userOfIphone2);

	}

	public void iPhone2Info() {
		super.storage = 64;
	}

	public void iPhone2Info(char userOfIphone2) {
	}

	/*
	 * 1) In IPhone2, Initialize a char variable userOfIphone2 (M or F). create
	 * default and parameterized constructor, a void type method iPhone2Info, a
	 * parameterized method with same name iPhone2Info inside Iphone2 class. Use the
	 * super method and super keyword in constructor, and super keyword in methods
	 * of Iphone2. Call constructor and methods. Can you call variable by super
	 * keyword? create a public variable inside Iphone1 and execute it in Iphone2.
	 * Execute all of them in TestPhone. [points: 70]
	 */
	public void dropbox() {
		System.out.println(
				"Dropbox is a cloud storage solution, equipped with features to help you save time, improve your productivity, and collaborate with others. ");
	}
}
