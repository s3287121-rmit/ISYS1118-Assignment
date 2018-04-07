package isys1118.assignment.model;

public class Task
{
	private Course course;
	private String room;
	private String taskType;
	private String day;
	private String time;
	
	public Task(Course course, String room, String taskType, String day, String time)
	{
		this.course = course;
		this.room = room;
		this.taskType = taskType;
		this.day = day;
		this.time = time;
	}
	public Course getCourse()
	{
		return course;
	}
	public void setCourse(Course course)
	{
		this.course = course;
	}
	public String getRoom()
	{
		return room;
	}
	public void setRoom(String room)
	{
		this.room = room;
	}
	public String getTaskType()
	{
		return taskType;
	}
	public void setTaskType(String taskType)
	{
		this.taskType = taskType;
	}
	public String getDay()
	{
		return day;
	}
	public void setDay(String day)
	{
		this.day = day;
	}
	public String getTime()
	{
		return time;
	}
	public void setTime(String time)
	{
		this.time = time;
	}
	
	public Task cloneTask()
	{
	    return new Task(course.getCourseClone(), room, taskType, day, time);
	}
}
