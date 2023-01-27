class GameSuit(
    private var nama: String
) {

    fun infoPemain(): String {
        return nama
    }

    //    fun infoAksi(batu: String, gunting: String, kertas: String) {
//        if (infoPemain())
//    }
    fun randomInput(): String {
        val aksiMusuh = arrayOf("batu", "gunting", "kertas")
        val aksiMusuhRandom = aksiMusuh.random()
        return aksiMusuhRandom
    }
}
