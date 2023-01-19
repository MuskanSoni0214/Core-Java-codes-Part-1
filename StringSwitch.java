import java.util.Scanner;
class StringSwitch
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter your State");
String state = sc.nextLine();
switch(state)
{
case "MP":
System.out.println("Bhopal");
break;
case "Bihar":
System.out.println("Patna");
break;
case "Goa":
System.out.println("Panaji");
break;
case "Gujarat":
System.out.println("Gandhinagar");
break;
case "Andhra Pradesh":
System.out.println("Amaravati");
break;
case "Arunachal Pradesh":
System.out.println("Itanagar");
break;
case "Haryana":
System.out.println("Chandigarh");
break;
case "Himachal Pradesh":
System.out.println("Shimla");
break;
case "Jharkhand":
System.out.println("Ranchi");
break;
case "Karnataka":
System.out.println("Bengaluru");
break;
default:
System.out.println("Invalid input");
}
}
}