def sum(f:Int => Int)(a:Int)(b:Int): Int ={
//sum是一个函数，定义了三个参数，f是一个内部的可变的函数
  @annotation.tailrec
  def loop(n:Int)(acc:Int):Int = {

    if(n > b){

      acc

    }

    else{

      loop(n+1)(acc+f(n))
      //a:1 b:5 n:2 acc:1
      //a:2 b:5 n:3 acc:5
      //a:3 b:5 n:4 acc:14
      //a:4 b:5 n:5 acc:30
      //a:5 b:5 n:6 acc:55
      //a:1 b:5 n:2 acc:1
    }

  }

  loop(a)(0)

}

sum(x => x)(1)(5)

sum(x => x*x)(1)(5)

val square = sum(x=>x*x)_

square(1)(3)


def fun(fx: Int =>Int)(a:Int)(b:Int)={

  def fun1(n:Int)(m:Int):Int={
    if (n>=b)100
    else fun1(n+1)(m+fx(n))
  }

}


