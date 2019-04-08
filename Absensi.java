import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class Absensi{
    public static void main(String[] args) {
        try{
            
            for(int i = 1; i < 13; i++){
                BufferedWriter writer = new BufferedWriter(new FileWriter("/home/anangmb/Kuliah/Semester2/prakWeb/4/Latihan2/sql/createAbsensi.sql",true));
                    String fileContent ="\n    Pertemuan_" + i + " varchar(5),";
                    writer.write(fileContent);
                    writer.close();
                }
        
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}