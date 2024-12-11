package org.librarymanagement;

/**
 * Represents an author in the library management system.
 */
public class Author {

    // The first name of the author
    private String firstName;

    // The last name of the author
    private String lastName;

    /**
     * Constructs a new Author instance with the specified first and last name.
     *
     * @param firstName The first name of the author.
     * @param lastName  The last name of the author.
     */
    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Gets the first name of the author.
     *
     * @return The first name of the author.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Gets the last name of the author.
     *
     * @return The last name of the author.
     */
    public String getLastName() {
        return lastName;
    }
}
