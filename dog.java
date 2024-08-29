package dharani;

public class dog {
	String name;
	String color;
	public dog(String xer,String yui) {
		name = xer;
		color = yui;
	}

	public static void main(String[] args) {
		dog obj = new dog("puppy","black");
		System.out.println(obj.name);
		System.out.println(obj.color);

	}

}
