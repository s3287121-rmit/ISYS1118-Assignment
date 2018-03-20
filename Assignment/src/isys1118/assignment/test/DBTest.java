package isys1118.assignment.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import isys1118.assignment.database.Database;
import isys1118.assignment.database.Row;
import isys1118.assignment.database.Table;

public class DBTest
{
    
    @BeforeClass
    public static void setUp()
    {
        Database.connectToDatabase();
    }

    @Test
    public void testDatabase()
    {
        assertTrue(Database.databaseConnected() == Database.DATABASE_CONNECTED);
    }

    @Test
    public void testGetTable()
    {
        Table testTable = Database.getTestTable();
        assertTrue((testTable instanceof Table) && testTable.getLength() > 0);
    }

    @Test
    public void testSchema()
    {
        Table testTable = Database.getTestTable();
        
        ArrayList<String> names = testTable.getColumnNames();
        StringBuilder sbN = new StringBuilder();
        for (String s : names)
        {
            sbN.append(s + ", ");
        }
        System.out.println(sbN.toString());
        
        ArrayList<String> types = testTable.getColumnTypes();
        StringBuilder sbT = new StringBuilder();
        for (String s : types)
        {
            sbT.append(s + ", ");
        }
        System.out.println(sbT.toString());
        
        assertTrue(names.size() > 0 && types.size() > 0);
    }

    @Test
    public void testRowAdd()
    {
        Table testTable = Database.getTestTable();
        Row testRow = testTable.createNewRow();
        try
        {
            testRow.setData(new String[] {
                    "Hello",
                    "my",
                    "baby",
                    "you",
                    "cute"
            });
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < testRow.getLength(); i++)
            {
                sb.append(testRow.get(i) + ", ");
            }
            System.out.println(sb.toString());
        }
        catch (Error e)
        {
            fail();
        }
        assertTrue(testRow != null && testRow.getLength() == Table.TEST_TABLE_LENGTH);
    }

    @Test
    public void testRowChange()
    {
        Table testTable = Database.getTestTable();
        Row testRow = testTable.getRowFromTable(null);
        String testColName = testTable.getColumnNames().get(0);
        try
        {
            testRow.setColumn(testColName, "Hello, gorgeous!");
            StringBuilder sbS = new StringBuilder();
            for (int i = 0; i < testRow.getLength(); i++)
            {
                sbS.append(testRow.get(i) + ", ");
            }
            System.out.println(sbS.toString());
            
            testRow.setData(new String[] {
                    "Hello",
                    "my",
                    "baby",
                    "you",
                    "cute"
            });
            StringBuilder sbD = new StringBuilder();
            for (int i = 0; i < testRow.getLength(); i++)
            {
                sbD.append(testRow.get(i) + ", ");
            }
            System.out.println(sbD.toString());
        }
        catch (Error e)
        {
            fail();
        }
    }

    @Test
    public void testRowBadData()
    {
        Table testTable = Database.getTestTable();
        Row testRow = testTable.getRowFromTable(null);
        String testColName = testTable.getColumnNames().get(0);
        try
        {
            testRow.setColumn(testColName, 333);
            fail();
        }
        catch (Error e)
        {
            // if an error was thrown, we did good!
            System.out.println("Can't put int into varchar!");
        }
    }

}
