/**
 * 분수의 덧셈
 * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 
 * 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */

 class Solution {
    fun solution(numer1: Int, denom1: Int, numer2: Int, denom2: Int): IntArray {
        var numer: Int = 0
        var denom: Int = 0
        if(denom2 % denom1 == 0) {
            denom = denom2
            numer = (numer1 * (denom2 / denom1)) + numer2
        } else {
            denom = denom1 * denom2
            numer = (numer1 * denom2) + (numer2 * denom1)
        }
        val gcdNum = if(numer > denom) gcd2(numer, denom) else gcd2(denom, numer)
        var answer: IntArray = intArrayOf(numer / gcdNum, denom / gcdNum)
        return answer
    }

    fun gcd(a: Int, b: Int): Int {
        if(b == 0) return a
        return gcd(b, a%b)
    }

    fun gcd2(a: Int, b: Int) : Int {
        var a = a
        var b = b
        while(b != 0) {
            val temp = b
            b =  a % b
            a = tmp
        }
        return a
    }
}

fun main() {
    val sol = Solution()
    val answer = sol.solution(4,7,9,2)
    println("${answer[0]} // ${answer[1]}")
}

/**
 * 기약분수 - 분자와 분모의 공약수가 1뿐이라 더 이상 약분되지 않은 분수
 * 유클리드 호제법(gcd) 이용 : 서로 나눔
 * 정의 : A 가 B 보다 커야함, A를 B로 나눈 나머지를 r 이라 할때 A와 B의 최대공약수는 B와 r의 최대공약수와 같다. => gcd(A, B) == gcd(B, r)
 * gcd(B, r) 에 대해 r 이 0 이라면 최대공약수는 나누는 수 B가 된다.
 * 
 * 알고리즘 풀이
 * 1. 매개변수로 a, b를 받는다(이때 a는 b보다 커야한다)
 * 2. b 가 0이라면, a가 최대공약수가 된다 -> b가 0일때 a리턴
 * 3. b 가 0이 아니라면, 재귀함수로 b와 a % b를 전달하여 다시 실행한다.
 * 4. b자리에 0이 들어갈때까지 반복한다.
 * 
 * 
 * 방법 1 : 재귀함수 리턴
    fun gcd(a: Int, b: Int): Int {
        if(b == 0) return a
        return gcd(b, a%b)
    } 
 * 
 * 방법 2 : 반복문
 *     fun gcd2(a: Int, b: Int) : Int {
        var a = a
        var b = b
        while(b != 0) {
            val temp = b
            b =  a % b
            a = tmp
        }
        return a
    }
 * 
 * 응용 : 최소공배수 구하기(lcd)
 * 최대공약수 이용. 두 수의 곱 / 최대공약수
 */