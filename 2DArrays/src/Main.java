
public class Main {

	public static void main(String[] args) {
		// 2d array = an array of arrays
		
		String[][] cars = {
							{"Camaro","Corvette","Silverado"},
							{"Mustang","Raptor","F150"},
							{"Accord", "Civic", "NSX"}
							};
		
		cars[0][0] = "Camaro";
		cars[0][1] = "Corvette";
		cars[0][2] = "Silverado";
		cars[1][0] = "Mustang";
		cars[1][1] = "Raptor";
		cars[1][2] = "F150";
		cars[2][0] = "Accord";
		cars[2][1] = "Civic";
		cars[2][2] = "NSX";
		
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.print(cars[i][j]+" ");
				
			}
		}
		
		
		
		
		
		
	}

}
