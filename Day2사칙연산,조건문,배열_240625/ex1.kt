/**
 * 두 수의 나눗셈
 * 정수 num1과 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return 하도록 soltuion 함수를 완성해주세요.
 */
class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        val result = num1.toFloat() / num2.toFloat()
        return (result * 1000).toInt()
    }
}

fun main() {
    val sol = Solution()
    println(sol.solution(1, 16))
}

/**
 * 다른 사람의 풀이
 * (num1 / num2) / 1000 은, 분수로 표현할때 (num1 * 1000) / num2 와 동일하다.
 * 정수형 나누기는 자동으로 소수점 부분이 버려진다.
 * 
 * /// 코드
 * var answer: Int = 0
 * answer = (num1 * 1000) / num2
 * return answer
 */