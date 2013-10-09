// リスト
object Egcode6{
	def main(args: Array[String]): Unit = {
		var aList = List(1,2,3,4,5)
		println(aList(0))
		println(aList(4))
		// => 1
		// => 5
		// 要素を表示
		// 配列と同様に0から始まる．
		
		var bList = aList ::: 10
		println(aList(4))
		println(bList(5))
		// !?

	}
	
}