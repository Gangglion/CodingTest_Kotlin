/**
 * Day5-4 : 배열 뒤집기
 * 
 * 정수가 들어 있는 배열 num_list가 매개변수로 주어집니다. 
 * num_list의 원소의 순서를 거꾸로 뒤집은 배열을 return하도록 solution 함수를 완성해주세요.
 * 
 * 입출력 예시
 * num_list = [1,2,3,4,5] / result = [5,4,3,2,1]
 * num_list = [1,1,1,1,1,2] / result = [2,1,1,1,1,1]
 * num_list = [1,0,1,1,1,3,5] / result = [5,3,1,1,1,0,1]
 */

 class Solution {
    fun solution(num_list: IntArray): IntArray {
        var answer = num_list.reversed()
        num_list.forEach {
            print("$it ")
        }
        println()
        return answer
    }
}

fun main() {
    val ex1 = intArrayOf(1,2,3,4,5)
    val ex2 = intArrayOf(1,1,1,1,1,2)
    val ex3 = intArrayOf(1,0,1,1,1,3,5)
    val answer = Solution().solution(ex1)
    answer.forEach {
        print("$it ")
    }
    println()
}

/**
 * 배열, 리스트 형태에 순서를 역순으로 바꾸는 reverse 함수.
 * reverse() : 전체 요소 역순으로 바꿔줌
 * reverse(fromIndex: Int, toIndex: Int) : fromIndex 부터 toIndex 전 까지의 부분만 역순으로 바꿔줌
 * 1,2,3,4,5 기준 reverse() -> 5,4,3,2,1
 *               reverse(1, 4) -> 1,4,3,2,5 // 1~3범위내의 요소를 역순으로 변경
 * reverse 로 사용할 경우, 리턴값 없이 원래의 배열 자체를 변경해줌
 * reversed 로 사용할 경우, 변경된 배열을 리턴해주고, 원래의 배열은 원래 형태 유지. 리턴값은 List 형태로 리턴
 * reversedArray 를 사용할 경우, reversed 와 동일하지만, 리턴값이 Array 형태로 리턴됨
 */