/*
    정수 배열 numbers가 매개변수로 주어집니다. 
    numbers의 원소의 평균값을 return하도록 solution 함수를 완성해주세요.
*/

class Solution {
    fun solution(numbers: List<Int>): Double {
        // var answer: Double = 0.0
        // val arraySum = numbers.sum()
        // answer = arraySum.toDouble() / numbers.size
        // return answer
        return numbers.average()
    }
}

fun main() {
    val ex1 = intArrayOf(1,2,3,4,5,6,7,8,9,10)
    val ex2 = intArrayOf(89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99)
    val ex3 = listOf(89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99)
    val ex4 = setOf(89, 90, 91, 92, 93, 93, 93, 93, 97, 98, 99)
    val ex5 = mapOf(
        1 to 1,
        2 to 2,
        3 to 3,
        4 to 4,
        5 to 5,
        6 to 6,
        7 to 7,
        8 to 8,
        9 to 9
    )
    println(Solution().solution(ex5.values.toList()))
}

/*
    코틀린에는 average 함수를 사용 가능하다.
    기본 자료형과 컬렉션 요소에 있는 원소의 평균값을 Double 형으로 출력해준다.
    컬렉션 요소에 대해서는 iterable 인터페이스를 구현하는것은 대부분이지만, 
    Map 자체에서는 iterable 을 지원하지 않고, key 나 value 에 대해서는 iterable 을 통해 데이터에 순차적으로 접근이 가능하다
    Map 에서 value 만 뽑는 함수는 Map.values 이고, Collection<T> 의 형태로 리턴된다.(toList() 를 통해 리스트로 바꿀 수 있다)
*/