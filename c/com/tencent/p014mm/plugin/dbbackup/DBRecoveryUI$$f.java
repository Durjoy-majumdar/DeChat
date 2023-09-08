package com.tencent.p014mm.plugin.dbbackup;

import f40.C86709a0;
import java.util.Collection;
import q41.f$$j;

/* renamed from: com.tencent.mm.plugin.dbbackup.DBRecoveryUI$$f */
public class DBRecoveryUI$$f implements f$$j {

    /* renamed from: a */
    public Collection<String> f345828a;

    /* renamed from: b */
    public int f345829b = C86709a0.m107523b().mo121110g();

    public DBRecoveryUI$$f(DBRecoveryUI dBRecoveryUI) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b A[SYNTHETIC, Splitter:B:23:0x008b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo175213a() {
        /*
            r10 = this;
            java.util.Collection<java.lang.String> r0 = r10.f345828a
            if (r0 != 0) goto L_0x00fe
            java.lang.String r0 = "RC4"
            android.content.Context r1 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r2 = "KeyInfo.bin"
            java.io.File r1 = r1.getFileStreamPath(r2)
            com.tencent.mm.vfs.m1 r1 = com.tencent.p014mm.vfs.C86009m1.m106378c(r1)
            com.tencent.mm.vfs.m1 r2 = new com.tencent.mm.vfs.m1
            java.lang.String r3 = a70.C112760b.m154195C()
            java.lang.String r4 = "KeyInfo.txt"
            r2.<init>((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "MicroMsg.DBRecoveryUtils"
            java.lang.String r4 = "Load IMEI from files, withDefaults: true, withExternals: true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            java.util.LinkedHashSet r4 = new java.util.LinkedHashSet
            r4.<init>()
            r5 = 1
            java.lang.String r5 = p156gj.C87203t.m108270f(r5)
            r4.add(r5)
            r5 = 0
            java.lang.String r6 = p156gj.C87203t.m108270f(r5)
            r4.add(r6)
            r6 = 0
            boolean r7 = r2.mo119967g()
            if (r7 != 0) goto L_0x0048
            java.lang.String r2 = "External file does not exist."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)
            goto L_0x0085
        L_0x0048:
            java.io.BufferedReader r7 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0079, all -> 0x0076 }
            com.tencent.mm.vfs.t1 r8 = new com.tencent.mm.vfs.t1     // Catch:{ Exception -> 0x0079, all -> 0x0076 }
            r8.<init>((com.tencent.p014mm.vfs.C86009m1) r2)     // Catch:{ Exception -> 0x0079, all -> 0x0076 }
            r7.<init>(r8)     // Catch:{ Exception -> 0x0079, all -> 0x0076 }
            r2 = 0
        L_0x0053:
            java.lang.String r8 = r7.readLine()     // Catch:{ Exception -> 0x0074 }
            if (r8 == 0) goto L_0x005f
            r4.add(r8)     // Catch:{ Exception -> 0x0074 }
            int r2 = r2 + 1
            goto L_0x0053
        L_0x005f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0074 }
            r8.<init>()     // Catch:{ Exception -> 0x0074 }
            java.lang.String r9 = "Loaded external information, entries: "
            r8.append(r9)     // Catch:{ Exception -> 0x0074 }
            r8.append(r2)     // Catch:{ Exception -> 0x0074 }
            java.lang.String r2 = r8.toString()     // Catch:{ Exception -> 0x0074 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r2)     // Catch:{ Exception -> 0x0074 }
            goto L_0x0082
        L_0x0074:
            r2 = move-exception
            goto L_0x007b
        L_0x0076:
            r0 = move-exception
            goto L_0x00fa
        L_0x0079:
            r2 = move-exception
            r7 = r6
        L_0x007b:
            java.lang.String r8 = "Failed to load external information."
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x00f8 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r2, r8, r9)     // Catch:{ all -> 0x00f8 }
        L_0x0082:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r7)
        L_0x0085:
            boolean r2 = r1.mo119967g()
            if (r2 == 0) goto L_0x00f0
            javax.crypto.Cipher r2 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ Exception -> 0x00de }
            javax.crypto.spec.SecretKeySpec r7 = new javax.crypto.spec.SecretKeySpec     // Catch:{ Exception -> 0x00de }
            java.lang.String r8 = "_wEcHAT_"
            byte[] r8 = r8.getBytes()     // Catch:{ Exception -> 0x00de }
            r7.<init>(r8, r0)     // Catch:{ Exception -> 0x00de }
            r0 = 2
            r2.init(r0, r7)     // Catch:{ Exception -> 0x00de }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00de }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00de }
            javax.crypto.CipherInputStream r8 = new javax.crypto.CipherInputStream     // Catch:{ Exception -> 0x00de }
            java.io.InputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106422D(r1)     // Catch:{ Exception -> 0x00de }
            r8.<init>(r1, r2)     // Catch:{ Exception -> 0x00de }
            r7.<init>(r8)     // Catch:{ Exception -> 0x00de }
            r0.<init>(r7)     // Catch:{ Exception -> 0x00de }
            r1 = 0
        L_0x00b2:
            java.lang.String r2 = r0.readLine()     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            if (r2 == 0) goto L_0x00be
            r4.add(r2)     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            int r1 = r1 + 1
            goto L_0x00b2
        L_0x00be:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            r2.<init>()     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            java.lang.String r6 = "Loaded key information, entries: "
            r2.append(r6)     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            r2.append(r1)     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r1)     // Catch:{ Exception -> 0x00d8, all -> 0x00d6 }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r0)
            goto L_0x00f0
        L_0x00d6:
            r1 = move-exception
            goto L_0x00ec
        L_0x00d8:
            r1 = move-exception
            r6 = r0
            goto L_0x00e0
        L_0x00db:
            r0 = move-exception
            r1 = r0
            goto L_0x00eb
        L_0x00de:
            r0 = move-exception
            r1 = r0
        L_0x00e0:
            java.lang.String r0 = "Failed to load key information."
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch:{ all -> 0x00db }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r3, r1, r0, r2)     // Catch:{ all -> 0x00db }
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r6)
            goto L_0x00f0
        L_0x00eb:
            r0 = r6
        L_0x00ec:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r0)
            throw r1
        L_0x00f0:
            java.lang.String r0 = "1234567890ABCDEF"
            r4.add(r0)
            r10.f345828a = r4
            goto L_0x00fe
        L_0x00f8:
            r0 = move-exception
            r6 = r7
        L_0x00fa:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r6)
            throw r0
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.dbbackup.DBRecoveryUI$$f.mo175213a():void");
    }
}
