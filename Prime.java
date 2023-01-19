import java.util.Scanner;
import java.lang.Math;
class Prime
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your number");
int n = sc.nextInt();
boolean k = false;
if(n==0||n==1)
System.out.println("Not a prime number");
else
{
for(int i=2;i<Math.sqrt(n);i++)
{
if(n%i==0)
{
k=true;
break;
}
}
}

if(k==false)
System.out.println("Not a prime number");
else
System.out.println("Prime number");
}
}