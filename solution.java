import java.util.*;

public class solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

            for(; n != 0; n /= 10) {
              sum  += n % 10;
             }
        System.out.println("The sum of digits is :" +sum);

    }
        
    }

