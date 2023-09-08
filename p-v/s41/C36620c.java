package s41;

import android.content.Context;
import com.tencent.p014mm.app.C80625v0;
import com.tencent.p014mm.plugin.downloader.api.C29841c;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.thread.ThreadPool;
import di3.C86301e;
import ei3.C86522b;
import f40.C86709a0;
import p237sp.C36773u;
import z41.C53737b;

@C86522b(onProcess = {C80625v0.MATCH_MM})
/* renamed from: s41.c */
public class C36620c extends C86301e implements C29841c {

    /* renamed from: d */
    public C53737b f97355d;

    /* renamed from: e */
    public long f97356e = 0;

    /* renamed from: s41.c$a */
    public class C36621a implements Runnable {
        public C36621a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00e2  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0015 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r22 = this;
                r0 = r22
                s41.c r1 = s41.C36620c.this
                r1.getClass()
                java.util.LinkedList r1 = com.tencent.p014mm.plugin.downloader.model.C40933j.m44313b()
                boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.util.List) r1)
                if (r2 != 0) goto L_0x011f
                java.util.Iterator r1 = r1.iterator()
            L_0x0015:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x011f
                java.lang.Object r2 = r1.next()
                z41.a r2 = (z41.C53736a) r2
                long r3 = java.lang.System.currentTimeMillis()
                long r5 = r2.field_updateTime
                long r3 = r3 - r5
                r5 = 1000(0x3e8, double:4.94E-321)
                long r3 = r3 / r5
                java.lang.String r5 = r2.field_filePath
                boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
                r6 = 0
                if (r5 == 0) goto L_0x0045
                long r7 = r2.field_totalSize
                r9 = 0
                int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r5 <= 0) goto L_0x0045
                long r9 = r2.field_downloadedSize
                r11 = 100
                long r9 = r9 * r11
                long r9 = r9 / r7
                int r5 = (int) r9
                goto L_0x0046
            L_0x0045:
                r5 = 0
            L_0x0046:
                int r7 = r2.field_status
                r8 = 1
                if (r7 != r8) goto L_0x004c
                goto L_0x0015
            L_0x004c:
                java.lang.Object[] r7 = new java.lang.Object[r8]
                java.io.File r9 = android.os.Environment.getExternalStorageDirectory()
                long r9 = r9.getFreeSpace()
                java.lang.Long r9 = java.lang.Long.valueOf(r9)
                r7[r6] = r9
                java.lang.String r9 = "MicroMsg.FileDownloaderService"
                java.lang.String r10 = "freeSpace : %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r10, r7)
                java.io.File r7 = android.os.Environment.getExternalStorageDirectory()
                long r10 = r7.getFreeSpace()
                r12 = 2147483648(0x80000000, double:1.0609978955E-314)
                int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
                if (r7 > 0) goto L_0x0076
                r7 = 1
                goto L_0x0077
            L_0x0076:
                r7 = 0
            L_0x0077:
                r10 = 2592000(0x278d00, double:1.280618E-317)
                r12 = 2
                int r13 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                if (r13 < 0) goto L_0x008d
                com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r15 = 710(0x2c6, double:3.51E-321)
                r17 = 20
                r19 = 1
                r21 = 0
                r14.idkeyStat(r15, r17, r19, r21)
                goto L_0x00dd
            L_0x008d:
                if (r7 == 0) goto L_0x00df
                java.lang.Object[] r7 = new java.lang.Object[r12]
                java.lang.Long r10 = java.lang.Long.valueOf(r3)
                r7[r6] = r10
                java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
                r7[r8] = r10
                java.lang.String r10 = "less than 2G, interval : %d, percent : %d"
                com.tencent.p014mm.sdk.platformtools.Log.m105919d(r9, r10, r7)
                r10 = 604800(0x93a80, double:2.98811E-318)
                int r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                if (r7 < 0) goto L_0x00c1
                r7 = 10
                if (r5 > r7) goto L_0x00c1
                java.lang.String r7 = "one week"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r7)
                com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r14 = 710(0x2c6, double:3.51E-321)
                r16 = 21
                r18 = 1
                r20 = 0
                r13.idkeyStat(r14, r16, r18, r20)
                goto L_0x00dd
            L_0x00c1:
                r10 = 172800(0x2a300, double:8.53745E-319)
                int r7 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
                if (r7 < 0) goto L_0x00df
                if (r5 > r12) goto L_0x00df
                java.lang.String r7 = "two day"
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r9, r7)
                com.tencent.mm.plugin.report.service.n r13 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r14 = 710(0x2c6, double:3.51E-321)
                r16 = 22
                r18 = 1
                r20 = 0
                r13.idkeyStat(r14, r16, r18, r20)
            L_0x00dd:
                r7 = 1
                goto L_0x00e0
            L_0x00df:
                r7 = 0
            L_0x00e0:
                if (r7 == 0) goto L_0x00f9
                java.lang.String r10 = r2.field_filePath
                com.tencent.p014mm.vfs.C86013q1.m106447h(r10)
                long r10 = r2.field_downloadId
                com.tencent.p014mm.plugin.downloader.model.C40933j.m44319h(r10)
                java.lang.Class<e51.h> r10 = e51.C45547h.class
                di3.d r10 = di3.C86312j.m106911c(r10)
                e51.h r10 = (e51.C45547h) r10
                java.lang.String r11 = r2.field_appId
                r10.mo70793e1(r11)
            L_0x00f9:
                r10 = 5
                java.lang.Object[] r10 = new java.lang.Object[r10]
                java.lang.String r11 = r2.field_appId
                r10[r6] = r11
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r10[r8] = r3
                java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
                r10[r12] = r3
                r3 = 3
                java.lang.Boolean r4 = java.lang.Boolean.valueOf(r7)
                r10[r3] = r4
                r3 = 4
                java.lang.String r2 = r2.field_filePath
                r10[r3] = r2
                java.lang.String r2 = "checkRemovedDownloadFile, appId: %s, interval: %d, percent: %d, delete: %b, path : %s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r2, r10)
                goto L_0x0015
            L_0x011f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: s41.C36620c.C36621a.run():void");
        }
    }

    /* renamed from: gI */
    public C36773u mo56945gI() {
        requireAccountInitialized();
        return this.f97355d;
    }

    /* renamed from: mp */
    public void mo56946mp(boolean z) {
        Log.m105924i("MicroMsg.FileDownloaderService", "active: " + z);
        if (!z && (System.currentTimeMillis() - this.f97356e) / 1000 > 1800) {
            ThreadPool.post(new C36621a(), "checkDownloadFile");
            this.f97356e = System.currentTimeMillis();
        }
    }

    public void onAccountInitialized(Context context) {
        this.f97355d = new C53737b(C86709a0.m107535s().f251811i);
    }
}
