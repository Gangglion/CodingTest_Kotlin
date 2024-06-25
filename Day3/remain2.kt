/**
 * 복습 :: 분수의 덧셈
 * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 
 * 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 */

 fun main() {
    val set = mutableSetOf<Int>()
    set.add(1)
    set.add(2)
    set.add(3)

    println(set.elementAt(0))
    set.remove(1)
    for(i in set) print("$i  ")
    println("")
    println(set.elementAt(0))
 }