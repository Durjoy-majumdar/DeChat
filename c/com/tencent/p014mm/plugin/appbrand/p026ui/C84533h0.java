package com.tencent.p014mm.plugin.appbrand.p026ui;

import com.tencent.p014mm.plugin.appbrand.game.preload.C1528a;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.h0 */
public class C84533h0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ String f246685d;

    /* renamed from: e */
    public final /* synthetic */ C1528a.C1529a f246686e;

    /* renamed from: f */
    public final /* synthetic */ C84552k0 f246687f;

    public C84533h0(C84552k0 k0Var, String str, C1528a.C1529a aVar) {
        this.f246687f = k0Var;
        this.f246685d = str;
        this.f246686e = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0297, code lost:
        if (r2.mo177810a() != false) goto L_0x019d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        r2.f348991a.mo119946t(r2.f348992b, r1.f348991a, r1.f348992b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0199, code lost:
        if (r2.mo177810a() != false) goto L_0x019d;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:126:0x02a3 */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0225 A[SYNTHETIC, Splitter:B:101:0x0225] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0231 A[SYNTHETIC, Splitter:B:106:0x0231] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0245  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0293  */
    /* JADX WARNING: Removed duplicated region for block: B:131:0x02b0 A[SYNTHETIC, Splitter:B:131:0x02b0] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0129 A[SYNTHETIC, Splitter:B:48:0x0129] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x01a3 A[SYNTHETIC, Splitter:B:73:0x01a3] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x01e5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r13 = this;
            java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.game.preload.C1528a.f10900a
            com.tencent.mm.plugin.appbrand.game.preload.a r0 = com.tencent.p014mm.plugin.appbrand.game.preload.C1528a.C1530b.f10901a
            com.tencent.mm.plugin.appbrand.ui.k0 r1 = r13.f246687f
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r1 = r1.f246743x
            java.lang.String r1 = r1.f238147j
            java.lang.String r2 = r13.f246685d
            com.tencent.mm.plugin.appbrand.game.preload.a$a r3 = r13.f246686e
            r0.getClass()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r0 != 0) goto L_0x02c8
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r0 != 0) goto L_0x02c8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = com.tencent.p014mm.plugin.appbrand.game.preload.C1528a.f10900a
            r0.append(r4)
            java.lang.String r4 = "/"
            r0.append(r4)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.FilePathGenerator.checkMkdir(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.MD5Util.getMD5String((java.lang.String) r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            java.lang.Object[] r4 = new java.lang.Object[r1]
            r5 = 0
            r4[r5] = r0
            java.lang.String r6 = "MicroMsg.WAGameLoadingImgManager"
            java.lang.String r7 = "loadingImgPath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r7, r4)
            android.net.Uri r4 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r7 = r4.getPath()
            if (r7 == 0) goto L_0x007d
            java.lang.String r7 = com.tencent.p014mm.vfs.C116299g2.m163855k(r7, r5, r5)
            java.lang.String r8 = r4.getPath()
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x007d
            android.net.Uri$Builder r4 = r4.buildUpon()
            android.net.Uri$Builder r4 = r4.path(r7)
            android.net.Uri r4 = r4.build()
        L_0x007d:
            com.tencent.mm.vfs.f0 r7 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            r8 = 0
            com.tencent.mm.vfs.f0$h r4 = r7.mo177799l(r4, r8)
            boolean r7 = r4.mo177810a()
            if (r7 != 0) goto L_0x008c
            r4 = 0
            goto L_0x0094
        L_0x008c:
            com.tencent.mm.vfs.FileSystem$c r7 = r4.f348991a
            java.lang.String r4 = r4.f348992b
            boolean r4 = r7.mo119948x(r4)
        L_0x0094:
            java.lang.String r7 = "read contentLength"
            java.lang.String r9 = ""
            if (r4 == 0) goto L_0x00c0
            java.io.InputStream r8 = com.tencent.p014mm.vfs.C86013q1.m106423E(r0)     // Catch:{ FileNotFoundException -> 0x00a0 }
            goto L_0x00a6
        L_0x00a0:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r9, r1)
        L_0x00a6:
            if (r8 == 0) goto L_0x02c5
            int r0 = r8.available()     // Catch:{ IOException -> 0x00b8 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x00b8 }
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeStream(r8)     // Catch:{ IOException -> 0x00b8 }
            com.tencent.mm.plugin.appbrand.ui.g0 r3 = (com.tencent.p014mm.plugin.appbrand.p026ui.C84529g0) r3     // Catch:{ IOException -> 0x00b8 }
            r3.mo117225a(r2, r0)     // Catch:{ IOException -> 0x00b8 }
            goto L_0x02c5
        L_0x00b8:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r7, r1)
            goto L_0x02c5
        L_0x00c0:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r10 = "tmp"
            r4.append(r10)
            java.lang.String r4 = r4.toString()
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r5] = r4
            java.lang.String r11 = "downloadLoadingUrl path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r10)
            java.net.URL r10 = new java.net.URL     // Catch:{ Exception -> 0x00ea }
            r10.<init>(r2)     // Catch:{ Exception -> 0x00ea }
            java.io.BufferedInputStream r11 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x00ea }
            java.io.InputStream r10 = r10.openStream()     // Catch:{ Exception -> 0x00ea }
            r11.<init>(r10)     // Catch:{ Exception -> 0x00ea }
            goto L_0x00fc
        L_0x00ea:
            r10 = move-exception
            r11 = 2
            java.lang.Object[] r11 = new java.lang.Object[r11]
            r11[r5] = r2
            java.lang.String r2 = r10.toString()
            r11[r1] = r2
            java.lang.String r1 = "fetch error failed. path = [%s], error = [%s]"
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r6, r1, r11)
            r11 = r8
        L_0x00fc:
            if (r11 == 0) goto L_0x0222
            java.io.OutputStream r1 = com.tencent.p014mm.vfs.C86013q1.m106429K(r4, r5)     // Catch:{ IOException -> 0x0120, all -> 0x011b }
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch:{ IOException -> 0x0119 }
        L_0x0106:
            int r10 = r11.read(r2)     // Catch:{ IOException -> 0x0119 }
            r12 = -1
            if (r10 == r12) goto L_0x0111
            r1.write(r2, r5, r10)     // Catch:{ IOException -> 0x0119 }
            goto L_0x0106
        L_0x0111:
            r1.flush()     // Catch:{ IOException -> 0x0119 }
            goto L_0x0223
        L_0x0116:
            r2 = move-exception
            goto L_0x01a1
        L_0x0119:
            r2 = move-exception
            goto L_0x0122
        L_0x011b:
            r1 = move-exception
            r2 = r1
            r1 = r8
            goto L_0x01a1
        L_0x0120:
            r2 = move-exception
            r1 = r8
        L_0x0122:
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ all -> 0x0116 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r2, r9, r10)     // Catch:{ all -> 0x0116 }
            if (r1 == 0) goto L_0x0133
            r1.close()     // Catch:{ IOException -> 0x012d }
            goto L_0x0133
        L_0x012d:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r1, r9, r2)
        L_0x0133:
            r11.close()     // Catch:{ IOException -> 0x0137 }
            goto L_0x013d
        L_0x0137:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r1, r9, r2)
        L_0x013d:
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r4)
            java.lang.String r2 = r1.getPath()
            if (r2 == 0) goto L_0x0161
            java.lang.String r2 = com.tencent.p014mm.vfs.C116299g2.m163855k(r2, r5, r5)
            java.lang.String r4 = r1.getPath()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x0161
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r2)
            android.net.Uri r1 = r1.build()
        L_0x0161:
            android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r4 = r2.getPath()
            if (r4 == 0) goto L_0x0185
            java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r5, r5)
            java.lang.String r10 = r2.getPath()
            boolean r10 = r10.equals(r4)
            if (r10 != 0) goto L_0x0185
            android.net.Uri$Builder r2 = r2.buildUpon()
            android.net.Uri$Builder r2 = r2.path(r4)
            android.net.Uri r2 = r2.build()
        L_0x0185:
            com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r1 = r4.mo177799l(r1, r8)
            com.tencent.mm.vfs.f0$h r2 = r4.mo177799l(r2, r8)
            boolean r4 = r1.mo177810a()
            if (r4 == 0) goto L_0x02a3
            boolean r4 = r2.mo177810a()
            if (r4 != 0) goto L_0x019d
            goto L_0x02a3
        L_0x019d:
            com.tencent.mm.vfs.FileSystem$c r4 = r2.f348991a     // Catch:{ IOException -> 0x02a3 }
            goto L_0x029a
        L_0x01a1:
            if (r1 == 0) goto L_0x01ad
            r1.close()     // Catch:{ IOException -> 0x01a7 }
            goto L_0x01ad
        L_0x01a7:
            r1 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r1, r9, r3)
        L_0x01ad:
            r11.close()     // Catch:{ IOException -> 0x01b1 }
            goto L_0x01b7
        L_0x01b1:
            r1 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r1, r9, r3)
        L_0x01b7:
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r4)
            java.lang.String r3 = r1.getPath()
            if (r3 == 0) goto L_0x01db
            java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r5, r5)
            java.lang.String r4 = r1.getPath()
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x01db
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r3)
            android.net.Uri r1 = r1.build()
        L_0x01db:
            android.net.Uri r0 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r3 = r0.getPath()
            if (r3 == 0) goto L_0x01ff
            java.lang.String r3 = com.tencent.p014mm.vfs.C116299g2.m163855k(r3, r5, r5)
            java.lang.String r4 = r0.getPath()
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x01ff
            android.net.Uri$Builder r0 = r0.buildUpon()
            android.net.Uri$Builder r0 = r0.path(r3)
            android.net.Uri r0 = r0.build()
        L_0x01ff:
            com.tencent.mm.vfs.f0 r3 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r1 = r3.mo177799l(r1, r8)
            com.tencent.mm.vfs.f0$h r0 = r3.mo177799l(r0, r8)
            boolean r3 = r1.mo177810a()
            if (r3 == 0) goto L_0x0221
            boolean r3 = r0.mo177810a()
            if (r3 != 0) goto L_0x0216
            goto L_0x0221
        L_0x0216:
            com.tencent.mm.vfs.FileSystem$c r3 = r0.f348991a     // Catch:{ IOException -> 0x0221 }
            java.lang.String r0 = r0.f348992b     // Catch:{ IOException -> 0x0221 }
            com.tencent.mm.vfs.FileSystem$c r4 = r1.f348991a     // Catch:{ IOException -> 0x0221 }
            java.lang.String r1 = r1.f348992b     // Catch:{ IOException -> 0x0221 }
            r3.mo119946t(r0, r4, r1)     // Catch:{ IOException -> 0x0221 }
        L_0x0221:
            throw r2
        L_0x0222:
            r1 = r8
        L_0x0223:
            if (r1 == 0) goto L_0x022f
            r1.close()     // Catch:{ IOException -> 0x0229 }
            goto L_0x022f
        L_0x0229:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r1, r9, r2)
        L_0x022f:
            if (r11 == 0) goto L_0x023b
            r11.close()     // Catch:{ IOException -> 0x0235 }
            goto L_0x023b
        L_0x0235:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r1, r9, r2)
        L_0x023b:
            android.net.Uri r1 = com.tencent.p014mm.vfs.C116299g2.m163858n(r4)
            java.lang.String r2 = r1.getPath()
            if (r2 == 0) goto L_0x025f
            java.lang.String r2 = com.tencent.p014mm.vfs.C116299g2.m163855k(r2, r5, r5)
            java.lang.String r4 = r1.getPath()
            boolean r4 = r4.equals(r2)
            if (r4 != 0) goto L_0x025f
            android.net.Uri$Builder r1 = r1.buildUpon()
            android.net.Uri$Builder r1 = r1.path(r2)
            android.net.Uri r1 = r1.build()
        L_0x025f:
            android.net.Uri r2 = com.tencent.p014mm.vfs.C116299g2.m163858n(r0)
            java.lang.String r4 = r2.getPath()
            if (r4 == 0) goto L_0x0283
            java.lang.String r4 = com.tencent.p014mm.vfs.C116299g2.m163855k(r4, r5, r5)
            java.lang.String r10 = r2.getPath()
            boolean r10 = r10.equals(r4)
            if (r10 != 0) goto L_0x0283
            android.net.Uri$Builder r2 = r2.buildUpon()
            android.net.Uri$Builder r2 = r2.path(r4)
            android.net.Uri r2 = r2.build()
        L_0x0283:
            com.tencent.mm.vfs.f0 r4 = com.tencent.p014mm.vfs.C116281f0.C116289i.f348994a
            com.tencent.mm.vfs.f0$h r1 = r4.mo177799l(r1, r8)
            com.tencent.mm.vfs.f0$h r2 = r4.mo177799l(r2, r8)
            boolean r4 = r1.mo177810a()
            if (r4 == 0) goto L_0x02a3
            boolean r4 = r2.mo177810a()
            if (r4 != 0) goto L_0x019d
            goto L_0x02a3
        L_0x029a:
            java.lang.String r2 = r2.f348992b     // Catch:{ IOException -> 0x02a3 }
            com.tencent.mm.vfs.FileSystem$c r10 = r1.f348991a     // Catch:{ IOException -> 0x02a3 }
            java.lang.String r1 = r1.f348992b     // Catch:{ IOException -> 0x02a3 }
            r4.mo119946t(r2, r10, r1)     // Catch:{ IOException -> 0x02a3 }
        L_0x02a3:
            java.io.InputStream r8 = com.tencent.p014mm.vfs.C86013q1.m106423E(r0)     // Catch:{ FileNotFoundException -> 0x02a8 }
            goto L_0x02ae
        L_0x02a8:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r9, r1)
        L_0x02ae:
            if (r8 == 0) goto L_0x02c5
            int r0 = r8.available()     // Catch:{ IOException -> 0x02bf }
            long r0 = (long) r0     // Catch:{ IOException -> 0x02bf }
            android.graphics.Bitmap r2 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.decodeStream(r8)     // Catch:{ IOException -> 0x02bf }
            com.tencent.mm.plugin.appbrand.ui.g0 r3 = (com.tencent.p014mm.plugin.appbrand.p026ui.C84529g0) r3     // Catch:{ IOException -> 0x02bf }
            r3.mo117225a(r2, r0)     // Catch:{ IOException -> 0x02bf }
            goto L_0x02c5
        L_0x02bf:
            r0 = move-exception
            java.lang.Object[] r1 = new java.lang.Object[r5]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r7, r1)
        L_0x02c5:
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r8)
        L_0x02c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.p026ui.C84533h0.run():void");
    }
}
