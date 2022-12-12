public class Polygon implements Shape
{
    private int radius;
    private int sides;
    private String color;
    private int perimeter;
    private int sideLength;

    /**
     * Constructor for objects of class Circle
     */
    public Polygon(int radius, int sides, int sideLength, String color)
    {
        this.sides = sides;
        this.radius = radius;
        this.color = color;
        this.sideLength = sideLength;
    }

    /**
     * Get the perimeter
     * 
     * @return     returns the perimeter of the circle
     */
    public double getPerimeter()
    {
        if (sides == 1) {
            return 2 * Math.PI * this.radius;
        }
        perimeter = this.sideLength * this.sides; 
        return this.sideLength * this.sides;
    }

    /**
     * Get the area
     * 
     * @return     returns the area of the circle
     */
    public double getArea()
    {
        if (sides == 1){
            return Math.PI * this.radius * this.radius;
        } else{
            getPerimeter(); 
            double a = (this.sideLength / (2 * Math.tan(Math.toRadians(180/this.sides))));
            return ((this.perimeter * a)/2);
        }
    }

    /**
     * Get the color
     * 
     * @return     returns the color of the circle
     */
    public String getColor()
    {
        return this.color;
    }

}