class SimpleInt
{
double p,r,t,si,tarnt;
void set(double x1,double x2,double x3)
{
p=x1;
r=x2;
t=x3;
}
void SimpleInt()
{
si=(p*r*t)/100;
tarnt=p+si;
}
void disp()
{
System.out.println("____________");
System.out.println("It is Result");
System.out.println("____________");
System.out.println("Principle amount="+p);
System.out.println("Rate of interest ="+r);
System.out.println("Simple integer amount ="+si);
System.out.println("Total amount="+tarnt);
}
}
class Si
{
public static void main(String[]args)
{
if(args.length!=3)
{
System.out.println("Please enter three value on cmd prompt");
}
else
{
Double x1=Double.parseDouble(args[0]);
Double x2=Double.parseDouble(args[1]);
Double x3=Double.parseDouble(args[2]);
SimpleInt s=new SimpleInt();
s.set(x1,x2,x3);
s.SimpleInt();
s.disp();
}
}
}










