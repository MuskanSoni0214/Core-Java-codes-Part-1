import java.util.Scanner;
class Array
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
byte[]a={1,2,3};
byte[]a1=new byte[3];
short[]b={4,5,6};
short[]b1=new short[3];
int[]c={7,8,9};
int[]c1=new int[3];
long[]d={10,11,12};
long[]d1=new long[3];
float[]e={2.14f,14.2f,214.02f};
float[]e1=new float[3];
double[]f={142.22,124.44,44.22};
double[]f1=new double[3];
char[]g={'m','u','s'};
char[]g1=new char[3];
String[]h={"Muskan","Soni","Smiley"};
String[]h1=new String[3];

for(int i=0;i<3;i++)
{
System.out.println("Enter "+i+" byte value");
a1[i]=sc.nextByte();
System.out.println("Enter "+i+" short value");
b1[i]=sc.nextShort();
System.out.println("Enter "+i+" int value");
c1[i]=sc.nextInt();
System.out.println("Enter "+i+" long value");
d1[i]=sc.nextLong();
System.out.println("Enter "+i+" float value");
e1[i]=sc.nextFloat();
System.out.println("Enter "+i+" double value");
f1[i]=sc.nextDouble();
System.out.println("Enter "+i+" char value");
g1[i]=sc.next().charAt(0);
System.out.println("Enter "+i+" String value");
h1[i]=sc.next();
}

System.out.println("***********Compile Time Values************");
System.out.println();
for(int i=0;i<3;i++)
{
System.out.println(i+" byte value: "+a[i]);
System.out.println(i+" short value: "+b[i]);
System.out.println(i+" int value: "+c[i]);
System.out.println(i+" long value: "+d[i]);
System.out.println(i+" float value: "+e[i]);
System.out.println(i+" double value: "+f[i]);
System.out.println(i+" char value: "+g[i]);
System.out.println(i+" String value: "+h[i]);
}
System.out.println("***********Run Time Values************");
System.out.println();
for(int i=0;i<3;i++)
{
System.out.println(i+" byte value: "+a1[i]);
System.out.println(i+" short value: "+b1[i]);
System.out.println(i+" int value: "+c1[i]);
System.out.println(i+" long value: "+d1[i]);
System.out.println(i+" float value: "+e1[i]);
System.out.println(i+" double value: "+f1[i]);
System.out.println(i+" char value: "+g1[i]);
System.out.println(i+" String value: "+h1[i]);
}
}
}