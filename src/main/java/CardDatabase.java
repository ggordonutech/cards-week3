import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CardDatabase 
    implements IDatabase<Card>
{

	private static final String DB_NAME="cards.dat";
	
	public boolean save(Card item) {
		boolean success = false;
		ObjectOutputStream oos = null;
		try {
			oos = new ObjectOutputStream(
					new FileOutputStream(DB_NAME)
					);
			oos.writeObject(item);
			oos.flush();
			success = true;
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
			   if(oos != null)oos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		return success;
	}

	public Card readFirstRecord() {
		// TODO Auto-generated method stub
		return null;
	}

}
