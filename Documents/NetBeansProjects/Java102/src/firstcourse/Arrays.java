package firstcourse;

public class Arrays {
    public int val;
    public char chr;

    public Arrays() {
        this.val = 0;
        this.chr = 'f'; 
       
    }
    public  void nn()
    {
        System.out.println("kkk");
    }
    public void bolen(boolean b)
    {
        if(b)
            System.out.println(" yes ");
        else
         System.out.println(" no ");
    }
    public String ch(char c)
    {
        
        if(true)
            return "Female";
        else
        return "Male";
    }
    public void printArry(int []z)
    {
        for (int i : z) 
            System.out.println(i);
    }
    public int [] creatArray(int size)
    {
        int c[] = new int[size];
        return c;
    }
    public void inputArray(int lgt)
    {
        this.val = lgt;
        int z[] = {5,8,9,4,1,7
        
        };
        System.out.println(z[2]);
        
    }
    
    
}
