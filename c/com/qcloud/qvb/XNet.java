package com.qcloud.qvb;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import p1203o9.C117727a;

public final class XNet {
    private static String SDK_VERSION = null;
    public static final String TAG = "[TencentXP2P][XNet]";
    private static WeakReference<Context> appCtx = null;
    private static String archCpuAbi = "";
    private static String cacheDir;
    private static String filesDir;
    private static boolean sIsSoLoaded;
    private byte _hellAccFlag_;

    private static native void _alias(String str, String str2);

    private static native long _construct(String str, String str2, String str3, String str4, Context context);

    private static native void _destroy();

    private static native void _disableDebug();

    private static native void _enableDebug();

    private static native String _host();

    private static native void _resume();

    private static native void _setInfo(String str, String str2, String str3);

    private static native void _setLogger();

    private static native String _targetArchABI();

    private static native String _version();

    public static void alias(String str, String str2) {
        if (sIsSoLoaded) {
            _alias(str, str2);
        }
    }

    public static int create(Context context, String str, String str2, String str3, String str4) {
        if (context == null || str == null || str2 == null || str3 == null || str4 == null) {
            throw new NullPointerException("context or appId or appKey or appSecretKey or requestToken can't be null when init p2p live stream!");
        }
        appCtx = new WeakReference<>(context);
        loadLibrary(context);
        int _construct = (int) _construct(str, str2, str3, str4, ((ContextWrapper) context).getBaseContext());
        SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("BuglySdkInfos", 0).edit();
        edit.putString("e30245116c", getVersion());
        edit.apply();
        return _construct;
    }

    public static void destroy() {
        if (sIsSoLoaded) {
            _destroy();
        }
    }

    public static void disableDebug() {
        if (sIsSoLoaded) {
            _disableDebug();
        }
    }

    public static void enableDebug() {
        if (sIsSoLoaded) {
            _enableDebug();
        }
    }

    private static String getArchABI() {
        if (archCpuAbi.isEmpty() && sIsSoLoaded) {
            archCpuAbi = _targetArchABI();
        }
        return isArchValid(archCpuAbi) ? archCpuAbi : "";
    }

    private static String getCacheDir() {
        String str = cacheDir;
        if (str != null) {
            return str;
        }
        Context context = appCtx.get();
        return context != null ? context.getCacheDir().getAbsolutePath() : "/";
    }

    private static String getDiskDir() {
        String str = filesDir;
        if (str != null) {
            return str;
        }
        Context context = appCtx.get();
        return context != null ? context.getFilesDir().getAbsolutePath() : "/";
    }

    public static String getHost() {
        return sIsSoLoaded ? _host() : "";
    }

    public static String getVersion() {
        if (sIsSoLoaded && SDK_VERSION == null) {
            SDK_VERSION = _version();
        }
        return SDK_VERSION;
    }

    private static boolean isArchValid(String str) {
        return Arrays.asList(C117727a.f352058a).contains(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005b, code lost:
        r9 = r9.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004a, code lost:
        if (android.text.TextUtils.isEmpty(r9.getMessage()) == false) goto L_0x005b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0056, code lost:
        if (android.text.TextUtils.isEmpty(r9.getMessage()) == false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void loadLibrary(android.content.Context r9) {
        /*
            java.lang.String r9 = "AdvanceP2P"
            k20.a r0 = new k20.a     // Catch:{ Exception -> 0x004d, UnsatisfiedLinkError -> 0x0041 }
            r0.<init>()     // Catch:{ Exception -> 0x004d, UnsatisfiedLinkError -> 0x0041 }
            r0.mo10233c(r9)     // Catch:{ Exception -> 0x004d, UnsatisfiedLinkError -> 0x0041 }
            java.lang.Object r9 = new java.lang.Object     // Catch:{ Exception -> 0x004d, UnsatisfiedLinkError -> 0x0041 }
            r9.<init>()     // Catch:{ Exception -> 0x004d, UnsatisfiedLinkError -> 0x0041 }
            java.lang.Object[] r2 = r0.mo10232b()     // Catch:{ Exception -> 0x004d, UnsatisfiedLinkError -> 0x0041 }
            java.lang.String r3 = "com/qcloud/qvb/XNet"
            java.lang.String r4 = "loadLibrary"
            java.lang.String r5 = "(Landroid/content/Context;)V"
            java.lang.String r6 = "java/lang/System_EXEC_"
            java.lang.String r7 = "loadLibrary"
            java.lang.String r8 = "(Ljava/lang/String;)V"
            r1 = r9
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x004d, UnsatisfiedLinkError -> 0x0041 }
            r1 = 0
            java.lang.Object r0 = r0.mo10231a(r1)     // Catch:{ Exception -> 0x004d, UnsatisfiedLinkError -> 0x0041 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x004d, UnsatisfiedLinkError -> 0x0041 }
            java.lang.System.loadLibrary(r0)     // Catch:{ Exception -> 0x004d, UnsatisfiedLinkError -> 0x0041 }
            java.lang.String r2 = "com/qcloud/qvb/XNet"
            java.lang.String r3 = "loadLibrary"
            java.lang.String r4 = "(Landroid/content/Context;)V"
            java.lang.String r5 = "java/lang/System_EXEC_"
            java.lang.String r6 = "loadLibrary"
            java.lang.String r7 = "(Ljava/lang/String;)V"
            r1 = r9
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x004d, UnsatisfiedLinkError -> 0x0041 }
            r9 = 1
            sIsSoLoaded = r9     // Catch:{ Exception -> 0x004d, UnsatisfiedLinkError -> 0x0041 }
            goto L_0x0058
        L_0x0041:
            r9 = move-exception
            java.lang.String r0 = r9.getMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x005b
            goto L_0x0058
        L_0x004d:
            r9 = move-exception
            java.lang.String r0 = r9.getMessage()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x005b
        L_0x0058:
            java.lang.String r9 = "load library failed."
            goto L_0x005f
        L_0x005b:
            java.lang.String r9 = r9.getMessage()
        L_0x005f:
            boolean r0 = sIsSoLoaded
            if (r0 == 0) goto L_0x0064
            return
        L_0x0064:
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qcloud.qvb.XNet.loadLibrary(android.content.Context):void");
    }

    private static boolean loadSoFromSdcard(C117727a aVar) {
        try {
            throw null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String proxyOf(String str) {
        String host = getHost();
        if (host.isEmpty()) {
            return "";
        }
        return host + "/" + str + "/";
    }

    public static boolean resume() {
        if (!sIsSoLoaded) {
            return false;
        }
        _resume();
        return true;
    }

    public static void setCacheDir(String str) {
        cacheDir = str;
    }

    public static void setFilesDir(String str) {
        filesDir = str;
    }

    public static void setInfo(String str, String str2, String str3) {
        if (str == null || str2 == null || str3 == null) {
            throw new NullPointerException("appId or appKey or appSecretKey can't be null!");
        } else if (sIsSoLoaded) {
            _setInfo(str, str2, str3);
        }
    }

    public static void setLoggerCallback(LoggerCallback loggerCallback) {
        LoggerCallback.setLoggerCallback(loggerCallback);
        if (sIsSoLoaded) {
            _setLogger();
        }
    }

    public void onEvent(int i, String str) {
    }
}
