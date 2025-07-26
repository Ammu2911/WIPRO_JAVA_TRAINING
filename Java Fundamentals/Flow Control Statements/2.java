 /*Write a program to check if a given integer number is odd or even.*/
Code :
import java.util.*;
public class Example{
  public Static void main(String[] args){
  Scanner sc =new Scanner(System.in);
    int a = sc.NextInt();
    if(a%2 == 0)
      System.out.println(a+ "is Even.");
    else
      System.out.println(a+ "is Odd.");
  }
}
