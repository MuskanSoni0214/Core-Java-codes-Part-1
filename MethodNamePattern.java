class MethodNamePattern
{

static void m()
{
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
}

static void u()
{
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
}


static void s()
{
int row =10;
int col =5;
for(int i=1;i<=row;i++)
{
for(int j=1;j<=col;j++)
{
if(i==1&&j==2||i==1&&j==3||i==1&&j==4||i==2&&j==1||i==2&&j==5||i==3&&j==1||i==3&&j==5||i==4&&j==2||i==5&&j==3||i==6&&j==4||i==7&&j==5||i==8&&j==1||i==8&&j==5||i==9&&j==1||i==9&&j==5||i==10&&j==2||i==10&&j==3||i==10&&j==4)
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
}


static void k()
{
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
}


static void a()
{
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
}


static void n()
{
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
}


public static void main(String[]args)
{
m();
System.out.println();
u();
System.out.println();
s();
System.out.println();
k();
System.out.println();
a();
System.out.println();
n();
}
}