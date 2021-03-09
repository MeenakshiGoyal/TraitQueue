package queueTrait

trait Queue {

  def enqueue(Key: Int)    //for inserting element in a queue

  def dequeue()            // for removal of first index

  def getList(): List[Any] = ???     // to get list

}
