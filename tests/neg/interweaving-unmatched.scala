object unmatched:
    def f1[T (x: T)] = ??? // error
    def f2(x: Any[)T] = ??? // error // error
    def f3[T(x: T) = ??? // error