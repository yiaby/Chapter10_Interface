package exercise;

public class HeapSort implements Sort {

	@Override
	public void ascedning(int[] index) {
		System.out.println("HeapSort ascedning");
	}

	@Override
	public void descending(int[] index) {
		System.out.println("HeapSort descending");
		
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("HeapSort 입니다.");
	}

	
	
}
