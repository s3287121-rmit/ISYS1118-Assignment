package isys1118.assignment.view;

import java.util.List;

import isys1118.assignment.model.TimeTableTask;

public class TimeTableView
{
    
    public void show(List<TimeTableTask> tasks)
    {
        // TODO show all items
        System.out.println("Tasks for Timetable");
        for (TimeTableTask t : tasks)
        {
            System.out.printf(
                    "coursecode = %s, room = %s, type = %s, day = %s, time = %s, colour = %s\n",
                    t.getCourse().getCourseCode(),
                    t.getRoom(),
                    t.getTaskType(),
                    t.getDay(),
                    t.getTime(),
                    t.getColour());
        }
        System.out.println();
    }
    
}
