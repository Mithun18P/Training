package Methodoverloading;

public class Unknown {

	void run()
	{
		System.out.println("slowly running");
	}
	void run(int a)
	{
		System.out.println("running with speed "+ a);
	}
	void run(int a,String b)
	{
		System.out.println("running with speed "+a+" with a friend "+ b);
	}
}
