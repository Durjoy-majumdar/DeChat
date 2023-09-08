package com.tencent.ytcommon.auth;

import android.content.Context;
import android.content.res.AssetManager;

public class Auth {
    /* renamed from: a */
    public static int m144676a() {
        return nativeGetVersion();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if (new java.io.File(r10).exists() == false) goto L_0x0039;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m144677b(android.content.Context r9, java.lang.String r10, java.lang.String r11, int r12) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 29
            if (r0 < r2) goto L_0x0009
        L_0x0007:
            r7 = 0
            goto L_0x0018
        L_0x0009:
            r2 = 23
            if (r0 < r2) goto L_0x0016
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = r9.checkSelfPermission(r0)
            if (r0 == 0) goto L_0x0016
            goto L_0x0007
        L_0x0016:
            r0 = 1
            r7 = 1
        L_0x0018:
            r0 = -10
            if (r12 != 0) goto L_0x002b
            android.content.res.AssetManager r2 = r9.getAssets()     // Catch:{ Exception -> 0x0039 }
            java.io.InputStream r1 = r2.open(r10, r1)     // Catch:{ Exception -> 0x0039 }
            if (r1 != 0) goto L_0x0027
            return r0
        L_0x0027:
            r1.close()     // Catch:{ Exception -> 0x0039 }
            goto L_0x003a
        L_0x002b:
            r1 = 2
            if (r12 != r1) goto L_0x003a
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0039 }
            r1.<init>(r10)     // Catch:{ Exception -> 0x0039 }
            boolean r1 = r1.exists()     // Catch:{ Exception -> 0x0039 }
            if (r1 != 0) goto L_0x003a
        L_0x0039:
            return r0
        L_0x003a:
            android.content.res.AssetManager r5 = r9.getAssets()
            r2 = r9
            r3 = r12
            r4 = r10
            r6 = r10
            r8 = r11
            int r9 = nativeInitN(r2, r3, r4, r5, r6, r7, r8)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.ytcommon.auth.Auth.m144677b(android.content.Context, java.lang.String, java.lang.String, int):int");
    }

    public static native String getFailedReason(int i);

    private static native boolean nativeCheck();

    private static native long nativeGetEndTime();

    private static native int nativeGetLicense(Context context, String str, String str2, String str3, int i, boolean z, String str4);

    private static native int nativeGetVersion();

    private static native int nativeInitN(Context context, int i, String str, AssetManager assetManager, String str2, boolean z, String str3);

    private static native int nativeSetSerial(String str);
}
