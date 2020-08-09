import java.util.*;
public class Courses{
   private String courseName;
   private int courseId;
   
    public Courses(){
      this.courseName = "";
      courseId = 0;
    }
    
    public Courses(String name, int id){
      this.courseName = name;
      this.courseId = id;
    }
	
   public String getCourseName(){
   	return(this.courseName);
   	}
   	
   public void	setCourseName(String UserCourse){
   	this.courseName = UserCourse;
   	}
   	
   public int getCourseID(){
   	return(this.courseId);
   	}
   public void	setCourseID(int CourseID){
   	this.courseId	= CourseID;
   }




}