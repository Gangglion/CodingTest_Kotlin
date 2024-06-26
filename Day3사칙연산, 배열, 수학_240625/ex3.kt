/**
 * 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 
 * 정수 배열 array가 매개변수로 주어질 때, 최빈값을 return 하도록 solution 함수를 완성해보세요. 
 * 최빈값이 여러 개면 -1을 return 합니다.
 */

class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        var arraySet = array.distinct()
        var duplicateMap: MutableMap<Int, Int> = mutableMapOf()
        arraySet.forEach {
            duplicateMap[it] = 0
        }
        if(array.size == 1) { // 인자로 들어온 배열이 1개
            answer = array[0] // 최빈값의 갯수가 아니라 최빈값 자체를 return 해야함.
            // 기존 코드 - answer = 1
            // 반례 : array 에 0 이 들어왔을 경우에, 배열이 1개이므로 최빈값은 0이 되어야 하는데, 1로 고정시켜버려서 최빈값이 1이라는 에러가 생김
        } else if(array.size > 1 && array.size == arraySet.size) {
            answer = -1
        } else {
            // 각 원소별 중복된 갯수 구하기
            arraySet.forEach {
                var count = 0
                for(num in array) {
                    if(it == num) {
                        count++
                    }
                }
                duplicateMap[it] = count
            }
            // 최빈값 찾아서 리턴
            val maxValue = duplicateMap.maxByOrNull { it.value }!!
            if(duplicateMap.values.filter { it == maxValue.value }.size > 1) // 최빈값이 여러개일때
                answer = -1
            else
                answer = maxValue.key
        }
        return answer
    }
}

fun main() {
    val sol = Solution()
    println("최빈값 결과 : ${sol.solution(intArrayOf(0))}")
}

/*
groupBy : Map<K, List<V>> 형태로 반환됨. 키와 키에 해당하는 요소들을 리스트로 묶은 맵을 반환한다.
    Key 는 group 을 묶어줄 조건이고, value 는 key 조건에 만족하는 원소들 리스트 이다.
    { 1,2,2,3,3,3,4 } 일 경우, it을 넣었기 때문에 키는 it, 자기자신이 된다. value에 대한 조건이 따로 명시되어있지 않으므로, value 또한 it을 만족하는 요소들을 list 로 묶는다.
    키가 1일때, 요소는 전체 배열에서 1을 모두 묶어 value가 된다.
    따라서 위의 예시에서 groupBy를 수행할 경우, {1=[1], 2=[2, 2], 3=[3, 3, 3], 4=[4]} 와 같은 결과가 나온다.\

map { key 조건 to value 조건 } : 설정한 조건에 해당하는 Map 을 반환한다.
    1=[1], 2=[2, 2], 3=[3, 3, 3], 4=[4] 에서, .map { it.value.size to it.key } 를 수행한다면
    key 는 value의 사이즈, 각각 1,2,3,1 이 될것이고, value 는 1,2,3,4가 될 것이다.
    (1, 1) (2, 2) (3, 3) (1, 4) => 즉 key는 빈도수, value 는 해당 값이다.(1이 1번, 2가 2번, 3이 3번, 4가 1번 나왔다 로 이해할 수 있다)

sortedByDescending : 내림차순으로 정렬한 Collection 을 반환한다(return 이 존재한다)
    sortByDecending 도 있는데, 얘는 리턴값이 존재하지 않고, 원래의 Collection 을 바꾼다.
    sortedByDescending { it.first } 는 각 쌍의 첫번째 구성요소를 기준으로 내림차순하여 정렬한다.
    (3, 3) (2, 2) (1, 4) (1, 1) 정도로 정렬될 것이다.

first() : 코틀린에서 first 함수는 컬렉션 인자 중에서 첫번째 인자를 리턴한다. last 함수는 마지막 인자를 리턴하며, first/lastOrNull 을 사용하게 되면 null 을 리턴하도록 할 수도 있다.
    first() { 조건 } 의 형태로, 특정 조건을 만족하는 컬렉션중에 첫번째를 리턴하게 할 수 있다.

Map 에서 Map.second 는 value를 리턴한다. Map.first 는 key를 리턴한다.
*/