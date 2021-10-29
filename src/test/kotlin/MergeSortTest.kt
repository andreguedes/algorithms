import org.junit.Test
import kotlin.test.assertContentEquals

internal class MergeSortTest {

    @Test
    fun `should validate one item list`() {
        val oneItemList = ListsToTests.getListWithOneItem()

        val mergeSortedList = MergeSort.mergeSort(oneItemList)
        assertContentEquals(oneItemList, mergeSortedList)
    }

    @Test
    fun `should validate unsorted integer list`() {
        val unsortedList = ListsToTests.getUnsortedList()
        val expectedSortedList = ListsToTests.getSortedList()

        val mergeSortedList = MergeSort.mergeSort(unsortedList)
        assertContentEquals(mergeSortedList, expectedSortedList)
    }

    @Test
    fun `should validate already integer list sorted`() {
        val alreadySortedList = ListsToTests.getAlreadySortedList()

        val mergeSortedList = MergeSort.mergeSort(alreadySortedList)
        assertContentEquals(mergeSortedList, alreadySortedList)
    }

    @Test
    fun `should validate inversed integer list`() {
        val inversedList = ListsToTests.getInversedList()
        val expectedSortedList = ListsToTests.getInversedSortedList()

        val mergeSortedList = MergeSort.mergeSort(inversedList)
        assertContentEquals(mergeSortedList, expectedSortedList)
    }

    @Test
    fun `should validate repeated integer list`() {
        val repeatedList = ListsToTests.getRepeatedList()
        val expectedSortedList = ListsToTests.getRepeatedSortedList()

        val mergeSortedList = MergeSort.mergeSort(repeatedList)
        assertContentEquals(mergeSortedList, expectedSortedList)
    }

}