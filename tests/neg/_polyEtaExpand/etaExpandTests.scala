

class EtaExpansionTests{
        
    def id[T](x: T) = x // method type [T](T): T
    val valId5: Int => Boolean = id // error: Found: (x: Int), Required: Boolean // unintuitive error !

    def weird1[T](x: T): Any = ??? // method type [T](T): Any
    val valWeird1: [T] => T => T = weird1 // error, but expected
    
    def weird4[T](x: Nothing): T = ??? // method type [T](Nothing): T
    val valWeird4: [T] => T => T = weird4 //error
}


