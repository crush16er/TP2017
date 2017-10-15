package cardspackage;

public class Test {

	public static void main(String[] args)
	{
		Deck talia = new Deck(36);
		
		talia.shuffle();
		talia.top_card();
		talia.sort();
		talia.top_card();

	}

}
