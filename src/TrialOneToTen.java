
public class TrialOneToTen {
import java.util.Random;
import java.util.Scanner; 

public class GuessNumber{
	private static final boolean correctGuess = false;

	public static void main(String[] args, Object guess) {
		Random random = new Random();
		Scanner sc = new Scanner(null);
		int target Number = random.nextint(100)+1;//generating a number from one to hundred
		
		while(!correctGuess)
		guess ==sc.nextfloat();
	}
}
if (guess==targetNumber)
{
	"Congratulations! You guessed the correct number.");
	
		correctGuess = true;
		
}else if(guess < targetNumber) {
	
	System.out.print("Too low. Try again!")
	
}else {
	System.out.println("Too high. Try again")
}
}
}
}