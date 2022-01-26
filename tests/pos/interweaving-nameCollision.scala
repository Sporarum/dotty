import scala.annotation.targetName

object nameCollision:
    def f[T](x: T)[U](y: U) = (x,y)
    @targetName("g") def f[T](x: T, y: T) = (x,y)