package dharani;
import java.util.Scanner;
public class shape {
	void getArea() {
		return;
	}
  class Rectangle extends shape{
	  void getArea(int l,int b) {
		  System.out.println(l*b);
	  }
  }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int z = sc.nextInt();
		int y = sc.nextInt();
		shape x = new shape();
		Rectangle obj = x.new Rectangle();
		obj.getArea(z,y);

	}

}
