package isys1118.assignment.view;

import isys1118.assignment.model.Course;

public class CourseView
{
    
    public void show(Course c)
    {
        // TODO show page
        System.out.println("Course...");
        System.out.println("Name: " + c.getName()
                + ", Code: " + c.getCourseCode());
        System.out.println();
    }
    
}
