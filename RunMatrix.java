import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input;
    int size = 0;

    System.out.println("Please enter a number bigger than 0");
    input = scan.nextLine();
    System.out.println();
    try{
      size = Integer.parseInt(input);
      if(size < 0){
        System.out.println("You entered an number lower than 1, please try again");
      }
    } catch (Exception e){
      System.out.println("You entered something that was not a number, please run again and try again");
    }

    Matrix matrix = new Matrix(size);
    System.out.println("Printing matrix with default values:");
    matrix.printMatrix();

    System.out.println("Populating matrix... matrix populated");
    matrix.populateMatrix();
    System.out.println();

    System.out.println("Printing matrix");
    matrix.printMatrix();

    System.out.println("Flipping Matrix... Matrix flipped");
    matrix.flipMatrix();
    System.out.println();

    System.out.println("Printing flipped matrix: ");
    matrix.printMatrix();


  }
}
