import java.util.Scanner;

class Main
{
  public static void main(String[] args)
  { int i,j=0;
    int a[]=new int[10];
    int b[]=new int[10];
    Scanner sc=new Scanner(System.in);
   for(i=0;i<10;i++)
   {
     a[i]=sc.nextInt();
   }
   for(i=9;i>=0;i--)
   {
     b[j]=a[i];
     j++;
   }
   for(i=0;i<10;i++)
   {
     System.out.println(b[i]);
   }

      
  }