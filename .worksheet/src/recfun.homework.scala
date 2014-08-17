package recfun

import recfun.Main._

object homework {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(99); 
  println("Welcome to the Scala worksheet");$skip(17); val res$0 = 
  
  pascal(3,4);System.out.println("""res0: Int = """ + $show(res$0));$skip(28); val res$1 = 
  
  balance("())(".toList);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(33); val res$2 = 
  
  countChange(5, List(1,2,3));System.out.println("""res2: Int = """ + $show(res$2))}
}
