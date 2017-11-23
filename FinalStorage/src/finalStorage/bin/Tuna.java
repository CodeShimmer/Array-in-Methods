package finalStorage.bin;

public class Tuna {
	private int sum;
	private final int NUMBER;
	
	public Tuna(int x) {
		// TODO Auto-generated constructor stub
		NUMBER = x;
	}
	public void add(){
		sum+=NUMBER;
	}
	public String toString(){
		return String.format("sum = %d\n", sum);
	}

}
