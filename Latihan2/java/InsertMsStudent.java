import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.IOException;
public class InsertMsStudent{
    public static void main(String[] args) {
        String id, nama,alamat,email,gender,date,hp;
        String alamatFile = "/home/anangmb/Kuliah/Semester2/prakWeb/4/Latihan2/sql/insertMsStudent.sql";
        try{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
                BufferedWriter writer = new BufferedWriter(new FileWriter(alamatFile,true));
                System.out.print("Masukkan ID --> ");
                id = br.readLine();
                System.out.print("Masukkan Nama --> ");
                nama = br.readLine();
                System.out.print("Masukkan Alamat --> ");
                alamat = br.readLine();
                System.out.print("Masukkan Hp --> ");
                hp = br.readLine();
                System.out.print("Masukkan Email --> ");
                email = br.readLine();
                System.out.print("Masukkan Gender --> ");
                if(br.readLine().equals("f")){
                    gender = "female";
                }else{
                    gender = "male";
                }
                System.out.print("Masukkan Date --> ");
                date = br.readLine();
                String fileContent = "insert into ms_student values('"+ id +"','" + nama + "','" + alamat + "','" + hp +"','" + email +"','" + gender +"','"+ date +"');\n";
                writer.write(fileContent);
                writer.close();
                System.out.println("=============================================");
        }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}