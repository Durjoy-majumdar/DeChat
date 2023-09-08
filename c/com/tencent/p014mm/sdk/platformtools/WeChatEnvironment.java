package com.tencent.p014mm.sdk.platformtools;

import com.tencent.p014mm.sdk.crash.CrashReportFactory;

/* renamed from: com.tencent.mm.sdk.platformtools.WeChatEnvironment */
public class WeChatEnvironment {
    private static boolean coolassistEnv;
    private static String debuggerApiLevel;
    private static boolean monkeyEnv;

    public static String getDebuggerApiLevel() {
        return debuggerApiLevel;
    }

    public static boolean hasDebugger() {
        return CrashReportFactory.hasDebuger();
    }

    public static boolean isCoolassistEnv() {
        return coolassistEnv;
    }

    public static boolean isMonkeyEnv() {
        return monkeyEnv;
    }

    public static void setCoolassistEnv(boolean z) {
        coolassistEnv = z;
    }

    public static void setDebuggerApiLevel(String str) {
        debuggerApiLevel = str;
    }

    public static void setMonkeyEnv(boolean z) {
        monkeyEnv = z;
    }
}
