import book.Book;
import book.BookList;
import user.AdmniUser;
import user.NormalUser;
import user.User;

import java.util.Scanner;

public class Main {
    //向上转型
    public static User login() {
        System.out.println("请输入你的名字");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.next();
        System.out.println("请输入你的身份：1->管理员 0->普通用户");
        int choice=scanner.nextInt();
        if(choice==1) {
            return new AdmniUser(name);//向上转型
        }else {
            return new NormalUser(name);//向上转型
        }
    }

    public static void main(String[] args) {
        BookList bookList=new BookList();

        User user=login();
        while (true) {
            int choice = user.menu();
            //System.out.println(choice);
            user.doOperation(choice,bookList);
        }
    }
}
