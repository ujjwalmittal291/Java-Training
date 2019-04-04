import java.lang.*;
import java.util.*;
class SwitchClause {
  public static void main(String[] args) {
    Random rand=new Random();
    int option=rand.nextInt(50);
    //System.out.println(option);
    System.out.print("Result via Switch : ");
    int c=option%2;
    switch (c) {
      case 0:{
        System.out.println("Randomly generated number "+option+" is an even Integer.");
        break;
      }
      case 1:{
        System.out.println("Randomly generated number "+option+" is an odd Integer.");
        break;
      }
      default:
        System.out.println("Randomly generated number "+option+" is not an Integer.");
    }
  }
}
