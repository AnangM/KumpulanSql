import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
// import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Coba{
    public static void main(String[] args) {
        String nim,nama,alamat,telp,email,jurusan;
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //        BufferedReader reader = new BufferedReader(new FileReader("/home/anangmb/Kuliah/Semester2/prakWeb/4/insertMahasiswa.sql"));
        while(true){
                BufferedWriter writer = new BufferedWriter(new FileWriter("/home/anangmb/Kuliah/Semester2/prakWeb/4/insertMahasiswa.sql",true));
                System.out.print("NIM : ");
                nim = br.readLine();
                System.out.print("Nama : ");
                nama = br.readLine();
                System.out.print("Alamat : ");
                alamat = br.readLine();
                System.out.print("Telp : 021-");
                telp = "021-" + br.readLine();
                email = nama.toLowerCase();
                email = email.replaceAll(" ", "_") + "@hotmail.com";
                System.out.print("Jurusan : ");
                jurusan = br.readLine();

                String fileContent = "insert into MsMahasiswa values('" + nim+ "',
    
'" + nama + "',
    
'" + alamat + "',
    
'" + telp + "',
    
'" + email + "',
    
'"+ jurusan +"');\n";
                writer.write(fileContent);
                writer.close();
                System.out.println("=============================================");
        }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}