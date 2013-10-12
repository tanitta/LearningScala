// Traitでmix-in型の多重継承
// 抽象クラスを合成(mix-in)してクラスをつくる
//mix-inの際はwith以下のクラスは全てTraitで抽象クラスにすること
//with以下は全て継承するクラスのサブクラスにすること
class Person
trait TTeacher extends Person{
	def teach // 実装を伴わないバーチャルなメソッド
}
trait TPianoPlayer extends Person{
	def playPiano = {println("I'm playing piano.")}
}

class PianoplayTeacher extends Person with TTeacher with TPianoPlayer{
	def teach = {println("I'm teaching students.")}
}


object Egcode11{
	def main(args: Array[String]): Unit = {
	  var p0 = new PianoplayTeacher
	  // なお，抽象クラスから直接インスタンス生成はできない
	  // c.g.)var p0 = new TTeacher
	  p0.teach
	  
	  // あとインスタンス生成時にmix-in，性質を与えることが可能
	  var p1 = new Person with TTeacher with TPianoPlayer {def teach = {println("I'm teaching students.")}}
	  p1.teach
	}
	
}