package pp1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.accessibility.base.MapExpandKt;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import fj1.C45795b;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import jq3.C9507n;
import ok1.C62042e;
import rx3.C13598b0;
import te3.C50770p21;
import wc1.C15064b;
import zp3.C23555k;

/* renamed from: pp1.b */
public final class C62427b extends C9507n {

    /* renamed from: A */
    public ImageView f177399A;

    /* renamed from: B */
    public TextView f177400B;

    /* renamed from: C */
    public TextView f177401C;

    /* renamed from: D */
    public TextView f177402D;

    /* renamed from: E */
    public TextView f177403E;

    /* renamed from: F */
    public TextView f177404F;

    /* renamed from: G */
    public TextView f177405G;

    /* renamed from: H */
    public FinderLiveShopPromoteContainer f177406H;

    /* renamed from: pp1.b$a */
    public static final class C62428a extends C87413o implements C32226l<View, C13598b0> {

        /* renamed from: d */
        public static final C62428a f177407d = new C62428a();

        public C62428a() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            C15064b.m14232g(C15064b.f41199a, view, false, 1, (Object) null);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: pp1.b$b */
    public static final class C62429b extends C23555k.C23562d {

        /* renamed from: a */
        public final /* synthetic */ C62427b f177408a;

        /* renamed from: b */
        public final /* synthetic */ C50770p21 f177409b;

