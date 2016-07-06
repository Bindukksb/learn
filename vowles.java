import java.io.*;
import java.util.*;
import java.lang.*;
public class vowles
{
public static void main(String args[])
{
char c;
Scanner s=new Scanner(System.in);
System.out.println("enter the charactor");
c=s.next().charAt(0);
if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
{
System.out.println("given charactor is vowles");
}
else
{
System.out.println("given is an constant");
}
}
}
