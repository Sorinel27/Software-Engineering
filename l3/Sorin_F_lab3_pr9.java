//lab 3 problema 9 Fratean Sorin, grupa 2022
import java.util.Random;

public class clasaTest {

	public static void main(String[] args) {
		Random r = new Random();
		String[] deck = {"2 IR", "3 IR", "4 IR", "5 IR", "6 IR", "7 IR", "8 IR", "9 IR", "10 IR", "J IR", "Q IR", "K IR", "A IR", "2 IN", "3 IN", "4 IN", "5 IN", "6 IN", "7 IN", "8 IN", "9 IN", "10 IN", "J IN", "Q IN", "K IN", "A IN", "2 T", "3 T", "4 T", "5 T", "6 T", "7 T", "8 T", "9 T", "10 T", "J T", "Q T", "K T", "A T", "2 R", "3 R", "4 R", "5 R", "6 R", "7 R", "8 R", "9 R", "10 R", "J R", "Q R", "K R", "A R"};
		int n = 0;
		int usedCards = 0;
		for(int i = 0; i < deck.length; ++i) {
			n = r.nextInt(deck.length);
			System.out.println("Step " + (i + 1) + " : " + deck[n] + ", " + "extracted cards: " + usedCards);
			usedCards++;
			if(deck[n] == "9 T" || deck[n] == "10 T" || deck[n] == "J T" || deck[n] == "Q T" || deck[n] == "K T" || deck[n] == "A T")
				break;
			else
			{
				deck[n] = null;
				n--;
			}
		}
	}
}

