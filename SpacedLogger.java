public class SpacedLogger implements Logger {

	public void Log(String a) {
		StringBuilder l0g = new StringBuilder();
		int i =0;
		while ( i < a.length() ) {
			l0g.append(a.charAt(i));
			i ++;
			l0g.append(" ");
		}
		System.out.println(l0g);

		
	}


	public void Error(String a) {
		StringBuilder l0g = new StringBuilder();
		int i =0;
		while ( i < a.length() ) {
			l0g.append(a.charAt(i));
			i ++;
			l0g.append(" ");
		}
		System.out.println("ERROR: " + l0g);
		
	}

}
