package opeartion;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class AddOperation implements IOpeartion{
    @Override
    public void work(BookList bookList) {
        System.out.println("新增图书");
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入新增图书名字：");
        String name=scanner.nextLine();
        System.out.println("请输入图书作者");
        String author=scanner.nextLine();
        System.out.println("请输入图书类型：");
        String type=scanner.nextLine();
        System.out.println("请输入图书价格");
        int price=scanner.nextInt();
        Book book=new Book(name,price,author,type) ;
        //存放，放在顺序表的后面
        //先检查有没有这本书
        int size=bookList.getUsedSize();
        for(int i=0;i<size;i++) {
            Book book1=bookList.getPos(i);
            if(book1.getName().equals(name)) {
                System.out.println("这本书已经存在了");
                return;
            }
        }
        bookList.setBooks(size,book);
        bookList.setUsedSize(size+1);
        System.out.println("新增图书成功！！！");
    }
}
