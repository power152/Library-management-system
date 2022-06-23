package opeartion;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class DelOperation implements IOpeartion {
    @Override
    public void work(BookList bookList) {
        System.out.println("删除图书");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入删除图书名字：");
        String name=scanner.nextLine();

        //存放，放在顺序表的后面
        //先检查有没有这本书
        int size=bookList.getUsedSize();
        int pos=-1;
        for(int i=0;i<size;i++) {
            Book book1=bookList.getPos(i);
            if(book1.getName().equals(name)) {
                pos=i;
                break;
            }
        }
        if(pos!=-1) {
            //[i]=[i+1];
            for (int i = pos; i <size-1 ; i++) {
                Book book=bookList.getPos(i+1);
                bookList.setBooks(i,book);
            }
            bookList.setUsedSize(size-1);
            System.out.println("删除成功");
            return;
        }
        System.out.println("删除失败");

    }

}
