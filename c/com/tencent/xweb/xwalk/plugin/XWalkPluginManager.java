package com.tencent.xweb.xwalk.plugin;

import android.content.Context;
import com.tencent.xweb.util.AbiUtil;
import com.tencent.xweb.util.FileUtils;
import com.tencent.xweb.util.ReflectionUtils;
import com.tencent.xweb.util.XWebFileUtil;
import com.tencent.xweb.util.XWebLog;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xwalk.core.XWalkEnvironment;

public class XWalkPluginManager {
    private static final String TAG = "XWalkPluginManager";
    public static final String XWALK_PLUGIN_NAME_EXCEL = "XFilesExcelReader";
    public static final String XWALK_PLUGIN_NAME_FULL_SCREEN_VIDEO = "FullScreenVideo";
    public static final String XWALK_PLUGIN_NAME_OFFICE = "XFilesOfficeReader";
    public static final String XWALK_PLUGIN_NAME_PDF = "XFilesPDFReader";
    public static final String XWALK_PLUGIN_NAME_PPT = "XFilesPPTReader";
    public static final String XWALK_PLUGIN_NAME_TXT = "XFilesTXTReader";
    public static final String XWALK_PLUGIN_NAME_WORD = "XFilesWordReader";
    private static Map<String, XWalkPlugin> sPluginMap = new HashMap();

    public static class PluginInfo {
        public String pluginName;
        public int pluginVersion;

        public PluginInfo(String str, int i) {
            this.pluginName = str;
            this.pluginVersion = i;
        }
    }

    public static void checkFiles() {
        if (sPluginMap.size() == 0) {
            XWebLog.m21909e(TAG, "checkFiles error, sPluginMap size is 0");
            return;
        }
        for (Map.Entry<String, XWalkPlugin> value : sPluginMap.entrySet()) {
            ((XWalkPlugin) value.getValue()).checkFiles();
        }
    }

    public static void clearOldVersions() {
        if (sPluginMap.size() == 0) {
            XWebLog.m21909e(TAG, "clearOldVersions error, sPluginMap size is 0");
            return;
        }
        String pluginBaseDir = XWebFileUtil.getPluginBaseDir();
        if (pluginBaseDir == null || pluginBaseDir.isEmpty()) {
            XWebLog.m21909e(TAG, "clearOldVersions clear other, pluginBaseDir is null, return");
            return;
        }
        File[] listFiles = new File(pluginBaseDir).listFiles();
        if (listFiles == null || listFiles.length <= 0) {
            XWebLog.m21911i(TAG, "clearOldVersions, dir is empty, return");
            return;
        }
        for (File file : listFiles) {
            if (file != null) {
                PluginInfo pluginInfoFromDir = getPluginInfoFromDir(file);
                if (pluginInfoFromDir == null) {
                    XWebLog.m21909e(TAG, "clearOldVersions can not get plugin info, delete " + file.getAbsolutePath());
                    FileUtils.deleteAll(file.getAbsolutePath());
                } else {
                    XWalkPlugin xWalkPlugin = sPluginMap.get(pluginInfoFromDir.pluginName);
                    if (xWalkPlugin == null) {
                        XWebLog.m21909e(TAG, "clearOldVersions invalid plugin info, delete " + file.getAbsolutePath());
                        FileUtils.deleteAll(file.getAbsolutePath());
                    } else {
                        int availableVersion = xWalkPlugin.getAvailableVersion();
                        if (availableVersion < 0) {
                            availableVersion = xWalkPlugin.getAvailableVersion(true);
                        }
                        if (availableVersion < 0) {
                            XWebLog.m21909e(TAG, "clearOldVersions can not get availableVersion, skip " + file.getAbsolutePath());
                        } else if (pluginInfoFromDir.pluginVersion < availableVersion) {
                            XWebLog.m21911i(TAG, "clearOldVersions is old version, delete " + file.getAbsolutePath());
                            FileUtils.deleteAll(file.getAbsolutePath());
                        }
                    }
                }
            }
        }
    }

