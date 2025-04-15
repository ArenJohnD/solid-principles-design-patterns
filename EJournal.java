public class EJournal implements Borrowable {
    private String title;

    public EJournal(String title) {
        this.title = title;
    }

    @Override
    public String getResourceType() {
        return "Book";
    }

    @Override
    public String getTitle() {
        return title;
    }
}