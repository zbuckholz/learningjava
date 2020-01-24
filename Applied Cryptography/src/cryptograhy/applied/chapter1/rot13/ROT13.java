/* 
Update JVM default logging properties file at this location
/Library/Java/JavaVirtualMachines/jdk-13.jdk/Contents/Home/conf/logging.properties
*/

package cryptograhy.applied.chapter1.rot13;

import java.util.logging.Level; 
import java.util.logging.Logger; 
import java.util.logging.*; 

public class ROT13 {

	public static void main(String[] args) {
		LogManager logger = LogManager.getLogManager();
		Logger log = logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		
		int i = 0;
		
		log.log(Level.INFO, String.format("Arguments length: %d \n", args.length));


		while (i < args.length) {
			String c = args[i];
			
			log.log(Level.INFO, String.format("String : %s\n", c));
			
			
			int l = args[i].length();
			
			log.log(Level.INFO, String.format("Length of string: %d\n", l));
			
			int t = 0;
			for (int x = 0; x < l; x++) {
				
				log.log(Level.INFO, String.format("Working on character : %d\n", x));
				
				if (c.charAt(x) >= 'a' && c.charAt(x) <= 'm') {
					t = (c.charAt(x)+13);
					
					log.log(Level.INFO, String.format("+13 : %s -> %s\n", c.charAt(x), t));
					
					
				} else if (c.charAt(x) >= 'n' && c.charAt(x) <= 'z') {
					t = (c.charAt(x)-13);
					
					log.log(Level.INFO, String.format("-13 : %s -> %s\n", c.charAt(x), t));
					
					
				} else if (c.charAt(x) >= 'A' && c.charAt(x) <= 'M') {
					t = (c.charAt(x)+13);
					
					log.log(Level.INFO, String.format("+13 : %s -> %s\n", c.charAt(x), t));
				
				} else if (c.charAt(x) >= 'N' && c.charAt(x) <= 'Z') {
					t = (c.charAt(x)-13);
					
					log.log(Level.INFO, String.format("-13 : %s -> %s\n", c.charAt(x), t));
					
				} else {
					
					log.log(Level.INFO, String.format("Sorry unknown letter: %s", c.charAt(x)));
					
				}
				System.out.printf("%s", (char)t);
			}
			System.out.printf(" ");
			i++;
		}
		System.out.println();
	}
}
