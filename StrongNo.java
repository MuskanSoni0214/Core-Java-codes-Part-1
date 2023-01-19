import java.util.Scanner;
class StrongNo
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your number");
int n=sc.nextInt();
int temp=n;
int r,sum=0;
while(n>0)
{
r=n%10;
int f=1;
for(int i=1;i<=r;i++)
{
f*=i;
}
sum+=f;
n=n/10;
}
if(temp==sum)
System.out.println("It is a Strong number");
else
System.out.println("It is not a Strong number");
}
}
