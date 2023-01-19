import java.util.Scanner;
class Table
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number you want table of");
int a= sc.nextInt();
for(int i=1;i<=10;i++)
{
System.out.printf("%d X %d = %d\n",a,i,a*i);
}
}
}