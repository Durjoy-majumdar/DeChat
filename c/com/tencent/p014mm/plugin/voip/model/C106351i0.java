package com.tencent.p014mm.plugin.voip.model;

/* renamed from: com.tencent.mm.plugin.voip.model.i0 */
public class C106351i0 implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ int f317364d;

    /* renamed from: e */
    public final /* synthetic */ long f317365e;

    /* renamed from: f */
    public final /* synthetic */ boolean f317366f;

    /* renamed from: g */
    public final /* synthetic */ C106350h0 f317367g;

    public C106351i0(C106350h0 h0Var, int i, long j, boolean z) {
        this.f317367g = h0Var;
        this.f317364d = i;
        this.f317365e = j;
        this.f317366f = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005c, code lost:
        if (r1.mo152525k(r11.f317366f) != false) goto L_0x00f2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r11 = this;
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r2 = r11.f317364d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            long r4 = r11.f317365e
            java.lang.Long r2 = java.lang.Long.valueOf(r4)
            r4 = 1
            r1[r4] = r2
            java.lang.String r2 = "MicroMsg.Voip.VoipService"
            java.lang.String r5 = "onDelayInvite, roomId:%s, roomKey:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r5, r1)
            boolean r1 = p645pj.C77091b.m93035q()
            if (r1 != 0) goto L_0x0031
            com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            com.tencent.mm.app.AppForegroundDelegate r1 = com.tencent.p014mm.app.AppForegroundDelegate.INSTANCE
            boolean r1 = r1.f343454n
            if (r1 != 0) goto L_0x0031
            java.lang.String r0 = "background now and notification Is closed."
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r0)
            return
        L_0x0031:
            com.tencent.mm.plugin.voip.model.h0 r1 = r11.f317367g
            com.tencent.mm.plugin.voip.model.m0 r1 = r1.f317332a
            boolean r1 = r1.mo152663h()
            if (r1 == 0) goto L_0x00f2
            com.tencent.mm.plugin.voip.model.h0 r1 = r11.f317367g
            com.tencent.mm.plugin.voip.model.m0 r5 = r1.f317332a
            com.tencent.mm.plugin.voip.model.r r5 = r5.f317396a
            int r5 = r5.f317476a
            r6 = 5
            if (r5 < r6) goto L_0x0048
            r5 = 1
            goto L_0x0049
        L_0x0048:
            r5 = 0
        L_0x0049:
            if (r5 == 0) goto L_0x005e
            com.tencent.mm.plugin.voip.model.VoipIncomingCallManager r1 = r1.f317357z
            te3.yu4 r5 = r1.f317150o
            if (r5 == 0) goto L_0x0053
            r5 = 1
            goto L_0x0054
        L_0x0053:
            r5 = 0
        L_0x0054:
            if (r5 != 0) goto L_0x005e
            boolean r5 = r11.f317366f
            boolean r1 = r1.mo152525k(r5)
            if (r1 != 0) goto L_0x00f2
        L_0x005e:
            java.lang.String r1 = "room is ready, ingore the msg and ack busy"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            com.tencent.mm.plugin.voip.model.h0 r1 = r11.f317367g
            com.tencent.mm.plugin.voip.model.m0 r1 = r1.f317332a
            int r1 = r1.mo152659e()
            int r5 = r11.f317364d
            if (r1 == r5) goto L_0x00f1
            com.tencent.mm.plugin.voip.model.h0 r1 = r11.f317367g
            com.tencent.mm.plugin.voip.model.m0 r1 = r1.f317332a
            long r5 = r1.mo152660f()
            long r7 = r11.f317365e
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00f1
            com.tencent.mm.plugin.voip.model.h0 r1 = r11.f317367g
            com.tencent.mm.plugin.voip.model.VoipIncomingCallManager r1 = r1.f317357z
            te3.yu4 r1 = r1.f317150o
            if (r1 == 0) goto L_0x0088
            int r5 = r1.f145520d
            goto L_0x0089
        L_0x0088:
            r5 = 0
        L_0x0089:
            int r6 = r11.f317364d
            if (r5 == r6) goto L_0x00f1
            if (r1 == 0) goto L_0x0092
            long r9 = r1.f145521e
            goto L_0x0094
        L_0x0092:
            r9 = 0
        L_0x0094:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x00f1
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r1[r3] = r5
            long r5 = r11.f317365e
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r1[r4] = r3
            com.tencent.mm.plugin.voip.model.h0 r3 = r11.f317367g
            com.tencent.mm.plugin.voip.model.m0 r3 = r3.f317332a
            int r3 = r3.mo152659e()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1[r0] = r3
            r0 = 3
            com.tencent.mm.plugin.voip.model.h0 r3 = r11.f317367g
            com.tencent.mm.plugin.voip.model.m0 r3 = r3.f317332a
            long r3 = r3.mo152660f()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1[r0] = r3
            java.lang.String r0 = "not match current room id and roomkey: %s %s %s %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r0, r1)
            com.tencent.mm.plugin.voip.model.h0 r0 = r11.f317367g
            com.tencent.mm.plugin.voip.model.m0 r1 = r0.f317332a
            int r2 = r11.f317364d
            long r3 = r11.f317365e
            r5 = 2
            r6 = 0
            r7 = 0
            java.lang.String r8 = r0.f317338g
            r1.mo152658d(r2, r3, r5, r6, r7, r8)
            com.tencent.mm.plugin.voip.model.h0 r0 = r11.f317367g
            com.tencent.mm.plugin.voip.model.VoipIncomingCallManager r0 = r0.f317357z
            r1 = 9
            te3.yu4 r2 = new te3.yu4
            r2.<init>()
            int r3 = r11.f317364d
            r2.f145520d = r3
            long r3 = r11.f317365e
            r2.f145521e = r3
            r0.mo152521G(r1, r2)
        L_0x00f1:
            return
        L_0x00f2:
            s33.e r1 = new s33.e
            int r5 = r11.f317364d
            long r6 = r11.f317365e
            java.lang.String r8 = ""
            r1.<init>(r5, r6, r8)
            r1.mo88544n1()
            java.lang.Object[] r1 = new java.lang.Object[r0]
            int r5 = r11.f317364d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r1[r3] = r5
            long r5 = r11.f317365e
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r1[r4] = r3
            java.lang.String r3 = "onDelayInvite, send getroominfo cgi done! roomId:%d, roomKey:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r2, r3, r1)
            com.tencent.mm.plugin.voip.model.h0 r1 = r11.f317367g
            boolean r1 = r1.f317352u
            if (r1 != 0) goto L_0x0128
            int r1 = r11.f317364d
            long r2 = r11.f317365e
            z33.C112597j.m153945j(r1, r2, r4, r0)
            com.tencent.mm.plugin.voip.model.h0 r0 = r11.f317367g
            r0.f317352u = r4
        L_0x0128:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.model.C106351i0.run():void");
    }
}
