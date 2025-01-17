/**
 * 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라 줍니다. 
 * 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면 
 * 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
 */

class Solution {
    fun solution(n: Int): Int {
        val gcd = if(n <= 6) getGcd(6, n) else getGcd(n, 6)
        var lcm = (n * 6) / gcd
        return if(lcm % 6 == 0) lcm / 6 else lcm / 6 + 1
    }

    fun getGcd(a: Int, b: Int) : Int {
        if(b == 0) return a
        else return getGcd(b, a % b)
    }
}

fun main() {
    Solution().apply{
        println("n = 6\n" + solution(6))
        println("n = 10\n" + solution(10))
        println("n = 4\n" + solution(4))
    }
}