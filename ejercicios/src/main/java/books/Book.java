
package books;

public class Book {
      String title;
    int ammount;
    int id;
    String genre;
    String loanDate;
    String returnDate;
    boolean available;

    public Book(String title, int ammount, int id, String genre) {
        this.title = title;
        this.ammount = ammount;
        this.id = id;
        this.genre = genre;
        this.available = true;
 
    }
           
    public void lendBook(){
        this.available = false;
    }
   
    void returnBook(){
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }
}
