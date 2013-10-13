// Traitでアスペクト指向プログラミング
class Person
trait TAction{
	def doAction // 実装を伴わないバーチャルなメソッド
}

//親の処理の前後に文字列を表示するアスペクト
trait TBeforeAfter extends TAction{
	abstract override def doAction{
		println("/entry before-action")
		super.doAction
		println("/exit after-action")
	}
}

//親の処理を2回繰り返すアスペクト
trait TtwiceAction extends TAction{
	abstract override def doAction{
		for(i <- 1 to 2){
			super.doAction
			println("==> No." + i)
		}
	}
}

class RealAction extends TAction{
	def doAction = {println("** real action done!! **")}
}

object Egcode12{
	def main(args: Array[String]): Unit = {
		println("TBeforeAfterのあとにTtwiceAction")
		val act1 = new RealAction with TBeforeAfter with TtwiceAction 
		act1.doAction
		println("\nTtwiceActionのあとにTBeforeAfter")
		val act2 = new RealAction with TtwiceAction with TBeforeAfter
		act2.doAction
	}
	
}