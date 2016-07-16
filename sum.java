import java.io.*;
import java.util.*;
import java.lang.*;
public class sum
{
public static void main(String args[])
{
int sum=0,n,i;
Scanner s=new Scanner(System.in);
System.out.println("enter the value");
n=s.nextInt();
for(i=0;i<=n;i++)
{
sum=sum+i;
}
System.out.println("number is"+sum);
}
}