    public static String getAllPluginVersionInfo() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, XWalkPlugin> value : sPluginMap.entrySet()) {
            XWalkPlugin xWalkPlugin = (XWalkPlugin) value.getValue();
            if (xWalkPlugin != null) {
                sb.append(xWalkPlugin.getPluginName());
                sb.append(" = ");
                sb.append(xWalkPlugin.getAvailableVersion());
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    public static List<XWalkPlugin> getAllPlugins() {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, XWalkPlugin> value : sPluginMap.entrySet()) {
            arrayList.add((XWalkPlugin) value.getValue());
        }
        return arrayList;
    }

    public static Map<String, Integer> getInstalledPluginVersions(Context context) {
        HashMap hashMap = new HashMap();
        hashMap.put(XWALK_PLUGIN_NAME_FULL_SCREEN_VIDEO, Integer.valueOf(XWalkEnvironment.getInstalledPluginVersion(context, XWALK_PLUGIN_NAME_FULL_SCREEN_VIDEO)));
        hashMap.put(XWALK_PLUGIN_NAME_PDF, Integer.valueOf(XWalkEnvironment.getInstalledPluginVersion(context, XWALK_PLUGIN_NAME_PDF)));
        hashMap.put(XWALK_PLUGIN_NAME_PPT, Integer.valueOf(XWalkEnvironment.getInstalledPluginVersion(context, XWALK_PLUGIN_NAME_PPT)));
        hashMap.put(XWALK_PLUGIN_NAME_WORD, Integer.valueOf(XWalkEnvironment.getInstalledPluginVersion(context, XWALK_PLUGIN_NAME_WORD)));
        hashMap.put(XWALK_PLUGIN_NAME_EXCEL, Integer.valueOf(XWalkEnvironment.getInstalledPluginVersion(context, XWALK_PLUGIN_NAME_EXCEL)));
        hashMap.put(XWALK_PLUGIN_NAME_OFFICE, Integer.valueOf(XWalkEnvironment.getInstalledPluginVersion(context, XWALK_PLUGIN_NAME_OFFICE)));
        hashMap.put(XWALK_PLUGIN_NAME_TXT, Integer.valueOf(XWalkEnvironment.getInstalledPluginVersion(context, XWALK_PLUGIN_NAME_TXT)));
        return hashMap;
    }

    public static XWalkPlugin getPlugin(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return sPluginMap.get(str);
    }

    public static PluginInfo getPluginInfoFromDir(File file) {
        if (file == null) {
            XWebLog.m21909e(TAG, "getPluginInfoFromDir, dirFile is null");
            return null;
        } else if (!file.exists() || !file.isDirectory()) {
            XWebLog.m21909e(TAG, "getPluginInfoFromDir, dirFile is invalid");
            return null;
        } else {
            String name = file.getName();
            int lastIndexOf = name.lastIndexOf(95);
            if (lastIndexOf < 0 || lastIndexOf >= name.length() - 1) {
                XWebLog.m21909e(TAG, "getPluginInfoFromDir, can not find _");
                return null;
            }
            try {
                return new PluginInfo(name.substring(0, lastIndexOf), Integer.parseInt(name.substring(lastIndexOf + 1)));
            } catch (Throwable th) {
                XWebLog.m21909e(TAG, "getPluginInfoFromDir, error: " + th);
                return null;
            }
        }
    }

    private static void initEmbedPluginInfo() {
        String str;
        String str2;
        try {
            Object fieldStatic = ReflectionUtils.getFieldStatic("com.tencent.xweb.BuildConfig", "EMBED_PLUGIN_RESULT");
            if (!(fieldStatic instanceof Boolean)) {
                XWebLog.m21909e(TAG, "initEmbedPluginInfo error, pluginEmbedResultObj invalid");
            } else if (!((Boolean) fieldStatic).booleanValue()) {
                XWebLog.m21911i(TAG, "initEmbedPluginInfo, no embed or embed failed, return");
            } else {
                Object fieldStatic2 = ReflectionUtils.getFieldStatic("com.tencent.xweb.BuildConfig", "EMBED_PLUGIN_FILE_NAME_PREFIX");
                if (!(fieldStatic2 instanceof String)) {
                    XWebLog.m21909e(TAG, "initEmbedPluginInfo error, pluginFileNamePrefixObj invalid");
                    return;
                }
                String str3 = (String) fieldStatic2;
                if (str3.isEmpty()) {
                    XWebLog.m21909e(TAG, "initEmbedPluginInfo error, pluginFileNamePrefix invalid");
                    return;
                }
                Object fieldStatic3 = ReflectionUtils.getFieldStatic("com.tencent.xweb.BuildConfig", "EMBED_PLUGIN_NAMES");
                if (!(fieldStatic3 instanceof String)) {
                    XWebLog.m21909e(TAG, "initEmbedPluginInfo error, pluginNamesObj invalid");
                    return;
                }
                String str4 = (String) fieldStatic3;
                if (str4.isEmpty()) {
                    XWebLog.m21909e(TAG, "initEmbedPluginInfo error, pluginNames invalid");
                    return;
                }
                if (AbiUtil.is64bitApp()) {
                    str2 = "EMBED_PLUGIN_VERSIONS_64";
                    str = "EMBED_PLUGIN_MD5S_64";
                } else {
                    str2 = "EMBED_PLUGIN_VERSIONS_32";
                    str = "EMBED_PLUGIN_MD5S_32";
                }
                Object fieldStatic4 = ReflectionUtils.getFieldStatic("com.tencent.xweb.BuildConfig", str2);
                if (!(fieldStatic4 instanceof String)) {
                    XWebLog.m21909e(TAG, "initEmbedPluginInfo error, pluginVersionsObj invalid");
                    return;
                }
                String str5 = (String) fieldStatic4;
                if (str5.isEmpty()) {
                    XWebLog.m21909e(TAG, "initEmbedPluginInfo error, pluginVersions invalid");
                    return;
                }
                Object fieldStatic5 = ReflectionUtils.getFieldStatic("com.tencent.xweb.BuildConfig", str);
                if (!(fieldStatic5 instanceof String)) {
                    XWebLog.m21909e(TAG, "initEmbedPluginInfo error, pluginMD5sObj invalid");
                    return;
                }
                String str6 = (String) fieldStatic5;
                if (str6.isEmpty()) {
                    XWebLog.m21909e(TAG, "initEmbedPluginInfo error, pluginMD5s invalid");
                    return;
                }
                String[] split = str4.split("_");
                String[] split2 = str5.split("_");
                String[] split3 = str6.split("_");
                if (split.length > 0 && split.length == split2.length) {
                    if (split.length == split3.length) {
                        initEmbedPluginInfo(str3, split, split2, split3);
                        return;
                    }
                }
                XWebLog.m21909e(TAG, "initEmbedPluginInfo error, info invalid");
            }
        } catch (Throwable th) {
            XWebLog.m21910e(TAG, "initEmbedPluginInfo error", th);
        }
    }

    public static boolean initPlugins() {
        if (sPluginMap.size() != 0) {
            return true;
        }
        XWebLog.m21911i(TAG, "initPlugins");
        XWalkFullScreenVideoPlugin xWalkFullScreenVideoPlugin = new XWalkFullScreenVideoPlugin();
        sPluginMap.put(xWalkFullScreenVideoPlugin.getPluginName(), xWalkFullScreenVideoPlugin);
        XWalkPDFReaderPlugin xWalkPDFReaderPlugin = new XWalkPDFReaderPlugin();
        sPluginMap.put(xWalkPDFReaderPlugin.getPluginName(), xWalkPDFReaderPlugin);
        XWalkPPTReaderPlugin xWalkPPTReaderPlugin = new XWalkPPTReaderPlugin();
        sPluginMap.put(xWalkPPTReaderPlugin.getPluginName(), xWalkPPTReaderPlugin);
        XWalkWordReaderPlugin xWalkWordReaderPlugin = new XWalkWordReaderPlugin();
        sPluginMap.put(xWalkWordReaderPlugin.getPluginName(), xWalkWordReaderPlugin);
        XWalkExcelReaderPlugin xWalkExcelReaderPlugin = new XWalkExcelReaderPlugin();
        sPluginMap.put(xWalkExcelReaderPlugin.getPluginName(), xWalkExcelReaderPlugin);
        XWalkOfficeReaderPlugin xWalkOfficeReaderPlugin = new XWalkOfficeReaderPlugin();
        sPluginMap.put(xWalkOfficeReaderPlugin.getPluginName(), xWalkOfficeReaderPlugin);
        XWalkTXTReaderPlugin xWalkTXTReaderPlugin = new XWalkTXTReaderPlugin();
        sPluginMap.put(xWalkTXTReaderPlugin.getPluginName(), xWalkTXTReaderPlugin);
        initEmbedPluginInfo();
        return true;
    }

    private static void initEmbedPluginInfo(String str, String[] strArr, String[] strArr2, String[] strArr3) {
        for (int i = 0; i < strArr.length; i++) {
            String str2 = strArr[i];
            String str3 = strArr2[i];
            String str4 = strArr3[i];
            if (str2 == null || str2.isEmpty() || str3 == null || str3.isEmpty() || str4 == null || str4.isEmpty()) {
                XWebLog.m21909e(TAG, "initEmbedPluginInfo skip empty info");
            } else {
                XWalkPlugin xWalkPlugin = sPluginMap.get(str2);
                if (xWalkPlugin == null) {
                    XWebLog.m21909e(TAG, "initEmbedPluginInfo can not get plugin by name " + str2);
                } else {
                    try {
                        int parseInt = Integer.parseInt(str3);
                        if (parseInt <= 0) {
                            XWebLog.m21911i(TAG, "initEmbedPluginInfo not embed, skip " + str2);
                        } else {
                            String str5 = str + str2.toLowerCase() + ".so";
                            XWebLog.m21911i(TAG, "initEmbedPluginInfo setEmbedInfo, plugin: " + str2 + ", embedVersion: " + parseInt + ", embedFileName: " + str5 + ", embedFileMD5: " + str4);
                            xWalkPlugin.setEmbedInfo(parseInt, str5, str4);
                        }
                    } catch (Throwable th) {
                        XWebLog.m21909e(TAG, "initEmbedPluginInfo get version failed: " + th);
                    }
                }
            }
        }
    }
}
