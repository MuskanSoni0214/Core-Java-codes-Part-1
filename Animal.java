abstract class Animal
{
public abstract void animalSound();
public void sleep()
{
System.out.println("Zzz");
}
}
class Pig extends Animal
{
public void animalSound()
{
System.out.println("The pig says : wee wee");
}
}
class Main
{
public static void main(String[]args)
{
Pig myPig = new Pig();
//Animal ani =new Animal();
//ani.sleep();
//ani.animalSound();
myPig.animalSound();
myPig.sleep();
}
}