import java.util.Scanner;
class Numpat2{
	public static void main(String...args){
	Scanner s = new Scanner(System.in);
	int n=s.nextInt();
		for (int i =0;i<n;i++){
			for (int j=i;j>0;j--){

				System.out.print(i+" ");
			}
			for (int k= i; k>i; k--){
				System.out.print(" ");
			}
			System.out.println("");
		}
		n--;
		for (int i =n-1;i>0;i--){
			for (int j=i;j>0;j--){

				System.out.print(i+" ");

			}
			for (int k= i; k>=0; k--){
				System.out.print(" ");
			}
			n--;
			System.out.println("");
		}
	}
}