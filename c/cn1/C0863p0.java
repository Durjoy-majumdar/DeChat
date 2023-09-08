package cn1;

import an1.C0101n;
import android.view.View;
import jq3.C60905o;

/* renamed from: cn1.p0 */
public final class C0863p0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ C0101n f2048d;

    /* renamed from: e */
    public final /* synthetic */ C0868r0 f2049e;

    /* renamed from: f */
    public final /* synthetic */ C60905o f2050f;

    /* renamed from: g */
    public final /* synthetic */ int f2051g;

    /* renamed from: h */
    public final /* synthetic */ View f2052h;

    public C0863p0(C0101n nVar, C0868r0 r0Var, C60905o oVar, int i, View view) {
        this.f2048d = nVar;
        this.f2049e = r0Var;
        this.f2050f = oVar;
        this.f2051g = i;
        this.f2052h = view;
    }

    /* JADX WARNING: type inference failed for: r11v1 */
    /* JADX WARNING: type inference failed for: r2v8, types: [android.content.Context] */
    /* JADX WARNING: type inference failed for: r11v12 */
    /* JADX WARNING: type inference failed for: r11v13 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02e0  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02eb  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x020d  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r41) {
        /*
            r40 = this;
            r6 = r40
            java.lang.Class<ht1.y2> r7 = ht1.C8817y2.class
            java.lang.Class<rs1.s8> r8 = rs1.C13442s8.class
            java.lang.Class<tf0.q1> r9 = tf0.C13887q1.class
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10 = r41
            r0.add(r10)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeConvert$onBindViewHolder$7$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r40
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            di3.d r0 = di3.C86312j.m106911c(r9)
            tf0.q1 r0 = (tf0.C13887q1) r0
            an1.n r1 = r6.f2048d
            te3.d91 r1 = r1.f541d
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r1.f132197e
            java.lang.String r3 = ""
            if (r2 == 0) goto L_0x003a
            java.lang.String r2 = r2.username
            if (r2 != 0) goto L_0x003b
        L_0x003a:
            r2 = r3
        L_0x003b:
            te3.d51 r1 = r1.f132196d
            if (r1 == 0) goto L_0x0043
            java.lang.String r1 = r1.f132122h
            if (r1 != 0) goto L_0x0044
        L_0x0043:
            r1 = r3
        L_0x0044:
            te3.d51 r0 = r0.mo13343h4(r2, r1)
            if (r0 != 0) goto L_0x0050
            an1.n r0 = r6.f2048d
            te3.d91 r0 = r0.f541d
            te3.d51 r0 = r0.f132196d
        L_0x0050:
            an1.n r1 = r6.f2048d
            te3.d91 r2 = r1.f541d
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r2.f132197e
            if (r2 == 0) goto L_0x005c
            java.lang.String r4 = r2.username
            if (r4 != 0) goto L_0x005d
        L_0x005c:
            r4 = r3
        L_0x005d:
            if (r0 == 0) goto L_0x03c7
            cn1.r0 r5 = r6.f2049e
            jq3.o r15 = r6.f2050f
            int r14 = r6.f2051g
            android.view.View r13 = r6.f2052h
            int r11 = r0.f132119e
            r12 = 1
            r21 = r3
            if (r11 != 0) goto L_0x0070
            r11 = 2
            goto L_0x0071
        L_0x0070:
            r11 = 1
        L_0x0071:
            int r3 = r0.f132127p
            if (r3 != r12) goto L_0x0077
            r3 = 1
            goto L_0x0078
        L_0x0077:
            r3 = 0
        L_0x0078:
            r22 = 0
            if (r3 == 0) goto L_0x008d
            er1.j4 r3 = er1.C58739j4.f168176a
            if (r2 == 0) goto L_0x0083
            java.lang.String r2 = r2.username
            goto L_0x0085
        L_0x0083:
            r2 = r22
        L_0x0085:
            boolean r2 = r3.mo83691T(r2)
            if (r2 != 0) goto L_0x008d
            r2 = 1
            goto L_0x008e
        L_0x008d:
            r2 = 0
        L_0x008e:
            java.lang.String r3 = "getService(IFinderCommonLiveService::class.java)"
            java.lang.String r10 = "holder.context"
            r17 = 301(0x12d, float:4.22E-43)
            if (r2 == 0) goto L_0x020d
            android.content.Context r2 = r15.f173499A
            gy3.C87412m.m108593f(r2, r10)
            r5.getClass()
            java.lang.String r10 = r0.f132126o
            if (r10 != 0) goto L_0x00a4
            r10 = r21
        L_0x00a4:
            java.lang.String r12 = r0.f132122h
            if (r12 != 0) goto L_0x00ab
            r36 = r21
            goto L_0x00ad
        L_0x00ab:
            r36 = r12
        L_0x00ad:
            r12 = 1
            if (r11 == r12) goto L_0x00eb
            r12 = 2
            if (r11 == r12) goto L_0x00b4
            goto L_0x00e1
        L_0x00b4:
            je1.z0 r3 = new je1.z0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r32 = 1
            r33 = 0
            r34 = 158(0x9e, float:2.21E-43)
            r35 = 0
            r23 = r3
            r24 = r10
            r31 = r36
            r23.<init>(r24, r25, r26, r27, r29, r31, r32, r33, r34, r35)
            nr3.e r3 = r3.mo9225i()
            cn1.n0 r8 = new cn1.n0
            r8.<init>(r2, r5, r4)
            r3.mo123420E(r8)
            r8 = r2
            com.tencent.mm.ui.MMActivity r8 = (com.tencent.p014mm.p136ui.MMActivity) r8
            r3.mo11397F(r8)
        L_0x00e1:
            r3 = r11
            r37 = r13
            r38 = r14
            r39 = r15
            r6 = 1
            goto L_0x0175
        L_0x00eb:
            r12 = 0
            r0.f132119e = r12
            di3.d r12 = di3.C86312j.m106911c(r9)
            gy3.C87412m.m108593f(r12, r3)
            r3 = r12
            tf0.q1 r3 = (tf0.C13887q1) r3
            java.lang.String r12 = r0.f132122h
            if (r12 != 0) goto L_0x00ff
            r16 = r21
            goto L_0x0101
        L_0x00ff:
            r16 = r12
        L_0x0101:
            bl3.r r12 = bl3.C39818r.f106831a
            bl3.r$a r12 = r12.mo62443b(r2)
            androidx.lifecycle.i0 r8 = r12.mo75002a(r8)
            rs1.s8 r8 = (rs1.C13442s8) r8
            te3.hj1 r8 = r8.mo12861q3()
            r19 = 0
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            r20 = 0
            r23 = 80
            r24 = 0
            r12 = r11
            r11 = r3
            r3 = r12
            r6 = 1
            r12 = r4
            r37 = r13
            r13 = r16
            r38 = r14
            r14 = r3
            r39 = r15
            r15 = r8
            r16 = r19
            r18 = r20
            r19 = r23
            r20 = r24
            ob0.y r8 = tf0.C13887q1.C13888a.m13305a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            ob0.b0 r11 = f40.C86709a0.m107524d()
            r11.mo123460f(r8)
            je1.b0 r8 = new je1.b0
            r25 = 0
            r26 = 0
            r27 = 0
            r29 = 0
            r32 = 1
            r33 = 0
            r34 = 158(0x9e, float:2.21E-43)
            r35 = 0
            r23 = r8
            r24 = r10
            r31 = r36
            r23.<init>(r24, r25, r26, r27, r29, r31, r32, r33, r34, r35)
            nr3.e r8 = r8.mo9225i()
            cn1.m0 r15 = new cn1.m0
            r11 = r15
            r12 = r10
            r13 = r36
            r14 = r2
            r10 = r15
            r15 = r5
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16)
            r8.mo123420E(r10)
            r10 = r2
            com.tencent.mm.ui.MMActivity r10 = (com.tencent.p014mm.p136ui.MMActivity) r10
            r8.mo11397F(r10)
        L_0x0175:
            di3.d r8 = di3.C86312j.m106911c(r9)
            tf0.q1 r8 = (tf0.C13887q1) r8
            java.lang.String r10 = r0.f132122h
            if (r10 != 0) goto L_0x0181
            r10 = r21
        L_0x0181:
            te3.d51 r8 = r8.mo13343h4(r4, r10)
            if (r8 != 0) goto L_0x0197
            di3.d r8 = di3.C86312j.m106911c(r9)
            tf0.q1 r8 = (tf0.C13887q1) r8
            java.lang.String r9 = r0.f132122h
            if (r9 != 0) goto L_0x0193
            r9 = r21
        L_0x0193:
            r8.mo13325QY(r4, r9, r0)
            goto L_0x01ae
        L_0x0197:
            di3.d r8 = di3.C86312j.m106911c(r9)
            tf0.q1 r8 = (tf0.C13887q1) r8
            java.lang.String r9 = r0.f132122h
            if (r9 != 0) goto L_0x01a3
            r9 = r21
        L_0x01a3:
            te3.d51 r8 = r8.mo13343h4(r4, r9)
            if (r8 != 0) goto L_0x01aa
            goto L_0x01ae
        L_0x01aa:
            int r9 = r0.f132119e
            r8.f132119e = r9
        L_0x01ae:
            bl3.r r8 = bl3.C39818r.f106831a
            bl3.r$a r2 = r8.mo62443b(r2)
            bl3.c r2 = r2.mo62447c(r7)
            ht1.y2 r2 = (ht1.C8817y2) r2
            ht1.z2 r2 = r2.mo9643v2()
            r2.mo9648f0(r4)
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.lang.String r0 = r0.f132126o
            if (r0 != 0) goto L_0x01cc
            r0 = r21
        L_0x01cc:
            java.lang.String r2 = "activityId"
            r9.put(r2, r0)
            java.lang.Class<ak1.o> r0 = ak1.C54108o.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            java.lang.String r2 = "getService(HellLiveReport::class.java)"
            gy3.C87412m.m108593f(r0, r2)
            r7 = r0
            ht1.j5 r7 = (ht1.C8777j5) r7
            ak1.f0$m r8 = ak1.C54067f0.C0064m.LIVE_CONCERT_NEW_LIVE_SPACE_RECEIVE
            te3.hj1 r0 = r5.f2062e
            java.lang.String r10 = r0.f134671e
            int r0 = r0.f134675i
            java.lang.String r11 = java.lang.String.valueOf(r0)
            r12 = 0
            r13 = 16
            r14 = 0
            ht1.C8777j5.C8778a.m8607h(r7, r8, r9, r10, r11, r12, r13, r14)
            r2 = r39
            if (r3 != r6) goto L_0x0209
            android.content.Context r0 = r2.f173499A
            r4 = 2131827255(0x7f111a37, float:1.9287417E38)
            java.lang.String r0 = r0.getString(r4)
            java.lang.String r4 = "holder.context.getString…e_concert_reserved_toast)"
            gy3.C87412m.m108593f(r0, r4)
            android.content.Context r4 = r2.f173499A
            nj3.C76912y0.m92768g(r4, r0)
        L_0x0209:
            r0 = r1
            r1 = r3
            goto L_0x02d3
        L_0x020d:
            r37 = r13
            r38 = r14
            r2 = r15
            r6 = 1
            r15 = r11
            android.content.Context r14 = r2.f173499A
            gy3.C87412m.m108593f(r14, r10)
            r5.getClass()
            if (r15 == r6) goto L_0x0225
            r10 = 2
            if (r15 == r10) goto L_0x0222
            goto L_0x0228
        L_0x0222:
            r0.f132119e = r6
            goto L_0x0228
        L_0x0225:
            r10 = 0
            r0.f132119e = r10
        L_0x0228:
            di3.d r10 = di3.C86312j.m106911c(r9)
            gy3.C87412m.m108593f(r10, r3)
            r11 = r10
            tf0.q1 r11 = (tf0.C13887q1) r11
            java.lang.String r3 = r0.f132122h
            if (r3 != 0) goto L_0x0239
            r13 = r21
            goto L_0x023a
        L_0x0239:
            r13 = r3
        L_0x023a:
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r10 = r3.mo62443b(r14)
            androidx.lifecycle.i0 r8 = r10.mo75002a(r8)
            rs1.s8 r8 = (rs1.C13442s8) r8
            te3.hj1 r8 = r8.mo12861q3()
            r16 = 0
            java.lang.Integer r17 = java.lang.Integer.valueOf(r17)
            r18 = 0
            r19 = 80
            r20 = 0
            r12 = r4
            r10 = r14
            r14 = r15
            r23 = r1
            r1 = r15
            r15 = r8
            ob0.y r8 = tf0.C13887q1.C13888a.m13305a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            ob0.b0 r11 = f40.C86709a0.m107524d()
            r11.mo123460f(r8)
            di3.d r8 = di3.C86312j.m106911c(r9)
            tf0.q1 r8 = (tf0.C13887q1) r8
            java.lang.String r11 = r0.f132122h
            if (r11 != 0) goto L_0x0274
            r11 = r21
        L_0x0274:
            te3.d51 r8 = r8.mo13343h4(r4, r11)
            if (r8 != 0) goto L_0x028a
            di3.d r8 = di3.C86312j.m106911c(r9)
            tf0.q1 r8 = (tf0.C13887q1) r8
            java.lang.String r9 = r0.f132122h
            if (r9 != 0) goto L_0x0286
            r9 = r21
        L_0x0286:
            r8.mo13325QY(r4, r9, r0)
            goto L_0x02a1
        L_0x028a:
            di3.d r8 = di3.C86312j.m106911c(r9)
            tf0.q1 r8 = (tf0.C13887q1) r8
            java.lang.String r9 = r0.f132122h
            if (r9 != 0) goto L_0x0296
            r9 = r21
        L_0x0296:
            te3.d51 r8 = r8.mo13343h4(r4, r9)
            if (r8 != 0) goto L_0x029d
            goto L_0x02a1
        L_0x029d:
            int r0 = r0.f132119e
            r8.f132119e = r0
        L_0x02a1:
            bl3.r$a r0 = r3.mo62443b(r10)
            bl3.c r0 = r0.mo62447c(r7)
            ht1.y2 r0 = (ht1.C8817y2) r0
            ht1.z2 r0 = r0.mo9643v2()
            r0.mo9648f0(r4)
            if (r1 != r6) goto L_0x02be
            android.content.Context r0 = r2.f173499A
            r3 = 2131828710(0x7f111fe6, float:1.9290369E38)
            java.lang.String r0 = r0.getString(r3)
            goto L_0x02c7
        L_0x02be:
            android.content.Context r0 = r2.f173499A
            r3 = 2131828708(0x7f111fe4, float:1.9290364E38)
            java.lang.String r0 = r0.getString(r3)
        L_0x02c7:
            java.lang.String r3 = "if (op == FinderAudience…                        }"
            gy3.C87412m.m108593f(r0, r3)
            android.content.Context r3 = r2.f173499A
            nj3.C76912y0.m92768g(r3, r0)
            r0 = r23
        L_0x02d3:
            r3 = r37
            cn1.C0868r0.m836j(r0, r2, r3, r5)
            android.content.Context r2 = r41.getContext()
            boolean r3 = r2 instanceof android.app.Activity
            if (r3 == 0) goto L_0x02e4
            r22 = r2
            android.app.Activity r22 = (android.app.Activity) r22
        L_0x02e4:
            r2 = r22
            r5.getClass()
            if (r2 == 0) goto L_0x03c7
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r2 = r3.mo62443b(r2)
            java.lang.Class<ln1.f> r3 = ln1.C10584f.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            java.lang.String r3 = "UICProvider.of(it).get(N…eReporterUIC::class.java)"
            gy3.C87412m.m108593f(r2, r3)
            ln1.f r2 = (ln1.C10584f) r2
            c30.g r3 = new c30.g
            r3.<init>()
            te3.a91 r4 = r0.f542e
            java.lang.String r4 = r4.f130379f
            java.lang.String r5 = "column_id"
            r3.mo145967r(r5, r4)
            java.lang.String r4 = java.lang.String.valueOf(r38)
            java.lang.String r5 = "card_index"
            r3.mo145967r(r5, r4)
            te3.d91 r4 = r0.f541d
            if (r4 == 0) goto L_0x0321
            te3.d51 r4 = r4.f132196d
            if (r4 == 0) goto L_0x0321
            java.lang.String r4 = r4.f132122h
            if (r4 != 0) goto L_0x0323
        L_0x0321:
            r4 = r21
        L_0x0323:
            java.lang.String r5 = "Noticeid"
            r3.mo145967r(r5, r4)
            if (r1 != r6) goto L_0x032d
            ak1.k0 r1 = ak1.C0077k0.Book
            goto L_0x032f
        L_0x032d:
            ak1.k0 r1 = ak1.C0077k0.Cancle
        L_0x032f:
            te3.d91 r4 = r0.f541d
            if (r4 == 0) goto L_0x033b
            com.tencent.mm.protocal.protobuf.FinderContact r5 = r4.f132197e
            if (r5 == 0) goto L_0x033b
            java.lang.String r5 = r5.username
            if (r5 != 0) goto L_0x033d
        L_0x033b:
            r5 = r21
        L_0x033d:
            if (r4 == 0) goto L_0x0347
            te3.d51 r4 = r4.f132196d
            if (r4 == 0) goto L_0x0347
            java.lang.String r4 = r4.f132122h
            if (r4 != 0) goto L_0x0349
        L_0x0347:
            r4 = r21
        L_0x0349:
            java.lang.String r3 = r3.toString()
            java.lang.String r7 = "chnlExtra.toString()"
            gy3.C87412m.m108593f(r3, r7)
            java.lang.String r7 = ","
            java.lang.String r8 = ";"
            r9 = 0
            java.lang.String r3 = z04.C112551y.m153814n(r3, r7, r8, r9)
            te3.d91 r0 = r0.f541d
            if (r0 == 0) goto L_0x0367
            te3.d51 r0 = r0.f132196d
            if (r0 == 0) goto L_0x0367
            java.lang.String r0 = r0.f132122h
            if (r0 != 0) goto L_0x0369
        L_0x0367:
            r0 = r21
        L_0x0369:
            com.tencent.mm.autogen.mmdata.rpt.FinderLiveNoticeLogStruct r7 = new com.tencent.mm.autogen.mmdata.rpt.FinderLiveNoticeLogStruct
            r7.<init>()
            java.lang.String r8 = "FinderUsrName"
            java.lang.String r5 = r7.mo86045b(r8, r5, r6)
            r7.f9853d = r5
            long r8 = java.lang.System.currentTimeMillis()
            r7.f9855f = r8
            java.lang.String r5 = "ActionTimeMs"
            r7.mo86046c(r5, r8)
            int r1 = r1.f484d
            long r8 = (long) r1
            r7.f9856g = r8
            java.lang.String r1 = r2.f31926h
            if (r1 != 0) goto L_0x038c
            r1 = r21
        L_0x038c:
            java.lang.String r2 = "commentscene"
            java.lang.String r1 = r7.mo86045b(r2, r1, r6)
            r7.f9859j = r1
            java.lang.Class<kq.h> r1 = p185kq.C10383h.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            kq.h r1 = (p185kq.C10383h) r1
            java.lang.String r1 = r1.mo10696E()
            if (r1 != 0) goto L_0x03a4
            r1 = r21
        L_0x03a4:
            java.lang.String r2 = "contextid"
            java.lang.String r1 = r7.mo86045b(r2, r1, r6)
            r7.f9860k = r1
            java.lang.String r1 = "NotificationId"
            java.lang.String r1 = r7.mo86045b(r1, r4, r6)
            r7.f9866q = r1
            java.lang.String r1 = "chnlExtra"
            java.lang.String r1 = r7.mo86045b(r1, r3, r6)
            r7.f9872w = r1
            java.lang.String r1 = "NoticeID"
            java.lang.String r0 = r7.mo86045b(r1, r0, r6)
            r7.f9873x = r0
            r7.mo86054n()
        L_0x03c7:
            java.lang.String r0 = "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/NoticeConvert$onBindViewHolder$7$1"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r40
            j20.C117292a.m165361g(r4, r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cn1.C0863p0.onClick(android.view.View):void");
    }
}
