import java.util.Scanner;
class Factor
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your number");
int a = sc.nextInt();
for(int i=1;i<=a/2;i++)
{
if(a%i==0)
{
System.out.println(i+" is factor of "+a);
}
}
}
}