package le1;

import com.tencent.p014mm.plugin.finder.feed.model.C2781d;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import je1.C9342n1;
import sx3.C36907w;
import te3.C51412tl1;
import te3.C64629pl1;
import up1.C37521f;

/* renamed from: le1.g */
public final class C10495g implements C10497i {
    /* renamed from: a */
    public boolean mo10786a(C2781d dVar, int i) {
        C87412m.m108594g(dVar, "loadedInfo");
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        r12 = r12.f141000f;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo10787b(com.tencent.p014mm.plugin.finder.feed.model.C2781d r27, int r28) {
        /*
            r26 = this;
            r0 = r27
            java.lang.String r1 = "loadedInfo"
            gy3.C87412m.m108594g(r0, r1)
            te3.tl1 r1 = r0.f13978o
            int r2 = r0.f13967d
            java.lang.String r3 = "Finder.HandleLayoutInfoInterceptor"
            r5 = 10
            r6 = 1
            r7 = 0
            if (r1 != 0) goto L_0x0016
            r1 = -1
            goto L_0x0106
        L_0x0016:
            java.util.LinkedList<te3.rl1> r8 = r1.f142275d
            if (r8 != 0) goto L_0x001c
            sx3.f0 r8 = sx3.C64186f0.f181907d
        L_0x001c:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r8.iterator()
        L_0x0025:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0081
            java.lang.Object r11 = r10.next()
            r12 = r11
            te3.rl1 r12 = (te3.C51124rl1) r12
            java.util.LinkedList<te3.pl1> r13 = r1.f142276e
            if (r13 == 0) goto L_0x0064
            java.util.Iterator r13 = r13.iterator()
        L_0x003a:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x0064
            java.lang.Object r14 = r13.next()
            te3.pl1 r14 = (te3.C64629pl1) r14
            int r15 = r14.f184847n
            if (r15 != r6) goto L_0x003a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "containLiveList "
            r13.append(r15)
            org.json.JSONObject r14 = o40.C61937h.m72709h(r14)
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r13)
            r13 = 1
            goto L_0x0065
        L_0x0064:
            r13 = 0
        L_0x0065:
            if (r13 != 0) goto L_0x007a
            int r12 = r12.f141000f
            r13 = 9
            if (r12 == r13) goto L_0x007a
            r13 = 8
            if (r12 == r13) goto L_0x007a
            if (r12 == r5) goto L_0x007a
            r13 = 11
            if (r12 != r13) goto L_0x0078
            goto L_0x007a
        L_0x0078:
            r12 = 0
            goto L_0x007b
        L_0x007a:
            r12 = 1
        L_0x007b:
            if (r12 == 0) goto L_0x0025
            r9.add(r11)
            goto L_0x0025
        L_0x0081:
            int r10 = r9.size()
            int r11 = r8.size()
            if (r10 == r11) goto L_0x0105
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0094:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x00ac
            java.lang.Object r11 = r8.next()
            r12 = r11
            te3.rl1 r12 = (te3.C51124rl1) r12
            boolean r12 = r9.contains(r12)
            r12 = r12 ^ r6
            if (r12 == 0) goto L_0x0094
            r10.add(r11)
            goto L_0x0094
        L_0x00ac:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "[checkValid] tabType="
            r8.append(r11)
            r8.append(r2)
            java.lang.String r2 = " inValidList="
            r8.append(r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r11 = sx3.C36907w.m41090l(r10, r5)
            r2.<init>(r11)
            java.util.Iterator r11 = r10.iterator()
        L_0x00cb:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00e1
            java.lang.Object r12 = r11.next()
            te3.rl1 r12 = (te3.C51124rl1) r12
            int r12 = r12.f141000f
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r2.add(r12)
            goto L_0x00cb
        L_0x00e1:
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r2)
            java.util.LinkedList<te3.rl1> r2 = r1.f142275d
            if (r2 == 0) goto L_0x00f2
            r2.clear()
        L_0x00f2:
            java.util.LinkedList<te3.rl1> r2 = r1.f142275d
            if (r2 == 0) goto L_0x00f9
            r2.addAll(r9)
        L_0x00f9:
            java.util.LinkedList<java.lang.Long> r1 = r1.f142277f
            if (r1 == 0) goto L_0x0105
            le1.d r2 = new le1.d
            r2.<init>(r10)
            sx3.C64175a0.m75512t(r1, r2)
        L_0x0105:
            r1 = 0
        L_0x0106:
            if (r1 >= 0) goto L_0x011e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "[handle] ret="
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r3, r0)
            goto L_0x0612
        L_0x011e:
            te3.tl1 r1 = r0.f13978o
            gy3.C87412m.m108591d(r1)
            java.util.LinkedList<cm1.i2> r2 = r0.f13968e
            java.util.Iterator r2 = r2.iterator()
            r8 = 0
        L_0x012a:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x0149
            java.lang.Object r9 = r2.next()
            cm1.i2 r9 = (cm1.C0740i2) r9
            long r9 = r9.getItemId()
            long r11 = r0.f13974k
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 != 0) goto L_0x0142
            r9 = 1
            goto L_0x0143
        L_0x0142:
            r9 = 0
        L_0x0143:
            if (r9 == 0) goto L_0x0146
            goto L_0x014a
        L_0x0146:
            int r8 = r8 + 1
            goto L_0x012a
        L_0x0149:
            r8 = -1
        L_0x014a:
            int r2 = r0.f13975l
            if (r2 <= 0) goto L_0x015c
            java.util.LinkedList r2 = new java.util.LinkedList
            java.util.LinkedList<cm1.i2> r9 = r0.f13968e
            int r10 = r0.f13975l
            java.util.List r9 = r9.subList(r7, r10)
            r2.<init>(r9)
            goto L_0x0161
        L_0x015c:
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
        L_0x0161:
            int r9 = r0.f13975l
            if (r9 > 0) goto L_0x016d
            java.util.LinkedList r9 = new java.util.LinkedList
            java.util.LinkedList<cm1.i2> r10 = r0.f13968e
            r9.<init>(r10)
            goto L_0x0186
        L_0x016d:
            if (r8 < 0) goto L_0x0181
            java.util.LinkedList r9 = new java.util.LinkedList
            java.util.LinkedList<cm1.i2> r10 = r0.f13968e
            int r11 = r8 + 1
            int r12 = r10.size()
            java.util.List r10 = r10.subList(r11, r12)
            r9.<init>(r10)
            goto L_0x0186
        L_0x0181:
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
        L_0x0186:
            java.util.LinkedList r10 = new java.util.LinkedList
            java.util.LinkedList<cm1.i2> r11 = r0.f13968e
            r10.<init>(r11)
            java.util.LinkedList<te3.pl1> r11 = r1.f142276e
            java.lang.String r12 = "layoutInfo.card"
            gy3.C87412m.m108593f(r11, r12)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.Iterator r11 = r11.iterator()
        L_0x019d:
            boolean r13 = r11.hasNext()
            r14 = 2
            if (r13 == 0) goto L_0x01bd
            java.lang.Object r13 = r11.next()
            r15 = r13
            te3.pl1 r15 = (te3.C64629pl1) r15
            int r15 = r15.f184847n
            if (r15 == r14) goto L_0x01b6
            if (r15 == 0) goto L_0x01b6
            if (r15 != r6) goto L_0x01b4
            goto L_0x01b6
        L_0x01b4:
            r14 = 0
            goto L_0x01b7
        L_0x01b6:
            r14 = 1
        L_0x01b7:
            if (r14 == 0) goto L_0x019d
            r12.add(r13)
            goto L_0x019d
        L_0x01bd:
            java.util.LinkedList<te3.rl1> r11 = r1.f142275d
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r15 = "[handle] dividerObjects="
            r13.append(r15)
            java.lang.String r15 = "dividerObjects"
            gy3.C87412m.m108593f(r11, r15)
            java.util.ArrayList r15 = new java.util.ArrayList
            int r4 = sx3.C36907w.m41090l(r11, r5)
            r15.<init>(r4)
            java.util.Iterator r4 = r11.iterator()
        L_0x01db:
            boolean r16 = r4.hasNext()
            java.lang.String r7 = "it"
            if (r16 == 0) goto L_0x021a
            java.lang.Object r16 = r4.next()
            r6 = r16
            te3.rl1 r6 = (te3.C51124rl1) r6
            gy3.C87412m.m108593f(r6, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r18 = r15
            long r14 = r6.f141001g
            r7.append(r14)
            r14 = 95
            r7.append(r14)
            int r15 = r6.f141000f
            r7.append(r15)
            r7.append(r14)
            java.lang.String r6 = r6.f140999e
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r14 = r18
            r14.add(r6)
            r15 = r14
            r6 = 1
            r7 = 0
            r14 = 2
            goto L_0x01db
        L_0x021a:
            r14 = r15
            r13.append(r14)
            java.lang.String r4 = " cardObjects="
            r13.append(r4)
            java.util.ArrayList r4 = new java.util.ArrayList
            int r6 = sx3.C36907w.m41090l(r12, r5)
            r4.<init>(r6)
            java.util.Iterator r6 = r12.iterator()
        L_0x0230:
            boolean r14 = r6.hasNext()
            if (r14 == 0) goto L_0x0247
            java.lang.Object r14 = r6.next()
            te3.pl1 r14 = (te3.C64629pl1) r14
            gy3.C87412m.m108593f(r14, r7)
            java.lang.String r14 = le1.C10496h.m10426a(r14)
            r4.add(r14)
            goto L_0x0230
        L_0x0247:
            r13.append(r4)
            java.lang.String r4 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            java.util.Iterator r4 = r11.iterator()
            r6 = 0
        L_0x0256:
            boolean r13 = r4.hasNext()
            if (r13 == 0) goto L_0x0274
            java.lang.Object r13 = r4.next()
            te3.rl1 r13 = (te3.C51124rl1) r13
            int r13 = r13.f141000f
            r14 = 2
            r15 = 1
            if (r13 == r14) goto L_0x026d
            if (r13 != r15) goto L_0x026b
            goto L_0x026d
        L_0x026b:
            r13 = 0
            goto L_0x026e
        L_0x026d:
            r13 = 1
        L_0x026e:
            if (r13 == 0) goto L_0x0271
            goto L_0x0276
        L_0x0271:
            int r6 = r6 + 1
            goto L_0x0256
        L_0x0274:
            r15 = 1
            r6 = -1
        L_0x0276:
            if (r6 < 0) goto L_0x027a
            r4 = 1
            goto L_0x027b
        L_0x027a:
            r4 = 0
        L_0x027b:
            if (r4 == 0) goto L_0x028d
            boolean r4 = r9.isEmpty()
            if (r4 == 0) goto L_0x028d
            le1.e r4 = le1.C10493e.f31731d
            sx3.C64175a0.m75512t(r11, r4)
            java.lang.String r4 = "[handle] fallback remove history divider"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
        L_0x028d:
            java.util.LinkedList<cm1.i2> r4 = r0.f13968e
            r4.clear()
            java.util.LinkedList<java.lang.Long> r4 = r1.f142277f
            java.lang.String r6 = "layoutInfo.layoutIds"
            gy3.C87412m.m108593f(r4, r6)
            java.util.Iterator r4 = r4.iterator()
            r13 = 0
        L_0x029e:
            boolean r14 = r4.hasNext()
            r16 = 0
            if (r14 == 0) goto L_0x038c
            java.lang.Object r14 = r4.next()
            java.lang.Long r14 = (java.lang.Long) r14
            java.util.Iterator r17 = r2.iterator()
        L_0x02b0:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L_0x02d5
            java.lang.Object r18 = r17.next()
            r19 = r18
            cm1.i2 r19 = (cm1.C0740i2) r19
            long r19 = r19.getItemId()
            if (r14 != 0) goto L_0x02c5
            goto L_0x02d0
        L_0x02c5:
            long r21 = r14.longValue()
            int r23 = (r19 > r21 ? 1 : (r19 == r21 ? 0 : -1))
            if (r23 != 0) goto L_0x02d0
            r19 = 1
            goto L_0x02d2
        L_0x02d0:
            r19 = 0
        L_0x02d2:
            if (r19 == 0) goto L_0x02b0
            goto L_0x02d7
        L_0x02d5:
            r18 = r16
        L_0x02d7:
            cm1.i2 r18 = (cm1.C0740i2) r18
            if (r18 != 0) goto L_0x031c
            java.util.Iterator r17 = r12.iterator()
        L_0x02df:
            boolean r18 = r17.hasNext()
            if (r18 == 0) goto L_0x0308
            java.lang.Object r18 = r17.next()
            r15 = r18
            te3.pl1 r15 = (te3.C64629pl1) r15
            r21 = r6
            long r5 = r15.f184840d
            if (r14 != 0) goto L_0x02f4
            goto L_0x02fe
        L_0x02f4:
            long r22 = r14.longValue()
            int r15 = (r5 > r22 ? 1 : (r5 == r22 ? 0 : -1))
            if (r15 != 0) goto L_0x02fe
            r5 = 1
            goto L_0x02ff
        L_0x02fe:
            r5 = 0
        L_0x02ff:
            if (r5 == 0) goto L_0x0302
            goto L_0x030c
        L_0x0302:
            r6 = r21
            r5 = 10
            r15 = 1
            goto L_0x02df
        L_0x0308:
            r21 = r6
            r18 = r16
        L_0x030c:
            r5 = r18
            te3.pl1 r5 = (te3.C64629pl1) r5
            if (r5 == 0) goto L_0x0319
            int r6 = r0.f13967d
            cm1.i2 r18 = le1.C10496h.m10427b(r5, r6)
            goto L_0x0320
        L_0x0319:
            r18 = r16
            goto L_0x0320
        L_0x031c:
            r21 = r6
            int r13 = r13 + 1
        L_0x0320:
            if (r18 != 0) goto L_0x035e
            java.util.Iterator r5 = r11.iterator()
        L_0x0326:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x034f
            java.lang.Object r6 = r5.next()
            r15 = r6
            te3.rl1 r15 = (te3.C51124rl1) r15
            r17 = r4
            r18 = r5
            long r4 = r15.f141001g
            if (r14 != 0) goto L_0x033c
            goto L_0x0346
        L_0x033c:
            long r22 = r14.longValue()
            int r15 = (r4 > r22 ? 1 : (r4 == r22 ? 0 : -1))
            if (r15 != 0) goto L_0x0346
            r4 = 1
            goto L_0x0347
        L_0x0346:
            r4 = 0
        L_0x0347:
            if (r4 == 0) goto L_0x034a
            goto L_0x0353
        L_0x034a:
            r4 = r17
            r5 = r18
            goto L_0x0326
        L_0x034f:
            r17 = r4
            r6 = r16
        L_0x0353:
            te3.rl1 r6 = (te3.C51124rl1) r6
            if (r6 == 0) goto L_0x035b
            cm1.i2 r16 = le1.C10496h.m10428c(r6)
        L_0x035b:
            r4 = r16
            goto L_0x0362
        L_0x035e:
            r17 = r4
            r4 = r18
        L_0x0362:
            if (r4 != 0) goto L_0x037e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "[handle] this id["
            r4.append(r5)
            r4.append(r14)
            java.lang.String r5 = "] not match any."
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r4)
            goto L_0x0383
        L_0x037e:
            java.util.LinkedList<cm1.i2> r5 = r0.f13968e
            r5.add(r4)
        L_0x0383:
            r4 = r17
            r6 = r21
            r5 = 10
            r15 = 1
            goto L_0x029e
        L_0x038c:
            r21 = r6
            java.util.LinkedList<cm1.i2> r4 = r0.f13968e
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L_0x0395:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x047c
            java.lang.Object r6 = r4.next()
            int r14 = r5 + 1
            if (r5 < 0) goto L_0x0478
            cm1.i2 r6 = (cm1.C0740i2) r6
            boolean r15 = r6 instanceof cm1.C0788w1
            if (r15 == 0) goto L_0x0465
            cm1.w1 r6 = (cm1.C0788w1) r6
            te3.rl1 r15 = r6.f1844d
            int r15 = r15.f141000f
            r17 = r4
            java.lang.String r4 = " nickname="
            r18 = r8
            java.lang.String r8 = " wording="
            r22 = r12
            java.lang.String r12 = "[handle] has divider "
            r23 = r11
            r11 = 10
            if (r15 != r11) goto L_0x0411
            int r5 = r5 + -1
            if (r5 < 0) goto L_0x046d
            java.util.LinkedList<cm1.i2> r11 = r0.f13968e
            java.lang.Object r5 = r11.get(r5)
            java.lang.String r11 = "loadedInfo.incrementList[index - 1 ]"
            gy3.C87412m.m108593f(r5, r11)
            cm1.i2 r5 = (cm1.C0740i2) r5
            boolean r11 = r5 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r11 == 0) goto L_0x046d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            te3.rl1 r11 = r6.f1844d
            r5.mo3512n0(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r12)
            te3.rl1 r12 = r6.f1844d
            int r12 = r12.f141000f
            r11.append(r12)
            r11.append(r8)
            te3.rl1 r6 = r6.f1844d
            java.lang.String r6 = r6.f140999e
            r11.append(r6)
            r11.append(r4)
            fe1.q r4 = r5.mo3507l()
            if (r4 == 0) goto L_0x0404
            java.lang.String r4 = r4.getNickname()
            goto L_0x0406
        L_0x0404:
            r4 = r16
        L_0x0406:
            r11.append(r4)
            java.lang.String r4 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            goto L_0x046d
        L_0x0411:
            java.util.LinkedList<cm1.i2> r5 = r0.f13968e
            int r5 = r5.size()
            if (r14 >= r5) goto L_0x046d
            java.util.LinkedList<cm1.i2> r5 = r0.f13968e
            java.lang.Object r5 = r5.get(r14)
            java.lang.String r11 = "loadedInfo.incrementList[index + 1]"
            gy3.C87412m.m108593f(r5, r11)
            cm1.i2 r5 = (cm1.C0740i2) r5
            boolean r11 = r5 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r11 == 0) goto L_0x046d
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r5 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r5
            te3.rl1 r11 = r6.f1844d
            r5.mo3512n0(r11)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r12)
            te3.rl1 r12 = r6.f1844d
            int r12 = r12.f141000f
            r11.append(r12)
            r11.append(r8)
            te3.rl1 r6 = r6.f1844d
            java.lang.String r6 = r6.f140999e
            r11.append(r6)
            r11.append(r4)
            fe1.q r4 = r5.mo3507l()
            if (r4 == 0) goto L_0x0458
            java.lang.String r4 = r4.getNickname()
            goto L_0x045a
        L_0x0458:
            r4 = r16
        L_0x045a:
            r11.append(r4)
            java.lang.String r4 = r11.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
            goto L_0x046d
        L_0x0465:
            r17 = r4
            r18 = r8
            r23 = r11
            r22 = r12
        L_0x046d:
            r5 = r14
            r4 = r17
            r8 = r18
            r12 = r22
            r11 = r23
            goto L_0x0395
        L_0x0478:
            sx3.C64197v.m75542k()
            throw r16
        L_0x047c:
            r18 = r8
            r23 = r11
            r22 = r12
            java.util.LinkedList<cm1.i2> r4 = r0.f13968e
            le1.f r5 = le1.C10494f.f31732d
            sx3.C64175a0.m75512t(r4, r5)
            int r4 = r2.size()
            java.lang.String r5 = "[handle] checkCount["
            if (r13 == r4) goto L_0x05b3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r5)
            r4.append(r13)
            java.lang.String r6 = "] != streamList.size["
            r4.append(r6)
            int r6 = r2.size()
            r4.append(r6)
            java.lang.String r6 = "] rawObjects.size["
            r4.append(r6)
            int r6 = r10.size()
            r4.append(r6)
            java.lang.String r6 = "] historyList.size["
            r4.append(r6)
            int r6 = r9.size()
            r4.append(r6)
            r6 = 93
            r4.append(r6)
            java.util.LinkedList<java.lang.Long> r1 = r1.f142277f
            r6 = r21
            gy3.C87412m.m108593f(r1, r6)
            java.util.ArrayList r6 = new java.util.ArrayList
            r8 = 10
            int r11 = sx3.C36907w.m41090l(r1, r8)
            r6.<init>(r11)
            java.util.Iterator r1 = r1.iterator()
        L_0x04db:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto L_0x04f6
            java.lang.Object r8 = r1.next()
            java.lang.Long r8 = (java.lang.Long) r8
            gy3.C87412m.m108593f(r8, r7)
            long r11 = r8.longValue()
            java.lang.String r8 = o40.C61926c.m72691p(r11)
            r6.add(r8)
            goto L_0x04db
        L_0x04f6:
            r4.append(r6)
            r1 = 32
            r4.append(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r6 = 10
            int r7 = sx3.C36907w.m41090l(r2, r6)
            r1.<init>(r7)
            java.util.Iterator r6 = r2.iterator()
        L_0x050d:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0525
            java.lang.Object r7 = r6.next()
            cm1.i2 r7 = (cm1.C0740i2) r7
            long r7 = r7.getItemId()
            java.lang.String r7 = o40.C61926c.m72691p(r7)
            r1.add(r7)
            goto L_0x050d
        L_0x0525:
            r4.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r4.append(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r2.iterator()
        L_0x0536:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0577
            java.lang.Object r7 = r6.next()
            r8 = r7
            cm1.i2 r8 = (cm1.C0740i2) r8
            java.util.LinkedList<cm1.i2> r11 = r0.f13968e
            java.util.Iterator r11 = r11.iterator()
            r12 = 0
        L_0x054a:
            boolean r14 = r11.hasNext()
            if (r14 == 0) goto L_0x056b
            java.lang.Object r14 = r11.next()
            cm1.i2 r14 = (cm1.C0740i2) r14
            long r14 = r14.getItemId()
            long r24 = r8.getItemId()
            int r16 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1))
            if (r16 != 0) goto L_0x0564
            r14 = 1
            goto L_0x0565
        L_0x0564:
            r14 = 0
        L_0x0565:
            if (r14 == 0) goto L_0x0568
            goto L_0x056c
        L_0x0568:
            int r12 = r12 + 1
            goto L_0x054a
        L_0x056b:
            r12 = -1
        L_0x056c:
            if (r12 >= 0) goto L_0x0570
            r8 = 1
            goto L_0x0571
        L_0x0570:
            r8 = 0
        L_0x0571:
            if (r8 == 0) goto L_0x0536
            r1.add(r7)
            goto L_0x0536
        L_0x0577:
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = sx3.C36907w.m41090l(r1, r7)
            r6.<init>(r7)
            java.util.Iterator r1 = r1.iterator()
        L_0x0586:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x059e
            java.lang.Object r7 = r1.next()
            cm1.i2 r7 = (cm1.C0740i2) r7
            long r7 = r7.getItemId()
            java.lang.String r7 = o40.C61926c.m72691p(r7)
            r6.add(r7)
            goto L_0x0586
        L_0x059e:
            r4.append(r6)
            java.lang.String r1 = r4.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r3, r1)
            java.util.LinkedList<cm1.i2> r1 = r0.f13968e
            r1.clear()
            java.util.LinkedList<cm1.i2> r1 = r0.f13968e
            r1.addAll(r10)
            goto L_0x05b8
        L_0x05b3:
            java.util.LinkedList<cm1.i2> r1 = r0.f13968e
            r1.addAll(r9)
        L_0x05b8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            r1.append(r13)
            java.lang.String r4 = "] dividerCount["
            r1.append(r4)
            int r4 = r23.size()
            r1.append(r4)
            java.lang.String r4 = "] cardCount["
            r1.append(r4)
            int r4 = r22.size()
            r1.append(r4)
            java.lang.String r4 = "] streamCount="
            r1.append(r4)
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r2 = " historyCount="
            r1.append(r2)
            int r2 = r9.size()
            r1.append(r2)
            java.lang.String r2 = " result="
            r1.append(r2)
            java.util.LinkedList<cm1.i2> r0 = r0.f13968e
            int r0 = r0.size()
            r1.append(r0)
            java.lang.String r0 = " historyIndex="
            r1.append(r0)
            r4 = r18
            r1.append(r4)
            java.lang.String r0 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r0)
        L_0x0612:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: le1.C10495g.mo10787b(com.tencent.mm.plugin.finder.feed.model.d, int):boolean");
    }

    /* renamed from: c */
    public boolean mo10788c(C9342n1.C9346d dVar, int i, int i2) {
        C87412m.m108594g(dVar, "resp");
        C37521f.f99374d.getClass();
        if (C37521f.f99403g2.mo60266n().intValue() > 0 && dVar.mo10088b().f145379q == 1 && dVar.f29205H >= 1) {
            C51412tl1 tl12 = new C51412tl1();
            C64629pl1 pl12 = new C64629pl1();
            pl12.f184840d = 111;
            pl12.f184850q = false;
            pl12.f184842f = "热门有更多推荐";
            pl12.f184841e = "热门推荐";
            pl12.f184847n = 0;
            LinkedList<FinderObject> linkedList = pl12.f184844h;
            LinkedList<FinderObject> linkedList2 = dVar.f146069d;
            linkedList.addAll(linkedList2.subList(0, Math.min(linkedList2.size(), dVar.f29205H)));
            tl12.f142276e.add(pl12);
            LinkedList<Long> linkedList3 = tl12.f142277f;
            List<FinderObject> subList = dVar.f146069d.subList(0, dVar.f29205H);
            C87412m.m108593f(subList, "resp.`object`.subList(0, resp.streamSize)");
            ArrayList arrayList = new ArrayList(C36907w.m41090l(subList, 10));
            for (FinderObject finderObject : subList) {
                arrayList.add(Long.valueOf(finderObject.f164794id));
            }
            linkedList3.addAll(arrayList);
            tl12.f142277f.add(1, 111L);
            dVar.f146086x = tl12;
        }
        return false;
    }
}
