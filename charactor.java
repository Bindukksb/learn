import java.io.*;
import java.util.*;
import java.lang.*;
public class charactor
{
public static void main(String args[])
{
char c;
Scanner s=new Scanner(System.in);
System.out.println("enter the charactor");
c=s.next().charAt(0);
if((c>='a' && c<='z')|| (c>='A' && c<='Z'))
{
System.out.println("this is an alphabets");
}
else
{
System.out.println("this is not alphabets");
}
}
}
