package dharani;

public class Animal {
	void move() {
		System.out.println("Animal-move");
	}
	class cheetah extends Animal{
		void move() {
			System.out.println("run");
		}
	}
	public static void main(String[] args) {
		Animal ani = new Animal();
		cheetah  che = ani.new cheetah();
		che.move();

	}

}
