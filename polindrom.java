import java.io.*;
import java.util.*;
import java.lang.*;
public class polindrom
{
public static void main(String args[])
{
int n,a=0,n1,temp;
Scanner s=new Scanner(System.in);
System.out.println("enter the value");
n=s.nextInt();
temp=n;
while(n!=0)
{
n1=n % 10;
a=(a*10)+n1;
n/=10;
}
if(a==temp)
{
System.out.println("given number is polindrom");
}
else
{
System.out.println("given number is not polindrom");
}
}
}
