package com.tencent.p014mm.pluginsdk.model;

import di3.C86312j;
import gy3.C87412m;
import p654pw.C100972d;
import te3.C77915dp3;
import z04.C112551y;

/* renamed from: com.tencent.mm.pluginsdk.model.k0 */
public final class C96785k0 {
    /* renamed from: a */
    public static final C77915dp3 m124244a(String str) {
        C87412m.m108594g(str, "xml");
        return ((C100972d) C86312j.m106911c(C100972d.class)).f90(C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(C112551y.m153814n(str, "cdn_dataurl", "cdndataurl", false), "cdn_datakey", "cdndatakey", false), "cdn_thumburl", "cdnthumburl", false), "cdn_thumbkey", "cdnthumbkey", false), "thumbfullsize", "thumbsize", false), "fullsize", "datasize", false), "datasrcname", "sourcename", false), "datasrctime", "sourcetime", false), "stream_lowbandurl", "streamlowbandurl", false), "stream_dataurl", "streamdataurl", false), "stream_weburl", "streamweburl", false));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0152 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final te3.C101801kd0 m124245b(java.lang.String r17, java.lang.String r18, long r19) {
        /*
            r1 = r18
            r2 = r19
            java.lang.Class<pw.d> r4 = p654pw.C100972d.class
            java.lang.String r0 = "recordInfo"
            r5 = r17
            gy3.C87412m.m108594g(r5, r0)
            java.lang.String r0 = "sourceIdPrefix"
            gy3.C87412m.m108594g(r1, r0)
            boolean r0 = pb1.C100734q.m131843d0()
            r6 = 0
            if (r0 != 0) goto L_0x001c
            return r6
        L_0x001c:
            te3.dp3 r0 = m124244a(r17)
            if (r0 == 0) goto L_0x015a
            te3.kd0 r5 = new te3.kd0
            r5.<init>()
            java.lang.String r7 = r0.f227153d
            r5.mo141220r(r7)
            java.lang.String r7 = r0.f227154e
            r5.mo141212j(r7)
            java.util.LinkedList<te3.rc0> r0 = r0.f227155f
            java.lang.String r7 = "recordMsgData.items"
            gy3.C87412m.m108593f(r0, r7)
            java.util.Iterator r7 = r0.iterator()
            r8 = 0
            r9 = 0
        L_0x003f:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0159
            java.lang.Object r0 = r7.next()
            int r10 = r9 + 1
            if (r9 < 0) goto L_0x0155
            te3.rc0 r0 = (te3.C101834rc0) r0
            te3.rc0 r11 = new te3.rc0
            r11.<init>()
            byte[] r0 = r0.toByteArray()
            r12 = 1
            if (r0 != 0) goto L_0x005d
        L_0x005b:
            r11 = r6
            goto L_0x0070
        L_0x005d:
            r11.parseFrom(r0)     // Catch:{ Exception -> 0x0061 }
            goto L_0x0070
        L_0x0061:
            r0 = move-exception
            r11 = r0
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r8] = r11
            java.lang.String r11 = "safeParser"
            java.lang.String r13 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r11, r13, r0)
            goto L_0x005b
        L_0x0070:
            if (r11 == 0) goto L_0x0152
            di3.d r0 = di3.C86312j.m106911c(r4)
            pw.d r0 = (p654pw.C100972d) r0
            java.lang.String r0 = r0.mo139625gn(r11, r2, r12)
            r11.f299286W = r0
            di3.d r0 = di3.C86312j.m106911c(r4)
            pw.d r0 = (p654pw.C100972d) r0
            java.lang.String r0 = r0.mo139627sJ(r11, r2, r12)
            r11.f299284V = r0
            long r13 = r11.f299336x0
            r15 = 0
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x0094
            r0 = 1
            goto L_0x0095
        L_0x0094:
            r0 = 0
        L_0x0095:
            r11.mo141232F(r0)
            long r13 = r11.f299276R
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 != 0) goto L_0x009f
            goto L_0x00a0
        L_0x009f:
            r12 = 0
        L_0x00a0:
            r11.mo141231E(r12)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            r12 = 36
            r0.append(r12)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            r11.mo141259o(r0)
            java.lang.String r0 = r11.f299280T
            if (r0 == 0) goto L_0x00c3
            int r0 = r0.length()
            goto L_0x00c4
        L_0x00c3:
            r0 = 0
        L_0x00c4:
            r9 = 16
            java.lang.String r12 = "MicroMsg.Fav.FavRecordInfoUtil"
            if (r0 >= r9) goto L_0x00f5
            java.lang.String r0 = r11.toString()
            r9 = 14
            java.lang.String r0 = pb1.C100745t.m131892d(r0, r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r13 = "change dataId from:"
            r9.append(r13)
            java.lang.String r13 = r11.f299280T
            r9.append(r13)
            java.lang.String r13 = " to "
            r9.append(r13)
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r9)
            r11.mo141257m(r0)
        L_0x00f5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r9 = "add favDataItem "
            r0.append(r9)
            java.lang.String r9 = r11.f299280T
            r0.append(r9)
            java.lang.String r9 = " notCheckThumb:"
            r0.append(r9)
            boolean r9 = r11.f299287W0
            r0.append(r9)
            java.lang.String r9 = " notCheckData:"
            r0.append(r9)
            boolean r9 = r11.f299283U0
            r0.append(r9)
            java.lang.String r9 = " dataType:"
            r0.append(r9)
            int r9 = r11.f299258I
            r0.append(r9)
            java.lang.String r9 = " dataSourceId:"
            r0.append(r9)
            java.lang.String r9 = r11.f299274Q0
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r0)
            int r0 = r11.f299258I
            r9 = 17
            if (r0 != r9) goto L_0x014d
            java.lang.String r0 = r11.f299326s1
            java.lang.String r9 = "favDataItem.recordInfo"
            gy3.C87412m.m108593f(r0, r9)
            java.lang.String r9 = r11.f299274Q0
            java.lang.String r12 = "favDataItem.dataSourceId"
            gy3.C87412m.m108593f(r9, r12)
            te3.kd0 r0 = m124245b(r0, r9, r2)
            r11.f299275Q1 = r0
        L_0x014d:
            java.util.LinkedList<te3.rc0> r0 = r5.f298618f
            r0.add(r11)
        L_0x0152:
            r9 = r10
            goto L_0x003f
        L_0x0155:
            sx3.C64197v.m75542k()
            throw r6
        L_0x0159:
            return r5
        L_0x015a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.pluginsdk.model.C96785k0.m124245b(java.lang.String, java.lang.String, long):te3.kd0");
    }
}
