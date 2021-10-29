import org.junit.Test
import kotlin.test.assertContentEquals

internal class QuickSortTest {

    @Test
    fun `should validate one item list`() {
        val oneItemList = ListsToTests.getListWithOneItem()

        val sortedList = QuickSort.sort(oneItemList)
        assertContentEquals(oneItemList, sortedList)
    }

    @Test
    fun `should validate ordered list`() {
        val alreadySortedList = ListsToTests.getAlreadySortedList()

        val sortedList = QuickSort.sort(alreadySortedList)
        assertContentEquals(alreadySortedList, sortedList)
    }

    @Test
    fun `should validate unsorted list`() {
        val unsortedList = ListsToTests.getUnsortedList()
        val expectedSortedList = ListsToTests.getSortedList()

        val sortedList = QuickSort.sort(unsortedList)
        assertContentEquals(expectedSortedList, sortedList)
    }

    @Test
    fun `should validate inversed integer list`() {
        val inversedList = ListsToTests.getInversedList()
        val expectedSortedList = ListsToTests.getInversedSortedList()

        val sortedList = QuickSort.sort(inversedList)
        assertContentEquals(expectedSortedList, sortedList)
    }

    @Test
    fun `should validate repeated integer list`() {
        val repeatedList = ListsToTests.getRepeatedList()
        val expectedSortedList = ListsToTests.getRepeatedSortedList()

        val sortedList = QuickSort.sort(repeatedList)
        assertContentEquals(expectedSortedList, sortedList)
    }
}