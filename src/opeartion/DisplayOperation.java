package opeartion;

import book.Book;
import book.BookList;

public class DisplayOperation implements IOpeartion {
    @Override
    public void work(BookList bookList) {
        System.out.println("打印图书");
        int size=bookList.getUsedSize();
        for(int i=0;i<size;i++) {
            //System.out.println(bookList[i]);  //此时booklist不是数组
           Book book=bookList.getPos(i);
            System.out.println(book);

        }
    }
}
