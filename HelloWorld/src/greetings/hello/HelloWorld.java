package greetings.hello;

import printing.Printer;

public class HelloWorld {
	public static void main(String[] args) {
		
		
// **below I am passing parameters into constructor**
		
		Printer myPrinter = new Printer(true, "MY PRINTER");		
		
		myPrinter.loadPaper(3);
		myPrinter.print(1);
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
