package exercise;

public class BubbleSort implements Sort{

	@Override
	public void ascedning(int[] index) {
		System.out.println("BubbleSort ascedning");
	}

	@Override
	public void descending(int[] index) {
		System.out.println("BubbleSort descending");
		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort 입니다.");
	}

	

}
