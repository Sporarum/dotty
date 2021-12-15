

class EtaExpansionTests{
        
    def id[T](x: T) = x

    val valId1 /*[T] => T => T*/ = id
    val valValId1: [T] => T => T = valId1
    val valId2:  Int => Int   = id
    val valId3: [U] => U => U = id
    val valId4: [U <: Int] => U => U = id

    def weird2[T](x: T): Nothing = ???
    val valWeird2: [T] => T => T = weird2
    
    def weird3[T](x: Any): T = ???
    val valWeird3: [T] => T => T = weird3
    
    def monoPair[T](x: T)(y: T): (T, T) = (x, y)
    val valMonoPair: [T] => T => T => (T,T) = monoPair
    
    def protoPair[T](x: T): [U] => (U) => (T, U) = [U] => (y: U) => (x,y)
    val valProtoPair1: [T] => (T) => [U] => U => (T, U) = protoPair

    // Should work with clause interweaving:
    //def pair[T](x: T)[U](y: U) = (x, y) //method type [T](T)[U](U): (T, U)
    //val pair1: [T] => T => [U] => U => (T,U) = pair
    //val pair2: [U] => U => (Int, U) = pair[Int](0)
    //val pair3: [U] => U => (Int, U) = pair(0)

    type Z
    type X <: Z
    type Y >: X <: Z
    
    val valId5: [T >: X <: Y ] => X => Z = id
    val valId6: [T >: X <: Y ] => X => Z = [T >: X <: Y ] => id[T]
}


