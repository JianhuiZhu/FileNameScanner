import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileNameScanner {
    public void scanFile(File file) throws IOException{
        if (file == null || !file.exists()){
            throw new IOException("The file path is invalid");
        }
    }

    private void writeFile(StringBuffer stringBuffer) throws IOException{
        File file = new File("output.txt");
        Path path =  Paths.get(file.getAbsolutePath());
        String[] fileNames = stringBuffer.toString().split("\n");
        List<String> lines = Arrays.asList(fileNames);

        Files.write(path, lines, StandardCharsets.UTF_8);
    }
}
