
class ApplicationsOfBitwise
{
public static void main(String [] args)
{
int a=2;
System.out.println("******Odd & Even*******");
if((a&1)==0)
System.out.println("Even");
else
System.out.println("Odd");
System.out.println("******Power of 2*******");
int ans = a&(a-1);
if(a>0&&ans==0)
System.out.println("Power of 2");
else
System.out.println("Not a power of 2");
System.out.println("******Swapping*******");
int b=3;
a^=b;
b^=a;
a^=b;
System.out.println("Value of a: "+a);
System.out.println("Value of b: "+b);
}
}

