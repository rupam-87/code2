class Rectangle
{
int l;
int b;
Rectangle(int x, int y)
{
l=x;
b=y;
}
Rectangle()
{
l=0;
b=0;

}
void calc()
{
System.out.println(l*b);

}


public static void main(String[] args)
{
Rectangle r1=new Rectangle();
Rectangle r2=new Rectangle(10,20);
r1.calc();
r2.calc();
r1.l=20;
r1.calc();
r2.calc();
r1=r2;
r1.calc();
r2.calc();
r2.l++;
r1.calc();
r2.calc();
r1.b++;
r1.calc();
r2.calc();
}
}