package enums;

public class Todo {

    String status;
    String title;

    public Todo(String title) {
        this.title = title;

        // Better way to do this?
        this.status = "Incomplete";
    }
}
