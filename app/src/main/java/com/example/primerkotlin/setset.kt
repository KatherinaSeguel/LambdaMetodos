package com.example.primerkotlin

fun main(){ // en los set no pueden haber elementos duplicados

    val openIssues: MutableSet<String> = mutableSetOf("unicades",
    "unicaDescri1",
    "unicaDescri2")
    println(openIssues.size)
    println(openIssues)

fun addIssue(uniqueDesc:String):Boolean{
    return  openIssues.add(uniqueDesc)
}

println(addIssue("unaDescripcio55"))
    println(addIssue("unaDescripcio66"))
    println(addIssue("uniqueDescr3"))
    println(addIssue("uniqueDescr9"))

}