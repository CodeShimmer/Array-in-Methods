package finalStorage.bin;

public class FinalStorageMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tuna tunaObject = new Tuna(10);
		
		for(int i=0;i<5;i++){
			tunaObject.add();
			System.out.printf("%s", tunaObject);
		}

	}

}
