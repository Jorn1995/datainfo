package nl.utwente.di;

public class Quoter {
	
	public double getBookPrice(String text) {
		if (text.equals("1")) {
			return 10.0;
		}
		else if (text.equals("1")) {
			return 45.0;
		}
		else if (text.equals("1")) {
			return 20.0;
		}
		else if (text.equals("1")) {
			return 35.0;
		}
		else if (text.equals("1")) {
			return 50.0;
		}
		else {
			return 0.0;
		}
	}
}
