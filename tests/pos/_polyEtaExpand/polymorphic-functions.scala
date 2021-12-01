import language.experimental.namedTypeArguments
import scala.annotation.targetName

object Test extends App {

  // Overload
  class O(is: List[Int]) {
    @targetName("m1") def m(f: [T] => List[T] => Option[T]): (Option[Int], Boolean) = (f(is), true)
    @targetName("m2") def m(f: [T] => (List[T], T) => Option[T]): (Option[Int], Boolean) = (is.headOption.flatMap(f(is, _)), false)
  }

}
