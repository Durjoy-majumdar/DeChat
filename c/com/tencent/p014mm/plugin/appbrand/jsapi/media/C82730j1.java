package com.tencent.p014mm.plugin.appbrand.jsapi.media;

import com.tencent.p014mm.plugin.appbrand.jsapi.C82381f;
import com.tencent.p014mm.plugin.appbrand.jsapi.media.C82713f2;

/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.media.j1 */
public class C82730j1 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C82713f2.C82714a f242047d;

    /* renamed from: e */
    public final /* synthetic */ C82381f f242048e;

    /* renamed from: f */
    public final /* synthetic */ int f242049f;

    /* renamed from: g */
    public final /* synthetic */ C82735k1 f242050g;

    public C82730j1(C82735k1 k1Var, C82713f2.C82714a aVar, C82381f fVar, int i) {
        this.f242050g = k1Var;
        this.f242047d = aVar;
        this.f242048e = fVar;
        this.f242049f = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
            com.tencent.mm.plugin.appbrand.jsapi.media.f2$a r0 = r14.f242047d
            java.lang.String r0 = r0.f242012a
            int r0 = com.tencent.p014mm.plugin.appbrand.jsapi.media.C82713f2.m101483a(r0)
            com.tencent.mm.plugin.appbrand.jsapi.media.k1 r1 = r14.f242050g
            com.tencent.mm.plugin.appbrand.jsapi.f r2 = r14.f242048e
            int r3 = r14.f242049f
            r1.getClass()
            r4 = -50006(0xffffffffffff3caa, float:NaN)
            r5 = 2
            java.lang.String r6 = "MicroMsg.JsApiCompressVideo"
            r7 = 1
            r8 = 0
            if (r0 == r4) goto L_0x004f
            if (r0 == r7) goto L_0x003f
            if (r0 == r5) goto L_0x004f
            switch(r0) {
                case -50002: goto L_0x0032;
                case -50001: goto L_0x0023;
                default: goto L_0x0022;
            }
        L_0x0022:
            goto L_0x004d
        L_0x0023:
            java.lang.String r4 = "fail:compress failed, file not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            java.lang.String r4 = "fail:file doesn't exist"
            java.lang.String r1 = r1.mo115109j(r4)
            r2.mo109647a(r3, r1)
            goto L_0x004d
        L_0x0032:
            java.lang.String r4 = "fail:compress failed, video duration error"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            java.lang.String r1 = r1.mo115109j(r4)
            r2.mo109647a(r3, r1)
            goto L_0x004d
        L_0x003f:
            java.lang.String r4 = "fail:compress failed, file type not be supported"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r4)
            java.lang.String r4 = "fail:compress failed, video type not be supported"
            java.lang.String r1 = r1.mo115109j(r4)
            r2.mo109647a(r3, r1)
        L_0x004d:
            r1 = 1
            goto L_0x0050
        L_0x004f:
            r1 = 0
        L_0x0050:
            if (r1 == 0) goto L_0x005a
            com.tencent.mm.plugin.appbrand.jsapi.media.k1 r0 = r14.f242050g
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f242053g
            r0.compareAndSet(r7, r8)
            return
        L_0x005a:
            com.tencent.mm.plugin.appbrand.jsapi.f r1 = r14.f242048e
            if (r1 == 0) goto L_0x0136
            com.tencent.mm.plugin.appbrand.appstorage.h0 r1 = r1.getFileSystem()
            if (r1 != 0) goto L_0x0066
            goto L_0x0136
        L_0x0066:
            java.lang.String r1 = "ok"
            r2 = 4652218415073722368(0x4090000000000000, double:1024.0)
            r9 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.String r4 = "size"
            java.lang.String r11 = "tempFilePath"
            if (r0 != r5) goto L_0x00c8
            java.lang.String r0 = "file not be compressed, cuz unnecessary"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r6, r0)
            js0.m r0 = new js0.m
            r0.<init>()
            com.tencent.mm.plugin.appbrand.jsapi.f r5 = r14.f242048e
            com.tencent.mm.plugin.appbrand.appstorage.h0 r5 = r5.getFileSystem()
            com.tencent.mm.vfs.m1 r6 = new com.tencent.mm.vfs.m1
            com.tencent.mm.plugin.appbrand.jsapi.media.f2$a r12 = r14.f242047d
            java.lang.String r12 = r12.f242012a
            r6.<init>((java.lang.String) r12)
            java.lang.String r12 = "mp4"
            r5.createTempFileFrom(r6, r12, r8, r0)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            T r0 = r0.f29691a
            r5.put(r11, r0)
            com.tencent.mm.plugin.appbrand.jsapi.media.f2$a r0 = r14.f242047d
            java.lang.String r0 = r0.f242012a
            long r11 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            double r11 = (double) r11
            double r11 = r11 * r9
            double r11 = r11 / r2
            long r2 = java.lang.Math.round(r11)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r5.put(r4, r0)
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r14.f242048e
            int r2 = r14.f242049f
            com.tencent.mm.plugin.appbrand.jsapi.media.k1 r3 = r14.f242050g
            java.lang.String r1 = r3.mo115112m(r1, r5)
            r0.mo109647a(r2, r1)
            com.tencent.mm.plugin.appbrand.jsapi.media.k1 r0 = r14.f242050g
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f242053g
            r0.compareAndSet(r7, r8)
            return
        L_0x00c8:
            com.tencent.mm.plugin.appbrand.jsapi.media.f2$a r0 = r14.f242047d
            java.lang.String r0 = com.tencent.p014mm.plugin.appbrand.jsapi.media.C82713f2.m101486d(r0)
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r0)
            if (r5 != 0) goto L_0x00f0
            java.lang.String r0 = "compressed file not exist"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r14.f242048e
            int r1 = r14.f242049f
            com.tencent.mm.plugin.appbrand.jsapi.media.k1 r2 = r14.f242050g
            java.lang.String r3 = "fail:compress failed, generate path failed"
            java.lang.String r2 = r2.mo115109j(r3)
            r0.mo109647a(r1, r2)
            com.tencent.mm.plugin.appbrand.jsapi.media.k1 r0 = r14.f242050g
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f242053g
            r0.compareAndSet(r7, r8)
            return
        L_0x00f0:
            js0.m r5 = new js0.m
            r5.<init>()
            com.tencent.mm.plugin.appbrand.jsapi.f r6 = r14.f242048e
            com.tencent.mm.plugin.appbrand.appstorage.h0 r6 = r6.getFileSystem()
            com.tencent.mm.vfs.m1 r12 = new com.tencent.mm.vfs.m1
            r12.<init>((java.lang.String) r0)
            r13 = 0
            r6.createTempFileFrom(r12, r13, r8, r5)
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            T r5 = r5.f29691a
            r6.put(r11, r5)
            long r11 = com.tencent.p014mm.vfs.C86013q1.m106451l(r0)
            double r11 = (double) r11
            double r11 = r11 * r9
            double r11 = r11 / r2
            long r2 = java.lang.Math.round(r11)
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r6.put(r4, r0)
            com.tencent.mm.plugin.appbrand.jsapi.f r0 = r14.f242048e
            int r2 = r14.f242049f
            com.tencent.mm.plugin.appbrand.jsapi.media.k1 r3 = r14.f242050g
            java.lang.String r1 = r3.mo115112m(r1, r6)
            r0.mo109647a(r2, r1)
            com.tencent.mm.plugin.appbrand.jsapi.media.k1 r0 = r14.f242050g
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f242053g
            r0.compareAndSet(r7, r8)
            return
        L_0x0136:
            java.lang.String r0 = "component or file system is null"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r0)
            com.tencent.mm.plugin.appbrand.jsapi.media.k1 r0 = r14.f242050g
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f242053g
            r0.compareAndSet(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.jsapi.media.C82730j1.run():void");
    }
}
