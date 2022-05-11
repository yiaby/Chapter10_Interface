package bookshelf;

public class BookShelf extends Shelf implements Queue {

	@Override //배열에 요소 추가
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override //맨 처음 요소를 배열에서 삭제 하고 반환
	public String deQueeu() {
		return shelf.remove(0);
	}

	@Override //배열 요소 개수 반환
	public int getSize() {
		return getCount();
	}

}
