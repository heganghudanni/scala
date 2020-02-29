package com.atguigu
import scala.collection.mutable
import scala.collection.mutable.Map
object MapTest {
  def main(args: Array[String]): Unit = {
   // val map = scala.collection.mutable.Map("hg"->10,"tom"->100,"danini"->100)
    //val map: mutable.Map[String, Int] = scala.collection.mutable.Map[String,Int]()
    var map: mutable.Map[String, Int] = scala.collection.mutable.Map[String,Int]()
    map+=(("hg",1000))
    map+=(("pengfei",90))
    map+=(("chenliu",300))

    println(map)
    for ((k,v) <- map) {
     // map(k)=map(k)-100
      if(k.startsWith("h")){
        map(k)=map.getOrElse(k,888)+1000
      }
    }

    println(map)

//    if(map.contains("hg")) 通过key的值来判断是否有
//      println(map("hg"))
//    else
//      println("不存在")

    //println(map.getOrElse("hu","shuige"))
    //map+=(("hu",99))//map添加元素用+的方法

   // println(map)

  }

}
