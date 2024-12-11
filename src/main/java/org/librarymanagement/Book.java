package org.librarymanagement;

/**
 * Represents a book in a library management system.
 */
public class Book {

    // Title of the book
    private String title;

    // Blurb (description) of the book
    private String blurb;

    // Author of the book
    private Author author;

    // Genre of the book
    private Genre genre;

    // Rating (1-5) of the book
    private int rating;

    // Cost of the book
    private double cost;

    /**
     * Constructs a new Book instance with the specified attributes.
     *
     * @param title  The title of the book.
     * @param blurb  A brief description or blurb of the book.
     * @param author The author of the book.
     * @param genre  The genre of the book.
     * @param rating The rating of the book (1-5 scale).
     * @param cost   The cost of the book.
     */
    public Book(String title, String blurb, Author author, Genre genre, int rating, double cost) {
        this.title = title;
        this.blurb = blurb;
        this.author = author;
        this.genre = genre;
        this.rating = rating;
        this.cost = cost;
    }

    /**
     * Gets the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the blurb (description) of the book.
     *
     * @return The blurb of the book.
     */
    public String getBlurb() {
        return blurb;
    }

    /**
     * Gets the author of the book.
     *
     * @return The author of the book.
     */
    public Author getAuthor() {
        return author;
    }

    /**
     * Gets the genre of the book.
     *
     * @return The genre of the book.
     */
    public Genre getGenre() {
        return genre;
    }

    /**
     * Gets the rating of the book.
     *
     * @return The rating of the book, on a scale from 1 to 5.
     */
    public int getRating() {
        return rating;
    }

    /**
     * Gets the cost of the book.
     *
     * @return The cost of the book.
     */
    public double getCost() {
        return cost;
    }
}
