import java.util.*;
class Ar
{
public static void main(String[]k)
{
Scanner sc = new Scanner(System.in);
/*int arr[][]=new int [2][];
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
arr[i][j]=sc.nextInt();
}
}*/

/*int arr[][]={{1,2,3},
             {4},
             {7,8}};*/


/*for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr[i].length;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}*/

/*for(int i=0;i<arr.length;i++)
{
System.out.println(Arrays.toString(arr[i]));
}*/
//ArrayList
ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//initialization
for(int i=0;i<3;i++)
{
list.add(new ArrayList<>());
}
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
list.get(i).add(sc.nextInt());
}
}
System.out.println(list);

}
}