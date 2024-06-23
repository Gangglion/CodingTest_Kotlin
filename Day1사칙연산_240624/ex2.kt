/**
 * 코딩테스트 입문 문제 Day1 - 두 수의 차
 */
class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        answer = num1 - num2
        return answer
    }
}

fun main() {
    val solution = Solution()
    println(solution.solution(100, 2))
}