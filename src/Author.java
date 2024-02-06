import java.io.Serializable;

public class Author {

    String firstName;
    String lastName;

    public Author() {
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString()
    {
        return firstName+" "+lastName;
    }
}
