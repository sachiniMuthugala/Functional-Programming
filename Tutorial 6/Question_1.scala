object Question_1 {

  def main(args: Array[String]): Unit = {

    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    val encryption = (c:Char,key:Int,text:String) => text((text.indexOf(c.toUpper) + key) % text.size)

    val decryption = (c:Char,key:Int,text:String) => text((text.indexOf(c.toUpper) - key) % text.size)

    val cipher = (algorithm : (Char,Int,String) => Char,s:String,key:Int,a:String) => s.map(algorithm(_,key,a))

    val ct = cipher(encryption,s,5,alphabet)

    val pt = cipher(decryption,ct,5,alphabet)


  }




}
