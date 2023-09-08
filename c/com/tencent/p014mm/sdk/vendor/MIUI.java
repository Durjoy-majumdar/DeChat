package com.tencent.p014mm.sdk.vendor;

import android.os.Build;
import android.text.TextUtils;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p156gj.C45918i0;

/* renamed from: com.tencent.mm.sdk.vendor.MIUI */
public class MIUI {
    private static final String TAG = "Vendor.MIUI";
    private static Boolean ifMIUI;
    private static Boolean ifNotificationChannelSupportNativeActionJump;
    private static Boolean isMIUI;
    private static Boolean isMIUIV10;
    private static Boolean isMIUIV8;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0068 A[SYNTHETIC, Splitter:B:22:0x0068] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007d A[SYNTHETIC, Splitter:B:30:0x007d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getSystemProperty(java.lang.String r9) {
        /*
            java.lang.String r0 = "Exception while closing InputStream : %s"
            java.lang.String r1 = "Vendor.MIUI"
            r2 = 0
            r3 = 1
            r4 = 0
            java.lang.Runtime r5 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
            r6.<init>()     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
            java.lang.String r7 = "getprop "
            r6.append(r7)     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
            r6.append(r9)     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
            java.lang.Process r5 = r5.exec(r6)     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
            if (r5 != 0) goto L_0x0028
            java.lang.String r5 = "get process null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r5)     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
            return r2
        L_0x0028:
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
            java.io.InputStream r5 = r5.getInputStream()     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
            r7.<init>(r5)     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
            r5 = 1024(0x400, float:1.435E-42)
            r6.<init>(r7, r5)     // Catch:{ Exception -> 0x0054, all -> 0x0052 }
            java.lang.String r5 = r6.readLine()     // Catch:{ Exception -> 0x0050 }
            r6.close()     // Catch:{ Exception -> 0x0050 }
            r6.close()     // Catch:{ IOException -> 0x0043 }
            goto L_0x004f
        L_0x0043:
            r9 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r3]
            java.lang.String r9 = r9.getMessage()
            r2[r4] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r2)
        L_0x004f:
            return r5
        L_0x0050:
            r5 = move-exception
            goto L_0x0056
        L_0x0052:
            r9 = move-exception
            goto L_0x007b
        L_0x0054:
            r5 = move-exception
            r6 = r2
        L_0x0056:
            java.lang.String r7 = "Unable to read sysprop %s Exception:%s"
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x0079 }
            r8[r4] = r9     // Catch:{ all -> 0x0079 }
            java.lang.String r9 = r5.getMessage()     // Catch:{ all -> 0x0079 }
            r8[r3] = r9     // Catch:{ all -> 0x0079 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r7, r8)     // Catch:{ all -> 0x0079 }
            if (r6 == 0) goto L_0x0078
            r6.close()     // Catch:{ IOException -> 0x006c }
            goto L_0x0078
        L_0x006c:
            r9 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r9 = r9.getMessage()
            r3[r4] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r3)
        L_0x0078:
            return r2
        L_0x0079:
            r9 = move-exception
            r2 = r6
        L_0x007b:
            if (r2 == 0) goto L_0x008d
            r2.close()     // Catch:{ IOException -> 0x0081 }
            goto L_0x008d
        L_0x0081:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r2 = r2.getMessage()
            r3[r4] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r3)
        L_0x008d:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.vendor.MIUI.getSystemProperty(java.lang.String):java.lang.String");
    }

    public static boolean ifInMinAndMax(int i, String str, String str2, String str3) {
        if (i >= Integer.parseInt(str)) {
            if (Util.isEqual(str2, "")) {
                if (!ifMIUI() || ifLessThanVersinCode(str3)) {
                    return true;
                }
            } else if (i <= Integer.parseInt(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean ifLessThanVersinCode(String str) {
        return Util.isNullOrNil(str) || Long.valueOf(getSystemProperty("ro.miui.version.code_time")).longValue() < Long.valueOf(str).longValue();
    }

    public static boolean ifMIUI() {
        if (ifMIUI == null) {
            String str = Build.MANUFACTURER;
            Log.m105925i(TAG, "Build.MANUFACTURER = %s", str);
            if (TextUtils.isEmpty(str) || !str.equalsIgnoreCase("Xiaomi")) {
                ifMIUI = Boolean.FALSE;
            } else {
                ifMIUI = Boolean.TRUE;
            }
        }
        return ifMIUI.booleanValue();
    }

    public static boolean ifNotificationChannelSupportNativeActionJump() {
        if (ifNotificationChannelSupportNativeActionJump == null) {
            String str = Build.MANUFACTURER;
            Log.m105925i(TAG, "Build.MANUFACTURER = %s, Build.MODEL ", str);
            if (TextUtils.isEmpty(str) || !str.equals("Xiaomi")) {
                ifNotificationChannelSupportNativeActionJump = Boolean.FALSE;
            } else {
                String systemProperty = getSystemProperty("ro.miui.version.code_time");
                Log.m105929w(TAG, "ifNotificationChannelSupportNativeActionJump() versionCode:%s", systemProperty);
                if (Long.valueOf(systemProperty).longValue() > Long.valueOf("1536681600").longValue()) {
                    ifNotificationChannelSupportNativeActionJump = Boolean.TRUE;
                } else {
                    ifNotificationChannelSupportNativeActionJump = Boolean.FALSE;
                }
            }
        }
        Log.m105925i(TAG, "ifNotificationChannelSupportNativeActionJump() ifNotificationChannelSupportNativeActionJump:%s", Boolean.valueOf(ifNotificationChannelSupportNativeActionJump.booleanValue()));
        return ifNotificationChannelSupportNativeActionJump.booleanValue();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.tencent.mm.vfs.f0$h, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006a, code lost:
        if (r1 != null) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0083, code lost:
        if (r1 == 0) goto L_0x008c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isMIUI() {
        /*
            java.lang.Boolean r0 = isMIUI
            if (r0 != 0) goto L_0x008c
            r0 = 0
            r1 = 0
            java.io.File r2 = android.os.Environment.getRootDirectory()     // Catch:{ Exception -> 0x0072 }
            java.lang.String r3 = "build.prop"
            if (r2 != 0) goto L_0x0010
            r2 = r1
            goto L_0x0018
        L_0x0010:
            java.lang.String r2 = r2.getPath()     // Catch:{ Exception -> 0x0072 }
            android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r2)     // Catch:{ Exception -> 0x0072 }
        L_0x0018:
            if (r2 != 0) goto L_0x0024
            android.net.Uri$Builder r2 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x0072 }
            r2.<init>()     // Catch:{ Exception -> 0x0072 }
            android.net.Uri$Builder r2 = r2.path(r3)     // Catch:{ Exception -> 0x0072 }
            goto L_0x002b
        L_0x0024:
            android.net.Uri$Builder r2 = r2.buildUpon()     // Catch:{ Exception -> 0x0072 }
            r2.appendPath(r3)     // Catch:{ Exception -> 0x0072 }
        L_0x002b:
            android.net.Uri r3 = r2.build()     // Catch:{ Exception -> 0x0072 }
            java.lang.String r4 = r3.getPath()     // Catch:{ Exception -> 0x0072 }
            if (r4 == 0) goto L_0x004b
            java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r0, r0)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r5 = r3.getPath()     // Catch:{ Exception -> 0x0072 }
            boolean r5 = r5.equals(r4)     // Catch:{ Exception -> 0x0072 }
            if (r5 != 0) goto L_0x004b
            android.net.Uri$Builder r2 = r2.path(r4)     // Catch:{ Exception -> 0x0072 }
            android.net.Uri r3 = r2.build()     // Catch:{ Exception -> 0x0072 }
        L_0x004b:
            com.tencent.mm.vfs.f0 r2 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0072 }
            com.tencent.mm.vfs.f0$h r2 = r2.mo177799l(r3, r1)     // Catch:{ Exception -> 0x0072 }
            java.io.InputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106421C(r3, r2)     // Catch:{ Exception -> 0x0072 }
            java.util.Properties r2 = new java.util.Properties     // Catch:{ Exception -> 0x0072 }
            r2.<init>()     // Catch:{ Exception -> 0x0072 }
            r2.load(r1)     // Catch:{ Exception -> 0x0072 }
            java.lang.String r3 = "ro.miui.ui.version.name"
            boolean r2 = r2.containsKey(r3)     // Catch:{ Exception -> 0x0072 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ Exception -> 0x0072 }
            isMIUI = r2     // Catch:{ Exception -> 0x0072 }
            if (r1 == 0) goto L_0x008c
        L_0x006c:
            r1.close()     // Catch:{ Exception -> 0x008c }
            goto L_0x008c
        L_0x0070:
            r0 = move-exception
            goto L_0x0086
        L_0x0072:
            r2 = move-exception
            java.lang.String r3 = "Vendor.MIUI"
            java.lang.String r4 = "e = %s, ** failed to fetch miui prop, assume we are not on miui. **"
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0070 }
            r5[r0] = r2     // Catch:{ all -> 0x0070 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r3, r4, r5)     // Catch:{ all -> 0x0070 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0070 }
            isMIUI = r0     // Catch:{ all -> 0x0070 }
            if (r1 == 0) goto L_0x008c
            goto L_0x006c
        L_0x0086:
            if (r1 == 0) goto L_0x008b
            r1.close()     // Catch:{ Exception -> 0x008b }
        L_0x008b:
            throw r0
        L_0x008c:
            java.lang.Boolean r0 = isMIUI
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.vendor.MIUI.isMIUI():boolean");
    }

    public static boolean isMIUI10() {
        if (isMIUIV10 == null) {
            String str = Build.MANUFACTURER;
            Log.m105925i(TAG, "Build.MANUFACTURER = %s", str);
            if (TextUtils.isEmpty(str) || !str.equalsIgnoreCase("Xiaomi")) {
                isMIUIV10 = Boolean.FALSE;
            } else if (Util.isEqual(C45918i0.m51188a("ro.miui.ui.version.code"), "8")) {
                isMIUIV10 = Boolean.TRUE;
            } else {
                isMIUIV10 = Boolean.FALSE;
            }
        }
        return isMIUIV10.booleanValue();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.tencent.mm.vfs.f0$h, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r4v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0086, code lost:
        if (r4 != null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009b, code lost:
        if (r4 == 0) goto L_0x00a4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isMIUIV8() {
        /*
            java.lang.String r0 = ""
            java.lang.String r1 = "ro.miui.ui.version.name"
            java.lang.String r2 = "Vendor.MIUI"
            java.lang.Boolean r3 = isMIUIV8
            if (r3 != 0) goto L_0x00a4
            r3 = 1
            r4 = 0
            r5 = 0
            java.io.File r6 = android.os.Environment.getRootDirectory()     // Catch:{ Exception -> 0x0054 }
            java.lang.String r7 = "build.prop"
            if (r6 != 0) goto L_0x0018
            r6 = r4
            goto L_0x0020
        L_0x0018:
            java.lang.String r6 = r6.getPath()     // Catch:{ Exception -> 0x0054 }
            android.net.Uri r6 = com.tencent.p014mm.vfs.C116299g2.m163858n(r6)     // Catch:{ Exception -> 0x0054 }
        L_0x0020:
            if (r6 != 0) goto L_0x002c
            android.net.Uri$Builder r6 = new android.net.Uri$Builder     // Catch:{ Exception -> 0x0054 }
            r6.<init>()     // Catch:{ Exception -> 0x0054 }
            android.net.Uri$Builder r6 = r6.path(r7)     // Catch:{ Exception -> 0x0054 }
            goto L_0x0033
        L_0x002c:
            android.net.Uri$Builder r6 = r6.buildUpon()     // Catch:{ Exception -> 0x0054 }
            r6.appendPath(r7)     // Catch:{ Exception -> 0x0054 }
        L_0x0033:
            android.net.Uri r7 = r6.build()     // Catch:{ Exception -> 0x0054 }
            java.lang.String r8 = r7.getPath()     // Catch:{ Exception -> 0x0054 }
            if (r8 == 0) goto L_0x0056
            java.lang.String r8 = com.tencent.p014mm.vfs.C116299g2.m163855k(r8, r5, r5)     // Catch:{ Exception -> 0x0054 }
            java.lang.String r9 = r7.getPath()     // Catch:{ Exception -> 0x0054 }
            boolean r9 = r9.equals(r8)     // Catch:{ Exception -> 0x0054 }
            if (r9 != 0) goto L_0x0056
            android.net.Uri$Builder r6 = r6.path(r8)     // Catch:{ Exception -> 0x0054 }
            android.net.Uri r7 = r6.build()     // Catch:{ Exception -> 0x0054 }
            goto L_0x0056
        L_0x0054:
            r0 = move-exception
            goto L_0x008e
        L_0x0056:
            com.tencent.mm.vfs.f0 r6 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a     // Catch:{ Exception -> 0x0054 }
            com.tencent.mm.vfs.f0$h r6 = r6.mo177799l(r7, r4)     // Catch:{ Exception -> 0x0054 }
            java.io.InputStream r4 = com.tencent.p014mm.vfs.C86013q1.m106421C(r7, r6)     // Catch:{ Exception -> 0x0054 }
            java.util.Properties r6 = new java.util.Properties     // Catch:{ Exception -> 0x0054 }
            r6.<init>()     // Catch:{ Exception -> 0x0054 }
            r6.load(r4)     // Catch:{ Exception -> 0x0054 }
            java.lang.String r7 = "ro.miui.ui.version.name %s"
            java.lang.Object[] r8 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0054 }
            java.lang.String r9 = r6.getProperty(r1, r0)     // Catch:{ Exception -> 0x0054 }
            r8[r5] = r9     // Catch:{ Exception -> 0x0054 }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r7, r8)     // Catch:{ Exception -> 0x0054 }
            java.lang.String r0 = r6.getProperty(r1, r0)     // Catch:{ Exception -> 0x0054 }
            java.lang.String r1 = "V8"
            boolean r0 = r0.contains(r1)     // Catch:{ Exception -> 0x0054 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x0054 }
            isMIUIV8 = r0     // Catch:{ Exception -> 0x0054 }
            if (r4 == 0) goto L_0x00a4
        L_0x0088:
            r4.close()     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00a4
        L_0x008c:
            r0 = move-exception
            goto L_0x009e
        L_0x008e:
            java.lang.String r1 = "e = %s, ** failed to fetch miui prop, assume we are not on miui. **"
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x008c }
            r3[r5] = r0     // Catch:{ all -> 0x008c }
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r2, r1, r3)     // Catch:{ all -> 0x008c }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x008c }
            isMIUIV8 = r0     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x00a4
            goto L_0x0088
        L_0x009e:
            if (r4 == 0) goto L_0x00a3
            r4.close()     // Catch:{ Exception -> 0x00a3 }
        L_0x00a3:
            throw r0
        L_0x00a4:
            java.lang.Boolean r0 = isMIUIV8
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.vendor.MIUI.isMIUIV8():boolean");
    }

    public static boolean isXiaoMi() {
        String str = Build.BRAND;
        return !Util.isNullOrNil(str) && str.toLowerCase().contains("xiaomi");
    }
}
