package cn1;

import an1.C0103p;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import jq3.C60898l;
import jq3.C60905o;

/* renamed from: cn1.j1 */
public final class C0848j1 implements C60898l.C9502b<C60905o> {

    /* renamed from: d */
    public final /* synthetic */ C0103p f2001d;

    /* renamed from: e */
    public final /* synthetic */ C0827e1 f2002e;

    /* renamed from: f */
    public final /* synthetic */ WxRecyclerView f2003f;

    public C0848j1(C0103p pVar, C0827e1 e1Var, WxRecyclerView wxRecyclerView) {
        this.f2001d = pVar;
        this.f2002e = e1Var;
        this.f2003f = wxRecyclerView;
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01ed  */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo734q(androidx.recyclerview.widget.RecyclerView.C16613e r33, android.view.View r34, int r35, androidx.recyclerview.widget.RecyclerView.C16631z r36) {
        /*
            r32 = this;
            r0 = r32
            r1 = r33
            r3 = r35
            r2 = r36
            jq3.o r2 = (jq3.C60905o) r2
            java.lang.Class<ln1.f> r14 = ln1.C10584f.class
            java.lang.Class<rs1.s8> r15 = rs1.C13442s8.class
            java.lang.String r4 = "adapter"
            gy3.C87412m.m108594g(r1, r4)
            java.lang.String r4 = "view"
            r13 = r34
            gy3.C87412m.m108594g(r13, r4)
            java.lang.String r4 = "holder"
            gy3.C87412m.m108594g(r2, r4)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r1 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r1
            int r1 = r1.mo85796c6()
            if (r3 >= r1) goto L_0x002a
            goto L_0x0353
        L_0x002a:
            int r12 = r3 - r1
            an1.p r1 = r0.f2001d
            java.util.ArrayList<cm1.i2> r1 = r1.f546e
            java.lang.Object r1 = r1.get(r12)
            java.lang.String r4 = "item.feedDataList[pos]"
            gy3.C87412m.m108593f(r1, r4)
            r11 = r1
            cm1.i2 r11 = (cm1.C0740i2) r11
            boolean r10 = r11 instanceof an1.C0096i
            java.lang.String r9 = "pull_commentsence"
            java.lang.String r8 = "pull_liveid"
            r16 = 0
            java.lang.String r7 = "card_index"
            java.lang.String r6 = "column_id"
            java.lang.String r5 = "main_page_position"
            java.lang.String r1 = "view.context"
            java.lang.String r18 = ""
            r19 = 0
            r20 = 1
            if (r10 == 0) goto L_0x0116
            r2 = r11
            an1.i r2 = (an1.C0096i) r2
            te3.c91 r2 = r2.f534d
            te3.x91 r2 = r2.f131576d
            if (r2 == 0) goto L_0x0107
            cn1.e1 r3 = r0.f2002e
            android.content.Context r4 = r34.getContext()
            gy3.C87412m.m108593f(r4, r1)
            r3.getClass()
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r1 = r1.mo62443b(r4)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r15)
            rs1.s8 r1 = (rs1.C13442s8) r1
            te3.hj1 r1 = r1.mo12861q3()
            java.lang.String r1 = r1.f134671e
            if (r1 != 0) goto L_0x0080
            r1 = r18
        L_0x0080:
            rm1.C13087a.f37262i = r20
            java.lang.Class<ea.d> r21 = p147ea.C7606d.class
            di3.d r21 = di3.C86312j.m106911c(r21)
            r36 = r10
            r10 = r21
            ea.d r10 = (p147ea.C7606d) r10
            android.content.Intent r13 = new android.content.Intent
            r13.<init>()
            r21 = r15
            r15 = 9
            r22 = r11
            java.lang.String r11 = "key_request_scene"
            r13.putExtra(r11, r15)
            byte[] r11 = r2.toByteArray()
            java.lang.String r15 = "nearby_live_target_square_page_params_key"
            r13.putExtra(r15, r11)
            java.lang.String r11 = "key_context_id"
            r13.putExtra(r11, r1)
            java.lang.String r1 = "enter_from_type"
            r11 = 0
            r13.putExtra(r1, r11)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r10.mo8742gH(r4, r13)
            xm1.e r1 = r3.f1945f
            te3.qo0 r1 = r1.mo3565a()
            if (r1 == 0) goto L_0x00c2
            java.util.LinkedList<te3.x91> r1 = r1.f140423d
            goto L_0x00c4
        L_0x00c2:
            r1 = r19
        L_0x00c4:
            if (r1 == 0) goto L_0x00cf
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x00cd
            goto L_0x00cf
        L_0x00cd:
            r1 = 0
            goto L_0x00d0
        L_0x00cf:
            r1 = 1
        L_0x00d0:
            r10 = 18
            if (r1 == 0) goto L_0x00d5
            goto L_0x00df
        L_0x00d5:
            xm1.e r1 = r3.f1945f
            te3.qo0 r1 = r1.mo3565a()
            if (r1 == 0) goto L_0x00df
            int r10 = r1.f140426g
        L_0x00df:
            hn1.b r1 = hn1.C8614b.f27717a
            boolean r3 = r4 instanceof android.app.Activity
            if (r3 == 0) goto L_0x00e8
            android.app.Activity r4 = (android.app.Activity) r4
            goto L_0x00ea
        L_0x00e8:
            r4 = r19
        L_0x00ea:
            if (r4 == 0) goto L_0x00f1
            android.content.Intent r3 = r4.getIntent()
            goto L_0x00f3
        L_0x00f1:
            r3 = r19
        L_0x00f3:
            if (r3 != 0) goto L_0x00fa
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
        L_0x00fa:
            int r4 = r2.f144531d
            java.lang.String r2 = r2.f144532e
            if (r2 != 0) goto L_0x0102
            r2 = r18
        L_0x0102:
            r1.mo9487l(r3, r4, r10, r2)
            goto L_0x01c8
        L_0x0107:
            r22 = r11
            r21 = r15
            r28 = r5
            r29 = r6
            r15 = r7
            r30 = r8
            r26 = r10
            goto L_0x01d1
        L_0x0116:
            r36 = r10
            r22 = r11
            r21 = r15
            r11 = 0
            cn1.e1 r4 = r0.f2002e
            te3.hj1 r10 = r4.f1948i
            if (r10 == 0) goto L_0x0127
            java.lang.String r10 = r10.f134672f
            if (r10 != 0) goto L_0x0129
        L_0x0127:
            r10 = r18
        L_0x0129:
            ym1.a r4 = r4.f1949j
            if (r4 == 0) goto L_0x01c8
            an1.p r13 = r0.f2001d
            java.util.ArrayList<cm1.i2> r13 = r13.f546e
            com.tencent.mm.view.recyclerview.WxRecyclerView r15 = r0.f2003f
            java.lang.String r11 = "recyclerView"
            gy3.C87412m.m108593f(r15, r11)
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
            java.lang.String r3 = "3"
            r11.putString(r5, r3)
            java.lang.Object r2 = r2.f173503E
            boolean r3 = r2 instanceof an1.C0100m
            if (r3 == 0) goto L_0x014b
            an1.m r2 = (an1.C0100m) r2
            goto L_0x014d
        L_0x014b:
            r2 = r19
        L_0x014d:
            if (r2 == 0) goto L_0x0157
            te3.a91 r2 = r2.f903d
            if (r2 == 0) goto L_0x0157
            java.lang.String r2 = r2.f130379f
            if (r2 != 0) goto L_0x0159
        L_0x0157:
            r2 = r18
        L_0x0159:
            r11.putString(r6, r2)
            bl3.r r2 = bl3.C39818r.f106831a
            android.content.Context r3 = r34.getContext()
            gy3.C87412m.m108593f(r3, r1)
            bl3.r$a r1 = r2.mo62443b(r3)
            androidx.lifecycle.i0 r1 = r1.mo75002a(r14)
            ln1.f r1 = (ln1.C10584f) r1
            if (r1 == 0) goto L_0x0191
            long r2 = r1.f31930o
            int r23 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r23 == 0) goto L_0x0191
            java.lang.String r2 = r1.f31931p
            if (r2 == 0) goto L_0x0184
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0182
            goto L_0x0184
        L_0x0182:
            r2 = 0
            goto L_0x0185
        L_0x0184:
            r2 = 1
        L_0x0185:
            if (r2 != 0) goto L_0x0191
            long r2 = r1.f31930o
            r11.putLong(r8, r2)
            java.lang.String r1 = r1.f31931p
            r11.putString(r9, r1)
        L_0x0191:
            r11.putInt(r7, r12)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            r23 = 0
            r24 = 512(0x200, float:7.175E-43)
            r25 = 0
            r26 = 1
            r1 = r4
            r2 = r22
            r3 = r35
            r4 = r12
            r28 = r5
            r5 = r34
            r29 = r6
            r6 = r13
            r13 = r7
            r7 = r10
            r10 = r8
            r8 = r15
            r15 = r9
            r9 = r26
            r26 = r36
            r30 = r10
            r10 = r11
            r31 = r22
            r11 = r23
            r33 = r12
            r12 = r24
            r22 = r15
            r15 = r13
            r13 = r25
            ym1.C16052a.m14952f(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x01d7
        L_0x01c8:
            r26 = r36
            r28 = r5
            r29 = r6
            r15 = r7
            r30 = r8
        L_0x01d1:
            r33 = r12
            r31 = r22
            r22 = r9
        L_0x01d7:
            cn1.e1 r1 = r0.f2002e
            android.content.Context r2 = r34.getContext()
            boolean r3 = r2 instanceof android.app.Activity
            if (r3 == 0) goto L_0x01e4
            android.app.Activity r2 = (android.app.Activity) r2
            goto L_0x01e6
        L_0x01e4:
            r2 = r19
        L_0x01e6:
            an1.p r3 = r0.f2001d
            r1.getClass()
            if (r2 == 0) goto L_0x0353
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r5 = r4.mo62443b(r2)
            androidx.lifecycle.i0 r5 = r5.mo75002a(r14)
            java.lang.String r6 = "UICProvider.of(it).get(N…eReporterUIC::class.java)"
            gy3.C87412m.m108593f(r5, r6)
            ln1.f r5 = (ln1.C10584f) r5
            c30.g r6 = new c30.g
            r6.<init>()
            java.lang.String r7 = ";"
            java.lang.String r8 = ","
            java.lang.String r9 = "eldUdfKv.toString()"
            java.lang.String r10 = "page_index"
            if (r26 == 0) goto L_0x023b
            te3.a91 r2 = r3.f545d
            java.lang.String r2 = r2.f130379f
            java.util.HashMap<java.lang.String, java.lang.Integer> r3 = r5.f31925g
            java.lang.Object r3 = r3.get(r2)
            r6.mo145967r(r10, r3)
            r11 = r29
            r6.mo145967r(r11, r2)
            te3.hj1 r1 = r1.f1948i
            if (r1 == 0) goto L_0x0226
            java.lang.String r1 = r1.f134671e
            goto L_0x0228
        L_0x0226:
            r1 = r19
        L_0x0228:
            java.lang.String r2 = r6.toString()
            gy3.C87412m.m108593f(r2, r9)
            r12 = 0
            java.lang.String r2 = z04.C112551y.m153814n(r2, r8, r7, r12)
            java.lang.String r3 = "main_page_column_more"
            r5.mo10842d3(r1, r3, r2)
            goto L_0x0353
        L_0x023b:
            r11 = r29
            r12 = 0
            te3.a91 r3 = r3.f545d
            java.lang.String r3 = r3.f130379f
            r13 = r31
            boolean r14 = r13 instanceof an1.C0101n
            if (r14 == 0) goto L_0x024b
            r23 = 2
            goto L_0x024d
        L_0x024b:
            r23 = 1
        L_0x024d:
            java.util.HashMap<java.lang.String, java.lang.Integer> r12 = r5.f31925g
            java.lang.Object r12 = r12.get(r3)
            r6.mo145967r(r10, r12)
            r6.mo145967r(r11, r3)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r23)
            java.lang.String r12 = "card_type"
            r6.mo145967r(r12, r10)
            java.lang.String r10 = java.lang.String.valueOf(r33)
            r6.mo145967r(r15, r10)
            boolean r10 = r13 instanceof bn1.C0331b
            if (r10 == 0) goto L_0x0271
            r12 = r13
            bn1.b r12 = (bn1.C0331b) r12
            goto L_0x0273
        L_0x0271:
            r12 = r19
        L_0x0273:
            if (r12 == 0) goto L_0x028b
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r12.mo3513o()
            if (r12 == 0) goto L_0x028b
            te3.c21 r12 = r12.getLiveInfo()
            if (r12 == 0) goto L_0x028b
            r34 = r2
            r15 = r3
            long r2 = r12.f182392d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            goto L_0x0290
        L_0x028b:
            r34 = r2
            r15 = r3
            r2 = r18
        L_0x0290:
            java.lang.String r3 = "liveid"
            r6.mo145967r(r3, r2)
            if (r14 == 0) goto L_0x029b
            r2 = r13
            an1.n r2 = (an1.C0101n) r2
            goto L_0x029d
        L_0x029b:
            r2 = r19
        L_0x029d:
            if (r2 == 0) goto L_0x02ab
            te3.d91 r2 = r2.f541d
            if (r2 == 0) goto L_0x02ab
            te3.d51 r2 = r2.f132196d
            if (r2 == 0) goto L_0x02ab
            java.lang.String r2 = r2.f132122h
            if (r2 != 0) goto L_0x02ad
        L_0x02ab:
            r2 = r18
        L_0x02ad:
            java.lang.String r3 = "Noticeid"
            r6.mo145967r(r3, r2)
            te3.hj1 r1 = r1.f1948i
            if (r1 == 0) goto L_0x02b9
            java.lang.String r1 = r1.f134671e
            goto L_0x02bb
        L_0x02b9:
            r1 = r19
        L_0x02bb:
            java.lang.String r2 = r6.toString()
            gy3.C87412m.m108593f(r2, r9)
            r3 = 0
            java.lang.String r2 = z04.C112551y.m153814n(r2, r8, r7, r3)
            java.lang.String r6 = "main_page_column_card"
            r5.mo10842d3(r1, r6, r2)
            c30.g r1 = new c30.g
            r1.<init>()
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6 = r28
            r1.mo145967r(r6, r2)
            r2 = r15
            r1.mo145967r(r11, r2)
            long r6 = r5.f31930o
            int r2 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r2 == 0) goto L_0x0306
            java.lang.String r2 = r5.f31931p
            if (r2 == 0) goto L_0x02f2
            int r2 = r2.length()
            if (r2 != 0) goto L_0x02f0
            goto L_0x02f2
        L_0x02f0:
            r20 = 0
        L_0x02f2:
            if (r20 != 0) goto L_0x0306
            long r2 = r5.f31930o
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r3 = r30
            r1.mo145967r(r3, r2)
            java.lang.String r2 = r5.f31931p
            r3 = r22
            r1.mo145967r(r3, r2)
        L_0x0306:
            java.lang.Class<ak1.o> r2 = ak1.C54108o.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            r22 = r2
            ak1.o r22 = (ak1.C54108o) r22
            if (r10 == 0) goto L_0x0316
            r19 = r13
            bn1.b r19 = (bn1.C0331b) r19
        L_0x0316:
            r2 = r33
            r23 = r19
            long r2 = (long) r2
            ak1.f0$q r26 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_ENTER_LIVE_ROOM
            r5 = r34
            bl3.r$a r4 = r4.mo62443b(r5)
            r5 = r21
            androidx.lifecycle.i0 r4 = r4.mo75002a(r5)
            rs1.s8 r4 = (rs1.C13442s8) r4
            if (r4 == 0) goto L_0x033d
            int r4 = r4.f38096i
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r4 = r4.toString()
            if (r4 != 0) goto L_0x033a
            goto L_0x033d
        L_0x033a:
            r27 = r4
            goto L_0x033f
        L_0x033d:
            r27 = r18
        L_0x033f:
            java.lang.String r1 = r1.toString()
            java.lang.String r4 = "chnlExtra.toString()"
            gy3.C87412m.m108593f(r1, r4)
            java.lang.String r28 = ""
            java.lang.String r29 = ""
            r24 = r2
            r30 = r1
            r22.mo9607Uk(r23, r24, r26, r27, r28, r29, r30)
        L_0x0353:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn1.C0848j1.mo734q(androidx.recyclerview.widget.RecyclerView$e, android.view.View, int, androidx.recyclerview.widget.RecyclerView$z):void");
    }
}
