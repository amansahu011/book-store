package in.sp.mapper;

import in.sp.Dto.BookDto;
import in.sp.entity.Book;

public class Bookmapper {

	public static BookDto toDto(Book book) {
		
		BookDto bookDto= new BookDto(book.bookId(),book.name(),book.price(),book.author(),book.description());
		
		return bookDto;
	}

	
	
public static Book toentity(BookDto bookDto) {
		
		Book book= new Book(bookDto.bookId(),bookDto.name(),bookDto.price(),bookDto.author(),bookDto.description());
		
		return book;
	}

	
	
}
