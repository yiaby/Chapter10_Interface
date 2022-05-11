package interfaceex;

public abstract class Calculator implements Calc {

	@Override //덧셈
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override //뺄셈
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	

}
