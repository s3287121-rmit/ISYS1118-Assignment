package isys1118.assignment.model;

import java.util.ArrayList;
import java.util.List;

public class TimeTable
{
    
    private ArrayList<Task> tasks = new ArrayList<Task>();
    private ArrayList<TimeTableTask> taskItems = new ArrayList<TimeTableTask>();
    
    public void addTask(Task t)
    {
        tasks.add(t);
    }
    
    public List<TimeTableTask> getTaskItems()
    {
        if (taskItems.size() != tasks.size())
        {
            taskItems.clear();
            for (Task t : tasks)
            {
                TimeTableTask ttt = new TimeTableTask(t, "#1010FF");
                taskItems.add(ttt);
            }
        }
        ArrayList<TimeTableTask> tList = new ArrayList<TimeTableTask>();
        for (TimeTableTask ttt : taskItems)
        {
            tList.add(ttt.cloneTimeTableTask());
        }
        return tList;
    }
    
}
