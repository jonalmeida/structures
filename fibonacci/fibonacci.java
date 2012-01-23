import java.util.*;

public class fibonacci {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Fibonacci sequence number:");
		int nthNum = in.nextInt();
		
		//nthNum = nthNum ;
		System.out.print("Value at position " + "\'"+ nthNum+"\'" + " is " + Fibo(nthNum) + ".");
	
	}
	
	public static int Fibo(int nthNum){
		if(nthNum == 1)
			return (1);
		else if(nthNum == 2)
			return (1);
		else
			return (Fibo(nthNum-1) + Fibo(nthNum-2));
	}
}
