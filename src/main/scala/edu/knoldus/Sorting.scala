package edu.knoldus

class Sorting {

  //BUBBLE SORT

  def bubbleSort(array: Array[Int]):Array[Int] = {
    for (i <- 0 until array.length - 1)
      for (j <- 0 until array.length - 1 - i) {
        if (array(j) > array(j + 1)) {
          val temp = array(j)
          array(j) = array(j + 1)
          array(j + 1) = temp
        }
      }
  array
  }

  // SELECTION SORT

  def selectionSort(array: Array[Int]):Array[Int] ={
    for (i <- 0 until array.length) {
      for (j <- i + 1 until array.length) {
        if (array(j) < array(i)) {
          val temp = array(i)
          array(i) = array(j)
          array(j) = temp
        }
      }
    }
    array
  }

  //INSERTION SORT

  def insertionSort(array: Array[Int]): Array[Int] = {
    for (i <- 1 until array.length) {
      val element = array(i)

      var temp = i
      while (temp > 0 && array (temp - 1) > element) {

        // MOVE TEMP TO NEXT SMALLER INDEX

        array (temp) = array (temp - 1)
        temp = temp - 1
      }
      //PUT ELEMENT IN THE TEMP

      array (temp) = element
    }

    array

  }
}



