target = open("/home/anangmb/Kuliah/Semester2/prakWeb/4/Latihan2/sql/insertJadwal.sql",'a')
index = 0

while True:
    if(index < 10):
        id = "reg00" + str(index)
    else:
        id = "reg0" + str(index)
    student = input("Masukkan ID Student ->  ")
    jadwal = input("Masukkan ID jadwal ->  ")
    grade = input("Masukkan ID grade ->  ")
    stm = "insert into tr_regist values('%s','%s','%s','%s');\n" %(id,student,jadwal,grade)
    target.write(stm)
    print("\n\n")