package LoopingOpertion;

public class Loop {
	static void for_loop(int i)
	{
		for(int j=0;j<=i;j++)
		{
			System.out.print(i);
		}
		System.out.println();
	}
	static void for_each(int... i)
	{
		for(int j:i)
		{
			System.out.print(j);
		}
		System.out.println();
	}
	static void while_loop(int i)
	{
		int j=0;
		while(j<=i)
		{
			System.out.print(i);
			j++;
		}
		System.out.println();
	}
	static void do_while(int i)
	{int j=0;
		do {
			System.out.print(j);
			j++;
		}
		while(j<=i);
		System.out.println();
	}
}
