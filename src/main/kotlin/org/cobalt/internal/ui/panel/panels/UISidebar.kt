package org.cobalt.internal.ui.panel.panels

import java.awt.Color
import org.cobalt.api.util.ui.NVGRenderer
import org.cobalt.internal.ui.panel.UIPanel

class UISidebar : UIPanel(
  x = 0F,
  y = 0F,
  width = 70F,
  height = 600F
) {

  override fun render() {
    NVGRenderer.rect(x, y, width, height, Color(15, 15, 18).rgb, 10F)

    NVGRenderer.text("cb", x + width / 2F - 15F, y + 40F, 25F, Color(230, 235, 235).rgb)
    NVGRenderer.line(x + width / 2F - 15F, y + 80F, x + width / 2F + 15F, y + 80F, 1F, Color(38, 38, 45).rgb)
  }

}
