//クラス定義とコンストラクタ

//丁寧に書くとこうなる
// class Person(ln: String, fn: String, s: Person){
// 	val lastName = ln// javaと異なり，private宣言がなければ基本的にpublic
// 	val firstName = fn//firstNameの型は引数fnの型から推論
// 	var spouse = s
// もっと省略すると...
class Person(val lastName: String, val firstName: String, var spouse: Person){
// var/valを付けてフィールドを基本コンストラクタの引数で書ける
//自動的にGetter/Acceserも生成される

	def this(ln: String, fn: String) = {
		this(ln, fn, null)
	}
	
	def introduction(): String = {
		// if文が返り値を返すことを使ってチャンクに組み込む
		return "私の名前は" + lastName + " " + firstName + (if(spouse != null)"相方の名前は" + spouse.lastName + " " + spouse.firstName + "." else ".")
	}
	
	// ルートクラスAnyのtoStringメソッドをoverride
	// スーパークラスのメソッドを上書きする際はoverrideをつけること
	// superが継承元のクラス
	override def toString: String =  super.toString + "[氏:" + lastName + "名:" + firstName + "配偶者:" + (if(spouse != null) "あり" else "なし" ) + "]"
}



object Egcode9{
	def main(args: Array[String]): Unit = {
	  val p0 = new Person("hoge","bar")
	  println(p0 introduction)
	  println("オブジェクト名:" + p0)
	  
	  p0 spouse = new Person("moge", "foo", p0)
	  println("ここで"+((p0 spouse) lastName)+"氏と突然の結婚")
	  println(p0 introduction)
	  println("しかし離婚")
	  p0 spouse = null
	  println(p0 introduction)
	  
	  
	}
	
}