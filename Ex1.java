public class Ex1 {
  public static void main (String[] args) {
     int n=5;
     double t;
     double sqrt=n/2;
     double sq=n*n;
     do
     {
            t=sqrt;
            sqrt=(t+(n/t))/2;
     }
     while((t-sqrt)!=0);
  System.out.println("the square root of "+ n +" is: "+sqrt);
  System.out.println("the square of "+ n +" is: "+sq);
     }
 }