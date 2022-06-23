package book;

public class BookList {
    private int usedSize;
    private Book[] books=new Book[10];
    public BookList() {
        this.books[0] = new Book("三国演义", 59, "罗贯中", "小说");
        this.books[1] = new Book("红楼梦", 69, "吴承恩", "小说");
        this.books[2] = new Book("水浒传", 89, "施耐庵", "小说");
        this.usedSize = 3;
    }
        //添加对顺序表的操作opeation


    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public Book getPos(int i) {
        return books[i];
    }

    public void setBooks(int pos,Book book) {
        books[pos]=book;//数字pos位置放入新增的一本书
    }

}
