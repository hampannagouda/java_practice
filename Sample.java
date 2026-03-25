package java_practice;
public class Sample {
	static{
	System.out.println("static member of the class Sample");
	}
	public static void main(String[] args) {
		System.out.println("hello world");
		System.out.println(Demo.num);
	}
}
class Demo{
	static {
		System.out.println("static member of the class demo");
	}
	static int num = 10;
}
