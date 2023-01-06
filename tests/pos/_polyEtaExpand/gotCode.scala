// run `run -Yplain-printer -Xprint:typer tests/pos/_polyEtaExpand/gotCode.scala` in sbt
// and copy into gotOutput, then either diff with expectedOuput.scala, or 
// extract parts starting with "Block(" into gotOutputExtracted.scala and then diff with expectedOutputExtracted.scala
def foo[A](x: A): A = x

val v: [T] => T => T = foo