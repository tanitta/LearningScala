//パッケージと関数定義

// 結婚を明示的に示す．
// 関数型とオブジェクト指向の2つを兼ね備えるマルチパラダイムのScalaでは2つの考え方がある．
// 1)	オブジェクト指向風にクラスPersonに結婚のためのメソッドgetMarriedTo(相手: Person)を持たせる
// 2)	結婚は男女二人の出会いであるため，対称性の無い1)の考え方ではなく，パッケージLife内のスコープで
// 		関数marry(p1: Person, p2: Person)として定義する．
// とりあえず両方とも実装する．
class Person(val lastName: String, val firstName: String, var spouse: Person){
	def this(ln: String, fn: String) = this(ln, fn, null)
	def introduction(): String = "私の名前は" + lastName + " " + firstName + (if(spouse != null)"相方の名前は" + spouse.lastName + " " + spouse.firstName + "." else ".")
	override def toString: String =  super.toString + "[氏:" + lastName + "名:" + firstName + "配偶者:" + (if (spouse != null) " ("+ spouse.lastName + "," + spouse.firstName + ")" else "なし") + "]"
	
	// オブジェクティブ結婚
	// 返り値をUnit型として明示することで返り値無しに．
	def getMarriedTo(p: Person): Unit = {
		// お互いのspouseにそれぞれのインスタンスを登録
		this.spouse = p
		p.spouse = this
	}
}

// ファンクショナル結婚
// パッケージオブジェクトを使うことでパッケージ自体にメソッド，定数を定義することができる．
// （javaではクラスやインターフェイスしか定義できない）
package object Life{
	//package内で宣言されていないものをそこで用いるときは外からimportで呼び出すこと
	//c.g.)import hoge._　hogeパッケージ内の全て(_)のクラスを呼び出す
	
	def marry(p1: Person, p2: Person): Unit = {
		p1.spouse = p2
		p2.spouse = p1
	}
}



object Egcode10{
	def main(args: Array[String]): Unit = {
	  val p0 = new Person("hoge","bar")
	  val p1 = new Person("moge","foo")
	  println("オブジェクティブ結婚")
	  p0.getMarriedTo(p1)
	  println(p0)
	  println(p1)
	  println("離婚")
	  p0.spouse = null
	  p1.spouse = null
	  println(p0)
	  println(p1+"\n")
	  
	  println("ファンクショナル結婚")
	  Life.marry(p0,p1)
	  println(p0)
	  println(p1)
	}
	
}