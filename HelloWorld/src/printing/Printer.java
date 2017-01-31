package printing;

public class Printer {
	
	public boolean isOn;
	private String modelNumber;
	
	
//	public
//	private
//	protected
	public Printer(boolean isOn, String modelNumber) {
		this.isOn = isOn;
		this.modelNumber = modelNumber;
		
	}
	
	public void print(int copies) {
		
		String onStatus = "";
			if(isOn) 
				onStatus = "is on!";
			else 
				onStatus = "is off!";
			
			
		String textToPrint = modelNumber + onStatus;
		
		for( int i = 0; i < copies; i++) {
			System.out.println(textToPrint);
		}
		
		
		
//		switch(copies) {
//		case  0:
//			
//			break;
//		case 1:
//
//			if(isOn) {
//				System.out.println(modelNumber + " is on!");
//			} else {
//				System.out.println(modelNumber + " is off!");
//			}
//			break;
//			
//		case 2:
//
//			if(isOn) {
//				System.out.println(modelNumber + " is on!");
//				System.out.println(modelNumber + " is on!");
//			} else {
//				System.out.println(modelNumber + " is off!");
//				System.out.println(modelNumber + " is off!");
//			}
//			break;
//			default:
//				System.out.println("Number of copies is not supported");
//				
//		}
		
			
		
		
//		System.out.println(isOn);
//		System.out.println(modelNumber);
//		print("I can call this!!!");
	}
	
	private void print(String text) {
		System.out.println(text);
	}
	
	public String getModelNumber() {
		return modelNumber;
	}
	
}
