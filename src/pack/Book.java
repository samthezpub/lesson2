package pack;

public class Book {
    private String Book;
    private String CreatorFIO;
    private int ReleaseYear;
    private String OrganisationName;
    private String Genre;
    private int PagesAmount;

    public Book(String book, String creatorFIO, int releaseYear, String organisationName, String genre, int pagesAmount) {
        Book = book;
        CreatorFIO = creatorFIO;
        ReleaseYear = releaseYear;
        OrganisationName = organisationName;
        Genre = genre;
        PagesAmount = pagesAmount;
    }

    public Book(String book, int releaseYear, String organisationName, String genre, int pagesAmount) {
        Book = book;
        CreatorFIO = "Anonymous";
        ReleaseYear = releaseYear;
        OrganisationName = organisationName;
        Genre = genre;
        PagesAmount = pagesAmount;
    }

    public String getBook() {
        return Book;
    }

    public void setBook(String book) {
        Book = book;
    }

    public String getCreatorFIO() {
        return CreatorFIO;
    }

    public void setCreatorFIO(String creatorFIO) {
        CreatorFIO = creatorFIO;
    }

    public int getReleaseYear() {
        return ReleaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        ReleaseYear = releaseYear;
    }

    public String getOrganisationName() {
        return OrganisationName;
    }

    public void setOrganisationName(String organisationName) {
        OrganisationName = organisationName;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public int getPagesAmount() {
        return PagesAmount;
    }

    public void setPagesAmount(int pagesAmount) {
        PagesAmount = pagesAmount;
    }


}
