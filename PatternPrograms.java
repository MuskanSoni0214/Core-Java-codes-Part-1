import java.util.*;
class PatternPrograms
{
public static void main(String[]args)
{
pattern4(5);
}
static void pattern1(int n)
{
for(int i=1;i<=2*n-1;i++)
{
int totalColsInRow = i>n?2*n-i:i;
for(int j=1;j<=totalColsInRow;j++)
{
System.out.print(" *");
}
System.out.println();
}
}


static void pattern2(int n)
{
for(int i=1;i<=n;i++)
{
for(int s=0;s<n-i-1;s++)
{
System.out.print(" ");
}
for(int j=i;j>=1;j--)
{
System.out.print(j);
}
for(int j=2;j<=i;j++)
{
System.out.print(j);
}
System.out.println();
}


}
static void pattern3(int n)
{
for(int i=1;i<=2*n-1;i++)
{
int c = i>n?2*n-i:i;
for(int s=0;s<n-c;s++)
{
System.out.print(" ");
}
for(int j=c;j>=1;j--)
{
System.out.print(j);
}
for(int j=2;j<=c;j++)
{
System.out.print(j);
}
System.out.println();
}
}

static void pattern4(int n)
{
n=2*n;
for(int i=0;i<=n;i++)
{
for(int j=0;j<=n;j++)
{
int c =Math.min(Math.min(i,j),Math.min(n-i,n-j));
System.out.print(c+" ");
}
System.out.println();
}
}

}