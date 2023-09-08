package com.tencent.p014mm.sdk.platformtools;

import android.content.Context;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.tencent.mm.sdk.platformtools.FilesCopy */
public final class FilesCopy {
    private static final String TAG = "MicroMsg.SDK.FilesCopy";

    private FilesCopy() {
    }

    public static boolean copy(String str, String str2, boolean z) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        C86009m1 m1Var = new C86009m1(str);
        if (!m1Var.mo119967g()) {
            return false;
        }
        C86009m1 m1Var2 = new C86009m1(str2);
        if (m1Var.mo119978p()) {
            if (!m1Var2.mo119978p() && m1Var2.mo119967g()) {
                return false;
            }
            copyFile(str, str2);
            if (!z) {
                return true;
            }
            m1Var.mo119966f();
            return true;
        } else if (!m1Var.mo119977o()) {
            return true;
        } else {
            if (!m1Var2.mo119967g()) {
                m1Var2.mo119987x();
            }
            if (!m1Var2.mo119977o()) {
                return false;
            }
            String[] s = m1Var.mo119981s();
            for (int i = 0; i < s.length; i++) {
                copy(str + "/" + s[i], str2 + "/" + s[i], z);
            }
            return true;
        }
    }

    public static boolean copyAssets(Context context, String str, String str2) {
        try {
            return copyAssetsStream(context.getAssets().open(str), str2, false);
        } catch (IOException unused) {
            Log.m105921e(TAG, "copy assets file srcpath=%s to=%s failed, try pattern now", str, str2);
            int i = 0;
            while (true) {
                String str3 = str + "." + i;
                try {
                    if (!copyAssetsStream(context.getAssets().open(str3), str2, true)) {
                        break;
                    }
                    Log.m105919d(TAG, "copy pattern %s", str3);
                    i++;
                } catch (IOException unused2) {
                }
            }
            return true;
        }
    }

    private static boolean copyAssetsStream(InputStream inputStream, String str, boolean z) {
        OutputStream outputStream = null;
        try {
            int available = inputStream.available();
            OutputStream K = C86013q1.m106429K(str, z);
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                K.write(bArr, 0, read);
            }
            boolean z2 = true;
            if (!z) {
                C86009m1 m1Var = new C86009m1(str);
                if (!m1Var.mo119967g() || ((long) available) != m1Var.mo119980r()) {
                    z2 = false;
                }
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                Log.printErrStackTrace(TAG, e, "", new Object[0]);
                z2 = false;
            }
            if (K != null) {
                try {
                    K.close();
                } catch (IOException e2) {
                    Log.printErrStackTrace(TAG, e2, "", new Object[0]);
                    return false;
                }
            }
            return z2;
        } catch (Exception e3) {
            Log.printErrStackTrace(TAG, e3, "", new Object[0]);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    Log.printErrStackTrace(TAG, e4, "", new Object[0]);
                }
            }
            if (outputStream == null) {
                return false;
            }
            try {
                outputStream.close();
                return false;
            } catch (IOException e5) {
                Log.printErrStackTrace(TAG, e5, "", new Object[0]);
                return false;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e6) {
                    Log.printErrStackTrace(TAG, e6, "", new Object[0]);
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e7) {
                    Log.printErrStackTrace(TAG, e7, "", new Object[0]);
                }
            }
            throw th;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0065 A[SYNTHETIC, Splitter:B:36:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0071 A[SYNTHETIC, Splitter:B:41:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x007f A[SYNTHETIC, Splitter:B:47:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x008b A[SYNTHETIC, Splitter:B:52:0x008b] */
    /* JADX WARNING: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean copyFile(java.lang.String r8, java.lang.String r9) {
        /*
            java.lang.String r0 = ""
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            java.lang.String r2 = "MicroMsg.SDK.FilesCopy"
            r3 = 0
            if (r1 != 0) goto L_0x0096
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            if (r1 == 0) goto L_0x0013
            goto L_0x0096
        L_0x0013:
            boolean r1 = r8.equals(r9)
            r4 = 1
            if (r1 == 0) goto L_0x001b
            return r4
        L_0x001b:
            r1 = 0
            java.io.InputStream r8 = com.tencent.p014mm.vfs.C86013q1.m106423E(r8)     // Catch:{ Exception -> 0x005c, all -> 0x0059 }
            java.io.OutputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106429K(r9, r3)     // Catch:{ Exception -> 0x004f, all -> 0x004d }
            r9 = 16384(0x4000, float:2.2959E-41)
            byte[] r9 = new byte[r9]     // Catch:{ Exception -> 0x004f, all -> 0x004d }
        L_0x0028:
            int r5 = r8.read(r9)     // Catch:{ Exception -> 0x004f, all -> 0x004d }
            r6 = -1
            if (r5 == r6) goto L_0x0033
            r1.write(r9, r3, r5)     // Catch:{ Exception -> 0x004f, all -> 0x004d }
            goto L_0x0028
        L_0x0033:
            r8.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x003e
        L_0x0037:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r8, r0, r9)
            r4 = 0
        L_0x003e:
            if (r1 == 0) goto L_0x004b
            r1.close()     // Catch:{ IOException -> 0x0044 }
            goto L_0x004b
        L_0x0044:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r8, r0, r9)
            goto L_0x007b
        L_0x004b:
            r3 = r4
            goto L_0x007b
        L_0x004d:
            r9 = move-exception
            goto L_0x0051
        L_0x004f:
            r9 = move-exception
            goto L_0x0055
        L_0x0051:
            r7 = r1
            r1 = r8
            r8 = r7
            goto L_0x007d
        L_0x0055:
            r7 = r1
            r1 = r8
            r8 = r7
            goto L_0x005e
        L_0x0059:
            r9 = move-exception
            r8 = r1
            goto L_0x007d
        L_0x005c:
            r9 = move-exception
            r8 = r1
        L_0x005e:
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x007c }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r9, r0, r4)     // Catch:{ all -> 0x007c }
            if (r1 == 0) goto L_0x006f
            r1.close()     // Catch:{ IOException -> 0x0069 }
            goto L_0x006f
        L_0x0069:
            r9 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r9, r0, r1)
        L_0x006f:
            if (r8 == 0) goto L_0x007b
            r8.close()     // Catch:{ IOException -> 0x0075 }
            goto L_0x007b
        L_0x0075:
            r8 = move-exception
            java.lang.Object[] r9 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r8, r0, r9)
        L_0x007b:
            return r3
        L_0x007c:
            r9 = move-exception
        L_0x007d:
            if (r1 == 0) goto L_0x0089
            r1.close()     // Catch:{ IOException -> 0x0083 }
            goto L_0x0089
        L_0x0083:
            r1 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r1, r0, r4)
        L_0x0089:
            if (r8 == 0) goto L_0x0095
            r8.close()     // Catch:{ IOException -> 0x008f }
            goto L_0x0095
        L_0x008f:
            r8 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r3]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r8, r0, r1)
        L_0x0095:
            throw r9
        L_0x0096:
            java.lang.String r8 = "copy file but src path or dest path is null, return false."
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r2, r8)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.sdk.platformtools.FilesCopy.copyFile(java.lang.String, java.lang.String):boolean");
    }
}
