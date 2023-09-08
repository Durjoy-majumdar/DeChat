package com.tencent.p014mm.plugin.appbrand.jsapi;

import com.tencent.p014mm.plugin.appbrand.C81925i2;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.b2 */
public class C82211b2<S extends C81925i2> extends C82268c<S> {
    public static final int CTRL_INDEX = 250;
    public static final String NAME = "captureScreen";

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v5, resolved type: android.graphics.Bitmap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo1505u(com.tencent.p014mm.plugin.appbrand.jsapi.C82381f r13, org.json.JSONObject r14, int r15) {
        /*
            r12 = this;
            com.tencent.mm.plugin.appbrand.i2 r13 = (com.tencent.p014mm.plugin.appbrand.C81925i2) r13
            java.lang.String r14 = "save bitmap to file failed, . exception : %s"
            java.lang.String r0 = "bitmap recycle %s"
            java.lang.String r1 = r13.getAppId()
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = "MicroMsg.JsApiCaptureScreen"
            java.lang.String r5 = "captureScreen, appId:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r3)
            com.tencent.mm.plugin.appbrand.AppBrandRuntime r3 = r13.getRuntime()
            com.tencent.mm.plugin.appbrand.page.m0 r3 = r3.mo113042Z()
            java.lang.String r5 = "fail:container or page is null"
            java.lang.String r6 = "captureScreen, container or page is null"
            if (r3 == 0) goto L_0x01c2
            com.tencent.mm.plugin.appbrand.page.d1 r7 = r3.getPageView()
            if (r7 != 0) goto L_0x002e
            goto L_0x01c2
        L_0x002e:
            com.tencent.mm.plugin.appbrand.page.d1 r3 = r3.getPageView()
            if (r3 != 0) goto L_0x0040
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
            java.lang.String r14 = r12.mo115109j(r5)
            r13.mo109647a(r15, r14)
            goto L_0x01cc
        L_0x0040:
            r3 = r12
            com.tencent.mm.plugin.appbrand.jsapi.c2 r3 = (com.tencent.p014mm.plugin.appbrand.jsapi.C82269c2) r3
            r5 = r13
            kr0.e r5 = (kr0.C88267e) r5
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r6 = r5.getRuntime()
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.String r8 = r6.f238147j
            r7[r4] = r8
            boolean r8 = r6.mo121254q1()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            r7[r2] = r8
            java.lang.String r8 = "MicroMsg.JsApiCaptureScreenWC"
            java.lang.String r9 = "getBitmapFromView appId:%s, isGame:%b"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r8, r9, r7)
            boolean r6 = r6.mo121254q1()
            r7 = 0
            if (r6 == 0) goto L_0x008b
            java.lang.Class<eb.e> r3 = p958eb.C86474e.class
            java.lang.Object r3 = r5.mo125517G0(r3)
            eb.e r3 = (p958eb.C86474e) r3
            if (r3 == 0) goto L_0x007e
            com.tencent.magicbrush.a r3 = r3.mo120910U()
            od.b r3 = r3.f235098n
            android.graphics.Bitmap r7 = r3.mo123494c()
            goto L_0x00a7
        L_0x007e:
            eb.g r3 = new eb.g
            r3.<init>()
            java.lang.Object[] r5 = new java.lang.Object[r4]
            java.lang.String r6 = "hy: you're not on game service!"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r8, r3, r6, r5)
            goto L_0x00a7
        L_0x008b:
            com.tencent.mm.plugin.appbrand.page.d1 r5 = r5.mo114341l0()
            if (r5 != 0) goto L_0x0092
            goto L_0x00a7
        L_0x0092:
            com.tencent.mm.plugin.appbrand.jsapi.a2 r6 = new com.tencent.mm.plugin.appbrand.jsapi.a2
            r6.<init>(r3, r5)
            com.tencent.mm.sdk.platformtools.MMHandler r3 = new com.tencent.mm.sdk.platformtools.MMHandler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r3.<init>((android.os.Looper) r5)
            java.lang.Object r3 = r6.exec(r3)
            r7 = r3
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
        L_0x00a7:
            if (r7 != 0) goto L_0x00b9
            java.lang.String r14 = "bitmap is null, err return"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r14)
            java.lang.String r14 = "fail:can't captureScreen"
            java.lang.String r14 = r12.mo115109j(r14)
            r13.mo109647a(r15, r14)
            goto L_0x01cc
        L_0x00b9:
            js0.m r3 = new js0.m
            r3.<init>()
            com.tencent.mm.plugin.appbrand.appstorage.h0 r5 = r13.getFileSystem()
            com.tencent.mm.plugin.appbrand.appstorage.b0 r5 = r5.getTempDirectory(r3)
            com.tencent.mm.plugin.appbrand.appstorage.b0 r6 = com.tencent.p014mm.plugin.appbrand.appstorage.C81410b0.OK
            java.lang.String r8 = "fail:gen temp file failed"
            if (r5 == r6) goto L_0x00d5
            java.lang.String r14 = r12.mo115109j(r8)
            r13.mo109647a(r15, r14)
            goto L_0x01cc
        L_0x00d5:
            com.tencent.mm.vfs.m1 r5 = new com.tencent.mm.vfs.m1
            T r3 = r3.f29691a
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "appbrand_capture_"
            r9.append(r10)
            long r10 = java.lang.System.currentTimeMillis()
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r5.<init>((java.lang.String) r3, (java.lang.String) r9)
            java.lang.String r3 = r5.mo119971i()
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r4] = r3
            java.lang.String r9 = "capture bitmap path:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r9, r5)
            r5 = 100
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            com.tencent.p014mm.sdk.platformtools.BitmapUtil.saveBitmapToImage(r7, r5, r9, r3, r2)     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            js0.m r5 = new js0.m     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            r5.<init>()     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            com.tencent.mm.plugin.appbrand.appstorage.h0 r9 = r13.getFileSystem()     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            com.tencent.mm.vfs.m1 r10 = new com.tencent.mm.vfs.m1     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            r10.<init>((java.lang.String) r3)     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            java.lang.String r11 = "png"
            com.tencent.mm.plugin.appbrand.appstorage.b0 r9 = r9.createTempFileFrom(r10, r11, r2, r5)     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            if (r9 == r6) goto L_0x0140
            java.lang.String r5 = "create temp file failed, path:%s"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            r6[r4] = r3     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r5, r6)     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            java.lang.String r3 = r12.mo115109j(r8)     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            r13.mo109647a(r15, r3)     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            boolean r13 = r7.isRecycled()
            if (r13 != 0) goto L_0x01cc
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r4] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r13)
        L_0x013b:
            r7.recycle()
            goto L_0x01cc
        L_0x0140:
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            r3.<init>()     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            java.lang.String r6 = "tempFilePath"
            T r8 = r5.f29691a     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            r3.put(r6, r8)     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            java.lang.String r6 = "capture bitmap tempFilePath:%s"
            java.lang.Object[] r8 = new java.lang.Object[r2]     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            T r5 = r5.f29691a     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            r8[r4] = r5     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r6, r8)     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            java.lang.String r5 = "ok"
            java.lang.String r3 = r12.mo115112m(r5, r3)     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            r13.mo109647a(r15, r3)     // Catch:{ IOException -> 0x0192, Exception -> 0x0173 }
            boolean r13 = r7.isRecycled()
            if (r13 != 0) goto L_0x01cc
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r4] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r13)
            goto L_0x013b
        L_0x0171:
            r13 = move-exception
            goto L_0x01b1
        L_0x0173:
            r3 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0171 }
            r5[r4] = r3     // Catch:{ all -> 0x0171 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r14, r5)     // Catch:{ all -> 0x0171 }
            java.lang.String r14 = "fail:Exception"
            java.lang.String r14 = r12.mo115109j(r14)     // Catch:{ all -> 0x0171 }
            r13.mo109647a(r15, r14)     // Catch:{ all -> 0x0171 }
            boolean r13 = r7.isRecycled()
            if (r13 != 0) goto L_0x01cc
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r4] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r13)
            goto L_0x013b
        L_0x0192:
            r3 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x0171 }
            r5[r4] = r3     // Catch:{ all -> 0x0171 }
            com.tencent.p014mm.sdk.platformtools.Log.m105929w(r1, r14, r5)     // Catch:{ all -> 0x0171 }
            java.lang.String r14 = "fail:IOException"
            java.lang.String r14 = r12.mo115109j(r14)     // Catch:{ all -> 0x0171 }
            r13.mo109647a(r15, r14)     // Catch:{ all -> 0x0171 }
            boolean r13 = r7.isRecycled()
            if (r13 != 0) goto L_0x01cc
            java.lang.Object[] r13 = new java.lang.Object[r2]
            r13[r4] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r13)
            goto L_0x013b
        L_0x01b1:
            boolean r14 = r7.isRecycled()
            if (r14 != 0) goto L_0x01c1
            java.lang.Object[] r14 = new java.lang.Object[r2]
            r14[r4] = r7
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r0, r14)
            r7.recycle()
        L_0x01c1:
            throw r13
        L_0x01c2:
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r1, r6)
            java.lang.String r14 = r12.mo115109j(r5)
            r13.mo109647a(r15, r14)
        L_0x01cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.C82211b2.mo1505u(com.tencent.mm.plugin.appbrand.jsapi.f, org.json.JSONObject, int):void");
    }
}
