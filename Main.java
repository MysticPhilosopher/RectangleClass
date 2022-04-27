public class Main
{
    public static void main(String[]args)
    {
       Rectangle box = new Rectangle();
       
       //Calling the getLength() method from Rectangle.java passing 10 as an argument.
       box.setLength(10);

       //Calling the objects getWidth() method, passing 20 as an argument.
       box.setWidth(20);
       
       //Displaying the objects length and width.

       System.out.println("The box's length is  " + box.getLength());
       System.out.println("The box's width is " + box.getWidth());
    
       //Printing out the object for getArea()
       System.out.println("The boxes area is  " + box.getArea());
    }
}