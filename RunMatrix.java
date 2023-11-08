import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input;
    int size = 0;

    System.out.println("Please enter a number bigger than 0");
    input = scan.nextLine();
    try{
      size = Integer.parseInt(input);
      if(size < 0){
        System.out.println("You entered an number lower than 1, please try again");
      }
    } catch (Exception e){
      System.out.println("You entered something that was not a number, please run again and try again");
    }

    Matrix matrix = new Matrix(size);
    matrix.printMatrix();
    matrix.populateMatrix();
    matrix.printMatrix();
    matrix.flipMatrix();
    matrix.printMatrix();


  }
}
