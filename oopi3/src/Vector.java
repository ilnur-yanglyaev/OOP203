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
    /** Этот конструктор без параметров создает вектор с дефолтными значениями
     * */
    public Vector() {
    }
    // конструктор с параметрами
    /** Этот конструктор с параметрами создает вектор с заданными значениями
     * @param x1 - значение абсциссы начала вектора
     * @param y1 - значение ординаты начала вектора
     * @param x2 - значение абсциссы конца вектора
     * @param y2 - значение ординаты конца вектора
     * */
    public Vector(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    // getters setters
    /** Это стандартный геттер, возвращающий значение абсциссы начала
     * @return double - тип возвращаемого значения абсциссы начала
     * */
    public double getFirstPointX() {
        return x1;
    }
    /** Это стандартный геттер, возвращающий значение ординаты начала
     * @return double - тип возвращаемого значения абсциссы начала
     * */
    public double getFirstPointY() {
        return y1;
    }
    /** Это стандартный геттер, возвращающий значение абсциссы конца
     * @return double - тип возвращаемого значения абсциссы начала
     * */
    public double getSecondPointX() {
        return x2;
    }
    /** Это стандартный геттер, возвращающий значение ординаты конца
     * @return double - тип возвращаемого значения абсциссы начала
     * */
    public double getSecondPointY() {
        return y2;
    }

    /** Это стандартный сеттер, изменяющий значение абсциссы начала
     * @param temp- тип замещающего значения абсциссы начала
     * */
    public void setFirstPointX(double temp) {
        this.x1= temp;
    }
    /** Это стандартный сеттер, изменяющий значение ординаты начала
     * @param temp- тип замещающего значения ординаты начала
     * */
    public void setFirstPointY(double temp) {
        this.y1 = temp;
    }
    /** Это стандартный сеттер, изменяющий значение абсциссы конца
     * @param temp- тип замещающего значения абсциссы конца
     * */
    public void setSecondPointX(double temp) {
        this.x2= temp;
    }
    /** Это стандартный сеттер, изменяющий значение ординаты конца
     * @param temp- тип замещающего значения ординаты конца
     * */
    public void setSecondPointY(double temp) {
        this.y2 = temp;
    }

    // метод для нахождения векторного произведения
    /**
     * Метод используется для нахождения векторного произведения текущего вектор на задаваемый вектор A.
     * @param B - вектор, на который производится умножение
     * * @return double - тип возвращаемого значения произведения векторов, равный площади параллелограмма,
     * натянутого на вектора(определителю матрицы, составленной из координат векторов) .
     * */

    public double vectorProduct(Vector B){
        double Ax=x2-x1;
        double Ay=y2-y1;

        double Bx=B.x2- B.x1;
        double By=B.y2- B.y1;

        return (Ax*By-Ay*Bx);
    }

    // метод для нахождения скалярного произведения
    /**
     * Метод используется для нахождения скалярного произведения текущего вектор на вектор B.
     * @param B - вектор, на который производится умножение
     * * @return double - тип возвращаемого значения скалярного произведения векторов.
     * */
    public double scalarProduct(Vector B){
        double Ax=x2-x1;
        double Ay=y2-y1;

        double Bx=B.x2- B.x1;
        double By=B.y2- B.y1;

        return (Ax*Bx+Ay*By);
    }

    // метод для нахождения длины вектора
     /** Метод используется для нахождения длины вектора.
     * * @return double - тип возвращаемого значения скалярного произведения векторов.
            * */
    public double lenght(){
        double Ax=x2-x1;
        double Ay=y2-y1;
        return (Math.sqrt(Ax*Ax+Ay*Ay));
    }
    // метод для умножения вектора на число
    /** Метод используется для метод для умножения вектора на число.
     * @param k - число, на которое производится умножение координат вектора
       * */
    public void multOnNumber(double k){
        //Vector temp;
        this.x1=x1*k;
        this.y1=y1*k;
        this.x2=x2*k;
        this.y2=y2*k;
        //return temp
    }

    // метод для нахождения суммы векторов
    /** Метод используется для нахождения суммы векторов, возвращающий вектор с первой точкой в начале первого вектора
     * и со второй точкой в конце второго.
     * @param A - вектор, c которым складываем текущий
     * * @return Vector - тип возвращаемого значения суммы векторов.
     * */
    public Vector addVector(Vector A){
        Vector sum=new Vector(x1,y1, A.x2, A.y2);
        return sum;
    }
    // метод для нахождения разности векторов
    /** Метод используется для нахождения суммы векторов
     * @param A - вектор, который вычитаем
     * * @return Vector - тип возвращаемого значения разности векторов.
     * */
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

        System.out.println(vector2.getSecondPointX());
        vector1.setFirstPointX(5);
        vector1.setFirstPointY(2);
        vector1.setSecondPointX(13);
        vector1.setSecondPointY(9);

       Vector Sum=vector1.addVector(vector2);
        System.out.println(vector1.lenght());

        double sc=vector2.scalarProduct(vector1);
        double vp=vector2.vectorProduct(vector1);
        System.out.println(sc+" "+ vp);


    }



}
