package isys1118.assignment.model;

import java.util.ArrayList;

public class TaskList
{
    
    private ArrayList<Task> tasks = new ArrayList<Task>();
    
    public void addTask(Task add)
    {
        tasks.add(add);
    }
    
}
