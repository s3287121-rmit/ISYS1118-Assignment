package isys1118.assignment.view;

import isys1118.assignment.model.Task;

public class TaskView
{
    
    public void show(Task t)
    {
        // TODO show view
        System.out.println("Task");
        System.out.printf(
                "CourseCode = %s, room = %s, type = %s, day = %s, time = %s\n\n",
                t.getCourse().getCourseCode(),
                t.getRoom(),
                t.getTaskType(),
                t.getDay(),
                t.getTime());
    }
    
}
