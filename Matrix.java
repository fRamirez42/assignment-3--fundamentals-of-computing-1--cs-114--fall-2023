public class Matrix {
  final String RESET = "\u001B[0m";
  final String YELLOW = "\u001B[33m";

  public Integer matrix(String input) {
    int size = 0;
    try{
      size = Integer.parseInt(input);
      if(size < 0){
        System.out.println("You entered an number lower than 1, please try again");
      }
    } catch (Exception e){
      System.out.println("You entered something that was not a number, please run again and try again");
    }

    return size;
  }

  public void printMatrix(int size){
    int color = size-1;

    for(int row = 0; row < size; row++){
      for(int coloumn = 0; coloumn < size; coloumn++){
        if(coloumn == color){
          System.out.print(YELLOW + "0\t" + RESET);
        }else{
          System.out.print("0\t");
        }
      }
      System.out.println();
      color--;
    }
    System.out.println();
  }

  public void populateMatrix(int size){
    int color = size-1;
    int number = 1;
    int[][] matrix = new int[size][size];

    for(int row = 0; row < size; row++){
      for(int coloumn = 0; coloumn < size; coloumn++){
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

  public void swapMatrix(int[][] matrix){
  }



}
