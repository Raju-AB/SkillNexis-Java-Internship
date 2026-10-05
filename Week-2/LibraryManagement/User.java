package LibraryManagement;

public abstract class User {

    private int userId;
    private String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public abstract void borrowBook(Book book);

    public void returnBook(Book book) {
        System.out.println(name + " returned: " + book.getTitle());
        book.setAvailable(true);
    }
}