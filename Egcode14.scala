// Scalaの関数定義

// 関数として単独で利用する場合はシングルトンオブジェクト内に定義
object MyFunctions{
	//メソッドは関数としてdefを用いて
	//def 関数名(引数リスト):戻り値型 = 本体関数
	// def foo(s: String, n: Int): Int = {
	// 	s.length * n
	// }
	//戻り値の型は省略できるが開発ではシグニチャとして残すほうが良い
	def foo(s: String, n: Int):Int = s.length * n
	//戻り値の無い場合は戻り値にUnitを指定(javaでいうvoidに相当)
	def bar(s: String, n: Int): Unit = for(i <- 1 to n) print(s)
}

object Egcode14{
	def main(args: Array[String]): Unit = {
		println(MyFunctions foo("aiueo",2))
		println(MyFunctions bar("aiueo",2))
		
		// importでいちいち指定しなくて済む
		import MyFunctions._
		println(foo("aiueo",2))
		println(bar("aiueo",2))
	}
}