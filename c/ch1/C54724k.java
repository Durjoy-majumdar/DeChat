package ch1;

import fj1.C45795b;
import gy3.C87412m;
import yg1.C66639f;

/* renamed from: ch1.k */
public class C54724k extends C66639f {

    /* renamed from: a */
    public final C45795b f153366a;

    /* renamed from: b */
    public final String f153367b = "LiveMsgRespLiveExtInfoInterceptor";

    public C54724k(C45795b bVar) {
        C87412m.m108594g(bVar, "liveContext");
        this.f153366a = bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0088  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo49b(yg1.C39014a.C39015a r17) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            java.lang.String r3 = "respWrapper"
            gy3.C87412m.m108594g(r0, r3)
            te3.ao0 r0 = r0.f105072a
            r3 = 1
            if (r0 == 0) goto L_0x019b
            te3.c21 r0 = r0.f130678f
            if (r0 == 0) goto L_0x019b
            te3.dy0 r0 = r0.f182399n
            if (r0 == 0) goto L_0x019b
            pe3.b r0 = r0.f132564d
            if (r0 == 0) goto L_0x019b
            te3.oo2 r4 = new te3.oo2
            r4.<init>()
            byte[] r0 = r0.f257327a
            r5 = 0
            if (r0 != 0) goto L_0x0028
        L_0x0026:
            r4 = 0
            goto L_0x003a
        L_0x0028:
            r4.parseFrom(r0)     // Catch:{ Exception -> 0x002c }
            goto L_0x003a
        L_0x002c:
            r0 = move-exception
            r4 = r0
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r5] = r4
            java.lang.String r4 = "safeParser"
            java.lang.String r7 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r4, r7, r0)
            goto L_0x0026
        L_0x003a:
            java.lang.String r0 = r1.f153367b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "anchorStatusFlag:"
            r7.append(r8)
            if (r4 == 0) goto L_0x004f
            long r8 = r4.f139284e
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            goto L_0x0050
        L_0x004f:
            r8 = 0
        L_0x0050:
            r7.append(r8)
            java.lang.String r8 = " micSetting:"
            r7.append(r8)
            if (r4 == 0) goto L_0x0065
            te3.ww2 r8 = r4.f139286g
            if (r8 == 0) goto L_0x0065
            long r8 = r8.f144323d
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            goto L_0x0066
        L_0x0065:
            r8 = 0
        L_0x0066:
            r7.append(r8)
            java.lang.String r8 = " micSettingSwitch:"
            r7.append(r8)
            if (r4 == 0) goto L_0x007b
            te3.ww2 r8 = r4.f139286g
            if (r8 == 0) goto L_0x007b
            long r8 = r8.f144324e
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            goto L_0x007c
        L_0x007b:
            r8 = 0
        L_0x007c:
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r7)
            if (r4 == 0) goto L_0x019b
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            boolean r7 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159380h
            if (r7 == 0) goto L_0x00ea
            fj1.b r7 = r1.f153366a
            long r8 = r4.f139288i
            r10 = 0
            if (r7 == 0) goto L_0x00a2
            androidx.lifecycle.i0 r12 = r7.mo71262a(r2)
            cl1.o r12 = (cl1.C54991o) r12
            long r12 = r12.f154349p
            goto L_0x00a3
        L_0x00a2:
            r12 = r10
        L_0x00a3:
            java.lang.String r14 = r1.f153367b
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r6 = "canRefreshAnchorStatus: remoteAnchorStatusVersion:"
            r15.append(r6)
            r15.append(r8)
            java.lang.String r6 = ", localVersion:"
            r15.append(r6)
            r15.append(r12)
            java.lang.String r6 = r15.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r6)
            int r6 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r6 <= 0) goto L_0x00cb
            int r6 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x00cb
            r6 = 1
            goto L_0x00cc
        L_0x00cb:
            r6 = 0
        L_0x00cc:
            if (r6 == 0) goto L_0x00dd
            if (r7 == 0) goto L_0x00d7
            androidx.lifecycle.i0 r7 = r7.mo71262a(r2)
            cl1.o r7 = (cl1.C54991o) r7
            goto L_0x00d8
        L_0x00d7:
            r7 = 0
        L_0x00d8:
            if (r7 != 0) goto L_0x00db
            goto L_0x00dd
        L_0x00db:
            r7.f154349p = r8
        L_0x00dd:
            if (r6 == 0) goto L_0x00e0
            goto L_0x00ea
        L_0x00e0:
            java.lang.String r0 = r1.f153367b
            java.lang.String r2 = "skip anchor status refresh"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r0, r2)
            goto L_0x019b
        L_0x00ea:
            fj1.b r6 = r1.f153366a
            long r7 = r4.f139284e
            java.lang.String r9 = r1.f153367b
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "[heartbeat] checkAnchorStatus isAnchor:"
            r10.append(r11)
            r0.getClass()
            boolean r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159380h
            r10.append(r0)
            java.lang.String r0 = " remoteAnchorStatus:"
            r10.append(r0)
            r10.append(r7)
            java.lang.String r0 = " localAnchorStatus:"
            r10.append(r0)
            if (r6 == 0) goto L_0x011e
            androidx.lifecycle.i0 r0 = r6.mo71262a(r2)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154354q
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x011f
        L_0x011e:
            r0 = 0
        L_0x011f:
            r10.append(r0)
            java.lang.String r0 = ", filterAnchorExtFlag:"
            r10.append(r0)
            boolean r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159357J
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r10)
            if (r6 == 0) goto L_0x0190
            if (r0 != 0) goto L_0x0190
            boolean r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159380h
            if (r0 != 0) goto L_0x0190
            androidx.lifecycle.i0 r0 = r6.mo71262a(r2)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154354q
            long r9 = (long) r0
            int r0 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0190
            androidx.lifecycle.i0 r0 = r6.mo71262a(r2)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154354q
            r9 = 2
            boolean r0 = o40.C61926c.m72696u(r0, r9)
            if (r0 != 0) goto L_0x016d
            int r0 = (int) r7
            boolean r0 = o40.C61926c.m72696u(r0, r9)
            if (r0 == 0) goto L_0x016d
            java.lang.String r0 = r1.f153367b
            java.lang.String r6 = "[heartbeat] checkAnchorStatus anchor CALL_INTERRUPTION:true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            y50.h r0 = y50.C66521k0.f191361a
            if (r0 == 0) goto L_0x0190
            r0.onAnchorCallInterruption(r3)
            goto L_0x0190
        L_0x016d:
            androidx.lifecycle.i0 r0 = r6.mo71262a(r2)
            cl1.o r0 = (cl1.C54991o) r0
            int r0 = r0.f154354q
            boolean r0 = o40.C61926c.m72696u(r0, r9)
            if (r0 == 0) goto L_0x0190
            int r0 = (int) r7
            boolean r0 = o40.C61926c.m72696u(r0, r9)
            if (r0 != 0) goto L_0x0190
            java.lang.String r0 = r1.f153367b
            java.lang.String r6 = "[heartbeat] checkAnchorStatus anchor CALL_INTERRUPTION:false"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            y50.h r0 = y50.C66521k0.f191361a
            if (r0 == 0) goto L_0x0190
            r0.onAnchorCallInterruption(r5)
        L_0x0190:
            fj1.b r0 = r1.f153366a
            androidx.lifecycle.i0 r0 = r0.mo71262a(r2)
            cl1.o r0 = (cl1.C54991o) r0
            r0.mo75968K4(r4, r5)
        L_0x019b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ch1.C54724k.mo49b(yg1.a$a):boolean");
    }
}
