import java.util.*;
public class main{
   public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   ArrayList <Student> studentList = new ArrayList<Student>();
   ArrayList <Courses> coursesList = new ArrayList<Courses>();
   ArrayList <Registration> registrationList = new ArrayList<Registration>();
   
   System.out.println("Please Choose an option:");
   System.out.println("1. Add a student to the list of students.");
   System.out.println("2. Add a coursse to the list of courses.");
   System.out.println("3. Add a registration to the list of registrations.");
   System.out.println("4. Print all students that are registered for a course.");
   System.out.println("5. Print all the courses a student is registered for.");
   System.out.println("6. Delete a registration.");
   System.out.println("7. Exit");
   int option = input.nextInt();
   while (option > 7 || option < 1){
         System.out.println("Invalid Input!");
         System.out.println("Please Choose an option:");
         System.out.println("1. Add a student to the list of students.");
         System.out.println("2. Add a coursse to the list of courses.");
         System.out.println("3. Add a registration to the list of registrations.");
         System.out.println("4. Print all students that are registered for a course.");
         System.out.println("5. Print all the courses a student is registered for.");
         System.out.println("6. Delete a registration.");
         System.out.println("7. Exit");

      option = input.nextInt();
   }
   while(option != 7){
      switch(option){
         case 1:
            System.out.println("Please enter student ID:");
            int studentIDInput = input.nextInt();
            boolean inList = false;
            for (Student s: studentList){
               if(studentIDInput == s.getStudentID()){
                  System.out.println("Error");
                  inList = true;
                  break;
               }
            }
            if(inList == false){
               System.out.println("Please enter student name:");
               String studentName = input.next();
               Student newStudent = new Student(studentName, studentIDInput);
               studentList.add(newStudent);
            }
            break;
         case 2:
            System.out.println("Please enter course ID:");
            int courseIDInput = input.nextInt();
            boolean inCourseList = false;
            for (Courses s: coursesList){
               if(courseIDInput == s.getCourseID()){
                  System.out.println("Error");
                  inCourseList = true;
                  break;
               }
            }
            if(inCourseList == false){
               System.out.println("Please enter course name:");
               String courseName = input.next();
               Courses newCourse = new Courses(courseName, courseIDInput);
               coursesList.add(newCourse);
            }

            break;
         case 3: 
            System.out.println("Please enter student ID:");
            studentIDInput = input.nextInt();
            System.out.println("Please enter course ID:");
            courseIDInput = input.nextInt();
             for (Courses c: coursesList){
               for (Student s: studentList){
                   if(courseIDInput == c.getCourseID() && studentIDInput == s.getStudentID()){
                     Registration newRegistration = new Registration(studentIDInput, courseIDInput);
                     registrationList.add(newRegistration);
                     System.out.println("Succesful Registration");
                    }
                     }
                        }

            break;
         case 4:
            System.out.println("Please enter course ID:");
            courseIDInput = input.nextInt();
            boolean inListCourse = false;
            for(Courses c: coursesList){
               if(c.getCourseID() == courseIDInput){
                  inListCourse = true;
                  for(Registration r: registrationList){
                     if(r.getCourseID() == courseIDInput){
                        for(Student s: studentList){
                           if(s.getStudentID() == r.getStudentId()){
                              System.out.println(s.getStudentName());
                           }
                        }
                     }
                  }
               }
            }
            if(!inListCourse){
               System.out.println("Error");
            }
         
            break;
         case 5:
            System.out.println("Please enter student ID:");
             studentIDInput = input.nextInt();
             boolean inListStudent = false;
             for(Student s : studentList){
               if(s.getStudentID() == studentIDInput){
                  inListStudent = true;
                  for(Registration r: registrationList){
                     if(r.getStudentId() == s.getStudentID()){
                        for(Courses c: coursesList){
                           if(r.getCourseID() == c.getCourseID()){
                              System.out.println(c.getCourseName());
                           }
                        }
                     }
                  }
               }
             }
              
            break;
         case 6:
         System.out.println("Please enter the student ID:");
         studentIDInput = input.nextInt();
         System.out.println("Please enter the course ID:");
         courseIDInput = input.nextInt();
         for (Registration r : registrationList){
            if (r.getStudentId() == studentIDInput && r.getCourseID() == courseIDInput){
               registrationList.remove(r);
               }
            }
            break;
      }
      System.out.println("Please Choose an option:");
      System.out.println("1. Add a student to the list of students.");
      System.out.println("2. Add a coursse to the list of courses.");
      System.out.println("3. Add a registration to the list of registrations.");
      System.out.println("4. Print all students that are registered for a course.");
      System.out.println("5. Print all the courses a student is registered for.");
      System.out.println("6. Delete a registration.");
      System.out.println("7. Exit");
      option = input.nextInt();
      while (option > 7 || option < 1){
         System.err.println("Invalid Input!");
         System.out.println();
         option = input.nextInt();
      }
   }
}}