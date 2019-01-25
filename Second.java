class First
{
int b=20;
}
class Second
{
int a=10;
public static void main(String args[])
{
Second s;
s=new Second();
System.out.println(s.a);
First f;
f=new First();
System.out.println(f.b);
}
}