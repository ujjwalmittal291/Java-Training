import java.lang.*;
import java.util.*;
class RandomNumber {
  public static void main(String[] args) {
    Random rand=new Random();
    int option=rand.nextInt(50);
    System.out.println(option);
  }
}
