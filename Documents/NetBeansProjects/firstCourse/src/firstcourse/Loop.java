package firstcourse;

public class Loop {
    public static void main(String[] args) {
      Arrays arr = new Arrays();
      arr.creatArray(9);
    }
    public int counter;

    public Loop() {
        this.counter = 2;
    }
    public void doWhile()
    {
        int i = 0;
        do {
            if (this.counter == i)
                System.out.println(i);
            else
                System.out.println(" please try again ");
            i++;
        } while (i<5);
        
    }
    public void loopWhile()
    {
        int i = 1;
        while (i <10) {            
            System.out.print("welcome to while ");
            i++;
        }
 
    }
    public void printValue(int n)
    {
        if (n<=0) 
            return;
        this.counter=n;
        for (int i = this.counter; i >=0; i--)
            System.out.print(i);
    }
    public void infinityLoop()
    {
        int i=1;
        for(;i<=10;){
            
            System.out.print(" Welcome : "+ i);
        
        i++;
        }
    }
    public void printHello()
    {
        for (int i = 10; i >= 1; i--) 
            System.out.println(" Welcome to my first program  "+i);
    }
}

