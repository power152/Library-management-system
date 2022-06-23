package book;




public class Book {


    private String name;
    private int price;
    private String author;
    private String type;
    private boolean isBorrowed;

    public Book(String name, int price, String author, String type) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.type = type;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", type='" + type + '\'' +
                ((isBorrowed == true) ? " 已经借出 ":" 未借出" )+
                '}';
    }
}

