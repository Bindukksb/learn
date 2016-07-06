import java.io.*;
import java.lang.*;
import java.util.*;
class leap
{
public static void main(String args[])
{
int a;
Scanner year=new Scanner(System.in);
System.out.println("enter year");
a=year.nextInt();
if(a%4==0)
{
System.out.println("this is leap year");
}
else{
System.out.println("not an leap year");
}
}
}
