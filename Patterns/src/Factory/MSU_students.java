package Factory;

public abstract class MSU_students {
    public String name;
    public int age;
    public static void add() {}

}

class BachelorFirstCourse extends MSU_students
{}
class BachelorSecondCourse extends MSU_students
{}
class BachelorThirdCourse extends MSU_students
{}
class BachelorFourthCourse extends MSU_students
{}
class MasterFirstCourse extends MSU_students
{}
class MasterSecondCourse extends MSU_students
{}