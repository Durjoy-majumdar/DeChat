package com.tencent.midas.plugin;

import android.content.Context;
import android.text.TextUtils;
import java.io.File;

public class APPluginConfig {
    public static final String KERNEL_FILE_NAME = "MidasPay.zip";
    public static String PLUGIN_BACKUP_TEMP_DIR_NAME = "midaspluginsBKTemp";
    public static String PLUGIN_DIR_NAME = "midasplugins";
    public static String PLUGIN_EMPTY_RES_DIR_NAME = "midasemptyRes";
    public static String PLUGIN_LIB_DIR_NAME = "midaslib";
    public static String PLUGIN_ODEX_DIR_NAME = "midasodex";
    public static String PLUGIN_UPDATE_DIR_NAME = "midaspluginsTemp";
    public static String SIGN_FILE_NAME = "MidasSign.ini";
    public static int libExtend;

    public static File getLibPath(Context context) {
        return context.getDir(PLUGIN_LIB_DIR_NAME + "_" + libExtend, 0);
    }

    public static File getOptimizedDexPath(Context context) {
        return context.getDir(PLUGIN_ODEX_DIR_NAME, 0);
    }

    public static File getPluginBackUpPath(Context context) {
        return context.getDir(PLUGIN_BACKUP_TEMP_DIR_NAME, 0);
    }

    public static File getPluginEmptyResPath(Context context) {
        return context.getDir(PLUGIN_EMPTY_RES_DIR_NAME, 0);
    }

    public static File getPluginPath(Context context) {
        return context.getDir(PLUGIN_DIR_NAME, 0);
    }

    public static File getPluginUpdatePath(Context context) {
        return context.getDir(PLUGIN_UPDATE_DIR_NAME, 0);
    }

    public static void setPluginDirName(String str) {
        if (!TextUtils.isEmpty(str)) {
            PLUGIN_DIR_NAME = str;
        }
    }

    public static void setSignFileName(String str) {
        if (!TextUtils.isEmpty(str)) {
            SIGN_FILE_NAME = str;
        }
    }
}
