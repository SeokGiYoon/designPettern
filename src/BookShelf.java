import java.util.Vector;

public class BookShelf implements Aggregate{
	private Vector<Book> books;
	private int last = 0;
	
	public BookShelf(){
		this.books = new Vector<Book>();
	}
	
	public Book getBookAt(int index){
		return books.get(index);
	}
	
	public void appendBook(Book book){
		books.add(book);
		last++;
	}
	
	public int getLength(){
		return last;
	}

	@Override
	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
	
}
