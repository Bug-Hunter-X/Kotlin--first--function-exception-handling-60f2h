# Kotlin `first` Exception Handling

This example demonstrates a common error in Kotlin when using the `first` function on a collection.  The `first` function throws a `NoSuchElementException` if no element in the collection satisfies the given predicate.

The `bug.kt` file contains code that demonstrates this issue.  The `bugSolution.kt` file shows how to safely handle this potential exception using `firstOrNull`. 

## How to reproduce

1.  Clone this repository.
2.  Open the `bug.kt` file.
3.  Run the code.  You'll see a `NoSuchElementException` being thrown.