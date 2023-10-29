public class MinMax <T extends Comparable<T> >{
private T[] array;

    public MinMax(T[] array) {
        this.array = array.clone();
    }

    public T findMin(){
        T min=array[0];
        for (int i=1;i< array.length;i++)
        { if (array[i].compareTo(min)<0)
                min = array[i]; }
        return min;
    }
    public T findMax(){
        T max=array[0];
        for (int i=1;i<array.length;i++)
        { if (array[i].compareTo(max)>0)
                max= array[i]; }
        return max;
    }

    public static void main (String[] args){
        Integer[] array= new Integer[]{22,45,2,5};
        //Integer[] array={22,45,3,5};
        MinMax<Integer> array1=new MinMax<>(new Integer[]{22, 33,3, 5, 4});
        MinMax<Integer> array2=new MinMax<>(array);
        System.out.println(array1.findMax());
        System.out.println(array1.findMin());
        System.out.println(array2.findMax());
        System.out.println(array2.findMin());
    }


}
