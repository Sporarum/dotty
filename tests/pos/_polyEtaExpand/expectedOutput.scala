PackageDef(Ident(<empty>), List(
  ValDef(test$package, Ident(test$package$), 
    Apply(Select(New(Ident(test$package$)), <init>), List())
  )
,
  TypeDef(test$package$, 
    Template(DefDef(<init>, List(List()), TypeTree(), Thicket(List())), List(
      Apply(Select(New(TypeTree()), <init>), List())
    ), ValDef(_, SingletonTypeTree(Ident(test$package)), Thicket(List())), List(
      DefDef(foo, List(List(
        TypeDef(A, TypeBoundsTree(TypeTree(), TypeTree(), Thicket(List())))
      ),List(ValDef(x, Ident(A), Thicket(List())))), Ident(A), Ident(x))
    ,
      ValDef(v1, 
        RefinedTypeTree(TypeTree(), List(
          DefDef(apply, List(List(
            TypeDef(T, TypeBoundsTree(TypeTree(), TypeTree(), Thicket(List())))
          ),List(ValDef(x$1, Ident(T), Thicket(List())))), Ident(T), 
            Thicket(List())
          )
        ))
        , 
        Block(List(
          TypeDef($anon, 
            Template(DefDef(<init>, List(List()), TypeTree(), Thicket(List())), 
              List(
                Apply(Select(New(TypeTree()), <init>), List()),TypeTree()
              ), 
              ValDef(_, Thicket(List()), Thicket(List()))
            , List(
              DefDef(apply, List(List(
                TypeDef(U, 
                  TypeBoundsTree(TypeTree(), TypeTree(), Thicket(List()))
                )
              ),List(ValDef(y, Ident(U), Thicket(List())))), Ident(U), 
                Apply(TypeApply(Ident(foo), List(Ident(U))), List(Ident(y)))
              )
            ))
          )
        ), Typed(Apply(Select(New(Ident($anon)), <init>), List()), TypeTree()))
      )
    ))
  )
))