package isys1118.assignment.controller;

import isys1118.assignment.database.Database;
import isys1118.assignment.database.Row;
import isys1118.assignment.database.Table;
import isys1118.assignment.error.DatabaseNotConnectedException;
import isys1118.assignment.model.Course;
import isys1118.assignment.model.CourseList;
import isys1118.assignment.user.User;
import isys1118.assignment.view.CourseListView;

public class CourseListController
{
    
    private CourseListView view;
    private CourseList model;
    
    public CourseListController(User user)
    {
        loadData(user);
    }
    
    private void loadData(User user)
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
            model = new CourseList();
            Row[] rows = table.getRowsFromTable("permission=" + user.getPermissions() + "&user_id=" + user.getUsername());
            for (Row row : rows)
            {
                String code = (String) row.get("course_code");
                String name = (String) row.get("course_name");
                Course course = new Course(name, code);
                model.addCourse(course);
            }
            
            // create view
            view = new CourseListView();
            
        }
        catch (DatabaseNotConnectedException e)
        {
            e.printStackTrace();
        }
    }
    
    public void view()
    {
        view.show(model.getCourses());
    }
    
}
