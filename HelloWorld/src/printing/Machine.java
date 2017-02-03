package printing;

public class Machine implements iMAchine {
	
	protected boolean isOn;
	
	public Machine(boolean isOn) {
		this.isOn = isOn;
	}
	
	public void turnOn() {
		this.isOn = true;
		System.out.println("Machine is on!");
	}
	
	public void turnOff() {
		
		this.isOn = false;
	}

	@Override
	public boolean isOn() {

		return isOn;
	}

}
