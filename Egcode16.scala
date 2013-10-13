//メソッドと関数の関係
//Scalaはオブジェクト指向言語なので全ての言語要素がオブジェクトとして取り扱われる
//当然関数もオブジェクト
//関数f:(ArgType1, ..., ArgTypeN) = > ReturnType は
//FunctionN[ArgType1, ..., ArgTypeN, ReturnType]のインスタンスとして定義される
//Nは引数の数を示す正の整数
//1引数関数の場合は
//Function1[ArgType1, ReturnType]となる

object MyFunctions{
	def foo(n: Int):Int = n*2
}

object Egcode16{
	// def double(n:Int):Int = n*2
	// という関数は次の定義と同等
	object double extends Function1[Int,Int]{
		def apply(n: Int): Int = n*2
		// applyはEquaのCallと同様に関数としてインスタンスを呼び出した時に呼ばれる
	}
	
	// オブジェクトが持つメソッドもオブジェクトになるのか
	// var f = MyFunctions.foo
	// error
	// メソッドはそのままでは関数オブジェクトとして利用できないので次のように書く
	var f = MyFunctions.foo _ 
	// メソッド名の次にスペースを開けて_を付けることで
	// メソッドを関数に変換できる
	
	
	def main(args: Array[String]): Unit = {
		println(double(20))
		println(f(20))
		
	}
	//Scalaオブジェクトの操作も属性と同じくオブジェクトとして統一的に操作できる
	
}