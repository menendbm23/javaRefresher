
public class Main {

	public static void main(String[] args) {
		//array = used to store multiple values in a single variable 
		
		String[] cars = {"Camaro", "Corvette", "Tesla", "BMW"};
		
		cars[0] = "Mustang";
		
		System.out.println(cars[0]);
		
		
		String[] sports = new String[4];
		
		sports[0] = "Basketball";
		sports[1] = "Soccer";
		sports[2] = "Football";
		sports[3] = "Cricket";
		
		System.out.println(sports[1]);
		
		for(int i=0; i<sports.length; i++) {
			System.out.println(sports[i]);
			
		}
		
		
		

	}

}
