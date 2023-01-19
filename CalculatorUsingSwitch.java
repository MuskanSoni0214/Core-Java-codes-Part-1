import java.util.Scanner;
class CalculatorUsingSwitch
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your first operand");
double a = sc.nextInt();
System.out.println("Enter your second operand");
double b = sc.nextInt();
System.out.println("Enter your operator");
char c = sc.next().charAt(0);
switch(c)
{
case '+':
System.out.println(a+b);
break;
case '-':
System.out.println(a-b);
break;
case '*':
System.out.println(a*b);
break;
case '%':
System.out.println(a%b);
break;
case '/':
if(b!=0)
{
System.out.println(a/b);
}
break;
default:
System.out.println("Invalid Input");
}
}
}