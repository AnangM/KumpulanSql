target = open("/home/anangmb/Kuliah/Semester2/prakWeb/4/Latihan2/sql/insertTrhAbsensi.sql",'a')
index = 0

while True:
    if(index < 10):
        id = "0" + str(index)
        jadwal = "J000" +str(index)
    else:
        id = "" + str(index)
        jadwal = "J00" +str(index)
    index = index + 1
    p1 = input("Masukkan Pertemuan 1 ->  ")
    p2 = input("Masukkan Pertemuan 2 ->  ")
    p3 = input("Masukkan Pertemuan 3 ->  ")
    p4 = input("Masukkan Pertemuan 4 ->  ")
    p5 = input("Masukkan Pertemuan 5 ->  ")
    p6 = input("Masukkan Pertemuan 6 ->  ")
    p7 = input("Masukkan Pertemuan 7 ->  ")
    p8 = input("Masukkan Pertemuan 8 ->  ")
    p9 = input("Masukkan Pertemuan 9 ->  ")
    p10 = input("Masukkan Pertemuan 10 ->  ")
    p11 = input("Masukkan Pertemuan 11 ->  ")
    p12 = input("Masukkan Pertemuan 12 ->  ")
    stm = "insert into trh_absensi values('%s','%s','%s/2008','%s/2008','%s/2008','%s/2008','%s/2008','%s/2008','%s/2008','%s/2008','%s/2008','%s/2008','%s/2008','%s/2008');\n" %(id,jadwal,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12)
    target.write(stm)
    print("\n\n")