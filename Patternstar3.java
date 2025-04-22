import java.util.Scanner;
class Patternstar3{
	public static void main(String...args){
	Scanner s = new Scanner(System.in);
	int n=s.nextInt();
		for (int i =0;i<n;i++){
			for (int j=i;j>0;j--){

				System.out.print("*");
			}
			for (int k= i; k>i; k--){
				System.out.print(" ");
			}
			System.out.println("");
		}
		n--;
		for (int i =n;i>=0;i--){
			for (int j=0;j<=i;j++){ 

				System.out.print("*");
					}
			n--;
			System.out.println("");
		}
	}
}