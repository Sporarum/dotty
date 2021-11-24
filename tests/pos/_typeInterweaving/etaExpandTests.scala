/*

//Sam type
trait Int2Int{
    def convert(x: Int): Int
}

class IdInt1 extends Int2Int{
    def convert(x: Int) = x
}

//Polymorphic SAM type
trait T2T[T]{
    def convert(x: T): T
}

class IdT[T]{
    def convert(x: T) = x
}


class Mapper[T]{
    def map(t2t: T2T[T])(x: T) = t2t.convert(x)

    map(x => x)
}
*/


class EtaExpansionTests{
        
    def id[T](x: T) = x // method type [T](T): T
    //def protoPair[T](x: T): [U] => (U) => (T, U) = [U] => (y: U) => (x,y)
    //def pair[T](x: T)[U](y: U) = (x, y) //method type [T](T)[U](U): (T, U)

    //val valId1 /*Any => Any*/ = id
    //val valId2:  Int => Int   = id
    val valId3: [U] => U => U = id
    //val valId4: [U <: Int] => U => U = id // doesn't work, but will
    //val valId5: Int => Boolean = id // error: Found: (x: Int), Required: Boolean // unintuitive error !

    //def weird1[T](x: T): Any = ??? // method type [T](T): Any
    //def weird2[T](x: T): Nothing = ??? // method type [T](T): Nothing
    //val valWeird1: [T] => T => T = weird1
    //val valWeird2: [T] => T => T = weird2 // error: Found: Any => Nothing, Required: [T] => (T) => T //expected !
    
    //def weird3[T](x: Nothing): T = ??? // method type [T](Nothing): T
    //val valWeird3: [T] => T => T = weird3

    //def monoPair[T](x: T)(y: T): (T, T) = (x, y)
    //val valMonoPair: [T] => T => T => (T,T) = monoPair // error !!!!!!!!!!!!!!!!

    //val valProtoPair1: [T] => (T) => [U] => U => (T, U) = protoPair

    //val pair1: [T] => T => [U] => U => (T,U) = pair
    //val pair2: [U] => U => (Int, U) = pair[Int](0)
    //val pair3: [U] => U => (Int, U) = pair(0)




    
    //def requestInt2Int(f: Int => Int) = f

    //requestInt2Int(id)
    //requestInt2Int(valId1) // error: Found: Any => Any, Required: Int => Int
    //requestInt2Int(valId2)
    //requestInt2Int(valId3) // error: Found: [T] => T => T, Required: Int => Int // Why doesn't infer ?
    //requestInt2Int(valId3[Int])

    //@main def test = req(0)
    
}


