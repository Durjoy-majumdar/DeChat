package ao1;

import android.view.View;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.post.PostMainUIC;
import fy3.C32224a;
import gy3.C87413o;
import rx3.C13598b0;

/* renamed from: ao1.x0 */
public final class C0190x0 implements View.OnClickListener {

    /* renamed from: d */
    public final /* synthetic */ PostMainUIC f655d;

    /* renamed from: e */
    public final /* synthetic */ boolean[] f656e;

    /* renamed from: f */
    public final /* synthetic */ MMActivity f657f;

    /* renamed from: ao1.x0$a */
    public static final class C0191a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ PostMainUIC f658d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0191a(PostMainUIC postMainUIC) {
            super(0);
            this.f658d = postMainUIC;
        }

        public Object invoke() {
            this.f658d.mo78411G3().performClick();
            return C13598b0.f38549a;
        }
    }

    public C0190x0(PostMainUIC postMainUIC, boolean[] zArr, MMActivity mMActivity) {
        this.f655d = postMainUIC;
        this.f656e = zArr;
        this.f657f = mMActivity;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0153, code lost:
        if ((ao1.C0166l.f618h.length() > 0) != false) goto L_0x0157;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r6 = r19
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = r20
            r0.add(r1)
            java.lang.Object[] r5 = r0.toArray()
            r0.clear()
            java.lang.String r0 = "com/tencent/mm/plugin/finder/post/PostMainUIC$initView$7"
            java.lang.String r1 = "android/view/View$OnClickListener"
            java.lang.String r2 = "onClick"
            java.lang.String r3 = "(Landroid/view/View;)V"
            r4 = r19
            j20.C117292a.m165356b(r0, r1, r2, r3, r4, r5)
            com.tencent.mm.plugin.finder.post.PostMainUIC r0 = r6.f655d
            dp1.t0 r1 = dp1.C58408t0.f167336a
            android.app.Activity r0 = r0.getContext()
            r2 = 66
            r1.mo83263i(r0, r2)
            zc1.b r0 = zc1.C66785b.f191882e
            java.lang.String r1 = r0.mo90662O5()
            bd1.h r1 = r0.mo90663P2(r1)
            r2 = 1
            java.lang.String r3 = "(Landroid/view/View;)V"
            java.lang.String r4 = "onClick"
            java.lang.String r5 = "android/view/View$OnClickListener"
            java.lang.String r7 = "com/tencent/mm/plugin/finder/post/PostMainUIC$initView$7"
            if (r1 == 0) goto L_0x005a
            com.tencent.mm.plugin.finder.post.PostMainUIC r8 = r6.f655d
            int r1 = r1.f818a
            if (r1 != r2) goto L_0x005a
            android.app.Activity r0 = r8.getContext()
            r1 = 2131829472(0x7f1122e0, float:1.9291914E38)
            java.lang.String r1 = r8.getString(r1)
            nj3.C76912y0.m92767f(r0, r1)
            j20.C117292a.m165361g(r6, r7, r5, r4, r3)
            return
        L_0x005a:
            com.tencent.mm.plugin.finder.post.PostMainUIC r1 = r6.f655d
            fe1.q r1 = r1.f160273g
            r8 = 0
            if (r1 == 0) goto L_0x0069
            boolean r1 = r1.mo84190n2()
            if (r1 != r2) goto L_0x0069
            r1 = 1
            goto L_0x006a
        L_0x0069:
            r1 = 0
        L_0x006a:
            if (r1 == 0) goto L_0x0082
            com.tencent.mm.plugin.finder.post.PostMainUIC r0 = r6.f655d
            android.app.Activity r0 = r0.getContext()
            com.tencent.mm.plugin.finder.post.PostMainUIC r1 = r6.f655d
            r2 = 2131829473(0x7f1122e1, float:1.9291916E38)
            java.lang.String r1 = r1.getString(r2)
            nj3.C76912y0.m92767f(r0, r1)
            j20.C117292a.m165361g(r6, r7, r5, r4, r3)
            return
        L_0x0082:
            boolean[] r1 = r6.f656e
            boolean r9 = r1[r8]
            if (r9 == 0) goto L_0x008b
            r1[r8] = r8
            goto L_0x00aa
        L_0x008b:
            tc2.g r1 = tc2.C118418g.INSTANCE
            java.lang.String r9 = "ce_feed_publish"
            java.lang.String r10 = "<FeedPublish>"
            r1.w40(r9, r10)
            r11 = 0
            r13 = 0
            r15 = 1
            r16 = 0
            r17 = 0
            r18 = 65535(0xffff, float:9.1834E-41)
            android.view.MotionEvent r10 = android.view.MotionEvent.obtain(r11, r13, r15, r16, r17, r18)
            r1.mo175827n9(r9, r10)
            r1.ec0(r9)
        L_0x00aa:
            dp1.f2 r1 = dp1.C7435f2.f25626a
            rs1.s8$a r9 = rs1.C13442s8.f38060Q0
            com.tencent.mm.plugin.finder.post.PostMainUIC r10 = r6.f655d
            android.app.Activity r10 = r10.getContext()
            rs1.s8 r9 = r9.mo12873f(r10)
            r10 = 0
            if (r9 == 0) goto L_0x00c0
            te3.hj1 r9 = r9.mo12861q3()
            goto L_0x00c1
        L_0x00c0:
            r9 = r10
        L_0x00c1:
            com.tencent.mm.plugin.finder.post.PostMainUIC r11 = r6.f655d
            org.json.JSONObject r11 = r11.f160260N
            java.lang.String r12 = "song_finish_publish"
            r1.mo8577a(r9, r12, r2, r11)
            bl3.r r1 = bl3.C39818r.f106831a
            com.tencent.mm.ui.MMActivity r9 = r6.f657f
            bl3.r$a r9 = r1.mo62444c(r9)
            java.lang.Class<ao1.d1> r11 = ao1.C0145d1.class
            androidx.lifecycle.i0 r9 = r9.mo75002a(r11)
            java.lang.String r11 = "UICProvider.of(activity)…tPreCheckUIC::class.java)"
            gy3.C87412m.m108593f(r9, r11)
            ao1.d1 r9 = (ao1.C0145d1) r9
            ao1.x0$a r11 = new ao1.x0$a
            com.tencent.mm.plugin.finder.post.PostMainUIC r12 = r6.f655d
            r11.<init>(r12)
            boolean r9 = r9.mo136d3(r11, r10)
            if (r9 != 0) goto L_0x00f1
            j20.C117292a.m165361g(r6, r7, r5, r4, r3)
            return
        L_0x00f1:
            java.lang.String r0 = r0.mo90662O5()
            com.tencent.mm.ui.MMActivity r9 = r6.f657f
            bl3.r$a r9 = r1.mo62444c(r9)
            java.lang.Class<ao1.m1> r11 = ao1.C54270m1.class
            androidx.lifecycle.i0 r9 = r9.mo75002a(r11)
            ao1.m1 r9 = (ao1.C54270m1) r9
            java.lang.String r9 = r9.mo75060c3()
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 == 0) goto L_0x01a6
            com.tencent.mm.ui.MMActivity r0 = r6.f657f
            bl3.r$a r0 = r1.mo62444c(r0)
            java.lang.Class<ao1.l> r1 = ao1.C0166l.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            java.lang.String r1 = "UICProvider.of(activity)…teContactUIC::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            ao1.l r0 = (ao1.C0166l) r0
            com.tencent.mm.plugin.finder.post.PostMainUIC r1 = r6.f655d
            int r1 = r1.f160262Q
            r11 = 20
            if (r1 != r11) goto L_0x016b
            up1.f r1 = up1.C37521f.f99374d
            r1.getClass()
            pe1.c<java.lang.Integer> r1 = up1.C37521f.f99580z8
            java.lang.Object r1 = r1.mo60266n()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            if (r1 != r2) goto L_0x016b
            java.lang.String r1 = ao1.C0166l.f617g
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0145
            r1 = 1
            goto L_0x0146
        L_0x0145:
            r1 = 0
        L_0x0146:
            if (r1 == 0) goto L_0x0156
            java.lang.String r1 = ao1.C0166l.f618h
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0152
            r1 = 1
            goto L_0x0153
        L_0x0152:
            r1 = 0
        L_0x0153:
            if (r1 == 0) goto L_0x0156
            goto L_0x0157
        L_0x0156:
            r2 = 0
        L_0x0157:
            if (r2 == 0) goto L_0x0167
            qo3.w r0 = r0.f619d
            if (r0 == 0) goto L_0x0161
            r0.mo5086o()
            goto L_0x01a2
        L_0x0161:
            java.lang.String r0 = "bottomSheet"
            gy3.C87412m.m108603p(r0)
            throw r10
        L_0x0167:
            r0.mo156c3()
            goto L_0x01a2
        L_0x016b:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            boolean r1 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r9)
            java.lang.String r9 = "key_create_scene"
            if (r1 == 0) goto L_0x017d
            r1 = 4
            r0.putExtra(r9, r1)
            goto L_0x0181
        L_0x017d:
            r1 = 5
            r0.putExtra(r9, r1)
        L_0x0181:
            java.lang.String r1 = "key_router_to_profile"
            r0.putExtra(r1, r8)
            java.lang.Class<er1.b> r1 = er1.C58684b.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            er1.b r1 = (er1.C58684b) r1
            com.tencent.mm.ui.MMActivity r9 = r6.f657f
            r1.mo13297zc(r9, r0)
            com.tencent.mm.plugin.report.service.n r0 = com.tencent.p014mm.plugin.report.service.C115669n.INSTANCE
            r1 = 20694(0x50d6, float:2.8998E-41)
            java.lang.Object[] r9 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r9[r8] = r2
            r0.mo160131h(r1, r9)
        L_0x01a2:
            j20.C117292a.m165361g(r6, r7, r5, r4, r3)
            return
        L_0x01a6:
            com.tencent.mm.plugin.finder.post.PostMainUIC r0 = r6.f655d
            bt1.e r1 = r0.mo78410F3()
            boolean r1 = r1.mo75460h()
            if (r1 == 0) goto L_0x01d9
            java.util.LinkedList r0 = r0.mo78433o3(r8)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x01bd
            goto L_0x01d7
        L_0x01bd:
            java.util.Iterator r0 = r0.iterator()
        L_0x01c1:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x01d7
            java.lang.Object r1 = r0.next()
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r1 = (com.tencent.p014mm.protocal.protobuf.FinderJumpInfo) r1
            int r1 = r1.business_type
            if (r1 != r2) goto L_0x01d3
            r1 = 1
            goto L_0x01d4
        L_0x01d3:
            r1 = 0
        L_0x01d4:
            if (r1 == 0) goto L_0x01c1
            goto L_0x01d9
        L_0x01d7:
            r0 = 0
            goto L_0x01da
        L_0x01d9:
            r0 = 1
        L_0x01da:
            if (r0 != 0) goto L_0x01f0
            com.tencent.mm.ui.MMActivity r0 = r6.f657f
            android.content.res.Resources r1 = r0.getResources()
            r2 = 2131829552(0x7f112330, float:1.9292076E38)
            java.lang.String r1 = r1.getString(r2)
            nj3.C76912y0.m92773l(r0, r1)
            j20.C117292a.m165361g(r6, r7, r5, r4, r3)
            return
        L_0x01f0:
            com.tencent.mm.plugin.finder.post.PostMainUIC r0 = r6.f655d
            long r11 = r0.f160264S
            r13 = 0
            int r1 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r1 == 0) goto L_0x0206
            bt1.e r0 = r0.mo78410F3()
            boolean r0 = r0.mo75460h()
            if (r0 == 0) goto L_0x0206
            r0 = 1
            goto L_0x0207
        L_0x0206:
            r0 = 0
        L_0x0207:
            if (r0 == 0) goto L_0x023a
            com.tencent.mm.plugin.finder.post.PostMainUIC r0 = r6.f655d
            r0.getClass()
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r1 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.FinderCommonFeatureService r1 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r1
            up1.p r1 = r1.Dx0()
            long r8 = r0.f160264S
            com.tencent.mm.plugin.finder.storage.FinderItem r1 = r1.mo13662Lo(r8)
            if (r1 == 0) goto L_0x0236
            java.lang.Class<lr.b> r2 = p599lr.C61381b.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            lr.b r2 = (p599lr.C61381b) r2
            qo1.g r2 = r2.mo78545UQ()
            r2.mo12413f(r1)
            java.lang.String r1 = ""
            r0.mo78422T3(r1)
        L_0x0236:
            j20.C117292a.m165361g(r6, r7, r5, r4, r3)
            return
        L_0x023a:
            com.tencent.mm.plugin.finder.post.PostMainUIC r0 = r6.f655d
            int r1 = r0.f160259M
            if (r1 != 0) goto L_0x0314
            dr1.y r1 = r0.f160247A
            if (r1 == 0) goto L_0x030e
            ao1.m0 r9 = new ao1.m0
            r9.<init>(r0)
            com.tencent.mm.plugin.finder.view.FinderPostOriginView r0 = r1.f25759a
            r0.getClass()
            boolean r1 = r0.f17925z
            if (r1 != 0) goto L_0x0308
            boolean r1 = r0.f17913n
            if (r1 != 0) goto L_0x0308
            boolean r1 = r0.f17915p
            if (r1 != 0) goto L_0x0308
            boolean r1 = r0.f17905A
            if (r1 == 0) goto L_0x0308
            com.tencent.mm.ui.widget.MMSwitchBtn r1 = r0.f17908f
            boolean r1 = r1.f220433y
            if (r1 == 0) goto L_0x0267
            r11 = 1
            goto L_0x0268
        L_0x0267:
            r11 = r13
        L_0x0268:
            int r1 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r1 != 0) goto L_0x0308
            r0.f17925z = r2
            android.content.Context r1 = r0.getContext()
            android.view.LayoutInflater r1 = com.tencent.p014mm.p136ui.C85868k2.m106137b(r1)
            r11 = 2131495432(0x7f0c0a08, float:1.86144E38)
            android.view.View r1 = r1.inflate(r11, r10, r8)
            r11 = 2131304580(0x7f092084, float:1.8227307E38)
            android.view.View r11 = r1.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r12 = 1061997773(0x3f4ccccd, float:0.8)
            if (r11 == 0) goto L_0x0292
            android.text.TextPaint r11 = r11.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r11, r12)
        L_0x0292:
            android.content.Context r11 = r0.getContext()
            android.content.res.Resources r11 = r11.getResources()
            r13 = 2131829391(0x7f11228f, float:1.929175E38)
            java.lang.String r11 = r11.getString(r13)
            java.lang.String r13 = "context.resources.getStr…r_original_post_directly)"
            gy3.C87412m.m108593f(r11, r13)
            com.tencent.mm.plugin.finder.view.o4 r13 = new com.tencent.mm.plugin.finder.view.o4
            r13.<init>(r9)
            yr1.a r9 = new yr1.a
            r9.<init>(r11, r2, r2, r13)
            android.content.Context r2 = r0.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r11 = 2131829507(0x7f112303, float:1.9291985E38)
            java.lang.String r2 = r2.getString(r11)
            java.lang.String r11 = "context.resources.getStr…r_post_origin_notice_btn)"
            gy3.C87412m.m108593f(r2, r11)
            com.tencent.mm.plugin.finder.view.p4 r11 = new com.tencent.mm.plugin.finder.view.p4
            r11.<init>(r0)
            yr1.a r13 = new yr1.a
            r13.<init>(r2, r8, r8, r11)
            r2 = 32
            java.lang.String r8 = "original_statement_screen"
            r0.mo4670g(r1, r8, r2, r10)
            yr1.b r2 = yr1.C16061b.f43199a
            android.content.Context r8 = r0.getContext()
            java.lang.String r11 = "context"
            gy3.C87412m.m108593f(r8, r11)
            qo3.e0 r1 = r2.mo14680c(r8, r1, r9, r13)
            android.widget.Button r2 = r1.f296394t
            android.text.TextPaint r2 = r2.getPaint()
            com.tencent.p014mm.p136ui.C85875k4.m106189j0(r2, r12)
            android.widget.Button r2 = r1.f296394t
            java.lang.String r8 = "dialog.btnLeft"
            gy3.C87412m.m108593f(r2, r8)
            java.lang.String r8 = "original_statement_publish"
            r9 = 8
            r0.mo4670g(r2, r8, r9, r10)
            android.widget.Button r1 = r1.f296395u
            java.lang.String r2 = "dialog.btnRight"
            gy3.C87412m.m108593f(r1, r2)
            java.lang.String r2 = "original_statement_state"
            r0.mo4670g(r1, r2, r9, r10)
            goto L_0x0314
        L_0x0308:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.invoke(r0)
            goto L_0x0314
        L_0x030e:
            java.lang.String r0 = "postOriginWidget"
            gy3.C87412m.m108603p(r0)
            throw r10
        L_0x0314:
            j20.C117292a.m165361g(r6, r7, r5, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ao1.C0190x0.onClick(android.view.View):void");
    }
}
