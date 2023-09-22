/**
 * Challenge Chapter 1 - Hasil dan Implementasi
 * */
fun main() {
    var value: Int? = null

    print("Selamat datang di Challenge Chapter 1\n" +
        "Nama  : Arya Rezza Anantya\n" +
        "Kelas : Android Engineer 2\n\n")

    while (value == null) {
        print("Dengan memasukan angka favorit bisa mempengaruhi hasil coba aja\n" +
                "Silahkan masukan angka favorit anda (Tekan Enter untuk default 8): ")

        value = input() ?: continue

        val topikChallenge = TopikChallenge(value)
        topikChallenge.output {
            println(it)
        }
        topikChallenge.run()
    }
}