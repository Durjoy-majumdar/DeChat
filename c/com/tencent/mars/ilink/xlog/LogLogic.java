package com.tencent.mars.ilink.xlog;

public class LogLogic {
    public static native int getAppenderModeFromCfg();

    public static native int getIPxxLogLevel();

    public static native int getLogLevelFromCfg();

    public static native void initIPxxLogInfo();

    public static native void initLogInfo();

    public static native void setIPxxLogML(int i, int i2);

    public static native void setIsAlphaVersion(boolean z);
}
