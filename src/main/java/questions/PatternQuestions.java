package questions;

public class PatternQuestions {

    //
    public static void main(String[] args) {
//        printHalfPyramid(5);
//        printHalfPyramidWithAlpha('D');
//        printInvertedHalfPyramid(5);

        printHalfFlippedPyramid(5);
    }
/*   Print this pattern
      *
      * *
      * * *
      * * * *
      * * * * *
 */
    public static void printHalfPyramid(int noOfRows){

        for(int i=0; i<noOfRows; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    /*
        A
        B B
        C C C
        D D D D
        E E E E E
     */

    public static void printHalfPyramidWithAlpha(char lastAlpha){
        char alphabate = 'A';

        for(int i=0; i< (lastAlpha - 'A'+1); i++){
            for(int j=0; j<=i ;j++) {
                System.out.print(alphabate+" ");
            }

            alphabate++;
            System.out.println();
        }

    }

          /*               *
                         * *
                       * * *
                     * * * *
                   * * * * *
                  */

    public static void printHalfFlippedPyramid(int noOfRows){   // i==0  j=5
        // i=1 j =4

        for(int i=0; i<noOfRows; i++){
            for(int j=noOfRows; j>=(noOfRows-i); j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    /*
     * * * * *
     * * * *
     * * *
     * *
     *
     */
    public static void printInvertedHalfPyramid(int noOfRows){

        for(int i=0; i<noOfRows; i++){
            for(int j=noOfRows; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }



}
