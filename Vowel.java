import  java.util.Scanner;
class Vowel
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
char a = sc.next().charAt(0);
switch(a)
{
case 'a':
case 'A':
case 'e':
case 'E':
case 'i':
case 'I':
case 'o':
case 'O':
case 'u':
case 'U':
System.out.println("Vowel");
break;
default:
System.out.println("Consonent");
}
}
}