fun main() {
    /*
    List - списки.
    Set - множества.
    Map - пары (key - value).
     */

    // mutable - изменяемая
    // immutable - неизменяемая


    // Неизменяемый список
    var names: List<String> = listOf("Ivan","Petr")
    val names2: List<String> = listOf("Max","Maria")
    names = names2
  //  names[0] = "Oleg"
  //  names.add("Alex")

    // Изменяемый список
    val cities: MutableList<String> = mutableListOf("Msk","Kzn","Spb")
    cities[0] = "EKT"
    cities.add("Omsk")

    val countries = arrayListOf("RU","US","DE","CN")
    countries.add("JP")
    countries[0] = "GB"

    val cars = listOf("BMW","Toyota","Skoda")
    println(cars)
    println(cars.joinToString(" "))

    val cars2 = mutableListOf("BMW","Honda","Toyota")
    println(cars2)

    val list = buildList {
        add("Olga")
        add(names)
        add("Petr")
    }
    println(list)

    println(list.size)
    println(list.isEmpty())

    val students = listOf("Ivan","Olga","Julia")
    for(s in students) {
        print("$s ")
    }
    println()
    for(s in students.indices) {
        print("$s ")
    }
    println()
  //  val result = readln().split(" ").map { it.toInt() }
  //  val result2 = List(3){ readln() }
  //  println(result2)

    val products = mutableListOf("apple","banana","watermelon")
    val buy = listOf("milk","bread")
    products.addAll(buy)
    println(products)

    products.removeAt(0)
    products.remove("banana")
    products.clear()

    val visitors = setOf("Vlad","Oleg","Ivan","Maria","Oleg")
    println(visitors)
    val numbers = emptySet<Int>()
    println(numbers) // []

    val set2 = buildSet<Char> {
        add('a')
        add('b')
    }
    visitors.first()
    visitors.last()

    val productList1 = setOf("asdfad","sdfsdf", "aaa")
    val productList2 = setOf("dgfghfg","sdfgsdfg","aaa")
    val finalset = productList1 + productList2
    println(finalset)
    println(productList1-productList2)

    val fruits = listOf("Apple","Orange","Banana","Banana")
    println(fruits.toSet())

    val fruits2 = mutableSetOf("Apple","Orange","Banana","Banana")

    fruits2.add("Apple")
    println(fruits2)

    val persons = setOf("Alex","Natalya").toMutableSet()
    for(p in persons) {
        println(p)
    }
    println()
    var iterator = persons.iterator()
    while(iterator.hasNext()) {
        println(iterator.next())
    }

    val students2 = mapOf(
        "Zhenya" to 5,
        "Vlad" to 4,
        "Nina" to 5
    )
    println(students2)

    val studentsNames = mutableListOf("Ivan","Petr","Olga")
    val studentsMarks = mutableListOf(5,4,5)
    println("${studentsNames[0]}=${studentsMarks[0]}")

    println(students2["Nina"]) // 5


    val (name,grade) = Pair("Zhenya",4)
    val p = Pair("Ivan",3)
    println("${p.first}=${p.second}")

    val (name1, grade1) = "Vlad" to 4
    val values = mapOf<String,Int>("Second" to 2,"Third" to 3)
    val map2 = buildMap<String, Int>{
        put("First",2)
        put("Second",3)
    }

    for(m in map2) {
        println("${m.key}=>${m.value}")
    }
    for((k,v) in map2) {
        println("$k $v")
    }

    val staff = mutableMapOf(
        "Ivan" to 500,
        "Olga" to 700,
        "Maria" to 1000
    )
    staff["Ivan"] = 3000
    staff["Petr"] = 5000
    staff.put("Julia",400)
    println(staff)

    data class Person(val name: String, val age: Int) : Comparable<Person> {
        override fun compareTo(other: Person): Int {
            return this.age-other.age
        }
    }

    val peoples = listOf(
        Person("Alice",25),
        Person("Nick",24),
        Person("Bob",21),
        Person("Charlie",24)
        )
    val sortedPeoples = peoples.sorted()
    println(sortedPeoples)
    val rule = Comparator<Person> { o1, o2 -> o1.name.compareTo(o2.name)}.reversed()
    val rule2 = object: Comparator<Person>{
        override fun compare(o1: Person?, o2: Person?): Int {
            TODO("Not yet implemented")
        }
    }

    val sortedPeoples2 = peoples.sortedWith(rule)
    println(sortedPeoples2)


}