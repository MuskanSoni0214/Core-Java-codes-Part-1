import java.util.Scanner;
class NestedSwitch
{
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st number");
int a=sc .nextInt();
System.out.println("Enter 2nd number");
int b=sc .nextInt();
switch(a)
{
case 1:
switch(b)
{
case 2:
System.out.println("Muskan");
break;
case 3:
System.out.println("Smiley");
break;
default:
System.out.println("Mussu");
}
break;
case 4:
System.out.println("Dorachan");
default:
System.out.println(":) Hii");
}
}
}