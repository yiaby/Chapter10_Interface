package exercise;

public interface Sort {
	void ascedning (int[] arr);		//==>오름차순 정렬
	void descending (int[] arr);		//==>내림차순 정렬
	
	//알고리즘에 대한 설명
	default void description() {		
		System.out.println("숫자를 정렬하는 알고리즘 입니다.");
	}
}
