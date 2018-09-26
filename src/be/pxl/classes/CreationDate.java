package be.pxl.classes;

import java.time.LocalDateTime;

/**
 * Wrapper klasse voor LocalDateTime omdat LocalDateTime de Comparable interface niet implementeert
 */
public class CreationDate implements Comparable<CreationDate> {
    LocalDateTime dateTime;

    public CreationDate(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    @Override
    public int compareTo(CreationDate o) {
        if (dateTime.isBefore(o.dateTime)) {
            return 1;
        } else if (dateTime.isEqual(o.dateTime)) {
            return 0;
        } else {
            return -1;
        }
    }
}
