public class PascalTriangle{
  public static void triangle(){

      int i,j,n=4;
      int a[][]=new int[n][n];
       
 
  for(i=0;i<=n;i++)
  {  
       for(j=0;j<=i;j++)
       {
           if(j==0 ||i==j)
           {
              a[i][j]=1; 
           }
  
           else
           {
               a[i][j]=(a[i-1][j-1]) +(a[i-1][j]);
              
           }
          System.out.print(a[i][j]);
       }
                   System.out.print("\n");

  }
  }
}
