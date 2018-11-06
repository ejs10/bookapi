package com.website.sprinng.dao;

import java.util.List;

import com.website.sprinng.model.Book;

public interface BookDao {
	
	//Save the record
	long save(Book book);
	
	//Get a single record
	Book get(long id);
	
	//Get all the records
	List<Book> list();
	
	//Update the record
	void update(long id, Book book);
	
	//Delete a record
	void delete(long id);

}
