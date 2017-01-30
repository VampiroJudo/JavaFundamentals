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
	
	public void print() {
		
		if(isOn) {
			System.out.println(modelNumber + " is on!");
		} else {
			System.out.println(modelNumber + " is off!");
		}
			
		
		
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
