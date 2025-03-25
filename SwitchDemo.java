import java.util.Scanner;
class SwitchDemo{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.Exit");
		System.out.println("Select what you want to calculate");
		int val = sc.nextInt();
		int a,b;
		System.out.println("Enter 2 values:");
			    a = sc.nextInt();
			    b = sc.nextInt();
		switch(val){
		case 1:
                System.out.println("Addition is: "+(a+b));
                break;
        case 2: 
                System.out.println("Subtraction is: "+(a-b));
                break;
        case 3:
                System.out.println("Multiplication is: "+(a*b));
                break;
        case 4:
			    System.out.println("Division is: "+(a/b));
                break;
        default:
        	    System.out.println("---THANKYOU!---");
        	    
                }
            }
		}
