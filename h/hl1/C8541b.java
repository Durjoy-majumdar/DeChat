package hl1;

import a14.C0000n0;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import fy3.C32227p;
import gy3.C8477a0;
import ob0.C117747y;
import rx3.C13598b0;
import wx3.C15601d;
import yx3.C91590f;
import yx3.C91594j;

@C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.viewmodel.state.visitor.FinderLiveVisitorEndUIC$onSceneEnd$1", mo125469f = "FinderLiveVisitorEndUIC.kt", mo125470l = {204}, mo125471m = "invokeSuspend")
/* renamed from: hl1.b */
public final class C8541b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

    /* renamed from: d */
    public int f27605d;

    /* renamed from: e */
    public final /* synthetic */ FinderContact f27606e;

    /* renamed from: f */
    public final /* synthetic */ C59974g f27607f;

    /* renamed from: g */
    public final /* synthetic */ C8477a0 f27608g;

    /* renamed from: h */
    public final /* synthetic */ C117747y f27609h;

    /* renamed from: i */
    public final /* synthetic */ C8477a0 f27610i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8541b(FinderContact finderContact, C59974g gVar, C8477a0 a0Var, C117747y yVar, C8477a0 a0Var2, C15601d<? super C8541b> dVar) {
        super(2, dVar);
        this.f27606e = finderContact;
        this.f27607f = gVar;
        this.f27608g = a0Var;
        this.f27609h = yVar;
        this.f27610i = a0Var2;
    }

    public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
        return new C8541b(this.f27606e, this.f27607f, this.f27608g, this.f27609h, this.f27610i, dVar);
    }

    public Object invoke(Object obj, Object obj2) {
        return ((C8541b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        r6 = r6.authInfo;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0257, code lost:
        if (r13.f36492G.getVisibility() == 0) goto L_0x025b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            r26 = this;
            r0 = r26
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            xx3.a r2 = xx3.C15911a.COROUTINE_SUSPENDED
            int r3 = r0.f27605d
            r4 = 1
            if (r3 == 0) goto L_0x0019
            if (r3 != r4) goto L_0x0011
            kotlin.ResultKt.throwOnFailure(r27)
            goto L_0x0044
        L_0x0011:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0019:
            kotlin.ResultKt.throwOnFailure(r27)
            com.tencent.mm.protocal.protobuf.FinderContact r3 = r0.f27606e
            if (r3 == 0) goto L_0x0044
            java.lang.String r5 = r3.headUrl
            if (r5 == 0) goto L_0x0044
            hl1.g r6 = r0.f27607f
            qj1.xf r7 = r6.f171121i
            if (r7 == 0) goto L_0x0044
            java.lang.String r3 = r3.username
            if (r3 != 0) goto L_0x0036
            androidx.lifecycle.i0 r3 = r6.mo83051g(r1)
            cl1.o r3 = (cl1.C54991o) r3
            java.lang.String r3 = r3.f154345o
        L_0x0036:
            java.lang.String r6 = "contact.username ?: busi…lass.java).anchorUsername"
            gy3.C87412m.m108593f(r3, r6)
            r0.f27605d = r4
            java.lang.Object r3 = r7.mo12284h1(r5, r3, r0)
            if (r3 != r2) goto L_0x0044
            return r2
        L_0x0044:
            hl1.g r2 = r0.f27607f
            qj1.xf r3 = r2.f171121i
            if (r3 == 0) goto L_0x0069
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r0.f27606e
            if (r6 == 0) goto L_0x0055
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r6 = r6.authInfo
            if (r6 == 0) goto L_0x0055
            java.lang.String r6 = r6.authProfession
            goto L_0x0056
        L_0x0055:
            r6 = 0
        L_0x0056:
            androidx.lifecycle.i0 r1 = r2.mo83051g(r1)
            cl1.o r1 = (cl1.C54991o) r1
            int r1 = r1.f154247R0
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r0.f27606e
            if (r2 == 0) goto L_0x0065
            com.tencent.mm.protocal.protobuf.FinderAuthInfo r2 = r2.authInfo
            goto L_0x0066
        L_0x0065:
            r2 = 0
        L_0x0066:
            r3.mo12279b1(r6, r1, r2)
        L_0x0069:
            gy3.a0 r1 = r0.f27608g
            hl1.g r2 = r0.f27607f
            qj1.xf r2 = r2.f171121i
            r3 = 0
            if (r2 == 0) goto L_0x0087
            ob0.y r6 = r0.f27609h
            zh0.b r6 = (zh0.C16196b) r6
            te3.d51 r6 = r6.mo10100N0()
            ob0.y r7 = r0.f27609h
            zh0.b r7 = (zh0.C16196b) r7
            com.tencent.mm.protocal.protobuf.FinderObject r7 = r7.mo10099A()
            boolean r2 = r2.mo12286j1(r6, r7)
            goto L_0x0088
        L_0x0087:
            r2 = 0
        L_0x0088:
            r1.f27482d = r2
            ob0.y r1 = r0.f27609h
            zh0.b r1 = (zh0.C16196b) r1
            java.util.List r1 = r1.getMediaList()
            if (r1 == 0) goto L_0x0260
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x009d:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x00b5
            java.lang.Object r6 = r1.next()
            r7 = r6
            com.tencent.mm.plugin.finder.storage.FinderItem r7 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r7
            boolean r7 = r7.isLiveFeed()
            r7 = r7 ^ r4
            if (r7 == 0) goto L_0x009d
            r2.add(r6)
            goto L_0x009d
        L_0x00b5:
            gy3.a0 r1 = r0.f27610i
            hl1.g r6 = r0.f27607f
            ob0.y r7 = r0.f27609h
            qj1.xf r13 = r6.f171121i
            if (r13 == 0) goto L_0x025d
            zh0.b r7 = (zh0.C16196b) r7
            pe3.b r14 = r7.getLastBuffer()
            boolean r6 = r13.f36500P
            if (r6 == 0) goto L_0x00cb
            goto L_0x025a
        L_0x00cb:
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L_0x0251
            android.view.ViewGroup r6 = r13.f36492G
            int r6 = r6.getVisibility()
            if (r6 != 0) goto L_0x00db
            goto L_0x0251
        L_0x00db:
            android.view.View r6 = r13.f36510w
            r7 = 8
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r9 = k20.C60958c.f173611a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8.mo10233c(r7)
            java.lang.Object[] r16 = r8.mo10232b()
            java.lang.String r17 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin"
            java.lang.String r18 = "showAnchorVideosIfNeeded"
            java.lang.String r19 = "(Ljava/util/List;Lcom/tencent/mm/protobuf/ByteString;)Z"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            r15 = r6
            j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.Object r7 = r8.mo10231a(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.setVisibility(r7)
            java.lang.String r16 = "com/tencent/mm/plugin/finder/live/plugin/FinderLiveVisitorAfterPlugin"
            java.lang.String r17 = "showAnchorVideosIfNeeded"
            java.lang.String r18 = "(Ljava/util/List;Lcom/tencent/mm/protobuf/ByteString;)Z"
            java.lang.String r19 = "android/view/View_EXEC_"
            java.lang.String r20 = "setVisibility"
            java.lang.String r21 = "(I)V"
            j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
            r13.mo12281e1(r3)
            java.util.Iterator r15 = r2.iterator()
            r9 = 0
        L_0x0129:
            boolean r6 = r15.hasNext()
            if (r6 == 0) goto L_0x025b
            java.lang.Object r6 = r15.next()
            int r16 = r9 + 1
            if (r9 < 0) goto L_0x024c
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r6
            r7 = 3
            if (r9 >= r7) goto L_0x0247
            java.util.LinkedList r6 = r6.getMediaList()
            boolean r6 = r6.isEmpty()
            if (r6 == 0) goto L_0x0148
            goto L_0x0247
        L_0x0148:
            if (r9 == 0) goto L_0x0154
            if (r9 == r4) goto L_0x0150
            r6 = 2131316230(0x7f094e06, float:1.8250936E38)
            goto L_0x0157
        L_0x0150:
            r6 = 2131316242(0x7f094e12, float:1.825096E38)
            goto L_0x0157
        L_0x0154:
            r6 = 2131316194(0x7f094de2, float:1.8250863E38)
        L_0x0157:
            java.lang.Object r7 = r2.get(r9)
            r17 = r7
            com.tencent.mm.plugin.finder.storage.FinderItem r17 = (com.tencent.p014mm.plugin.finder.storage.FinderItem) r17
            java.util.LinkedList r7 = r17.getMediaList()
            java.lang.Object r7 = sx3.C110818d0.m150916N(r7)
            r12 = r7
            te3.rq2 r12 = (te3.C64689rq2) r12
            if (r12 != 0) goto L_0x016e
            goto L_0x0247
        L_0x016e:
            android.view.ViewGroup r7 = r13.f166287d
            android.view.View r6 = r7.findViewById(r6)
            r11 = r6
            android.view.ViewGroup r11 = (android.view.ViewGroup) r11
            r11.setVisibility(r3)
            qj1.zf r10 = new qj1.zf
            r6 = r10
            r7 = r13
            r8 = r2
            r3 = r10
            r10 = r14
            r25 = r11
            r5 = r12
            r12 = r17
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r6 = r25
            r6.setOnClickListener(r3)
            r3 = 2131300530(0x7f0910b2, float:1.8219092E38)
            android.view.View r3 = r6.findViewById(r3)
            java.lang.String r7 = "videoView.findViewById(R.id.cover_img)"
            gy3.C87412m.m108593f(r3, r7)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            java.lang.String r7 = r5.f185283w
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 == 0) goto L_0x01bc
            pl1.b0 r7 = new pl1.b0
            up1.y r20 = up1.C27696y.THUMB_IMAGE
            r21 = 0
            r22 = 0
            r23 = 12
            r24 = 0
            r18 = r7
            r19 = r5
            r18.<init>(r19, r20, r21, r22, r23, r24)
            qj1.C12738xf.m12230c1(r3, r13, r7)
            goto L_0x01d0
        L_0x01bc:
            pl1.o0 r7 = new pl1.o0
            up1.y r20 = up1.C27696y.RAW_IMAGE
            r21 = 0
            r22 = 4
            r23 = 0
            r18 = r7
            r19 = r5
            r18.<init>(r19, r20, r21, r22, r23)
            qj1.C12738xf.m12230c1(r3, r13, r7)
        L_0x01d0:
            r3 = 2131307275(0x7f092b0b, float:1.8232773E38)
            android.view.View r3 = r6.findViewById(r3)
            java.lang.String r5 = "videoView.findViewById(R.id.like_count_tv)"
            gy3.C87412m.m108593f(r3, r5)
            android.widget.TextView r3 = (android.widget.TextView) r3
            int r5 = r17.getLikeCount()
            java.lang.String r5 = er1.C7878t0.m8034c(r4, r5)
            r3.setText(r5)
            java.lang.Class<ak1.w> r3 = ak1.C54116w.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ak1.w r3 = (ak1.C54116w) r3
            com.tencent.mm.protocal.protobuf.FinderObject r5 = r17.getFeedObject()
            long r5 = r5.f164794id
            java.lang.String r5 = o40.C61926c.m72691p(r5)
            r3.getClass()
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.lang.String r6 = "page_id"
            java.lang.String r7 = "1002"
            r3.put(r6, r7)
            java.lang.String r7 = "feed_id"
            r3.put(r7, r5)
            java.lang.Class<ak1.o> r5 = ak1.C54108o.class
            di3.d r5 = di3.C86312j.m106911c(r5)
            ak1.o r5 = (ak1.C54108o) r5
            ak1.f0$n r8 = ak1.C54067f0.C0066n.LIVE_END_FEED
            r5.mo9602Jz(r8, r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "report23057, page_id = "
            r5.append(r8)
            java.lang.Object r6 = r3.get(r6)
            java.lang.String r6 = (java.lang.String) r6
            r5.append(r6)
            java.lang.String r6 = ", feed_id = "
            r5.append(r6)
            java.lang.Object r3 = r3.get(r7)
            java.lang.String r3 = (java.lang.String) r3
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            java.lang.String r5 = "HABBYGE-MALI.HellLiveVisitorReoprter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r3)
        L_0x0247:
            r9 = r16
            r3 = 0
            goto L_0x0129
        L_0x024c:
            sx3.C64197v.m75542k()
            r1 = 0
            throw r1
        L_0x0251:
            android.view.ViewGroup r2 = r13.f36492G
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x025a
            goto L_0x025b
        L_0x025a:
            r4 = 0
        L_0x025b:
            r3 = r4
            goto L_0x025e
        L_0x025d:
            r3 = 0
        L_0x025e:
            r1.f27482d = r3
        L_0x0260:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "#onSceneEnd isNextLiveShown="
            r1.append(r2)
            gy3.a0 r2 = r0.f27608g
            boolean r2 = r2.f27482d
            r1.append(r2)
            java.lang.String r2 = " isAnchorVideoShown="
            r1.append(r2)
            gy3.a0 r2 = r0.f27610i
            boolean r2 = r2.f27482d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Finder.FinderLiveVisitorEndUIC"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: hl1.C8541b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
