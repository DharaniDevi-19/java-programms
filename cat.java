package dharani;

public class cat {
	int age;
	String name;
	public cat() {
		age = 0;
		name = "unknown";
	}

	public static void main(String[] args) {
		cat obj = new cat();
		System.out.println(obj.name);
		System.out.println(obj.age);

	}

}
