object ListToSetAndMapProgram {
  def main(args: Array[String]): Unit = {
    val myList = List(("Alice", 25), ("Bob", 30), ("Charlie", 22), ("David", 28))

    // Transform the list into a set
    val mySet = myList.toSet

    // Transform the list into a map
    val myMap = myList.toMap

    println("Original list:")
    myList.foreach(println)

    println("\nTransformed set:")
    mySet.foreach(println)

    println("\nTransformed map:")
    myMap.foreach { case (name, age) => println(s"$name -> $age") }
  }
}
