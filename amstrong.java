import java.io.*;
import java.util.*;
import java.lang.*;
public class amstrong
{
public static void main(String args[])
{
int rev=0,rem,n,temp;
Scanner s=new Scanner(System.in);
System.out.println("enter the value");
n=s.nextInt();
temp=n;
while(n!=0)
{
rem=n%10;
rev=rev+(rem*rem*rem);
n=n/10;
}
System.out.println("number is"+rev);
if(rev==temp)
{
System.out.println("given number is amstrong");
}
else
{
System.out.println("given number is not amstrong");
}
}
}
