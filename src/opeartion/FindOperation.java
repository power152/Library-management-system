package opeartion;

import book.Book;
import book.BookList;

import java.util.Scanner;

public class FindOperation implements IOpeartion {
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入查找图书名字：");
        String name=scanner.nextLine();

        //存放，放在顺序表的后面
        //先检查有没有这本书
        int size=bookList.getUsedSize();
        for(int i=0;i<size;i++) {
            Book book1=bookList.getPos(i);
            if(book1.getName().equals(name)) {
                System.out.println("这本书找到了");
                System.out.println(book1);
                return;
            }
        }
        System.out.println("查找失败！！");
    }
}
