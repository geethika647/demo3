class Student
{
private String student_name;
private String student_address;
private  String rollno;
private String branch;
private int sec;
public void setStudent_name(String student_name)
{this.student_name=student_name;}
public String getStudent_name(){return student_name;}
public void setStudent_address(String student_address)
{this.student_address=student_address;}
public String getStudent_address(){return student_address;}
public void setRollno(String rollno)
{this.rollno=rollno;}
public String getRollno(){return rollno;}
public void setBranch(String branch)
{this.branch=branch;}
public String getBranch(){return branch;}
public void setSec(int Sec)
{this.sec=sec;}
public int getSec(){return sec;}
}
class BCA2
{
public static void main(String args[])
{
Student ob=new Student();
ob.setStudent_name("K.Geethika");
ob.setStudent_address("Palamaner");
ob.setRollno("22HR1A0544");
ob.setBranch("CSE II year");
ob.setSec(0);
System.out.println("Name:"+ob.getStudent_name());
System.out.println("Address:"+ob.getStudent_address());
System.out.println("Rollno:"+ob.getRollno());
System.out.println("Branch:"+ob.getBranch());
System.out.println("Sec:"+ob.getSec());
}
}

