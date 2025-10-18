import java.util.Scanner;
class first
{
    void getdata()
        {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of the array:");
    for(int i = 0; i < n; i++)
    {
     arr[i] = sc.nextInt();
    }




    System.out.println("These are the elements you are entered:");
    for(int i = 0; i < n; i++)
    {
       
     //   System.out.println("These are the elements you entered:");
     System.out.println(arr[i] + "  ");  
    }

sc.close();
        }
        public static void main(String args[]){
            first r = new first();
            r.getdata();
        }
    
}



Conversation opened. 3 messages. All messages read.

Skip to content
Using Gmail with screen readers
Enable desktop notifications for Gmail.
   OK  No thanks
5 of 5
C++ Internship Task – Student Record Management System
Inbox

IBI - Admin
Oct 15, 2025, 4:19 PM (3 days ago)
to me, chandusabpinjar2006, Atharv, Shivkumar, Darshu

Dear Intern,

We are excited to assign your next task as part of your C++ internship! This task focuses on building a simple Student Record Management System. As a beginner-level project, it is designed to help you practice and enhance your C++ programming skills while implementing basic object-oriented concepts.

Objective
Your objective is to create a Student Record Management System to manage and store student details such as their roll numbers, names, grades, and courses. This project will allow you to practice working with classes, objects, and basic data handling in C++.

Task Description
You will develop a console-based application that allows the institution to store student information. The system should provide basic operations such as adding, viewing, updating, and deleting student records.

Task Steps
1. Create Data Model:
Student class:

Fields: RollNumber, Name, Grade, Course

Methods:

Constructor to initialize student details.

Getter and Setter methods for each field.

2. System Functionality:

Add Student: Collect details like roll number, name, grade, and course from the user.

View Students: Display all students and their details.

Update Student: Allow updating a student’s grade or course.

Delete Student: Remove a student by their roll number.

3. Basic Grade Calculation (Optional):
Implement a simple method to display the student’s status (Pass/Fail) based on their grade.

4. Store Student Data:
Use an array or vector to store student objects in memory (data will not persist after closing the program).

5. Console Interface:
Create a simple menu-based interface using cin and cout to let the user choose from:

1. Add Student  
2. View Students  
3. Update Student  
4. Delete Student  
5. Exit  
6. Error Handling:
Ensure that invalid inputs and non-existing student updates are handled gracefully.

Deliverables
Code:

Upload your C++ code to GitHub.

Use a clean structure with comments explaining each part of the code.

Documentation:

Add a README file explaining:

How to run the program.

What each feature does.

Demo / LinkedIn Post:

Share a screenshot or demo video of your program running.

Write a short LinkedIn post highlighting your learning process and include your GitHub repository link.

Deadline: Please complete this task by Nov 15th, 2025.

Best regards,
IBI Teams


Saloni
Oct 17, 2025, 6:47 AM (1 day ago)
"Thank you"

Saloni <saloniparihar188@gmail.com>
Oct 17, 2025, 6:48 AM (1 day ago)
to IBI

I accept this and  complete before 15th nov 2025.
