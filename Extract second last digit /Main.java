import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in=new Scanner(System.in);
       int i=in.nextInt();
       System.out.println(Math.abs((i%100)/10));
	}
}