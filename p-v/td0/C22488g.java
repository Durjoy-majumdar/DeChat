package td0;

import gy3.C87412m;
import java.util.HashSet;
import rd0.C22222c;

/* renamed from: td0.g */
public final class C22488g {

    /* renamed from: a */
    public final HashSet<String> f63683a = new HashSet<>();

    /* renamed from: b */
    public C22222c f63684b;

    public C22488g(C22222c cVar) {
        C87412m.m108594g(cVar, "service");
        this.f63684b = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b4  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35628a(com.tencent.p014mm.msgsubscription.SubscribeMsgTmpItem r10, td0.C22478a.C22479b r11) {
        /*
            r9 = this;
            r0 = 0
            java.lang.String r1 = "MicroMsg.SubscribeMsgUpdateStrategy"
            r2 = 1
            r3 = 0
            if (r10 == 0) goto L_0x0026
            long r4 = r10.f49027o
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x0010
            goto L_0x0026
        L_0x0010:
            long r6 = java.lang.System.currentTimeMillis()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x0024
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = r10.f49021f
            r4[r3] = r5
            java.lang.String r5 = "alvinluo checkSubscribeStatusNeedUpdate updateTimestamp expired and do update, templateId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r4)
            goto L_0x0035
        L_0x0024:
            r4 = 0
            goto L_0x0036
        L_0x0026:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            if (r10 == 0) goto L_0x002d
            java.lang.String r5 = r10.f49021f
            goto L_0x002e
        L_0x002d:
            r5 = r0
        L_0x002e:
            r4[r3] = r5
            java.lang.String r5 = "alvinluo checkSubscribeStatusNeedUpdate first time and do update templateId: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r1, r5, r4)
        L_0x0035:
            r4 = 1
        L_0x0036:
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            if (r10 == 0) goto L_0x0041
            long r6 = r10.f49027o
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
        L_0x0041:
            r5[r3] = r0
            long r6 = java.lang.System.currentTimeMillis()
            java.lang.Long r10 = java.lang.Long.valueOf(r6)
            r5[r2] = r10
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r4)
            r0 = 2
            r5[r0] = r10
            java.lang.String r10 = "alvinluo checkSubscribeStatusNeedUpdate updateTimestamp: %s, now: %s, needUpdate: %b"
            com.tencent.p014mm.sdk.platformtools.Log.m105927v(r1, r10, r5)
            java.lang.String r10 = "MicroMsg.SubscribeStatusUpdateManager"
            if (r4 == 0) goto L_0x00b4
            java.util.HashSet<java.lang.String> r1 = r9.f63683a
            java.lang.String r4 = r11.f63662b
            boolean r1 = r1.contains(r4)
            if (r1 == 0) goto L_0x0073
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r11 = r11.f63662b
            r0[r3] = r11
            java.lang.String r11 = "alvinluo updateSubscribeStatus templateId: %s is updating"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r11, r0)
            goto L_0x00b9
        L_0x0073:
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r11.f63662b
            r0[r3] = r1
            java.lang.String r1 = r11.f63661a
            r0[r2] = r1
            java.lang.String r1 = "alvinluo doUpdateSubscribeStatus templateId: %s, bizUsername: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r10, r1, r0)
            java.util.HashSet<java.lang.String> r10 = r9.f63683a
            java.lang.String r0 = r11.f63662b
            r10.add(r0)
            rd0.c r10 = r9.f63684b
            if (r10 == 0) goto L_0x00a1
            java.lang.String r0 = r11.f63661a
            java.lang.String[] r1 = new java.lang.String[r2]
            java.lang.String r2 = r11.f63662b
            r1[r3] = r2
            java.util.List r1 = sx3.C64197v.m75539h(r1)
            td0.d r2 = new td0.d
            r2.<init>(r9, r11)
            r10.mo35377r(r0, r1, r2)
        L_0x00a1:
            java.lang.String r10 = r11.f63661a
            java.lang.String r11 = r11.f63662b
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 30000(0x7530, double:1.4822E-319)
            long r0 = r0 + r2
            rd0.c r2 = r9.f63684b
            if (r2 == 0) goto L_0x00b9
            r2.mo35364e(r10, r11, r0)
            goto L_0x00b9
        L_0x00b4:
            java.lang.String r11 = "alvinluo updateSubscribeStatusIfNecessary no need to update"
            com.tencent.p014mm.sdk.platformtools.Log.m105926v(r10, r11)
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: td0.C22488g.mo35628a(com.tencent.mm.msgsubscription.SubscribeMsgTmpItem, td0.a$b):void");
    }
}
