package LibraryManagement;

public class StudentUser extends User {

    public StudentUser(int userId, String name) {
        super(userId, name);
    }

    @Override
    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(getName() + " borrowed: " + book.getTitle());
        } else {
            System.out.println("Sorry, book is not available.");
        }
    }
}