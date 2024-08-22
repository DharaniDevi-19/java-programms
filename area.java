package csed8;

public class area {
	public void ant(int x){
		int z = x*x;
		System.out.println("square area is:"+ z);
	}
	public void ant(int x,int y) {
		System.out.println("Rectangle area is:"+ (x+y));
	}
	public void ant(double x) {
		System.out.printf("Circle area:"+ (3.14*x*x));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area obj = new area();
		obj.ant(7);
		obj.ant(7, 8);
		obj.ant(7.2);
	}
	}


