package edu.knoldus

class Sorting {

  def insertionSort(array: Array[Int]): Array[Int] = {
    //todo: Add Logic

      for(i <- 0 to array.length-1){
        var j=i-1
        var temp=array(i)
        while(j >= 0 && temp < array(j)){
          array(j+1) = array(j)
          j -=1
        }
        array(j+1)=j

      }

      array

  }

  def selectionSort(array: Array[Int]): Array[Int] = {
    //todo: Add Logic
    for (i <- 0 to array.length - 2) {
      var key = i
      for (j <- i + 1 to array.length-1) {
        if (array(j) < array(key)) {
          key = j
        }
        val temp = array(key)
       array(key) = array(i)
        array(i) = temp
      }
    }
    return array
  }

  def bubbleSort(array: Array[Int]): Array[Int]= {
    //todo: Add Logic

      for (i <- 0 until array.length - 1) {
        for (j <- 0 until array.length - i - 1) {
          if (array(j) > array(j + 1)) {
            val temp = array(j)
            array(j) = array(j + 1)
            array(j + 1) = temp
          }
        }
      }
      array



  }

}

