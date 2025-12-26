package org.cobalt.internal.ui

abstract class UIComponent(
  var x: Float,
  var y: Float,
  val width: Float,
  val height: Float
) {

  protected val components = mutableListOf<UIComponent>()

  fun init() {

  }

  abstract fun render()

  open fun mouseClicked(button: Int): Boolean = false
  open fun mouseReleased(button: Int): Boolean = false
  open fun keyPressed(button: Int): Boolean = false

  fun updateBounds(x: Float, y: Float) {
    this.x = x
    this.y = y
  }

}
