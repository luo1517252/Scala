package IOUntils

import java.io.{File, PrintWriter}

import scala.io.Source

object IOUntils{
  def readLineToList(url :String) : List[String]={
    //文件读取
    val file=Source.fromFile(url)
    val list = file.getLines().toList
    return list
  }

  def fileRead(url :String) :String={
    return Source.fromFile(url).mkString
  }

  def fileWrite(body :String,url :String) :Unit={
    val writer = new PrintWriter(new File(url))
    writer.write(body)
    writer.close()
    println("test 成功!")

  }

  def fileCopy(url :String,targetFileUrl :String):Unit={
    fileWrite(fileRead(url),targetFileUrl)
    println("文件复制 成功!")
  }
}

