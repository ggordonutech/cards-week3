
public class Card implements java.io.Serializable {
	private int number;
	private String suite;
	
	public Card() {
		this(0,"");
	}
	
	
	public Card(int number, String suite) {
		super();
		this.number = number;
		this.suite = suite;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getSuite() {
		return suite;
	}
	public void setSuite(String suite) {
		this.suite = suite;
	}
	@Override
	public String toString() {
		return "Card [number=" + number + ", suite=" + suite + "]";
	}
	
	
	

}
