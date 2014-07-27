
package firstcourse;

public class Bottle {
  public float size;
  public String content;
  public String company;
  public int start_date,end_date;
  public boolean is_open;

    public Bottle(float sze,String cnt, String cpy, int str_d, int end_d) {
        this.size = sze;
        this.content = cnt;
        this.company = cpy;
        this.start_date = str_d;
        this.end_date = end_d;
        this.is_open = false;
    }
  
    public void printInfo()
    {
        System.out.println("      size : " + this.size);
        System.out.println("   content : " + this.content);
        System.out.println("   company : " + this.company);
        System.out.println("start date : " + this.start_date);
        System.out.println("  end date : " + this.end_date);
    }
  
    public void openBottle()
    {
        if (is_open) 
            System.out.println("is open");
        else
            this.is_open = true;
    }
    
    public float flowWater(float s)
    {
        if (is_open) 
        {   
        if (this.size < 0) 
            return 0;
        else
            return (this.size - s);
        }else
            return 1;
            
    }
    
}
