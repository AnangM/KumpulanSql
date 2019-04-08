import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
// import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Ruang{
    public static void main(String[] args) {
        String id, nama;
        int kapasitas;
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //        BufferedReader reader = new BufferedReader(new FileReader("/home/anangmb/Kuliah/Semester2/prakWeb/4/insertMahasiswa.sql"));
        while(true){
                BufferedWriter writer = new BufferedWriter(new FileWriter("/home/anangmb/Kuliah/Semester2/prakWeb/4/insertRuang.sql",true));
                System.out.print("Kode Ruang : KR");
                id = "KR" + br.readLine();
                System.out.print("Nama Ruang : ");
                nama = br.readLine();
                System.out.print("Kapasitas : ");
                kapasitas = Integer.parseInt(br.readLine());
                String fileContent = "insert into MsRuang values('"+ id +"',
    
'" + nama + "',
    
" + kapasitas + ");\n";
                writer.write(fileContent);
                writer.close();
                System.out.println("=============================================");
        }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}