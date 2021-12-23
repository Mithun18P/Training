package Mathematical.EvenOdd;

public class EvenOdd {
	static void evenodd(int... i)
	{
		for(int j=0;j<i.length;j++)
		{
			if(i[j]%2==0)
			{
				System.out.println(i[j]+" is Even number.");
			}
			else
			{
				System.out.println(i[j]+" is odd number.");
			}
		}
	}
	public static void main(String[] args) {
		evenodd(10,20,23);
	}
}
