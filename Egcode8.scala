//高階関数
object Egcode8{
	def main(args: Array[String]): Unit = {
	  var increase = (x:Int) => x + 1
	  println(increase(1))
	  // => 2
	  
	  def increase2(x: Int)(f: Int => Int) = {
	  	f(x)
	  }
	  println(increase2(1)(increase))
	  // => 2
	  // 引数を複数取る場合は(x: Type)をその数だけ並べる
	  // 引数が複数ある関数を呼び出す際はf(a)(b)
	  // Type1の引数でType2が返り値の関数を引数にとる場合は(x: Type1 => Type2)
	}
	
}