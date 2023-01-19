import java.util.Scanner;
class MethodArray
{

static Scanner sc = new Scanner(System.in);

static void OneDArray()
{
System.out.println("Enter number of elements in Array");
int n = sc.nextInt();
int arr[]=new int[n];
for(int i=0;i<n;i++)
{
System.out.println("Enter ["+i+"] element of array" );
arr[i] = sc.nextInt();
}
System.out.println("****Values****");
for(int j:arr)
{
System.out.println(j);
}
}


static void TwoDArray()
{
System.out.println("Enter row & column number");
int num = sc.nextInt();
int arr[][]=new int[num][num];
for(int i=0;i<num;i++)
{
for(int j=0;j<num;j++)
{
System.out.println("Enter ["+i+"] [" +j+"]");
arr[i][j] = sc.nextInt();
}
}
System.out.println("****Values****");
for(int j[]:arr)
{
for(int k:j)
{
System.out.println(k);
}
}
}



static void ThreeDArray()
{
System.out.println("Enter index number");
int index = sc.nextInt();
System.out.println("Enter row & column number");
int number = sc.nextInt();
int arr[][][]=new int[index][number][number];
for(int i=0;i<index;i++)
{
for(int j=0;j<number;j++)
{
for(int k=0;k<number;k++)
{
System.out.println("Enter ["+i+"] [" +j+"] ["+k+"]");
arr[i][j][k] = sc.nextInt();
}
}
}
System.out.println("****Values****");
for(int i[][]:arr)
{
for(int j[]:i)
{
for(int k:j)
{
System.out.println(k);
}
}
}
}

public static void main(String[]args)
{
System.out.println("Enter in which array you want to store integer value: 1-D Array, 2-D Array OR 3-D Array");
String s = sc.nextLine();
switch(s)
{
case "1-D Array":
OneDArray();
break;

case "2-D Array":
TwoDArray();
break;


case "3-D Array":
ThreeDArray();
break;


default:
System.out.println("Invalid Input!");
}
}
}