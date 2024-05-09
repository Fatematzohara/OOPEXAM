package oopExam;

public class TestPhone {

	public static void main(String[] args) {

		Iphone1 iphone1 = new Iphone1();
		iphone1.setInfo("2000");
		iphone1.setPrice(750);
		iphone1.setUser('F');
		iphone1.setMadeInUSA(false);
		System.out.println("I bought this phone in " + iphone1.getInfo() + ", the price was " + iphone1.getPrice()
				+ "$, user's sex: " + iphone1.getUser() + " made in USA is: " + iphone1.getMadeInUSA());

//AppleWatch appleWatch = new AppleWatch();
		// We cannot Instantiation abstract class

//		Phone phone =new Phone();
		// We cannot instantiate interface

		Iphone2 iphone2 = new Iphone2();
		Iphone6 iphone6 = new Iphone6();
		iphone6.setInfo(null);
		iphone6.setPrice(0);
		iphone6.setMadeInUSA(false);
		iphone6.setUser('F');
		iphone6.getInfo();
		iphone6.getMadeInUSA();
		iphone6.getPrice();
		iphone6.getUser();
		iphone6.regularClassInfo();
		iphone6.youtube();
		iphone6.iPhone2Info();
		iphone6.dropbox();
		iphone6.photos();
		iphone6.email();
		iphone6.call();
		iphone6.camera();
		iphone6.pager();
		iphone6.wakiToki();
		iphone6.watch();
		iphone6.digitalWatch();
		iphone6.interfaceInfo();
		iphone6.call();
		iphone6.message();
		iphone6.iPhone2Info();
		iphone6.compass();
		iphone6.material();
		iphone6.material(0, 0);
		iphone6.material(0, null);
		iphone6.material(0, 0, null);
		iphone6.material(0, 0, 0, null);
		Iphone6.material(0);// static
		iphone6.appleWatchInfo();
		iphone6.appleWatchSeries5();

		/*
		 * iphone6 inherits from iphone 5,It is called single inheritance \niphone6
		 * inherits from iphone5, iphone5 inherits from iphone4, iphone4 inherits from
		 * iphone2, iphone2 inherits from iphone1, It is called multilevel inheritance
		 * \n iphone2 and iphone3 inherits from iphone1 ,it is hierarchical inheritance
		 */

	}

}
