import java.util.Scanner;
class CollegeAdmission
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
boolean maths_in_12th;
byte percentage;
boolean unmarried;
boolean fromMp;
System.out.println("You are from maths in 12th");
maths_in_12th = sc.nextBoolean();
System.out.println("Enter your percentage in 12th");
percentage = sc.nextByte();
System.out.println("Are you from MP?");
fromMp=sc.nextBoolean();
System.out.println("Are you unmarried?");
unmarried= sc.nextBoolean();
if(maths_in_12th==true)
{
if(percentage>=80)
{
if(fromMp==true)
{
if(unmarried==true)
{
System.out.println("You are eligible to get admission in engineering college");
}
else
{
System.out.println("You are not eligible");
}
}
}
}
}
}
}
}

