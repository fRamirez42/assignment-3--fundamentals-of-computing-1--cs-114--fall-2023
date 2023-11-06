import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input;
    int size = 0;
    int[][] matrix = new int[size][size];
    Matrix matrixClass = new Matrix(size);

    System.out.println("Please enter a number bigger than 0");
    input = scan.nextLine();
    size = matrixClass.checkInt(input);

    matrixClass.printMatrix();
    matrixClass.populateMatrix(size);


  }
}
