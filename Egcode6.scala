// リスト
object Egcode6{
	def main(args: Array[String]): Unit = {
		// リストの定義
		var aList = List(1,2,3,4,5)
		println(aList(0))
		println(aList(4))
		// => 1
		// => 5
		// 要素を表示
		// 配列と同様に0から始まる．
		
		// リスト同士の結合
		var bList = List(1,2,3,4,5) ::: List("foo")
		println(bList(4))
		println(bList(5))
		// => 5
		// => foo
		
		//リストに要素を追加する
		var cList = "bar"::bList
		println(cList(0))
		// => bar

		//リストのメソッド
		//map
		var dList = aList.map(i => i*2)
		println(dList(0))
		println(dList(1))
		println(dList(2))
		println(dList(3))
		println(dList(4))
		// => 2
		// => 4
		// => 6
		// => 8
		// => 10
		//要素一つ一つに適応したリストを返す
		//iがリストの要素で=>以降の処理が実行される
		
		aList.foreach(println(_))
		// 返り値無し(Unit)
		//_がリストの各要素を示す
	}
	
}