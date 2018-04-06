package Read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class ReadTest {
	    /**    
	     * @param file      *  course.txt
	     *  1,Database
	     *  2,Course
	     *  3,Time Table
	     *  4,Task
	     * @return      */
	    public static String txt2String(File file){
	        StringBuilder result = new StringBuilder();
	        try{
	            BufferedReader br = new BufferedReader(new FileReader(file));
	            String s = null;
	            while((s = br.readLine())!=null){
	                result.append(System.lineSeparator()+s);
	            }
	            br.close();    
	        }catch(Exception e){
	            e.printStackTrace();
	        }
	        return result.toString();
	    }
	    
	    public static void main(String[] args){
	        File file = new File("D:/course.txt");//where we store the txt file
	        System.out.println(txt2String(file));
	    }
	}

