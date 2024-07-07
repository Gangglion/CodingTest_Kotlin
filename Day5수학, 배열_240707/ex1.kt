/**
 * Day5-1 : 옷가게 할인 받기
 * 
 * 머쓱이네 옷가게는 10만 원 이상 사면 5%, 30만 원 이상 사면 10%, 50만 원 이상 사면 20%를 할인해줍니다.
 * 구매한 옷의 가격 price가 주어질 때, 지불해야 할 금액을 return 하도록 solution 함수를 완성해보세요.
 * 
 * 입출력 예시
 * price : 150,000 / result : 142,500
 * price : 580,000 / result : 464,000
 */

 class Solution {
    fun solution(price: Int): Int {
        var answer: Int = 0
        when(price) {
            in 100000 until 300000 -> {
                answer = (price - (price * 0.05)).toInt()
            }
            in 300000 until 500000 -> {
                answer = (price - (price * 0.1)).toInt()
            }
            in 500000 .. Int.MAX_VALUE -> {
                answer = (price - (price * 0.2)).toInt()
            }
            else -> {
                answer = price
            }
        }
        return answer
    }
}

fun main() {
    println(Solution().solution(price = 580000))
}

/**
 * 각 자료형의 최대값은 T.MAX_VALUE 를 통해 사용이 가능하다.
 * 최소값은 T.MIN_VALUE 를 통해 사용 가능
 */