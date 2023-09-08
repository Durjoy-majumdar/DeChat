package io0;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;

/* renamed from: io0.b */
public class C87777b implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ boolean f254134d;

    /* renamed from: e */
    public final /* synthetic */ C82381f f254135e;

    /* renamed from: f */
    public final /* synthetic */ String f254136f;

    /* renamed from: g */
    public final /* synthetic */ String f254137g;

    public C87777b(boolean z, C82381f fVar, String str, String str2) {
        this.f254134d = z;
        this.f254135e = fVar;
        this.f254136f = str;
        this.f254137g = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0098 A[Catch:{ Exception -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00b2 A[Catch:{ Exception -> 0x00c6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ea  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            boolean r0 = r12.f254134d
            r1 = 0
            r2 = 1
            r3 = 0
            java.lang.String r4 = "download ing: %s"
            java.lang.String r5 = "download done"
            java.lang.String r6 = "MicroMsg.AppBrandLiveFileLoadHelper"
            if (r0 == 0) goto L_0x00f4
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r12.f254135e
            java.lang.String r7 = r12.f254136f
            java.lang.String r8 = r12.f254137g
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r9 = io0.C87779d.f254140a
            java.util.concurrent.ConcurrentHashMap r9 = (java.util.concurrent.ConcurrentHashMap) r9
            boolean r9 = r9.containsKey(r7)
            if (r9 == 0) goto L_0x0026
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r1] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r0)
            goto L_0x018c
        L_0x0026:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r4 = io0.C87779d.f254140a
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            java.util.concurrent.ConcurrentHashMap r4 = (java.util.concurrent.ConcurrentHashMap) r4
            r4.put(r7, r9)
            io0.h r4 = io0.C33371h.f90436a
            com.tencent.mm.vfs.m1 r9 = r4.mo59110a(r0, r7)
            if (r9 != 0) goto L_0x0039
            goto L_0x00c4
        L_0x0039:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c6 }
            r10.<init>()     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r11 = io0.C87779d.f254142c     // Catch:{ Exception -> 0x00c6 }
            r10.append(r11)     // Catch:{ Exception -> 0x00c6 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c6 }
            r11.<init>()     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = r0.getAppId()     // Catch:{ Exception -> 0x00c6 }
            r11.append(r0)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = "_"
            r11.append(r0)     // Catch:{ Exception -> 0x00c6 }
            r11.append(r7)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = r11.toString()     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = io0.C87779d.m109219f(r0)     // Catch:{ Exception -> 0x00c6 }
            r10.append(r0)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r0 = r10.toString()     // Catch:{ Exception -> 0x00c6 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00c6 }
            r10.<init>()     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r11 = "downloadAndUnzipInner, cachedZipPath: "
            r10.append(r11)     // Catch:{ Exception -> 0x00c6 }
            r10.append(r0)     // Catch:{ Exception -> 0x00c6 }
            java.lang.String r10 = r10.toString()     // Catch:{ Exception -> 0x00c6 }
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r10)     // Catch:{ Exception -> 0x00c6 }
            com.tencent.mm.vfs.m1 r10 = new com.tencent.mm.vfs.m1     // Catch:{ Exception -> 0x00c6 }
            r10.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x00c6 }
            boolean r11 = r10.mo119967g()     // Catch:{ Exception -> 0x00c6 }
            if (r11 == 0) goto L_0x0095
            boolean r11 = io0.C87779d.m109217d(r8, r0)     // Catch:{ Exception -> 0x00c6 }
            if (r11 == 0) goto L_0x008d
            r11 = 0
            goto L_0x0096
        L_0x008d:
            java.lang.String r11 = "downloadAndUnzipInner, cachedZipPath is invalid 1"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r11)     // Catch:{ Exception -> 0x00c6 }
            r10.mo119966f()     // Catch:{ Exception -> 0x00c6 }
        L_0x0095:
            r11 = 1
        L_0x0096:
            if (r11 == 0) goto L_0x00aa
            io0.C87779d.m109214a(r7, r10)     // Catch:{ Exception -> 0x00c6 }
            boolean r0 = io0.C87779d.m109217d(r8, r0)     // Catch:{ Exception -> 0x00c6 }
            if (r0 != 0) goto L_0x00aa
            java.lang.String r0 = "downloadAndUnzipInner, cachedZipPath is invalid 2"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)     // Catch:{ Exception -> 0x00c6 }
            r10.mo119966f()     // Catch:{ Exception -> 0x00c6 }
            goto L_0x00c4
        L_0x00aa:
            io0.f r0 = io0.C33370f.f90435a     // Catch:{ Exception -> 0x00c6 }
            boolean r0 = r0.mo59107a(r9)     // Catch:{ Exception -> 0x00c6 }
            if (r0 != 0) goto L_0x00d0
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x00c6 }
            java.io.InputStream r8 = com.tencent.p014mm.vfs.C86013q1.m106422D(r10)     // Catch:{ Exception -> 0x00c6 }
            r0.<init>(r8)     // Catch:{ Exception -> 0x00c6 }
            com.tencent.mm.vfs.m1 r4 = r4.mo59111b(r0, r9)     // Catch:{ Exception -> 0x00c6 }
            if (r4 != 0) goto L_0x00d0
            com.tencent.p014mm.sdk.platformtools.Util.qualityClose(r0)     // Catch:{ Exception -> 0x00c6 }
        L_0x00c4:
            r9 = r3
            goto L_0x00d3
        L_0x00c6:
            r0 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r7
            java.lang.String r1 = "download file url %s "
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r6, r0, r1, r2)
        L_0x00d0:
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
        L_0x00d3:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r0 = io0.C87779d.f254140a
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            r0.remove(r7)
            if (r9 == 0) goto L_0x00ea
            java.lang.String r0 = r9.mo119971i()
            io0.c r1 = new io0.c
            r1.<init>(r7, r0)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
            goto L_0x018c
        L_0x00ea:
            io0.c r0 = new io0.c
            r0.<init>(r7, r3)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r0)
            goto L_0x018c
        L_0x00f4:
            java.lang.String r0 = r12.f254136f
            java.lang.String r7 = r12.f254137g
            java.lang.String r8 = io0.C87779d.m109219f(r0)
            r9 = 2
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.String r10 = io0.C87779d.f254142c
            r9[r1] = r10
            r9[r2] = r8
            java.lang.String r8 = "%s%s"
            java.lang.String r8 = java.lang.String.format(r8, r9)
            java.lang.Object[] r9 = new java.lang.Object[r2]
            r9[r1] = r8
            java.lang.String r10 = "handleNetworkFile, localPath:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r10, r9)
            com.tencent.mm.vfs.m1 r9 = new com.tencent.mm.vfs.m1
            r9.<init>((java.lang.String) r8)
            boolean r10 = r9.mo119967g()
            if (r10 == 0) goto L_0x0148
            java.lang.Object[] r10 = new java.lang.Object[r2]
            r10[r1] = r0
            java.lang.String r11 = "download already exists: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r10)
            boolean r10 = io0.C87779d.m109217d(r7, r8)
            if (r10 == 0) goto L_0x0137
            io0.c r1 = new io0.c
            r1.<init>(r0, r8)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
            goto L_0x018c
        L_0x0137:
            java.lang.Object[] r10 = new java.lang.Object[r2]
            boolean r11 = r9.mo119966f()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r10[r1] = r11
            java.lang.String r11 = "download already exists, but md5 not valid. deleted:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r11, r10)
        L_0x0148:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r10 = io0.C87779d.f254140a
            java.util.concurrent.ConcurrentHashMap r10 = (java.util.concurrent.ConcurrentHashMap) r10
            boolean r10 = r10.containsKey(r0)
            if (r10 == 0) goto L_0x015a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r0
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r6, r4, r2)
            goto L_0x018c
        L_0x015a:
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r1 = io0.C87779d.f254140a
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            r1.put(r0, r2)
            io0.C87779d.m109214a(r0, r9)
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            java.util.concurrent.ConcurrentMap<java.lang.String, java.lang.Boolean> r1 = io0.C87779d.f254140a
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            r1.remove(r0)
            boolean r1 = io0.C87779d.m109217d(r7, r8)
            if (r1 == 0) goto L_0x017f
            io0.c r1 = new io0.c
            r1.<init>(r0, r8)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
            goto L_0x018c
        L_0x017f:
            java.lang.String r1 = "download md5 not valid"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r6, r1)
            io0.c r1 = new io0.c
            r1.<init>(r0, r3)
            com.tencent.p014mm.sdk.platformtools.MMHandlerThread.postToMainThread(r1)
        L_0x018c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io0.C87777b.run():void");
    }
}
