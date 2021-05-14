import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double a;
		double b;
		double c;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side a: ");
		a = scanner.nextDouble();
		System.out.println("Enter side b: ");
		b = scanner.nextDouble();
		
		c = Math.sqrt((a*a)+(b*b));
		
		System.out.println("The hypotenuse is : "+c);
		
		scanner.close();
				
		
		double x = 3.14;
		double y = 10;
		
		double z = Math.max(x, y);
		double g = Math.min(y, x);
		double f = Math.abs(g);
		double w = Math.sqrt(y);
		double u = Math.round(x);
		
		
		
		System.out.println(z);
		System.out.println(g);
		System.out.println(f);
		System.out.println(w);
		System.out.println(u);
		
		

	}

}
