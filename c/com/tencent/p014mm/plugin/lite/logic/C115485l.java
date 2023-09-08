package com.tencent.p014mm.plugin.lite.logic;

import com.tencent.p014mm.plugin.downloader.model.C40935l;
import com.tencent.p014mm.plugin.downloader.model.C40939n;
import com.tencent.p014mm.plugin.downloader.model.C40952u;
import com.tencent.p014mm.plugin.lite.api.C115476a;
import com.tencent.p014mm.plugin.lite.api.C115477b;
import com.tencent.p014mm.plugin.lite.logic.C115492q;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import di3.C86312j;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p237sp.C13754y;
import tw0.C90587j;

/* renamed from: com.tencent.mm.plugin.lite.logic.l */
public enum C115485l {
    INSTANCE;
    

    /* renamed from: d */
    public Map<Long, C115487b> f346224d;

    /* renamed from: e */
    public Map<String, C115487b> f346225e;

    /* renamed from: f */
    public C40952u f346226f;

    /* renamed from: com.tencent.mm.plugin.lite.logic.l$a */
    public class C115486a implements C40952u {
        public C115486a() {
        }

        /* renamed from: B */
        public void mo1796B(long j, String str, long j2, long j3) {
        }

        /* renamed from: D */
        public void mo1797D(long j) {
            if (((ConcurrentHashMap) C115485l.this.f346224d).containsKey(Long.valueOf(j))) {
                C115487b bVar = (C115487b) ((ConcurrentHashMap) C115485l.this.f346224d).get(Long.valueOf(j));
                if (((ConcurrentHashMap) C115485l.this.f346225e).containsKey(bVar.f346229b.f260272d)) {
                    ((ConcurrentHashMap) C115485l.this.f346225e).remove(bVar.f346229b.f260272d);
                }
                ((ConcurrentHashMap) C115485l.this.f346224d).remove(Long.valueOf(j));
            }
        }

        /* renamed from: O */
        public void mo1798O(long j) {
        }

        /* renamed from: Q */
        public void mo1799Q(long j, String str) {
        }

        /* renamed from: S */
        public void mo1800S(long j) {
        }

        /* renamed from: d */
        public void mo1801d(long j, int i, boolean z) {
            if (((ConcurrentHashMap) C115485l.this.f346224d).containsKey(Long.valueOf(j))) {
                Log.m105921e("MicroMsg.LiteAppDownloadPkg", "down fail, id:%d errCode:%d", Long.valueOf(j), Integer.valueOf(i));
                C115669n nVar = C115669n.INSTANCE;
                nVar.mo160126c(20752, "0", true, true);
                nVar.mo175913w(1293, 95, 1);
                C115487b bVar = (C115487b) ((ConcurrentHashMap) C115485l.this.f346224d).get(Long.valueOf(j));
                if (((ConcurrentHashMap) C115485l.this.f346225e).containsKey(bVar.f346229b.f260272d)) {
                    ((ConcurrentHashMap) C115485l.this.f346225e).remove(bVar.f346229b.f260272d);
                }
                ((ConcurrentHashMap) C115485l.this.f346224d).remove(Long.valueOf(j));
                C115477b bVar2 = bVar.f346230c;
                if (bVar2 != null) {
                    bVar2.mo5700a(bVar.f346229b.f260269a, 5);
                    return;
                }
                C115476a aVar = bVar.f346231d;
                if (aVar != null) {
                    aVar.mo175450a(5);
                }
            }
        }

        /* renamed from: f0 */
        public void mo1802f0(long j, String str) {
            Log.m105925i("MicroMsg.LiteAppDownloadPkg", "onTaskStarted id:%s savedFilePath:%s", Long.valueOf(j), str);
        }

