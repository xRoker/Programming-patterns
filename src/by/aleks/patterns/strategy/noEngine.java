package by.aleks.patterns.strategy;

/** Implements the algorithm using the strategy(Engine) interface */
public class noEngine implements Engine {
	
	@Override
	public void startEngine() {
		System.out.println("No engine. We aint going anywhere.");
	}

	@Override
	public void fillUp() {}

}
