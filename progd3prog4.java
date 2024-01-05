class Student
{
private String college_name;
private String college_address;
private  int ay_start;
private  int ay_end;
private  int rollno;
private int id;
private String phoneno;
private String aadharno;
public void setCollege_name(String college_name)
{this.college_name=college_name;}
public String getCollege_name(){return college_name;}
public void setCollege_address(String college_address)
{this.college_address=college_address;}
public String getCollege_address(){return college_address;}
public void setAy_start(int ay_start)
{this.ay_start=ay_start;}
public int getAy_start(){return ay_start;}
public void setAy_end(int ay_end)
{this.ay_end=ay_end;}
public int getAy_end(){return ay_end;}
public void setRollno(int rollno)
{this.rollno=rollno;}
public int getRollno(){return rollno;}
public void setId(int id)
{this.id=id;}
public int getId(){return id;}
public void setPhoneno(String phoneno)
{this.phoneno=phoneno;}
public String getPhoneno(){return phoneno;}
public void setAadharno(String aadharno)
{this.aadharno=aadharno;}
public String getAadharno(){return aadharno;}
}
class BCA2
{
public static void main(String args[])
{
Student ob=new Student();
ob.setCollege_name("Mother Teresa Institute of engineerig and technology");
ob.setCollege_address("Melumoi,Gangavaram");
ob.setAy_start(2022);
ob.setAy_end(2026);
ob.setRollno(544);
ob.setId(27522);
ob.setPhoneno("9052487342");
ob.setAadharno("868686868");
System.out.println("name:"+ob.getCollege_name());
System.out.println("address:"+ob.getCollege_address());
System.out.println("ay_start:"+ob.getAy_start());
System.out.println("ay_end:"+ob.getAy_end());
System.out.println("rollno:"+ob.getRollno());
System.out.println("id:"+ob.getId());
System.out.println("phoneno:"+ob.getPhoneno());
System.out.println("aadharno:"+ob.getAadharno());
}
}



