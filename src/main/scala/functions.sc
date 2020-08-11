def print2():Unit = {
println("One Line")
println("Second Line")
}
print2()
print2()

def add(a:Int, b:Int): Unit = {
  val result = a+b
  println(a+b)
  result
}

add(5,10)
add(500,210)

def mult(a:Int, b:Int):Int = {
  a*b
}

mult(6,10)+10+100

def multAny(a:Double, b:Double): Double={
  a*b
}
multAny(9.11,3.14)
multAny(18,2)

def addAndMultiply(a:Double, b:Double, c:Double)= {
  add(multAny(a, b).toInt,multAny(b, c).toInt)
}

val myResult = addAndMultiply(3,4,5)
println(myResult)

var myMutable = 10
def mutateOutside () = {
  myMutable += 5
  println(myMutable)
}


  def add5(a: Int) = {
  a+5
//  last line is returned automatically no need fpr return
}

myMutable
myMutable = add5(myMutable)
myMutable





