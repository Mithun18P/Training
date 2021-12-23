package DecisionPerform;

public class DesStatements {
	void Simple_if()
	{
		int i=1;
		if(i<=1)
		{
			System.out.println("it is a Simple if Statement");
		}
	}
	void if_else()
	{
		int i=2;
		if(i<=1)
		{
			System.out.println();
		}
		else {
			System.out.println("it is a If else statement");
		}
	}
	void else_if()
	{
		int i=1;
		if(i<1)
		{
			System.out.println();
		}
		else if(i==1) {
			System.out.println("it is a Else if Statement");
		}
		else
		{
			System.out.println();
		}
	}
	void nested_if()
	{
		int i=2;
		if(i<=2)
		{
			System.out.println("First if in nested if statement");
			if(i==2)
			{
				System.out.println("Second if statement is true, i.e nested if");
			}
			else {
				System.out.println();
			}
		}
		else {
			System.out.println("nested if terminets in else statement");
		}
		
	}
}
