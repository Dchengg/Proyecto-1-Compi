package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class VarLocalDeclaration extends Declaration {

  public VarLocalDeclaration (Identifier iAST, Expression eAST,
                         SourcePosition thePosition) {
    super (thePosition);
    I = iAST;
    E = eAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitVarLocalDeclaration(this, o);
  }

  public Identifier I;
  public Expression E;
}
