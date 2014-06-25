package firstcourse;
public class Car {
    public static void main(String[] args) {
      Arrays arr = new Arrays();
      arr.creatArray(9);
    }
public int speed;
public int model;
public String color;
public String company;
public char c;

    public Car(int speed, int model, String color, String company) {
        this.speed = speed;
        this.model = model;
        this.color = color;
        this.company = company;
    }
    public void dataType()
    {
        System.out.println(" short "+ Short.SIZE+" "+Short.TYPE+" "+Short.MAX_VALUE+" "+Short.MIN_VALUE+" "+ Short.SIZE);
    }
public void getSize()
{
    System.out.println(" char : "+Character.MAX_VALUE);
}
    public void get()
    {
        System.out.println(" speed   | "+this.speed+"\n model   | "+this.model+"\n color   | "+this.color+"\n company | "+this.company);
    }
    public void setSpeed(int s)
    {
        this.speed = s;
    }
    public Car() {
    }
    

   
      

   
    
}
