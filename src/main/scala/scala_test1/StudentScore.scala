package scala_test1

object StudentScore{
  def main(args: Array[String]) {
    val s1a =new Student(id=1,name="Bob",age=12,sex="男",chinese=87,math=95.5,english=66,clazz=1)
    val s1b =new Student(id=2,name="Mike",age=11,sex="女",chinese=93,math=88,english=83,clazz=1)
    val s1c =new Student(id=3,name="Mary",age=13,sex="女",chinese=86,math=75.5,english=95,clazz=1)
    val s1d =new Student(id=4,name="Lili",age=12,sex="男",chinese=85,math=78.5,english=69,clazz=1)
    val s1e =new Student(id=5,name="Marria",age=12,sex="男",chinese=87,math=95.5,english=66,clazz=1)
    val s1f =new Student(id=6,name="Linda",age=12,sex="男",chinese=87,math=95.5,english=56,clazz=1)
    val s1g =new Student(id=7,name="Mic",age=11,sex="女",chinese=93,math=88,english=83,clazz=1)
    val s1h =new Student(id=8,name="Fangfang",age=12,sex="女",chinese=86,math=75.5,english=95,clazz=1)
    val s1i =new Student(id=9,name="Stan",age=12,sex="男",chinese=85,math=78.5,english=69,clazz=1)
    val s1j =new Student(id=10,name="Luoiy",age=12,sex="男",chinese=87,math=95.5,english=66,clazz=1)

    val s2a =new Student(id=11,name="龙井",age=12,sex="男",chinese=87,math=75.5,english=76,clazz=2)
    val s2b =new Student(id=12,name="碧螺春",age=12,sex="女",chinese=82,math=91.5,english=86,clazz=2)
    val s2c =new Student(id=13,name="乌龙",age=11,sex="男",chinese=67,math=65.5,english=96,clazz=2)
    val s2d =new Student(id=14,name="黑茶",age=12,sex="女",chinese=82,math=77,english=66,clazz=2)
    val s2e =new Student(id=15,name="红茶",age=13,sex="男",chinese=87,math=92.5,english=68,clazz=2)
    val s2f =new Student(id=16,name="发酵茶",age=12,sex="男",chinese=97,math=94.5,english=76,clazz=2)
    val s2g =new Student(id=17,name="普洱",age=11,sex="女",chinese=57,math=93.5,english=56,clazz=2)
    val s2h =new Student(id=18,name="白茶",age=12,sex="男",chinese=87,math=85.5,english=69,clazz=2)
    val s2i =new Student(id=19,name="铁观音",age=12,sex="男",chinese=67,math=95.5,english=66,clazz=2)
    val s2j =new Student(id=20,name="冰红茶",age=12,sex="男",chinese=69,math=85.5,english=86,clazz=2)

    val s3a =new Student(id=21,name="小青龙",age=12,sex="男",chinese=77,math=75.5,english=74,clazz=3)
    val s3b =new Student(id=22,name="陈奕迅",age=12,sex="女",chinese=82,math=91.5,english=86,clazz=3)
    val s3c =new Student(id=23,name="周杰伦",age=11,sex="男",chinese=87,math=65.5,english=76,clazz=3)
    val s3d =new Student(id=24,name="周华健",age=12,sex="女",chinese=82,math=87,english=66,clazz=3)
    val s3e =new Student(id=25,name="陈翔",age=13,sex="男",chinese=89,math=92.5,english=66,clazz=3)
    val s3f =new Student(id=26,name="张杰",age=12,sex="男",chinese=87,math=74.5,english=76,clazz=3)
    val s3g =new Student(id=27,name="周笔畅",age=11,sex="女",chinese=57,math=91.5,english=66,clazz=3)
    val s3h =new Student(id=28,name="夏宇",age=12,sex="男",chinese=97,math=85.5,english=69,clazz=3)
    val s3i =new Student(id=29,name="涂亚松",age=12,sex="男",chinese=67,math=95.5,english=86,clazz=3)



    val clazz1 =List(s1a,s1b,s1c,s1d,s1f,s1g,s1g,s1h,s1i,s1j)
    val clazz2 =List(s2a,s2b,s2c,s2d,s2f,s2g,s2g,s2h,s2i,s2j)
    val clazz3 =List(s3a,s3b,s3c,s3d,s3f,s3g,s3g,s3h,s3i)

    topFive(clazz1)
    topFive(clazz2)
    topFive(clazz3)

    val listAll = clazz1:::clazz2:::clazz3
    avgChinese(listAll)
    avgMath(listAll)
    avgEnglish(listAll)

    group(listAll)

    top20Total(listAll)

    top1(listAll)

  }


  def topFive(s :List[Student]):Unit={
    topFiveChinese(s)
    topFiveMatch(s)
    topFiveEngilsh(s)
    topFiveTotal(s)
  }

  def group(s :List[Student]):Unit={
    groupChinese(s)
    groupMath(s)
    groupEnglish(s)
  }

