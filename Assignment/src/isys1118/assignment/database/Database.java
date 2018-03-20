package isys1118.assignment.database;

/**
 * <p>Implements Database-related functions.</p>
 * 
 * <p>Used to access and modify information related to a database.</p>
 * 
 * <p><b>NOTE: all functions in this class are placeholders ONLY!</b> These will
 * be used to properly connect to a database and get / set information at a
 * later date.</p>
 * 
 * @author Luke Larobina
 * @student_id s3287121
 *
 */
public class Database
{
    
    public static int DATABASE_NULL = 0x1001;
    public static int DATABASE_NOT_CONNECTED = 0x1002;
    public static int DATABASE_CONNECTED = 0x1003;
    
    private static Database db;
    
    /**
     * Creates a database connection using a singleton method.
     */
    public static void connectToDatabase()
    {
        if (db != null)
        {
            db = new Database();
        }
        else
        {
            // TODO create DB Error
            throw new Error("Database connection already established. " + 
                    "Cannot create a new connection until previous connection" +
                    " has been terminated.");
        }
    }
    
    /**
     * Tests to see if the current database is connected.
     * @return A code giving information on whether the test succeeds or not.
     * All possible return codes are {@link #DATABASE_NULL},
     * {@link #DATABASE_NOT_CONNECTED}, and {@link #DATABASE_CONNECTED}.
     */
    public static int databaseConnected()
    {
        if (db == null)
        {
            return DATABASE_NULL;
        }
        else if (!db.testConnection())
        {
            return DATABASE_NOT_CONNECTED;
        }
        else
        {
            return DATABASE_CONNECTED;
        }
    }
    
    public static Table getCasualEmployee()
    {
        return null;
    }
    
    // class methods
    
    /**
     * Constructs Database. Empty constructor.
     */
    protected Database() {}
    
    /**
     * Tests to see if the current database is connected.
     * @return true if connected, false if not.
     */
    private boolean testConnection()
    {
        // test result
        return true;
    }
    
}
