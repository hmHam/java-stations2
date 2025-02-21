import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.StandardCharsets;


public class Station11 {

    public static void q1(Path inputFile, Path outputFile) {
        // ここから
        try {
            String val = Files.readString(inputFile, StandardCharsets.UTF_8);
            Integer val2 = Integer.parseInt(val);
            Files.writeString(outputFile, String.valueOf(val2 * 2), StandardCharsets.UTF_8);
        } catch (IOException e) { }
        // ここまで
    }
}
