import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
// import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Asdos{
    public static void main(String[] args) {
        String id, nama,alamat,telp,email;
        int gaji;
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //        BufferedReader reader = new BufferedReader(new FileReader("/home/anangmb/Kuliah/Semester2/prakWeb/4/insertMahasiswa.sql"));
        while(true){
                BufferedWriter writer = new BufferedWriter(new FileWriter("/home/anangmb/Kuliah/Semester2/prakWeb/4/insertAsistant.sql",true));
                System.out.print("Kode : ");
                id = br.readLine().toUpperCase();
                System.out.print("Nama : ");
                nama = br.readLine().toUpperCase();
                email = nama.toLowerCase().replaceAll(" ", "_")+"@hotmail.com";
                System.out.print("Alamat : Jl. ");
                alamat = "Jl. " +br.readLine();
                System.out.print("Telp : 021-");
                telp = "021-" + br.readLine();
                System.out.print("Gaji : ");
                gaji = Integer.parseInt(br.readLine());
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