package generic;

import net.bytebuddy.utility.RandomString;

public class RandomDataGenerator {
	
	public static String generateString() {
		return RandomString.make(8);
	}

}
