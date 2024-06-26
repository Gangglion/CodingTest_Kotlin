/**
 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 
 * 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 
 * 최빈값이 여러 개면 -1을 return 합니다.
 */

class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        var arraySet = array.distinct()
        var duplicateMap: MutableMap<Int, Int> = mutableMapOf()
        arraySet.forEach {
            duplicateMap[it] = 0
        }
        if(array.size == 1) { // 인자로 들어온 배열이 1개
            answer = 1
        } else if(array.size > 1 && array.size == arraySet.size) {
            answer = -1
        } else {
            // 각 원소별 중복된 갯수 구하기
            arraySet.forEach {
                var count = 0
                for(num in array) {
                    if(it == num) {
                        count++
                    }
                }
                duplicateMap[it] = count
            }
            // 최빈값 찾아서 리턴
            val maxValue = duplicateMap.maxByOrNull { it.value }!!
            if(duplicateMap.values.filter { it == maxValue.value }.size > 1) // 최빈값이 여러개일때
                answer = -1
            else
                answer = maxValue.key
        }
        return answer
    }
}

fun main() {
    val sol = Solution()
    println("최빈값 결과 : ${sol.solution(intArrayOf(0))}")
}