package dharani;

public class animal2 {
	void eat() {
		System.out.println("grass");
	}
	void sound() {
		System.out.println("eeeee...");
	}
 class lion extends animal2{
	 void eat() {
		 System.out.println("goat");
	 }
	 void sound() {
		 System.out.println("aaaa...");
	 }
 }
 class tiger extends animal2{
	 void eat() {
		 System.out.println("rabbit");
	 }
	 void sound() {
		 System.out.println("hhhhh...");
	 }

 }
 class panther extends animal2{
	 void eat() {
		 System.out.println("ant");
	 }
	 void sound() {
		 System.out.println("lllll...");
	 }

 }
	public static void main(String[] args) {
		animal2  ani = new animal2();
		tiger ti = ani.new tiger();
		lion li = ani.new lion();
		panther pa = ani.new panther();
		pa.sound();
		li.eat();

	}

}
