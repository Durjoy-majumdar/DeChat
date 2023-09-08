package cn1;

import an1.C0095h;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import jq3.C60898l;
import jq3.C60905o;

/* renamed from: cn1.x0 */
public final class C0884x0 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C0095h f2093d;

    /* renamed from: e */
    public final /* synthetic */ C0870s0 f2094e;

    /* renamed from: f */
    public final /* synthetic */ WxRecyclerView f2095f;

    public C0884x0(C0095h hVar, C0870s0 s0Var, WxRecyclerView wxRecyclerView) {
        this.f2093d = hVar;
        this.f2094e = s0Var;
        this.f2095f = wxRecyclerView;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0042, code lost:
        r2 = r2.f134672f;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo734q(androidx.recyclerview.widget.RecyclerView.C16613e r31, android.view.View r32, int r33, androidx.recyclerview.widget.RecyclerView.C16631z r34) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r3 = r33
            r2 = r34
            jq3.o r2 = (jq3.C60905o) r2
            java.lang.Class<ln1.f> r12 = ln1.C10584f.class
            java.lang.String r4 = "adapter"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "view"
            r13 = r32
            gy3.C87412m.m108594g(r13, r4)
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r2, r4)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r1
            int r1 = r1.mo85796c6()
            if (r3 >= r1) goto L_0x0028
            goto L_0x0144
        L_0x0028:
            int r14 = r3 - r1
            an1.h r1 = r0.f2093d
            java.util.ArrayList<cm1.i2> r1 = r1.f533e
            java.lang.Object r1 = r1.get(r14)
            java.lang.String r2 = "item.feedDataList[pos]"
            gy3.C87412m.m108593f(r1, r2)
            r15 = r1
            cm1.i2 r15 = (cm1.C0740i2) r15
            cn1.s0 r1 = r0.f2094e
            te3.hj1 r2 = r1.f2069i
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
            ym1.a r1 = r1.f2068h
            java.lang.String r11 = "pull_commentsence"
            java.lang.String r10 = "pull_liveid"
            java.lang.String r9 = "main_page_position"
            if (r1 == 0) goto L_0x00b1
            an1.h r2 = r0.f2093d
            java.util.ArrayList<cm1.i2> r6 = r2.f533e
            com.tencent.mm.view.recyclerview.WxRecyclerView r8 = r0.f2095f
            java.lang.String r2 = "recyclerView"
            gy3.C87412m.m108593f(r8, r2)
            r17 = 0
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r2 = "5"
            r5.putString(r9, r2)
            java.lang.String r2 = "card_index"
            r5.putInt(r2, r14)
            bl3.r r2 = bl3.C39818r.f106831a
            android.content.Context r4 = r32.getContext()
            java.lang.String r3 = "view.context"
            gy3.C87412m.m108593f(r4, r3)
            bl3.r$a r2 = r2.mo62443b(r4)
            androidx.lifecycle.i0 r2 = r2.mo75002a(r12)
            ln1.f r2 = (ln1.C10584f) r2
            if (r2 == 0) goto L_0x0093
            long r3 = r2.f31930o
            r5.putLong(r10, r3)
            java.lang.String r2 = r2.f31931p
            r5.putString(r11, r2)
        L_0x0093:
            rx3.b0 r2 = rx3.C13598b0.f38549a
            an1.h r4 = r0.f2093d
            r2 = r15
            r3 = r33
            r18 = r4
            r4 = r14
            r19 = r5
            r5 = r32
            r13 = r9
            r9 = r17
            r20 = r10
            r10 = r19
            r31 = r14
            r14 = r11
            r11 = r18
            r1.mo14669e(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            goto L_0x00b7
        L_0x00b1:
            r13 = r9
            r20 = r10
            r31 = r14
            r14 = r11
        L_0x00b7:
            cn1.s0 r1 = r0.f2094e
            android.content.Context r2 = r32.getContext()
            boolean r3 = r2 instanceof android.app.Activity
            r4 = 0
            if (r3 == 0) goto L_0x00c5
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x00c6
        L_0x00c5:
            r2 = r4
        L_0x00c6:
            r1.getClass()
            if (r2 == 0) goto L_0x0144
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r3 = r1.mo62443b(r2)
            androidx.lifecycle.i0 r3 = r3.mo75002a(r12)
            ln1.f r3 = (ln1.C10584f) r3
            if (r3 == 0) goto L_0x0144
            boolean r5 = r15 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r5 == 0) goto L_0x00e0
            r4 = r15
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r4 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r4
        L_0x00e0:
            r22 = r4
            if (r22 == 0) goto L_0x0144
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            long r5 = r3.f31930o
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = r20
            r4.putOpt(r6, r5)
            java.lang.String r3 = r3.f31931p
            r4.putOpt(r14, r3)
            r3 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4.putOpt(r13, r3)
            java.lang.Class<ak1.o> r3 = ak1.C54108o.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            r21 = r3
            ak1.o r21 = (ak1.C54108o) r21
            r3 = r31
            long r5 = (long) r3
            ak1.f0$q r25 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM
            bl3.r$a r1 = r1.mo62443b(r2)
            java.lang.Class<rs1.s8> r2 = rs1.C13442s8.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            rs1.s8 r1 = (rs1.C13442s8) r1
            if (r1 == 0) goto L_0x012e
            int r1 = r1.f38096i
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L_0x012b
            goto L_0x012e
        L_0x012b:
            r26 = r1
            goto L_0x0130
        L_0x012e:
            r26 = r16
        L_0x0130:
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "chnlExtra.toString()"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r27 = ""
            java.lang.String r28 = ""
            r23 = r5
            r29 = r1
            r21.mo9607Uk(r22, r23, r25, r26, r27, r28, r29)
        L_0x0144:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn1.C0884x0.mo734q(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int, androidx.recyclerview.widget.RecyclerView$z):void");
    }
}
