//java program to demonstrate narrow typecasting
import java.io.*;
class Narrowtypecasting
{
public static void main(String args[])
{
double i=100.245;
//narrow type casting
short j=(short)i;
int k=(int)i;
System.out.println("OriginalValue before casting"+i);
System.out.println("After Typecasting to short" +j);
System.out.println("After type casting to int" +k);
}
}
