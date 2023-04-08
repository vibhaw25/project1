import java.util.Scanner;
/*this is my documentation*/
class AddTwoNum{
   public static void main(String args[]){
      int x,y,i,j,sum,sub;
    Scanner sc=new Scanner(System.in);
     System.out.println("choose 1 for sum and 0 for substract");
      char k=sc.next().charAt(0);
     if(k==1)
      {
     System.out.println("Eneter the first number");
       x=sc.nextInt();
     System.out.println("Eneter the Second number");
      y=sc.nextInt();
       sum=sum(x,y);
       System.out.println("The sum of two nos x and y is:"+sum);

      }else{
      System.out.println("Eneter the first number");
       i=sc.nextInt();
     System.out.println("Eneter the Second number");
      j=sc.nextInt();
      sub=sub(i,j);
      System.out.println("The sub of two nos i and j is:"+sub);
      }
   }
  public static int sum(int a,int b)
  {
    int sum=a+b;
    return sum;
  }
 public static int sub(int l,int m)
 { 
   int sub =(l-m);
    return sub;
  }
 } 
 