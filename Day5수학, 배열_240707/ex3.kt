/**
 * Day5-3 : 나이 출력
 * 
 * 머쓱이는 선생님이 몇 년도에 태어났는지 궁금해졌습니다. 
 * 2022년 기준 선생님의 나이 age가 주어질 때, 선생님의 출생 연도를 return 하는 solution 함수를 완성해주세요
 * 
 * 입출력 예시
 * age = 40, result = 1983
 * age = 23, result = 2000
 */

 class Solution {
    companion object {
        const val NOW_YEAR = 2022
    }
    fun solution(age: Int): Int {
        var answer: Int = NOW_YEAR - age + 1
        return answer
    }
}

fun main() {
    println(Solution().solution(23))
}