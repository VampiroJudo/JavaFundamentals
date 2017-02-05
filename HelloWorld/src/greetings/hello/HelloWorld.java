package greetings.hello;

import printing.iMAchine;
import printing.Machine;
import printing.Printer;

import java.io.File;
import java.io.IOException;

import printing.ColorCartridge;

public class HelloWorld {
	public static void main(String[] args)  {
		
		
		
	Printer<ColorCartridge> printer = new Printer<ColorCartridge>(true, "MY PRINTER", new ColorCartridge());	
	
	File file = new File("C:\\test.txt");
	try {
		file.createNewFile();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	

		try {
			
			printer.print(-1);
		}
		
		catch (IllegalArgumentException exception) {
			
			System.out.println(exception.getMessage());
			return;
		}
		finally {
			printer.turnOff();
		}
	
	
	
	
	
	
//		printer.printUsingCartridge(new ColorCartridge(), "Hi!");
//		myPrinter.loadPaper(3);
//		myPrinter.print(4);
//	    myPrinter.printColors();
//		myPrinter.turnOff();
//		myPrinter.print(1);
//		Printer yourPrinter = new Printer(false, "YOUR PRINTER");
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
