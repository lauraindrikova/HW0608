val myArr = Array(1,2,3,5,6)
println(myArr.length)
myArr.getClass
println(myArr(4))
myArr(myArr.length-1)
myArr.last
myArr(3) = 9000
myArr
myArr(4) = 56
myArr
val myArr1 = Array(3,32,52,2,6,1-66262,0)
myArr :++ Array(5,7,10)
myArr
myArr.min
myArr.max
myArr.reverse
val newArr = myArr :+ 65256
newArr.slice(2,4)
 val insertedArr = newArr.slice (0,5) :++ Array(10,20,30) :++ newArr.slice (2,4)
insertedArr
insertedArr.contains(10)
insertedArr.contains(11)
insertedArr.indexOf(10)
insertedArr(5)
insertedArr.product
insertedArr(10)
val mySeq = Seq(1,2,3,4,5,6)
mySeq
mySeq.min
mySeq.max
mySeq.getClass
import scala.collection.mutable

val myMutableSeq = mutable.ArrayBuffer (1,2,3,6,7,8)
myMutableSeq.product
myMutableSeq += 5000
myMutableSeq
myMutableSeq ++= Array (3,3,3,10)
myMutableSeq

val immutableSeq = myMutableSeq.toArray
immutableSeq









