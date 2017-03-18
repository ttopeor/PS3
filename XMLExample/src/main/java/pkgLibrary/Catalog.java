package pkgLibrary;

import java.util.ArrayList;

import javax.xml.bind.annotation.*;


import bookException.BookException;
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

public class Catalog {

	@XmlAttribute
	int id;	
	
	@XmlElement(name="book")
	ArrayList<Book> books;
	
	
	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<Book> getBooks() {
		return books;
	}
	

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	public  Book GetBook(String id) throws BookException {
		Book ID = null;
		for(Book a: books){
			if (a.getId().equals(id)){
				ID=a;
				return ID;
				
				
			}
		}
		
		
			throw new BookException(ID);
	}


	public void AddBook( String id) throws BookException {
		
		for(Book ID: books){
			if (ID.getId().equals(id)){
				throw new BookException(ID);
			}
		
		}
		books.add(new Book(id));

	}
	
	
}
	
	


	
	
	
	

