package book;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class Library {		
			ArrayList<Book1> books = new ArrayList<>();

			public static void main(String[] args) {
				
				Library lib = new Library();
				lib.showBooksList();
				
				System.out.println("1, Sort By Price");
				System.out.println("2, Sort By Author Name");
				System.out.println("3, Sort By Price Range");
				System.out.println("4, Search Book");
				System.out.println("please select an option.");
				Scanner sc = new Scanner(System.in);
				int option = sc.nextInt();
//				sc.close();
				switch(option) {
					case 1 :
						lib.sortBookByPrice();
						break;
					case 2 :
						lib.sortByAuthorName();
						break;
					case 3 :
						lib.sortByPriceRange();
						break;
					case 4 :
						lib.searchBook();
						break;
					default :
						System.out.println("Invalid option");
				}
			}

			private void sortByAuthorName() {
				
				System.out.println("Enter Author Name");
				Scanner sc = new Scanner(System.in);
				String name=sc.next();
				for(int i=0; i<books.size();i++) {
				String authorName=books.get(i).getAuthorName();
				if(authorName.equalsIgnoreCase(name)) {
					System.out.println(books.get(i));
				}
				}
			}

			private void searchBook() {
				System.out.println("Enter Book Name");
				Scanner sc = new Scanner(System.in);
				String name = sc.next();
				for (int i=0; i<books.size(); i++) {
					String bookName = books.get(i).getBookName();
					if (bookName.equalsIgnoreCase(name)) {
						System.out.println(books.get(i));
					}
				}
				
			}

			private void sortByPriceRange() {
				
				System.out.println("Give your Price Range min first and max");
				Scanner sc = new Scanner(System.in);
				int min = sc.nextInt();
				int max = sc.nextInt();
//				sc.close();
				
				for (int i=0; i<books.size(); i++) {
					int price = books.get(i).getPrice();
					if (price >= min && price <= max) {
						System.out.println(books.get(i));
					}
				}
				
			}

			private void sortBookByPrice() {
				
				BookPriceSort price = new BookPriceSort();
				
				Collections.sort(books,price);
				
				for (Book1 book : books) {
					System.out.println(book);
				}
			}

			private void showBooksList() {
				books.add(new Book1("Beauty of purpose in life.", "Sahala", 300));
				books.add(new Book1("The Sceret Book", "Robert", 600));
				books.add(new Book1("Ponien selvan", "Kalki", 500));
				books.add(new Book1("Rich Dad, Poor Dad", "Robert", 600));
				books.add(new Book1("Art of War","Sun tzu",200));
				books.add(new Book1("Dhruvangal", "Nakiren", 300));
				
				BookNameSort nameSort = new BookNameSort();
				Collections.sort(books,nameSort);
				
				System.out.println("	List of Books Available");
				for (Book1 book : books) {
					System.out.println("->"+book);
				}		
				System.out.println();
			}

		}
