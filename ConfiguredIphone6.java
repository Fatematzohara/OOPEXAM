package oopExam;

public class ConfiguredIphone6 extends Iphone6 {

	@Override
	public void material() {// void

	}

	@Override
	public int material(int ramPrice, int cameraPrice) {
		System.out.println("total: " + (ramPrice + 90 * cameraPrice + 20));

		return 0;
	}// return type parameterized

	@Override
	public int material(int ramPrice, int cameraPrice, String processorPrice) {
		int total =(ramPrice+ Integer.parseInt(processorPrice + cameraPrice) + 300);
		System.out.println("total: " + total);
		return total;
	}// return type parameteraized

	@Override
	public void material(int ramPrice, String processoPrice) {// void parameterized

		System.out.println("total : " +( ramPrice + Integer.parseInt(processoPrice) + 20000));
	}

	/*
	 * Final type method cannot be Overriden \n Cannot override the final method
	 * from Iphone6 Final keyword doesn't allow any change in method, variable,
	 * class
	 */

	/*
	 * Static type method cannot be Overriden because static is a local member
	 * method of a class So, static method can't be override * if we
	 * remove @override it will work as it is considered as the static method of
	 * this ConfiguredIphone6 class
	 */
}