        public C62429b(C62427b bVar, C50770p21 p212) {
            this.f177408a = bVar;
            this.f177409b = p212;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
            r9 = ((cl1.C55001u) (r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A).mo71262a(cl1.C55001u.class)).f154420q;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo53b(android.view.View r20, long r21, long r23, boolean r25) {
            /*
                r19 = this;
                r0 = r19
                java.lang.String r1 = "view"
                r2 = r20
                gy3.C87412m.m108594g(r2, r1)
                if (r25 == 0) goto L_0x00f1
                pp1.b r1 = r0.f177408a
                te3.p21 r2 = r0.f177409b
                r1.getClass()
                java.lang.Class<kq.h> r3 = p185kq.C10383h.class
                te3.o21 r4 = r2.f139534d
                java.lang.String r5 = ""
                if (r4 == 0) goto L_0x0023
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = r4.f138912d
                if (r4 == 0) goto L_0x0023
                java.lang.String r4 = r4.jump_id
                if (r4 != 0) goto L_0x0024
            L_0x0023:
                r4 = r5
            L_0x0024:
                c30.g r14 = new c30.g
                r14.<init>()
                java.lang.String r6 = "liuzi_component_id"
                r14.put(r6, r4)
                boolean r1 = r1.mo87479z()
                if (r1 == 0) goto L_0x0063
                r1 = 17
                java.lang.String r2 = "type"
                r14.mo145953n(r2, r1)
                java.lang.Class<ak1.o> r1 = ak1.C54108o.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                java.lang.String r2 = "getService(HellLiveReport::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                ht1.j5 r1 = (ht1.C8777j5) r1
                ak1.g0 r2 = ak1.C0073g0.LIVE_ANCHOR_ACTION_COMMERCE
                java.lang.String r3 = r14.toString()
                r4 = 0
                r5 = 4
                r6 = 0
                r20 = r1
                r21 = r2
                r22 = r3
                r23 = r4
                r24 = r5
                r25 = r6
                ht1.C8777j5.C8778a.m8605f(r20, r21, r22, r23, r24, r25)
                goto L_0x00f1
            L_0x0063:
                t91.c$a r1 = t91.C64208c.f181951a
                byte[] r4 = com.tencent.p014mm.sdk.platformtools.Util.getUuidRandom()
                java.lang.String r4 = r4.toString()
                te3.o21 r2 = r2.f139534d
                if (r2 == 0) goto L_0x007d
                com.tencent.mm.protocal.protobuf.FinderJumpInfo r2 = r2.f138912d
                if (r2 == 0) goto L_0x007d
                com.tencent.mm.protocal.protobuf.MiniAppInfo r2 = r2.mini_app_info
                if (r2 == 0) goto L_0x007d
                java.lang.String r2 = r2.app_id
                if (r2 != 0) goto L_0x007e
            L_0x007d:
                r2 = r5
            L_0x007e:
                di3.d r5 = di3.C86312j.m106911c(r3)
                kq.h r5 = (p185kq.C10383h) r5
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r6 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                r7 = 0
                if (r6 == 0) goto L_0x009d
                fj1.b r9 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
                if (r9 == 0) goto L_0x009d
                java.lang.Class<cl1.u> r10 = cl1.C55001u.class
                androidx.lifecycle.i0 r9 = r9.mo71262a(r10)
                cl1.u r9 = (cl1.C55001u) r9
                te3.c21 r9 = r9.f154420q
                if (r9 == 0) goto L_0x009d
                long r9 = r9.f182392d
                goto L_0x009e
            L_0x009d:
                r9 = r7
            L_0x009e:
                java.lang.String r5 = r5.mo10700XQ(r9)
                di3.d r3 = di3.C86312j.m106911c(r3)
                kq.h r3 = (p185kq.C10383h) r3
                if (r6 == 0) goto L_0x00b8
                fj1.b r6 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
                if (r6 == 0) goto L_0x00b8
                java.lang.Class<cl1.o> r7 = cl1.C54991o.class
                androidx.lifecycle.i0 r6 = r6.mo71262a(r7)
                cl1.o r6 = (cl1.C54991o) r6
                long r7 = r6.f154325i1
            L_0x00b8:
                java.lang.String r3 = r3.mo10700XQ(r7)
                java.lang.String r6 = ""
                r20 = r1
                r21 = r4
                r22 = r2
                r23 = r5
                r24 = r6
                r25 = r3
                r20.mo89033h(r21, r22, r23, r24, r25)
                java.lang.Class<ak1.w> r1 = ak1.C54116w.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                java.lang.String r2 = "getService(HellLiveVisitorReoprter::class.java)"
                gy3.C87412m.m108593f(r1, r2)
                r6 = r1
                ak1.w r6 = (ak1.C54116w) r6
                ak1.f0$r0 r7 = ak1.C54067f0.C54081r0.CommerceActionRetentionItemExposure
                r8 = 0
                r10 = 0
                r11 = 0
                r12 = 0
                r13 = 0
                r1 = 0
                r17 = 248(0xf8, float:3.48E-43)
                r18 = 0
                java.lang.String r9 = ""
                r3 = r14
                r14 = r1
                r16 = r3
                ak1.C54116w.Rx0(r6, r7, r8, r9, r10, r11, r12, r13, r14, r16, r17, r18)
            L_0x00f1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: pp1.C62427b.C62429b.mo53b(android.view.View, long, long, boolean):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62427b(View view) {
        super(view);
        C87412m.m108594g(view, "itemView");
        this.f177399A = (ImageView) view.findViewById(C0966R.C0970id.o3_);
        this.f177400B = (TextView) view.findViewById(C0966R.C0970id.o3a);
        this.f177401C = (TextView) view.findViewById(C0966R.C0970id.o3b);
        this.f177402D = (TextView) view.findViewById(C0966R.C0970id.o39);
        this.f177403E = (TextView) view.findViewById(C0966R.C0970id.o3d);
        this.f177404F = (TextView) view.findViewById(C0966R.C0970id.o38);
        this.f177405G = (TextView) view.findViewById(C0966R.C0970id.oid);
        this.f177406H = (FinderLiveShopPromoteContainer) view.findViewById(C0966R.C0970id.i8b);
        C62042e eVar = C62042e.f176370a;
        TextView textView = this.f177404F;
        C87412m.m108593f(textView, "actionBtn");
        C62042e.m72803Q1(eVar, textView, 0, 0, 6, (Object) null);
        this.f177401C.setTextSize(2, 15.0f);
        this.f177402D.setTextSize(2, 12.0f);
        this.f177403E.setTextSize(2, 12.0f);
        this.f177400B.setTextSize(2, 10.0f);
        this.f177404F.setTextSize(2, 14.0f);
        MapExpandKt.visitChild(view, C62428a.f177407d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0284  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0143  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0182  */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87478B(te3.C50770p21 r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.lang.Class<pl1.s0> r2 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r3 = ht1.C60200t1.class
            java.lang.String r4 = "item"
            gy3.C87412m.m108594g(r1, r4)
            android.view.View r4 = r0.f44854d
            java.lang.String r5 = "itemView"
            gy3.C87412m.m108593f(r4, r5)
            pp1.b$b r5 = new pp1.b$b
            r5.<init>(r0, r1)
            zp3.C23564m.m28138h(r4, r5)
            te3.o21 r4 = r1.f139534d
            if (r4 == 0) goto L_0x0024
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = r4.f138912d
            if (r4 != 0) goto L_0x0029
        L_0x0024:
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = new com.tencent.mm.protocal.protobuf.FinderJumpInfo
            r4.<init>()
        L_0x0029:
            java.lang.String r5 = r4.recommend_reason
            te3.n21 r6 = r1.f139535e
            r7 = 0
            if (r6 == 0) goto L_0x0034
            long r9 = r6.f138341f
            goto L_0x0035
        L_0x0034:
            r9 = r7
        L_0x0035:
            java.lang.String r6 = r4.icon_url
            java.lang.String r11 = r4.icon_name
            java.lang.String r4 = r4.wording
            bl3.r r12 = bl3.C39818r.f106831a
            bl3.r$a r12 = r12.mo62446e(r3)
            bl3.c r12 = r12.mo62447c(r2)
            pl1.s0 r12 = (pl1.C11990s0) r12
            k60.d r12 = r12.mo11870V()
            pl1.f r13 = new pl1.f
            r14 = 2
            r15 = 0
            r13.<init>(r6, r15, r14, r15)
            android.widget.ImageView r6 = r0.f177399A
            java.lang.String r14 = "productImg"
            gy3.C87412m.m108593f(r6, r14)
            pl1.e0$a r14 = pl1.C11978e0.C11979a.LIVE_SHOPPING_DEFAULT
            bl3.r r15 = bl3.C39818r.f106831a
            bl3.r$a r3 = r15.mo62446e(r3)
            bl3.c r2 = r3.mo62447c(r2)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r2 = r2.mo11867O2(r14)
            r12.mo85957c(r13, r6, r2)
            android.widget.TextView r2 = r0.f177401C
            r2.setText(r5)
            r2 = 1
            r3 = 0
            if (r4 == 0) goto L_0x0094
            int r6 = r4.length()
            if (r6 <= 0) goto L_0x007f
            r6 = 1
            goto L_0x0080
        L_0x007f:
            r6 = 0
        L_0x0080:
            if (r6 == 0) goto L_0x0084
            r6 = r4
            goto L_0x0085
        L_0x0084:
            r6 = 0
        L_0x0085:
            if (r6 == 0) goto L_0x0094
            android.widget.TextView r6 = r0.f177405G
            r6.setText(r4)
            android.widget.TextView r4 = r0.f177405G
            r4.setVisibility(r3)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x0095
        L_0x0094:
            r4 = 0
        L_0x0095:
            r6 = 8
            if (r4 != 0) goto L_0x009e
            android.widget.TextView r4 = r0.f177405G
            r4.setVisibility(r6)
        L_0x009e:
            boolean r4 = r16.mo87479z()
            if (r4 == 0) goto L_0x0143
            er1.j4 r4 = er1.C58739j4.f168176a
            boolean r4 = r4.mo83692U()
            if (r4 == 0) goto L_0x00d0
            android.view.View r4 = r0.f44854d
            android.content.Context r4 = r4.getContext()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "后台返回的收集数量为"
            r12.append(r13)
            r12.append(r9)
            java.lang.String r13 = ", 有疑问请联系后台童鞋"
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            android.widget.Toast r4 = nj3.C76912y0.makeText((android.content.Context) r4, (java.lang.CharSequence) r12, (int) r3)
            r4.show()
        L_0x00d0:
            te3.o21 r4 = r1.f139534d
            if (r4 == 0) goto L_0x00db
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = r4.f138912d
            if (r4 == 0) goto L_0x00db
            com.tencent.mm.protocal.protobuf.NativeInfo r4 = r4.native_info
            goto L_0x00dc
        L_0x00db:
            r4 = 0
        L_0x00dc:
            if (r4 == 0) goto L_0x00e0
            r4 = 1
            goto L_0x00e1
        L_0x00e0:
            r4 = 0
        L_0x00e1:
            java.lang.Long r9 = java.lang.Long.valueOf(r9)
            long r12 = r9.longValue()
            int r10 = (r12 > r7 ? 1 : (r12 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x00ef
            r7 = 1
            goto L_0x00f0
        L_0x00ef:
            r7 = 0
        L_0x00f0:
            if (r7 == 0) goto L_0x00f3
            goto L_0x00f4
        L_0x00f3:
            r9 = 0
        L_0x00f4:
            if (r9 == 0) goto L_0x0122
            long r7 = r9.longValue()
            if (r4 == 0) goto L_0x0100
            r9 = 2131829087(0x7f11215f, float:1.9291133E38)
            goto L_0x0103
        L_0x0100:
            r9 = 2131829086(0x7f11215e, float:1.9291131E38)
        L_0x0103:
            android.widget.TextView r10 = r0.f177402D
            android.view.View r12 = r0.f44854d
            android.content.Context r12 = r12.getContext()
            java.lang.Object[] r13 = new java.lang.Object[r2]
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r13[r3] = r7
            java.lang.String r7 = r12.getString(r9, r13)
            r10.setText(r7)
            android.widget.TextView r7 = r0.f177402D
            r7.setVisibility(r3)
            rx3.b0 r7 = rx3.C13598b0.f38549a
            goto L_0x0123
        L_0x0122:
            r7 = 0
        L_0x0123:
            if (r7 != 0) goto L_0x0148
            if (r4 == 0) goto L_0x012b
            r4 = 2131829089(0x7f112161, float:1.9291137E38)
            goto L_0x012e
        L_0x012b:
            r4 = 2131829088(0x7f112160, float:1.9291135E38)
        L_0x012e:
            android.widget.TextView r7 = r0.f177402D
            android.view.View r8 = r0.f44854d
            android.content.Context r8 = r8.getContext()
            java.lang.String r4 = r8.getString(r4)
            r7.setText(r4)
            android.widget.TextView r4 = r0.f177402D
            r4.setVisibility(r3)
            goto L_0x0148
        L_0x0143:
            android.widget.TextView r4 = r0.f177402D
            r4.setVisibility(r6)
        L_0x0148:
            if (r11 == 0) goto L_0x016b
            int r4 = r11.length()
            if (r4 <= 0) goto L_0x0152
            r4 = 1
            goto L_0x0153
        L_0x0152:
            r4 = 0
        L_0x0153:
            if (r4 != r2) goto L_0x0157
            r4 = 1
            goto L_0x0158
        L_0x0157:
            r4 = 0
        L_0x0158:
            if (r4 == 0) goto L_0x015b
            goto L_0x015c
        L_0x015b:
            r11 = 0
        L_0x015c:
            if (r11 == 0) goto L_0x016b
            android.widget.TextView r4 = r0.f177400B
            r4.setText(r11)
            android.widget.TextView r4 = r0.f177400B
            r4.setVisibility(r3)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            goto L_0x016c
        L_0x016b:
            r4 = 0
        L_0x016c:
            if (r4 != 0) goto L_0x0173
            android.widget.TextView r4 = r0.f177400B
            r4.setVisibility(r6)
        L_0x0173:
            boolean r4 = r16.mo87479z()
            r6 = 2131829085(0x7f11215d, float:1.929113E38)
            r7 = 2131232831(0x7f08083f, float:1.8081782E38)
            r8 = 2131099940(0x7f060124, float:1.7812247E38)
            if (r4 == 0) goto L_0x025e
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            if (r4 == 0) goto L_0x019a
            fj1.b r4 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159348A
            if (r4 == 0) goto L_0x019a
            java.lang.Class<cl1.o> r9 = cl1.C54991o.class
            androidx.lifecycle.i0 r4 = r4.mo71262a(r9)
            cl1.o r4 = (cl1.C54991o) r4
            boolean r4 = r4.mo75999e4()
            if (r4 != r2) goto L_0x019a
            r4 = 1
            goto L_0x019b
        L_0x019a:
            r4 = 0
        L_0x019b:
            if (r4 == 0) goto L_0x020c
            android.widget.TextView r4 = r0.f177404F
            r4.setVisibility(r3)
            boolean r4 = r1.f139536f
            if (r4 == 0) goto L_0x01dc
            android.widget.TextView r4 = r0.f177404F
            android.view.View r6 = r0.f44854d
            android.content.Context r6 = r6.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131828850(0x7f112072, float:1.9290653E38)
            java.lang.String r6 = r6.getString(r7)
            r4.setText(r6)
            android.widget.TextView r4 = r0.f177404F
            android.view.View r6 = r0.f44854d
            android.content.Context r6 = r6.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131100709(0x7f060425, float:1.7813807E38)
            int r6 = r6.getColor(r7)
            r4.setTextColor(r6)
            android.widget.TextView r4 = r0.f177404F
            r6 = 2131232844(0x7f08084c, float:1.8081809E38)
            r4.setBackgroundResource(r6)
            goto L_0x02af
        L_0x01dc:
            android.widget.TextView r4 = r0.f177404F
            android.view.View r6 = r0.f44854d
            android.content.Context r6 = r6.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r9 = 2131828849(0x7f112071, float:1.929065E38)
            java.lang.String r6 = r6.getString(r9)
            r4.setText(r6)
            android.widget.TextView r4 = r0.f177404F
            android.view.View r6 = r0.f44854d
            android.content.Context r6 = r6.getContext()
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getColor(r8)
            r4.setTextColor(r6)
            android.widget.TextView r4 = r0.f177404F
            r4.setBackgroundResource(r7)
            goto L_0x02af
        L_0x020c:
            te3.o21 r4 = r1.f139534d
            if (r4 == 0) goto L_0x022f
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = r4.f138912d
            if (r4 == 0) goto L_0x022f
            java.lang.String r4 = r4.click_button_name
            if (r4 == 0) goto L_0x022f
            int r9 = r4.length()
            if (r9 <= 0) goto L_0x0220
            r9 = 1
            goto L_0x0221
        L_0x0220:
            r9 = 0
        L_0x0221:
            if (r9 == 0) goto L_0x0224
            goto L_0x0225
        L_0x0224:
            r4 = 0
        L_0x0225:
            if (r4 == 0) goto L_0x022f
            android.widget.TextView r9 = r0.f177404F
            r9.setText(r4)
            rx3.b0 r15 = rx3.C13598b0.f38549a
            goto L_0x0230
        L_0x022f:
            r15 = 0
        L_0x0230:
            if (r15 != 0) goto L_0x0245
            android.widget.TextView r4 = r0.f177404F
            android.view.View r9 = r0.f44854d
            android.content.Context r9 = r9.getContext()
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r6 = r9.getString(r6)
            r4.setText(r6)
        L_0x0245:
            android.widget.TextView r4 = r0.f177404F
            android.view.View r6 = r0.f44854d
            android.content.Context r6 = r6.getContext()
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getColor(r8)
            r4.setTextColor(r6)
            android.widget.TextView r4 = r0.f177404F
            r4.setBackgroundResource(r7)
            goto L_0x02af
        L_0x025e:
            te3.o21 r4 = r1.f139534d
            if (r4 == 0) goto L_0x0281
            com.tencent.mm.protocal.protobuf.FinderJumpInfo r4 = r4.f138912d
            if (r4 == 0) goto L_0x0281
            java.lang.String r4 = r4.click_button_name
            if (r4 == 0) goto L_0x0281
            int r9 = r4.length()
            if (r9 <= 0) goto L_0x0272
            r9 = 1
            goto L_0x0273
        L_0x0272:
            r9 = 0
        L_0x0273:
            if (r9 == 0) goto L_0x0276
            goto L_0x0277
        L_0x0276:
            r4 = 0
        L_0x0277:
            if (r4 == 0) goto L_0x0281
            android.widget.TextView r9 = r0.f177404F
            r9.setText(r4)
            rx3.b0 r15 = rx3.C13598b0.f38549a
            goto L_0x0282
        L_0x0281:
            r15 = 0
        L_0x0282:
            if (r15 != 0) goto L_0x0297
            android.widget.TextView r4 = r0.f177404F
            android.view.View r9 = r0.f44854d
            android.content.Context r9 = r9.getContext()
            android.content.res.Resources r9 = r9.getResources()
            java.lang.String r6 = r9.getString(r6)
            r4.setText(r6)
        L_0x0297:
            android.widget.TextView r4 = r0.f177404F
            android.view.View r6 = r0.f44854d
            android.content.Context r6 = r6.getContext()
            android.content.res.Resources r6 = r6.getResources()
            int r6 = r6.getColor(r8)
            r4.setTextColor(r6)
            android.widget.TextView r4 = r0.f177404F
            r4.setBackgroundResource(r7)
        L_0x02af:
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer r4 = r0.f177406H
            boolean r1 = r1.f139536f
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "MicroMsg.FinderLiveRetentionViewHolder title:"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.mo78796j(r1, r2, r5, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pp1.C62427b.mo87478B(te3.p21):void");
    }

    /* renamed from: z */
    public final boolean mo87479z() {
        FinderLiveService.f159376d.getClass();
        C45795b bVar = FinderLiveService.f159348A;
        if (bVar != null) {
            return C62042e.f176370a.mo87032P0(bVar);
        }
        return false;
    }
}
