/**
 * 정수 n이 매개변수로 주어질 때, n 이하의 홀수가 오름차순으로 담긴 배열을 return하도록 solution 함수를 완성해주세요.
 */

class Solution {
    fun solution(n: Int): IntArray {
        var startNum = 1
        var index = 1
        var maxNum = if(n % 2 == 0) n-1 else n
        var answer = IntArray(maxNum / 2 + 1)
        answer[0] = 1
        while(startNum < maxNum) {
            startNum += 2
            answer[index] = startNum
            index++
        }
        return answer

        // filter 이용하는 간단한 방법
        // return (0..n).filter { it % 2 == 1 }.toIntArray()
    }
}

fun main() {
    val sol = Solution()
    val result = sol.solution(15)
    for(i in 0..result.size-1) {
        print("${result[i]}  ")
    }
    println()
}