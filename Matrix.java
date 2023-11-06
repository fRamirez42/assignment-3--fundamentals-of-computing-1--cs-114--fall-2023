public class Matrix {
  final String RESET = "\u001B[0m";
  final String YELLOW = "\u001B[33m";
   int[][] matrix;


  public Matrix(int size){
    matrix = new int[size][size];
    System.out.println("The size of the matrix is: " + size + " x " + size);
  }

  public void printMatrix(){
    int[][] matrix = this.matrix;
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

  public void populateMatrix(){
    int[][] matrix = this.matrix;
    int color = matrix.length-1;
    int number = 1;

    for(int row = 0; row < matrix.length; row++){
      for(int coloumn = 0; coloumn < matrix.length; coloumn++){
        if(coloumn == color){
          matrix[row][coloumn] = number;
          System.out.print(YELLOW + number + RESET + "\t");
        }else{
          matrix[row][coloumn] = number;
          System.out.print(number +"\t");
        }
        number++;
      }
      System.out.println();
      color--;
    }
  }

  public void swapMatrix(){
  }

  private void swap(int x1, int x2, int y1, int y2){
  }

 //int value : list

}
