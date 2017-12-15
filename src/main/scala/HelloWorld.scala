import IOUntils.IOUntils

object HelloWorld {
  /* This is my first java program.
  * This will print 'Hello Worl}d' as the output
  */
  val pattern =
    """^\d{2}-\d{2} \d{2}:\d{2}:\d{2} \d{3} ([a-z]+)-""".r

  def main(args: Array[String]) {
    println("Hello, world!") // prints Hello World
    val file = "C:\\Users\\LuoJ\\Desktop\\detail-productdb-service.2017-11-29.log"
    val lists = IOUntils.readLineToList(file)
   // val head = Array{}
//    lists.map(x => if (pattern.equals(x))println(x))
    for(list <- lists){
      list match {
        case pattern(bc) => println(bc)
        case _ =>
      }
    }

    //lists.foreach( x => if (pattern.==(x))println(x) )
    //println(list)
    //val list1 = list.map(_.split(" ",5)).tail
    //list1.foreach(list=> println(list(2)))

  }
}