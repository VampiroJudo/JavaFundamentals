package printing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@PrintingDevice(defaultPrintMethod ="print", defaultNumberOfCopies = 5)
public class Printer<T extends iCartridge> implements iMAchine {
	// Bounded example
	// public class Printer<T implements iCartridge> implements iMAchine

	private String modelNumber;
	private PaperTray paperTray = new PaperTray();
	private Machine machine;
	private T cartridge;
//	private List<Page> pages = new ArrayList<Page>();
	private Map<Integer, Page> pagesMap = new HashMap<Integer, Page>();

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

	public synchronized <U extends iCartridge> void printUsingCartridge(U cartridge, String message) {
		
		System.out.println("Entered" + Thread.currentThread().getId());
		//System.out.println(cartridge.toString());
		System.out.println(message);
		//System.out.println(cartridge.toString());
		System.out.println("Exited" + Thread.currentThread().getId());

	}

	public void print(int copies) {

		// System.out.println(cartridge.getFillPercentage());

		checkCopies(copies);

		String onStatus = "";
		if (machine.isOn())
			onStatus = " is on!";
		else
			onStatus = " is off!";

		String textToPrint = getTextFromFile();
		int pageNumber = 1;
		// For loop example
		// for( int i = 0; i < copies; i++) {

		// While loop example
		while (copies > 0) {
			// System.out.println(textToPrint);
			// pages.add(new Page(textToPrint));
			pagesMap.put(pageNumber, new Page(textToPrint + ":" + pageNumber));

			copies--;
			pageNumber++;
			paperTray.usePage();
		}

		// This code snippet goes inside the While Loop ---> &&
		// !paperTray.isEmpty
		// if(paperTray.isEmpty())
		// System.out.println("Load more paper!");
	}

	private String getTextFromFile() {
		FileReader reader = null;
		BufferedReader bReader = null;
		CapitalizationReader capReader = null;
		
		
		
		String allText = "";
		try {
			reader = new FileReader("C:\\temp\\test.txt");
			bReader = new BufferedReader(reader);
			capReader = new CapitalizationReader(bReader);
			
			String line;
			while(( line = capReader.readLine() ) !=null){
				allText += line + "\n";
			}
			return allText;
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
 		finally {
			if(capReader != null) 
				try {
					capReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		return "";
		
	}

	public void outputPage(int pageNumber) {
		
		PrintWriter writer = null;
		
		try {
			writer = new PrintWriter(new FileWriter ("C:\\temp\\outputpage.text"));
			
			writer.println(pagesMap.get(pageNumber).getText());
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if (writer != null)
				writer.close();
		}
		//System.out.println(pagesMap.get(pageNumber).getText());
	}

	// Method for List Collection
	// public void outputPages() {
	// for(Page currentPage : pages) {
	// System.out.println(currentPage.getText());
	// }
	// }

	private void checkCopies(int copies) {
		if (copies < 0)
			throw new IllegalArgumentException("Can't print less than 0 copies");
	}

	//@Deprecated
	public void printColors() {
		String[] colors = new String[] { "Red", "Blue", "Green", "Yellow", "Orange" };

		for (String currentColor : colors) {

			// Break Statement
			// if("Green".equals(currentColor))
			// break;
			// Continue Statement
			if ("Green".equals(currentColor))
				continue;

			System.out.println(currentColor);
		}

		// Switch Statement Example
		// switch(copies) {
		// case 0:
		//
		// break;
		// case 1:
		//
		// if(isOn) {
		// System.out.println(modelNumber + " is on!");
		// } else {
		// System.out.println(modelNumber + " is off!");
		// }
		// break;
		//
		// case 2:
		//
		// if(isOn) {
		// System.out.println(modelNumber + " is on!");
		// System.out.println(modelNumber + " is on!");
		// } else {
		// System.out.println(modelNumber + " is off!");
		// System.out.println(modelNumber + " is off!");
		// }
		// break;
		// default:
		// System.out.println("Number of copies is not supported");
		//
		// }

		// System.out.println(isOn);
		// System.out.println(modelNumber);
		// print("I can call this!!!");
	}

	private void print(String text) {
		System.out.println(text);
	}

	public String getModelNumber() {
		return modelNumber;
	}
	
	public T getCartridge() {
		return cartridge;
	}

	public void loadPaper(int count) {

		paperTray.addPaper(count);
	}

	public void turnOff() {

		machine.turnOff();
		System.out.println("Machine is off!");

	}

	@Override
	public boolean isOn() {

		return machine.isOn;
	}

}
