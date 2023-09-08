package a12;

import a70.C112760b;
import com.tencent.p014mm.app.C80611s0;
import com.tencent.p014mm.sdk.platformtools.Util;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/* renamed from: a12.l */
public final class C79458l {

    /* renamed from: a */
    public static final File f232996a = new File(C112760b.m154225d(), "patch_ver_history.bin");

    /* renamed from: b */
    public static boolean f232997b = false;

    /* renamed from: c */
    public static int f232998c = 0;

    /* renamed from: d */
    public static int f232999d = 0;

    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0047 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m96414a() {
        /*
            r0 = 0
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ FileNotFoundException -> 0x0047, all -> 0x0023 }
            java.io.BufferedInputStream r2 = new java.io.BufferedInputStream     // Catch:{ FileNotFoundException -> 0x0047, all -> 0x0023 }
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0047, all -> 0x0023 }
            java.io.File r4 = f232996a     // Catch:{ FileNotFoundException -> 0x0047, all -> 0x0023 }
            r3.<init>(r4)     // Catch:{ FileNotFoundException -> 0x0047, all -> 0x0023 }
            r2.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0047, all -> 0x0023 }
            r1.<init>(r2)     // Catch:{ FileNotFoundException -> 0x0047, all -> 0x0023 }
            int r0 = r1.readInt()     // Catch:{ FileNotFoundException -> 0x0021, all -> 0x001f }
            f232998c = r0     // Catch:{ FileNotFoundException -> 0x0021, all -> 0x001f }
            int r0 = r1.readInt()     // Catch:{ FileNotFoundException -> 0x0021, all -> 0x001f }
            f232999d = r0     // Catch:{ FileNotFoundException -> 0x0021, all -> 0x001f }
            goto L_0x0041
        L_0x001f:
            r0 = move-exception
            goto L_0x0027
        L_0x0021:
            r0 = r1
            goto L_0x0047
        L_0x0023:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x0027:
            java.lang.String r2 = "MicroMsg.TinkerRollbackStatistic"
            java.lang.String r3 = "[-] Fail to load base and patch clientversion."
            r4 = 0
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch:{ all -> 0x0045 }
            com.tencent.p014mm.app.C80611s0.m98246d(r2, r0, r3, r4)     // Catch:{ all -> 0x0045 }
            java.lang.String r0 = a70.C79471a.f233015c     // Catch:{ all -> 0x0045 }
            java.lang.Integer r0 = java.lang.Integer.decode(r0)     // Catch:{ all -> 0x0045 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x0045 }
            f232998c = r0     // Catch:{ all -> 0x0045 }
            int r0 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT     // Catch:{ all -> 0x0045 }
            f232999d = r0     // Catch:{ all -> 0x0045 }
        L_0x0041:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r1)
            goto L_0x005f
        L_0x0045:
            r0 = move-exception
            goto L_0x0064
        L_0x0047:
            java.lang.String r1 = a70.C79471a.f233015c     // Catch:{ all -> 0x0060 }
            java.lang.Integer r1 = java.lang.Integer.decode(r1)     // Catch:{ all -> 0x0060 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0060 }
            f232998c = r1     // Catch:{ all -> 0x0060 }
            int r1 = com.tencent.p014mm.sdk.platformtools.BuildInfo.CLIENT_VERSION_INT     // Catch:{ all -> 0x0060 }
            f232999d = r1     // Catch:{ all -> 0x0060 }
            int r2 = f232998c     // Catch:{ all -> 0x0060 }
            m96415b(r2, r1)     // Catch:{ all -> 0x0060 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r0)
        L_0x005f:
            return
        L_0x0060:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L_0x0064:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a12.C79458l.m96414a():void");
    }

    /* renamed from: b */
    public static void m96415b(int i, int i2) {
        File file = f232996a;
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        DataOutputStream dataOutputStream = null;
        try {
            DataOutputStream dataOutputStream2 = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
            try {
                dataOutputStream2.writeInt(i);
                dataOutputStream2.writeInt(i2);
                dataOutputStream2.flush();
                Util.qualityClose(dataOutputStream2);
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                try {
                    C80611s0.m98246d("MicroMsg.TinkerRollbackStatistic", th, "[-] Fail to store base clientversion[%s] and patch clientversion[%s]", Integer.valueOf(i), Integer.valueOf(i2));
                } finally {
                    Util.qualityClose(dataOutputStream);
                }
            }
        } catch (Throwable th4) {
            th = th4;
            C80611s0.m98246d("MicroMsg.TinkerRollbackStatistic", th, "[-] Fail to store base clientversion[%s] and patch clientversion[%s]", Integer.valueOf(i), Integer.valueOf(i2));
        }
    }
}
