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
    int color = matrix.length-1;

    for(int row = 0; row < matrix.length; row++){
      for(int column = 0; column < matrix.length; column++){
        if(column == color){
          System.out.print(YELLOW + matrix[row][column] + "\t" + RESET);
        }else{
          System.out.print(matrix[row][column] + "\t");
        }
      }
      System.out.println();
      color--;
    }
    System.out.println();
  }

  public void flipMatrix(){
    int diagonal = inputSize;

    for(int row = 0; row < matrix.length - 1; row++){
      for(int column = 0; column < diagonal-1; column++){ //Updates to end the loop before the diagonal
        swap(row, column, (inputSize-1) - row, (inputSize-1) - column);
      }
      diagonal--;
    }
  }

  private void swap(int x1, int x2, int y1, int y2){
    int hold = matrix[x1][x2];
    matrix[x1][x2] = matrix[y1][y2];
    matrix[y1][y2] = hold;
  }
}
