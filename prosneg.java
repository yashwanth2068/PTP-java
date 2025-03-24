import java.util.Scanner;
class Number{
	public static void main(String...args){
	Scanner sc = new Scanner(System.in);
	int i = sc.nextInt();
	if(i < 0){
	System.out.println("i is negative");
	}else if(i > 0){System.out.println("i is positive");

	}else{System.out.println((i==0) ? "zero" : ((i>0) ? "Positive": "Negative"));
}
	}
}