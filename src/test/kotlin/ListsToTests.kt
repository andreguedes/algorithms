object ListsToTests {

    fun getListWithOneItem() = listOf(123)

    fun getAlreadySortedList() = listOf(
        1, 2, 3, 4, 5, 6, 9, 20, 22, 23, 28,
        32, 34, 39, 40, 42, 76, 87, 99, 112
    )

    fun getUnsortedList() = listOf(52, 4, 12, 36, 8, 5, 69, 74, 2, 1, 0, 65, 99, 100, 7)

    fun getSortedList() = listOf(0, 1, 2, 4, 5, 7, 8, 12, 36, 52, 65, 69, 74, 99, 100)

    fun getInversedList() = listOf(
        117, 90, 88, 83, 81, 77, 74, 69, 64, 63, 51,
        50, 49, 42, 41, 34, 32, 29, 28, 22, 16, 8, 6, 5, 3, 1
    )

    fun getInversedSortedList() = listOf(
        1, 3, 5, 6, 8, 16, 22, 28, 29, 32, 34, 41, 42, 49, 50, 51, 63, 64, 69, 74, 77, 81, 83, 88, 90, 117
    )

    fun getRepeatedList() = listOf(7, 7, 7, 7, 7, 1, 1, 9, 9, 0, 4, 4, 4, 5, 4, 5, 7, 1)

    fun getRepeatedSortedList() = listOf(0, 1, 1, 1, 4, 4, 4, 4, 5, 5, 7, 7, 7, 7, 7, 7, 9, 9)

}