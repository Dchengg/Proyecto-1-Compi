/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

public class ForCommand extends Command {

  public ForCommand (Expression eAST, Command cAST, ForDeclare fDec, SourcePosition thePosition) {
    super (thePosition);
    E = eAST;
    C = cAST;
    F = fDec;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitForCommand(this, o);
  }

  public Expression E;
  public Command C;
  public ForDeclare F;
}
