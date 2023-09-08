package ve1;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C55033u;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C57839g4;
import com.tencent.p014mm.p136ui.C57840h4;
import com.tencent.p014mm.plugin.finder.presenter.contract.CommentDrawerContract;
import com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView;
import com.tencent.p014mm.protocal.protobuf.FinderContact;
import di3.C86312j;
import dp1.C58417y0;
import fe1.C58960c;
import fe1.C58969q;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import jq3.C60896i;
import jq3.C60905o;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import l31.C61212e;
import rx3.C13598b0;
import te3.C64284cg;

/* renamed from: ve1.g0 */
public final class C65592g0 extends C60896i<C55033u> {

    /* renamed from: e */
    public final CommentDrawerContract.NPresenter f188747e;

    /* renamed from: ve1.g0$a */
    public static final class C65593a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ View f188748d;

        /* renamed from: e */
        public final /* synthetic */ View f188749e;

        /* renamed from: f */
        public final /* synthetic */ C65592g0 f188750f;

        /* renamed from: g */
        public final /* synthetic */ C55033u f188751g;

        /* renamed from: h */
        public final /* synthetic */ boolean f188752h;

        public C65593a(View view, View view2, C65592g0 g0Var, C55033u uVar, boolean z) {
            this.f188748d = view;
            this.f188749e = view2;
            this.f188750f = g0Var;
            this.f188751g = uVar;
            this.f188752h = z;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$initTipsLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            View view2 = this.f188748d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$initTipsLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$initTipsLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view4 = this.f188749e;
            C9556a aVar2 = new C9556a();
            aVar2.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$initTipsLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$initTipsLayout$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f188750f.f188747e.mo77317A0(this.f188751g, this.f188752h);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert$initTipsLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ve1.g0$b */
    public static final class C65594b extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C60905o f188753d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C65594b(C60905o oVar) {
            super(1);
            this.f188753d = oVar;
        }

        public Object invoke(Object obj) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Object obj2 = this.f188753d.f173503E;
            C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedComment");
            ((C55033u) obj2).f154497i = booleanValue;
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ve1.g0$c */
    public static final class C65595c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ View f188754d;

        /* renamed from: e */
        public final /* synthetic */ int f188755e;

        /* renamed from: f */
        public final /* synthetic */ C57839g4 f188756f;

        public C65595c(View view, int i, C57839g4 g4Var) {
            this.f188754d = view;
            this.f188755e = i;
            this.f188756f = g4Var;
        }

        public final void run() {
            Rect rect = new Rect();
            this.f188754d.getHitRect(rect);
            int i = this.f188755e;
            rect.inset(-i, -i);
            this.f188756f.mo82266a(new C57840h4(rect, this.f188754d));
        }
    }

    public C65592g0(CommentDrawerContract.NPresenter nPresenter) {
        C87412m.m108594g(nPresenter, "presenter");
        this.f188747e = nPresenter;
    }

