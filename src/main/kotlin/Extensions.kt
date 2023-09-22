/**
 * Pattern Implementasi Logic
 * */
fun Int.soal(soal: Soal): String {
    return soal.hasilObject(this)
}

/**
 * Pattern Implementasi Input Validation
 * */
fun input(defaultValue: Int = 8): Int? {
    val userInput = readln()

    if (userInput.isEmpty()) {
        return defaultValue
    }

    /**
     * Teknik ini sama saja menggunakan Try Catch
     * */
    return userInput.toIntOrNull()?.run {
        println("Input tidak valid, harap masukkan angka\n")
        null
    }
}

