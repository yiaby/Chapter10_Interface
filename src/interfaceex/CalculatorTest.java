package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 5;
		
		CompleteCalc calc = new CompleteCalc();
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divided(num1, num2));
		System.out.println(calc.square(num1));
		
		calc.showInfo();
		
		calc.description();
		
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(Calc.total(arr)); //정적 메서드 사용하기

	}

}
