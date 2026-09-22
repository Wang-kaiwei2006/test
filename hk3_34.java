package test;

public class hk3_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 5;
		
		System.out.println("num1和num2的各種運算");
		System.out.println("num1+num2等於"+(num1+num2));
		System.out.println("num1-num2等於"+(num1-num2));
		System.out.println("num1*num2等於"+(num1*num2));
		System.out.println("num1/num2等於"+(num1/num2));
		System.out.println("num1%num2等於"+(num1%num2));
		
		int a=0;
		int b=0;
		int c=0;
		
		b=a++;
		c=++a;
		
		System.out.println("因為指定之後才遞增，所以b得值為"+b);
		System.out.println("因為遞增之後才指定，所以c得值為"+c);
	}

}
