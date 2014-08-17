package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if ( c == 0 ) 1 
    else if ( c == r ) 1
    else {
      pascal(c-1, r-1) + pascal(c, r-1)
    }
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {
    
    def balanceInner(chars: List[Char], acc: Int): Boolean = {
      if ( chars.isEmpty  ){
        if ( acc == 0 ) true
        else false
      }
      else{
        
        if ( acc < 0  ) false
        else{
        	if ( chars.head == '(' ) balanceInner(chars.tail, acc + 1)
        	else if ( chars.head == ')' ) balanceInner(chars.tail, acc - 1)
        	else balanceInner(chars.tail, acc)
        
        }
        
      }
    }
    
    if ( chars.isEmpty ) true
    else{
    	balanceInner(chars, 0)
    }
    
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    
    def countInner(money: Int, coins: List[Int]): Int = {
      if ( money == 0 ) 1
      else if (money < 0) 0
      else if ( coins.isEmpty ) 0 
      else{
        countInner(money - coins.head, coins) + countInner(money, coins.tail)
      }
    }
    
    if ( money == 1 ) 1
    else if ( coins.isEmpty ) 0
    else{
      countInner(money, coins)
    }
  }
}
