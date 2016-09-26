package myProject;

public class Leaf {
	private int i = 0;
	Leaf increment() {
	i++;
	return this;
	}
	void print() {
	System.out.println("i = " + i);
	}
	public static void main(String[] args) {
	Leaf x = new Leaf();
	// 递增
	x.increment().increment().increment().print();
	}
}
