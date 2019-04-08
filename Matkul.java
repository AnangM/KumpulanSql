import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
// import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Matkul{
    public static void main(String[] args) {
        String id, nama;
        int sks,unique = 1;
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //        BufferedReader reader = new BufferedReader(new FileReader("/home/anangmb/Kuliah/Semester2/prakWeb/4/insertMahasiswa.sql"));
        while(true){
                BufferedWriter writer = new BufferedWriter(new FileWriter("/home/anangmb/Kuliah/Semester2/prakWeb/4/insertRuang.sql",true));
                if(unique < 10){
                    id = "KM00" + unique;
                }else{
                    id = "KM0" + unique;
                }
                unique++;
                System.out.print("Nama Matkul : ");
                nama = br.readLine();
                System.out.print("Jumlah SKS : ");
                sks = Integer.parseInt(br.readLine());
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