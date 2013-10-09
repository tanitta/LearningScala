// case文
object Egcode5 {
	// Scalaのcase文はJavaのそれよりもクレバー
	// javaのcaseは分岐の対象がint型のみだが
	// Scalaではどのようなクラスでも使える
	// 戻り値も自由
	def ccc(x: String) = x match{
		case "hoge" => "HOGE"
		case "moge" => "MOGE"
		case _ => "foo" 
		// _(アンダースコア)は全てのパターンにマッチする
		
		// 該当するcase文が存在しない場合は，
		// 実行時にscala.MatchErrorが投げられるので注意
	}
	
	def main(args: Array[String]): Unit = {
	  println(ccc("hoge"))
	  // => HOGE
	  
	  println(ccc("bar"))
	  // => foo
	}
	
}