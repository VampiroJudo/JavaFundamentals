package printing;

public class ColorCartridge implements iCartridge {
	
	@Override
	public String toString() {
		
		return "Color!";
	}
	
	@Override
	public String getFillPercentage() {
		return "97%";
	}
}
