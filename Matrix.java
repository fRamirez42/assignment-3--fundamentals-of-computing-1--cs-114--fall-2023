public class Matrix {

  int size;
  final String RESET = "\u001B[0m";
  final String YELLOW = "\u001B[33m";

  public int[][] matrix(int size) {
    int[][] matrix = new int[size][size];

    return matrix;
  }

  public void printMatrix(int[][] matrix, int size){
    int color = size;
    for(int row = 0; row < size; row++){
      for(int coloumn = 0; coloumn < size; coloumn++){
        if(coloumn == color){
          System.out.print(YELLOW + "0  " + RESET);
        }else{
          System.out.print("0  ");
        }
      }
      System.out.println();
    }
  }

  public void populateMatrix(int[][] matrix){
  }

  public void swapMatrix(int[][] matrix){
  }



}
