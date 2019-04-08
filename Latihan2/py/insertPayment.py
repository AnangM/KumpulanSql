target = open("/home/anangmb/Kuliah/Semester2/prakWeb/4/Latihan2/sql/insertJadwal.sql",'a')
index = 0

while True:
    if(index < 10):
        id = "PO10" + str(index)
    else:
        id = "PO1" + str(index)
    index = index+1
    student = input("Masukkan ID Regist ->  ")
    jadwal = input("Masukkan Besar Pembayaran ->  ")
    grade = input("Masukkan Tanggal ->  ")
    stm = "insert into tr_regist values('%s','%s','%s','%s');\n" %(id,student,jadwal,grade)
    target.write(stm)
    print("\n\n")