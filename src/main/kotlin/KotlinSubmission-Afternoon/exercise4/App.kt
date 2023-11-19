package id.infinitelearning.KotlinSubmission.exercise4

import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException



    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini*/
    fun main() {
        try {
            // Sedang membagi rata uang saku
            val result1 = pembagian(90, 3)
            println("hasil pembagian dari 90/3 = $result1\n")

            val result2 = pembagian(120, 0)
            println("hasil pembagian dari 120/0 = $result2\n")
        }
        catch (e: ArithmeticException) {
            println("terjadi error : ${e.message}")
            println("hasil pembagian dengan 0 = undefined")
        }
    }
fun pembagian(a: Int, b:Int) : Int{
    return a/b
}

