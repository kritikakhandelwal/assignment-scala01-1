package edu.knoldus

class Searching {

  def binarySearch(array: Array[Int], elem: Int,right:Int,left:Int): Boolean = {
    //todo: Add Logic
    if (right >= left) {
      val mid : Int =left + (right - left)/2
      if(array(mid)==elem)
        return true
      if(array(mid)>elem)
        return binarySearch(array, elem,mid-1,left )

      return binarySearch(array,elem,right,mid+1 );


    }

    return false
  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    //todo: Add Logic

      for (i <- 0 to array.length - 1) {
        if (array(i) == elem) // search element 1 by 1
        {
          return true
        }

      }
    false
  }


}
