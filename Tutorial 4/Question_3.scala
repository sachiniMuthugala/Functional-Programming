object Question_3 {
  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")()(toUpper))
    println(formatNames("Niroshan")(0,1)(toUpper))
    println(formatNames("Saman")()(toUpper))
    println(formatNames("Kumara")(5)(toUpper))
  }

  def toUpper(u : String) : String = {
    u.toUpperCase()
  }

  def toLower(l : String) : String = {
    l.toLowerCase()
  }

  def formatNames(name : String)(index : Int*)(func: String => String) : String = {
    if(index.isEmpty){
      return func(name)
    }
    var temp = ""
    var i = 0
    while (i < name.length()){
      if(index.contains(i)) temp = temp + func(name.charAt(i).toString)
      else temp = temp + name.charAt(i).toString
      i = i + 1
    }
    temp
  }
}
