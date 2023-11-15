public class Matrix {
  final String RESET = "\u001B[0m";
  final String YELLOW = "\u001B[33m";
  int[][] matrix;
  int inputSize = 0;

  public Matrix(int size){
    matrix = new int[size][size];
    inputSize = size;
    System.out.println("The size of the matrix is: " + size + " x " + size);
  }

  public void populateMatrix(){
    int number = 1;

    for(int row = 0; row < matrix.length; row++){
      for(int column = 0; column < matrix.length; column++){
        matrix[row][column] = number++;
      }
    }
  }

  public void printMatrix(){
    int printColor = matrix.length-1;

    for(int row = 0; row < matrix.length; row++){
      for(int column = 0; column < matrix.length; column++){
        if(column == printColor){
          System.out.print(YELLOW + matrix[row][column] + "\t" + RESET);
        }else{
          System.out.print(matrix[row][column] + "\t");
        }
      }
      System.out.println();
      printColor--;
    }
    System.out.println();
  }

  public void flipMatrix(){
    int endLoop = inputSize;
    for(int row = 0; row < matrix.length - 1; row++){
      for(int column = 0; column < endLoop-1; column++){ //Updates to end the loop before the middle
        swap(row, column, (inputSize-1) - row, (inputSize-1) - column);
      }
      endLoop--;
    }
  }

  private void swap(int x1, int x2, int y1, int y2){
    int temporary = matrix[x1][x2];
    matrix[x1][x2] = matrix[y1][y2];
    matrix[y1][y2] = temporary;
  }
}
