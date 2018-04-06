package model;

public class Course
{
	private String name;
	private String courseCode;
	
	public Course(String name, String courseCode)
	{
		this.name = name;
		this.courseCode = courseCode;
	}
	
	public String getName()
	{
		return name;
	}

	public void setCourseName(String name)
	{
		this.name = name;
	}

	public String getCourseCode()
	{
		return courseCode;
	}

	public void setCoursecode(String courseCode)
	{
		this.courseCode = courseCode;
	}

}
