import java.util.*;
public class Registration{
   private int studentId;
   private int courseId;
      
      public Registration(){
       studentId = 0;
       courseId = 0;
      }
      
   public Registration(int student, int course){
         this.studentId = student;
         this.courseId = course;
      }
      
   public int getStudentId(){
      return this.studentId;
      }
      
  public void setStudentId(int StudentID){
      this.studentId	= StudentID;
      }
      
  public int getCourseID(){
   	return(this.courseId);
   	}
   public void	setCourseID(int CourseID){
   	this.courseId	= CourseID;
   }


}