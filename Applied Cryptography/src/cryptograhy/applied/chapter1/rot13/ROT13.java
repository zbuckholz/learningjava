package cryptograhy.applied.chapter1.rot13;

public class ROT13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean debug = false;
		int i = 0;
		
		if(debug) {
			System.out.printf("Arguments length: %d \n", args.length);
		}

		while (i < args.length) {
			String c = args[i];
			if(debug) {
				System.out.printf("String : %s\n", c);
			}
			
			int l = args[i].length();
			if(debug) {
				System.out.printf("Length of string: %d\n", l);
			}
			int t = 0;
			for (int x = 0; x < l; x++) {
				if(debug) {
					System.out.printf("Working on character : %d\n", x);
				}
				
				if (c.charAt(x) >= 'a' && c.charAt(x) <= 'm') {
					t = (c.charAt(x)+13);
					if(debug) {
						System.out.printf("+13 : %s -> %s\n", c.charAt(x), (char)t);
					}
					
				} else if (c.charAt(x) >= 'n' && c.charAt(x) <= 'z') {
					t = (c.charAt(x)-13);
					if(debug) {
						System.out.printf("-13 : %s -> %s\n", c.charAt(x), (char)t);
					}
					
				} else if (c.charAt(x) >= 'A' && c.charAt(x) <= 'M') {
					t = (c.charAt(x)+13);
					if(debug) {
						System.out.printf("+13 : %s -> %s\n", c.charAt(x), (char)t);
					}
				} else if (c.charAt(x) >= 'N' && c.charAt(x) <= 'Z') {
					t = (c.charAt(x)-13);
					if(debug) {
						System.out.printf("-13 : %s -> %s\n", c.charAt(x), (char)t);
					}
				} else {
					if(debug) {
						System.out.printf("Sorry unknown letter: %s", c.charAt(x));
					}
				}
				System.out.printf("%s", (char)t);
			}
			System.out.printf(" ");
			i++;
		}
		System.out.println();
	}
}
