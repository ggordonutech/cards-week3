import java.io.*;

public class Driver {

	public static void main(String[] args) {
       IDatabase<Card> db = new CardDatabase();
       Card card = new Card(1,"Club");
       if(db.save(card)) {
    	   System.out.println("Card saved successfully");
       }else {
    	   System.out.println("Unable to save card");
       }

	}

}
