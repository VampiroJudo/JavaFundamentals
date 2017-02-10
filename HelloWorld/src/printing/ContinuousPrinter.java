package printing;

import printing.ColorCartridge;
import printing.Printer;

public class ContinuousPrinter extends Thread {
	
	private Printer<iCartridge> printer = new Printer<iCartridge>(true, "iPrint", ColorCartridge.BLUE);

	@Override
	public void run() {
		
		for(int i = 0; i < 100; i++)
			printer.printUsingCartridge(ColorCartridge.BLUE, "In thread " + i);
			
		super.run();
		}
		
	}
