package cn1;

import an1.C0093f;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import jq3.C60898l;
import jq3.C60905o;

/* renamed from: cn1.t */
public final class C0874t implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C0093f f2078d;

    /* renamed from: e */
    public final /* synthetic */ C0859p f2079e;

    /* renamed from: f */
    public final /* synthetic */ WxRecyclerView f2080f;

    public C0874t(C0093f fVar, C0859p pVar, WxRecyclerView wxRecyclerView) {
        this.f2078d = fVar;
        this.f2079e = pVar;
        this.f2080f = wxRecyclerView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0042, code lost:
        r2 = r2.f134672f;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo734q(androidx.recyclerview.widget.RecyclerView.C16613e r36, android.view.View r37, int r38, androidx.recyclerview.widget.RecyclerView.C16631z r39) {
        /*
            r35 = this;
            r0 = r35
            r1 = r36
            r3 = r38
            r2 = r39
            jq3.o r2 = (jq3.C60905o) r2
            java.lang.Class<ln1.f> r12 = ln1.C10584f.class
            java.lang.String r4 = "adapter"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "view"
            r13 = r37
            gy3.C87412m.m108594g(r13, r4)
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r2, r4)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r1
            int r1 = r1.mo85796c6()
            if (r3 >= r1) goto L_0x0028
            goto L_0x0202
        L_0x0028:
            int r14 = r3 - r1
            an1.f r1 = r0.f2078d
            java.util.ArrayList<cm1.i2> r1 = r1.f531e
            java.lang.Object r1 = r1.get(r14)
            java.lang.String r2 = "item.feedDataList[pos]"
            gy3.C87412m.m108593f(r1, r2)
            r15 = r1
            cm1.i2 r15 = (cm1.C0740i2) r15
            cn1.p r1 = r0.f2079e
            te3.hj1 r2 = r1.f2040i
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
            ym1.a r1 = r1.f2039h
            java.lang.String r11 = "pull_commentsence"
            java.lang.String r10 = "pull_liveid"
            r17 = 0
            java.lang.String r9 = "card_index"
            java.lang.String r8 = "main_page_position"
            r19 = 1
            if (r1 == 0) goto L_0x00d4
            an1.f r2 = r0.f2078d
            java.util.ArrayList<cm1.i2> r5 = r2.f531e
            com.tencent.mm.view.recyclerview.WxRecyclerView r4 = r0.f2080f
            java.lang.String r2 = "recyclerView"
            gy3.C87412m.m108593f(r4, r2)
            r20 = 0
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r6 = "1"
            r2.putString(r8, r6)
            r2.putInt(r9, r14)
            bl3.r r6 = bl3.C39818r.f106831a
            android.content.Context r3 = r37.getContext()
            r39 = r4
            java.lang.String r4 = "view.context"
            gy3.C87412m.m108593f(r3, r4)
            bl3.r$a r3 = r6.mo62443b(r3)
            androidx.lifecycle.i0 r3 = r3.mo75002a(r12)
            ln1.f r3 = (ln1.C10584f) r3
            r6 = r5
            if (r3 == 0) goto L_0x00b0
            long r4 = r3.f31930o
            int r21 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r21 == 0) goto L_0x00b0
            java.lang.String r4 = r3.f31931p
            if (r4 == 0) goto L_0x00a3
            int r4 = r4.length()
            if (r4 != 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            r4 = 0
            goto L_0x00a4
        L_0x00a3:
            r4 = 1
        L_0x00a4:
            if (r4 != 0) goto L_0x00b0
            long r4 = r3.f31930o
            r2.putLong(r10, r4)
            java.lang.String r3 = r3.f31931p
            r2.putString(r11, r3)
        L_0x00b0:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            an1.f r5 = r0.f2078d
            r21 = r2
            r2 = r15
            r3 = r38
            r22 = r39
            r4 = r14
            r23 = r5
            r5 = r37
            r13 = r8
            r8 = r22
            r22 = r13
            r13 = r9
            r9 = r20
            r24 = r10
            r10 = r21
            r25 = r11
            r11 = r23
            r1.mo14669e(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x00db
        L_0x00d4:
            r22 = r8
            r13 = r9
            r24 = r10
            r25 = r11
        L_0x00db:
            cn1.p r1 = r0.f2079e
            android.content.Context r2 = r37.getContext()
            boolean r3 = r2 instanceof android.app.Activity
            r4 = 0
            if (r3 == 0) goto L_0x00e9
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x00ea
        L_0x00e9:
            r2 = r4
        L_0x00ea:
            r1.getClass()
            if (r2 == 0) goto L_0x0202
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r5 = r3.mo62443b(r2)
            androidx.lifecycle.i0 r5 = r5.mo75002a(r12)
            java.lang.String r6 = "UICProvider.of(it).get(N…eReporterUIC::class.java)"
            gy3.C87412m.m108593f(r5, r6)
            ln1.f r5 = (ln1.C10584f) r5
            c30.g r6 = new c30.g
            r6.<init>()
            int r7 = r5.f31922d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.String r8 = "page_index"
            r6.mo145967r(r8, r7)
            java.lang.String r7 = java.lang.String.valueOf(r14)
            r6.mo145967r(r13, r7)
            boolean r7 = r15 instanceof an1.C0092e
            if (r7 == 0) goto L_0x011f
            r8 = r15
            an1.e r8 = (an1.C0092e) r8
            goto L_0x0120
        L_0x011f:
            r8 = r4
        L_0x0120:
            if (r8 == 0) goto L_0x0136
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.mo3513o()
            if (r8 == 0) goto L_0x0136
            com.tencent.mm.protocal.protobuf.FinderObject r8 = r8.getFeedObject()
            if (r8 == 0) goto L_0x0136
            com.tencent.mm.protocal.protobuf.FinderContact r8 = r8.contact
            if (r8 == 0) goto L_0x0136
            java.lang.String r8 = r8.username
            if (r8 != 0) goto L_0x0138
        L_0x0136:
            r8 = r16
        L_0x0138:
            java.lang.String r9 = "username"
            r6.mo145967r(r9, r8)
            if (r7 == 0) goto L_0x0144
            r7 = r15
            an1.e r7 = (an1.C0092e) r7
            goto L_0x0145
        L_0x0144:
            r7 = r4
        L_0x0145:
            if (r7 == 0) goto L_0x015a
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = r7.mo3513o()
            if (r7 == 0) goto L_0x015a
            te3.c21 r7 = r7.getLiveInfo()
            if (r7 == 0) goto L_0x015a
            long r7 = r7.f182392d
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            goto L_0x015c
        L_0x015a:
            r7 = r16
        L_0x015c:
            java.lang.String r8 = "liveid"
            r6.mo145967r(r8, r7)
            te3.hj1 r1 = r1.f2040i
            if (r1 == 0) goto L_0x0168
            java.lang.String r1 = r1.f134671e
            goto L_0x0169
        L_0x0168:
            r1 = r4
        L_0x0169:
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "eldUdfKv.toString()"
            gy3.C87412m.m108593f(r6, r7)
            java.lang.String r7 = ","
            java.lang.String r8 = ";"
            r9 = 0
            java.lang.String r6 = z04.C112551y.m153814n(r6, r7, r8, r9)
            java.lang.String r7 = "main_page_focus_card"
            r5.mo10842d3(r1, r7, r6)
            boolean r1 = r15 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r1 == 0) goto L_0x0187
            r4 = r15
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r4
        L_0x0187:
            r27 = r4
            if (r27 == 0) goto L_0x0202
            c30.g r1 = new c30.g
            r1.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r19)
            r6 = r22
            r1.mo145967r(r6, r4)
            long r6 = r5.f31930o
            int r4 = (r6 > r17 ? 1 : (r6 == r17 ? 0 : -1))
            if (r4 == 0) goto L_0x01c1
            java.lang.String r4 = r5.f31931p
            if (r4 == 0) goto L_0x01ac
            int r4 = r4.length()
            if (r4 != 0) goto L_0x01aa
            goto L_0x01ac
        L_0x01aa:
            r6 = 0
            goto L_0x01ad
        L_0x01ac:
            r6 = 1
        L_0x01ad:
            if (r6 != 0) goto L_0x01c1
            long r6 = r5.f31930o
            java.lang.Long r4 = java.lang.Long.valueOf(r6)
            r6 = r24
            r1.mo145967r(r6, r4)
            java.lang.String r4 = r5.f31931p
            r5 = r25
            r1.mo145967r(r5, r4)
        L_0x01c1:
            java.lang.Class<ak1.o> r4 = ak1.C54108o.class
            di3.d r4 = di3.C86312j.m106911c(r4)
            r26 = r4
            ak1.o r26 = (ak1.C54108o) r26
            long r4 = (long) r14
            ak1.f0$q r30 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM
            bl3.r$a r2 = r3.mo62443b(r2)
            java.lang.Class<rs1.s8> r3 = rs1.C13442s8.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            rs1.s8 r2 = (rs1.C13442s8) r2
            if (r2 == 0) goto L_0x01ec
            int r2 = r2.f38096i
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = r2.toString()
            if (r2 != 0) goto L_0x01e9
            goto L_0x01ec
        L_0x01e9:
            r31 = r2
            goto L_0x01ee
        L_0x01ec:
            r31 = r16
        L_0x01ee:
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "chnlExtra.toString()"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r32 = ""
            java.lang.String r33 = ""
            r28 = r4
            r34 = r1
            r26.mo9607Uk(r27, r28, r30, r31, r32, r33, r34)
        L_0x0202:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn1.C0874t.mo734q(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int, androidx.recyclerview.widget.RecyclerView$z):void");
    }
}
