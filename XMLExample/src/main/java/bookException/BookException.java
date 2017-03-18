package bookException;

import pkgLibrary.Book;


public class BookException extends Exception{
	
	private Book errorBook;
	private String ID;
	
	public BookException(Book ID){
		
		
		
		errorBook=ID;
	
	}
	public Book getErrorBook() {
		return errorBook;
	}
	public String getBookID() {
		return ID;
	}

	}