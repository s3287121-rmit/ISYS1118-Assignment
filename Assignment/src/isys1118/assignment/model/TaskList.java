package isys1118.assignment.model;

import java.util.ArrayList;
import java.util.List;

public class TaskList
{
    
    private ArrayList<Task> tasks = new ArrayList<Task>();
    
    public void addTask(Task add)
    {
        tasks.add(add);
    }
    
    public List<Task> cloneTasks()
    {
        ArrayList<Task> list = new ArrayList<Task>();
        for (Task t : tasks)
        {
            Task ta = new Task(t.getCourse().getCourseClone(), t.getRoom(),
                    t.getTaskType(), t.getDay(), t.getTime());
            list.add(ta);
        }
        return list;
    }
    
}
