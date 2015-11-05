package nyc.jvid;

/**
 * Created by s3a on 11/4/15.
 */
public class HW_10_13 {

    // Show that x^62 can be computed with only 8 multiplications.
    public static void main(String[] args) {
        System.out.println(powerOf(1, 62));
        System.out.println(powerOf(2,62));
}

    public static int powerOf ( int exponent , int base ) {
        int temp = 1;
        int exp = exponent;
        int b = base;

        if (exponent == 0 ) {
            return 1 ;
        }
        while (exp != 1 ) {
            if ( exp % 2 == 1 ) {
                temp *= b;
            }
            b *= b;
            exp /= 2;
        }
        return temp *b;
    }

    

}
