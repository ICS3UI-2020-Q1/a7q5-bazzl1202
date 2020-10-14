/**
 * A method that prints out the first digit of a number
 * @author Liana Bazzarella
 */
public class Main {

  // printsout first digit of a number
  public static int firstDigit(int integer){
    // makes it still work if the number is negative
    if(integer < 10){
      integer = -integer / 10;
    }
    while(integer > 10){
      integer = integer / 10;
    }
    System.out.println(integer);
    return integer;
  }

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // this is the number used
    firstDigit(53718);
  }
}
