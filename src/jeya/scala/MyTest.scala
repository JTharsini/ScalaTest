package jeya.scala

import scala.io.StdIn.{readLine, readInt}
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source

/**
  * Created by Jeyatharshini on 6/24/2016.
  */

/*object HelloWorld {
  def main(args: Array[String]):Unit={print("Hello World!!")}
}*/

/*package MyTest

object scala extends App{
  println("Miyaav")
}
*/

object MyTest
  {
    def main(args:Array[String]): Unit = {
      println("Miyaav")

      var lgprime = BigInt("65546564644444444444444444444444")
      lgprime = lgprime + 1
      println("lgprime: " + lgprime)

      val ri = BigDecimal("4.8888888888888888888888888888888888888888888855555555555555555")
      println("ri: " + ri)

      println("abs(-8): " + abs(-8))
      println("cbrt(64): " + cbrt(64))
      println("sqrt(64): " + sqrt(64))
      println("ceil: " + ceil(5.36336))
      println("round: " + round(5.36336))
      println("floor: " + floor(5.36336))
      println("exp(1): " + exp(1))
      println("pow(2,4): " + pow(2, 4))
      println("hypot(2,2): " + hypot(2, 2))
      println("log10(1000): " + log10(1000))
      println("log(2.7182818284590455): " + log(2.7182818284590455))
      println("min(5,10): " + min(5, 10))
      println("max(1,1000): " + max(1, 1000))
      println("(random * (11 - 1) + 1).toInt: " + (random * (11 - 1) + 1).toInt)
      println("toRadians(90): " + toRadians(90))
      println("toDegrees(1.5707963267948966): " + toDegrees(1.5707963267948966))

      val age = 18
      val canVote = if (age >= 18) "yes" else "no"
      println("if(age >= 18) yes else no: " + canVote)

      if ((age >= 5) && (age <= 6)) {
        println("Go to kindergarten")
      }
      else if ((age > 6) && (age <= 7)) {
        println("Go to grade 1")
      }
      else {
        println("Go to grade " + (age - 5))
      }

      println("true || false: " + (true || false))
      println("true && false: " + (true && false))

      println("while-loop")
      var i = 1
      while (i <= 10) {
        println("i : " + i)
        i += 1
      }

      println("do-while-loop")
      i = 1;
      do {
        println("i : " + i)
        i += 1
      }
      while (i <= 5)

      println("for-loop : to")
      for (i <- 1 to 5) {
        println("i : " + i)
      }

      val randLetters = "tharsi"
      println("for-loop : until")
      for (i <- 0 until randLetters.length) {
        println("randLetters(" + i + ") : " + randLetters(i))
      }

      val aList = List("E", "D", "C", "B", "A")
      println("for-loop : List")
      for (i <- aList) {
        println("List : " + i)
      }

      println("for-loop : With condition")
      var evenList = for {i <- 1 to 10
                          if (i % 2) == 0
      } yield i

      for (i <- evenList) {
        println(i)
      }

      /* println("i <- 1 to 3; j <- 1 to 3")
      for(i <- 1 to 3; j <- 1 to 3)
      {
        println("i : " + i + " - j : " + j)
      }*/

      println("i <- 1 to 3; j <- 1 to 3")
      for (i <- 1 to 3) // equals to for(i <- 1 to 3; j <- 1 to 3)
      {
        for (j <- 1 to 3) {
          println("i : " + i + " - j : " + j)
        }
      }

      println("Print primes:")
      def printPrimes(): Unit = {
        val primeList = List(1, 2, 3, 5, 7, 11)
        for (i <- primeList) {
          if (i == 11) {
            return
          }
          if (i != 1) {
            println(i)
          }
        }
      }
      printPrimes

      println("Read input from console: ")
      var numberGuess = 0
      do {
        print("Guess a number: ")
        numberGuess = readLine.toInt
        // readInt, readDouble, readBytes, readShort, readLong
      }
      while (numberGuess != 15)

      printf("You guessed the secret number %d\n", 15)

      val name = "Jeya"
      val _age = 39
      val weight = 175.5

      println(s"Hello $name") // $name can't be interpreted
      // from string value, unless there is s

      println(f"I am ${_age + 1} and weigh $weight%.2f")
      // to use float
      // %c - char, %d - integer, %f - float, %s - string

      printf("With 5 character space from left side: '%5d'\n", 5)
      printf("With 5 character space from right side: '%-5d'\n", 5)

      printf("With 5 character 0 from left side: '%05d'\n", 5)
      printf("With 5 decimal places: '%.5f'\n", 3.14)
      printf("With 5 space include text: '%-5s'\n", "hi") // \b

      printf("String operations: \n")
      var randSent = "a dragon"
      println("3rd index: " + randSent(3))
      println("String length: " + randSent.length)
      println("String concatenate: " + randSent.concat(" and explode"))
      println("String equals: " +
        "I saw a dragon fly by".equals(randSent))
      println("String index of: " +
        randSent.indexOf("dragon"))

      var randSentArray = randSent.toArray
      println("String To array: ")
      for (v <- randSentArray) {
        println(v)
      }

      println("Functions with parameter and return value: ")
      // 1 : default value
      def getSum1(num1: Int = 1, num2: Int = 1): Int = {
        println("num1: " + num1 + ", num2: " + num2)
        //return num1 + num2
        num1 + num2 // return keyword is optional
      }
      println("5 + 4 = " + getSum1(5, 4))
      println("Default() = " + getSum1())
      println("Default() = " + getSum1(num2 = 6, num1 = 3))

      println("Functions without parameter and return value: ")

      def sayHi(): Unit = {
        println("Hi how are you")
      }
      sayHi

      println("Functions with Int*: ") // able to accept 0 or many
      // integer arguments
      def getSum(args: Int*): Int = {
        var sum: Int = 0
        for (num <- args) {
          sum += num
        }
        sum
      }

      println("Get sum : " + getSum(1, 2, 3, 4, 5))
      println("Get sum : " + getSum())

      def factorial(num: BigInt): BigInt = {
        if (num <= 1) 1
        else num * factorial(num - 1)
      }
      println("Factorial of 4 = " + factorial(4))

      println("Array operations: ")
      val friends = Array("Bob","Tom")
      friends(0) = "Sue"
      println("Best friends : " + friends(0))

      println("ArrayBuffer operations: ")
      val friends2 = ArrayBuffer[String]()
      friends2.insert(0,"Phil")
      friends2 += "Mark"
      friends2 ++= Array("Susy", "Paul")
      // insert two elements : "++"

      friends2.insert(1, "Mike", "Sally", "Sam", "Mary", "Sue")
      friends2.remove(1,2)

      var friend: String = " "

      println("ArrayBuffer: ")
      var j = 0
      for(friend <- friends2)
      {
        println(j + " : " + friend)
        j += 1
      }

      println("FavNums: ")
      val favNums = new Array[Int](5)
      for (j <- 0 to (favNums.length - 1))
      {
        favNums(j) = j
        println(favNums(j))
      }

      println("favNumsTimes2 = favNums * 2: ")
      val favNumsTimes2 = for(num <- favNums)
        yield 2 * num

      favNumsTimes2.foreach(println)

      println("favNumsDiv4 = favNums % 4: ")
      var favNumsDiv4 = for(num <- favNums
      if num % 4 == 0)
        yield num

      favNumsDiv4.foreach(println)

      println("multi-dimensional array: ")
      var multTable = Array.ofDim[Int](3,3)

      for(i <- 0 to 2)
      {
        for(j <- 0 to 2)
        {
          multTable(i)(j) = i * j
        }
      }
      for(i <- 0 to 2)
      {
        for(j <- 0 to 2)
        {
          printf("%d : %d = %d\n",i,j, multTable(i)(j))
        }
      }

      println("Sum : " + favNums.sum)
      println("Min : " + favNums.min)
      println("Max : " + favNums.max)

      val sortedNums = favNums.sortWith(_>_)
      println(sortedNums.deep.mkString(", "))

      println("Map operations: ")
      // mutable
      var employees = Map("Manager" -> "<Manager Name>",
        "Secretary" -> "<Secretary Name>")

      if(employees.contains("Manager"))
      {
        printf("Manager : %s\n",employees("Manager"))
      }

      val customers = collection.mutable.Map(100 -> "100Value",
        101 -> "101Value")

      printf("Cust 1 : %s\n", customers(100))
      printf("Cust 2 : %s\n", customers(101))

      customers(100) = "100NewValue"
      customers(102) = "102Value"

      for((k,v) <- customers)
        printf("%d : %s\n",k,v)

      println("tuple operations: ")
      // immutable : tuple
      var tupleMarge = (103, "103value", 10.25)
      printf("%s owes us $%.2f\n",tupleMarge._2, tupleMarge._3)

      tupleMarge.productIterator.foreach{
        i => println(i)
      }

      println(tupleMarge.toString())

      val rover = new Animal
      rover.setName("Rover")
      rover.setSound("Woof")
      printf("%s says %s\n", rover.getName(), rover.getSound())

      val whiskers = new Animal("Whiskers", "Meow")
      println(s"${whiskers.getName()} with the id ${whiskers.id} says ${whiskers.sound}")
      println(whiskers.toString())
    } // END OF MAIN

    class Animal(var name: String, var sound: String)
    {
      this.setName(name)
      val id = Animal.newIdNum // static attribute
      // protected var name = "No Name": by doing this override

      def getName() : String = name
      def getSound() : String = sound

      def setName(name : String): Unit =
      {
        // should not contain number or decimal
        if(!(name.matches(".*\\d+.*")))
        {
          this.name = name
        }
        else {
          this.name = "No Name"
        }
      }

      def setSound(sound: String): Unit =
      {
        this.sound = sound
      }

      def this(name : String) // constructor
      {
        this("No Name", "No Sound")
        this.setName(name)
      }

      def this()
      {
        this("No Name", "No Sound")
      }

      override def toString() : String = {
        return "%s with the id %d says %s".format(
          this.name, this.id, this.sound)
      }
    }

    // need to create separate for static variable's
    // operation
    object Animal{
      private var idNumber = 0
      private def newIdNum = {idNumber += 1; idNumber}
    }

    class Dog(name: String, sound : String, growl: String)
    extends Animal(name, sound)
    {

    }
  }