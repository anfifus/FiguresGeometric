public class Circle extends GeometricFigure {
    private double radio;
    private String color;

    @Override
    public String toString() {
        return "Circle{" +
                "radio=" + radio +
                ", color='" + color  +
                ", area='"+ calculateArea()+'\''+
                '}'+ '\n';
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    public Circle(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double calculateArea(){
        return (Math.pow(this.radio,2)*3.14);
    }
}
