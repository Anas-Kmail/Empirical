/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empirical;


public class Empirical {
    
    public static long fact(int n){
        
         long f=1;
        for(int i=1;i<=n;i++)
        f=f*i;
        
        return f;
        
        
    };
    
      public static long fact2(int n){
        
         
        if(n==1)
            return 1;
        return n*fact(n-1);
        
        
    };
    
    

    
    public static void main(String[] args) {
        
        long startTime = System.nanoTime();
        int x=0;
        System.out.println(fact2(x));
        
                long endTime = System.nanoTime();
                long elapsedTime = endTime - startTime;
                
                System.out.println(elapsedTime);
        
    }
    
}
