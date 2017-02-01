package printing;

public class Printer extends Machine {
	
	
	private String modelNumber;
	private PaperTray paperTray;
	
	
//	public
//	private
//	protected
	
	
	public Printer(boolean isOn, String modelNumber) {
		
		super(isOn);
		this.modelNumber = modelNumber;
		
	}
	
	public void print(int copies) {
	
//If/Else Statement Example
		String onStatus = "";
			if(isOn) 
				onStatus = " is on!";
			else 
				onStatus = " is off!";
			
		String textToPrint = modelNumber + onStatus;
// For loop example		
//		for( int i = 0; i < copies; i++) {

//While loop example
		while ( copies > 0 ) {
			System.out.println(textToPrint);
			copies--;
		}
	}
	

		
		public void printColors() {
			String[] colors = new String[] { "Red", "Blue", "Green", "Yellow", "Orange" };
			
			for( String currentColor : colors) {

//Break Statement
//				if("Green".equals(currentColor))
//					break;
//Continue Statement
				if("Green".equals(currentColor))
					continue;
				
				System.out.println(currentColor);
		}
		
					
		
		
//Switch Statement Example		
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
