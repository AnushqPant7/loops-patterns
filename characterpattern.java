public class characterpattern {
    
    public static void main(String args[]) {
        int n = 11   ;
        char ch = 'A';

        //outer loop
        for(int i=1; i<=n; i++ ) {
            //inner loop
            for (int j = 1; j<=i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println( );
        }
    }
}
