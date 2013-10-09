// if文
object Egcode4{
	// if else構文
	def bigger(a: Int, b: Int) = {
		if( a >= b)
			a
		else
			b
	}
	
	// 複数命令のとき
	def smaller(a: Int, b: Int) = {
		if( a <= b ){
			println("small")
			a
		}else{
			println("big")
			b
		}
	}
	
	def main(args: Array[String]): Unit = {
	  println(bigger(1,2))
	  // => 2
	  
	  println(smaller(1,2))
	  // => 1
	}
}