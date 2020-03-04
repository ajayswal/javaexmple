import java.util.*;
class Scannertest {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.println("Enter Your Roll No:-");
    int r = s . nextInt();
    System.out.println("Enter Your Name:-");
    String n = s . next ();
    System.out. println("Enter Your fee:-");
    double f = s .nextDouble();
    System.out.println ("|Your Name: "+n+"| Your Roll No: "+r+"| Your fee: "+f);

  }
}
