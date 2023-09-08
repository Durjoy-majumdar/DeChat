package com.tencent.xweb.xwalk.plugin;

import com.tencent.xweb.util.FileUtils;
import com.tencent.xweb.util.XWebLog;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class XWalkPluginPatchConfigParser {
    private static final String ADD_FLAG = "ADD:";
    private static final int ADD_TYPE = 1;
    private static final String DEL_FLAG = "DEL:";
    private static final int DEL_TYPE = 3;
    private static final String MOD_FLAG = "MOD:";
    private static final int MOD_TYPE = 2;
    private static final String PATCH_SUFFIX = ".patch";
    private static final String TAG = "XWalkPluginPatchConfigP";

    public static class PluginPatchConfig {
        public String originalFileName;
        public String patchFileName;
        public int patchType = 1;
        public int type;

        public boolean isTypeAdd() {
            return this.type == 1;
        }

        public boolean isTypeModify() {
            return this.type == 2;
        }

        public boolean isTypeRemove() {
            return this.type == 3;
        }

        public String toString() {
            return "PluginPatchConfig type:" + this.type + ",originalFileName:" + this.originalFileName + ",patchFileName:" + this.patchFileName;
        }
    }

    public static List<PluginPatchConfig> getPluginPatchConfigList(File file) {
        BufferedReader bufferedReader;
        String str;
        int i;
        ArrayList arrayList = new ArrayList();
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        FileUtils.tryClose(bufferedReader);
                        return arrayList;
                    } else if (!readLine.isEmpty()) {
                        if (readLine.startsWith(ADD_FLAG)) {
                            str = readLine.substring(4);
                            i = 1;
                        } else if (readLine.startsWith(MOD_FLAG)) {
                            str = readLine.substring(4);
                            i = 2;
                        } else if (readLine.startsWith(DEL_FLAG)) {
                            str = readLine.substring(4);
                            i = 3;
                        } else {
                            XWebLog.m21909e(TAG, "getPluginPatchConfigList unknown flag:" + readLine);
                            FileUtils.tryClose(bufferedReader);
                            return null;
                        }
                        for (String str2 : str.split(",")) {
                            if (str2 != null) {
                                if (!str2.isEmpty()) {
                                    PluginPatchConfig pluginPatchConfig = new PluginPatchConfig();
                                    pluginPatchConfig.originalFileName = str2;
                                    pluginPatchConfig.type = i;
                                    if (i == 2) {
                                        pluginPatchConfig.patchFileName = pluginPatchConfig.originalFileName + PATCH_SUFFIX;
                                    }
                                    XWebLog.m21911i(TAG, "getPluginPatchConfigList config:" + pluginPatchConfig.toString());
                                    arrayList.add(pluginPatchConfig);
                                }
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        XWebLog.m21910e(TAG, "getPluginPatchConfigList error", th);
                        return null;
                    } finally {
                        FileUtils.tryClose(bufferedReader);
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedReader = null;
            XWebLog.m21910e(TAG, "getPluginPatchConfigList error", th);
            return null;
        }
    }
}
