import java.util.*
fun main() {
    val reader = Scanner(System.`in`)
    print("Nama = ")
    reader.nextLine()
    print("Kelas = ")
    reader.nextLine()
    print("No Absen = ")
    reader.nextLine()
    val kata = """
        ==========================
        Kamu ingin menghitung apa?
        1. Volume Kerucut 
        2. Volume Tabung
        ==========================
    """.trimIndent()
    println(kata)
    print("Pilihanmu = ")
    val pilihan: Int = reader.nextInt()
    val menghitung = if (pilihan == 1) {
        print("Masukan jari-jari = ")
        val r: Float = reader.nextFloat()
        print("Masukan tinggi = ")
        val t: Float = reader.nextFloat()
        println("==========================")
        val hasil = ( r * r * t * 22/7*1 / 3 )
        print("Jadi volume Kerucut = ")
        print(String.format("%.2f",hasil))
    } else if (pilihan == 2) {
        print("Masukan jari-jari = ")
        val r: Float = reader.nextFloat()
        print("Masukan tinggi = ")
        val t: Float = reader.nextFloat()
        println("==========================")
        val hasil = ( r * r * t * 22/7*1 )
        print("Jadi volume Tabung = ")
        print(String.format("%.2f",hasil))
    } else {
        print("Pilihan tidak terdaftar")
    }
}


