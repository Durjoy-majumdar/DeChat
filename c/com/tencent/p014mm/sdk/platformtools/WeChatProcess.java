package com.tencent.p014mm.sdk.platformtools;

/* renamed from: com.tencent.mm.sdk.platformtools.WeChatProcess */
public final class WeChatProcess {
    public static final String PROCESS_APPBRAND0;
    public static final String PROCESS_APPBRAND1;
    public static final String PROCESS_APPBRAND2;
    public static final String PROCESS_APPBRAND3;
    public static final String PROCESS_APPBRAND4;
    public static final String PROCESS_EXDEVICE;
    public static final String PROCESS_ISOLATED_PROCESS0;
    public static final String PROCESS_MAIN;
    public static final String PROCESS_PACKAGE_NAME;
    public static final String PROCESS_PATCH;
    public static final String PROCESS_PUSH;
    public static final String PROCESS_SANDBOX;
    public static final String PROCESS_SUPPORT;
    public static final String PROCESS_TMADSDKS;
    public static final String PROCESS_TOOLS;

    static {
        String applicationId = MMApplicationContext.getApplicationId();
        PROCESS_PACKAGE_NAME = applicationId;
        PROCESS_MAIN = applicationId + "";
        PROCESS_PUSH = applicationId + ":push";
        PROCESS_TOOLS = applicationId + ":tools";
        PROCESS_SANDBOX = applicationId + ":sandbox";
        PROCESS_EXDEVICE = applicationId + ":exdevice";
        PROCESS_TMADSDKS = applicationId + ":TMAssistantDownloadSDKService";
        PROCESS_PATCH = applicationId + ":patch";
        PROCESS_APPBRAND0 = applicationId + ":appbrand0";
        PROCESS_APPBRAND1 = applicationId + ":appbrand1";
        PROCESS_APPBRAND2 = applicationId + ":appbrand2";
        PROCESS_APPBRAND3 = applicationId + ":appbrand3";
        PROCESS_APPBRAND4 = applicationId + ":appbrand4";
        PROCESS_ISOLATED_PROCESS0 = applicationId + ":isolated_process0";
        PROCESS_SUPPORT = applicationId + ":support";
    }

    public static boolean isExdeviceAlive() {
        return Util.isProcessRunning(MMApplicationContext.getContext(), PROCESS_EXDEVICE);
    }

    public static boolean isToolsAlive() {
        return Util.isProcessRunning(MMApplicationContext.getContext(), PROCESS_TOOLS);
    }
}
