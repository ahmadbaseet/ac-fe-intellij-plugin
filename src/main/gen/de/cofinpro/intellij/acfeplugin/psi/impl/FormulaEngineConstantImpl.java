// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static de.cofinpro.intellij.acfeplugin.psi.FormulaEngineElementTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import de.cofinpro.intellij.acfeplugin.psi.*;

public class FormulaEngineConstantImpl extends ASTWrapperPsiElement implements FormulaEngineConstant {

  public FormulaEngineConstantImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull FormulaEngineVisitor visitor) {
    visitor.visitConstant(this);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof FormulaEngineVisitor) accept((FormulaEngineVisitor)visitor);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public FormulaEngineBuiltInVariableName getBuiltInVariableName() {
    return findChildByClass(FormulaEngineBuiltInVariableName.class);
  }

  @Override
  @Nullable
  public FormulaEngineListLiteral getListLiteral() {
    return findChildByClass(FormulaEngineListLiteral.class);
  }

  @Override
  @Nullable
  public FormulaEngineStringLiteral getStringLiteral() {
    return findChildByClass(FormulaEngineStringLiteral.class);
  }

  @Override
  @Nullable
  public PsiElement getNumberInteger() {
    return findChildByType(NUMBER_INTEGER);
  }

}
