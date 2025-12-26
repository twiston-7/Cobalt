package org.cobalt.internal.ui.panel.panels

import java.awt.Color
import org.cobalt.api.util.ui.NVGRenderer
import org.cobalt.internal.ui.panel.UIPanel

class UIMainBody : UIPanel(
  x = 0F,
  y = 0F,
  width = 890F,
  height = 600F
) {

  override fun render() {
    NVGRenderer.rect(x, y, width, height, Color(15, 15, 18).rgb, 10F)
  }

}
