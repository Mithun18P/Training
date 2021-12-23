package Mathematical.Jump;

import java.util.Scanner;

public class Jump {
	void prime(int k) {
	for(int i=2;i<k;i++)
	{
		if(k%i==0)
		{
			System.out.println(k+" is not prime number.");
			break;
		}
		else
		{
			System.out.println(k+" is a prime number.");
			break;
		}
	}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Jump j=new Jump();
		j.prime(sc.nextInt());
	}
}