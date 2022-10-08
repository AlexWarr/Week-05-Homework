
public class AsteriskLogger implements Logger {

	public void Log(String a) {
		String l0g = "***" + a + "***";
		System.out.println(l0g);
		
	}

	public void Error(String a) {
		String l0g = "***Error: " + a + "***";
		StringBuilder format = new StringBuilder();
		for( int i = 0; i < l0g.length(); i++ ) {
			format.append("*");
		}
		System.out.println(format);
		System.out.println(l0g);
		System.out.println(format);
		
	}

}
