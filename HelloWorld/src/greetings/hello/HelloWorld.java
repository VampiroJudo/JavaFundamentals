package greetings.hello;

import printing.iMAchine;
import printing.Machine;
import printing.Printer;
import printing.ColorCartridge;

public class HelloWorld {
	public static void main(String[] args) {
		
		
		
	Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true, "MY PRINTER", new ColorCartridge());		

//		printer.printUsingCartridge(new ColorCartridge(), "Hi!");

		printer.print(1);
//		myPrinter.loadPaper(3);
//		myPrinter.print(4);
//	    myPrinter.printColors();
//		myPrinter.turnOff();
//		myPrinter.print(1);
	
		
//		Printer yourPrinter = new Printer(false, "YOUR PRINTER");
//		
//		yourPrinter.print();
		
//		Printer myPrinter = new Printer();
//		myPrinter.isOn = false;
//		myPrinter.modelNumber = "ABCD";
//		
//		Printer yourPrinter  = new Printer();
//		yourPrinter.isOn = true;
//		yourPrinter.modelNumber = "FGH";
//		
//		String theModelNumber = myPrinter.getModelNumber();
//		System.out.println(theModelNumber);
	}
}
