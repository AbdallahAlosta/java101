
package firstcourse;

public class Calc {
  public int sum(int a, int b)  
  {
      return a + b;
  }
   public int tst(int allCar)  
  {
      return  allCar;
  }
   public int min(int a, int b)  
  {
      return a - b;
  }
   
    public int mul(int a, int b)  
  {
      return a * b;
  }
    
     public int div(int a, int b)  
  {
      if (b == 0) 
          return 0;
      return a / b;
  }
     
     public void dec(int val)
     {
         int i = val;
         while (i >= 1) { 
            System.out.print(i + " ");
        i--;
         }
         System.out.println("");
     }
     
     public int [] mulNumberArray(int a[], int b[])
     {
         if (a.length != b.length) 
             return null;
         int j[] = new int[a.length];
         for (int i = 0; i < b.length; i++)
            j[i] = a[i] * b[i];
        return j;
     }
}
