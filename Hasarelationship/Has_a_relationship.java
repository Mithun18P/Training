package Hasarelationship;

public class Has_a_relationship {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human=new Human();
		human.talk();
		human.walk();
		Heart heart=new Heart();
		human.heart2(heart);
	}

}

