target = open("/home/anangmb/Kuliah/Semester2/prakWeb/4/Latihan2/sql/insertTrResult.sql",'a')
index = 0

def cek_note(n):
    if n == 'v':
        return "AVERAGE"
    elif n=='n':
        return "NULL"
    elif n =='g':
        return "GOOD"


while True:
    if(index < 10):
        id = "RE00" + str(index)
    else:
        id = "RE0" + str(index)
    program = input("Masukkan ID Program ->  ").upper()
    jadwal = input("Masukkan ID Siswa ->  ")
    grade = input("Masukkan Predikat ->  ").upper()
    grade2 = input("Masukkan Predikat ->  ").upper()
    note = cek_note(input("Masukkan Note ->  "))
    stm = "insert into tr_result values('%s','%s','%s','%s','%s','%s');\n" %(id,program,jadwal,grade,grade2,note)
    target.write(stm)
    print("\n\n")