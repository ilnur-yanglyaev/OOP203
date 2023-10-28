import color.Color;
import service.ShapesService;
import service.impl.ShapesServiceImpl;
import shape.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
      //first part

// центр круга
Point point = new Point(2,1);

// круг с центром point и радиусом 1
Circle circle = new Circle(point, 1);

// отображение данных о круге
circle.draw();

// замена цвета круга с дефолтного TRANSPARENT на RED
circle.setColor(Color.RED);

// изменение центра круга
circle.setPoint(new Point(2, 2));

// перемещение центра круга по оси ОХ и OY на единицу
circle.move(1, 1);
// отображение данных о круге
circle.draw();


//TODO вызвать методы для каждой фигуры






//second part
      List<Shape> shapes =new ArrayList<>();
        Point A = new Point(0,0);
        Point B = new Point(0,4);
        Point C = new Point(4,0);
        Triangle triangle= new Triangle(A,B,C);
        triangle.setColor(Color.RED);
        shapes.add(triangle);

        Point O1 = new Point(3,3);
        Circle okr1 = new Circle(O1, 2);
        okr1.setColor(Color.WHITE);
        shapes.add(okr1);

        Point O2 = new Point(2,5);
        Circle okr2 = new Circle(O2, 4);
        okr2.setColor(Color.YELLOW);
        shapes.add(okr2);

        Point K = new Point(1,1);
        Point L = new Point(5,2);
        Rectangle rectangle= new Rectangle(K,L);
        shapes.add(rectangle);

        Point P=new Point(100, 100);
        shapes.add(P);

        Point A1= new Point(-2,3);
        Point B1= new Point(4,3);
        Point C1= new Point(2,5);
        Triangle triangle1= new Triangle(A1,B1,C1);
        triangle1.setColor(Color.BLUE);
        shapes.add(triangle1);

        ShapesServiceImpl a=new ShapesServiceImpl();
        System.out.println(a.getSquares(shapes));
        System.out.println(a.getMaxPerimeters(shapes));
        a.getColors(shapes);


    }
}
