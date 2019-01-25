public class pallidrome
{
public static void main(String[] args)
{
int n=121,rem,rev=0,temp;
while(n!=0)
{
rem=n%10;
rev=rev*10+rem;
n=n/10;
}
n=121;
System.out.println(rev);
if(rev==n)
{
System.out.println("pallidrome");
}
else
{
System.out.println("not pallidrome");
}


}
}