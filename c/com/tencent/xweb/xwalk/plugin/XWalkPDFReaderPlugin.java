package com.tencent.xweb.xwalk.plugin;

public class XWalkPDFReaderPlugin extends XWalkReaderBasePlugin {
    private static final String APK_FILE_NAME = "pdfreader.apk";
    private static final String ENV_CLASS_PATH = "com.tencent.xweb.xfiles.pdf.PDFReaderEnvironment";
    private static final int MIN_SUPPORT_RUNTIME_VERSION_ACTION_CALLBACK = 250;
    private static final int MIN_SUPPORT_RUNTIME_VERSION_BOTTOM_BAR = 282;
    private static final int MIN_SUPPORT_RUNTIME_VERSION_GENERAL = 100;
    private static final String READER_CLASS_PATH = "com.tencent.xweb.xfiles.pdf.PDFReader";

    public String getAPKPath(int i) {
        return getExtractFile(i, APK_FILE_NAME);
    }

    public String getEnvClassPath() {
        return ENV_CLASS_PATH;
    }

    public int getMinSupportRuntimeVersion(int i) {
        if (i == 1) {
            return 250;
        }
        if (i == 2) {
            return MIN_SUPPORT_RUNTIME_VERSION_BOTTOM_BAR;
        }
        return 100;
    }

    public String getPluginName() {
        return XWalkPluginManager.XWALK_PLUGIN_NAME_PDF;
    }

    public String getReaderClassPath() {
        return READER_CLASS_PATH;
    }

    public boolean isDownloadImmediately() {
        return true;
    }
}
