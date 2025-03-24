import java.util.Scanner;
class quad{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();
	//roots of quadratic eqn
	double d = Math.sqrt((b*b) - (4*a*c));
	System.out.println("r1 - " + ((-b-d)/2*a));
	System.out.println("r2 - " + ((-b+d)/2*a));

	}
}