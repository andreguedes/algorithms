object QuickSort {

    fun sort(list: List<Int>): List<Int> {
        if (list.count() < 2) return list

        val pivotValue = list[list.size / 2]
        val equalsToPivot = list.filter { it == pivotValue }
        val leftItems = list.filter { it < pivotValue }
        val rigthItems = list.filter { it > pivotValue }

        return sort(leftItems) + equalsToPivot + sort(rigthItems)
    }

}