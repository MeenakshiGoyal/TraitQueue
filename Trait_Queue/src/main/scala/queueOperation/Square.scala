package queueOperation

import queueTrait.Queue

class SquareQueue extends Queue {
  var list: List[Any] = List()
  var front: Int = -1
  var rear: Int = -1
  // override enqueue method for insertion
  override def enqueue(Key: Int): Unit = {
    if (this.rear == -1) {
      this.front = front + 1
      this.rear = rear + 1

    }
    list = list ::: List(Key*Key)
    this.rear = list.length;
  }
  // To get elements of queue in a list
  override def getList(): List[Any]={
    list
  }


  // override dequeue to perform deletion
  override def dequeue() = {

    if (this.front == -1) {      //If queue is null
      print("Queue is Underflow")

    }
    if(front==rear ) {           //If queue have only one element
      front = -1
      rear = -1
      list = list.drop(1)
    }
    else{
      list = list.drop(1)
      front = +1
    }
  }
}
object  square{
  def main(args: Array[String]) {
    val squareQueue = new SquareQueue()
    println("Queue elements are:")
    squareQueue.enqueue(1)
    squareQueue.enqueue(2)
    squareQueue.enqueue(3)
    squareQueue.enqueue(4)
    print(squareQueue.getList())
    println()
    println("After removing first element then queue elements are :")
    squareQueue.dequeue()
    println(squareQueue.getList())
    }
    }