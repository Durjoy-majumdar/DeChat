package p697tm;

import com.tencent.p014mm.autogen.events.AppBrandOuterMenuClickReportEvent;
import com.tencent.p014mm.sdk.event.IStaticListener;

/* renamed from: tm.o0 */
public class C90524o0 extends IStaticListener<AppBrandOuterMenuClickReportEvent> {
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean callback(com.tencent.p014mm.sdk.event.IEvent r40) {
        /*
            r39 = this;
            r0 = r40
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent r0 = (com.tencent.p014mm.autogen.events.AppBrandOuterMenuClickReportEvent) r0
            boolean r1 = f40.C86709a0.m107522a()
            r2 = 0
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            if (r1 != 0) goto L_0x0011
            goto L_0x01c1
        L_0x0011:
            com.tencent.mm.autogen.events.AppBrandOuterMenuClickReportEvent$a r0 = r0.f236137d
            java.lang.String r1 = r0.f236138a
            java.lang.String r5 = r0.f236139b
            int r6 = r0.f236140c
            int r7 = r0.f236142e
            int r8 = r0.f236141d
            java.lang.String r9 = r0.f236143f
            java.lang.String r10 = r0.f236144g
            int r11 = r0.f236145h
            java.lang.String r12 = r0.f236146i
            long r13 = r0.f236147j
            int r15 = r0.f236148k
            java.lang.String r4 = r0.f236150m
            java.lang.String r2 = "MicroMsg.AppBrandReporterManager"
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r1)
            if (r0 == 0) goto L_0x0036
            r8 = 1
            goto L_0x01c0
        L_0x0036:
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            r17 = r3
            java.lang.String r3 = ""
            r18 = 5
            if (r0 != 0) goto L_0x0059
            java.lang.String r0 = ".html"
            boolean r19 = r10.contains(r0)
            if (r19 == 0) goto L_0x0059
            int r0 = r10.lastIndexOf(r0)
            int r0 = r0 + 5
            r19 = r15
            r15 = 0
            java.lang.String r0 = r10.substring(r15, r0)
            r10 = r0
            goto L_0x005c
        L_0x0059:
            r19 = r15
            r10 = r3
        L_0x005c:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r10)     // Catch:{ UnsupportedEncodingException -> 0x0069 }
            java.lang.String r15 = "UTF-8"
            java.lang.String r0 = p206nj.C117627q.m165909b(r0, r15)     // Catch:{ UnsupportedEncodingException -> 0x0069 }
            r20 = r13
            goto L_0x0078
        L_0x0069:
            r0 = move-exception
            java.lang.String r15 = "encode page path error!"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r2, r15)
            r20 = r13
            r15 = 0
            java.lang.Object[] r13 = new java.lang.Object[r15]
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r2, r0, r3, r13)
            r0 = r3
        L_0x0078:
            java.lang.String r9 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r9)
            java.lang.String r12 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r12)
            java.lang.String r13 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            int r5 = com.tencent.p014mm.plugin.appbrand.report.C84240s.m103839e(r5)
            if (r7 > 0) goto L_0x008d
            r24 = r3
            goto L_0x00aa
        L_0x008d:
            int r15 = r7 + -1
            com.tencent.p014mm.plugin.appbrand.app.C81161g2.requireAccountInitializedOnDemand()
            com.tencent.mm.plugin.appbrand.appusage.l0 r14 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.f238473i
            boolean r14 = r14.mo56638Lo(r1, r15)
            r24 = r3
            com.tencent.mm.plugin.appbrand.appusage.i0 r3 = com.tencent.p014mm.plugin.appbrand.app.C81161g2.Ax0()
            boolean r1 = r3.mo113793bD(r1, r15)
            if (r1 == 0) goto L_0x00a6
            r1 = 1
            goto L_0x00ab
        L_0x00a6:
            if (r14 == 0) goto L_0x00aa
            r1 = 2
            goto L_0x00ab
        L_0x00aa:
            r1 = 3
        L_0x00ab:
            com.tencent.mm.plugin.appbrand.jsapi.share.i0 r3 = com.tencent.p014mm.plugin.appbrand.jsapi.share.C82972j0.m101771a(r4)
            if (r3 != 0) goto L_0x00b3
            r15 = 0
            goto L_0x00b6
        L_0x00b3:
            int r14 = r3.f242601b
            r15 = r14
        L_0x00b6:
            if (r3 != 0) goto L_0x00bb
            r14 = r24
            goto L_0x00bd
        L_0x00bb:
            java.lang.String r14 = r3.f242602c
        L_0x00bd:
            java.lang.String r14 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r14)
            if (r3 != 0) goto L_0x00c8
            r25 = r0
            r0 = r24
            goto L_0x00cc
        L_0x00c8:
            r25 = r0
            java.lang.String r0 = r3.f242603d
        L_0x00cc:
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r0)
            java.lang.String r0 = p206nj.C117627q.m165908a(r0)
            if (r3 != 0) goto L_0x00d9
            r3 = r24
            goto L_0x00db
        L_0x00d9:
            java.lang.String r3 = r3.f242604e
        L_0x00db:
            java.lang.String r3 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r3)
            java.lang.String r3 = p206nj.C117627q.m165908a(r3)
            r24 = r2
            r2 = 19
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r26 = r3
            r3 = 13540(0x34e4, float:1.8974E-41)
            java.lang.Integer r27 = java.lang.Integer.valueOf(r3)
            r16 = 0
            r2[r16] = r27
            java.lang.Integer r27 = java.lang.Integer.valueOf(r8)
            r28 = 1
            r2[r28] = r27
            r23 = 2
            r2[r23] = r9
            r22 = 3
            r2[r22] = r13
            java.lang.Integer r27 = java.lang.Integer.valueOf(r6)
            r28 = 4
            r2[r28] = r27
            java.lang.Integer r27 = java.lang.Integer.valueOf(r7)
            r2[r18] = r27
            java.lang.Integer r27 = java.lang.Integer.valueOf(r1)
            r29 = 6
            r2[r29] = r27
            r27 = 7
            r2[r27] = r10
            java.lang.Integer r10 = java.lang.Integer.valueOf(r11)
            r30 = 8
            r2[r30] = r10
            r10 = 9
            r2[r10] = r12
            java.lang.Long r31 = java.lang.Long.valueOf(r20)
            r32 = 10
            r2[r32] = r31
            java.lang.Integer r31 = java.lang.Integer.valueOf(r19)
            r33 = 11
            r2[r33] = r31
            r31 = 12
            r2[r31] = r17
            java.lang.Integer r34 = java.lang.Integer.valueOf(r5)
            r35 = 13
            r2[r35] = r34
            r34 = 14
            r2[r34] = r4
            java.lang.Integer r36 = java.lang.Integer.valueOf(r15)
            r37 = 15
            r2[r37] = r36
            r36 = 16
            r2[r36] = r14
            r38 = 17
            r2[r38] = r0
            r3 = 18
            r2[r3] = r26
            java.lang.String r10 = "stev report(%s), scene : %d, sceneNote %s, appid %s, appversion %d, appState %d, usedState %d, pagePath %s, action %d, actionNote %s,actionTime %s, actionResult %d, actionErrorcode %d, appType %d,shareActionId:%s, shareActionType:%d, shareTitle:%s, sharePath:%s, shareImgUrl:%s"
            r3 = r24
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r3, r10, r2)
            com.tencent.mm.plugin.report.service.n r2 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r3 = 18
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10 = 0
            r3[r10] = r8
            r8 = 1
            r3[r8] = r9
            r9 = 2
            r3[r9] = r13
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r9 = 3
            r3[r9] = r6
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            r3[r28] = r6
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3[r18] = r1
            r3[r29] = r25
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r3[r27] = r1
            r3[r30] = r12
            java.lang.Long r1 = java.lang.Long.valueOf(r20)
            r6 = 9
            r3[r6] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
            r3[r32] = r1
            r3[r33] = r17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            r3[r31] = r1
            r3[r35] = r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r3[r34] = r1
            r3[r37] = r14
            r3[r36] = r0
            r3[r38] = r26
            r0 = 13540(0x34e4, float:1.8974E-41)
            r2.mo160131h(r0, r3)
        L_0x01c0:
            r2 = 1
        L_0x01c1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p697tm.C90524o0.callback(com.tencent.mm.sdk.event.IEvent):boolean");
    }
}
