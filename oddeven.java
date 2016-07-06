import java.io.*;
import java.util.*;
import java.lang.*;
public class oddeven
{
public static void main(String args[])
{
int a;
Scanner s=new Scanner(System.in);
System.out.println("enter the value");
a=s.nextInt();
if(a%2==0)
{
System.out.println("given value is even");
}
else
{
System.out.println("given value is odd");
}
}
}
