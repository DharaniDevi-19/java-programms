package dharani;

public class rectangle {
	private int length,width;
	public int getter() {
		return length*width;
	}
	public void setter(int len,int wid) {
		this.length = len;
		this.width = wid;
	}
	public static void main(String[] args) {
		rectangle re = new rectangle();
		re.setter(21, 2);
		System.out.println(re.getter());

	}

}
