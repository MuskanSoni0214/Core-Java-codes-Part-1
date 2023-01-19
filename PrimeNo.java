import java.util.Scanner;
class PrimeNo
{
public static void main (String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your number");
int a = sc.nextInt();
int m=0;
for(int i=2;i<=a/2;i++)
{
if(a%i==0)
{
m=1;
}
break;
}
if(m==0)
{
System.out.println("This is prime No");
}
else
{
System.out.println("This is not prime No");
}
}
}