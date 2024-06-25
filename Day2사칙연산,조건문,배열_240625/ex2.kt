/**
 * 숫자 비교하기
 * 정수 num1과 num2가 매개변수로 주어집니다. 두 수가 같으면 1 다르면 -1을 retrun하도록 solution 함수를 완성해주세요.
 */

 class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        answer = if(num1 == num2) 1 else -1
        return answer
    }
}

fun main() {
    val sol = Solution()
    println(sol.solution(11, 11))
}