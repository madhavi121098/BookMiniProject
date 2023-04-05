package book;

import java.util.Comparator;

public class BookPriceSort implements Comparator<Book1>{
@Override
public int compare(Book1 o1,Book1 o2) {
	if(o1.getPrice()<o2.getPrice()) {
		return -1;
	}
	else if(o1.getPrice()>o2.getPrice()) {
		return 1;
	}
	return 0;
}
}
