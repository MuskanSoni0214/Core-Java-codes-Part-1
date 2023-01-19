class Encapsulated
{
private  long acc_no;
private String name,email;
private float amount;
public long getAcc_no()
{
return acc_no;
}
public long setAcc_no(long acc_no)
{
this.acc_no=acc_no;
}
public String getName()
{
return name;
}
public String setName(String name)
{
this.name = name;
}
public String getEmail()
{
return email;
}
public String setEmail(String email)
{
this.email=email;
}
public float getAmount()
{
return amount;
}
public float setAmount(Float amount)
{
this.amount=amount;
}
}
public class TestEncapsulated
{
public static void main(String[]args)
{
Encapsulated en = new Encapsulated();
en.setName("Muskan");
en.setEmail("muskan@gmail.com");
en.setAmount(50000f);
en.setAcc_no(51);
System.out.println(en.getName()+" "+en.getEmail()+" "+en.getAmount()+" "+en.getAcc_no());
}
}