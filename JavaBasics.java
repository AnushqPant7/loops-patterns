

import java.util.*; 

public class JavaBasics {
    public static void main(String args[]) { 
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int value;

    if( a >= b && a >=c ) {
      value = a;
    }
    else if( b >= c) {
    value = b;
    }
    else {
    value = c;
    }
    System.out.println("largest value of the 3 is :" + value);
    
    }
}