package Tasks;

public class DuracelBatary implements Batary{
	private int power = 50;
	
	@Override
	public boolean charge() {
		boolean charge = power > 0;
		power--;
		return charge;
	}
}
