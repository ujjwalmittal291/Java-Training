import java.lang.*;
import java.util.*;
class Conditionalclause {
  public static void main(String[] args) {
    Random rand=new Random();
    int option=rand.nextInt(50);
    //System.out.println(option);
    System.out.println("Result via IF clause");
    if ((option%2)==0) {
      System.out.print("Randomly generated number "+option+" is an even Integer.");
    }
    else {
      System.out.print("Randomly generated number "+option+" is an odd Integer.");
    }
  }
}
