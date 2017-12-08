import scala.annotation.ClassfileAnnotation

(x: Int) => x*x

(x: Int,y: Int) => x+y


var add = (x: Int,y: Int)=> x+y //add是一个具有函数类型的变量

add(1,2) //返回值：Int=3

def greeting() = (name:String) => {s"Hello $name"}

greeting()("World")

def greeting(age: Int) = (name:String) => {s"Hello $name,your age is $age"}

greeting(23)("Flygar")


var sum = (a : Int,b : Int) => a+b
sum(5,6)
var s = sum(6,7)

(a : Int) => a*2+1




  def sum(f : Int => Int , a : Int ,b : Int): Int =
    if (a > b) 0 else f(a) + sum(f,a+1,b)

  def square(x : Int ) : Int = x*x
  def powerOfTwo(x : Int) : Int = if( x == 0 ) 1 else 2 * powerOfTwo(x-1)

  def main(a : Array[String]): Unit = {
    /*将第一个函数参数设置为默认的求平方的函数，然后输入后面的a，b*/
    val f1 = sum(square,_ : Int , _ : Int)

    println(f1(2,5))


  }






