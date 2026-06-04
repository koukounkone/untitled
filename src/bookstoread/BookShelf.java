package bookstoread;

import java.util.*;
import java.util.stream.Collectors;

public class BookShelf {
    private final List<String> Book = new ArrayList<>();

    public List<String> Book() {
        return Collections.unmodifiableList(Book);
    }

    public void add(String... booksToAdd) {
        Book.addAll(Arrays.asList(booksToAdd));
    }

    public List<String> arrange() {
        return Book.stream().sorted().collect(Collectors.toList());
    }


}

