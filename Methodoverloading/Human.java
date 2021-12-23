package Methodoverloading;

public class Human {
	public static void main(String[] args) {
		Friend f= new Friend();
		Unknown un=new Unknown();
		System.out.println("me running....");
		un.run();
		un.run(50);
		un.run(60, "Mithun");
		System.out.println("friend running....");
		f.run();
		f.run(50);
		f.run(60, "Mithun");
		
	}
}
