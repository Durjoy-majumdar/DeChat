package com.tencent.p014mm.plugin.voip.p475ui;

import com.tencent.p014mm.sdk.platformtools.MTimerHandler;

/* renamed from: com.tencent.mm.plugin.voip.ui.l */
public class C106463l implements MTimerHandler.CallBack {

    /* renamed from: d */
    public final /* synthetic */ NewVoipVideoFragment f318007d;

    public C106463l(NewVoipVideoFragment newVoipVideoFragment) {
        this.f318007d = newVoipVideoFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0053  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTimerExpired() {
        /*
            r6 = this;
            com.tencent.mm.plugin.voip.ui.NewVoipVideoFragment r0 = r6.f318007d
            boolean r1 = r0.f317841k1
            r2 = 0
            if (r1 == 0) goto L_0x006e
            r0.getClass()
            com.tencent.mm.plugin.voip.model.h0 r1 = l33.C109247e.xx0()
            r1.getClass()
            r3 = 1
            com.tencent.mm.plugin.voip.model.m0 r1 = r1.f317332a     // Catch:{ Exception -> 0x0022 }
            com.tencent.mm.plugin.voip.model.r r1 = r1.f317396a     // Catch:{ Exception -> 0x0022 }
            com.tencent.mm.plugin.voip.model.v2protocal r1 = r1.f317500x     // Catch:{ Exception -> 0x0022 }
            if (r1 == 0) goto L_0x003d
            int r1 = r1.f317579K0     // Catch:{ Exception -> 0x0022 }
            r1 = r1 & 8
            if (r1 == 0) goto L_0x003d
            r1 = 1
            goto L_0x003e
        L_0x0022:
            r1 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "steve:cannot get CPU usage! error: "
            r4.append(r5)
            java.lang.String r1 = r1.getMessage()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.String r4 = "MicroMsg.Voip.VoipService"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r1)
        L_0x003d:
            r1 = 0
        L_0x003e:
            int r4 = r0.f317838h1
            int r5 = r4 + 1
            r0.f317838h1 = r5
            int r4 = r4 % 5
            if (r4 != 0) goto L_0x006d
            if (r1 == 0) goto L_0x006d
            gj.s r1 = p156gj.C107835h0.f322857n
            r1.mo158251c()
            gj.s$a r1 = r1.f322924b
            if (r1 == 0) goto L_0x0055
            int r2 = r1.f322926a
        L_0x0055:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "devincdai: cpu_usage = "
            r1.append(r4)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "MicroMsg.Voip.VoipVideoFragment"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r4, r1)
            r0.f317839i1 = r2
        L_0x006d:
            return r3
        L_0x006e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.voip.p475ui.C106463l.onTimerExpired():boolean");
    }
}
