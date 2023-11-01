public class Matrix {

  int size;
  final String RESET = "\u001B[0m";
  final String YELLOW = "\u001B[33m";

  public int[][] matrix(int size) {
    int[][] matrix = new int[size][size];

    return matrix;
  }

  public void printMatrix(int size){
    int color = size-1;
    for(int row = 0; row < size; row++){
      for(int coloumn = 0; coloumn < size; coloumn++){
        if(coloumn == color){
          System.out.print(YELLOW + "0  " + RESET);
        }else{
          System.out.print("0  ");
        }
      }
      System.out.println();
      color--;
    }
  }

  public void populateMatrix(int[][] matrix, int size){
    int color = size-1;
    int number = 1;
    for(int row = 0; row < size; row++){
      for(int coloumn = 0; coloumn < size; coloumn++){
        if(coloumn == color){
          matrix[row][coloumn] = number;
          System.out.print(YELLOW + number + RESET + "  ");
        }else{
          matrix[row][coloumn] = number;
          System.out.print(number +"  ");
        }
        number++;
      }
      System.out.println();
      color--;
    }
  }

  public void swapMatrix(int[][] matrix){
  }



}
