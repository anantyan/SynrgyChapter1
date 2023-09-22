/**
 * Class Implementasi
 * */
class TopikChallenge(
    private val angka: Int
) {
    private var _output: ((String) -> Unit)? = null

    fun output(listener: (String) -> Unit) {
        _output = listener
    }

    fun run() {
        val challenges = listOf(
            angka.soal(Soal1()),
            angka.soal(Soal2()),
            angka.soal(Soal3()),
            angka.soal(Soal4()),
            angka.soal(Soal5())
        )
        _output?.invoke(challenges.joinToString("\n\n"))
    }
}