// Scalaのクラス体系
// Scalaで利用できる基本的なデータ型は全てクラスとして定義される．
// そのため，組み込み型(IntとかStringとか)とユーザー定義クラスの区別は無いと考えることができる．

object Egcode13{
	def main(args: Array[String]): Unit = {
		println(7.toDouble)
		7 to(20) foreach(i => println(i*2))
	}
	
}