    /* renamed from: c */
    public int mo43c() {
        return C0966R.C0971layout.f6238c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0537, code lost:
        if (((r4.f154492d.mo89533p2() & 16) != 0) != false) goto L_0x0539;
     */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0584  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo44e(jq3.C60905o r40, jq3.C9493c r41, int r42, int r43, boolean r44, java.util.List r45) {
        /*
            r39 = this;
            r0 = r39
            r1 = r40
            pl1.e0$a r2 = pl1.C11978e0.C11979a.AVATAR
            java.lang.Class<ny.h> r3 = p629ny.C76979h.class
            r4 = r41
            cm1.u r4 = (cm1.C55033u) r4
            up1.y r5 = up1.C27696y.SMALL_AVATAR_IMAGE
            java.lang.Class<pl1.s0> r6 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r7 = ht1.C60200t1.class
            java.lang.String r8 = "holder"
            gy3.C87412m.m108594g(r1, r8)
            java.lang.String r8 = "item"
            gy3.C87412m.m108594g(r4, r8)
            r1.f173503E = r4
            r8 = 2131310273(0x7f0936c1, float:1.8238853E38)
            android.view.View r9 = r1.mo85812D(r8)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r10 = 0
            r9.setOnClickListener(r10)
            r11 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r12 = r1.mo85812D(r11)
            r12.setOnClickListener(r10)
            up1.w0 r12 = r4.f154492d
            r12.getClass()
            er1.j4 r13 = er1.C58739j4.f168176a
            int r12 = r12.mo89533p2()
            r13.getClass()
            r14 = 2
            r12 = r12 & r14
            if (r12 == 0) goto L_0x0049
            r12 = 1
            goto L_0x004a
        L_0x0049:
            r12 = 0
        L_0x004a:
            if (r12 != 0) goto L_0x0085
            up1.w0 r12 = r4.f154492d
            boolean r12 = r12.mo89522A2()
            if (r12 != 0) goto L_0x0085
            up1.f r12 = up1.C37521f.f99374d
            r12.getClass()
            pe1.c<java.lang.Integer> r12 = up1.C37521f.f99376d2
            java.lang.Object r12 = r12.mo60266n()
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            if (r12 <= 0) goto L_0x0085
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r12 = r0.f188747e
            com.tencent.mm.plugin.finder.storage.FinderItem r12 = r12.mo77342u()
            java.lang.String r12 = r12.getUserName()
            android.view.View r10 = r1.mo85812D(r11)
            ve1.l0 r8 = new ve1.l0
            r8.<init>(r1, r12, r4)
            r10.setOnClickListener(r8)
            ve1.m0 r8 = new ve1.m0
            r8.<init>(r1, r12, r4)
            r9.setOnClickListener(r8)
        L_0x0085:
            r8 = 2131305224(0x7f092308, float:1.8228613E38)
            r10 = 8
            r1.mo85817I(r8, r10)
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r12 = r0.f188747e
            r12.mo77341s()
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r12 = r0.f188747e
            r12.mo77338p()
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r12 = r0.f188747e
            int r12 = r12.mo77331g()
            if (r12 != r14) goto L_0x00a1
            r12 = 1
            goto L_0x00a2
        L_0x00a1:
            r12 = 0
        L_0x00a2:
            r8 = 2131099674(0x7f06001a, float:1.7811708E38)
            if (r12 == 0) goto L_0x013a
            android.text.SpannableStringBuilder r12 = new android.text.SpannableStringBuilder
            di3.d r17 = di3.C86312j.m106911c(r3)
            r14 = r17
            ny.h r14 = (p629ny.C76979h) r14
            android.content.Context r10 = r1.f173499A
            er1.w3 r19 = er1.C58784w3.f168295a
            up1.w0 r15 = r4.f154492d
            java.lang.String r20 = r15.getUsername()
            android.text.SpannableString r15 = r4.f154495g
            java.lang.String r21 = r15.toString()
            r22 = 0
            r23 = 4
            r24 = 0
            java.lang.String r15 = er1.C58784w3.m68433S(r19, r20, r21, r22, r23, r24)
            android.text.SpannableString r10 = r14.mo107057T1(r10, r15)
            r12.<init>(r10)
            android.text.SpannableStringBuilder r10 = new android.text.SpannableStringBuilder
            r10.<init>()
            android.text.SpannableStringBuilder r10 = r10.append(r12)
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r14 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            di3.d r14 = di3.C86312j.m106911c(r14)
            com.tencent.mm.plugin.FinderCommonFeatureService r14 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r14
            up1.w0 r15 = r4.f154492d
            java.lang.String r15 = r15.getUsername()
            boolean r14 = r14.mo76747EE(r15)
            java.lang.String r15 = "textBuilder"
            if (r14 != 0) goto L_0x0108
            up1.w0 r14 = r4.f154492d
            java.lang.String r14 = r14.getUsername()
            boolean r14 = r13.mo83694W(r14)
            if (r14 == 0) goto L_0x00ff
            goto L_0x0108
        L_0x00ff:
            ve1.i r14 = ve1.C65604i.f188772a
            gy3.C87412m.m108593f(r10, r15)
            r14.mo89687m(r9, r10)
            goto L_0x0141
        L_0x0108:
            ve1.i r14 = ve1.C65604i.f188772a
            gy3.C87412m.m108593f(r10, r15)
            r14.mo89687m(r9, r10)
            up1.f r10 = up1.C37521f.f99374d
            boolean r10 = r10.mo61182h()
            if (r10 == 0) goto L_0x0141
            android.content.Context r10 = r1.f173499A
            android.content.res.Resources r10 = r10.getResources()
            int r10 = r10.getColor(r8)
            r9.setTextColor(r10)
            ve1.n0 r10 = new ve1.n0
            r10.<init>(r4, r1)
            r9.setOnClickListener(r10)
            android.view.View r10 = r1.mo85812D(r11)
            ve1.o0 r14 = new ve1.o0
            r14.<init>(r4, r1)
            r10.setOnClickListener(r14)
            goto L_0x0141
        L_0x013a:
            android.text.SpannableString r12 = r4.f154495g
            ve1.i r10 = ve1.C65604i.f188772a
            r10.mo89687m(r9, r12)
        L_0x0141:
            android.content.Context r10 = r1.f173499A
            up1.w0 r14 = r4.f154492d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r14 = r14.mo89532o2()
            long r14 = r14.createtime
            r19 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r19
            java.lang.String r10 = er1.C7878t0.m8037f(r10, r14)
            r14 = 2131300029(0x7f090ebd, float:1.8218076E38)
            r1.mo85815G(r14, r10)
            up1.w0 r15 = r4.f154492d
            java.lang.String r14 = ""
            if (r15 == 0) goto L_0x016b
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r15 = r15.mo89532o2()
            te3.uq0 r15 = r15.ip_region_info
            if (r15 == 0) goto L_0x016b
            java.lang.String r15 = r15.f143030d
            if (r15 != 0) goto L_0x016c
        L_0x016b:
            r15 = r14
        L_0x016c:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r11 = "username="
            r8.append(r11)
            up1.w0 r11 = r4.f154492d
            java.lang.String r11 = r11.getUsername()
            r8.append(r11)
            java.lang.String r11 = ", nickName="
            r8.append(r11)
            android.text.SpannableString r11 = r4.f154495g
            r8.append(r11)
            java.lang.String r11 = " content="
            r8.append(r11)
            up1.w0 r11 = r4.f154492d
            java.lang.String r11 = r11.getContent()
            r8.append(r11)
            java.lang.String r11 = " ipRegion="
            r8.append(r11)
            r8.append(r15)
            java.lang.String r8 = r8.toString()
            java.lang.String r11 = "Finder.FinderFeedCommentLevel2Convert"
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r11, r8)
            r8 = 2131306567(0x7f092847, float:1.8231337E38)
            android.view.View r8 = r1.mo85812D(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            up1.f r22 = up1.C37521f.f99374d
            r22.getClass()
            pe1.c<java.lang.Integer> r23 = up1.C37521f.f99181G7
            java.lang.Object r23 = r23.mo60266n()
            java.lang.Number r23 = (java.lang.Number) r23
            r24 = r12
            int r12 = r23.intValue()
            r23 = r10
            r10 = 1
            if (r12 != r10) goto L_0x01de
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r15)
            if (r10 != 0) goto L_0x01de
            if (r8 != 0) goto L_0x01d3
            goto L_0x01d7
        L_0x01d3:
            r10 = 0
            r8.setVisibility(r10)
        L_0x01d7:
            if (r8 != 0) goto L_0x01da
            goto L_0x01e6
        L_0x01da:
            r8.setText(r15)
            goto L_0x01e6
        L_0x01de:
            if (r8 != 0) goto L_0x01e1
            goto L_0x01e6
        L_0x01e1:
            r10 = 8
            r8.setVisibility(r10)
        L_0x01e6:
            r8 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r10 = r1.mo85812D(r8)
            android.widget.ImageView r10 = (android.widget.ImageView) r10
            gy3.a0 r8 = new gy3.a0
            r8.<init>()
            gy3.d0 r12 = new gy3.d0
            r12.<init>()
            r15 = 2
            r12.f27483d = r15
            up1.w0 r15 = r4.f154492d
            r15.getClass()
            int r15 = r15.mo89533p2()
            r13.getClass()
            r13 = 2
            r15 = r15 & r13
            if (r15 == 0) goto L_0x020e
            r13 = 1
            goto L_0x020f
        L_0x020e:
            r13 = 0
        L_0x020f:
            java.lang.String r15 = "avatarIv"
            r37 = r14
            if (r13 == 0) goto L_0x0254
            bl3.r r13 = bl3.C39818r.f106831a
            bl3.r$a r14 = r13.mo62446e(r7)
            bl3.c r14 = r14.mo62447c(r6)
            pl1.s0 r14 = (pl1.C11990s0) r14
            k60.d r14 = r14.mo11872i2()
            r38 = r11
            pl1.f r11 = new pl1.f
            r27 = r3
            up1.w0 r3 = r4.f154492d
            java.lang.String r3 = r3.mo89537t2()
            r11.<init>(r3, r5)
            gy3.C87412m.m108593f(r10, r15)
            bl3.r$a r3 = r13.mo62446e(r7)
            bl3.c r3 = r3.mo62447c(r6)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r2 = r3.mo11867O2(r2)
            r14.mo85957c(r11, r10, r2)
            r2 = 0
            r3 = 2131311195(0x7f093a5b, float:1.8240723E38)
            r1.mo85817I(r3, r2)
            r2 = 1
            r8.f27482d = r2
            goto L_0x02e7
        L_0x0254:
            r27 = r3
            r38 = r11
            r3 = 2131311195(0x7f093a5b, float:1.8240723E38)
            up1.w0 r11 = r4.f154492d
            boolean r11 = r11.mo89522A2()
            if (r11 == 0) goto L_0x029b
            r11 = 8
            r1.mo85817I(r3, r11)
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r11 = r3.mo62446e(r7)
            bl3.c r11 = r11.mo62447c(r6)
            pl1.s0 r11 = (pl1.C11990s0) r11
            k60.d r11 = r11.mo11872i2()
            pl1.f r13 = new pl1.f
            up1.w0 r14 = r4.f154492d
            java.lang.String r14 = r14.mo89537t2()
            r13.<init>(r14, r5)
            gy3.C87412m.m108593f(r10, r15)
            bl3.r$a r3 = r3.mo62446e(r7)
            bl3.c r3 = r3.mo62447c(r6)
            pl1.s0 r3 = (pl1.C11990s0) r3
            n60.f r2 = r3.mo11867O2(r2)
            r11.mo85957c(r13, r10, r2)
            r2 = 1
            r8.f27482d = r2
            goto L_0x02e7
        L_0x029b:
            r2 = 2131311195(0x7f093a5b, float:1.8240723E38)
            r3 = 8
            r1.mo85817I(r2, r3)
            up1.w0 r2 = r4.f154492d
            java.lang.String r2 = r2.mo89537t2()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            if (r2 != 0) goto L_0x02e1
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r3 = r2.mo62446e(r7)
            bl3.c r3 = r3.mo62447c(r6)
            pl1.s0 r3 = (pl1.C11990s0) r3
            k60.d r3 = r3.mo11865K1()
            pl1.f r11 = new pl1.f
            up1.w0 r13 = r4.f154492d
            java.lang.String r13 = r13.mo89537t2()
            r11.<init>(r13, r5)
            gy3.C87412m.m108593f(r10, r15)
            pl1.e0$a r5 = pl1.C11978e0.C11979a.WX_AVATAR
            bl3.r$a r2 = r2.mo62446e(r7)
            bl3.c r2 = r2.mo62447c(r6)
            pl1.s0 r2 = (pl1.C11990s0) r2
            n60.f r2 = r2.mo11867O2(r5)
            r3.mo85957c(r11, r10, r2)
            goto L_0x02e7
        L_0x02e1:
            r2 = 2131231871(0x7f08047f, float:1.8079835E38)
            r10.setImageResource(r2)
        L_0x02e7:
            r2 = 2131302939(0x7f091a1b, float:1.8223978E38)
            android.view.View r3 = r1.mo85812D(r2)
            if (r3 == 0) goto L_0x0382
            up1.w0 r5 = r4.f154492d
            boolean r5 = r5.mo89522A2()
            if (r5 == 0) goto L_0x033c
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r7)
            java.lang.Object[] r29 = r5.mo10232b()
            java.lang.String r30 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r31 = "onBindViewHolder"
            java.lang.String r32 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r3
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r29 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r30 = "onBindViewHolder"
            java.lang.String r31 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
            goto L_0x0380
        L_0x033c:
            k20.a r5 = new k20.a
            r5.<init>()
            java.lang.ThreadLocal<k20.a> r6 = k20.C60958c.f173611a
            r6 = 8
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r5.mo10233c(r7)
            java.lang.Object[] r29 = r5.mo10232b()
            java.lang.String r30 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r31 = "onBindViewHolder"
            java.lang.String r32 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r33 = "android/view/View_EXEC_"
            java.lang.String r34 = "setVisibility"
            java.lang.String r35 = "(I)V"
            r28 = r3
            j20.C117292a.m165358d(r28, r29, r30, r31, r32, r33, r34, r35)
            r6 = 0
            java.lang.Object r5 = r5.mo10231a(r6)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r3.setVisibility(r5)
            java.lang.String r29 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r30 = "onBindViewHolder"
            java.lang.String r31 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r32 = "android/view/View_EXEC_"
            java.lang.String r33 = "setVisibility"
            java.lang.String r34 = "(I)V"
            j20.C117292a.m165359e(r28, r29, r30, r31, r32, r33, r34)
        L_0x0380:
            rx3.b0 r3 = rx3.C13598b0.f38549a
        L_0x0382:
            android.content.Context r3 = r1.f173499A
            android.content.res.Resources r3 = r3.getResources()
            r5 = 2131099674(0x7f06001a, float:1.7811708E38)
            int r3 = r3.getColor(r5)
            r9.setTextColor(r3)
            boolean r3 = r8.f27482d
            if (r3 == 0) goto L_0x03c0
            r3 = 1
            r12.f27483d = r3
            ve1.p0 r3 = new ve1.p0
            r3.<init>(r0, r4, r1)
            r9.setOnClickListener(r3)
            r3 = 2131297474(0x7f0904c2, float:1.8212894E38)
            android.view.View r3 = r1.mo85812D(r3)
            ve1.q0 r5 = new ve1.q0
            r5.<init>(r0, r4, r1)
            r3.setOnClickListener(r5)
            android.view.View r2 = r1.mo85812D(r2)
            if (r2 == 0) goto L_0x03c0
            ve1.r0 r3 = new ve1.r0
            r3.<init>(r0, r4, r1)
            r2.setOnClickListener(r3)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x03c0:
            gy3.C87412m.m108593f(r10, r15)
            ve1.s0 r2 = new ve1.s0
            r2.<init>(r1, r8, r12, r4)
            zp3.C23564m.m28138h(r10, r2)
            java.lang.String r2 = "holder.context"
            r3 = 2131299973(0x7f090e85, float:1.8217963E38)
            if (r44 != 0) goto L_0x0636
            android.view.View r6 = r1.mo85812D(r3)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r6 = (com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView) r6
            android.content.Context r7 = r1.f173499A
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131100738(0x7f060442, float:1.7813866E38)
            int r7 = r7.getColor(r8)
            r6.setExpandTextColor(r7)
            java.lang.Object r7 = r1.f173503E
            java.lang.String r8 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedComment"
            gy3.C87412m.m108592e(r7, r8)
            cm1.u r7 = (cm1.C55033u) r7
            boolean r7 = r7.f154497i
            r6.setCollapse(r7)
            rx3.b0 r7 = rx3.C13598b0.f38549a
            up1.w0 r7 = r4.f154492d
            long r7 = r7.mo89541w2()
            r10 = 0
            java.lang.String r12 = "parse comment cost %s key total %d parsed %d"
            int r14 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r14 == 0) goto L_0x059a
            up1.w0 r7 = r4.f154492d
            long r7 = r7.mo89541w2()
            up1.w0 r10 = r4.f154492d
            te3.ye0 r10 = r10.field_actionInfo
            long r10 = r10.f186500h
            int r14 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r14 == 0) goto L_0x059a
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            android.content.Context r8 = r1.f173499A
            r10 = 2131829764(0x7f112404, float:1.9292506E38)
            java.lang.String r8 = r8.getString(r10)
            r7.append(r8)
            int r8 = r7.length()
            android.text.SpannableString r10 = r4.f154496h
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "item.replayDisplayNickname.toString()"
            gy3.C87412m.m108593f(r10, r11)
            ve1.i r11 = ve1.C65604i.f188772a
            com.tencent.neattextview.textview.view.NeatTextView r14 = r6.getContentTextView()
            android.text.TextPaint r14 = r14.getPaint()
            java.lang.String r15 = "commentTextView.contentTextView.paint"
            gy3.C87412m.m108593f(r14, r15)
            android.content.Context r15 = r1.f173499A
            gy3.C87412m.m108593f(r15, r2)
            int r3 = r22.mo61150D()
            int r3 = r11.mo89677c(r15, r3)
            android.content.Context r15 = r1.f173499A
            gy3.C87412m.m108593f(r15, r2)
            int r22 = r22.mo61150D()
            r25 = 1
            int r5 = r22 + 1
            int r5 = r11.mo89677c(r15, r5)
            java.lang.String r3 = r11.mo89678d(r14, r10, r3, r5)
            di3.d r5 = di3.C86312j.m106911c(r27)
            ny.h r5 = (p629ny.C76979h) r5
            android.content.Context r10 = r1.f173499A
            android.text.SpannableString r3 = r5.mo107057T1(r10, r3)
            r7.append(r3)
            int r3 = r7.length()
            up1.w0 r5 = r4.f154492d
            int r5 = r5.mo89533p2()
            r5 = r5 & 4
            if (r5 == 0) goto L_0x0486
            r5 = 1
            goto L_0x0487
        L_0x0486:
            r5 = 0
        L_0x0487:
            if (r5 == 0) goto L_0x049a
            android.content.Context r5 = r1.f173499A
            r10 = 2131826324(0x7f111694, float:1.928553E38)
            java.lang.String r5 = r5.getString(r10)
            r7.append(r5)
            int r5 = r7.length()
            goto L_0x049b
        L_0x049a:
            r5 = r3
        L_0x049b:
            android.content.Context r10 = r1.f173499A
            r14 = 2131826303(0x7f11167f, float:1.9285487E38)
            java.lang.String r10 = r10.getString(r14)
            r7.append(r10)
            long r14 = java.lang.System.currentTimeMillis()
            android.content.Context r10 = r1.f173499A
            gy3.C87412m.m108593f(r10, r2)
            java.lang.String r7 = r7.toString()
            ve1.t0 r13 = new ve1.t0
            r13.<init>(r1)
            android.text.SpannableString r7 = r4.mo76088a(r10, r7, r13)
            java.util.ArrayList<te3.oq2> r10 = r4.f154505t
            if (r10 == 0) goto L_0x04d0
            java.lang.Object r10 = sx3.C110818d0.m150916N(r10)
            te3.oq2 r10 = (te3.C50717oq2) r10
            if (r10 == 0) goto L_0x04d0
            te3.wh0 r10 = r10.f139316f
            if (r10 == 0) goto L_0x04d0
            r11.mo89686l(r10)
        L_0x04d0:
            r10 = 3
            java.lang.Object[] r10 = new java.lang.Object[r10]
            long r27 = java.lang.System.currentTimeMillis()
            long r27 = r27 - r14
            java.lang.Long r11 = java.lang.Long.valueOf(r27)
            r13 = 0
            r10[r13] = r11
            up1.w0 r11 = r4.f154492d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r11 = r11.mo89532o2()
            java.util.LinkedList<te3.wh0> r11 = r11.search_keyword_info
            int r11 = r11.size()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13 = 1
            r10[r13] = r11
            java.util.ArrayList<te3.oq2> r11 = r4.f154505t
            if (r11 == 0) goto L_0x04fc
            int r11 = r11.size()
            goto L_0x04fd
        L_0x04fc:
            r11 = 0
        L_0x04fd:
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r13 = 2
            r10[r13] = r11
            r11 = r38
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r12, r10)
            up1.w0 r10 = r4.f154492d
            java.lang.String r10 = r10.mo89543y2()
            boolean r10 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r10)
            r12 = 17
            r13 = 2131099804(0x7f06009c, float:1.7811972E38)
            if (r10 != 0) goto L_0x0570
            up1.w0 r10 = r4.f154492d
            int r10 = r10.mo89533p2()
            r10 = r10 & 4
            if (r10 == 0) goto L_0x0526
            r10 = 1
            goto L_0x0527
        L_0x0526:
            r10 = 0
        L_0x0527:
            if (r10 != 0) goto L_0x0539
            up1.w0 r10 = r4.f154492d
            int r10 = r10.mo89533p2()
            r14 = 16
            r10 = r10 & r14
            if (r10 == 0) goto L_0x0536
            r10 = 1
            goto L_0x0537
        L_0x0536:
            r10 = 0
        L_0x0537:
            if (r10 == 0) goto L_0x0570
        L_0x0539:
            com.tencent.mm.plugin.finder.view.g5 r10 = new com.tencent.mm.plugin.finder.view.g5
            up1.w0 r14 = r4.f154492d
            java.lang.String r28 = r14.mo89543y2()
            android.content.Context r14 = r1.f173499A
            android.content.res.Resources r14 = r14.getResources()
            int r29 = r14.getColor(r13)
            android.content.Context r14 = r1.f173499A
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2131099665(0x7f060011, float:1.781169E38)
            int r30 = r14.getColor(r15)
            r31 = 0
            r32 = 0
            ve1.h0 r14 = new ve1.h0
            r14.<init>(r4, r0, r1)
            r34 = 16
            r35 = 0
            r27 = r10
            r33 = r14
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35)
            r7.setSpan(r10, r8, r3, r12)
            goto L_0x0582
        L_0x0570:
            android.text.style.ForegroundColorSpan r10 = new android.text.style.ForegroundColorSpan
            android.content.Context r14 = r1.f173499A
            android.content.res.Resources r14 = r14.getResources()
            int r14 = r14.getColor(r13)
            r10.<init>(r14)
            r7.setSpan(r10, r8, r3, r12)
        L_0x0582:
            if (r3 == r5) goto L_0x0596
            android.text.style.ForegroundColorSpan r8 = new android.text.style.ForegroundColorSpan
            android.content.Context r10 = r1.f173499A
            android.content.res.Resources r10 = r10.getResources()
            int r10 = r10.getColor(r13)
            r8.<init>(r10)
            r7.setSpan(r8, r3, r5, r12)
        L_0x0596:
            r6.setText(r7)
            goto L_0x05fd
        L_0x059a:
            r11 = r38
            long r7 = java.lang.System.currentTimeMillis()
            android.content.Context r3 = r1.f173499A
            gy3.C87412m.m108593f(r3, r2)
            ve1.i0 r5 = new ve1.i0
            r5.<init>(r1)
            r10 = 0
            android.text.SpannableString r3 = r4.mo76088a(r3, r10, r5)
            r6.setText(r3)
            java.util.ArrayList<te3.oq2> r3 = r4.f154505t
            if (r3 == 0) goto L_0x05c7
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            te3.oq2 r3 = (te3.C50717oq2) r3
            if (r3 == 0) goto L_0x05c7
            te3.wh0 r3 = r3.f139316f
            if (r3 == 0) goto L_0x05c7
            ve1.i r5 = ve1.C65604i.f188772a
            r5.mo89686l(r3)
        L_0x05c7:
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r7
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r6 = 0
            r3[r6] = r5
            up1.w0 r5 = r4.f154492d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r5 = r5.mo89532o2()
            java.util.LinkedList<te3.wh0> r5 = r5.search_keyword_info
            int r5 = r5.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 1
            r3[r6] = r5
            java.util.ArrayList<te3.oq2> r5 = r4.f154505t
            if (r5 == 0) goto L_0x05f2
            int r5 = r5.size()
            goto L_0x05f3
        L_0x05f2:
            r5 = 0
        L_0x05f3:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 2
            r3[r6] = r5
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r11, r12, r3)
        L_0x05fd:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "onBindViewHolder replyCommentId:"
            r3.append(r5)
            up1.w0 r5 = r4.f154492d
            long r5 = r5.mo89541w2()
            r3.append(r5)
            java.lang.String r5 = ", content:"
            r3.append(r5)
            up1.w0 r5 = r4.f154492d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r5 = r5.mo89532o2()
            java.lang.String r5 = r5.reply_content
            if (r5 != 0) goto L_0x0621
            r5 = r37
        L_0x0621:
            r3.append(r5)
            java.lang.String r5 = ", nickname:"
            r3.append(r5)
            android.text.SpannableString r5 = r4.f154496h
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r3)
            goto L_0x0638
        L_0x0636:
            r11 = r38
        L_0x0638:
            vq1.w r3 = vq1.C65866w.f189407h
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r5 = r0.f188747e
            com.tencent.mm.plugin.finder.storage.FinderItem r5 = r5.mo77342u()
            long r5 = r5.field_id
            up1.w0 r7 = r4.f154492d
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r8 = r0.f188747e
            int r8 = r8.mo77331g()
            boolean r5 = r3.mo89907f(r5, r7, r8)
            r6 = 2131297504(0x7f0904e0, float:1.8212955E38)
            android.view.View r7 = r1.mo85812D(r6)
            com.tencent.mm.ui.widget.imageview.WeImageView r7 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r7
            r8 = 2131307880(0x7f092d68, float:1.8234E38)
            android.view.View r10 = r1.mo85812D(r8)
            r12 = 1
            boolean[] r13 = new boolean[r12]
            r12 = 0
            r13[r12] = r12
            ve1.u0 r12 = new ve1.u0
            r12.<init>(r13)
            r10.setOnTouchListener(r12)
            r12 = 2131099718(0x7f060046, float:1.7811797E38)
            if (r5 == 0) goto L_0x06af
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r14 = r0.f188747e
            boolean r14 = r14.mo77333h()
            r15 = 2131755879(0x7f100367, float:1.914265E38)
            if (r14 == 0) goto L_0x0694
            rx3.l r14 = new rx3.l
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            android.content.Context r8 = r1.f173499A
            android.content.res.Resources r8 = r8.getResources()
            int r8 = r8.getColor(r12)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r14.<init>(r15, r8)
            goto L_0x06ed
        L_0x0694:
            rx3.l r14 = new rx3.l
            java.lang.Integer r8 = java.lang.Integer.valueOf(r15)
            android.content.Context r15 = r1.f173499A
            android.content.res.Resources r15 = r15.getResources()
            r6 = 2131099905(0x7f060101, float:1.7812176E38)
            int r6 = r15.getColor(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r14.<init>(r8, r6)
            goto L_0x06ed
        L_0x06af:
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r6 = r0.f188747e
            boolean r6 = r6.mo77333h()
            r8 = 2131755901(0x7f10037d, float:1.9142694E38)
            if (r6 == 0) goto L_0x06d2
            rx3.l r6 = new rx3.l
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            android.content.Context r14 = r1.f173499A
            android.content.res.Resources r14 = r14.getResources()
            int r14 = r14.getColor(r12)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r6.<init>(r8, r14)
            goto L_0x06ec
        L_0x06d2:
            rx3.l r6 = new rx3.l
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            android.content.Context r14 = r1.f173499A
            android.content.res.Resources r14 = r14.getResources()
            r15 = 2131099674(0x7f06001a, float:1.7811708E38)
            int r14 = r14.getColor(r15)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r6.<init>(r8, r14)
        L_0x06ec:
            r14 = r6
        L_0x06ed:
            A r6 = r14.f38555d
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            B r8 = r14.f38556e
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r7.setImageResource(r6)
            r7.setIconColor(r8)
            ve1.v0 r6 = new ve1.v0
            r6.<init>(r0, r1, r13)
            r10.setOnClickListener(r6)
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r6 = r0.f188747e
            com.tencent.mm.plugin.finder.storage.FinderItem r6 = r6.mo77342u()
            long r6 = r6.field_id
            up1.w0 r8 = r4.f154492d
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r10 = r0.f188747e
            int r10 = r10.mo77331g()
            int r3 = r3.mo89904b(r6, r8, r10)
            r6 = 2131297505(0x7f0904e1, float:1.8212957E38)
            if (r3 <= 0) goto L_0x0732
            r7 = 0
            r1.mo85817I(r6, r7)
            java.lang.String r7 = java.lang.String.valueOf(r3)
            r1.mo85815G(r6, r7)
            r7 = r37
            goto L_0x073c
        L_0x0732:
            r7 = 8
            r1.mo85817I(r6, r7)
            r7 = r37
            r1.mo85815G(r6, r7)
        L_0x073c:
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r8 = r0.f188747e
            boolean r8 = r8.mo77333h()
            if (r8 == 0) goto L_0x0758
            android.view.View r8 = r1.mo85812D(r6)
            android.widget.TextView r8 = (android.widget.TextView) r8
            android.content.Context r10 = r1.f173499A
            android.content.res.Resources r10 = r10.getResources()
            int r10 = r10.getColor(r12)
            r8.setTextColor(r10)
            goto L_0x0787
        L_0x0758:
            if (r5 == 0) goto L_0x0771
            android.view.View r8 = r1.mo85812D(r6)
            android.widget.TextView r8 = (android.widget.TextView) r8
            android.content.Context r10 = r1.f173499A
            android.content.res.Resources r10 = r10.getResources()
            r12 = 2131099898(0x7f0600fa, float:1.7812162E38)
            int r10 = r10.getColor(r12)
            r8.setTextColor(r10)
            goto L_0x0787
        L_0x0771:
            android.view.View r8 = r1.mo85812D(r6)
            android.widget.TextView r8 = (android.widget.TextView) r8
            android.content.Context r10 = r1.f173499A
            android.content.res.Resources r10 = r10.getResources()
            r12 = 2131099674(0x7f06001a, float:1.7811708E38)
            int r10 = r10.getColor(r12)
            r8.setTextColor(r10)
        L_0x0787:
            up1.w0 r8 = r4.f154492d
            int r8 = r8.field_state
            r10 = -1
            r12 = 1
            if (r8 == r12) goto L_0x0793
            if (r8 == r10) goto L_0x0793
            r8 = 1
            goto L_0x0794
        L_0x0793:
            r8 = 0
        L_0x0794:
            if (r8 != 0) goto L_0x079f
            r8 = 2131297504(0x7f0904e0, float:1.8212955E38)
            r12 = 8
            r1.mo85817I(r8, r12)
            goto L_0x07a6
        L_0x079f:
            r8 = 2131297504(0x7f0904e0, float:1.8212955E38)
            r12 = 0
            r1.mo85817I(r8, r12)
        L_0x07a6:
            ve1.i r8 = ve1.C65604i.f188772a
            android.content.Context r12 = r1.f173499A
            gy3.C87412m.m108593f(r12, r2)
            r2 = 2131307247(0x7f092aef, float:1.8232716E38)
            android.view.View r13 = r1.mo85812D(r2)
            java.lang.String r14 = "holder.getView<View>(R.id.level2_main_area)"
            gy3.C87412m.m108593f(r13, r14)
            r14 = 2131310273(0x7f0936c1, float:1.8238853E38)
            android.view.View r14 = r1.mo85812D(r14)
            java.lang.String r15 = "holder.getView(R.id.nickname)"
            gy3.C87412m.m108593f(r14, r15)
            r29 = r14
            android.widget.TextView r29 = (android.widget.TextView) r29
            r14 = 2131300029(0x7f090ebd, float:1.8218076E38)
            android.view.View r14 = r1.mo85812D(r14)
            java.lang.String r15 = "holder.getView(R.id.comment_time)"
            gy3.C87412m.m108593f(r14, r15)
            r30 = r14
            android.widget.TextView r30 = (android.widget.TextView) r30
            r14 = 2131297504(0x7f0904e0, float:1.8212955E38)
            android.view.View r31 = r1.mo85812D(r14)
            android.view.View r6 = r1.mo85812D(r6)
            r32 = r6
            android.widget.TextView r32 = (android.widget.TextView) r32
            r6 = 2131311195(0x7f093a5b, float:1.8240723E38)
            android.view.View r6 = r1.mo85812D(r6)
            java.lang.String r14 = "holder.getView(R.id.poster_tag)"
            gy3.C87412m.m108593f(r6, r14)
            r33 = r6
            android.widget.TextView r33 = (android.widget.TextView) r33
            r6 = 2131305224(0x7f092308, float:1.8228613E38)
            android.view.View r6 = r1.mo85812D(r6)
            java.lang.String r14 = "holder.getView(R.id.friend_tag)"
            gy3.C87412m.m108593f(r6, r14)
            r34 = r6
            android.widget.TextView r34 = (android.widget.TextView) r34
            java.lang.String r6 = "commentTimeText"
            r14 = r23
            gy3.C87412m.m108593f(r14, r6)
            r26 = r8
            r27 = r12
            r28 = r13
            r35 = r24
            r36 = r14
            r26.mo89688n(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)
            up1.w0 r6 = r4.f154492d
            int r6 = r6.mo89533p2()
            r12 = 1
            r6 = r6 & r12
            if (r6 == 0) goto L_0x082e
            r6 = 2131307272(0x7f092b08, float:1.8232767E38)
            r12 = 0
            r1.mo85817I(r6, r12)
            goto L_0x0837
        L_0x082e:
            r12 = 0
            r6 = 2131307272(0x7f092b08, float:1.8232767E38)
            r13 = 8
            r1.mo85817I(r6, r13)
        L_0x0837:
            up1.w0 r6 = r4.f154492d
            int r6 = r6.field_state
            r13 = 2131299995(0x7f090e9b, float:1.8218007E38)
            if (r6 != r10) goto L_0x087e
            r6 = 2131299994(0x7f090e9a, float:1.8218005E38)
            r1.mo85817I(r6, r12)
            r1.mo85817I(r13, r12)
            android.view.View r6 = r1.mo85812D(r13)
            android.widget.TextView r6 = (android.widget.TextView) r6
            up1.w0 r10 = r4.f154492d
            int r10 = r10.field_failedFlag
            r12 = 1
            if (r10 != r12) goto L_0x0868
            r6 = 2131826307(0x7f111683, float:1.9285495E38)
            r1.mo85814F(r13, r6)
            r6 = 2131299996(0x7f090e9c, float:1.821801E38)
            android.view.View r6 = r1.mo85812D(r6)
            r10 = 0
            r6.setOnClickListener(r10)
            goto L_0x0889
        L_0x0868:
            r10 = 2131826553(0x7f111779, float:1.9285994E38)
            r1.mo85814F(r13, r10)
            r10 = 2131299996(0x7f090e9c, float:1.821801E38)
            android.view.View r10 = r1.mo85812D(r10)
            ve1.j0 r12 = new ve1.j0
            r12.<init>(r0, r6, r1)
            r10.setOnClickListener(r12)
            goto L_0x0889
        L_0x087e:
            r6 = 2131299994(0x7f090e9a, float:1.8218005E38)
            r10 = 8
            r1.mo85817I(r6, r10)
            r1.mo85817I(r13, r10)
        L_0x0889:
            r6 = 2131302298(0x7f09179a, float:1.8222678E38)
            android.view.View r6 = r1.mo85812D(r6)
            java.lang.String r10 = "maskView"
            gy3.C87412m.m108593f(r6, r10)
            r10 = r42
            r8.mo89676b(r6, r4, r10, r11)
            er1.w3 r6 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r8 = r0.f188747e
            com.tencent.mm.plugin.finder.storage.FinderItem r8 = r8.mo77342u()
            java.lang.String r8 = r8.getUserName()
            boolean r6 = r6.mo83899R0(r8)
            if (r6 == 0) goto L_0x0901
            r6 = 2131300018(0x7f090eb2, float:1.8218054E38)
            android.view.View r6 = r1.mo85812D(r6)
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r8.mo10233c(r11)
            java.lang.Object[] r27 = r8.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r6
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            r10 = 0
            java.lang.Object r8 = r8.mo10231a(r10)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r6.setVisibility(r8)
            java.lang.String r27 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
            ve1.k0 r8 = new ve1.k0
            r8.<init>(r0, r1, r4)
            r6.setOnClickListener(r8)
            rx3.b0 r6 = rx3.C13598b0.f38549a
            goto L_0x0963
        L_0x0901:
            r6 = 2131307880(0x7f092d68, float:1.8234E38)
            android.view.View r8 = r1.mo85812D(r6)
            if (r8 == 0) goto L_0x0918
            android.content.Context r6 = r1.f173499A
            r10 = 16
            int r6 = kg3.C76577a.m92151b(r6, r10)
            r10 = 0
            r8.setPadding(r10, r10, r6, r10)
            rx3.b0 r6 = rx3.C13598b0.f38549a
        L_0x0918:
            r6 = 2131300018(0x7f090eb2, float:1.8218054E38)
            android.view.View r6 = r1.mo85812D(r6)
            k20.a r8 = new k20.a
            r8.<init>()
            java.lang.ThreadLocal<k20.a> r10 = k20.C60958c.f173611a
            r10 = 8
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r8.mo10233c(r11)
            java.lang.Object[] r27 = r8.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r6
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            r10 = 0
            java.lang.Object r8 = r8.mo10231a(r10)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r6.setVisibility(r8)
            java.lang.String r27 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
        L_0x0963:
            android.view.View r2 = r1.mo85812D(r2)
            int r6 = r2.getPaddingLeft()
            int r8 = r2.getPaddingTop()
            int r10 = r2.getPaddingRight()
            android.content.Context r11 = r1.f173499A
            r12 = 6
            int r11 = kg3.C76577a.m92151b(r11, r12)
            r2.setPadding(r6, r8, r10, r11)
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r6 = r0.f188747e
            up1.w0 r8 = r4.f154492d
            te3.ye0 r8 = r8.field_actionInfo
            long r10 = r8.f186500h
            cm1.u r6 = r6.mo77344v(r10)
            r8 = 2131307249(0x7f092af1, float:1.823272E38)
            android.view.View r8 = r1.mo85812D(r8)
            r10 = 2131307248(0x7f092af0, float:1.8232718E38)
            android.view.View r10 = r1.mo85812D(r10)
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r11 = r0.f188747e
            r12 = 1
            boolean r11 = r11.mo77327a0(r4, r12)
            r12 = 2131314262(0x7f094656, float:1.8246944E38)
            if (r6 != 0) goto L_0x0a8b
            if (r11 == 0) goto L_0x0a02
            int r3 = r2.getPaddingLeft()
            int r4 = r2.getPaddingTop()
            int r5 = r2.getPaddingRight()
            android.content.Context r6 = r1.f173499A
            r7 = 16
            int r6 = kg3.C76577a.m92151b(r6, r7)
            r2.setPadding(r3, r4, r5, r6)
            android.view.View r1 = r1.mo85812D(r12)
            k20.a r2 = new k20.a
            r2.<init>()
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r4)
            java.lang.Object[] r19 = r2.mo10232b()
            java.lang.String r20 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r21 = "onBindViewHolder"
            java.lang.String r22 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r23 = "android/view/View_EXEC_"
            java.lang.String r24 = "setVisibility"
            java.lang.String r25 = "(I)V"
            r18 = r1
            j20.C117292a.m165358d(r18, r19, r20, r21, r22, r23, r24, r25)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r19 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r20 = "onBindViewHolder"
            java.lang.String r21 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            j20.C117292a.m165359e(r18, r19, r20, r21, r22, r23, r24)
            goto L_0x0a47
        L_0x0a02:
            android.view.View r1 = r1.mo85812D(r12)
            k20.a r2 = new k20.a
            r2.<init>()
            r3 = 8
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r4)
            java.lang.Object[] r10 = r2.mo10232b()
            java.lang.String r11 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r12 = "onBindViewHolder"
            java.lang.String r13 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r9 = r1
            j20.C117292a.m165358d(r9, r10, r11, r12, r13, r14, r15, r16)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r10 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r11 = "onBindViewHolder"
            java.lang.String r12 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r15 = "(I)V"
            j20.C117292a.m165359e(r9, r10, r11, r12, r13, r14, r15)
        L_0x0a47:
            k20.a r1 = new k20.a
            r1.<init>()
            r2 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1.mo10233c(r2)
            java.lang.Object[] r27 = r1.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r8
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            r2 = 0
            java.lang.Object r1 = r1.mo10231a(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r8.setVisibility(r1)
            java.lang.String r27 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
            goto L_0x0ced
        L_0x0a8b:
            up1.w0 r13 = r6.f154492d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r13 = r13.mo89532o2()
            int r13 = r13.upContinueFlag
            r15 = 1
            if (r13 != r15) goto L_0x0a98
            r13 = 1
            goto L_0x0a99
        L_0x0a98:
            r13 = 0
        L_0x0a99:
            up1.w0 r12 = r6.f154492d
            com.tencent.mm.protocal.protobuf.FinderCommentInfo r12 = r12.mo89532o2()
            int r12 = r12.continueFlag
            if (r12 != r15) goto L_0x0aa5
            r12 = 1
            goto L_0x0aa6
        L_0x0aa5:
            r12 = 0
        L_0x0aa6:
            android.content.Context r15 = r1.f173499A
            r37 = r7
            r7 = 2131838039(0x7f114457, float:1.930929E38)
            java.lang.String r7 = r15.getString(r7)
            java.lang.String r15 = "holder.context.getString…ng.to_show_more_comment3)"
            gy3.C87412m.m108593f(r7, r15)
            boolean r15 = r4.f154504s
            if (r15 == 0) goto L_0x0ad9
            int r15 = r6.f154503r
            if (r15 <= 0) goto L_0x0ad9
            r43 = r3
            android.content.Context r3 = r1.f173499A
            r16 = r5
            r23 = r14
            r5 = 1
            java.lang.Object[] r14 = new java.lang.Object[r5]
            r5 = 2
            java.lang.String r5 = er1.C7878t0.m8034c(r5, r15)
            r15 = 0
            r14[r15] = r5
            r5 = 2131838037(0x7f114455, float:1.9309286E38)
            java.lang.String r3 = r3.getString(r5, r14)
            goto L_0x0ae8
        L_0x0ad9:
            r43 = r3
            r16 = r5
            r23 = r14
            android.content.Context r3 = r1.f173499A
            r5 = 2131838038(0x7f114456, float:1.9309288E38)
            java.lang.String r3 = r3.getString(r5)
        L_0x0ae8:
            java.lang.String r5 = "if (item.isAutoExpand &&…_more_comment2)\n        }"
            gy3.C87412m.m108593f(r3, r5)
            if (r12 == 0) goto L_0x0b44
            if (r11 == 0) goto L_0x0b44
            java.lang.String r2 = "downTipsLayout"
            gy3.C87412m.m108593f(r10, r2)
            r2 = 1
            r0.mo89668j(r10, r3, r6, r2)
            r2 = 2131314262(0x7f094656, float:1.8246944E38)
            android.view.View r2 = r1.mo85812D(r2)
            k20.a r3 = new k20.a
            r3.<init>()
            r5 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r3.mo10233c(r10)
            java.lang.Object[] r26 = r3.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r2
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r27 = "onBindViewHolder"
            java.lang.String r28 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            goto L_0x0c31
        L_0x0b44:
            k20.a r3 = new k20.a
            r3.<init>()
            r5 = 8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
            r3.mo10233c(r12)
            java.lang.Object[] r27 = r3.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r10
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r10.setVisibility(r3)
            java.lang.String r27 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
            if (r11 == 0) goto L_0x0be8
            int r3 = r2.getPaddingLeft()
            int r5 = r2.getPaddingTop()
            int r10 = r2.getPaddingRight()
            android.content.Context r11 = r1.f173499A
            r12 = 16
            int r11 = kg3.C76577a.m92151b(r11, r12)
            r2.setPadding(r3, r5, r10, r11)
            r2 = 2131314262(0x7f094656, float:1.8246944E38)
            android.view.View r2 = r1.mo85812D(r2)
            k20.a r3 = new k20.a
            r3.<init>()
            r5 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r3.mo10233c(r10)
            java.lang.Object[] r26 = r3.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r2
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r27 = "onBindViewHolder"
            java.lang.String r28 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
            goto L_0x0c31
        L_0x0be8:
            r2 = 2131314262(0x7f094656, float:1.8246944E38)
            android.view.View r2 = r1.mo85812D(r2)
            k20.a r3 = new k20.a
            r3.<init>()
            r5 = 8
            java.lang.Integer r10 = java.lang.Integer.valueOf(r5)
            r3.mo10233c(r10)
            java.lang.Object[] r26 = r3.mo10232b()
            java.lang.String r27 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            r25 = r2
            j20.C117292a.m165358d(r25, r26, r27, r28, r29, r30, r31, r32)
            r5 = 0
            java.lang.Object r3 = r3.mo10231a(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.setVisibility(r3)
            java.lang.String r26 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r27 = "onBindViewHolder"
            java.lang.String r28 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r29 = "android/view/View_EXEC_"
            java.lang.String r30 = "setVisibility"
            java.lang.String r31 = "(I)V"
            j20.C117292a.m165359e(r25, r26, r27, r28, r29, r30, r31)
        L_0x0c31:
            if (r13 == 0) goto L_0x0c46
            com.tencent.mm.plugin.finder.presenter.contract.CommentDrawerContract$NPresenter r2 = r0.f188747e
            r3 = 0
            boolean r2 = r2.mo77327a0(r4, r3)
            if (r2 == 0) goto L_0x0c46
            java.lang.String r2 = "upTipsLayout"
            gy3.C87412m.m108593f(r8, r2)
            r0.mo89668j(r8, r7, r6, r3)
            goto L_0x0c88
        L_0x0c46:
            k20.a r2 = new k20.a
            r2.<init>()
            r3 = 8
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2.mo10233c(r3)
            java.lang.Object[] r27 = r2.mo10232b()
            java.lang.String r28 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r29 = "onBindViewHolder"
            java.lang.String r30 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r31 = "android/view/View_EXEC_"
            java.lang.String r32 = "setVisibility"
            java.lang.String r33 = "(I)V"
            r26 = r8
            j20.C117292a.m165358d(r26, r27, r28, r29, r30, r31, r32, r33)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r8.setVisibility(r2)
            java.lang.String r27 = "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert"
            java.lang.String r28 = "onBindViewHolder"
            java.lang.String r29 = "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;IIZLjava/util/List;)V"
            java.lang.String r30 = "android/view/View_EXEC_"
            java.lang.String r31 = "setVisibility"
            java.lang.String r32 = "(I)V"
            j20.C117292a.m165359e(r26, r27, r28, r29, r30, r31, r32)
        L_0x0c88:
            android.text.SpannableString r2 = r4.f154495g
            r9.setContentDescription(r2)
            android.text.SpannableString r2 = r4.f154496h
            r3 = 2131302300(0x7f09179c, float:1.8222682E38)
            android.view.View r3 = r1.mo85812D(r3)
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 == 0) goto L_0x0cce
            r4 = 2131302575(0x7f0918af, float:1.822324E38)
            r12 = r24
            r3.setTag(r4, r12)
            r4 = 2131302516(0x7f091874, float:1.822312E38)
            r5 = r23
            r3.setTag(r4, r5)
            r4 = 2131302582(0x7f0918b6, float:1.8223254E38)
            r3.setTag(r4, r2)
            r2 = 2131302514(0x7f091872, float:1.8223116E38)
            r4 = 2131299973(0x7f090e85, float:1.8217963E38)
            android.view.View r4 = r1.mo85812D(r4)
            com.tencent.mm.plugin.finder.view.FinderCollapsibleTextView r4 = (com.tencent.p014mm.plugin.finder.view.FinderCollapsibleTextView) r4
            if (r4 == 0) goto L_0x0cc7
            java.lang.CharSequence r4 = r4.getText()
            if (r4 != 0) goto L_0x0cc5
            goto L_0x0cc7
        L_0x0cc5:
            r14 = r4
            goto L_0x0cc9
        L_0x0cc7:
            r14 = r37
        L_0x0cc9:
            r3.setTag(r2, r14)
            rx3.b0 r2 = rx3.C13598b0.f38549a
        L_0x0cce:
            r2 = 2131307880(0x7f092d68, float:1.8234E38)
            android.view.View r1 = r1.mo85812D(r2)
            if (r1 == 0) goto L_0x0ced
            r2 = 2131302525(0x7f09187d, float:1.8223139E38)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r16)
            r1.setTag(r2, r3)
            r2 = 2131302530(0x7f091882, float:1.8223149E38)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r43)
            r1.setTag(r2, r3)
            rx3.b0 r1 = rx3.C13598b0.f38549a
        L_0x0ced:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve1.C65592g0.mo44e(jq3.o, jq3.c, int, int, boolean, java.util.List):void");
    }

    /* renamed from: f */
    public void mo45f(RecyclerView recyclerView, C60905o oVar, int i) {
        C87412m.m108594g(recyclerView, "recyclerView");
        C87412m.m108594g(oVar, "holder");
        FinderCollapsibleTextView finderCollapsibleTextView = (FinderCollapsibleTextView) oVar.mo85812D(C0966R.C0970id.bj4);
        finderCollapsibleTextView.setLimitLine(4);
        finderCollapsibleTextView.setCollapse(true);
        finderCollapsibleTextView.mo23655d(false);
        finderCollapsibleTextView.setOnCollapse(new C65594b(oVar));
        View D = oVar.mo85812D(C0966R.C0970id.f358538fn1);
        C57839g4 g4Var = new C57839g4(D);
        D.setTouchDelegate(g4Var);
        int f = C76577a.m92155f(oVar.f173499A, C0966R.dimen.f3736cp);
        View D2 = oVar.mo85812D(C0966R.C0970id.a2u);
        if (D2 != null) {
            D2.post(new C65595c(D2, f, g4Var));
        }
        ((C61212e) C86312j.m106911c(C61212e.class)).o30(oVar.mo85812D(C0966R.C0970id.a2u), "finder_feed_second_comment_awesome_iv");
    }

    /* renamed from: j */
    public final void mo89668j(View view, String str, C55033u uVar, boolean z) {
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((TextView) view.findViewById(C0966R.C0970id.jk5)).setText(str);
        View findViewById = view.findViewById(C0966R.C0970id.f359203jk2);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view2 = findViewById;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = view.findViewById(C0966R.C0970id.jk4);
        C9556a aVar3 = new C9556a();
        aVar3.mo10233c(8);
        View view3 = findViewById2;
        C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/convert/FinderFeedCommentLevel2Convert", "initTipsLayout", "(Landroid/view/View;Ljava/lang/String;Lcom/tencent/mm/plugin/finder/model/FinderFeedComment;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setOnClickListener(new C65593a(findViewById, findViewById2, this, uVar, z));
    }

    /* renamed from: k */
    public final void mo89669k(C55033u uVar, C60905o oVar, boolean z) {
        FinderContact finderContact = uVar.f154492d.mo89532o2().author_contact;
        C13598b0 b0Var = null;
        C64284cg b = finderContact != null ? C58960c.m68830b(C58960c.m68834f(finderContact, (C58969q) null, false, 3, (Object) null), false) : null;
        if (b != null) {
            C65604i iVar = C65604i.f188772a;
            Context context = oVar.f173499A;
            C87412m.m108593f(context, "holder.context");
            String str = b.f182468d;
            if (str == null) {
                str = "";
            }
            iVar.mo89680f(context, str, this.f188747e.getCommentScene(), uVar, this.f188747e.mo77342u(), "");
            b0Var = C13598b0.f38549a;
        }
        if (b0Var == null) {
            C65604i iVar2 = C65604i.f188772a;
            String username = uVar.f154492d.getUsername();
            Context context2 = oVar.f173499A;
            C87412m.m108593f(context2, "holder.context");
            iVar2.mo89683i(username, uVar, context2, this.f188747e.getCommentScene(), "");
        }
        Context context3 = oVar.f173499A;
        C87412m.m108593f(context3, "holder.context");
        ((C58417y0) C86312j.m106911c(C58417y0.class)).Hy0(context3, true, true, 1, z);
    }
}
