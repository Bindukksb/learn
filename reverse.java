import java.io.*;
import java.util.*;
import java.lang.*;
public class reverse
{
public static void main(String args[])
{
int n,a=0,n1;
Scanner s=new Scanner(System.in);
System.out.println("enter the value");
n=s.nextInt();
while(n!=0)
{
n1=n % 10;
a=(a*10)+n1;
n/=10;
}
System.out.println("reverse is"+a);
}
}
