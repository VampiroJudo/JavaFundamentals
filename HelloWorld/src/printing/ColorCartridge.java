package printing;

public enum ColorCartridge implements iCartridge {
	
	RED("Red"),
	BLUE("Blue"),
	GREEN("Green"),
	YELLOW("Yellow");
	
	private final String colorText;
	
	private ColorCartridge(String colorText) {
		this.colorText = colorText;
	}
	
//Example of Override annotation
	
//	@Override
//	public String notOverriding() {
//		return "";
//	}
	

	
	@Override
	public String toString() {
		
		return "Color!";
	}
	
	@Override
	public String getFillPercentage() {
		return "97%";
	}

	@Override
	public String printColor() {
		return colorText;
	}
}
