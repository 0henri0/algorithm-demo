package sort;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class WriteFile {
    public static void main(String[] args) {
        File f = new File("src/main/java/sort/numbers.txt");
        Charset charset = Charset.forName(String.valueOf(StandardCharsets.UTF_8));
        try(FileWriter fw = new FileWriter(f)) {
            fw.append("");
            BufferedWriter bw = new BufferedWriter(new FileWriter(f, charset, true));
            Random rd = new Random();
            for (int i = 0; i < 1; i++) {
                bw.append(String.valueOf(rd.nextInt(Integer.MAX_VALUE))).append("\n");
            }

            bw.close();
        } catch (IOException $e) {
            System.out.println($e.getMessage());
        }
    }
}
