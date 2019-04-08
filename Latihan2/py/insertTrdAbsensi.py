target = open("/home/anangmb/Kuliah/Semester2/prakWeb/4/Latihan2/sql/insertTrhAbsensi.sql",'a')
index = 0

def get_absensi(s):
    if s == 'a':
        return "Alpha"
    elif s == 'i':
        return "Izin"
    else:
        return "hadir"


while True:
    if(index < 10):
        id = "0" + str(index)
    else:
        id = "" + str(index)
    index = index + 1
    siswa = input("Masukkan ID Siswa ->  ")
    p1 = get_absensi(input("Masukkan Pertemuan 1 ->  "))
    p2 = get_absensi(input("Masukkan Pertemuan 2 ->  "))
    p3 = get_absensi(input("Masukkan Pertemuan 3 ->  "))
    p4 = get_absensi(input("Masukkan Pertemuan 4 ->  "))
    p5 = get_absensi(input("Masukkan Pertemuan 5 ->  "))
    p6 = get_absensi(input("Masukkan Pertemuan 6 ->  "))
    p7 = get_absensi(input("Masukkan Pertemuan 7 ->  "))
    p8 = get_absensi(input("Masukkan Pertemuan 8 ->  "))
    p9 = get_absensi(input("Masukkan Pertemuan 9 ->  "))
    p10 = get_absensi(input("Masukkan Pertemuan 10 ->  "))
    p11 = get_absensi(input("Masukkan Pertemuan 11 ->  "))
    p12 = get_absensi(input("Masukkan Pertemuan 12 ->  "))
    stm = "insert into trh_absensi values('%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s','%s');\n" %(id,siswa,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12)
    target.write(stm)
    #print(stm)
    print("\n\n")