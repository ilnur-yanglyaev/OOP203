
public class Main {
    public static void main(String[] args) {
        String a="en glan rrr rar rerer 121";

        char temp;
        int check=0;

        String[] words = a. split("[,\\s]+");
        int [] dif=new int[words.length];

        for(int i=0;  i< words.length;i++)
        {
            for(int j=0;  j< words[i].length()-1;j++)
            {
                if( words[i].charAt(j)!=words[i].charAt(j+1))
                {
                    check++;
                }

            }
            dif[i]=check;
            check=0;

        }

        int ind=0;
        for(int i=0;  i< words.length;i++)
        {
            if (dif[i]<dif[ind])
            {ind=i;}
        }

        System.out.println(words[ind]);


    }
}
