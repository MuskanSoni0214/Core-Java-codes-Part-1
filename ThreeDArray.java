import java.util.Scanner;
class ThreeDArray
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter index number");
int index = sc.nextInt();
System.out.println("Enter row number");
int row = sc.nextInt();
System.out.println("Enter coloumn number");
int col = sc.nextInt();
int arr[][][]=new int[index][row][col];
for(int i=0;i<index;i++)
{
for(int j=0;j<row;j++)
{
for(int k=0;k<col;k++)
{
System.out.println("Enter ["+i+"] [" +j+"] ["+k+"]");
arr[i][j][k]=sc.nextInt();
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
}