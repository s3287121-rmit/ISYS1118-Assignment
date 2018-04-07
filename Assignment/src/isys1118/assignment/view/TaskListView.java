package isys1118.assignment.view;

import java.util.List;

import isys1118.assignment.model.Task;

public class TaskListView
{
    public void show(List<Task> tasks)
    {
        // TODO do the show
        System.out.println("Task List");
        for (Task t : tasks)
        {
            System.out.printf("coursecode = %s, room = %s, type = %s, day = %s, time = %s\n", 
                    t.getCourse().getCourseCode(),
                    t.getRoom(),
                    t.getTaskType(),
                    t.getDay(),
                    t.getTime());
        }
        System.out.println();
    }
}
