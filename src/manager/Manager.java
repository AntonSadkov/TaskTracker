package manager;

import typeTask.Epic;
import typeTask.Task;
import java.util.List;

public interface Manager {
    Task createTask(Task task);

    Task updateTask(Task task);

    List<Task> getAllTask();

    Task getTaskById(List<Task> allTask);

    void deleteAllTask(List<Task> allTask);

    void deleteTaskById(List<Task> allTask);

    List<Task> getEpicSubtask(Epic epic);
}
