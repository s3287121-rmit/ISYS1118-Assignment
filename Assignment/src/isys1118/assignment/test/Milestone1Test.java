package isys1118.assignment.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import isys1118.assignment.controller.CourseController;
import isys1118.assignment.controller.CourseListController;
import isys1118.assignment.controller.TaskController;
import isys1118.assignment.controller.TaskListController;
import isys1118.assignment.controller.TimeTableController;
import isys1118.assignment.database.Database;
import isys1118.assignment.user.User;

public class Milestone1Test
{
    
    @BeforeClass
    public static void setUp()
    {
        Database.connectToDatabase();
    }
    
    @Test
    public void testSingleCourse()
    {
        try
        {
            CourseController cc = new CourseController("TestCourse");
            cc.view();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            fail("Exception thrown.");
        }
    }
    
    @Test
    public void testCourseList()
    {
        try
        {
            CourseListController clc = new CourseListController(new User());
            clc.view();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            fail("Exception thrown.");
        }
    }
    
    @Test
    public void testSingleTask()
    {
        try
        {
            TaskController tc = new TaskController("AAAA3333");
            tc.view();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            fail("Exception thrown.");
        }
    }
    
    @Test
    public void testTaskList()
    {
        try
        {
            TaskListController tlc = new TaskListController(new User());
            tlc.view();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            fail("Exception thrown.");
        }
    }
    
    @Test
    public void testTimeTable()
    {
        try
        {
            TimeTableController ttc = new TimeTableController(new User());
            ttc.view();
        }
        catch (Exception e)
        {
            e.printStackTrace();
            fail("Exception thrown.");
        }
    }

}
