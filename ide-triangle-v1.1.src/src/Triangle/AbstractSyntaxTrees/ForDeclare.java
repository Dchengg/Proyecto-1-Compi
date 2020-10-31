/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ForDeclare extends Declaration {

  public Expression eAST;
  public Identifier iAST;
    
  public ForDeclare (Identifier iast, Expression east, SourcePosition thePosition) {
    super (thePosition);
    iAST = iast;
    eAST = east;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitForDeclare(this, o);
  }
}