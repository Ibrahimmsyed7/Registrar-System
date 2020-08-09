import java.util.*;
public class Student{
	 private String studentName;
	 private int studentId;
	 
	 public Student(){
      this.studentName = "";
      studentId = 0;
    }
    
    public Student(String name, int id){
      this.studentName = name;
      this.studentId = id;
    }
	
   public String getStudentName(){
   	return(this.studentName);
   	}
   	
   public void	setStudentName(String UserName){
   	this.studentName = UserName;
   	}
   	
   public int getStudentID(){
   	return(this.studentId);
   	}
   public void	setStudentID(int StudentID){
   	this.studentId	= StudentID;
   }



}