  def topFiveChinese(s:List[Student]): Unit={
    val d= s.sortWith((a:Student,b:Student) => a.chinese>b.chinese)
    println(d(0).clazz+"班的语文成绩排名：")
    println("语文成绩第一名："+"姓名："+d(0).name+"  成绩："+d(0).chinese)
    println("语文成绩第二名："+"姓名："+d(1).name+"  成绩："+d(1).chinese)
    println("语文成绩第三名："+"姓名："+d(2).name+"  成绩："+d(2).chinese)
    println("语文成绩第四名："+"姓名："+d(3).name+"  成绩："+d(3).chinese)
    println("语文成绩第五名："+"姓名："+d(4).name+"  成绩："+d(4).chinese)
  }
  def topFiveMatch(s:List[Student]): Unit={
    val d= s.sortWith((a:Student,b:Student) => a.math>b.math)
    println(d(0).clazz+"班的数学成绩排名：")
    println("第一名："+"姓名："+d(0).name+"  成绩："+d(0).math)
    println("第二名："+"姓名："+d(1).name+"  成绩："+d(1).math)
    println("第三名："+"姓名："+d(2).name+"  成绩："+d(2).math)
    println("第四名："+"姓名："+d(3).name+"  成绩："+d(3).math)
    println("第五名："+"姓名："+d(4).name+"  成绩："+d(4).math)
  }
  def topFiveEngilsh(s:List[Student]): Unit={
    val d= s.sortWith((a:Student,b:Student) => a.english>b.english)
    println(d(0).clazz+"班的英语成绩排名：")
    println("第一名："+"姓名："+d(0).name+"  成绩："+d(0).english)
    println("第二名："+"姓名："+d(1).name+"  成绩："+d(1).english)
    println("第三名："+"姓名："+d(2).name+"  成绩："+d(2).english)
    println("第四名："+"姓名："+d(3).name+"  成绩："+d(3).english)
    println("第五名："+"姓名："+d(4).name+"  成绩："+d(4).english)
  }
  def topFiveTotal(s:List[Student]): Unit={
    val d= s.sortWith((a:Student,b:Student) => a.chinese+a.math+a.english>b.chinese+b.math+b.english)
    println(d(0).clazz+"班的总分成绩排名：")
    println("第一名："+"姓名："+d(0).name+"  成绩："+sum(d,0))
    println("第二名："+"姓名："+d(1).name+"  成绩："+sum(d,1))
    println("第三名："+"姓名："+d(2).name+"  成绩："+sum(d,2))
    println("第四名："+"姓名："+d(3).name+"  成绩："+sum(d,3))
    println("第五名："+"姓名："+d(4).name+"  成绩："+sum(d,4))
  }
  def sum(s:List[Student],index:Int):Double={
    s(index).chinese+s(index).math+s(index).english
  }

  def avgChinese(s:List[Student]):Unit={
    val avg = s.map(_.chinese).sum/s.length
    println("语文成绩的平均分："+avg)
  }
  def avgMath(s:List[Student]):Unit={
    val avg = s.map(_.math).sum/s.length
    println("数学成绩的平均分："+avg)
  }
  def avgEnglish(s:List[Student]):Unit={
    val avg = s.map(_.english).sum/s.length
    println("英语成绩的平均分："+avg)
  }

  def groupChinese(s:List[Student]):Unit={
    val len:Double =s.length
    val ch = s.map(_.chinese)
    val a = ch.filter(_ >=90).length/len
    val b = ch.filter(_ >=75).filter(_<90).length/len
    val c = ch.filter(_ >=60).filter(_<75).length/len
    val d = ch.filter(_ <60).length/len
    println("全年级语文成绩等级分布")
    println("优："+a)
    println("良："+b)
    println("及格："+c)
    println("不及格："+d)
  }
  def groupMath(s:List[Student]):Unit={
    val len:Double =s.length
    val ch = s.map(_.math)
    val a = ch.filter(_ >=90).length/len
    val b = ch.filter(_ >=75).filter(_<90).length/len
    val c = ch.filter(_ >=60).filter(_<75).length/len
    val d = ch.filter(_ <60).length/len
    println("全年级数学成绩等级分布")
    println("优："+a)
    println("良："+b)
    println("及格："+c)
    println("不及格："+d)
  }
  def groupEnglish(s:List[Student]):Unit={
    val len:Double =s.length
    val ch = s.map(_.english)
    val a = ch.filter(_ >=90).length/len
    val b = ch.filter(_ >=75).filter(_<90).length/len
    val c = ch.filter(_ >=60).filter(_<75).length/len
    val d = ch.filter(_ <60).length/len
    println("全年级英语成绩等级分布")
    println("优："+a)
    println("良："+b)
    println("及格："+c)
    println("不及格："+d)
  }

  def top20Total(s: List[Student]):Unit={
    val d= s.sortWith((a:Student,b:Student) => a.chinese+a.math+a.english>b.chinese+b.math+b.english)

    for (a <- 0 to 19){
      println("第"+(a+1)+"名："+d(a).name+" 分数："+sum(d,a))
    }
  }

  def top1(s: List[Student]):Unit={
    val nan = s.filter(_.sex=="男")
    val nv = s.filter(_.sex=="女")

    val ch1 = nan.sortWith((a:Student,b:Student) => a.chinese>b.chinese).head

    val ch2 = nv.sortWith((a:Student,b:Student) => a.chinese>b.chinese).head

    val ma1 = nan.sortWith((a:Student,b:Student) => a.math>b.math).head
    val ma2 = nv.sortWith((a:Student,b:Student) => a.math>b.math).head

    val en1 = nan.sortWith((a:Student,b:Student) => a.english>b.english).head
    val en2 = nv.sortWith((a:Student,b:Student) => a.english>b.english).head
    println("语文的男状元："+ch1.name)
    println("语文的女状元："+ch2.name)
    println("数学的男状元："+ma1.name)
    println("数学的女状元："+ma2.name)
    println("英语的男状元："+en1.name)
    println("英语的女状元："+en2.name)

  }




}
