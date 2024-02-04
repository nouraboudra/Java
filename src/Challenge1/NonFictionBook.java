package Challenge1;

public class NonFictionBook extends Book {
    private String subject;

    public NonFictionBook(String title, String author, String isbn, String subject) {
        super(title, author, isbn);
        this.subject = subject;
    }

    public NonFictionBook() {

    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


}
