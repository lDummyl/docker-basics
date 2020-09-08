import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class ReadExternal {

    public static void main(String[] args) throws InterruptedException, IOException {
        List<String> inputLines = Files.readAllLines(Paths.get("./input.txt"));
        ArrayList<String> list = new ArrayList<>();
        int i = 0;
        for (String inputLine : inputLines) {
            System.out.println(++i);
            Thread.sleep(1000);
            list.add("parsed-line: - " + i + " - " + inputLine);
        }
        Files.write(Paths.get("./output.txt"), list, StandardOpenOption.CREATE);
    }
}


