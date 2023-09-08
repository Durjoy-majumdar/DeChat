package cn1;

import an1.C0091d;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import gy3.C8479f0;
import jq3.C60898l;
import jq3.C60905o;

/* renamed from: cn1.f */
public final class C0832f implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C0091d f1960d;

    /* renamed from: e */
    public final /* synthetic */ C0821e f1961e;

    /* renamed from: f */
    public final /* synthetic */ C8479f0<WxRecyclerView> f1962f;

    public C0832f(C0091d dVar, C0821e eVar, C8479f0<WxRecyclerView> f0Var) {
        this.f1960d = dVar;
        this.f1961e = eVar;
        this.f1962f = f0Var;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0042, code lost:
        r2 = r2.f134672f;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo734q(androidx.recyclerview.widget.RecyclerView.C16613e r39, android.view.View r40, int r41, androidx.recyclerview.widget.RecyclerView.C16631z r42) {
        /*
            r38 = this;
            r0 = r38
            r1 = r39
            r3 = r41
            r2 = r42
            jq3.o r2 = (jq3.C60905o) r2
            java.lang.Class<ln1.f> r14 = ln1.C10584f.class
            java.lang.String r4 = "adapter"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "view"
            r15 = r40
            gy3.C87412m.m108594g(r15, r4)
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r2, r4)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r1
            int r1 = r1.mo85796c6()
            if (r3 >= r1) goto L_0x0028
            goto L_0x01ed
        L_0x0028:
            int r13 = r3 - r1
            an1.d r1 = r0.f1960d
            java.util.ArrayList<cm1.i2> r1 = r1.f529e
            java.lang.Object r1 = r1.get(r13)
            java.lang.String r2 = "item.feedDataList[pos]"
            gy3.C87412m.m108593f(r1, r2)
            r12 = r1
            cm1.i2 r12 = (cm1.C0740i2) r12
            cn1.e r1 = r0.f1961e
            te3.hj1 r2 = r1.f1928i
            java.lang.String r16 = ""
            if (r2 == 0) goto L_0x0049
            java.lang.String r2 = r2.f134672f
            if (r2 != 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r7 = r2
            goto L_0x004b
        L_0x0049:
            r7 = r16
        L_0x004b:
            ym1.a r1 = r1.f1927h
            java.lang.String r11 = "pull_commentsence"
            java.lang.String r10 = "pull_liveid"
            r17 = 0
            java.lang.String r9 = "main_page_position"
            r19 = 1
            if (r1 == 0) goto L_0x00dd
            an1.d r2 = r0.f1960d
            java.util.ArrayList<cm1.i2> r6 = r2.f529e
            gy3.f0<com.tencent.mm.view.recyclerview.WxRecyclerView> r2 = r0.f1962f
            T r2 = r2.f27484d
            java.lang.String r4 = "recyclerView"
            gy3.C87412m.m108593f(r2, r4)
            r20 = r2
            androidx.recyclerview.widget.RecyclerView r20 = (androidx.recyclerview.widget.RecyclerView) r20
            r21 = 2
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r2 = "2"
            r5.putString(r9, r2)
            java.lang.String r2 = "card_index"
            r5.putInt(r2, r13)
            bl3.r r2 = bl3.C39818r.f106831a
            android.content.Context r4 = r40.getContext()
            java.lang.String r8 = "view.context"
            gy3.C87412m.m108593f(r4, r8)
            bl3.r$a r2 = r2.mo62443b(r4)
            androidx.lifecycle.i0 r2 = r2.mo75002a(r14)
            ln1.f r2 = (ln1.C10584f) r2
            if (r2 == 0) goto L_0x00b3
            long r3 = r2.f31930o
            int r8 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r8 == 0) goto L_0x00b3
            java.lang.String r3 = r2.f31931p
            if (r3 == 0) goto L_0x00a6
            int r3 = r3.length()
            if (r3 != 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            r3 = 0
            goto L_0x00a7
        L_0x00a6:
            r3 = 1
        L_0x00a7:
            if (r3 != 0) goto L_0x00b3
            long r3 = r2.f31930o
            r5.putLong(r10, r3)
            java.lang.String r2 = r2.f31931p
            r5.putString(r11, r2)
        L_0x00b3:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            r22 = 0
            r23 = 512(0x200, float:7.175E-43)
            r24 = 0
            r2 = r12
            r3 = r41
            r4 = r13
            r25 = r5
            r5 = r40
            r8 = r20
            r26 = r9
            r9 = r21
            r27 = r10
            r10 = r25
            r28 = r11
            r11 = r22
            r29 = r12
            r12 = r23
            r39 = r13
            r13 = r24
            ym1.C16052a.m14952f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x00e7
        L_0x00dd:
            r26 = r9
            r27 = r10
            r28 = r11
            r29 = r12
            r39 = r13
        L_0x00e7:
            cn1.e r1 = r0.f1961e
            android.content.Context r2 = r40.getContext()
            boolean r3 = r2 instanceof android.app.Activity
            r4 = 0
            if (r3 == 0) goto L_0x00f5
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x00f6
        L_0x00f5:
            r2 = r4
        L_0x00f6:
            r1.getClass()
            if (r2 == 0) goto L_0x01ed
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r5 = r3.mo62443b(r2)
            androidx.lifecycle.i0 r5 = r5.mo75002a(r14)
            java.lang.String r6 = "UICProvider.of(it).get(N…eReporterUIC::class.java)"
            gy3.C87412m.m108593f(r5, r6)
            ln1.f r5 = (ln1.C10584f) r5
            c30.g r6 = new c30.g
            r6.<init>()
            int r7 = r5.f31923e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "page_index"
            r6.mo145967r(r8, r7)
            java.lang.String r7 = java.lang.String.valueOf(r39)
            java.lang.String r8 = "banner_live_index"
            r6.mo145967r(r8, r7)
            r7 = r29
            boolean r8 = r7 instanceof bn1.C0331b
            if (r8 == 0) goto L_0x012f
            r12 = r7
            bn1.b r12 = (bn1.C0331b) r12
            goto L_0x0130
        L_0x012f:
            r12 = r4
        L_0x0130:
            if (r12 == 0) goto L_0x0145
            com.tencent.mm.plugin.finder.storage.FinderItem r9 = r12.mo3513o()
            if (r9 == 0) goto L_0x0145
            te3.c21 r9 = r9.getLiveInfo()
            if (r9 == 0) goto L_0x0145
            long r9 = r9.f182392d
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            goto L_0x0147
        L_0x0145:
            r9 = r16
        L_0x0147:
            java.lang.String r10 = "liveid"
            r6.mo145967r(r10, r9)
            te3.hj1 r1 = r1.f1928i
            if (r1 == 0) goto L_0x0153
            java.lang.String r1 = r1.f134671e
            goto L_0x0154
        L_0x0153:
            r1 = r4
        L_0x0154:
            java.lang.String r6 = r6.toString()
            java.lang.String r9 = "eldUdfKv.toString()"
            gy3.C87412m.m108593f(r6, r9)
            java.lang.String r9 = ","
            java.lang.String r10 = ";"
            r11 = 0
            java.lang.String r6 = z04.C112551y.m153814n(r6, r9, r10, r11)
            java.lang.String r9 = "main_page_banner_live"
            r5.mo10842d3(r1, r9, r6)
            if (r8 == 0) goto L_0x0170
            r4 = r7
            bn1.b r4 = (bn1.C0331b) r4
        L_0x0170:
            r30 = r4
            if (r30 == 0) goto L_0x01ed
            c30.g r1 = new c30.g
            r1.<init>()
            r4 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r6 = r26
            r1.mo145967r(r6, r4)
            long r6 = r5.f31930o
            int r4 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x01aa
            java.lang.String r4 = r5.f31931p
            if (r4 == 0) goto L_0x0196
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0194
            goto L_0x0196
        L_0x0194:
            r19 = 0
        L_0x0196:
            if (r19 != 0) goto L_0x01aa
            long r6 = r5.f31930o
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r6 = r27
            r1.mo145967r(r6, r4)
            java.lang.String r4 = r5.f31931p
            r5 = r28
            r1.mo145967r(r5, r4)
        L_0x01aa:
            java.lang.Class<ak1.o> r4 = ak1.C54108o.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            r29 = r4
            ak1.o r29 = (ak1.C54108o) r29
            r4 = r39
            long r4 = (long) r4
            ak1.f0$q r33 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM
            bl3.r$a r2 = r3.mo62443b(r2)
            java.lang.Class<rs1.s8> r3 = rs1.C13442s8.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            rs1.s8 r2 = (rs1.C13442s8) r2
            if (r2 == 0) goto L_0x01d7
            int r2 = r2.f38096i
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L_0x01d4
            goto L_0x01d7
        L_0x01d4:
            r34 = r2
            goto L_0x01d9
        L_0x01d7:
            r34 = r16
        L_0x01d9:
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "chnlExtra.toString()"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r35 = ""
            java.lang.String r36 = ""
            r31 = r4
            r37 = r1
            r29.mo9607Uk(r30, r31, r33, r34, r35, r36, r37)
        L_0x01ed:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn1.C0832f.mo734q(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int, androidx.recyclerview.widget.RecyclerView$z):void");
    }
}
