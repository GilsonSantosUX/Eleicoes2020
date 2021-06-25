import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Start{
    public static void main(String[] args) {
        // 1
        File file = new File("Files\\backup_csv\\consulta_vagas_2020_BRASIL.csv");
        Scanner in = null;
        // 2
        String path = "Files\\backup_csv\\consulta_vagas_2020_BRASIL.csv";
        FileReader fr = null;
        BufferedReader br = null;
        try {
            // 1
            in = new Scanner(file);
            while(in.hasNextLine()){
                String line = in.nextLine();
                System.out.print(line);
            }
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            // 2
            String lie = br.readLine();
            while(lie != null){
                System.out.println(lie);
                lie = br.readLine();
            }

        } catch (IOException err) {
            System.out.println(err.getMessage());
        }finally{
            if(in != null) in.close();
        }

    }
}