/**
 * 배열 두배 만들기
 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
 */

 class Solution {
    fun solution(numbers: IntArray): IntArray {
        var answer: IntArray = intArrayOf()
        for((idx, num) in numbers.withIndex()) {
        }
        answer = numbers
        return answer
    }
}

fun main() {
    val sol = Solution()
    val ex: IntArray = intArrayOf(1,2,3,4,5)
    sol.solution(ex)
}