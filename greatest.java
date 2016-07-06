import java.io.*;
import java.lang.*;
import java.util.*;
class greatest
{
public static void main(String args[])
{
int a,b,c;

System.out.println("Enter a,b,c value");
Scanner j=new Scanner(System.in);
a=j.nextInt();
b=j.nextInt();
c=j.nextInt();
if((a>b)&&(a>c))
{
System.out.println("A is greatest number"+a);
}
else if((b>c)&&(b>a))
{
System.out.println("B is greatest number"+b);
}
else
{
System.out.println("C is greatest number"+c);
}
}
}
