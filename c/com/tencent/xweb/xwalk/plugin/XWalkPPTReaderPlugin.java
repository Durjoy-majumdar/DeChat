package com.tencent.xweb.xwalk.plugin;

public class XWalkPPTReaderPlugin extends XWalkReaderBasePlugin {
    private static final String APK_FILE_NAME = "pptreader.apk";
    private static final String ENV_CLASS_PATH = "com.tencent.xweb.xfiles.ppt.PPTReaderEnvironment";
    private static final int MIN_SUPPORT_RUNTIME_VERSION_ACTION_CALLBACK = 322;
    private static final int MIN_SUPPORT_RUNTIME_VERSION_BOTTOM_BAR = 362;
    private static final int MIN_SUPPORT_RUNTIME_VERSION_GENERAL = 203;
    private static final String READER_CLASS_PATH = "com.tencent.xweb.xfiles.ppt.PPTReader";

    public String getAPKPath(int i) {
        return getExtractFile(i, APK_FILE_NAME);
    }

    public String getEnvClassPath() {
        return ENV_CLASS_PATH;
    }

    public int getMinSupportRuntimeVersion(int i) {
        return i == 1 ? MIN_SUPPORT_RUNTIME_VERSION_ACTION_CALLBACK : i == 2 ? 362 : 203;
    }

    public String getPluginName() {
        return XWalkPluginManager.XWALK_PLUGIN_NAME_PPT;
    }

    public String getReaderClassPath() {
        return READER_CLASS_PATH;
    }

    public boolean isDownloadImmediately() {
        return true;
    }
}
