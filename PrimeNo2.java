import java.util.Scanner;
class PrimeNo2
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your number");
int a = sc.nextInt();
boolean b = false;
if(a==0||a==1)
{
System.out.println("This is not a Prime number");
}
else
{
for(int i=2;i<a/2;i++)
{
if(a%i==0)
{
System.out.println("This is not a Prime number");
b=true;
break;
}
}
}
if(b==false)
System.out.println("This is a Prime number");
}
}