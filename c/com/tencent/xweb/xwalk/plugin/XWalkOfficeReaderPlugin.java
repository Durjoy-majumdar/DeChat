package com.tencent.xweb.xwalk.plugin;

public class XWalkOfficeReaderPlugin extends XWalkReaderBasePlugin {
    private static final String APK_FILE_NAME = "officereader.apk";
    private static final String ENV_CLASS_PATH = "com.tencent.xweb.xfiles.office.OfficeReaderEnvironment";
    private static final int MIN_SUPPORT_RUNTIME_VERSION_ACTION_CALLBACK = 100;
    private static final int MIN_SUPPORT_RUNTIME_VERSION_BOTTOM_BAR = 500;
    private static final int MIN_SUPPORT_RUNTIME_VERSION_GENERAL = 100;
    private static final String READER_CLASS_PATH = "com.tencent.xweb.xfiles.office.OfficeReader";

    public String getAPKPath(int i) {
        return getExtractFile(i, APK_FILE_NAME);
    }

    public String getEnvClassPath() {
        return ENV_CLASS_PATH;
    }

    public int getMinSupportRuntimeVersion(int i) {
        return (i != 1 && i == 2) ? 500 : 100;
    }

    public String getPluginName() {
        return XWalkPluginManager.XWALK_PLUGIN_NAME_OFFICE;
    }

    public String getReaderClassPath() {
        return READER_CLASS_PATH;
    }

    public boolean isDownloadImmediately() {
        return true;
    }
}
