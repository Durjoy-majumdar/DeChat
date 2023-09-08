package com.tencent.midas.plugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.midas.comm.APLog;

public class APPluginProxyBroadcastReceiver extends BroadcastReceiver {
    public static void sendBroadcastReceiver(Context context, String str, String str2, Intent intent) {
        intent.putExtra(APPluginStatic.PARAM_PLUGIN_NAME, str);
        intent.putExtra(APPluginStatic.PARAM_PLUGIN_RECEIVER_CLASS_NAME, str2);
        try {
            context.sendBroadcast(intent);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.tencent.midas.plugin.IAPPluginBroadcastReceiver startPluginIfNeccessary(android.content.Context r10, android.content.Intent r11) {
        /*
            r9 = this;
            r0 = 0
            if (r11 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "pluginsdk_pluginName"
            java.lang.String r3 = r11.getStringExtra(r1)
            java.lang.String r1 = "pluginsdk_launchReceiver"
            java.lang.String r11 = r11.getStringExtra(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L_0x0021
            java.io.File r1 = com.tencent.midas.plugin.APPluginInstallerAndUpdater.getInstallPath(r10, r3)     // Catch:{ IOException -> 0x0020 }
            java.lang.String r1 = r1.getCanonicalPath()     // Catch:{ IOException -> 0x0020 }
            r4 = r1
            goto L_0x0022
        L_0x0020:
        L_0x0021:
            r4 = r0
        L_0x0022:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "startPluginIfNeccessary Params:"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r2 = ", "
            r1.append(r2)
            r1.append(r11)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "APPLuginProxyBroadcastReciver"
            com.tencent.midas.comm.APLog.m161214i(r2, r1)
            if (r3 == 0) goto L_0x0081
            int r1 = r3.length()
            if (r1 <= 0) goto L_0x0081
            java.io.File r1 = new java.io.File
            r1.<init>(r4)
            boolean r2 = r1.exists()
            if (r2 == 0) goto L_0x0081
            boolean r1 = r1.isFile()
            if (r1 == 0) goto L_0x0081
            java.util.concurrent.ConcurrentHashMap<java.lang.String, android.content.pm.PackageInfo> r1 = com.tencent.midas.plugin.APPluginStatic.sPackageInfoMap
            java.lang.Object r2 = r1.get(r4)
            android.content.pm.PackageInfo r2 = (android.content.pm.PackageInfo) r2
            if (r2 != 0) goto L_0x006b
            r2 = 1
            android.content.pm.PackageInfo r2 = com.tencent.midas.plugin.APApkFileParser.getPackageInfo(r10, r4, r2)
            r1.put(r4, r2)
        L_0x006b:
            r7 = r2
            dalvik.system.DexClassLoader r6 = com.tencent.midas.plugin.APPluginLoader.getOrCreateClassLoaderByPath(r10, r3, r4)     // Catch:{ Exception -> 0x0081 }
            java.lang.Class r10 = r6.loadClass(r11)     // Catch:{ Exception -> 0x0081 }
            java.lang.Object r10 = r10.newInstance()     // Catch:{ Exception -> 0x0081 }
            com.tencent.midas.plugin.IAPPluginBroadcastReceiver r10 = (com.tencent.midas.plugin.IAPPluginBroadcastReceiver) r10     // Catch:{ Exception -> 0x0081 }
            r8 = 0
            r2 = r10
            r5 = r9
            r2.IInit(r3, r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0080 }
        L_0x0080:
            r0 = r10
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.midas.plugin.APPluginProxyBroadcastReceiver.startPluginIfNeccessary(android.content.Context, android.content.Intent):com.tencent.midas.plugin.IAPPluginBroadcastReceiver");
    }

    public void onReceive(Context context, Intent intent) {
        IAPPluginBroadcastReceiver startPluginIfNeccessary = startPluginIfNeccessary(context, intent);
        APLog.m161214i("APPLuginProxyBroadcastReciver", "onReceive startPluginIfNeccessary: " + startPluginIfNeccessary);
        if (startPluginIfNeccessary != null) {
            startPluginIfNeccessary.IOnReceive(context, intent);
        }
    }
}
