package isys1118.assignment.model;

import java.util.ArrayList;

public class CourseList
{
    private ArrayList<Course> courses = new ArrayList<Course>();
    
    public void addCourse(Course course)
    {
        courses.add(course);
    }
    
}
