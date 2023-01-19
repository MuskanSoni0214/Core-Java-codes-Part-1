import java.util.Scanner;
class Name
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
char a,b,c,d,e,f;
System.out.println("Enter Name including 6 alphabets character by character");
a=sc.next().charAt(0);
b=sc.next().charAt(0);
c=sc.next().charAt(0);
d=sc.next().charAt(0);
e=sc.next().charAt(0);
f=sc.next().charAt(0);
System.out.println("Your Entered name is:");
System.out.println(a+""+b+""+c+""+d+""+e+""+f);
}
}

