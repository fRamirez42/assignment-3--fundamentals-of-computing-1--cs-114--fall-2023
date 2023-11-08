public class Matrix {
  final String RESET = "\u001B[0m";
  final String YELLOW = "\u001B[33m";
  int[][] matrix;
  int input = 0;



  public Matrix(int size){
    matrix = new int[size][size];
    input = size;
    System.out.println("The size of the matrix is: " + size + " x " + size);
  }

  public void populateMatrix(){
    int number = 1;

    for(int row = 0; row < matrix.length; row++){
      for(int coloumn = 0; coloumn < matrix.length; coloumn++){
        matrix[row][coloumn] = number++;
      }
      System.out.println();
    }
  }

  public void printMatrix(){
    int color = matrix.length-1;

    for(int row = 0; row < matrix.length; row++){
      for(int coloumn = 0; coloumn < matrix.length; coloumn++){
        if(coloumn == color){
          System.out.print(YELLOW + matrix[row][coloumn] + "\t" + RESET);
        }else{
          System.out.print(matrix[row][coloumn] + "\t");
        }
      }
      System.out.println();
      color--;
    }
    System.out.println();
  }

  public void flipMatrix(){
    int end = input;
    for(int row = 0; row < matrix.length - 1; row++){
      for(int coloumn = 0; coloumn < end-1; coloumn++){
        swap(row, coloumn, (input-1) - row, (input-1) - coloumn);
      }
      end--;
    }
  }

  private void swap(int x1, int x2, int y1, int y2){
    int temp = matrix[x1][x2];
    matrix[x1][x2] = matrix[y1][y2];
    matrix[y1][y2] = temp;
  }
}
