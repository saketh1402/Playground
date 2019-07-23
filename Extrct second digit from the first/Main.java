import java.util.Scanner;
class Main{
   public static void main(String[] args){
     //get the n value
     Scanner in=new Scanner(System.in);
     int n=in.nextInt();
     //repeatedly do the step untill it reaches the first digit
     while( n >= 100)
     {
        n = n /10;
     }
     //extract
     int Second_digit = n%10;
     System.out.println(Second_digit);
   }
}