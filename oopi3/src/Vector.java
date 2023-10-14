//import java.io.IOException;

import java.io.IOException;

/**
 * <b> Класс векторов </b>
 * Класс Vector реализует приложение, которое
 * позволяет работать с векторами
 * на плоскости и демонстрирует работу всех методов.
 *
 * @author Ilnur Yanglyaev
 * @version 1.0
 * @since 2023-10-09
 * */

public class Vector {
    double x1=0;
    double y1=0;

    double x2=0;
    double y2=0;

    // конструктор без параметров
    public Vector() {
    }
    // конструктор с параметрами
    public Vector(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;}

    // getters setters
    public double getFirstPointX() {
        return x1;
    }
    public double getFirstPointY() {
        return y1;
    }
    public double getSecondPointX() {
        return x2;
    }
    public double getSecondPointY() {
        return y2;
    }

    public void setFirstPointX(double temp) {
        this.x1= temp;
    }
    public void setFirstPointY(double temp) {
        this.y1 = temp;
    }
    public void setSecondPointX(double temp) {
        this.x2= temp;
    }
    public void setSecondPointY(double temp) {
        this.y2 = temp;
    }

    // метод для нахождения векторного произведения
    public Vector vectorProduct(Vector A){

    }
    // метод для нахождения скалярного произведения
    public double scalarProduct(Vector B){
        double Ax=x2-x1;
        double Ay=y2-y1;

        double Bx=B.x2- B.x1;
        double By=B.y2- B.y1;

        return (Ax*Bx+Ay*By);
    }

    // метод для нахождения длины вектора
    public double lenght(){
        double Ax=x2-x1;
        double Ay=y2-y1;
        return (Math.sqrt(Ax*Ax+Ay*Ay));
    }
    // метод для умножения вектора на число
    public void multOnNumber(double k){
        //Vector temp;
        this.x1=x1*k;
        this.y1=y1*k;
        this.x2=x2*k;
        this.y2=y2*k;
        //return temp
    }

    // метод для нахождения суммы векторов
    public Vector addVector(Vector A){
        Vector sum=new Vector(x1,y1, A.x2, A.y2);
        return sum;
    }
    // метод для нахождения разности векторов
    public Vector subVector(Vector A){
        Vector sub=new Vector(x1,y1, A.x1, A.y1);
        return sub;
    }


    /**
     * Это основной метод, использующий методы класса Vector.
     * @param args Не используется.
     * @exception IOException При ошибке ввода.
     * @see IOException
     */


    public static void main(String args[]){
// создать объект класса, вызвав конструктор с параметрами
        Vector vector1=new Vector();
// создать объект класса, вызвав конструктор без параметров
        Vector vector2=new Vector(12,10,7,5);
// вызвать каждый из методов




    }



}
