package interfaceex;

public class CompleteCalc extends Calculator{

	@Override //곱셈
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override //나눗셈
	public int divided(int num1, int num2) {
		if(num2 != 0) {
		 return num1 / num2 ;
		}else {
			return ERROR;
		}
	}
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

	@Override //제곱
	public int square(int num) {
		return num * num;
	}
}
