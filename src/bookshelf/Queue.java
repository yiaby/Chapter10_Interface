package bookshelf;

public interface Queue {
	void enQueue(String title);	//배열의 맨 마지막에 추가
	String deQueeu();			//배열의 맨 처음 항목 반환
	int getSize();
}
