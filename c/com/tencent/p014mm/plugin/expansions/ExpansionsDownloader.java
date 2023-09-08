package com.tencent.p014mm.plugin.expansions;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;

/* renamed from: com.tencent.mm.plugin.expansions.ExpansionsDownloader */
public final class ExpansionsDownloader {

    /* renamed from: com.tencent.mm.plugin.expansions.ExpansionsDownloader$ResUpdateListener */
    public static final class ResUpdateListener extends IListener<CheckResUpdateCacheFileEvent> {
        public ResUpdateListener() {
            super(C40008f.f107254d);
            this.__eventId = 905296653;
        }

        public boolean callback(IEvent iEvent) {
            CheckResUpdateCacheFileEvent checkResUpdateCacheFileEvent = (CheckResUpdateCacheFileEvent) iEvent;
            return false;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(9:1|2|3|4|5|6|7|8|9) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065 A[SYNTHETIC, Splitter:B:24:0x0065] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c A[SYNTHETIC, Splitter:B:28:0x006c] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0073 A[SYNTHETIC, Splitter:B:34:0x0073] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007a A[SYNTHETIC, Splitter:B:38:0x007a] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m105032a(java.lang.String r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "MicroMsg.exp.Expansions"
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0038, all -> 0x0035 }
            r2.<init>(r10)     // Catch:{ Exception -> 0x0038, all -> 0x0035 }
            java.nio.channels.FileChannel r2 = r2.getChannel()     // Catch:{ Exception -> 0x0038, all -> 0x0035 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0030, all -> 0x002b }
            r3.<init>(r11)     // Catch:{ Exception -> 0x0030, all -> 0x002b }
            java.nio.channels.FileChannel r1 = r3.getChannel()     // Catch:{ Exception -> 0x0030, all -> 0x002b }
            r5 = 0
            long r7 = r2.size()     // Catch:{ Exception -> 0x0030, all -> 0x002b }
            r3 = r1
            r4 = r2
            r3.transferFrom(r4, r5, r7)     // Catch:{ Exception -> 0x0030, all -> 0x002b }
            long r10 = r2.size()     // Catch:{ Exception -> 0x0030, all -> 0x002b }
            r2.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            r1.close()     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            return r10
        L_0x002b:
            r10 = move-exception
            r9 = r2
            r2 = r1
            r1 = r9
            goto L_0x0071
        L_0x0030:
            r3 = move-exception
            r9 = r2
            r2 = r1
            r1 = r9
            goto L_0x003a
        L_0x0035:
            r10 = move-exception
            r2 = r1
            goto L_0x0071
        L_0x0038:
            r3 = move-exception
            r2 = r1
        L_0x003a:
            java.lang.String r4 = ""
            r5 = 0
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x0070 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r3, r4, r6)     // Catch:{ all -> 0x0070 }
            java.lang.String r4 = "file op copyFile e type:%s, e msg:%s, src:%s, dest:%s"
            r6 = 4
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0070 }
            java.lang.Class r7 = r3.getClass()     // Catch:{ all -> 0x0070 }
            java.lang.String r7 = r7.getSimpleName()     // Catch:{ all -> 0x0070 }
            r6[r5] = r7     // Catch:{ all -> 0x0070 }
            r5 = 1
            java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x0070 }
            r6[r5] = r3     // Catch:{ all -> 0x0070 }
            r3 = 2
            r6[r3] = r10     // Catch:{ all -> 0x0070 }
            r10 = 3
            r6[r10] = r11     // Catch:{ all -> 0x0070 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r0, r4, r6)     // Catch:{ all -> 0x0070 }
            r10 = -1
            if (r1 == 0) goto L_0x006a
            r1.close()     // Catch:{ IOException -> 0x0069 }
            goto L_0x006a
        L_0x0069:
        L_0x006a:
            if (r2 == 0) goto L_0x006f
            r2.close()     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            return r10
        L_0x0070:
            r10 = move-exception
        L_0x0071:
            if (r1 == 0) goto L_0x0078
            r1.close()     // Catch:{ IOException -> 0x0077 }
            goto L_0x0078
        L_0x0077:
        L_0x0078:
            if (r2 == 0) goto L_0x007d
            r2.close()     // Catch:{ IOException -> 0x007d }
        L_0x007d:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.expansions.ExpansionsDownloader.m105032a(java.lang.String, java.lang.String):long");
    }
}
