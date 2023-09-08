package com.tencent.p014mm.plugin.appbrand;

/* renamed from: com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC$$t */
public class AppBrandRuntimeWC$$t implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ AppBrandRuntimeWC f238338d;

    public AppBrandRuntimeWC$$t(AppBrandRuntimeWC appBrandRuntimeWC) {
        this.f238338d = appBrandRuntimeWC;
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d8 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r12 = this;
            com.tencent.mm.plugin.appbrand.l$e r0 = com.tencent.p014mm.plugin.appbrand.C83231l.C83235e.CLOSE
            com.tencent.mm.plugin.appbrand.l$e r1 = com.tencent.p014mm.plugin.appbrand.C83231l.C83235e.BACK
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = r12.f238338d
            qp0.d r3 = r2.f238293u1
            r4 = 2
            r5 = 1
            r6 = 0
            java.lang.String r7 = "close, result:%s"
            java.lang.String r8 = "close, runtime:%s"
            if (r3 == 0) goto L_0x0046
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.String r10 = r2.f238147j
            r9[r6] = r10
            java.lang.String r10 = "MicroMsg.AppBrandMultiTaskLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r8, r9)
            java.lang.String r2 = r2.f238147j
            com.tencent.mm.plugin.appbrand.l$e r2 = com.tencent.p014mm.plugin.appbrand.C83231l.m102143d(r2)
            if (r2 != r1) goto L_0x0026
            r2 = 2
            goto L_0x002b
        L_0x0026:
            if (r2 != r0) goto L_0x002a
            r2 = 1
            goto L_0x002b
        L_0x002a:
            r2 = 0
        L_0x002b:
            qp0.b r3 = r3.f258168a
            if (r3 == 0) goto L_0x0037
            boolean r2 = r3.mo67896U(r2, r5)
            if (r2 == 0) goto L_0x0037
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r2)
            r3[r6] = r9
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r7, r3)
            if (r2 == 0) goto L_0x0046
            return
        L_0x0046:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r2 = r12.f238338d
            com.tencent.mm.plugin.appbrand.floatball.i r3 = r2.f238292t1
            if (r3 == 0) goto L_0x00d9
            java.lang.Object[] r9 = new java.lang.Object[r5]
            java.lang.String r10 = r2.f238147j
            r9[r6] = r10
            java.lang.String r10 = "MicroMsg.AppBrandFloatBallLogic"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r8, r9)
            java.lang.String r8 = r2.f238147j
            com.tencent.mm.plugin.appbrand.l$e r8 = com.tencent.p014mm.plugin.appbrand.C83231l.m102143d(r8)
            if (r8 != r1) goto L_0x0061
            r0 = 2
            goto L_0x0066
        L_0x0061:
            if (r8 != r0) goto L_0x0065
            r0 = 1
            goto L_0x0066
        L_0x0065:
            r0 = 0
        L_0x0066:
            com.tencent.mm.plugin.appbrand.floatball.l r1 = r3.f240137d
            if (r1 == 0) goto L_0x0072
            boolean r1 = r1.mo114259F0()
            if (r1 == 0) goto L_0x0072
            r1 = 1
            goto L_0x0073
        L_0x0072:
            r1 = 0
        L_0x0073:
            com.tencent.mm.plugin.appbrand.floatball.m r8 = r3.f240138e
            if (r8 == 0) goto L_0x0090
            com.tencent.mm.sdk.platformtools.MultiProcessMMKV r9 = com.tencent.p014mm.sdk.platformtools.MultiProcessMMKV.getDefault()
            java.lang.String r11 = "has_shown_appbrand_voip_1v1_tip"
            boolean r9 = r9.decodeBool(r11, r6)
            boolean r8 = r8.mo90541w()
            if (r8 == 0) goto L_0x008b
            if (r9 != 0) goto L_0x008b
            r8 = 1
            goto L_0x008c
        L_0x008b:
            r8 = 0
        L_0x008c:
            if (r8 == 0) goto L_0x0090
            r8 = 1
            goto L_0x0091
        L_0x0090:
            r8 = 0
        L_0x0091:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r1)
            r4[r6] = r9
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)
            r4[r5] = r9
            java.lang.String r9 = "close, voip:%s, voip1v1:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r9, r4)
            if (r1 == 0) goto L_0x00b5
            com.tencent.mm.plugin.appbrand.floatball.l r1 = r3.f240137d
            android.app.Activity r2 = r2.mo113026R()
            com.tencent.mm.plugin.appbrand.floatball.g r4 = new com.tencent.mm.plugin.appbrand.floatball.g
            r4.<init>(r3, r0)
            r1.mo114260G0(r2, r4)
            goto L_0x00d6
        L_0x00b5:
            if (r8 == 0) goto L_0x00c6
            com.tencent.mm.plugin.appbrand.floatball.m r1 = r3.f240138e
            android.app.Activity r2 = r2.mo113026R()
            com.tencent.mm.plugin.appbrand.floatball.h r4 = new com.tencent.mm.plugin.appbrand.floatball.h
            r4.<init>(r3, r0)
            r1.mo114265F0(r2, r4)
            goto L_0x00d6
        L_0x00c6:
            boolean r0 = r3.mo114250a(r0)
            java.lang.Object[] r1 = new java.lang.Object[r5]
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r1[r6] = r2
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r7, r1)
            r5 = r0
        L_0x00d6:
            if (r5 == 0) goto L_0x00d9
            return
        L_0x00d9:
            com.tencent.mm.plugin.appbrand.AppBrandRuntimeWC r0 = r12.f238338d
            r0.mo113172C1()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.appbrand.AppBrandRuntimeWC$$t.run():void");
    }
}
