package isys1118.assignment.model;

public class TimeTableTask
{
    
    private Task task;
    private String colour;
    
    public TimeTableTask(Task task, String colour)
    {
        this.task = task;
        this.colour = colour;
    }
    
    public Course getCourse()
    {
        return task.getCourse();
    }
    public String getRoom()
    {
        return task.getRoom();
    }
    public String getTaskType()
    {
        return task.getTaskType();
    }
    public String getDay()
    {
        return task.getDay();
    }
    public String getTime()
    {
        return task.getTime();
    }
    public String getColour()
    {
        return colour;
    }
    
    public Task cloneTask()
    {
        Task t = new Task(task.getCourse().getCourseClone(),
                task.getRoom(),
                task.getTaskType(),
                task.getDay(),
                task.getTime());
        return t;
    }
    
    public TimeTableTask cloneTimeTableTask()
    {
        return new TimeTableTask(cloneTask(), getColour());
    }
    
}
