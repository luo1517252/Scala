package test_write


import java.io.File
import java.io.PrintWriter


/**
  * scala文件写入
  */
object FileWriteTest{

  def main(args: Array[String]): Unit = {
    val writer = new PrintWriter(new File("C:\\Users\\LuoJ\\Desktop\\test.txt" ))
    writer.write("利用java类文件输入")
    writer.close()
    println("test 成功!")

  }
}