package interfaceex;

public abstract class Calculator implements Calc {

	@Override //λ§μ
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override //λΊμ
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

	

}
