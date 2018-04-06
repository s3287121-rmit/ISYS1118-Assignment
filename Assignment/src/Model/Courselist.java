package Model;

import java.util.ArrayList;

public class Courselist {
private ArrayList<Course> courses;

public Courselist(ArrayList<Course> courses) {
	
	this.courses = courses;
}

public ArrayList<Course> getCourses() {
	return courses;
}

public void setCourses(ArrayList<Course> courses) {
	this.courses = courses;
}

}
