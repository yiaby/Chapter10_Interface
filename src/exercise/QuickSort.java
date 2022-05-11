package exercise;

public class QuickSort implements Sort{

	@Override
	public void ascedning(int[] index) {
		System.out.println("QuickSort ascendning");
	}

	@Override
	public void descending(int[] index) {
		System.out.println("QuickSort descending");
		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort 입니다.");
	}

	

}
