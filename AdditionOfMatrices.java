import java.util.Scanner;
class AdditionOfMatrices
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter row &column number");
int num = sc.nextInt();
int arr1[][]=new int[num][num];
int arr2[][]=new int[num][num];
int arr3[][]=new int[num][num];
System.out.println("Enter Values of first matrix");
for(int i =0;i<num;i++)
{
for(int j=0;j<num;j++)
{
System.out.println("Enter Array1 ["+i+"] [" +j+"]");
arr1[i][j]=sc.nextInt();
}
}
System.out.println("Enter Values of second matrix");
for(int i =0;i<num;i++)
{
for(int j=0;j<num;j++)
{
System.out.println("Enter Array2 ["+i+"] [" +j+"]");
arr2[i][j]=sc.nextInt();
}
}
for(int i =0;i<num;i++)
{
for(int j=0;j<num;j++)
{
arr3[i][j]=arr1[i][j]+arr2[i][j];
}
}
System.out.println("Values after addition");
for(int i[]:arr3)
{
for(int j:i)
{
System.out.println(j+" ");
}
System.out.println();
}
}
}
