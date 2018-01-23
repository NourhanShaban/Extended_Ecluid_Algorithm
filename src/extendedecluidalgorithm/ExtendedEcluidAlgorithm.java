
package extendedecluidalgorithm;

import static java.lang.Math.floor;
import java.util.Scanner;

public class ExtendedEcluidAlgorithm {

         public static long GCD(long y,long x)
       {
      
         long output;
            long smallNumber;
            long largeNumber;
            if(x<y){
                smallNumber=x;
                largeNumber=y;
            }
            else{
                smallNumber=y;
                largeNumber=x;
            }
            
            if(x==0){
                output=y;
            }
            else if(y==0){
                output=x;
            }
            else{
                output=GCD(smallNumber,largeNumber%smallNumber);
            }
            
            return output;
      
        }
       
         public static String extended(long M,long N)
         {
                
        String output;
       long A1=1;
        long A2=0;
     long A3=M;
        long B1=0;
     long B2=1;
      long B3=N;
       long Q=0;
      long T1,T2,T3;
      long additive=0;
        long addrev=-N;
        while(addrev<0)
        {
            addrev=addrev+M;
            
        }
        while(true)
        {
           if(B3==0)
           { A3=GCD(M,N);
               output="IMPOSSIBLE";
           break;}
           if(B3==1)
           {
               B3=GCD(M,N);
               if(B2<0)
               {
                   B2=(B2+M);
                   B2=B2%M;
               }
               
              output=addrev+" "+B2;
               break;
           }
           Q=A3/B3;
           T1=A1-(Q*B1);
           T2=A2-(Q*B2);
           T3=A3-(Q*B3);
           A1=B1;
            A2=B2;
             A3=B3;
             B1=T1;
            B2=T2;
              B3=T3;
       
        }
        return output;
        
        
         }
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
      long M=s1.nextLong();
      long N=s1.nextLong();
        System.out.println(extended(M,N));
     
     
        
 
    }
    
}