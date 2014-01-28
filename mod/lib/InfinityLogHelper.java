
package com.Infinity.mod.lib;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.Infinity.mod.InfinityMain;

import cpw.mods.fml.common.FMLLog;

public class InfinityLogHelper {
private static Logger logger = Logger.getLogger(InfinityMain.modid);

public static void init() {
logger.setParent(FMLLog.getLogger());
}

public static void log(Level logLevel, String message) {
logger.log(logLevel, message);
}
}