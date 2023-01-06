// run `run -Yplain-printer -Xprint:typer tests/pos/_polyEtaExpand/expectedCode.scala` in sbt
// and copy code after "syntax ... end of typer" into expectedOuput.scala, then either diff with gotOuput.scala, or 
// extract parts starting with "Block(" into expectedOutputExtracted.scala and then diff with gotOutputExtracted.scala
def foo[A](x: A): A = x

val v: [T] => T => T = [U] => (y: U) => foo[U](y)