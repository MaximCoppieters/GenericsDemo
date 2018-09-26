package be.pxl.classes;

public class Book implements Loanable {
    private String authorName;
    private String title;
    private Cover cover;
    private CreationDate creationDate;

    public Book(String authorName, String title, Cover cover, CreationDate creationDate) {
        this.cover = cover;
    }

    public Cover getCover() {
        return cover;
    }

    public CreationDate getCreationDate() {
        return creationDate;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public void lendOut() {
        System.out.printf("Book %s by %s is being lent out%n", title, authorName);
    }
}
