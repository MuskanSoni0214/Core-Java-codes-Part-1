class WhileLoop
{
public static void main (String[]args)
{
int a=2;
int i=1;
System.out.println("***********Even***********");
while(a<=100)
{
System.out.println(a);
a=a+2;
}
System.out.println("***********Odd***********");
while(i<=100)
{
System.out.println(i);
i=i+2;
}
System.out.println("***********a a^2 a^3***********");
while(i<=10)
{
System.out.println(i+"   "+(i*i)+"   "+(i*i*i));
i++;
}
}