// Program Name => Student.java
public class Student
{
int sroll;
String sname;
int sage;
String scourse;
public Student(int roll, String name, int age, String course)
{
sroll = roll;
sname = name;
sage = age;
scourse = course;
}
public void setCourse(String course)
{
scourse = course;
}
public void setRollNumber(int roll)
{
sroll = roll;
}
public void setName(String name)
{
sname = name;
}
public String getName()
{
return sname;
}
public int getAge()
{
return sage;
}
public void setAge(int age)
{
sage = age;
}
public String getCourse()
{
return scourse;
}
public int getRollNumber()
{
return sroll;
}
public String toString()
{
String res="Roll Number: " + sroll + "\nStudent Name: " + sname +
"\nStudent Age: " + sage + "\nAdmit Course: " + scourse + "\n";
return res;
}
}
