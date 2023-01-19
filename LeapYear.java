import java.util.Scanner;
class LeapYear
{
public static void main (String [] args)
{
int year;
Scanner sc = new Scanner(System.in);
System.out.println("Enter year to check whether it is leap year or not");
year=sc.nextInt();
if(((year%4==0)&&(year%100!=0))||(year%400==0))
{
System.out.println("The given year is  a leap year");
}
else
System.out.println("The given year is not a leap year");
}
}