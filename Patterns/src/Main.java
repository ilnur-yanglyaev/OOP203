import Adapter.*;

import Factory.MSU_students;
import Factory.Student;
import Factory.StudentType;
import Proxy.TableProxy;
import Proxy.TableService;
import Singleton.Sky;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        Sky nebo = Sky.getInstance();

        MSU_students student= Student.createStudent(StudentType.BachelorFourthCourse);

        InternationalMeasurementSystem CI=new InternationalMetric(22, 13.3,144, 25);
        CI.getLenght(); CI.getWeight();
        System.out.println();
        AmericanMeasurementSystem US=new InternationalMeasurementSystemAdapter(CI);
        US.getLenght(); US.getWeight();

        System.out.println();
        TableService table = new TableProxy();
        List<String> subTable = table.getSubjectTable();

        System.out.println("Subject Table: ");
        for (String s : subTable) {
            System.out.println(s);}



    }
}