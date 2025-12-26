package org.cobalt.internal.ui.panel

import org.cobalt.internal.ui.UIComponent

abstract class UIPanel(
  var x: Float,
  var y: Float,
  val width: Float,
  val height: Float
) {

  protected val components = mutableListOf<UIComponent>()

  abstract fun render()

  open fun mouseClicked(button: Int): Boolean = false
  open fun mouseReleased(button: Int): Boolean = false
  open fun keyPressed(button: Int): Boolean = false

  fun updateBounds(x: Float, y: Float): UIPanel {
    this.x = x
    this.y = y

    return this
  }

}
