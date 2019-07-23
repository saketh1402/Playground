import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
	    //get the value for n
      int n = in.nextInt();
      //extract
      int Last_digit = n % 10;
      //repeatedly remove last digit 
      while(n >= 10)
      {
         n = n / 10;
	}
      //add
      int sum=Last_digit + n;
      System.out.println(sum);
}}