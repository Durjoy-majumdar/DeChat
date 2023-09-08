package com.tencent.p014mm.plugin.sns.statistics;

import fy3.C32224a;
import gy3.C87413o;
import java.util.List;
import vr2.C102270y;

/* renamed from: com.tencent.mm.plugin.sns.statistics.n */
public final class C57359n extends C87413o implements C32224a<Object> {

    /* renamed from: d */
    public final /* synthetic */ List<C102270y> f164341d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C57359n(List<? extends C102270y> list) {
        super(0);
        this.f164341d = list;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r11 = this;
            java.lang.String r0 = "invoke"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion$setMediaSource$1"
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = ""
            r2.<init>(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.util.List<vr2.y> r5 = r11.f164341d
            java.util.Iterator r5 = r5.iterator()
            r6 = 0
        L_0x001a:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x0083
            java.lang.Object r7 = r5.next()
            vr2.y r7 = (vr2.C102270y) r7
            boolean r8 = r7.f301227n
            if (r8 != 0) goto L_0x003c
            com.tencent.mm.plugin.sns.statistics.l$a r8 = com.tencent.p014mm.plugin.sns.statistics.C57354l.f164333a
            java.lang.String r9 = r7.f301214a
            java.lang.String r10 = "it.path"
            gy3.C87412m.m108593f(r9, r10)
            boolean r8 = r8.mo80973j(r9)
            if (r8 == 0) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            r8 = 2
            goto L_0x003f
        L_0x003c:
            int r6 = r6 + 1
            r8 = 1
        L_0x003f:
            java.lang.String r9 = r2.toString()
            boolean r9 = gy3.C87412m.m108589b(r9, r3)
            if (r9 == 0) goto L_0x0056
            r2.append(r8)
            java.lang.String r7 = r7.f301214a
            java.lang.String r7 = p823sg.C90193h.m112876d(r7)
            r4.append(r7)
            goto L_0x001a
        L_0x0056:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r10 = 35
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r2.append(r8)
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r10)
            java.lang.String r7 = r7.f301214a
            java.lang.String r7 = p823sg.C90193h.m112876d(r7)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            r4.append(r7)
            goto L_0x001a
        L_0x0083:
            k21.c$a r3 = k21.C60960c.f173618a
            java.lang.String r2 = r2.toString()
            java.lang.String r5 = "mediaSource.toString()"
            gy3.C87412m.m108593f(r2, r5)
            java.lang.String r5 = "SnsPublishProcess"
            java.lang.String r7 = "mediaSource_"
            r3.mo85926j(r5, r7, r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.String r6 = "endSessionShotMedia"
            r3.mo85926j(r5, r6, r2)
            java.util.List<vr2.y> r2 = r11.f164341d
            int r2 = r2.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r6 = "endSessionMedia"
            r3.mo85926j(r5, r6, r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "md5.toString()"
            gy3.C87412m.m108593f(r2, r3)
            com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.sns.statistics.C57359n.invoke():java.lang.Object");
    }
}
