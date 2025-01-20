import caps.CapSet

trait Async:
  def await[T, Cap^](using caps.Contains[Cap, this.type])(src: Source[T, Cap]^): T =
    val x: Async^{this} = ???
    val y: Async^{Cap^} = x
    val ac: Async^ = ???
    def f(using caps.Contains[Cap, ac.type]) =
      val x2: Async^{this} = ???
      val y2: Async^{Cap^} = x2
      val x3: Async^{ac} = ???
      val y3: Async^{Cap^} = x3
    ???

trait Source[+T, Cap^]:
  final def await(using ac: Async^{Cap^}) = ac.await[T, Cap](this) // Contains[Cap, ac] is assured because {ac} <: Cap.

def test(using ac1: Async^, ac2: Async^, x: String) =
  val src1 = new Source[Int, CapSet^{ac1}] {}
  ac1.await(src1)
