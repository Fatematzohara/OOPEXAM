package oopExam;

public class Iphone2 extends Iphone1 {

	public char userOfIphone2 = 'F';

	public Iphone2() {

	}

	public Iphone2(char userOfIphone2) {
		super();
		super.setInfo("\nthis is from parametarazied constructor and the parameter is :" + userOfIphone2);

	}

	public void iPhone2Info() {
		super.storage = 64;
	}

	public void iPhone2Info(char userOfIphone2) {
	}

	public void dropbox() {
		System.out.println("\nDropbox is a cloud storage solution, equipped with features to help you save time,"
				+ " \nimprove your productivity, and collaborate with others. ");
	}
}
