package typeTask;

public class Task {
    private String name;
    private String description;
    private final int id;
    private StatusTask status;

    public Task(String name, int id, StatusTask status) {
        this.name = name;
        this.id = id;
        this.status = status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(StatusTask status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getId() {
        return id;
    }

    public StatusTask getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Задача: " +
                "Имя задачи: " + name + ", " +
                "Описание: " + description + ", " +
                "Id задачи: " + id + ", " +
                "Статус: " + status;
    }
}
