package book;

import java.util.Comparator;

public class BookNameSort  implements Comparator<Book1>{
@Override
public int compare(Book1 b1, Book1 b2) {
	int result=b1.getBookName().compareTo(b2.getBookName());
	return result;
}
public int compare1(Book1 a1, Book1 a2) {
	int result=a1.getAuthorName().compareTo(a2.getAuthorName());
	return result;
	}
}