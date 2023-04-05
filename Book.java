package book;

public class Book {
	String bookName;
	String authorName;
	int price;
	public Book(String bookName, String authorName, int price) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.price = price;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName=bookName;
		
	}
	public String getAuthorName() {
		return authorName;
		
	}
	public void setAuthorName(String authorName) {
		this.authorName=authorName;
		
	}
	public int getPrice() {
		return price;
		
	}
	
	public int setPrice(int price) {
		return this.price=price;
		
	}
	@Override
	public String toString() {
		return bookName+","+authorName+","+price;
	}
}
