package oopExam;

/*
 *\t An abstract class is a superclass 
 *we can extend it; its subclasses can override some or all of its
 *inherited abstract methods that cannot be instantiated (can’t create objects).  
*\n Contains both abstract and non abstract methods.
*\n Abstract method can not be implemented, can be defined (declared) only
*\n Non abstract methods can be implemented, but can not be defined (declared).
*\n Variable can be declared or initialized inside an abstract class
*\n It is mandatory to put abstract keyword with the abstract method inside abstract class
*\n This is the norm to write at least one abstract method inside abstract class
*\n We can declare a constructor inside abstarct class
 */

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {

	public String series;
	public int appleWatch = 150;

	public AppleWatch() {
	}

	public void abstractClassInfo() {
		System.out.println("An abstract class inherit only one abstract class by extends keyword"
				+ "\n An abstract class inherit only one regular class by extends keyword"
				+ "\n An abstract class can inherit more than one interfaces by implements keyword(separated by comma)"
				+ "\n An abstract class can not inherit interface with extends keyword");
	}

	public abstract void appleWatchInfo();

	/*
	 * yes I can create a varibale and constructor inside Abstract class and
	 * instantiate it.
	 */

	/*
	 * Create 2 method: One is abstractClassInfo [which is a non-abstract method,
	 * print out all the features of an abstract class compared with Interface,
	 * regular class]. what type of method would be the other one if the name is
	 * appleWatchInfo? Please create this method
	 */

}
