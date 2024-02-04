import Challenge1.Book;
import Challenge1.FictionBook;
import Challenge1.Library;
import Challenge1.NonFictionBook;
import Challenge2.Bike;
import Challenge2.Car;
import Challenge2.RentalAgency;
import Challenge2.Vehicle;

public class Main {
    public static void main(String[] args) {

        RentalAgency RA=new RentalAgency();

        Car c = new Car("test","test",3432.0,100);
        Bike b = new Bike("bitke","test",239.0,1990);
        Vehicle v = new Vehicle("rfre","dcfd",22223.0);

        RA.addVehicle(c);
        RA.addVehicle(b);
        RA.addVehicle(v);

        RA.display();

        System.out.println("*****************");
        RA.rentVehicle(c);

        RA.showAllRentVehicles();
        System.out.println("*****************");

        RA.display();



        Library library = new Library();

        FictionBook fictionBook = new FictionBook("The Hobbit", "J.R.R. Tolkien", "978-0-261-10222-4", "Fantasy");
        NonFictionBook nonFictionBook = new NonFictionBook("Sapiens", "Yuval Noah Harari", "978-0-06-231611-0", "History");
        Book book = new Book("test","me","998383");



        //here we used poly
        library.addBook(fictionBook);
        library.addBook(nonFictionBook);
        library.addBook(book);

        library.displayLibrary();

        library.removeBook(book);

        library.displayLibrary();
    }
}