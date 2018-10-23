package Tasks;

public class SimpleBatary implements Batary {
	private int power = 10;
	
	@Override
	public boolean charge() {
		boolean charge = power > 0;
		power--;
		return charge;
	}
}
