package org.cobalt.api.pathfinder

import net.minecraft.client.network.ClientPlayerEntity

interface IPathExec {

  fun onTick(it: ClientPlayerEntity) {}
  fun onWorldRenderLast(it: ClientPlayerEntity) {}

}
