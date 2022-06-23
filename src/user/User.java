package user;


import book.BookList;
import opeartion.IOpeartion;

public abstract class User {
   protected String name;

   protected IOpeartion[] iOpeartions;//声明一个数组

    public User(String name) {
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice, BookList bookList) {
        this.iOpeartions[choice].work(bookList);
    }
}
