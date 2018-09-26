package be.pxl.classes;

public class Dvd implements Loanable {
    private String authorName;
    private String title;
    private Cover cover;
    private CreationDate creationDate;

    public Dvd(String authorName, String title, Cover cover, CreationDate creationDate) {
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
        System.out.printf("Dvd %s by %s is being lent out.%n", authorName, title);
    }
}
