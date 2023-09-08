package com.tencent.xweb;

public interface IXWebPreferences {
    public static final String ALLOW_UNIVERSAL_ACCESS_FROM_FILE = "allow-universal-access-from-file";
    public static final String ANIMATABLE_XWALK_VIEW = "animatable-xwalk-view";
    public static final String ENABLE_EXTENSIONS = "enable-extensions";
    public static final String ENABLE_JAVASCRIPT = "enable-javascript";
    public static final String ENABLE_THEME_COLOR = "enable-theme-color";
    public static final String JAVASCRIPT_CAN_OPEN_WINDOW = "javascript-can-open-window";
    public static final String PROFILE_NAME = "profile-name";
    public static final String REMOTE_DEBUGGING = "remote-debugging";
    public static final String SPATIAL_NAVIGATION = "enable-spatial-navigation";
    public static final String SUPPORT_MULTIPLE_WINDOWS = "support-multiple-windows";
    public static final String XWEBSDK_VERSION = "xwebsdk-version";
    public static final String XWEB_LANGUAGE = "lang";
    public static final String XWEB_RENDERER_SANDBOX = "sandbox";
    public static final String XWEB_VERSION = "xweb-version";

    boolean getBooleanValue(String str);

    int getIntegerValue(String str);

    String getStringValue(String str);

    boolean getValue(String str);

    void setValue(String str, int i);

    void setValue(String str, String str2);

    void setValue(String str, boolean z);
}
