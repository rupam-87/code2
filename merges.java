public class merges
{
public static void main(String[] args)
{
int a[]={1,2,3};
int b[]={4,5,6};
int c[]=new int[6];
int i,k=0,j=0;
for(i=0;i<=2;i++)
{
c[i]=a[k];
k++;
}
for(i=3;i<=5;i++)
{
c[i]=b[j];
j++;
}
for(i=0;i<=5;i++)
{
System.out.println(c[i]);
}



}
}