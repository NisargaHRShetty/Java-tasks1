/*
  * * * * * * * 
    * * * * * 
      * * * 
        * 
        * 
      * * * 
    * * * * * 
  * * * * * * * 

*/

import java.util.Scanner;

class Pat9 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a Size");
    int n = sc.nextInt();

    for(int i = 1; i<=n ;i++){
        for(int j=1 ; j<=i ; j++){
                System.out.print("  ");
        }
        for(int j=i ; j<=n ; j++){
                System.out.print("* ");
        }
        for(int j=i ; j<n ; j++){
                System.out.print("* ");
        }
        System.out.println();
    }

    for(int i = 1; i<=n ;i++){
        for(int j=i ; j<=n ; j++){
                System.out.print("  ");
        }
        for(int j=1 ; j<=i ; j++){
                System.out.print("* ");
        }
        for(int j=1 ; j<i ; j++){
                System.out.print("* ");
        }
        System.out.println();
    }

    

    }
}

