object MergeSort {

    fun mergeSort(list: List<Int>): List<Int> {
        val endOfList = list.size
        if (endOfList <= 1) return list

        val middle = endOfList / 2
        val leftSideList = list.subList(0, middle)
        val rightSideList = list.subList(middle, endOfList)

        return merge(mergeSort(leftSideList), mergeSort(rightSideList))
    }

    private fun merge(leftSideList: List<Int>, rightSideList: List<Int>): MutableList<Int> {
        var indexLeft = 0
        var indexRight = 0
        val mergedList = mutableListOf<Int>()

        while (indexLeft < leftSideList.size && indexRight < rightSideList.size) {
            if (leftSideList[indexLeft] <= rightSideList[indexRight]) {
                mergedList.add(leftSideList[indexLeft])
                indexLeft += 1
            } else {
                mergedList.add(rightSideList[indexRight])
                indexRight += 1
            }
        }
        while (indexLeft < leftSideList.size) {
            mergedList.add(leftSideList[indexLeft])
            indexLeft += 1
        }
        while (indexRight < rightSideList.size) {
            mergedList.add(rightSideList[indexRight])
            indexRight += 1
        }
        return mergedList
    }

}