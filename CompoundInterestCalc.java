//By Kevin O'Mara
import java.util.Scanner;

public class CompoundInterestCalc{
   public static void main (String []args){
      Scanner input = new Scanner(System.in);
      
      CompoundInterestCalc obj = new CompoundInterestCalc();
      
      System.out.print("Enter the principal amount:");
      int p = input.nextInt();
      
      System.out.print("Enter the annual interest rate:");
      double r = input.nextDouble();
      
      System.out.print("Enter the time/length of investment:");
      int t = input.nextInt();
      
      System.out.print("Enter the number of times compounded per year:");
      int n = input.nextInt();
      
      obj.calculate(p, r, t, n);
   }
   
   public void calculate(int p, double r, int t, int n){
      double amount = p * Math.pow(1 + (r / n), n * t);
      double compint = amount - p;
      System.out.println("Compound interest after " + t + " years: " + compint);
      System.out.println("Amount after " + t + " years: " + amount);
   }
}