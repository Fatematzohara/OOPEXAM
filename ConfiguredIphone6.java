package oopExam;

public class ConfiguredIphone6 extends Iphone6 {

	@Override
	public void material() {// void

	}
	@Override
	public int material(int ramPrice, int cameraPrice) {
		System.out.println(ramPrice+90*cameraPrice);
	
		return 0;
	}// return type parameterized
	@Override
	public int material(int ramPrice,  int cameraPrice,String processorPrice) {
		int total = ramPrice*100 + Integer.parseInt(processorPrice+cameraPrice)+300;
		return total;
	}// return type  parameteraized
	@Override
	public void material(int ramPrice,String processoPrice) {// void parameterized
		
System.out.println(ramPrice+Integer.parseInt(processoPrice)+20000);
	}
//	@Override
//	public static int material(int ramPrice) {// Static return type parameterised method
//		return 0;
//
//	}
	 /* Final type method cannot be Overriden
	  *  Cannot override the final method from Iphone6
	 *  Final keyword doesn't allow any change in method, variable, class
	 */
	
	
//	@Override
//	public final int material(int ramPrice, int cameraPrice, int monitorPrice, String processorPrice) {// final return
//																										// type
//																										// parameterised
//																										// method
//		return 0;
//
//	}
	
	
	
	}