import java.util.Scanner;
class GST
{
public static void main(String[]args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter gst number");
byte gstNo=sc.nextByte();
switch(gstNo)
{
case 1:
System.out.println("Jammu & Kashmir");
break;
case 2:
System.out.println("Himachal Pradesh");
break;
case 3:
System.out.println("Punjab");
break;
case 4:
System.out.println("Chandigarh");
break;
case 5:
System.out.println("Uttarakhand");
break;
case 6:
System.out.println("Haryana");
break;
case 7:
System.out.println("Delhi");
break;
case 8:
System.out.println("Rajasthan");
break;
default:
System.out.println("Invalid input");
}
}
}