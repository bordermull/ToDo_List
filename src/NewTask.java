public class NewTask {
    String description;

    public NewTask(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
}
