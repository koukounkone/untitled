package bookstoread;

import java.util.*;
import java.util.stream.Collectors;

public class BookShelf {
    private final List<String> Book = new ArrayList<>();

    public List<Book> Book() {
        return Collections.unmodifiableList(Book);
    }

    public void add(Book effectiveJava, Book codeComplete, String... booksToAdd) {
        Book.addAll(Arrays.asList(booksToAdd));
    }

    public List<Book> arrange() {
        return Book.stream().sorted().collect(Collectors.toList());
    }

    public List<Book> arrange() {
        return books.stream().sorted().collect(Collectors.toList());
    }
    public List<Book> arrange(Comparator<Book> criteria) {
        return books.stream().sorted(criteria).collect(Collectors.toList());
    }

}

