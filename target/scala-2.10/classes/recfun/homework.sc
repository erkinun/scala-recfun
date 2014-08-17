package recfun

import recfun.Main._

object homework {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  pascal(3,4)                                     //> res0: Int = 4
  
  balance("())(".toList)                          //> res1: Boolean = false
  
  countChange(5, List(1,2,3))                     //> res2: Int = 5
}