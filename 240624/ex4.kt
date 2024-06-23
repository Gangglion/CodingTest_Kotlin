/**
 * 코딩테스트 입문 문제 Day1 - 몫 구하기
 */
class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        answer = num1 / num2
        return answer
    }
}

fun main() {
    val solution = Solution()
    println(solution.solution(10, 5))
}