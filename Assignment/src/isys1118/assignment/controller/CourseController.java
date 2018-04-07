package isys1118.assignment.controller;

import isys1118.assignment.database.Database;
import isys1118.assignment.database.Row;
import isys1118.assignment.database.Table;
import isys1118.assignment.error.DatabaseNotConnectedException;
import isys1118.assignment.model.Course;
import isys1118.assignment.view.CourseView;

public class CourseController
{
    
    private CourseView view;
    private Course model;
    
    public CourseController(String courseCode)
    {
        loadData(courseCode);
    }
    
    private void loadData(String courseCode)
    {
        try
        {
            // get table, check for DB connection
            Table table;
            if (Database.databaseConnected() == Database.DATABASE_CONNECTED)
            {
                table = Database.getTestTable();
            }
            else
            {
                throw new DatabaseNotConnectedException();
            }
            
            // create model
            Row row = table.getRowFromTable("course_code=" + courseCode);
            String code = (String) row.get("course_code");
            String name = (String) row.get("course_name");
            model = new Course(name, code);
            
            // create view
            view = new CourseView();
            
        }
        catch (DatabaseNotConnectedException e)
        {
            e.printStackTrace();
        }
    }
    
    public void view()
    {
        view.show(model.getCourseClone());
    }
    
}
