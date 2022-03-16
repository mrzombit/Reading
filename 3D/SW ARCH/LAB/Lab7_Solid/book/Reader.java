package com.solid.BOOK;
import com.solid.BOOK.Book;

public class Reader extends Book{

    public Reader(){
        super();
    }

    public void printToScreen() {
        Book book = this;
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
