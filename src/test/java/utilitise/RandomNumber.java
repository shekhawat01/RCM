package utilitise;

import java.util.Random;

public class RandomNumber {
	
	 public static int generateRandomNumber(int range) {
	        Random random = new Random();
	        return random.nextInt(range);
	    }

}
