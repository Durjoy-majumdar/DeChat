package com.tencent.p014mm.plugin.downloader.model;

import com.tencent.p014mm.sdk.platformtools.Log;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import v41.C52758q;
import y41.C53491a;
import y41.C53493b;
import z41.C53736a;

/* renamed from: com.tencent.mm.plugin.downloader.model.k */
public class C40934k {

    /* renamed from: a */
    public static Set<Long> f110154a = new HashSet();

    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0094, code lost:
        if (r2 == null) goto L_0x0097;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m44324a(java.lang.String r11, java.util.LinkedList<v41.C52742a> r12) {
        /*
            r0 = 1
            r1 = 0
            r2 = 0
            java.io.RandomAccessFile r2 = com.tencent.p014mm.vfs.C86013q1.m106420B(r11, r1)     // Catch:{ Exception -> 0x008a }
            java.lang.String r11 = "MD5"
            java.security.MessageDigest r11 = java.security.MessageDigest.getInstance(r11)     // Catch:{ Exception -> 0x008a }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ Exception -> 0x008a }
        L_0x0011:
            boolean r3 = r12.hasNext()     // Catch:{ Exception -> 0x008a }
            if (r3 == 0) goto L_0x0084
            java.lang.Object r3 = r12.next()     // Catch:{ Exception -> 0x008a }
            v41.a r3 = (v41.C52742a) r3     // Catch:{ Exception -> 0x008a }
            long r4 = r3.f147342d     // Catch:{ Exception -> 0x008a }
            r2.seek(r4)     // Catch:{ Exception -> 0x008a }
            long r4 = r3.f147343e     // Catch:{ Exception -> 0x008a }
            long r6 = r3.f147342d     // Catch:{ Exception -> 0x008a }
            long r4 = r4 - r6
            r6 = 1
            long r4 = r4 + r6
            r6 = 2048(0x800, double:1.0118E-320)
            long r6 = java.lang.Math.min(r6, r4)     // Catch:{ Exception -> 0x008a }
            int r7 = (int) r6     // Catch:{ Exception -> 0x008a }
            byte[] r6 = new byte[r7]     // Catch:{ Exception -> 0x008a }
        L_0x0033:
            r8 = 0
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 <= 0) goto L_0x004b
            long r8 = (long) r7     // Catch:{ Exception -> 0x008a }
            long r8 = java.lang.Math.min(r8, r4)     // Catch:{ Exception -> 0x008a }
            int r9 = (int) r8     // Catch:{ Exception -> 0x008a }
            int r8 = r2.read(r6, r1, r9)     // Catch:{ Exception -> 0x008a }
            if (r8 < 0) goto L_0x004b
            long r9 = (long) r8     // Catch:{ Exception -> 0x008a }
            long r4 = r4 - r9
            r11.update(r6, r1, r8)     // Catch:{ Exception -> 0x008a }
            goto L_0x0033
        L_0x004b:
            byte[] r4 = r11.digest()     // Catch:{ Exception -> 0x008a }
            if (r4 != 0) goto L_0x0052
            goto L_0x0011
        L_0x0052:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008a }
            r6 = 32
            r5.<init>(r6)     // Catch:{ Exception -> 0x008a }
            r6 = 0
        L_0x005a:
            int r7 = r4.length     // Catch:{ Exception -> 0x008a }
            if (r6 >= r7) goto L_0x0073
            byte r7 = r4[r6]     // Catch:{ Exception -> 0x008a }
            r7 = r7 & 255(0xff, float:3.57E-43)
            int r7 = r7 + 256
            r8 = 16
            java.lang.String r7 = java.lang.Integer.toString(r7, r8)     // Catch:{ Exception -> 0x008a }
            java.lang.String r7 = r7.substring(r0)     // Catch:{ Exception -> 0x008a }
            r5.append(r7)     // Catch:{ Exception -> 0x008a }
            int r6 = r6 + 1
            goto L_0x005a
        L_0x0073:
            java.lang.String r4 = r5.toString()     // Catch:{ Exception -> 0x008a }
            java.lang.String r4 = r4.trim()     // Catch:{ Exception -> 0x008a }
            java.lang.String r3 = r3.f147344f     // Catch:{ Exception -> 0x008a }
            boolean r3 = r4.equals(r3)     // Catch:{ Exception -> 0x008a }
            if (r3 != 0) goto L_0x0011
            r0 = 0
        L_0x0084:
            r2.close()     // Catch:{ IOException -> 0x0097 }
            goto L_0x0097
        L_0x0088:
            r11 = move-exception
            goto L_0x0098
        L_0x008a:
            r11 = move-exception
            java.lang.String r12 = "MicroMsg.FileDownloadMD5Manager"
            java.lang.String r3 = ""
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x0088 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r11, r3, r1)     // Catch:{ all -> 0x0088 }
            if (r2 == 0) goto L_0x0097
            goto L_0x0084
        L_0x0097:
            return r0
        L_0x0098:
            if (r2 == 0) goto L_0x009d
            r2.close()     // Catch:{ IOException -> 0x009d }
        L_0x009d:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.downloader.model.C40934k.m44324a(java.lang.String, java.util.LinkedList):boolean");
    }

    /* renamed from: b */
    public static boolean m44325b(C53736a aVar) {
        C53736a aVar2 = aVar;
        if (!(aVar2 == null || aVar2.field_sectionMd5Byte == null)) {
            long currentTimeMillis = System.currentTimeMillis();
            C52758q qVar = new C52758q();
            try {
                qVar.parseFrom(aVar2.field_sectionMd5Byte);
                boolean a = m44324a(aVar2.field_filePath, qVar.f147428d);
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                Log.m105925i("MicroMsg.FileDownloadMD5Manager", "sectionMd5Check, costTime = %d, ret = %b", Long.valueOf(currentTimeMillis2), Boolean.valueOf(a));
                C53491a.m60013c(111, new C53493b(aVar2.field_appId, aVar2.field_downloadId, "", currentTimeMillis2, aVar2.field_reserveInWifi ? 1 : 0));
                return a;
            } catch (IOException e) {
                Log.printErrStackTrace("MicroMsg.FileDownloadMD5Manager", e, "", new Object[0]);
            }
        }
        return true;
    }
}
