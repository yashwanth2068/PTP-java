import java.util.Scanner;
 class Patternstar4{
  public static void main(String...args){
  Scanner s= new Scanner(System.in);
  int n = s.nextInt();
    	for(int i = 0; i < n;i++){
    		for(int j = 0;j<(n-1)-i;j++){
    			System.out.print(" ");
    		}
    		for(int k = 0;k<n;k++){
    			System.out.print(" *");
    		}
    		System.out.println();
    	} 
   
    	for(int i = 1; i < n;i++){
    		for(int j = 0;j<i;j++){
    			System.out.print(" ");
    		}
    		for(int k = 0;k<n;k++){
    			System.out.print(" *");
    		}
    		System.out.println();

    	}

  }
 }