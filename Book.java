// Define a Java class called Book with attributes for title, author, and price. Write a method to display the book's details and use static members

public class Book{
    String title;
    String author;
    int price;
   static int bookCount = 0;

    //constructor

    public Book(int price, String title, String author){
            this.price = price;
            this.title = title;
            this.author = author;

            bookCount++;            
    }

    void displayDetail(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(price);
        System.out.println("-------------");
    }

    public static void main(String[] args) {

        Book b1 = new Book(999,"Ramayan","Balmiki");
        Book b2 = new Book(799,"Mahabharat","Vedvyas");

        b1.displayDetail();
        b2.displayDetail();

                System.out.println("Book Count : "+Book.bookCount);
        
    }

}

