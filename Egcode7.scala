// 繰り返し処理
object Egcode7{
	def main(args: Array[String]): Unit = {
		// for文
		var aList = List(1,2,3,4,5)
		for( num <- aList) yield println(num*2)
		// => 2
		// => 4
		// => 6
		// => 8
		// => 10
		// aListの要素がnumに入り，要素数だけyieldの後ろが実行される
		
		// 返り値を取る場合
		var bList = for(num <- aList) yield num*2
		println(bList(0))
		println(bList(1))
		println(bList(2))
		println(bList(3))
		println(bList(4))
		// => 2
		// => 4
		// => 6
		// => 8
		// => 10
		//yield後の処理を行ったあとのListを返す
		
		//while文
		var i = 0
		while(i < aList.length){
			println(aList(i))
			i += 1
		}
		//条件式が成り立つ間，処理が実行される
	}
}