Block(List(
  TypeDef($anon,
    Template(DefDef(<init>, List(List()), TypeTree(), Thicket(List())),
      List(
        Apply(Select(New(TypeTree()), <init>), List()), TypeTree()
      ),
      ValDef(_, Thicket(List()), Thicket(List())),
      List(
        DefDef(apply, List(List(
          TypeDef(U,
            TypeBoundsTree(TypeTree(), TypeTree(), Thicket(List()))
          )
        ), List(ValDef(y, Ident(U), Thicket(List())))), Ident(U), 
          Apply(TypeApply(Ident(foo), List(Ident(U))), List(Ident(y)))
        )
      ))
    )
  ), Typed(Apply(Select(New(Ident($anon)), <init>), List()), TypeTree()))