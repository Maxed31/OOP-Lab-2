package week3.labs.TaskItem;
import week3.labs.TaskItem.TaskItem;
import week3.labs.enums.Status;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();


    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1,"Push lab code to the github", Status.TO_DO),
                new TaskItem(2,"Prepare for the quiz", Status.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2", Status.COMPLETED)
        );
    }


    public List<TaskItem> getAllObjects() {
        return this.tasks;
    }
    public List<TaskItem> getByStatus(Status status){
        return tasks.
                    stream().
                    filter(s -> s.GetStatus().equals(status)).
                    collect(Collectors.toList());
    }

    public List<TaskItem> taskIdGreaterOrEqualByTwo() {
    return tasks.
                stream().
                filter(t -> t.getTaskId() >= 2).
                collect(Collectors.toList());
    }
    public void printTaskDescription() {
        tasks.stream().
                    forEach(taskItem -> {
                        System.out.println(" - " + taskItem.getTaskDescription());
                    });
    }
}