package com.atguigu

import scala.collection.mutable.ListBuffer

object ListBufferTest {
  def main(args: Array[String]): Unit = {
    //val list0: (Seq[Int]) => ListBuffer[Int] = ListBuffer[Int] 不报错，这是什么意思
//    val list0: ListBuffer[Int] = ListBuffer[Int]()
//    list0.append(1)
//    println(list0)
//    val list1: ListBuffer[Int] = list0:+5
//    list1.foreach(println)
//    val f1 = (n1:Int,n2:Int) => n1 + n2
//    println(f1(10,20))
    val list: ListBuffer[Int] = ListBuffer[Int]()
    list.append(1)
    list.append(2)
    list.append(3)
    list.append(4)
    println(list)
    //val sum: (Nothing) => Any = x => x+1
    val SUM: (Int) => Int = (x:Int) => x+1//可以省略为sum=(x:Int)=>x+1
    list.foreach(SUM)
    list.foreach(println)


  }
}
