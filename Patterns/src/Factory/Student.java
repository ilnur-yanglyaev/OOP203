package Factory;

public class Student {
    public static MSU_students createStudent(StudentType sType)
    {
        switch(sType)
        {   case BachelorFirstCourse:
                return new BachelorFirstCourse();
            case BachelorSecondCourse:
                return new BachelorSecondCourse();
            case BachelorThirdCourse:
                return new BachelorThirdCourse();
            case BachelorFourthCourse:
                return new BachelorFourthCourse();
            case MasterFirstCourse:
                return new MasterFirstCourse();
            case MasterSecondCourse:
                return new MasterSecondCourse();
            default:
                System.out.println("Error of validation: invalid type");
        }
    return null;}

}
