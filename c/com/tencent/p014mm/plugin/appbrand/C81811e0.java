package com.tencent.p014mm.plugin.appbrand;

import com.tencent.p014mm.plugin.appbrand.task.C84343y;
import lp3.C46888b;

/* renamed from: com.tencent.mm.plugin.appbrand.e0 */
public class C81811e0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ C46888b f240037d;

    /* renamed from: e */
    public final /* synthetic */ C84343y f240038e;

    /* renamed from: f */
    public final /* synthetic */ String f240039f;

    /* renamed from: g */
    public final /* synthetic */ C81829f0 f240040g;

    public C81811e0(C81829f0 f0Var, C46888b bVar, C84343y yVar, String str) {
        this.f240040g = f0Var;
        this.f240037d = bVar;
        this.f240038e = yVar;
        this.f240039f = str;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:10|(1:12)(1:13)|14|(2:20|(1:22)(1:23))|24|(1:26)(1:27)|28|29|30|31|32|33|37) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00d2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r8 = this;
            r0 = 0
            r1 = 1
            r2 = 0
            com.tencent.mm.plugin.appbrand.f0 r3 = r8.f240040g     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.d0 r3 = r3.f240096a     // Catch:{ all -> 0x00ec }
            boolean r3 = r3.f239738d     // Catch:{ all -> 0x00ec }
            if (r3 == 0) goto L_0x0021
            com.tencent.mm.plugin.appbrand.f0 r3 = r8.f240040g     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.d0 r3 = r3.f240096a     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = "preloadAppService, ahead preload entered but EXPIRED"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ec }
            r3.mo114030e(r4, r5)     // Catch:{ all -> 0x00ec }
            lp3.b r3 = r8.f240037d     // Catch:{ all -> 0x00ec }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ec }
            r4[r2] = r0     // Catch:{ all -> 0x00ec }
            r3.mo72093c(r4)     // Catch:{ all -> 0x00ec }
            return
        L_0x0021:
            com.tencent.mm.plugin.appbrand.f0 r3 = r8.f240040g     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.d0 r3 = r3.f240096a     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = r3.f239736b     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader r3 = r3.mo113184O1(r2)     // Catch:{ all -> 0x00ec }
            if (r3 != 0) goto L_0x0043
            lp3.b r3 = r8.f240037d     // Catch:{ all -> 0x00ec }
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ec }
            r4[r2] = r0     // Catch:{ all -> 0x00ec }
            r3.mo72093c(r4)     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.f0 r3 = r8.f240040g     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.d0 r3 = r3.f240096a     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = "preloadAppService, ahead preload entered but get NULL reader, WTF"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ec }
            r3.mo114030e(r4, r5)     // Catch:{ all -> 0x00ec }
            return
        L_0x0043:
            com.tencent.mm.plugin.appbrand.task.y r4 = r8.f240038e     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.task.y r5 = com.tencent.p014mm.plugin.appbrand.task.C84343y.WAGAME     // Catch:{ all -> 0x00ec }
            if (r4 != r5) goto L_0x004f
            mj0.d r4 = new mj0.d     // Catch:{ all -> 0x00ec }
            r4.<init>()     // Catch:{ all -> 0x00ec }
            goto L_0x0054
        L_0x004f:
            kr0.e r4 = new kr0.e     // Catch:{ all -> 0x00ec }
            r4.<init>()     // Catch:{ all -> 0x00ec }
        L_0x0054:
            com.tencent.mm.plugin.appbrand.f0 r5 = r8.f240040g     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.d0 r5 = r5.f240096a     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r5.f239736b     // Catch:{ all -> 0x00ec }
            r5.mo113201f2(r4)     // Catch:{ all -> 0x00ec }
            r4.mo114269d0(r3)     // Catch:{ all -> 0x00ec }
            java.lang.String r3 = "wxb1320569c2a2b6d2"
            com.tencent.mm.plugin.appbrand.f0 r5 = r8.f240040g     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.d0 r5 = r5.f240096a     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r5.f239736b     // Catch:{ all -> 0x00ec }
            java.lang.String r5 = r5.f238147j     // Catch:{ all -> 0x00ec }
            boolean r3 = r3.equals(r5)     // Catch:{ all -> 0x00ec }
            if (r3 == 0) goto L_0x0099
            r3 = 1190(0x4a6, float:1.668E-42)
            com.tencent.mm.plugin.appbrand.f0 r5 = r8.f240040g     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.d0 r5 = r5.f240096a     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r5 = r5.f239736b     // Catch:{ all -> 0x00ec }
            int r5 = r5.mo113208k1()     // Catch:{ all -> 0x00ec }
            if (r3 != r5) goto L_0x0099
            boolean r3 = com.tencent.p014mm.plugin.appbrand.C29611p4.m38833a()     // Catch:{ all -> 0x00ec }
            if (r3 == 0) goto L_0x0099
            com.tencent.mm.plugin.appbrand.e0$$a r3 = new com.tencent.mm.plugin.appbrand.e0$$a     // Catch:{ all -> 0x00ec }
            r3.<init>(r4)     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.jsruntime.i r5 = r4.getJsRuntime()     // Catch:{ all -> 0x00ec }
            if (r5 == 0) goto L_0x0094
            r3.run()     // Catch:{ all -> 0x00ec }
            goto L_0x0099
        L_0x0094:
            java.util.LinkedList<java.lang.Runnable> r5 = r4.f262596K     // Catch:{ all -> 0x00ec }
            r5.addLast(r3)     // Catch:{ all -> 0x00ec }
        L_0x0099:
            com.tencent.mm.plugin.appbrand.report.quality.q r3 = com.tencent.p014mm.plugin.appbrand.report.quality.C84217q.PreloadBeforeRuntimeInit     // Catch:{ all -> 0x00ec }
            zb.t r5 = new zb.t     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.f0 r6 = r8.f240040g     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.d0 r6 = r6.f240096a     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r6 = r6.f239736b     // Catch:{ all -> 0x00ec }
            boolean r6 = r6.mo113038X()     // Catch:{ all -> 0x00ec }
            if (r6 != 0) goto L_0x00ab
            r6 = 1
            goto L_0x00ac
        L_0x00ab:
            r6 = 0
        L_0x00ac:
            r5.<init>(r6)     // Catch:{ all -> 0x00ec }
            r4.f262595J = r5     // Catch:{ all -> 0x00ec }
            r4.mo125518K0(r3)     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.f0 r5 = r8.f240040g     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.d0 r5 = r5.f240096a     // Catch:{ all -> 0x00ec }
            java.lang.String r6 = "preloadAppService, ahead preload DONE"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ec }
            r5.mo114031f(r6, r7)     // Catch:{ all -> 0x00ec }
            lp3.b r5 = r8.f240037d     // Catch:{ all -> 0x00ec }
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ all -> 0x00ec }
            r6[r2] = r4     // Catch:{ all -> 0x00ec }
            r5.mo72093c(r6)     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = r8.f240039f     // Catch:{ Exception -> 0x00d2 }
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r4 = com.tencent.p014mm.plugin.appbrand.report.quality.C84185b.m103770c(r4, r1)     // Catch:{ Exception -> 0x00d2 }
            r4.f245842C = r3     // Catch:{ Exception -> 0x00d2 }
            goto L_0x00de
        L_0x00d2:
            com.tencent.mm.plugin.appbrand.f0 r3 = r8.f240040g     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.d0 r3 = r3.f240096a     // Catch:{ all -> 0x00ec }
            java.lang.String r4 = "preloadAppService, ahead preload DONE but get NULL session"
            java.lang.Object[] r5 = new java.lang.Object[r2]     // Catch:{ all -> 0x00ec }
            r3.mo114030e(r4, r5)     // Catch:{ all -> 0x00ec }
        L_0x00de:
            com.tencent.mm.plugin.appbrand.f0 r3 = r8.f240040g     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.d0 r3 = r3.f240096a     // Catch:{ all -> 0x00ec }
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r3 = r3.f239736b     // Catch:{ all -> 0x00ec }
            java.lang.String r3 = r3.f238147j     // Catch:{ all -> 0x00ec }
            uo0.a r4 = com.tencent.p014mm.plugin.appbrand.step.KSProcessWeAppLaunch.stepWaitForAppServiceAheadPreloadDone     // Catch:{ all -> 0x00ec }
            com.tencent.p014mm.plugin.appbrand.keylogger.C83226n.m102128e(r3, r4)     // Catch:{ all -> 0x00ec }
            goto L_0x0100
        L_0x00ec:
            r3 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = "MicroMsg.AppBrand.AppBrandRuntimeBoostStrategy[preload]"
            java.lang.String r6 = "preloadAppService, ahead preload EXCEPTION"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r5, r3, r6, r4)
            lp3.b r3 = r8.f240037d
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r2] = r0
            r3.mo72093c(r1)
        L_0x0100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.C81811e0.run():void");
    }
}
