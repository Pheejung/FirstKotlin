package com.example.firstkotlin

import com.example.myapplication.PersonKotlin
import org.junit.Assert
import org.junit.Test

class KotlinTest {
    @Test
    fun testGetterSetter() {
        /* val personKotlin = PersonKotlin("박희정")
        personKotlin.age = 20 // personKotlin.setAge(20)

        Assert.assertEquals("박희정", personKotlin.name)
        Assert.assertEquals("박희정", personKotlin.age)
          getName() X, getAge() X */

        val personKotlin = PersonKotlin("박희정")
        personKotlin.nickname = "ATAHO"
        Assert.assertEquals("ataho", personKotlin.nickname)
    }

    @Test
    fun testUser() {
        /* val user = User()
        user.nickname = "Ataho"
        Assert.assertEquals("ATAHO", user.nickname)
        println("not init")
        Assert.assertNotNull(user.httpText) */

        val user = User()
        user.name = "kotlin"
        user.name = "phj"
    }

    @Test
    fun testMap() {
        val animal = Animal(mutableMapOf("name" to "cat", "age" to 20 ))
        Assert.assertEquals("cat", animal.name)
        Assert.assertEquals(20, animal.age)
        animal.name = "dog"
        animal.age = 30
        Assert.assertEquals("dog", animal.name)
        Assert.assertEquals(30, animal.age)
    }

    @Test
    fun testSingleton() {
        SingletonKotlin.log("Test Singleton")
    }

    @Test
    fun testFruit() {
        val fruit1 = FruitKotlin("Banana", "Banana is Long")
        val fruit2 = FruitKotlin("Banana", "Banana is Long")

        // toString()
        println(fruit1)
        println(fruit2)
    }

    @Test
    fun testLambda() {
        println(sum(1,2))

        val exp1 = {x:Int, y:Int -> {
            z:Int -> (x+y)*z }
        }

        val exp2 = exp1(3,2)
        val result = exp2(4)
        println(result)
    }

    @Test
    fun testCollectionLambda() {
        val list = listOf(1, "2", 3, 4, 5.7, 1, 2) // Immutable

        // filter
        println(list.filter {item -> item is Int})
        println(list.filter {it is Int})

        // map
        println(list.map {"value : ${it}"})
        // println(list.map { item -> "value : ${item)" })

        //filter + map
        println(list.filter { it is Int }.map{"value : ${it}"})

        //find
        println(list.find { it is Double })

        //groupby
        val map = list.groupBy { it.javaClass }
        println(map)

        val list2 = listOf(listOf(1,2), listOf(3,4))
        println(list2)
        println(list2.map{ "value : ${it}"})

        //flatmap
        println(list2.flatMap { it.toList() })
    }

}