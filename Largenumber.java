# Largenumber
import java.io.*;
import java.util.*;
public class Largenumber
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    if(a>=b && a>=c)
    {
      System.out.println("Largest number"+a);
    }
    if(b<=a && b>=c)
    {
      System.out.println("Largest number"+b);
    }  
    if(c>=a && c>=b)
    {
      System.out.println("Largest number"+c);
    }
  }
}  
