import java.util.stream.*;
import java.util.*;
import java.util.function.*;
public class Main {
    public static void main(String[] args) {
        // Блок 1
        //todo 1
        System.out.print("1.1. ");
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        int number;
        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            number = rand.nextInt() % 100;
            numbers.add(number);
        }
        System.out.println(numbers);
        Stream<Integer> st = numbers.stream();
//2 sposob
        Predicate<Integer> t;
        t = (n) -> (n % 2) == 0;
        Stream<Integer> resStream = st.filter(t);
        System.out.println("n = " + resStream.count());
        int n2 = (int) (numbers.stream().filter((n) -> (n % 2) == 0)).count();
        System.out.println("n2 = " + n2);

        System.out.println(" ");

        //todo 2
        System.out.print("1.2. ");
        Scanner scanner = new Scanner(System.in);
        String s;
        ArrayList<String> fam = new ArrayList<String>();
        fam.add("Jacobs");
        fam.add("Vacobs");
        fam.add("Criss");
        fam.add("Simons");
        fam.add("Jentley");

        System.out.println("Фамилии=" + fam);

        Predicate<String> fn;
        fn = (str) -> {
            if (str.charAt(0) == 'J')
                return true;
            return false;
        };
        Stream<String> stream = fam.stream();
        Stream<String> result = stream.filter(fn);
        System.out.println("count = " + result.count());

        System.out.println(" ");

        //todo 3
        System.out.print("1.3. ");
        String[] AS = {
                "abcd", "bcfk", "def", "jklmn", "jprst",
                "afc", "ambn", "kmk", "rbd", "jus"
        };
        ArrayList<String> AL = new ArrayList<String>(AS.length);
        for (int i = 0; i < AS.length; i++)
            AL.add(i, AS[i]);
        Stream<String> stream1 = AL.stream();
        Stream<String> streamSorted = stream1.sorted();
        Consumer<String> action = (str) -> {
            System.out.print(str + " ");
        };
        streamSorted.forEach(action);
        Comparator<String> comparator;

        comparator = (str1, str2) -> {
            return str2.compareTo(str1); // <0, ==0, >0
        };
        stream1 = AL.stream();
        Stream<String> streamSortedDesc = stream1.sorted(comparator);
        System.out.println(" ");
        System.out.println("-----------------------");
        streamSortedDesc.forEach(action);

        System.out.println(" ");
        System.out.println(" ");

        // Блок 2
        //Задача 1
        //todo zd1
        System.out.print("Задача 1 ");
        List<Integer> list = List.of(1, 2, 3, 4, 5);
        System.out.println(getEvenNumbersPro(list));

        System.out.println(" ");

        //Задача 2
        //todo zd2
        System.out.print("Задача 2 ");
        List<String> names = List.of("Masha", "Max", "Ivan", "Petr", "Patric", "Mavrodi");
        List<String> outputNames = new ArrayList<String>();
        names.stream().filter(name -> name != "").map(name -> name.toUpperCase()).forEach(outputNames::add);
        System.out.println(outputNames);
        System.out.println(outputNames.stream().filter(name -> name.charAt(0) == 'M').count());
    }
   /* private static List<Integer> getEvenNumbersPro(List<Integer> list) {
        System.out.println(list);
        Stream<Integer> st = list.stream();
        Predicate<Integer> t;
        t = (n) -> (n % 2) == 0;
        Stream<Integer> resStream = st.filter(t);
        System.out.println("n = " + resStream.count());
        int n2 = (int) (list.stream().filter((n) -> (n % 2) == 0)).count();
        System.out.println("n2 = " + n2);
        System.out.println(" ");
        return
    }*/
   public static List<Integer> getEvenNumbersPro(List<Integer> inputList) {
       List<Integer> outputList = new ArrayList<Integer>();
       inputList.stream().filter((number) -> (number % 2) == 0).forEach(outputList::add);
       return outputList;
   }

}