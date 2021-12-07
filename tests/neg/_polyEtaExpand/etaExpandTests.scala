

class EtaExpansionTests{
        
    def id[T](x: T) = x
    val valId5: Int => Boolean = id // error

    def weird1[T](x: T): Any = ???
    val valWeird1: [T] => T => T = weird1 // error
    
    def weird4[T](x: Nothing): T = ???
    val valWeird4: [T] => T => T = weird4 //error
}


