/**
 * 배열 두배 만들기
 * 정수 배열 numbers가 매개변수로 주어집니다. numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록 solution 함수를 완성해주세요.
 */

 class Solution {
    fun solution(numbers: IntArray): IntArray {
        // var answer = IntArray(numbers.size)
        // for((idx, num) in numbers.withIndex()) {
        //     answer[idx] = num * 2
        // }
        // return answer

        // kotlin map 함수 이용
        //  map 함수 : 값을 변형하여 새로운 리스트를 생성함
        //  새로운 풀이
        var answer: IntArray = intArrayOf()
        answer = numbers.map { it * 2 }.toIntArray()
        return answer
    }
}

fun main() {
    val sol = Solution()
    val ex: IntArray = intArrayOf(1,2,3,4,5)
    val result = sol.solution(ex)

    for(i in 0..result.size -1) {
        print("${result[i]} ")
    }
    println("")
}