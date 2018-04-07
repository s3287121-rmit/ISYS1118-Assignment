package isys1118.assignment.view;

import java.util.List;

import isys1118.assignment.model.Course;

public class CourseListView
{
    
    public void show(List<Course> courses)
    {
        // TODO show stuff
        System.out.println("Course List...");
        for (Course c : courses)
        {
            System.out.println(c.getName() + " " + c.getCourseCode());
        }
        System.out.println();
    }
    
}
