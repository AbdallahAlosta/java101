
package firstcourse;

public class Book {
    public String name;
    public String author;
    
    public int last_page;
    public int pub_date;
    public int current_page;
    
    public boolean is_open;

    public Book(String name, String author, int last_page, int pub_date) {
        this.name = name;
        this.author = author;
        this.last_page = last_page;
        this.pub_date = pub_date;
        this.is_open = false;
    }
    
    
    public void openBook()
    {
        if (is_open) 
            System.out.println("is open");
        else
            this.is_open =true;
    }
    
    public void info()
    {
        if (is_open) 
        {
          System.out.println("book name :" + this.name);
        System.out.println("author name :" + this.author);
        System.out.println("publish date :" + this.pub_date);
        System.out.println("pages number :" + this.last_page);
        System.out.println("------------------------------------------------------------------");  
        }else
            System.out.println("please! \n \topen " + this.name.toUpperCase() +" book before" );
        
    }
    
    public boolean moveToPage(int n)
    {
        if (!is_open)
           return false;
        if (n > this.last_page || n < 1) 
           return false;
        this.current_page = n;
        return true ;
       
    }
    
    public void closeBook()
    {
        if (!is_open)
            System.out.println("is close");
        else
            this.is_open = false;
        
    }
}
