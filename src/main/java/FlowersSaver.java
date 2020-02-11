
        import java.io.FileWriter;
        import java.io.IOException;
        import java.util.List;

public class FlowersSaver {

    private FlowersSaver() {

    }

    public static void save(List<String> flowers) throws IOException {

        FileWriter fileWriter = new FileWriter("Flowers.txt");
        for (String line:flowers) {
            fileWriter.write(line);
            fileWriter.append("\n");
            fileWriter.flush();
        }
        fileWriter.close();

    }

}


