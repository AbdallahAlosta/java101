
package firstcourse;

public class First {
  
    public int [] createArray(int size)
    {
        int [] ary = new int[size];
        return ary;
    }
    
    public int [] [] createMultiArray(int r, int c)
    {
        int [][] ary = new int[r][c];
        return ary;
    }
    public void printArray(int [] ary)
    {
        for (int i : ary) 
            System.out.println(i);
    }
    
    public void printTwoArray(int [] [] ary)
    {
        for (int[] is : ary) {
            for (int i : is) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
}
