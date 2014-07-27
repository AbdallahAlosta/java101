
package java102;

import java.util.Scanner;

public class SimpleCalc {
    
    private int x;
    private int y;
    private Scanner scn;

    public SimpleCalc() {
        this.scn = new Scanner(System.in);
        System.out.print("please Enter X :");
        this.x = this.scn.nextInt();
        System.out.print("please Enter Y :");
        this.y = this.scn.nextInt();
    }

    public SimpleCalc(int a, int b) {
        this.x = a;
        this.y = b;
    }
    
    public int add()
    {
        return this.x + this.y;
    }
    
    public  int sub()
    {
        return this.x - this.y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
}
