import java.io.*;
import java.util.*;
import java.lang.*;
public class fib
{
public static void main(String args[])
{
int a=0,b=1,n,i,n1;
Scanner s=new Scanner(System.in);
System.out.println("enter the value");
n=s.nextInt();
System.out.println("value is"+a+b);
for(i=1;i<=n;i++)
{
n1=a+b;
a=b;
b=n1;
System.out.println("value is"+n1);
}
}
}
