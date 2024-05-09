package oopExam;

/*
 * We can make a relation of iphone1 with phone interface with implements
*keyword and applewatch abstract class with extends keyword.we have to override 
*some unimpliemented methods to make them implemented methods so that the regular
*class can inherit them
*/
public class Iphone1 extends AppleWatch implements Phone {

	@Override
	public void pager() {
		// TODO Auto-generated method stub

	}

	@Override
	public void wakiToki() {
		// TODO Auto-generated method stub

	}

	@Override
	public void watch() {
		// TODO Auto-generated method stub

	}

	@Override
	public void digitalWatch() {
		// TODO Auto-generated method stub

	}

	@Override
	public void interfaceInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void call() {
		// TODO Auto-generated method stub

	}

	@Override
	public void message() {
		// TODO Auto-generated method stub

	}

	@Override
	public void camera() {
		// TODO Auto-generated method stub

	}

	@Override
	public void appleWatchInfo() {
		// TODO Auto-generated method stub

	}

	public int storage;
	private int price;
	private String info;
	private char user;
	private boolean madeInUSA;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean getMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}

	// by using the encapsulation concept,we can use the private variables.it works
	// with mathods called the getter and setter methods.
	public Iphone1() {

	}

	public Iphone1(int price, String info, char user, boolean madeInUSA) {
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeInUSA = madeInUSA;

	}

	public void regularClassInfo() {
		System.out.println("\nRegular class is a blueprint from which individual objects are created."
				+ "\nIt can be instantiated  but Abstract class,interface cannot be instantiated "
				+ "\nIt can inherit only one abstract class or regular class but cannot inherit interface with extends keyword "
				+ "\nit can inherit more than one interface by implement keyword but it cannot inherit a regular class or abstract class by implement keyword ");
	}

	public void youtube() {
		System.out.println("\nYouTube is a free video sharing website that makes it easy to watch online videos."
				+ "\nYou can even create and upload your own videos to share with others."
				+ "\nOriginally created in 2005, YouTube is now one of the most popular sites on the Web, "
				+ "\nwith visitors watching around 6 billion hours of video every month.");
	}

}
