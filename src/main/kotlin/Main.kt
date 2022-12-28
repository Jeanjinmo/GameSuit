

fun main() {
    println("==========================")
    println("GAME SUIT TERMINAL VERSION")
    println("==========================")
    println(
        """
        Pilihan Aksi :
        1. Batu
        2. Gunting
        3. Kertas
    """.trimIndent()
    )


    print("Masukkan Nama Pemain 1 : ")
    val pemain1Input = readLine()
    val pemain1 = GameSuit(pemain1Input!!.toString())


    print("Masukkan Nama Pemain 2 : ")
    val pemain2Input = readLine()
    val pemain2 = GameSuit(pemain2Input!!.toString())


    print("Pilih Aksi ${pemain1.infoPemain()} : ")
    val pilihanPemain1 = readLine()
    print("Pilih Aksi ${pemain2.infoPemain()} : ")
    Thread.sleep(1500)
    val pilihanPemain2 = pemain2.randomInput()
    println(pilihanPemain2)


    if (pilihanPemain1 == "batu") {
        if (pilihanPemain2 == "batu") {
            println("$pilihanPemain1 VS $pilihanPemain2 = DRAW")
        } else if (pilihanPemain2 == "gunting") {
            println("$pilihanPemain1 VS $pilihanPemain2 = Pemain 1 (${pemain1.infoPemain()}) Menang")
        } else if (pilihanPemain2 == "kertas"){
            println("$pilihanPemain1 VS $pilihanPemain2 = Pemain 1 ${pemain1.infoPemain()} Kalah")
        }
    } else if (pilihanPemain1 == "gunting"){
        if (pilihanPemain2 == "batu") {
            println("$pilihanPemain1 VS $pilihanPemain2 = Pemain 1 ${pemain1.infoPemain()} Kalah")
        } else if (pilihanPemain2 == "gunting") {
            println("$pilihanPemain1 VS $pilihanPemain2 = DRAW")
        } else if (pilihanPemain2 == "kertas"){
            println("$pilihanPemain1 VS $pilihanPemain2 = Pemain 1 (${pemain1.infoPemain()}) Menang")
        }
    } else if (pilihanPemain1 == "kertas")
        if (pilihanPemain2 == "batu") {
            println("$pilihanPemain1 VS $pilihanPemain2 = Pemain 1 (${pemain1.infoPemain()}) Menang")
        } else if (pilihanPemain2 == "gunting") {
            println("$pilihanPemain1 VS $pilihanPemain2 = Pemain 1 ${pemain1.infoPemain()} Kalah")
        } else if (pilihanPemain2 == "kertas"){
            println("$pilihanPemain1 VS $pilihanPemain2 = DRAW")
        }
}