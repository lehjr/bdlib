/*
 * Copyright (c) bdew, 2013
 * https://github.com/bdew/bdlib
 *
 * This mod is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * https://raw.github.com/bdew/bdlib/master/MMPL-1.0.txt
 */

package net.bdew.lib.rotate

import net.minecraftforge.common.ForgeDirection

object IconType extends Enumeration {
  val BACK = Value(0, "BACK")
  val FRONT = Value(1, "FRONT")
  val SIDE = Value(2, "SIDE")

  def fromSideAndDir(side: Int, facing: ForgeDirection) = this(metaSideMap(side)(facing.ordinal))

  val metaSideMap = Array(
    Array(1, 0, 2, 2, 2, 2),
    Array(0, 1, 2, 2, 2, 2),
    Array(2, 2, 1, 0, 2, 2),
    Array(2, 2, 0, 1, 2, 2),
    Array(2, 2, 2, 2, 1, 0),
    Array(2, 2, 2, 2, 0, 1))
}