```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val doubledList = list.map { it * 2 }
    println(doubledList)
    // Safe handling using firstOrNull
    val firstEven = doubledList.firstOrNull { it % 2 == 0 }
    println(firstEven)
    //Another approach
    val firstEven2 = doubledList.find { it % 2 == 0 }
    println(firstEven2)
}
```