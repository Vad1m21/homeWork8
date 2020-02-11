
import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FlowersLoader {


    private FlowersLoader() {

    }

    public static List<String> load () throws IOException {

        FileReader fileReader = new FileReader("Flowers.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = null;
        List<String> flowers = new ArrayList<>();
        while ((line = bufferedReader.readLine()) != null){
            flowers.add(line);
        }
        bufferedReader.close();

    return flowers;
    }

}


