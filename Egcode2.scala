//変数
object Egcode2{//シングルトンオブジェクトの名前はファイル名と同じにしておくこと
	def main(args: Array[String]): Unit = {
		
		// 型推論で自動的に判別
		var a = 2
		println(a)
		// =>2
		
		// 型を明確に
		var b:Int = 3
		println(b)
		// =>3
		
		var c:Double = 4.0
		println(c)
		// =>4.0
	}
	
}