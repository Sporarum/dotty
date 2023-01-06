Block(List(
  TypeDef($anon,
    Template(DefDef(<init>, List(List()), TypeTree[TypeRef(NoPrefix,class $anon)], EmptyTree),
      List(
        Apply(Select(New(TypeTree[TypeRef(TermRef(ThisType(TypeRef(NoPrefix,module class java)),object lang),Object)]), <init>), List()), TypeTree[TypeRef(ThisType(TypeRef(NoPrefix,module class scala)),trait PolyFunction)]
      ),
      ValDef(_, EmptyTree, EmptyTree),
      List(
        DefDef(apply, List(List(
          TypeDef(T$1,
            TypeTree[TypeBounds(TypeRef(ThisType(TypeRef(NoPrefix,module class scala)), class Nothing), TypeRef(ThisType(TypeRef(NoPrefix,module class scala)),class Any))]
          )
        ), List(ValDef(x$1,TypeTree[TypeRef(NoPrefix,type T$1)],EmptyTree))),TypeTree[TypeRef(NoPrefix,type T$1)],
          Apply(TypeApply(Ident(foo), List(TypeTree[TypeRef(NoPrefix,type T$1)])), List(Ident(x$1)))
        )
      ))
    )
  ), Apply(Select(New(TypeTree[TypeRef(NoPrefix,class $anon)]), <init>), List()))