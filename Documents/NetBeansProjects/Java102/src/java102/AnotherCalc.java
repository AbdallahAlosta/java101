
package java102;

public class AnotherCalc extends SimpleCalc{

    public AnotherCalc() {
        super();
    }
    public AnotherCalc(int a, int b){
        super(a, b);
    }
    public int mul()
    {
        return this.getX() * this.getY();
    }
    public int div()
    {
        if (this.getY() == 0) 
            return 0;
        return this.getX() / this.getY();
    }
    
}
