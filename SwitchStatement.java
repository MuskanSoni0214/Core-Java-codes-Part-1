import java.util.Scanner;
class SwitchStatement
{
static int a;
static byte b;
static short c;
static long d;
static float e;
static double f;
static char g;
static boolean h;
static String i;
public static void main (String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter what you want to perform: 1.Arithemetic operation  2.Logical operation 3.Relational operation 4.Conditional operation 5.Assignment operation 6.Bitwise operation 7.Increment/Decrement operation 8.Short-Hand operation 9.Keywords 10.Features of java 11.Rules of identifier 12.greatest 13.lowest 14.valid syntax to write main function 15. Default values of fundamental data types");
String operation = sc.nextLine();
switch(operation)
{
case "Arithemetic operation":
System.out.println("Enter 2 operands ");
double a = sc.nextDouble();
double b = sc.nextDouble();
System.out.println("Enter what operation you want to perform: '+' '-' '*' '/' '%'");
char c = sc.next().charAt(0);
if(c=='+')
{
System.out.println(a+b);
}
else if(c=='-')
{
System.out.println(a-b);
}
else if(c=='*')
{
System.out.println(a*b);
}
else if(c=='%')
{
System.out.println(a%b);
}
else
{
System.out.println("Invalid Input");
}
break;
case "Logical operation":
double a1 = sc.nextDouble();
double b1 = sc.nextDouble();
System.out.println("Enter what operation you want to perform: '&&' '||' '!' ");
String c1 = sc.next();
if(c1=="&&")
{
System.out.println((a1>b1)&&(b1>a1));
}
else if(c1=="||")
{
System.out.println((a1>b1)||(b1>a1));
}
else if(c1=="!")
{
System.out.println(!(a1>b1)&&!(b1>a1));
}
else
{
System.out.println("Invalid Input");
}
break;
default:
System.out.println("Int : "+a+"  Byte : "+b+" Short : "+c+" Long : "+d+" Float : "+e+" Double : "+f+" Char : "+g+" Boolean : "+h+" String : "+i);
}
}
}

