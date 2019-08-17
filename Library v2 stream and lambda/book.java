package library.v2;

public class book {

    String Author;
    String Description;
    boolean borrow;
    int price;

    public book(String Author, String Description, boolean borrow, int price) {
        this.Author = Author;
        this.Description = Description;
        this.borrow = borrow;
        this.price = price;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setBorrow(boolean borrow) {
        this.borrow = borrow;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAuthor() {
        return Author;
    }

    public String getDescription() {
        return Description;
    }

    public boolean isBorrow() {
        return borrow;
    }

    public int getPrice() {
        return price;
    }
    

}
