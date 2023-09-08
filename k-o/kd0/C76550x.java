package kd0;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C116299g2;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import java.io.RandomAccessFile;
import junit.framework.Assert;

/* renamed from: kd0.x */
public class C76550x {
    /* renamed from: a */
    public static int m92052a(String str) {
        int r;
        Assert.assertTrue(str.length() >= 0);
        C86009m1 m1Var = new C86009m1(str);
        if (m1Var.mo119967g() && ((int) m1Var.mo119980r()) - 6 > 0) {
            return r;
        }
        return 0;
    }

    /* renamed from: b */
    public static int m92053b(String str) {
        if (Util.isNullOrNil(str)) {
            return -1;
        }
        Log.m105918d("MicroMsg.VoiceFile", "fileName " + str);
        if (m92056e(str, 0, false)) {
            return 0;
        }
        return m92057f(str, 0, false) ? 2 : 1;
    }

    /* renamed from: c */
    public static int m92054c(String str, int i, boolean z) {
        if (Util.isNullOrNil(str)) {
            return -1;
        }
        Log.m105918d("MicroMsg.VoiceFile", "fileName " + str);
        if (m92056e(str, i, z)) {
            return 0;
        }
        return m92057f(str, i, z) ? 2 : 1;
    }

    /* renamed from: d */
    public static int m92055d(String str) {
        int r;
        int r2;
        int b = m92053b(str);
        if (b == 0) {
            return m92052a(C76552z.m92075m(str));
        }
        boolean z = true;
        if (b == 1) {
            String m = C76552z.m92075m(str);
            if (m.length() < 0) {
                z = false;
            }
            Assert.assertTrue(z);
            C86009m1 m1Var = new C86009m1(m);
            if (m1Var.mo119967g() && (r = (int) m1Var.mo119980r()) > 0) {
                return r;
            }
            return 0;
        } else if (b != 2) {
            return m92052a(C76552z.m92075m(str));
        } else {
            String m2 = C76552z.m92075m(str);
            if (m2.length() < 0) {
                z = false;
            }
            Assert.assertTrue(z);
            C86009m1 m1Var2 = new C86009m1(m2);
            if (m1Var2.mo119967g() && (r2 = (int) m1Var2.mo119980r()) > 0) {
                return r2;
            }
            return 0;
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006d */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m92056e(java.lang.String r7, int r8, boolean r9) {
        /*
            java.lang.String r0 = "#!AMR\n"
            r1 = 0
            if (r9 == 0) goto L_0x0006
            goto L_0x000e
        L_0x0006:
            if (r8 != 0) goto L_0x000d
            java.lang.String r7 = kd0.C76552z.m92075m(r7)
            goto L_0x000e
        L_0x000d:
            r7 = r1
        L_0x000e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "path "
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "MicroMsg.VoiceFile"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r8)
            r8 = 0
            java.io.RandomAccessFile r1 = com.tencent.p014mm.vfs.C86013q1.m106420B(r7, r8)     // Catch:{ FileNotFoundException -> 0x006d, IOException -> 0x0061 }
            r2 = 6
            byte[] r3 = new byte[r2]     // Catch:{ FileNotFoundException -> 0x006d, IOException -> 0x0061 }
            int r2 = r1.read(r3, r8, r2)     // Catch:{ FileNotFoundException -> 0x006d, IOException -> 0x0061 }
            r4 = -1
            if (r2 != r4) goto L_0x003c
            java.lang.String r0 = "read amr file header failed!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r9, r0)     // Catch:{ FileNotFoundException -> 0x006d, IOException -> 0x0061 }
            com.tencent.p014mm.vfs.C116299g2.m163847c(r1)
            return r8
        L_0x003c:
            java.lang.String r2 = new java.lang.String     // Catch:{ FileNotFoundException -> 0x006d, IOException -> 0x0061 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x006d, IOException -> 0x0061 }
            java.lang.String r4 = "isAmrHeader voice file headHex:|%s| headStr:|%s| AmrFileOperator.AMR_NB_HEAD:|%s|"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ FileNotFoundException -> 0x006d, IOException -> 0x0061 }
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.dumpHex(r3)     // Catch:{ FileNotFoundException -> 0x006d, IOException -> 0x0061 }
            r5[r8] = r3     // Catch:{ FileNotFoundException -> 0x006d, IOException -> 0x0061 }
            r3 = 1
            r5[r3] = r2     // Catch:{ FileNotFoundException -> 0x006d, IOException -> 0x0061 }
            r6 = 2
            r5[r6] = r0     // Catch:{ FileNotFoundException -> 0x006d, IOException -> 0x0061 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r4, r5)     // Catch:{ FileNotFoundException -> 0x006d, IOException -> 0x0061 }
            boolean r7 = r2.endsWith(r0)     // Catch:{ FileNotFoundException -> 0x006d, IOException -> 0x0061 }
            if (r7 == 0) goto L_0x0069
            com.tencent.p014mm.vfs.C116299g2.m163847c(r1)
            return r3
        L_0x005f:
            r7 = move-exception
            goto L_0x0083
        L_0x0061:
            r7 = move-exception
            java.lang.String r0 = ""
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ all -> 0x005f }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r7, r0, r2)     // Catch:{ all -> 0x005f }
        L_0x0069:
            com.tencent.p014mm.vfs.C116299g2.m163847c(r1)
            goto L_0x0082
        L_0x006d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x005f }
            r0.<init>()     // Catch:{ all -> 0x005f }
            java.lang.String r2 = "FileNotFoundException: "
            r0.append(r2)     // Catch:{ all -> 0x005f }
            r0.append(r7)     // Catch:{ all -> 0x005f }
            java.lang.String r7 = r0.toString()     // Catch:{ all -> 0x005f }
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r7)     // Catch:{ all -> 0x005f }
            goto L_0x0069
        L_0x0082:
            return r8
        L_0x0083:
            com.tencent.p014mm.vfs.C116299g2.m163847c(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kd0.C76550x.m92056e(java.lang.String, int, boolean):boolean");
    }

    /* renamed from: f */
    public static boolean m92057f(String str, int i, boolean z) {
        RandomAccessFile randomAccessFile = null;
        if (!z) {
            if (i == 0) {
                str = C76552z.m92075m(str);
            } else if (i == 1) {
                Log.m105921e("MicroMsg.VoiceFile", "isSilkHeader usertype error, TYPE_RECOGNIZER_BIZ fileName:%s", str);
                return false;
            } else {
                str = null;
            }
        }
        Log.m105918d("MicroMsg.VoiceFile", "isSilkHeader path " + str);
        try {
            randomAccessFile = C86013q1.m106420B(str, false);
            byte[] bArr = new byte[9];
            randomAccessFile.seek(1);
            if (randomAccessFile.read(bArr, 0, 9) == -1) {
                C116299g2.m163847c(randomAccessFile);
                return false;
            }
            String str2 = new String(bArr);
            Log.m105925i("MicroMsg.VoiceFile", "isSilkHeader voice file headHex:|%s| headStr:|%s| AmrFileOperator.AMR_NB_HEAD:|%s|", Util.dumpHex(bArr), str2, "#!SILK_V3");
            if (str2.endsWith("#!SILK_V3")) {
                C116299g2.m163847c(randomAccessFile);
                return true;
            }
            C116299g2.m163847c(randomAccessFile);
            return false;
        } catch (Exception unused) {
            Log.m105918d("MicroMsg.VoiceFile", "isSilkHeader file not found");
        } catch (Throwable th) {
            C116299g2.m163847c(randomAccessFile);
            throw th;
        }
    }
}
