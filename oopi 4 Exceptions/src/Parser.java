import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.io.IOException;

public class Parser {
    public List<String> parse(String path) throws IOException{
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(path));
            for(int i=0; i< lines.size();i++){
                System.out.println("===Task "+(i+1)+"===");
                System.out.println(lines.get(i));}
                //todo regular
        } catch (IOException e) {
            e.printStackTrace();
            //todo  Файл resource/1.txt (путь до файла) не найден
            
        }
        return lines;
    }

    public double Calculate(int type, int...a){
        if(type==1){//значение выражения
             }
        if(type==2){//уравнение
             }
        if(type==3){//квадратного уравнения
             }

        return 0;
    }




}
