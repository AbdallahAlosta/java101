
package firstcourse;

public class Text {
    public String value;

    public Text(String s) {
        this.value = s;
    }
    
    public int [][] createArray(int r, int c)
    {
        int [][] value = new int[r][c];
        return value;
    }
    public void printArray(int [] [] ary)
    {
        for (int i = 0; i < ary.length; i++) {
            int[] is = ary[i];
            for (int j = 0; j < is.length; j++) {
                int k = is[j];
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }
    public void printText(String [] [] txt)
    {
        for (int i = 0; i < txt.length; i++) {
            String [] is = txt[i];
            for (int j = 0; j < is.length; j++) {
                String k = is[j];
                System.out.print(k + " ");
            }
            System.out.println("");
        }
    }
    
    public void printSite(String ste)
    {
        for (int i = 0; i < ste.length(); i++)             
        System.out.print(ste.charAt(i));
        System.out.println("");
    }
    //تحويل النص الي مصفوفة من الحروف
    public char [] strArray()
    {
        char [] txt = new char[this.value.length()];
        for (int i = 0; i < txt.length; i++) 
           txt[i] = this.value.charAt(i);
          return txt;
       
    }
}
