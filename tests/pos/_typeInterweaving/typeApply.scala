object typeApply:

    def f0[T]: [U] => T => T = ???
    def f1[T][U]: T => T = ???
    def f2[T][U](): T => T = ???
    def f3[T <: Int][U <: String](): T => T = ???
    def f4[T <: Int][U <: String]: T => T = ???
    def f5[T <: Int][U <: String]: [X <: Unit] => X => X = ???
    def f6[T <: Int][U <: String](): [X <: Unit] => X => X = ???
    def f7[T <: Int][U <: String]()[X <: Unit]: X => X = ???

    @main def test = {
        f0[Int][String] //only one that works when lines 1088 to 1089 of Applications.scala are uncommented
        f1[Int][String]
        f2[Int][String]()
        f3[Int][String]()
        f4[Int][String]
        f5[Int][String]
        f5[Int][Unit] // Should this work ?
        f5[Int][String][Unit]
        f6[Int]()[Unit]
        f7[Int]()[Unit]
    }