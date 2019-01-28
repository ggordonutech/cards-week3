import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CardDatabaseTest {
	
	@Test
	public void shouldSaveRecord() {
		IDatabase<Card> db = new CardDatabase();
		Card card = new Card(1,"Club");
	    boolean success = db.save(card);
	    assertTrue(success);

	}
	
	public void shouldRetrieveFirstRecord() {
		/**
		 * TODO:
		 *   Create an instance of a card database
		 *   Retrieve the first record from the database
		 *   assert that the object returned is not null
		 *   assert that the suite of the object is the 
		 *      same one that was saved
		 *   assert that the number of the card object 
		 *      is the same as the one that was saved
		 * */
	}

}
