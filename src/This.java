//Using this with a Field
public class Point 
{
    public int x = 0;
    public int y = 0;
        
    //constructor
    public Point(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }
}

//Using this with a Constructor
public class Rectangle 
{
    private int x, y;
    private int width, height;
        
    public Rectangle() 
    {
        this(0, 0, 1, 1);
    }
    public Rectangle(int width, int height)
    {
        this(0, 0, width, height);
    }
    public Rectangle(int x, int y, int width, int height) 
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    ...
}