package homework4;

public class Circle implements Shape{
    public double radius;

    @Override
    public double square() {
        return  Math.PI * (radius * radius);
    }

    public  Circle(double radius) {
        this.radius = radius;
    }
}
