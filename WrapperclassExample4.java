public class WrapperclassExample4
{
public static void main(String args[])
{
byte b=10;
short s=20;
float f=30.0f;
double d=30.0d;
boolean b2=true;
char c='a';
int i=83;
long l=40;
//autoboxing converting primitives to objects
Byte byteobj=b;
Short shortobj=s;
Float floatobj=f;
Double doubleobj=d;
Boolean boolobj=b2;
Character  charobj=c;
Integer intobj=i;
//unboxing converting objects to primitive datatypes
byte bytevalue= byteobj;
short shortvalue= shortobj;
float  floatvalue= floatobj;
double  doublevalue= doubleobj;
boolean  boolvalue= boolobj;
char  charvalue= charobj;
int intvalue= intobj;
System.out.println("__printing primitive values__");
System.out.println("bytevalue:"+bytevalue);
System.out.println("shortvalue:"+shortvalue);
System.out.println("floatvalue:"+floatvalue);
System.out.println("doublevalue:"+doublevalue);
System.out.println("booleanvalue:"+boolvalue);
System.out.println("charactervalue:"+charvalue);
System.out.println("integervalue:"+intvalue);
}
}


