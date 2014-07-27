
package firstcourse;


public class Car {//PASCAL style
  public int speed_car;//C style
  public int model;
  public String day;
  public String message;
    public Car() {
        this.speed_car = 0;
        this.model = 2000;
        this.message = "Hi";
       
    }

    
    
  public int setSpeed(int s)//CAMEL style
  {
     
      return s;
  }
  
  public void setModel(String m)
  {
      this.day = m;
      switch (this.day)
      {
          case "اس":
              System.out.println("السبت");
              break;
          case "اح":
              System.out.println("الاحد");
              break;
          case "ث":
              System.out.println("الاثنين");
              break;
          case "اث":
              System.out.println("الثلاثاء");
              break;
          case "ار":
              System.out.println("الاربعاء");
              break;
          case "خ":
              System.out.println("الخميس");
              break;
          case "ج":
              System.out.println("الجمعة");
              break;
          
          default :
              System.out.println("Your Input False");
                  
      }
  }
  
  public int getSpeed()
  {
      return this.speed_car;
  }
  public void worningMessage()
  {              
      switch (this.speed_car){ 

	case 0:
	break;

	case 1:
	break;

	default :
            
      }

  }
  
  public void printMessage(String msg)
  {
      this.message = msg;
      int i = 0;
      for ( ; ; ) {
          if (i < 5 )
          System.out.println(this.message); 
          else
              break;
           i++;
      }
      
  }
  public void printArray(int[] val)
  {
      for (int i : val) 
          System.out.println("value : " + i);
  }
  public void printArray(String [] name)
  {
      for (String stg : name) 
          System.out.println("name : " + stg );
  }
  public void printAlphaBet(char [] chr)
  {
      System.out.print("vowel char : " );
      for (char c : chr) 
          System.out.print(c);
      System.out.println("");
  }
}
