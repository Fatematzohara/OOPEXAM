package oopExam;

/*\t Interface is a Blueprint of Class.\n
 *\t Interface cannot be instantiated (cannot create object)\n
 *\t An interface is a collection of methods that are defined (declared) but not implemented. \n
 *\t It contains only the abstract methods and abstract methods cannot be implemented,can be definned(declared) only\n
 *\t Not mandatory to use the abstract keyword with the abstract method inside interface\n
 *\t Contains default and static method only which are non abstract(exception) from java version 1.8\n
 * \t Interface can inherit more than one interface by extends keyword(they have to be separated by comma)
 * \t Cannot inherit an abstract or regular class by extends keyword
 */

public interface Phone extends Pager, Wakitoki {

	/*
	 * Interfaces cannot have constructors .An Interface in Java doesn't have a
	 * constructor because all data members in interfaces are public static final by
	 * default, they are constants (assign the values at the time of declaration).
	 * There are no data members in an interface to initialize them through the
	 * constructor.
	 */
	public static final int memory = 128;

	public void interfaceInfo();

	public void call();

	public void message();

	public void camera();

	public default void battery() {
		System.out.println("battery is a default type method from Java 1.8");
	}

	public static void wireless() {
		System.out.println("wireless is a default type method from Java 1.8");
	}
}