        /* JADX WARNING: Removed duplicated region for block: B:78:0x0266  */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo1803q(long r26, java.lang.String r28, boolean r29) {
            /*
                r25 = this;
                r1 = r25
                r0 = r28
                com.tencent.mm.plugin.lite.logic.l r2 = com.tencent.p014mm.plugin.lite.logic.C115485l.this
                java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.logic.l$b> r2 = r2.f346224d
                java.lang.Long r3 = java.lang.Long.valueOf(r26)
                java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
                boolean r2 = r2.containsKey(r3)
                if (r2 != 0) goto L_0x0015
                return
            L_0x0015:
                com.tencent.mm.plugin.lite.logic.l r2 = com.tencent.p014mm.plugin.lite.logic.C115485l.this
                java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.logic.l$b> r2 = r2.f346224d
                java.lang.Long r3 = java.lang.Long.valueOf(r26)
                java.util.concurrent.ConcurrentHashMap r2 = (java.util.concurrent.ConcurrentHashMap) r2
                java.lang.Object r2 = r2.get(r3)
                com.tencent.mm.plugin.lite.logic.l$b r2 = (com.tencent.p014mm.plugin.lite.logic.C115485l.C115487b) r2
                com.tencent.mm.plugin.lite.logic.l r3 = com.tencent.p014mm.plugin.lite.logic.C115485l.this
                java.util.Map<java.lang.String, com.tencent.mm.plugin.lite.logic.l$b> r3 = r3.f346225e
                tw0.j r4 = r2.f346229b
                java.lang.String r4 = r4.f260272d
                java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
                boolean r3 = r3.containsKey(r4)
                if (r3 == 0) goto L_0x0042
                com.tencent.mm.plugin.lite.logic.l r3 = com.tencent.p014mm.plugin.lite.logic.C115485l.this
                java.util.Map<java.lang.String, com.tencent.mm.plugin.lite.logic.l$b> r3 = r3.f346225e
                tw0.j r4 = r2.f346229b
                java.lang.String r4 = r4.f260272d
                java.util.concurrent.ConcurrentHashMap r3 = (java.util.concurrent.ConcurrentHashMap) r3
                r3.remove(r4)
            L_0x0042:
                boolean r3 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r28)
                java.lang.String r4 = "downloadLiteAppBaselib"
                java.lang.String r5 = "downloadLiteAppPkg"
                r6 = 5
                if (r3 == 0) goto L_0x007d
                com.tencent.mm.plugin.lite.logic.l r0 = com.tencent.p014mm.plugin.lite.logic.C115485l.this
                java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.logic.l$b> r0 = r0.f346224d
                java.lang.Long r3 = java.lang.Long.valueOf(r26)
                java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
                r0.remove(r3)
                java.lang.String r0 = r2.f346228a
                boolean r0 = r0.equals(r5)
                if (r0 == 0) goto L_0x006d
                com.tencent.mm.plugin.lite.api.b r0 = r2.f346230c
                if (r0 == 0) goto L_0x006d
                tw0.j r3 = r2.f346229b
                java.lang.String r3 = r3.f260269a
                r0.mo5700a(r3, r6)
            L_0x006d:
                java.lang.String r0 = r2.f346228a
                boolean r0 = r0.equals(r4)
                if (r0 == 0) goto L_0x007c
                com.tencent.mm.plugin.lite.api.a r0 = r2.f346231d
                if (r0 == 0) goto L_0x007c
                r0.mo175450a(r6)
            L_0x007c:
                return
            L_0x007d:
                long r7 = java.lang.System.currentTimeMillis()
                com.tencent.mm.plugin.lite.logic.q$d r3 = r2.f346233f
                if (r3 == 0) goto L_0x0087
                r3.f346266f = r7
            L_0x0087:
                java.lang.String r3 = r2.f346232e
                java.lang.String r9 = "release"
                boolean r3 = r3.equals(r9)
                java.lang.String r9 = "1"
                r10 = 20752(0x5110, float:2.908E-41)
                r11 = 3
                java.lang.String r12 = "MicroMsg.LiteAppDownloadPkg"
                r13 = 1
                if (r3 == 0) goto L_0x00ef
                tw0.j r3 = r2.f346229b
                java.lang.String r3 = r3.f260273e
                java.lang.String r14 = p823sg.C90193h.m112876d(r28)
                boolean r3 = r3.equals(r14)
                if (r3 != 0) goto L_0x00ea
                java.lang.String r0 = "MD5 error!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
                com.tencent.mm.plugin.report.service.n r14 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r14.mo160126c(r10, r9, r13, r13)
                r15 = 1293(0x50d, double:6.39E-321)
                r17 = 98
                r19 = 1
                r14.mo175913w(r15, r17, r19)
                com.tencent.mm.plugin.lite.logic.l r0 = com.tencent.p014mm.plugin.lite.logic.C115485l.this
                java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.logic.l$b> r0 = r0.f346224d
                java.lang.Long r3 = java.lang.Long.valueOf(r26)
                java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
                r0.remove(r3)
                java.lang.String r0 = r2.f346228a
                boolean r0 = r0.equals(r5)
                if (r0 == 0) goto L_0x00da
                com.tencent.mm.plugin.lite.api.b r0 = r2.f346230c
                if (r0 == 0) goto L_0x00da
                tw0.j r3 = r2.f346229b
                java.lang.String r3 = r3.f260269a
                r0.mo5700a(r3, r11)
            L_0x00da:
                java.lang.String r0 = r2.f346228a
                boolean r0 = r0.equals(r4)
                if (r0 == 0) goto L_0x00e9
                com.tencent.mm.plugin.lite.api.a r0 = r2.f346231d
                if (r0 == 0) goto L_0x00e9
                r0.mo175450a(r11)
            L_0x00e9:
                return
            L_0x00ea:
                long r14 = java.lang.System.currentTimeMillis()
                goto L_0x00f0
            L_0x00ef:
                r14 = r7
            L_0x00f0:
                com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r17 = 1293(0x50d, double:6.39E-321)
                r19 = 94
                r21 = 1
                r16 = r3
                r16.mo175913w(r17, r19, r21)
                tw0.j r6 = r2.f346229b
                com.tencent.mm.plugin.lite.logic.l r10 = com.tencent.p014mm.plugin.lite.logic.C115485l.this
                java.util.Map<java.lang.Long, com.tencent.mm.plugin.lite.logic.l$b> r10 = r10.f346224d
                java.lang.Long r11 = java.lang.Long.valueOf(r26)
                java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10
                r10.remove(r11)
                java.lang.String r10 = r2.f346228a
                boolean r5 = r10.equals(r5)
                java.lang.String r11 = ""
                java.lang.String r10 = "2"
                java.lang.String r13 = "download %s success. path:%s, dir:%s, patchId:%s"
                r23 = 2
                if (r5 == 0) goto L_0x02a4
                java.lang.String r4 = r6.f260269a
                java.lang.String r5 = r6.f260274f
                java.lang.String r1 = r6.f260273e
                java.lang.String r1 = com.tencent.p014mm.plugin.lite.logic.C115501v.m162390b(r4, r5, r1)
                r4 = 4
                java.lang.Object[] r5 = new java.lang.Object[r4]
                java.lang.String r4 = r6.f260269a
                r24 = r11
                r11 = 0
                r5[r11] = r4
                r4 = 1
                r5[r4] = r0
                r5[r23] = r1
                java.lang.String r4 = r6.f260274f
                r17 = 3
                r5[r17] = r4
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r5)
                android.net.Uri r4 = com.tencent.p014mm.vfs.C116299g2.m163858n(r1)
                java.lang.String r5 = r4.getPath()
                if (r5 == 0) goto L_0x0162
                java.lang.String r5 = com.tencent.p014mm.vfs.C116299g2.m163855k(r5, r11, r11)
                java.lang.String r11 = r4.getPath()
                boolean r11 = r11.equals(r5)
                if (r11 != 0) goto L_0x0162
                android.net.Uri$Builder r4 = r4.buildUpon()
                android.net.Uri$Builder r4 = r4.path(r5)
                android.net.Uri r4 = r4.build()
            L_0x0162:
                com.tencent.mm.vfs.f0 r5 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                r11 = 0
                com.tencent.mm.vfs.f0$h r5 = r5.mo177799l(r4, r11)
                boolean r11 = r5.mo177810a()
                if (r11 != 0) goto L_0x0171
                r11 = 0
                goto L_0x0179
            L_0x0171:
                com.tencent.mm.vfs.FileSystem$c r11 = r5.f348991a
                java.lang.String r13 = r5.f348992b
                boolean r11 = r11.mo119948x(r13)
            L_0x0179:
                if (r11 != 0) goto L_0x018f
                com.tencent.mm.vfs.f0 r11 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                com.tencent.mm.vfs.f0$h r4 = r11.mo177799l(r4, r5)
                boolean r5 = r4.mo177810a()
                if (r5 != 0) goto L_0x0188
                goto L_0x018f
            L_0x0188:
                com.tencent.mm.vfs.FileSystem$c r5 = r4.f348991a
                java.lang.String r4 = r4.f348992b
                r5.mo119937g(r4)
            L_0x018f:
                r4 = 0
                java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106448i(r0, r4)     // Catch:{ Exception -> 0x024c }
                int r0 = com.tencent.p014mm.vfs.C86013q1.m106436R(r0, r1)     // Catch:{ Exception -> 0x024c }
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x024c }
                if (r0 >= 0) goto L_0x01bf
                java.lang.String r0 = "unzip error!"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)     // Catch:{ Exception -> 0x0249 }
                r1 = 20752(0x5110, float:2.908E-41)
                r11 = 1
                r3.mo160126c(r1, r9, r11, r11)     // Catch:{ Exception -> 0x0249 }
                r17 = 1293(0x50d, double:6.39E-321)
                r19 = 98
                r21 = 1
                r16 = r3
                r16.mo175913w(r17, r19, r21)     // Catch:{ Exception -> 0x0249 }
                com.tencent.mm.plugin.lite.api.b r0 = r2.f346230c     // Catch:{ Exception -> 0x0249 }
                if (r0 == 0) goto L_0x01be
                java.lang.String r1 = r6.f260269a     // Catch:{ Exception -> 0x0249 }
                r3 = 6
                r0.mo5700a(r1, r3)     // Catch:{ Exception -> 0x0249 }
            L_0x01be:
                return
            L_0x01bf:
                com.tencent.liteapp.storage.WxaLiteAppInfo r0 = new com.tencent.liteapp.storage.WxaLiteAppInfo     // Catch:{ Exception -> 0x0249 }
                r0.<init>()     // Catch:{ Exception -> 0x0249 }
                java.lang.String r3 = r6.f260269a     // Catch:{ Exception -> 0x0249 }
                r0.f339290d = r3     // Catch:{ Exception -> 0x0249 }
                r0.f339295i = r1     // Catch:{ Exception -> 0x0249 }
                java.lang.String r1 = r6.f260275g     // Catch:{ Exception -> 0x0249 }
                r0.f339294h = r1     // Catch:{ Exception -> 0x0249 }
                java.lang.String r1 = r2.f346232e     // Catch:{ Exception -> 0x0249 }
                r0.f339296j = r1     // Catch:{ Exception -> 0x0249 }
                long r16 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0249 }
                r1 = r10
                r18 = 1000(0x3e8, double:4.94E-321)
                long r9 = r16 / r18
                r0.f339301r = r9     // Catch:{ Exception -> 0x0247 }
                java.lang.String r3 = r6.f260274f     // Catch:{ Exception -> 0x0247 }
                r0.f339297n = r3     // Catch:{ Exception -> 0x0247 }
                java.lang.String r3 = r6.f260273e     // Catch:{ Exception -> 0x0247 }
                r0.f339293g = r3     // Catch:{ Exception -> 0x0247 }
                com.tencent.mm.plugin.lite.logic.q r3 = com.tencent.p014mm.plugin.lite.logic.C115492q.m162360g()     // Catch:{ Exception -> 0x0247 }
                r3.mo175482t(r0)     // Catch:{ Exception -> 0x0247 }
                com.tencent.mm.plugin.lite.logic.q r3 = com.tencent.p014mm.plugin.lite.logic.C115492q.m162360g()     // Catch:{ Exception -> 0x0247 }
                r3.getClass()     // Catch:{ Exception -> 0x0247 }
                java.lang.String r3 = r0.f339290d     // Catch:{ Exception -> 0x0247 }
                java.lang.String r9 = "wxalitecce81f5fba338df4dd5f74df8229c600"
                boolean r3 = r3.equalsIgnoreCase(r9)     // Catch:{ Exception -> 0x0247 }
                if (r3 == 0) goto L_0x020d
                com.tencent.mm.sdk.platformtools.MultiProcessMMKV r3 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getMultiDefault()     // Catch:{ Exception -> 0x0247 }
                java.lang.String r9 = r0.f339297n     // Catch:{ Exception -> 0x0247 }
                java.lang.String r10 = "wxa_lite_app_game_center_version"
                r3.putString(r10, r9)     // Catch:{ Exception -> 0x0247 }
                r3.commit()     // Catch:{ Exception -> 0x0247 }
            L_0x020d:
                com.tencent.mm.plugin.lite.api.b r3 = r2.f346230c     // Catch:{ Exception -> 0x0247 }
                if (r3 == 0) goto L_0x0215
                r9 = 0
                r3.mo5701b(r0, r9)     // Catch:{ Exception -> 0x0247 }
            L_0x0215:
                java.lang.String r0 = "download %s Success, %d md5Time=%d unzipTime=%d current=%d"
                r3 = 5
                java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0247 }
                java.lang.String r3 = r6.f260269a     // Catch:{ Exception -> 0x0247 }
                r10 = 0
                r9[r10] = r3     // Catch:{ Exception -> 0x0247 }
                java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0247 }
                r10 = 1
                r9[r10] = r3     // Catch:{ Exception -> 0x0247 }
                long r10 = r14 - r7
                java.lang.Long r3 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x0247 }
                r9[r23] = r3     // Catch:{ Exception -> 0x0247 }
                long r10 = r4 - r14
                java.lang.Long r3 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x0247 }
                r10 = 3
                r9[r10] = r3     // Catch:{ Exception -> 0x0247 }
                long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0247 }
                java.lang.Long r3 = java.lang.Long.valueOf(r10)     // Catch:{ Exception -> 0x0247 }
                r10 = 4
                r9[r10] = r3     // Catch:{ Exception -> 0x0247 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r9)     // Catch:{ Exception -> 0x0247 }
                goto L_0x0455
            L_0x0247:
                r0 = move-exception
                goto L_0x024f
            L_0x0249:
                r0 = move-exception
                r1 = r10
                goto L_0x024f
            L_0x024c:
                r0 = move-exception
                r1 = r10
                r4 = r7
            L_0x024f:
                com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r17 = 1293(0x50d, double:6.39E-321)
                r19 = 98
                r21 = 1
                r16 = r3
                r16.mo175913w(r17, r19, r21)
                r9 = 20752(0x5110, float:2.908E-41)
                r10 = 1
                r3.mo160126c(r9, r1, r10, r10)
                com.tencent.mm.plugin.lite.api.b r1 = r2.f346230c
                if (r1 == 0) goto L_0x026c
                java.lang.String r2 = r6.f260269a
                r3 = 7
                r1.mo5700a(r2, r3)
            L_0x026c:
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r10 = r24
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r10, r2)
                r2 = 5
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.lang.String r2 = r6.f260269a
                r0[r1] = r2
                java.lang.Long r1 = java.lang.Long.valueOf(r7)
                r2 = 1
                r0[r2] = r1
                long r1 = r14 - r7
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r0[r23] = r1
                long r4 = r4 - r14
                java.lang.Long r1 = java.lang.Long.valueOf(r4)
                r2 = 3
                r0[r2] = r1
                long r1 = java.lang.System.currentTimeMillis()
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 4
                r0[r2] = r1
                java.lang.String r1 = "download %s Fail, %d md5Time=%d unzipTime=%d current=%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r1, r0)
                goto L_0x0455
            L_0x02a4:
                r1 = r10
                r10 = r11
                java.lang.String r5 = r2.f346228a
                boolean r4 = r5.equals(r4)
                if (r4 == 0) goto L_0x0455
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = com.tencent.p014mm.storage.C72994y1.f212834c
                r4.append(r5)
                java.lang.String r5 = "/baselib/tmp"
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r5 = 4
                java.lang.Object[] r11 = new java.lang.Object[r5]
                java.lang.String r5 = r6.f260269a
                r24 = r10
                r10 = 0
                r11[r10] = r5
                r5 = 1
                r11[r5] = r0
                r11[r23] = r4
                java.lang.String r5 = r6.f260274f
                r17 = 3
                r11[r17] = r5
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r13, r11)
                android.net.Uri r5 = com.tencent.p014mm.vfs.C116299g2.m163858n(r4)
                java.lang.String r11 = r5.getPath()
                if (r11 == 0) goto L_0x02fd
                java.lang.String r11 = com.tencent.p014mm.vfs.C116299g2.m163855k(r11, r10, r10)
                java.lang.String r10 = r5.getPath()
                boolean r10 = r10.equals(r11)
                if (r10 != 0) goto L_0x02fd
                android.net.Uri$Builder r5 = r5.buildUpon()
                android.net.Uri$Builder r5 = r5.path(r11)
                android.net.Uri r5 = r5.build()
            L_0x02fd:
                com.tencent.mm.vfs.f0 r10 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                r11 = 0
                com.tencent.mm.vfs.f0$h r10 = r10.mo177799l(r5, r11)
                boolean r11 = r10.mo177810a()
                if (r11 != 0) goto L_0x030c
                r11 = 0
                goto L_0x0314
            L_0x030c:
                com.tencent.mm.vfs.FileSystem$c r11 = r10.f348991a
                java.lang.String r13 = r10.f348992b
                boolean r11 = r11.mo119948x(r13)
            L_0x0314:
                if (r11 != 0) goto L_0x032a
                com.tencent.mm.vfs.f0 r11 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
                com.tencent.mm.vfs.f0$h r5 = r11.mo177799l(r5, r10)
                boolean r10 = r5.mo177810a()
                if (r10 != 0) goto L_0x0323
                goto L_0x032a
            L_0x0323:
                com.tencent.mm.vfs.FileSystem$c r10 = r5.f348991a
                java.lang.String r5 = r5.f348992b
                r10.mo119937g(r5)
            L_0x032a:
                r5 = 0
                java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106448i(r0, r5)
                int r0 = com.tencent.p014mm.vfs.C86013q1.m106436R(r0, r4)
                java.lang.String r5 = "unzip baselib error"
                if (r0 >= 0) goto L_0x0354
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r5)
                r1 = 20752(0x5110, float:2.908E-41)
                r4 = 1
                r3.mo160126c(r1, r9, r4, r4)
                r17 = 1293(0x50d, double:6.39E-321)
                r19 = 98
                r21 = 1
                r16 = r3
                r16.mo175913w(r17, r19, r21)
                com.tencent.mm.plugin.lite.api.a r0 = r2.f346231d
                if (r0 == 0) goto L_0x0353
                r1 = 6
                r0.mo175450a(r1)
            L_0x0353:
                return
            L_0x0354:
                r10 = 0
                java.lang.String r0 = com.tencent.p014mm.vfs.C86013q1.m106448i(r4, r10)
                com.tencent.p014mm.plugin.lite.C115478f.initLib()
                java.lang.String r0 = com.tencent.p014mm.plugin.lite.LiteAppCenter.getBaseLibMajorVersionByPath(r0)
                boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
                if (r10 == 0) goto L_0x036c
                java.lang.String r0 = "majorVersion error"
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r0)
                return
            L_0x036c:
                java.lang.String r10 = r6.f260274f
                java.lang.String r11 = r6.f260273e
                java.lang.String r10 = com.tencent.p014mm.plugin.lite.logic.C115501v.m162389a(r0, r10, r11)
                com.tencent.mm.vfs.m1 r11 = new com.tencent.mm.vfs.m1
                r11.<init>((java.lang.String) r10)
                boolean r13 = r11.mo119967g()
                if (r13 == 0) goto L_0x0382
                r11.mo119966f()
            L_0x0382:
                r11.mo119987x()
                boolean r11 = com.tencent.p014mm.vfs.C86013q1.m106462w(r4, r10)
                p1020pa.C89327d.m111648a(r4)
                if (r11 != 0) goto L_0x03ab
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r12, r5)
                r1 = 20752(0x5110, float:2.908E-41)
                r4 = 1
                r3.mo160126c(r1, r9, r4, r4)
                r17 = 1293(0x50d, double:6.39E-321)
                r19 = 98
                r21 = 1
                r16 = r3
                r16.mo175913w(r17, r19, r21)
                com.tencent.mm.plugin.lite.api.a r0 = r2.f346231d
                if (r0 == 0) goto L_0x03aa
                r1 = 6
                r0.mo175450a(r1)
            L_0x03aa:
                return
            L_0x03ab:
                com.tencent.liteapp.storage.WxaLiteAppBaselibInfo r3 = new com.tencent.liteapp.storage.WxaLiteAppBaselibInfo     // Catch:{ Exception -> 0x0408 }
                r3.<init>()     // Catch:{ Exception -> 0x0408 }
                r3.f339281d = r0     // Catch:{ Exception -> 0x0408 }
                r3.f339285h = r10     // Catch:{ Exception -> 0x0408 }
                java.lang.String r0 = r6.f260275g     // Catch:{ Exception -> 0x0408 }
                r3.f339284g = r0     // Catch:{ Exception -> 0x0408 }
                java.lang.String r0 = r2.f346232e     // Catch:{ Exception -> 0x0408 }
                r3.f339286i = r0     // Catch:{ Exception -> 0x0408 }
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0408 }
                r9 = 1000(0x3e8, double:4.94E-321)
                long r4 = r4 / r9
                r3.f339288n = r4     // Catch:{ Exception -> 0x0408 }
                java.lang.String r0 = r6.f260274f     // Catch:{ Exception -> 0x0408 }
                r3.f339287j = r0     // Catch:{ Exception -> 0x0408 }
                java.lang.String r0 = r6.f260273e     // Catch:{ Exception -> 0x0408 }
                r3.f339283f = r0     // Catch:{ Exception -> 0x0408 }
                com.tencent.mm.plugin.lite.logic.q r0 = com.tencent.p014mm.plugin.lite.logic.C115492q.m162360g()     // Catch:{ Exception -> 0x0408 }
                r0.mo175481s(r3)     // Catch:{ Exception -> 0x0408 }
                com.tencent.mm.plugin.lite.api.a r0 = r2.f346231d     // Catch:{ Exception -> 0x0408 }
                if (r0 == 0) goto L_0x03dc
                r4 = 0
                r0.mo175451b(r3, r4)     // Catch:{ Exception -> 0x0408 }
            L_0x03dc:
                java.lang.String r0 = "download baselib Success, %d md5Time=%d unzipTime=%d, current=%d"
                r3 = 4
                java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x0408 }
                java.lang.Long r3 = java.lang.Long.valueOf(r7)     // Catch:{ Exception -> 0x0408 }
                r5 = 0
                r4[r5] = r3     // Catch:{ Exception -> 0x0408 }
                long r5 = r14 - r7
                java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0408 }
                r5 = 1
                r4[r5] = r3     // Catch:{ Exception -> 0x0408 }
                long r5 = r7 - r14
                java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0408 }
                r4[r23] = r3     // Catch:{ Exception -> 0x0408 }
                long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0408 }
                java.lang.Long r3 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x0408 }
                r5 = 3
                r4[r5] = r3     // Catch:{ Exception -> 0x0408 }
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r0, r4)     // Catch:{ Exception -> 0x0408 }
                goto L_0x0455
            L_0x0408:
                r0 = move-exception
                com.tencent.mm.plugin.report.service.n r3 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
                r17 = 1293(0x50d, double:6.39E-321)
                r19 = 98
                r21 = 1
                r16 = r3
                r16.mo175913w(r17, r19, r21)
                r4 = 20752(0x5110, float:2.908E-41)
                r5 = 1
                r3.mo160126c(r4, r1, r5, r5)
                com.tencent.mm.plugin.lite.api.a r1 = r2.f346231d
                if (r1 == 0) goto L_0x0424
                r2 = 7
                r1.mo175450a(r2)
            L_0x0424:
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r3 = r24
                com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r12, r0, r3, r2)
                r2 = 4
                java.lang.Object[] r0 = new java.lang.Object[r2]
                java.lang.Long r2 = java.lang.Long.valueOf(r7)
                r0[r1] = r2
                long r1 = r14 - r7
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                long r7 = r7 - r14
                java.lang.Long r1 = java.lang.Long.valueOf(r7)
                r0[r23] = r1
                long r1 = java.lang.System.currentTimeMillis()
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 3
                r0[r2] = r1
                java.lang.String r1 = "download baselib Fail, %d md5Time=%d unzipTime=%d, current=%d"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r12, r1, r0)
            L_0x0455:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.lite.logic.C115485l.C115486a.mo1803q(long, java.lang.String, boolean):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.lite.logic.l$b */
    public class C115487b {

        /* renamed from: a */
        public String f346228a;

        /* renamed from: b */
        public C90587j f346229b;

        /* renamed from: c */
        public C115477b f346230c;

        /* renamed from: d */
        public C115476a f346231d;

        /* renamed from: e */
        public String f346232e;

        /* renamed from: f */
        public C115492q.C115496d f346233f;

        public C115487b(C115485l lVar, String str, C90587j jVar, String str2, C115477b bVar, C115476a aVar) {
            this.f346228a = str;
            this.f346229b = jVar;
            this.f346232e = str2;
            this.f346230c = bVar;
            this.f346231d = aVar;
        }
    }

    /* renamed from: a */
    public void mo175462a(C90587j jVar, String str, C115492q.C115496d dVar, C115477b bVar) {
        C115669n.INSTANCE.mo175913w(1293, 93, 1);
        C40939n nVar = new C40939n((C40939n.C2206a) null);
        String str2 = jVar.f260272d;
        nVar.f110176a = str2;
        nVar.f110179d = jVar.f260273e;
        nVar.f110181f = 2;
        nVar.f110185j = false;
        nVar.f110175B = false;
        if (((ConcurrentHashMap) this.f346225e).containsKey(str2)) {
            Log.m105924i("MicroMsg.LiteAppDownloadPkg", jVar.f260272d + " is downloading");
            if (bVar != null) {
                bVar.mo5700a(jVar.f260269a, 8);
                return;
            }
            return;
        }
        long b = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63956b(nVar);
        C115487b bVar2 = new C115487b(this, "downloadLiteAppPkg", jVar, str, bVar, (C115476a) null);
        bVar2.f346233f = dVar;
        ((ConcurrentHashMap) this.f346224d).put(Long.valueOf(b), bVar2);
        ((ConcurrentHashMap) this.f346225e).put(jVar.f260272d, bVar2);
    }

    /* renamed from: b */
    public void mo175463b(C90587j jVar, String str, C115476a aVar) {
        C115669n.INSTANCE.mo175913w(1293, 93, 1);
        C40939n nVar = new C40939n((C40939n.C2206a) null);
        String str2 = jVar.f260272d;
        nVar.f110176a = str2;
        nVar.f110179d = jVar.f260273e;
        nVar.f110181f = 2;
        nVar.f110185j = false;
        nVar.f110175B = false;
        if (((ConcurrentHashMap) this.f346225e).containsKey(str2)) {
            Log.m105924i("MicroMsg.LiteAppDownloadPkg", jVar.f260272d + " is downloading");
            return;
        }
        long b = ((C40935l) ((C13754y) C86312j.m106911c(C13754y.class)).Ds0()).mo63956b(nVar);
        C115487b bVar = new C115487b(this, "downloadLiteAppBaselib", jVar, str, (C115477b) null, aVar);
        bVar.f346233f = null;
        ((ConcurrentHashMap) this.f346224d).put(Long.valueOf(b), bVar);
        ((ConcurrentHashMap) this.f346225e).put(jVar.f260272d, bVar);
    }
}
