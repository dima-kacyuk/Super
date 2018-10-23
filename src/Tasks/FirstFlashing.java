package Tasks;

public class FirstFlashing implements Flashing{
	
	private boolean light;
	private Batary batary;
	
	public FirstFlashing(SimpleBatary batary) {
		this.batary = batary;
	}
	
	public FirstFlashing(DuracelBatary batary) {
		this.batary = batary;
	}

	@Override
	public void on() {
		boolean charge = batary.charge();
		if(charge) {
			light = true;
		}
		else {
			light = false;
		}
	}

	@Override
	public void off() {
		light = false;
	}

	@Override
	public boolean isLight() {
		light = true;
		return light;
	}

}
