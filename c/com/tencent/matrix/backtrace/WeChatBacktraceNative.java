package com.tencent.matrix.backtrace;

public class WeChatBacktraceNative {
    public static native String[] consumeRequestedQut();

    public static native void enableLogger(boolean z);

    public static native void immediateGeneration(boolean z);

    public static native void notifyWarmedUp(String str, int i);

    public static void requestQutGenerate() {
    }

    public static native void setBacktraceMode(int i);

    public static native void setPackageName(String str);

    public static native void setQuickenAlwaysOn(boolean z);

    public static native void setSavingPath(String str);

    public static native void setWarmedUp(boolean z);

    public static native int[] statistic(String str);

    public static native boolean testLoadQut(String str, int i);

    public static native boolean warmUp(String str, int i, boolean z);
}
