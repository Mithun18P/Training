package Asdm;

public class ASDM {
	static void addition(int... i)
	{int b=0;
		for(int j=0;j<i.length;j++)
		{
			b=b+i[j];
		}
		System.out.println(b);
	}
	static void substraction(int... i)
	{
		int b=0;
			for(int j=1;j<i.length;j++)
				{
					b=i[j-1]-i[j];
				}
			System.out.println(b);
	}
	static void division(int... i)
	{
		int c=i[0]%i[1];
		System.out.println(c);
	}
	static void multiplication(int... i)
	{
		int c=1;
		for(int j=0;j<i.length;j++)
		{
			c=c*i[j];
		}
		System.out.println(c);
	}

}
//i[j-1]-i[j]-b;