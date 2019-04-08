target = open("/home/anangmb/Kuliah/Semester2/prakWeb/4/Latihan2/sql/insertJadwal.sql",'a')
index = 7
while True:
    id = "J000" + str(index)
    index = index + 1
    hari = input("masukkan hari ->  ")
    jam = input("Masukkan Jam ->  ")
    program = input("Program ID ->  ")
    Room = input("Room id -> ")
    tutor = input("Tutor Id ->  ")
    stm = "insert into tr_jadwal values('"+id+"','"+hari+"','"+jam+"','"+program+"','"+Room+"','"+tutor+"');\n"
    target.write(stm)
    print("\n\n")