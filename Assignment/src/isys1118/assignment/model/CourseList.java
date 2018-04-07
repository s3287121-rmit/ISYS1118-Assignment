package isys1118.assignment.model;

import java.util.ArrayList;
import java.util.List;

public class CourseList
{
    private ArrayList<Course> courses = new ArrayList<Course>();
    
    public void addCourse(Course course)
    {
        courses.add(course);
    }
    
    public List<Course> getCourses()
    {
        ArrayList<Course> retCourses = new ArrayList<Course>();
        for (Course c : courses)
        {
            Course retC = new Course(c.getName(), c.getCourseCode());
            retCourses.add(retC);
        }
        return retCourses;
    }
    
}
