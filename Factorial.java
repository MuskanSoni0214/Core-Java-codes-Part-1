import java.util.Scanner;
class Factorial 
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your number");
int n = sc.nextInt();
int j=1;
for(int i=1; i<=n;i++)
{
j=n*(n-1);
}
System.out.println(j);
}
}