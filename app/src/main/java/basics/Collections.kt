package basics

import android.os.Build
import androidx.annotation.RequiresApi

class Collections {
}

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    //Immutable arraylist "listof"
    val avengers = listOf("Thor","Ironman","Hulk","Vanda","Vision","Captain America")
    println(avengers)
    //add element
    println("========START OF IMMUTABLE ARRAYLIST======")
    println(avengers.get(3))
    println(avengers.indexOf("Thor"))
    println(avengers.sorted())
    println(avengers.reversed())
    println(avengers.first())
    println(avengers.last())
    println(avengers.contains("Hulk"))
    println("=======END OF IMMUTABLE ARRAYLIST=========\n")



    //Mutable Arraylist
    println("========START OF IMMUTABLE ARRAYLIST======")
    val superheros = arrayListOf("Spiderman","x-man","Batman","Superman","Antman","Aquaman")
    println(superheros)
    println(superheros.indexOf("Antman"))
    superheros.add("Ironman")
    println(superheros)
    superheros.add(3,"Hanuman")
    println(superheros)
    //removing element
    superheros.remove("Batman")
    println(superheros)
    //removing from specific index
    superheros.removeAt(5)
    println(superheros)
    println(superheros.indexOf("x-man"))

    println("========END OF MUTABLE ARRAYLIST===========\n")


    //IMMUTABLE MAP
    println("========START OF IMMUTABLE MAP======\n")
    val powers = mapOf("Thor" to "Hammer","Loki" to "Magic","Ironman" to "Suit","Doctor Strange" to "MagicCoat")
    println(powers)
    println(powers["Loki"])
    //get all keys
    println(powers.keys)
    //get all values
    println(powers.values)
    println(powers.getValue("Thor"))
    //set default value in case of no value available for the passed key in map
    println(powers.getOrDefault("Aquaman","Trishul"))
    println("========END OF IMMUTABLE MAP==========\n")


    //MUTABLE MAP
    println("========START OF MUTABLE MAP========\n")
    val superPowers = hashMapOf("Thor" to "Hammer","Loki" to "Magic","Ironman" to "Suit","Doctor Strange" to "MagicCoat")
    println(superPowers)
    //adding element along wth key
    superPowers.put("Spiderman","Strings")
    println(superPowers)
    //remove specific element using key
    superPowers.remove("Loki")
    println(superPowers)
    //delete all elements
    superPowers.clear()
    println(superPowers)



}