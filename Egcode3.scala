// 関数
object Egcode3{
	def min(x: Int, y: Int) = {
		if(x < y)
			x
		else
			y
	}
	// 関数定義のスタイル
	// def 関数名(仮引数名：型, 仮引数名:型　…):戻り値の型 = {
	// 	処理内容
	// }
	
	def main(args: Array[String]): Unit = {
	  println(min(1,3))
	  // => 1
	}
	
}