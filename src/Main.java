import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	/*1 Crear clase Rectangulo con 3 atributos:
	* alto
	* ancho
	* color
	*
	* Constructor 3 parametros
	*
	* getters setters
	* toString()
	* equals 2 rectangulos son iguales si coinciden los 3 atributos
	* metodo calcular area
	* 2- Crear clase circumferencia con 2 atributos:
	* radio
	* color
	*
	* Constructor radio color
	* getters y setters
	* Calcular Area r^2*3.14
	* 3-Crear en calse Main
	* Arraylist con 8 rectangulos
	* Arraylist con 8 circulos
	* Metodo top5 rectangulos con mayor area
	* Metodo top5 circulos con mayor area
	* 4 Crear clase padre llamada figura geometrica:
	* incluira los atributos comunes de las dos clases color rectangulo y circulo hereden de figuro geometrica sera abstracta y podremos reutilizar metodos y atributos*/

		List<Circle> circles = new ArrayList<>();
		circles = createCircles(circles);
		List<Rectangle> rectangles = new ArrayList<>();
		rectangles = createRectangles(rectangles);




		List<Circle> top5Circles = calculateAreaCircles(circles);
		System.out.println(top5Circles);
		List<Rectangle> top5Rectangles = calculateAreaRectangles(rectangles);
		System.out.println(top5Rectangles);
    }
	private static List<Rectangle> calculateAreaRectangles(List<Rectangle> rectangles) {

		return rectangles.stream().sorted(Comparator.comparing(Rectangle::calculateArea).reversed()).limit(5).toList();

	}

	private static List<Circle> calculateAreaCircles(List<Circle> circles) {

		return circles.stream().sorted(Comparator.comparing(Circle::calculateArea).reversed()).limit(5).toList();

	}

	private static List<Rectangle> createRectangles(List<Rectangle> rectangles) {
		int numberRectangles = howManyGeometricFiguresWant();
		int cont = 0;
		while (cont<numberRectangles){

			rectangles.add(new Rectangle(addHeight(),addWidth(),addColor()));
			cont++;
		}
		return rectangles;
	}

	private static String addColor() {
		System.out.println("Write the color of the figure geometric");
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}

	private static double addWidth() {
		System.out.println("Write the width of the rectangle");
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}

	private static double addHeight() {
		System.out.println("Write the height of the rectangle");
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}

	private static int howManyGeometricFiguresWant() {
		System.out.println("Write the number of geometric figures want");
		Scanner scan = new Scanner(System.in);
		return scan.nextInt();
	}

	private static List<Circle> createCircles(List<Circle> circles) {
		int numberCircles = howManyGeometricFiguresWant();
		int cont = 0;
		while (cont<numberCircles){
			circles.add(new Circle(addRadio(),addColor()));
			cont++;
		}
		return circles;
	}

	private static double addRadio() {
		System.out.println("Write the radius of the circle");
		Scanner scan = new Scanner(System.in);
		return scan.nextDouble();
	}


}
