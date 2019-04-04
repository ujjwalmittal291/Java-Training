import java.lang.*;
import java.util.*;
class ForLoop {
  public static void main(String[] args) {
    for (int i=0;i<5;i++ ) {
      for (int j=0;j<=i ;j++ ) {
        System.out.print(j+i+1);
      }
      System.out.println("");
    }
  }
}
