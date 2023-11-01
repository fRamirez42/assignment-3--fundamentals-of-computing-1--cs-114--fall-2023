import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input;
    int size = 0;

    System.out.print("Please enter a number bigger than 0");

    try{
      if(size > 0){
        size = scan.nextInt();
      }else{
        System.out.println("You entered an number lower than 1, please try again");
      }
    } catch (Exception e){
      System.out.println("You entered something that was not a number, please run again and try again");
    }



  }
}
