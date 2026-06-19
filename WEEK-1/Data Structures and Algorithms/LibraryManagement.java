import java.util.Arrays;

public class LibraryManagement {

    static class Book {
        int bookId;
        String title;
        String author;

        Book(int bookId, String title, String author) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
        }

        public String toString() {
            return "Book ID: " + bookId +
                    ", Title: " + title +
                    ", Author: " + author;
        }
    }

    // Linear Search
    static Book linearSearch(Book[] books, String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title))
                return book;
        }
        return null;
    }

    // Binary Search
    static Book binarySearch(Book[] books, String title) {

        Arrays.sort(books, (a, b) -> a.title.compareToIgnoreCase(b.title));

        int low = 0;
        int high = books.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int compare = title.compareToIgnoreCase(books[mid].title);

            if (compare == 0)
                return books[mid];

            if (compare < 0)
                high = mid - 1;
            else
                low = mid + 1;
        }

        return null;
    }

    public static void main(String[] args) {

        Book[] books = {
                new Book(101, "Java", "James Gosling"),
                new Book(102, "Python", "Guido van Rossum"),
                new Book(103, "C Programming", "Dennis Ritchie"),
                new Book(104, "Data Structures", "Mark Allen"),
                new Book(105, "Operating System", "Galvin")
        };

        String searchTitle = "Python";

        System.out.println("Linear Search:");
        System.out.println(linearSearch(books, searchTitle));

        System.out.println();

        System.out.println("Binary Search:");
        System.out.println(binarySearch(books, searchTitle));
    }
}