import java.util.*

fun main(args: Array<String>) {
    val friends = TreeSet<Int>()
    val scanner = Scanner(System.`in`, "UTF-8")
    val nFriends = scanner.nextInt()
    for (i in 1..nFriends) {
        friends.add(scanner.nextInt())
        for (j in 1..scanner.nextInt()) {
            friends.add(scanner.nextInt())
        }
    }
    println(friends.size - nFriends)
}