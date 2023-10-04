fun <T> Set<T>.symmetricDifference(otherSet: Set<T>): Set<T> {
    val union = this.union(otherSet)
    val intersection = this.intersect(otherSet)
    return union.minus(intersection)
}

fun main() {
    // Take input for set1
    print("Enter elements for set1 (space-separated): ")
    val input1 = readLine()
    val set1 = input1?.split(' ')?.map { it.trim().toInt() }.toSet()

    // Take input for set2
    print("Enter elements for set2 (space-separated): ")
    val input2 = readLine()
    val set2 = input2?.split(' ')?.map { it.trim().toInt() }.toSet()

    if (set1 != null && set2 != null) {
        val symmetricDiff = set1.symmetricDifference(set2)

        println("Symmetric Difference: $symmetricDiff")
    } else {
        println("Invalid input. Please enter space-separated integers.")
    }
}
