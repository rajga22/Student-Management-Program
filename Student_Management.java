// Program Name => Student_Management.java
import java.util.ArrayList;
import java.util.Scanner;
public class Student_Management_System
{
ArrayList<Student> stList;
Scanner sc;
public Student_Management_System()
{
stList = new ArrayList<>();
sc = new Scanner(System.in);
}
public void addStudent_Record()
{
int rl,ag;
String nm,co;
System.out.print("Enter Roll Number of Student=>");
rl = Integer.parseInt(sc.nextLine());
System.out.print("Enter Student Name=>");
nm = sc.nextLine();
System.out.print("Enter Student Age=>");
ag = Integer.parseInt(sc.nextLine());
System.out.print("Enter Student Admit Course=>");
co = sc.nextLine();
Student student = new Student(rl, nm, ag, co);
stList.add(student);
System.out.println("Student record added successfully!\n");
}
public void delStudent_Record(int rNumber)
{
boolean found = false;
for (Student student : stList)
{
if (student.getRollNumber() == rNumber)
{
stList.remove(student);
found = true;
System.out.println("Student with roll number " + rNumber + " deleted successfully!\n");
break;
}
}
if (!found) {
System.out.println("Student with roll number " + rNumber + " not found!\n");
}
}
public void dispStudents_Records()
{
if (stList.isEmpty())
{
System.out.println("\n\nNo students found!\n");
}
else
{
System.out.println(" List of Students:");
System.out.println("----------------------------------------");
for (Student student : stList)
{
System.out.println(student);
}
}
}
public void updateStudent(int rollNumber)
{
boolean found = false;
for (Student student : stList) {
if (student.getRollNumber() == rollNumber) {
System.out.print("Enter new Name=>");
String name = sc.nextLine();
student.setName(name);
System.out.print("Enter new Age=>");
int age = Integer.parseInt(sc.nextLine());
student.setAge(age);
System.out.print("Enter new Course=>");
String course = sc.nextLine();
student.setCourse(course);
found = true;
System.out.println("Student details updated successfully!\n");
break;
}
}
if (!found) {
System.out.println("Student with roll number " + rollNumber + " not found!\n");
}
}
public static void main(String[] args)
{
Student_Management_System ob = new Student_Management_System();
Scanner scn = new Scanner(System.in);
int ch,rdelete;
do
{
System.out.println("===== Student Management System Menu ===== ");
System.out.println("1. Add New Student");
System.out.println("2. Delete existent Student");
System.out.println("3. Display All Students details");
System.out.println("4. Update existent Student Record");
System.out.println("5. End Program");
System.out.print("Enter your choice=>");
ch = Integer.parseInt(scn.nextLine());
switch (ch)
{
case 1:
ob.addStudent_Record();
break;
case 2:
System.out.print("Enter Roll Number to delete=>");
rdelete = Integer.parseInt(scn.nextLine());
ob.delStudent_Record(rdelete);
break;
case 3:
ob.dispStudents_Records();
break;
case 4:
System.out.print("Enter Roll Number to update=>");
int rollToUpdate = Integer.parseInt(scn.nextLine());
ob.updateStudent(rollToUpdate);
break;
case 5:
System.out.println("Program End.....");
break;
default:
System.out.println("Invalid choice! ");
}
} while (ch != 5);
}
}