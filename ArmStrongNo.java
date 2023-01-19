import java.util.Scanner;
class ArmStrongNo
{
public static void main (String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your Number");
int n = sc.nextInt();
int temp = n;
int r,sum=0;
while(n>0)
{
r=n%10;
n=n/10;
sum+=r*r*r;
}
if(temp==sum)
{
System.out.println("Its an Armstrong number");
}
else
{
System.out.println("Its not an Armstrong number");
}
}
}