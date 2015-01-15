package com.google.gwt.debugformat.client;

import com.google.gwt.user.client.ui.WidgetCollection;

import java.util.Iterator;

public class WidgetCollectionMirror extends IterMirror {

  @Override
  boolean canDisplay(Any any) {
    return any.isJava() && any.toJava() instanceof WidgetCollection;
  }

  @Override
  Iterator getIterator(Any any) {
    WidgetCollection c = (WidgetCollection) any.toJava();
    return c.iterator();
  }

  @Override
  int getSize(Any any) {
    WidgetCollection c = (WidgetCollection) any.toJava();
    return c.size();
  }
}