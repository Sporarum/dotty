import language.experimental.captureChecking
import annotation.experimental
import caps.Capability
import caps.unbox

@experimental object Test2:

  class List[+A]:
    def map[B](f: A => B): List[B] = ???

  class Label extends Capability

  class Listener

  def test2(@unbox lbls: List[Label]) =
    def makeListener(lbl: Label): Listener^{lbl} = ???
    val listeners = lbls.map(makeListener) // should work

