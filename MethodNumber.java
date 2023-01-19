import java.util.Scanner;
import java.lang.Math;

class MethodNumber
{
static Scanner sc = new Scanner(System.in);

static void armstrong(int n)
{
int x=n,y=n,count=0,sum=0,product,temp;
while(x>0)
{
count++;
x=x/10;
}
while(y>0)
{
product=1;
temp=y%10;
y=y/10;
for(int i=1;i<=count;i++)
{
product*=temp;
}
sum+=product;
}
if(sum==n)
System.out.println("It is an armstrong number");
else
System.out.println("It is not an armstrong number");
}

static void strong(int n)
{
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

static void prime(int n)
{
int count=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
count++;
}
}
if(count==2)
System.out.println("Prime number");
else
System.out.println("Not a Prime number");
}

static void leapYear(int year)
{
if(((year%4==0)&&(year%100!=0))||(year%400==0))
{
System.out.println("The given year is  a leap year");
}
else
System.out.println("The given year is not a leap year");
}

static void perfect(int n)
{
int sum=0;
for(int i=1;i<=n/2;i++)
{
if(n%i==0)
sum+=i;
}
if(sum==n)
System.out.println(n+" is a perfect number");
else
System.out.println(n+" is not a perfect number");
}

static void factorial(int n)
{
int j=1;
for(int i=1; i<=n;i++)
{
j=n*(n-1);
}
System.out.println(j);
}

static void fibonacci(int n)
{
int a=0;
int b=1;
int c=0;
for(int i=0;i<n;i++)
{
    System.out.println(a);
 c=a+b;
 a=b;
 b=c;
}
}

static void factor(int n)
{
for(int i=1;i<=n/2;i++)
{
if(n%i==0)
System.out.println(i+" is factor of "+n);
}
}

static void lcm(int n, int m)
{
int l = (n>m)?n:m;
while(true)
{
if(l%n==0 && l%m==0)
{
System.out.printf("The lcm of %d and %d is %d",n,m,l);
}
++l;
}
}

static void hcf(int n, int m)
{
int h=0;
for(int i=1;i<=n||i<=m;i++)
{
if(n%i==0 && m%i==0)
h=i;
}
System.out.println("HCF of given two numbers is :: "+h);
}

public static void main(String[]args)
{
System.out.println("Enter What do you want to find : Armstrong number, Strong number, Prime number, Leap year, Perfect number, Factorial number, Fibonacci number, Factor, LCM, HCF");
String s = sc.nextLine();
switch(s)
{ 
case "Armstrong number":
System.out.println("Enter your Number");
int n = sc.nextInt();
armstrong(n);
break;

case "Strong number":
System.out.println("Enter your Number");
int n1 = sc.nextInt();
strong(n1);

break;
case "Prime number":
System.out.println("Enter your Number");
int n2 = sc.nextInt();
prime(n2);
break;

case "Leap year":
System.out.println("Enter year to check whether it is leap year or not");
int year=sc.nextInt();
leapYear(year);
break;

case "Perfect number":
System.out.println("Enter your number");
int p=sc.nextInt();
perfect(p);
break;

case "Factorial number":
System.out.println("Enter your number");
int n3 = sc.nextInt();
factorial(n3);
break;

case "Fibonacci number":
System.out.println("Enter your limit");
int n4 = sc.nextInt();
fibonacci(n4);
break;

case "Factor":
System.out.println("Enter your number");
int a = sc.nextInt();
factor(a);
break;

case "LCM":
System.out.println("Enter two interger numbers");
int n5 = sc.nextInt();
int m = sc.nextInt();
lcm(n5,m);
break;

case "HCF":
System.out.println("Enter two interger numbers");
int n6 = sc.nextInt();
int m1 = sc.nextInt();
hcf(n6,m1);
break;

default:
System.out.println("INVALID INPUT!");
}
}
}