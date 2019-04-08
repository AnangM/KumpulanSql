import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
// import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class InsertMsStudent{
    public static void main(String[] args) {
        String id, nama,alamat,email,gender,date;
        int gaji;
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //        BufferedReader reader = new BufferedReader(new FileReader("/home/anangmb/Kuliah/Semester2/prakWeb/4/insertMahasiswa.sql"));
        while(true){
                BufferedWriter writer = new BufferedWriter(new FileWriter("/home/anangmb/Kuliah/Semester2/prakWeb/4/Latihan2/sql/insertMsStudent.sql",true));

                String fileContent = "insert into MsAssistant values('"+ id +"','" + nama + "','" + alamat + "','" + telp +"','" + email +"',"+ gaji +");\n";
                writer.write(fileContent);
                writer.close();
                System.out.println("=============================================");
        }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}