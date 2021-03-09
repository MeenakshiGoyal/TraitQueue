package queueOperation

import queueTrait.Queue

class DoubleQueue extends Queue {
  var list: List[Any] = List()
  var front: Int = -1
  var rear: Int = -1
  // override enqueue method for insertion
  override def enqueue(Key: Int): Unit = {
    if (this.rear == -1) {
      this.front = front + 1
      this.rear = rear + 1

    }
    list = list ::: List(Key * 2)
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
object  double{
  def main(args: Array[String]) {
    val doubleQueue = new DoubleQueue()
    println("Queue elements are:")
    doubleQueue.enqueue(1)
    doubleQueue.enqueue(2)
    doubleQueue.enqueue(3)
    doubleQueue.enqueue(4)
    print(doubleQueue.getList())
    println()
    println("After removing first element then queue elements are :")
    doubleQueue.dequeue()
    println(doubleQueue.getList())
  }
}