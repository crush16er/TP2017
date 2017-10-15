package cardspackage;

import junit.framework.TestCase;

public class DeckTest extends TestCase {
	
	Deck talia;
	
	protected void Setup() throws Exception
	{
		talia = new Deck(36);
	}
	
	

	public void testDeck() {
		fail("Not yet implemented");
	}

	public void testShuffle() {
		fail("Not yet implemented");
	}

	public void testTop_card() {
		talia.top_card();
		assertEquals("2",talia.cards.get(0));
	}

	public void testSort() {
		fail("Not yet implemented");
	}

	public void testObject() {
		fail("Not yet implemented");
	}

	public void testGetClass() {
		fail("Not yet implemented");
	}

	public void testHashCode() {
		fail("Not yet implemented");
	}

	public void testEquals() {
		fail("Not yet implemented");
	}

	public void testClone() {
		fail("Not yet implemented");
	}

	public void testToString() {
		fail("Not yet implemented");
	}

	public void testNotify() {
		fail("Not yet implemented");
	}

	public void testNotifyAll() {
		fail("Not yet implemented");
	}

	public void testWaitLong() {
		fail("Not yet implemented");
	}

	public void testWaitLongInt() {
		fail("Not yet implemented");
	}

	public void testWait() {
		fail("Not yet implemented");
	}

	public void testFinalize() {
		fail("Not yet implemented");
	}

}
