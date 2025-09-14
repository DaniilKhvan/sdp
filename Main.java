class Book {
    private String title;
    private String author;
    private String pages;
    private String genre;
    private String publisher;

    public static class Builder {
        private String title;
        private String author;
        private String pages;
        private String genre;
        private String publisher;

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder author(String author) {
            this.author = author;
            return this;
        }

        public Builder pages(String pages) {
            this.pages = pages;
            return this;
        }

        public Builder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Book build() {
            Book book = new Book();
            book.title = title;
            book.author = author;
            book.pages = pages;
            book.genre = genre;
            book.publisher = publisher;
            return book;
        }
    }

    @Override
    public String toString() {
        return "Book [title=" + title + ", author=" + author + ", pages=" + pages + ", genre=" + genre + ", publisher=" + publisher + "]";
    }
}

class BookDirector {
    public Book constructSampleBook(Book.Builder builder) {
        return builder
                .title("NotRich")
                .author("Dan")
                .pages("321")
                .genre("Fantastic")
                .publisher("Khvan")
                .build();
    }
}

public class Main {
    public static void main(String[] args) {
        BookDirector director = new BookDirector();
        Book.Builder builder = new Book.Builder();

        Book book = director.constructSampleBook(builder);

        System.out.println(book.toString());
    }
}