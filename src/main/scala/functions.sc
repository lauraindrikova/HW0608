import sun.font.TrueTypeFont

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
def getReversedUpper(text:String) = {
  println(s"Going to revers: $text")
  text.toUpperCase.reverse
}

def getSTringLength(text:String) = {
  text.length
}

getReversedUpper(text = "Beer")
getReversedUpper(text = "Valdis") == "SIDLAV"
getSTringLength("Valdis")

def getMax(a:Int, b:Int)= {
  if (a>b) {
    val myName = "Valdis"
    a * myName.length
  } else {
    val myName = "Laura"
    b * myName.length
  }
}

getMax(10,20)
getMax(5,3)

val a = 5
if (a == 2*2) {
  println("A is 4")
} else {
  println("A is not 4")
}

def isEqualTo4(a:Int): Boolean = {
  if (a == 2*2) {
    true
  } else {
    false
  }
}

isEqualTo4(4)
isEqualTo4(5)

5 >2*2
4 >= 2*2
5 != 4

val myName = "Laura"
if (myName == "Laura") {
  println("Now thats my Name")
}
println("This happens all the time")

def checkName (myName:String, friendName:String) = {
  if (myName == friendName) {
    println(s"Our name are the same my $friendName")
  } else {
    println("Lets be friends")
  }
}

checkName(myName = "Laura", friendName = "Laura")






