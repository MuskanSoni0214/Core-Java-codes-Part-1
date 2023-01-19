class SPattern
{
public static void main(String [] args)
{
int row =10;
int col =5;
for(int i=1;i<=row;i++)
{
for(int j=1;j<=col;j++)
{
if(i==1&&j==2||i==1&&j==3||i==1&&j==4||i==2&&j==1||i==2&&j==5||i==3&&j==1||i==3&&j==5||i==4&&j==2||i==5&&j==3||i==6&&j==4||i==7&&j==5||i==8&&j==1||i==8&&j==5||i==9&&j==1||i==9&&j==5||i==10&&j==2||i==10&&j==3||i==10&&j==4)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println("");
}
}
}