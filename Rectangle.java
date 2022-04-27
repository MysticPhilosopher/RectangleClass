//Writing Code for Class. 
public class Rectangle
{
/*
Making the code for the fields. 
*/
private double length;
private double width; 

    /*\
    The setLength method stores a value in the length field.
    len The value to store in length. 
    */
    public void setLength(double len)
    {
        length = len; 
    }
    
    // Making the setWidth() method.
    public void setWidth(double w)
    {
        width = w;
    }

   //Method for getLength()
    public double getLength()
   {
       return length; 
   }
   //Method for getWidth() 
   public double getWidth()
   {
       return width; 
   }
   //Method the getArea().
   public double getArea()
   {
       return length * width; 
   }
}
