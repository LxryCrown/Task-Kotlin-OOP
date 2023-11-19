package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val firstName: String = "Muhammad"
    val lastName: String = "Hasyim"
    val age: Number = 20
    val isSingle: Boolean = true

    println("===PROFIL SAYA===")
    println("Nama lengkap saya adalah $firstName $lastName")
    println("Saya berusia $age tahun")
        if (isSingle) {
            println("Saya saat ini Single\n")
        }else {
            println("Saya saat ini Taken\n")
        }
}



/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */
fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {
    val group = """
        ===DETAIL GROUP===
        Id Group = $groupId
        Sesi = $session
        Anggota Group = $groupMember
    """.trimIndent()
    return println(group)
}

/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val GroupMembers = listOf("Bestran Antony Hutabarat", "Muhammad Hasyim", "Revangga Prakusya Damanik", "Andika Rizky Faizatama", "Widya Ayu Lestari")

    return listOf(GroupMembers[0])
}

/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val Mentors = arrayOf("Kak Raihan", "Kak Fatih")
    val GroupMembers = arrayOf("Bestran Antony Hutabarat", "Muhammad Hasyim", "Revangga Prakusya Damanik", "Andika Rizky Faizatama", "Widya Ayu Lestari")

    return Mentors.size + GroupMembers.size
}

fun main() {

    myProfile()

    val GroupName = "Celestial"
    println("My team is: $GroupName")
    val TotalMember = "5"
    println("Total Member Group Mobile: $TotalMember and 6 Member on Web Group")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    groupDetail("Massive", listOf("Bestran as Hustler", "Hasyim as Hipster", "Revangga as Hacker", "Andika as Hacker", "Widya Ayu as Hacker"), "Afternoon")

}