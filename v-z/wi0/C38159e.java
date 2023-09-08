package wi0;

import com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: wi0.e */
public final class C38159e extends IStaticListener<CheckResUpdateCacheFileEvent> {
    public C38159e() {
        Log.m105924i("MicroMsg.AppBrandGlobalSystemConfigResUpdateListener", "<init>");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r15) {
        /*
            r14 = this;
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent r15 = (com.tencent.p014mm.autogen.events.CheckResUpdateCacheFileEvent) r15
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r0 = r15.f78743d
            int r0 = r0.f78744a
            r1 = 38
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x00b5
            java.lang.String r0 = "MicroMsg.AppBrandGlobalSystemConfigResUpdateListener"
            java.lang.String r4 = "callback called"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r4)
            com.tencent.mm.autogen.events.CheckResUpdateCacheFileEvent$a r15 = r15.f78743d
            int r0 = r15.f78745b
            int r4 = r15.f78747d
            java.lang.String r15 = r15.f78746c
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            r6 = 2
            r7 = 3
            if (r5 == 0) goto L_0x0042
            boolean r5 = com.tencent.p014mm.vfs.C86013q1.m106450k(r15)
            if (r5 != 0) goto L_0x0042
            java.lang.String r1 = "MicroMsg.AppBrandGlobalSystemConfigResUpdateListener"
            java.lang.String r5 = "handleResUpdate(%dv%d) resPath(%s) not exists"
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r7[r3] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r7[r2] = r0
            r7[r6] = r15
            com.tencent.p014mm.sdk.platformtools.Log.m105921e(r1, r5, r7)
            goto L_0x00b6
        L_0x0042:
            java.lang.String r5 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.m100098a()
            boolean r8 = com.tencent.p014mm.vfs.C86013q1.m106450k(r5)
            if (r8 != 0) goto L_0x004f
            java.lang.String r8 = "!fileExists"
            goto L_0x0065
        L_0x004f:
            java.lang.String r8 = com.tencent.p014mm.vfs.C86013q1.m106456q(r15)
            java.lang.String r9 = com.tencent.p014mm.vfs.C86013q1.m106456q(r5)
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r10 != 0) goto L_0x0067
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x0067
            java.lang.String r8 = "md5 updated"
        L_0x0065:
            r9 = 1
            goto L_0x006a
        L_0x0067:
            java.lang.String r8 = "md5 latested"
            r9 = 0
        L_0x006a:
            if (r9 == 0) goto L_0x0074
            boolean r5 = com.tencent.p014mm.sdk.platformtools.FilesCopy.copyFile(r15, r5)
            if (r5 == 0) goto L_0x0074
            r5 = 1
            goto L_0x0075
        L_0x0074:
            r5 = 0
        L_0x0075:
            java.lang.String r10 = "MicroMsg.AppBrandGlobalSystemConfigResUpdateListener"
            java.lang.String r11 = "handleResUpdate(%dv%d) resPath(%s) doCopy?:%b, reason:%s, copyOK?:%b"
            r12 = 6
            java.lang.Object[] r12 = new java.lang.Object[r12]
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            r12[r3] = r13
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r12[r2] = r3
            r12[r6] = r15
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r9)
            r12[r7] = r15
            r15 = 4
            r12[r15] = r8
            r15 = 5
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            r12[r15] = r3
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r12)
            if (r5 == 0) goto L_0x00b6
            java.lang.Class<com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig> r15 = com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.class
            monitor-enter(r15)
            r3 = 0
            com.tencent.p014mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.f239276p0 = r3     // Catch:{ all -> 0x00b2 }
            monitor-exit(r15)
            java.lang.Class<fp.e> r15 = p523fp.C32147e.class
            di3.d r15 = di3.C86312j.m106911c(r15)
            fp.e r15 = (p523fp.C32147e) r15
            r15.Y40(r1, r0, r4)
            goto L_0x00b6
        L_0x00b2:
            r0 = move-exception
            monitor-exit(r15)
            throw r0
        L_0x00b5:
            r2 = 0
        L_0x00b6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: wi0.C38159e.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
