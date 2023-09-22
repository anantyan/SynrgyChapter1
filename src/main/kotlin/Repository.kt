/**
 * Representasi Alur Logic dengan Inheritence
 * */
class Soal1 : Soal {
    override fun hasilObject(angka: Int): String {
        var str = ""
        var space = angka - 1
        for (j in 1..angka) {
            for (i in 1..space) {
                str += " "
            }
            space--
            for (i in 1..<2 * j) {
                str += "*"
            }
            str += "\n"
        }
        str += "Soal 1. Segitiga"
        return str
    }
}

class Soal2 : Soal {
    override fun hasilObject(angka: Int): String {
        var str = ""
        var start = angka * 2 - 1
        val space = angka - 1
        for (i in angka downTo 1) {
            for (j in space downTo i) {
                str += " "
            }
            for (k in 1..start) {
                str += "*"
            }
            start -= 2
            str += "\n"
        }
        str += "Soal 2. Segitiga Terbalik"
        return str
    }
}

class Soal3 : Soal {
    override fun hasilObject(angka: Int): String {
        var str = ""
        var space = angka - 1
        for (j in 1..angka) {
            for (i in 1..space) {
                str += " "
            }
            space--
            for (i in 1..<2 * j) {
                str += "*"
            }
            str += "\n"
        }
        space = 1
        for (j in 1..<angka) {
            for (i in 1..space) {
                str += " "
            }
            space++
            for (i in 1..<2 * (angka - j)) {
                str += "*"
            }
            str += "\n"
        }
        str += "Soal 3. Layang-layang"
        return str
    }
}

class Soal4 : Soal {
    override fun hasilObject(angka: Int): String {
        var str = ""
        val start = angka + 1
        for (i in 1..start) {
            for (j in 1..start) {
                str += if (i == j || i + j == start + 1) {
                    "*"
                } else {
                    " "
                }
            }
            str += "\n"
        }
        str += "Soal 4. Huruf X"
        return str
    }
}

class Soal5 : Soal {
    override fun hasilObject(angka: Int): String {
        var str = ""
        for (i in 0..<angka) {
            for (j in 0..<angka - i - 1) {
                str += " "
            }
            for (j in 0..i) {
                str += if (j == 0 || j == i || i == angka - 1) {
                    "* "
                } else {
                    "  "
                }
            }
            str += "\n"
        }
        str += "Soal 5. Segitiga Hollow"
        return str
    }
}