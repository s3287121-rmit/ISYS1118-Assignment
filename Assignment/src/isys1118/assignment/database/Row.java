package isys1118.assignment.database;

import java.util.ArrayList;

/**
 * <p>Represents a row in a table in the database.<p>
 * @author Luke Larobina
 * @student_id s3287121
 *
 */
public class Row
{

    private Table fromTable;
    private int length;
    protected Object[] data;
    
    private Row(Table parent, Object[] data)
    {
        fromTable = parent;
        length = fromTable.numColumns;
        setData(data);
    }
    
    public void setData(Object[] data)
    {
        if (data.length != length)
        {
            // TODO create DB Error
            throw new Error("Attempting to add data of different length.");
        }
        for (int i = 0; i < this.data.length; i++)
        {
            this.data[i] = data[i];
        }
    }
    
}
