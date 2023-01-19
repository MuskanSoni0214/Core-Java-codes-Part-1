import java.util.Scanner;

class AlphabetPattern {
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Enter the alphabet you want the the pattern of");
char alphabet = sc.next().charAt(0);
switch(alphabet)
{
case 'a':
int n=5;
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
if(i==1&&j==3||i==2&&j==2||i==2&&j==4||i==3||i==4&&j==1||i==4&&j==5||i==5&&j==1||i==5&&j==5)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
break;

case 'b':
for(int i=1;i<=6;i++)
{
for(int j=1;j<=4;j++)
{
if(i==1&&j==1||i==1&&j==2||i==1&&j==3||i==2&&j==1||i==2&&j==4||i==3&&j==1||i==3&&j==2||i==3&&j==3||i==4&&j==1||i==4&&j==2||i==4&&j==3||i==5&&j==1||i==5&&j==4||i==6&&j==1||i==6&&j==2||i==6&&j==3)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
break;

case 'c':
for(int i=1;i<=6;i++)
{
for(int j=1;j<=4;j++)
{
if(i==1&&j==2||i==1&&j==3||i==1&&j==4||i==2&&j==1||i==3&&j==1||i==4&&j==1||i==5&&j==2||i==5&&j==3||i==5&&j==4)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
break;

case 'd':
for(int i=1;i<=5;i++)
{
for(int j=1;j<=4;j++)
{
if(i==1&&j==1||i==1&&j==2||i==1&&j==3||i==2&&j==1||i==2&&j==4||i==3&&j==1||i==3&&j==4||i==4&&j==1||i==4&&j==4||i==5&&j==1||i==5&&j==2||i==5&&j==3)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
break;

case 'e':
for(int i=1;i<=5;i++)
{
for(int j=1;j<=4;j++)
{
if(i==1&&j==1||i==1&&j==2||i==1&&j==3||i==1&&j==4||i==2&&j==1||i==3&&j==1||i==3&&j==2||i==3&&j==3||i==3&&j==4||i==4&&j==1||i==5&&j==1||i==5&&j==2||i==5&&j==3||i==5&&j==4)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
break;

case 'f':
for(int i=1;i<=5;i++)
{
for(int j=1;j<=4;j++)
{
if(i==1&&j==1||i==1&&j==2||i==1&&j==3||i==1&&j==4||i==2&&j==1||i==3&&j==1||i==3&&j==2||i==3&&j==3||i==3&&j==4||i==4&&j==1||i==5&&j==1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
break;

case 'g':
for(int i=1;i<=5;i++)
{
for(int j=1;j<=4;j++)
{
if(i==1&&j==1||i==1&&j==2||i==1&&j==3||i==1&&j==4||i==2&&j==1||i==3&&j==1||i==3&&j==2||i==3&&j==3||i==3&&j==4||i==4&&j==1||i==4&&j==4||i==5&&j==1||i==5&&j==2||i==5&&j==3||i==5&&j==4)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
break;

case 'h':
for(int i=1;i<=5;i++)
{
for(int j=1;j<=4;j++)
{
if(i==1&&j==1||i==1&&j==4||i==2&&j==1||i==2&&j==4||i==3&&j==1||i==3&&j==2||i==3&&j==3||i==3&&j==4||i==4&&j==1||i==4&&j==4||i==5&&j==1||i==5&&j==4)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
break;

case 'i':
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
if(i==1&&j==1||i==1&&j==2||i==1&&j==3||i==1&&j==4||i==1&&j==5||i==2&&j==3||i==3&&j==3||i==4&&j==3||i==5&&j==1||i==5&&j==2||i==5&&j==3||i==5&&j==4||i==5&&j==5)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
break;

case 'j':
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
if(i==1&&j==1||i==1&&j==2||i==1&&j==3||i==1&&j==4||i==1&&j==5||i==2&&j==3||i==3&&j==3||i==4&&j==1||i==4&&j==3||i==5&&j==2||i==5&&j==3)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
break;

case 'k':
for(int i=1;i<=6;i++)
{
for(int j=1;j<=4;j++)
{
if(i==1&&j==1||i==1&&j==4||i==2&&j==1||i==2&&j==3||i==3&&j==1||i==3&&j==2||i==4&&j==1||i==4&&j==2||i==5&&j==1||i==5&&j==3||i==6&&j==1||i==6&&j==4)
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
break;

case 'l':
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
if(i==1&&j==1||i==2&&j==1||i==3&&j==1||i==4&&j==1||i==5&&j==1||i==5&&j==2||i==5&&j==3||i==5&&j==4||i==5&&j==5)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
break;

case'm':
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
if(i==2&&j==2||i==2&&j==4||i==3&&j==3||j==1||j==5)
{
System.out.print("*");
}
else{
System.out.print(" ");
}
}
System.out.println("");
}
break;

case 'n':
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
if(i==1&&j==1||i==1&&j==5||i==2&&j==1||i==2&&j==5||i==3&&j==1||i==3&&j==5||i==4&&j==1||i==4&&j==5||i==5&&j==1||i==5&&j==5||i==2&&j==2||i==3&&j==3||i==4&&j==4)
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
break;

case 'o':
for(int i=1;i<=5;i++)
{
for(int j=1;j<=4;j++)
{
if(i==1&&j==2||i==1&&j==3||i==2&&j==1||i==2&&j==4||i==3&&j==1||i==3&&j==4||i==4&&j==1||i==4&&j==4||i==5&&j==2||i==5&&j==3)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
break;

case 'p':
for(int i=1;i<=5;i++)
{
for(int j=1;j<=4;j++)
{
if(i==1&&j==1||i==1&&j==2||i==1&&j==4||i==1&&j==3||i==2&&j==4||i==2&&j==1||i==3&&j==1||i==3&&j==2||i==3&&j==3||i==3&&j==4||i==4&&j==1||i==5&&j==1)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
break;

case 'q':
  for(int i=1;i<=7;i++)
  {
    for(int j=1;j<=97;j++)
    {
      if((i==1&&j>=3&&j<=5)||(i==2&&j==2)||(i==2&&j==6)||(i==3&&j==1)||(i==3&&j==7)||(i==4&j==1)||
      (i==4&&j==7)||(i==5&&j==1)||(i==5&&j==5)||(i==5&&j==7)||
      (i==6&&j==2)||(i==6&&j==6)||(i==7&&j>=3&&j<=5)||(i==7&&j==7))
      {
        System.out.print("* ");
      } 
      else 
      System.out.print("  ");
    }
    System.out.print("\n");
  }
  break;

case 'r':
   for(int i=1;i<=7;i++)
  {
    for(int j=1;j<=97;j++)
    {
      if(i>=1&&i<=7&&j==1||i==1&&j>=1&&j<=5||i==2&&j==6||i==3&&j==6||
      i==4&&j>=1&&j<=5||i==5&&j==3||i==6&&j==4||i==7&&j==5)
      {
        System.out.print("* ");
      } 
      else 
      System.out.print("  ");
    }
    System.out.print("\n");
  }
  break;

   case 's':
    for(int i=1;i<=7;i++)
  {
    for(int j=1;j<=97;j++)
    {
      if(i==1&&j>=2&&j<=7||i==2&&j==1||i==3&&j==1||i==4&&j>=2&&j<=6||i==5&&j==7||i==6&&j==7||i==7&&j>=1&&j<=6)
      {
        System.out.print("* ");
      } 
      else 
      System.out.print("  ");
    }
    System.out.print("\n");
  }
  break;

  case 't':
    for(int i=1;i<=7;i++)
  {
    for(int j=1;j<=97;j++)
    {
      if(i==1&&j>=1&&j<=7||i>=1&&i<=7&&j==4)
      {
        System.out.print("* ");
      } 
      else 
      System.out.print("  ");
    }
    System.out.print("\n");
  }
  break;

case 'u':
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
if(i==1&&j==1||i==1&&j==5||i==2&&j==1||i==2&&j==5||i==3&&j==1||i==3&&j==5||i==4&&j==1||i==4&&j==5||i==5&&j==2||i==5&&j==4||i==5&&j==3)
{
System.out.print("*");
}
else
System.out.print(" ");
}
System.out.println();
}
break;

case 'v':
for(int i=1;i<=3;i++)
{
for(int j=1;j<=5;j++)
{
if(i==1&&j==1||i==1&&j==5||i==2&&j==2||i==2&&j==4||i==3&&j==3)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
break;

case 'w':
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
if(i==1&&j==1||i==1&&j==5||i==2&&j==1||i==2&&j==5||i==2&&j==1||i==3&&j==3||i==2&&j==5||i==4&&j==4||i==4&&j==2||i==3&&j==1||i==3&&j==5||i==4&&j==1||i==4&&j==5||i==5&&j==1||i==5&&j==5)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
break;

case 'x':
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
if(i==1&&j==1||i==1&&j==5||i==2&&j==2||i==2&&j==4||i==3&&j==3||i==4&&j==2||i==4&&j==4||i==5&&j==1||i==5&&j==5)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
break;

case 'y':
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
if(i==1&&j==1||i==1&&j==5||i==2&&j==2||i==2&&j==4||i==3&&j==3||i==4&&j==3||i==5&&j==3)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
break;

case 'z':
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
if(i==1&&j==1||i==1&&j==2||i==1&&j==3||i==1&&j==4||i==1&&j==5||i==2&&j==4||i==3&&j==3||i==4&&j==2||i==5&&j==1||i==5&&j==2||i==5&&j==3||i==5&&j==4||i==5&&j==5)
{
System.out.print("*");
}
else
{
System.out.print(" ");
}
}
System.out.println();
}
break;

default:
System.out.println("INVALID INPUT");

}
}
}