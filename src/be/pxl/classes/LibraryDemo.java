package be.pxl.classes;


import java.awt.*;
import java.time.LocalDateTime;

public class LibraryDemo {
    public static void main(String[] args) {
        Rack<String, Book> booksByAuthorName = new Rack<>();
        Rack<CreationDate, Dvd> dvdsByCreationDate = new Rack<>();

        Book hobbit = new Book("Tolkien", "The Hobbit 1", new Cover(Color.DARK_GRAY),
                new CreationDate(LocalDateTime.of(1937, 9, 21, 10, 20)));

        booksByAuthorName.addWithCriteria(hobbit.getAuthorName(), hobbit);
        //booksByAuthorName.addWithCriteria(hobbit.getCreationDate(), hobbit);
        // Rek is enkel voor boeken gesorteerd op datum van schrijven

        Dvd jurassicPark = new Dvd("Colin Trevorrow", "Jurassic World", new Cover(Color.GREEN),
                new CreationDate(LocalDateTime.of(2018, 6, 6, 10, 20)));

        dvdsByCreationDate.addWithCriteria(jurassicPark.getCreationDate(), jurassicPark);
        //dvdsByCreationDate.addWithCriteria(hobbit.getCreationDate(), hobbit); // Geen boeken in de dvd-rek
        //dvdsByCreationDate.addWithCriteria(jurassicPark.getCover(), jurassicPark); // Cover implementeerd Comparable niet
    }
}
