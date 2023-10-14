package shape;
import color.Color;

public abstract class Shape {
    private Color color = Color.TRANSPARENT;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getArea() {
        return (0.0);
    }

    public double getPerimeter() {
        return (0.0);
    }


    public void move(double moveX, double moveY) {}

    public void draw() { }

}
