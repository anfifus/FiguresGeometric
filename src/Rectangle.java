public class Rectangle extends GeometricFigure {
    private double height;
    private double width;
    private String color;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Rectangle(double height, double width, String color) {
        this.height = height;
        this.width = width;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", color='" + color +
                ", area='"+ calculateArea()+'\''+
                '}'+'\n';
    }

    public double calculateArea(){
        return this.height*this.width;
    }
}
