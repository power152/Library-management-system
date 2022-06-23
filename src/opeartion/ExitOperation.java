package opeartion;

import book.BookList;

public class ExitOperation implements IOpeartion {
    @Override
    public void work(BookList bookList) {
        System.exit(0);//代表正常对出
        System.out.println("退出系统");
    }
}
