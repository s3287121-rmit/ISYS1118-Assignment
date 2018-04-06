package isys1118.assignment.controller;

import isys1118.assignment.database.Database;
import isys1118.assignment.database.Row;
import isys1118.assignment.database.Table;
import isys1118.assignment.error.DatabaseNotConnectedException;
import isys1118.assignment.model.Course;
import isys1118.assignment.model.Task;
import isys1118.assignment.model.TaskList;
import isys1118.assignment.user.User;
import isys1118.assignment.view.TaskListView;

public class TaskListController
{
    private TaskListView view;
    private TaskList model;
    
    public TaskListController(User user)
    {
        loadData(user);
    }
    
    private void loadData(User user)
    {
        try
        {
            // get table, check for DB connection
            Table tableTask;
            Table tableCourse;
            if (Database.databaseConnected() != Database.DATABASE_CONNECTED)
            {
                tableTask = Database.getTestTable();
                tableCourse = Database.getTestTable();
            }
            else
            {
                throw new DatabaseNotConnectedException();
            }
            
            // create model
            model = new TaskList();
            Row[] rows = tableTask.getRowsFromTable("permission=" + user.getPermissions() + "&user_id=" + user.getUsername());
            for (Row rowTask : rows)
            {
                String room = (String) rowTask.get("room");
                String taskType = (String) rowTask.get("task_type");
                String day = (String) rowTask.get("day");
                String time = (String) rowTask.get("time");
                String courseCode = (String) rowTask.get("course_code");
                Row rowCourse = tableCourse.getRowFromTable("course_code=" + courseCode);
                String code = (String) rowCourse.get("course_code");
                String name = (String) rowCourse.get("course_name");
                Course connectedCourse = new Course(name, code);
                Task t = new Task(connectedCourse, room, taskType, day, time);
                model.addTask(t);
            }
            
            // create view
            view = new TaskListView();
            
        }
        catch (DatabaseNotConnectedException e)
        {
            e.printStackTrace();
        }
    }
    
    public void view()
    {
        view.show();
    }
}
