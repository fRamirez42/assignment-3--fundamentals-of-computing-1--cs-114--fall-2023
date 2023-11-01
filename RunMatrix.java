import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Matrix matrixClass = new Matrix();
    Scanner scan = new Scanner(System.in);
    String input;
    int size = 0;
    int[][] matrix = new int[size][size];

    System.out.println("Please enter a number bigger than 0");
    input = scan.nextLine();

    size = matrixClass.matrix(input);

    matrixClass.printMatrix(size);

    matrixClass.populateMatrix(size);


  }
}
