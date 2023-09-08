package p172io.clipworks.corekit;

import android.text.TextUtils;

/* renamed from: io.clipworks.corekit.HarmonyOSChecker */
public final class HarmonyOSChecker {
    private static final String HARMONY_OS = "harmony";
    private static final String TAG = "HarmonyOSChecker";
    private static boolean isInitialized = false;
    private static String osBrand = "";
    private static String osVersion = "";

    public static synchronized int getMajorVer() {
        synchronized (HarmonyOSChecker.class) {
            if (!isInitialized()) {
                throw new IllegalStateException("Checker not inited");
            } else if (TextUtils.isEmpty(osVersion)) {
                return -1;
            } else {
                String[] split = osVersion.split("\\.");
                if (split.length <= 0) {
                    return -1;
                }
                int parseInt = Integer.parseInt(split[0]);
                return parseInt;
            }
        }
    }

    public static synchronized String getOsVersion() {
        String str;
        synchronized (HarmonyOSChecker.class) {
            if (isInitialized()) {
                str = osVersion;
            } else {
                throw new IllegalStateException("Checker not inited");
            }
        }
        return str;
    }

    public static synchronized void init() {
        synchronized (HarmonyOSChecker.class) {
            if (!isInitialized) {
                try {
                    Class<?> cls = Class.forName("com.huawei.system.BuildEx");
                    osBrand = (String) cls.getMethod("getOsBrand", new Class[0]).invoke(cls, new Object[0]);
                    Class<?> cls2 = Class.forName("ohos.system.version.SystemVersion");
                    osVersion = (String) cls2.getMethod("getVersion", new Class[0]).invoke(cls2, new Object[0]);
                } catch (Exception unused) {
                }
                isInitialized = true;
            }
        }
    }

    public static synchronized boolean isHarmonyOS() {
        boolean equals;
        synchronized (HarmonyOSChecker.class) {
            if (isInitialized()) {
                equals = HARMONY_OS.equals(osBrand);
            } else {
                throw new IllegalStateException("Checker not inited");
            }
        }
        return equals;
    }

    public static synchronized boolean isInitialized() {
        boolean z;
        synchronized (HarmonyOSChecker.class) {
            z = isInitialized;
        }
        return z;
    }
}
