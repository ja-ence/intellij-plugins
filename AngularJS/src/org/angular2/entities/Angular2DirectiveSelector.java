package org.angular2.entities;

import org.angular2.lang.selector.Angular2DirectiveSimpleSelector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface Angular2DirectiveSelector {

  @NotNull String getText();

  @NotNull List<@NotNull Angular2DirectiveSimpleSelector> getSimpleSelectors();

  @NotNull List<@NotNull  SimpleSelectorWithPsi> getSimpleSelectorsWithPsi();

  @NotNull Angular2DirectiveSelectorPsiElement getPsiElementForElement(@NotNull String elementName);

  interface SimpleSelectorWithPsi {

    @Nullable Angular2DirectiveSelectorPsiElement getElement();

    @NotNull List<@NotNull Angular2DirectiveSelectorPsiElement> getAttributes();

    @NotNull List<@NotNull SimpleSelectorWithPsi> getNotSelectors();

    @Nullable Angular2DirectiveSelectorPsiElement getElementAt(int offset);
  }
}
