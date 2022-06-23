package opeartion;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOpeartion {
    @Override
    public void work(BookList bookList) {
        System.out.println("归还图书");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入归还图书名字：");
        String name=scanner.nextLine();

        //存放，放在顺序表的后面
        //先检查有没有这本书
        int size=bookList.getUsedSize();
        for(int i=0;i<size;i++) {
            Book book1=bookList.getPos(i);
            if(book1.getName().equals(name)) {
                book1.setBorrowed(false);
                System.out.println("归还成功");
                return;
            }
        }
        System.out.println("归还失败！！");
    }
}
