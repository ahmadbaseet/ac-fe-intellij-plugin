// This is a generated file. Not intended for manual editing.
package de.cofinpro.intellij.acfeplugin.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface FormulaEngineExpression extends PsiElement {

  @NotNull
  List<FormulaEngineOperator> getOperatorList();

  @NotNull
  List<FormulaEngineSingleExpression> getSingleExpressionList();

}