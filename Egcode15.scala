// 無名関数

object Egcode15{
	def main(args: Array[String]): Unit = {
		//引数リスト => 関数本体
		var f = ((s: String) => s.length)
		println(f("hoge")) 
		
		var aList = List("hoge", "moge", "foo").map((s:String)=>s.length)
		//mapメソッド
		//コレクションの要素全てに引数にとった関数を適用した結果を同じコレクションで返す
		
		aList.foreach(println)
		
		// Egcode14の関数barを無名関数に書き換える
		((s: String, n: Int)=> (for(i <- 1 to n)println(s)))("hogemogefoobar",2)
		
		//アンダースコアでよりラジカルに
		val g = (_:String).length*2
		val h = (_:Int)+(_:Int)
		
		println(g("aaaa"))
		println(h(3,5)) 
	}
	
}