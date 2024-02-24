package typeTask;

public class Subtask extends Epic {
    private int epicId;
    public Subtask(String name, int id, StatusTask status, int epicId) {
        super(name, id, status);
        this.epicId = epicId;
    }

    public void setEpicId(int epicId) {
        this.epicId = epicId;
    }

    public int getEpicId() {
        return epicId;
    }

    @Override
    public String toString() {
        return "Задача: " +
                "Имя задачи: " + getName() + ", " +
                "Описание: " + getDescription() + ", " +
                "Id задачи: " + getId() + ", " +
                "Статус: " + getStatus() + ", " +
                "Id главной задачи: " + epicId;
    }
}
