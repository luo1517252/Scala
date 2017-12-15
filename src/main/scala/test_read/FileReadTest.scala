package test_read
import scala.io.Source

/**
  * scala文件读取
  */
object FileReadTest {
  def main(args: Array[String]): Unit = {
    println("文件内容为:" )
    Source.fromFile("C:\\Users\\LuoJ\\Desktop\\detail-productdb-service.2017-11-29.log" ).foreach{
      print
    }
  }
}