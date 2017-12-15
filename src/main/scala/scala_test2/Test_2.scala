package scala_test2

import scala.io.Source
import scala.collection.mutable.{ArrayBuffer, ListBuffer}

object Test_2 extends App {
  val file = "C:\\Users\\LuoJ\\Desktop\\detail-productdb-service.2017-11-29.log"
  val list = Source.fromFile(file).getLines().toList

  val arr = ArrayBuffer[String]()//定义一个ArrayBuffer

  //按每一条记录分割为一条元素
  list.map(x => if (x.contains("trans-pool-1-thread-") || x.contains("qbScheduler-")) arr += x else arr(arr.length - 1) += x)

  val list2 = arr.map(_.split(" ", 6))//按空格分割，切到第6个空格。返回二维数组

  val buffList = new ListBuffer[(String, Int)]

  for (i <- 0 to list2.length - 1) {
    val ll = list2(i)(5).split(" ").filter(_.contains("com.")).filter(!_.contains("header")).map(_.replaceAll("\\(|\\)|\\:|\\[|\\]", "")).map(_.split("\\@")(0))
    if (ll.length > 0) {
      buffList.append((ll(0), list2(i)(2).toInt))
    } else {
      buffList.append(("无服务", list2(i)(2).toInt))
    }
  }

  val groupList = buffList.groupBy(_._1).map(x => (x._1, x._2.size))

  for (s <- groupList) {
    if(s._1!="无服务"){
      println("服务名： " + s._1 + "    调用次数： " + s._2 + "次")
    }
  }
    print(groupList.size)
}
