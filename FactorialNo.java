import java.util.Scanner;
class FactorialNo
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your number");
int n = sc.nextInt();
int a=1;
for(int i=1;i<=n;i++)
{
a*=i;
}
System.out.println(a);
}
}
