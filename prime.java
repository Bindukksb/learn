import java.io.*;
import java.util.*;
import java.lang.*;
public class prime
{
public static void main(String args[])
{
int c=0,n;
Scanner s=new Scanner(System.in);
System.out.println("enter the value");
n=s.nextInt();
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
c++;
}}
if(c==2)
{
System.out.println("given is prime");
}
else
{
System.out.println("given is not prime");
}
}
}
