package printing;

public class Printer<T> implements iMAchine {
	
	
	private String modelNumber;
	private PaperTray paperTray = new PaperTray();
	private Machine machine; 
	private T cartridge;
	

	
	
	public Printer(boolean isOn, String modelNumber, T cartridge) {
		
		machine = new Machine(isOn);
		this.modelNumber = modelNumber;
		this.cartridge = cartridge;
		
	}
	
	@Override
	public void turnOn() {
	
		System.out.println("Warming up printer.");
		machine.turnOn();
		
	}
	
	public void print(int copies) {
		
		System.out.println(cartridge.soString);
		
		String onStatus = "";
			if(machine.isOn() ) 
				onStatus = " is on!";
			else 
				onStatus = " is off!";
			
		String textToPrint = modelNumber + onStatus;
// For loop example		
//		for( int i = 0; i < copies; i++) {

//While loop example
		while ( copies > 0 && !paperTray.isEmpty() ) {
			System.out.println(textToPrint);
			copies--;
			paperTray.usePage();
		}
		
		if(paperTray.isEmpty())
			System.out.println("Load more paper!");
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


	public void loadPaper( int count) {

		paperTray.addPaper(count);
	}

	@Override
	public void turnOff() {
		
		machine.turnOff();

	}

	@Override
	public boolean isOn() {
		
		return machine.isOn;
	}	
	
}
