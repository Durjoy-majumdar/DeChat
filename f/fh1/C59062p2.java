package fh1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53896h0;
import a14.C53934p0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import bl3.C39818r;
import cj1.C0576n4;
import cl1.C54991o;
import cl1.C55001u;
import cl1.C55004v1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveVisitorWithoutAffinityUI;
import com.tencent.p014mm.plugin.finder.live.controller.base.LiveRoomControllerStore;
import com.tencent.p014mm.plugin.finder.live.fragment.FinderLiveVisitorFragment;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.scrollsquare.widget.FinderLiveRefreshLoadMoreLayout;
import com.tencent.p014mm.plugin.finder.live.squarescroll.widget.LiveScrollSquareLayout;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.rtmp.p899ui.TXCloudVideoView;
import ek1.C7728a;
import f14.C58901s;
import f50.C58924d;
import f50.C58925e;
import fk1.C59113a;
import fk1.C59114b;
import fk1.C59119e;
import fy3.C32224a;
import fy3.C32227p;
import gh1.C59439b;
import gh1.C59453p;
import gh1.C59461x;
import gh1.C8313a;
import gi1.C8324b;
import gk1.C59522a;
import gk1.C59524b;
import gy3.C87412m;
import gy3.C87413o;
import hh1.C59894a;
import hh1.C59902j;
import j20.C117292a;
import j50.C60735a;
import java.util.ArrayList;
import java.util.List;
import kg3.C76577a;
import lt1.C61401a;
import nj3.C76912y0;
import nk1.C11207i;
import o40.C61926c;
import p50.C62197e;
import ph1.C62293i;
import ph1.C62297m;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C26236u;
import te3.C51652v61;
import te3.C52005xq0;
import w50.C65928b;
import wx3.C15601d;
import wx3.C66212f;
import yx3.C91590f;
import yx3.C91594j;
import zk1.C66878o0;

/* renamed from: fh1.p2 */
public final class C59062p2 extends C8313a implements LiveScrollSquareLayout.C55965a, C58925e, C59439b, C59902j, C59894a {

    /* renamed from: A */
    public boolean f168978A;

    /* renamed from: B */
    public final C13601g f168979B = C36568h.m40985a(new C59063a(this));

    /* renamed from: j */
    public final String f168980j = ("LiveScrollSquareControl@" + hashCode());

    /* renamed from: n */
    public ViewGroup f168981n;

    /* renamed from: o */
    public ImageView f168982o;

    /* renamed from: p */
    public FinderLiveRefreshLoadMoreLayout f168983p;

    /* renamed from: q */
    public C62297m f168984q;

    /* renamed from: r */
    public float f168985r;

    /* renamed from: s */
    public ViewGroup f168986s;

    /* renamed from: t */
    public C59453p f168987t;

    /* renamed from: u */
    public boolean f168988u;

    /* renamed from: v */
    public boolean f168989v;

    /* renamed from: w */
    public boolean f168990w;

    /* renamed from: x */
    public boolean f168991x;

    /* renamed from: y */
    public C51652v61 f168992y;

    /* renamed from: z */
    public C0576n4 f168993z;

    /* renamed from: fh1.p2$a */
    public static final class C59063a extends C87413o implements C32224a<C59522a> {

        /* renamed from: d */
        public final /* synthetic */ C59062p2 f168994d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59063a(C59062p2 p2Var) {
            super(0);
            this.f168994d = p2Var;
        }

        public Object invoke() {
            C59522a aVar = new C59522a(new C59061o2());
            aVar.f170124g.setScrollCallbackListener(this.f168994d);
            return aVar;
        }
    }

    /* renamed from: fh1.p2$b */
    public static final class C59064b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59062p2 f168995d;

        /* renamed from: e */
        public final /* synthetic */ long f168996e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59064b(C59062p2 p2Var, long j) {
            super(0);
            this.f168995d = p2Var;
            this.f168996e = j;
        }

        public Object invoke() {
            this.f168995d.mo84276N3(true, this.f168996e);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: fh1.p2$c */
    public static final class C59065c implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: d */
        public final /* synthetic */ C59062p2 f168997d;

        public C59065c(C59062p2 p2Var) {
            this.f168997d = p2Var;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C59062p2 p2Var = this.f168997d;
            Object animatedValue = valueAnimator.getAnimatedValue();
            C87412m.m108592e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
            p2Var.mo77759M2(((Float) animatedValue).floatValue());
        }
    }

    /* renamed from: fh1.p2$d */
    public static final class C59066d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C59062p2 f168998d;

        public C59066d(C59062p2 p2Var) {
            this.f168998d = p2Var;
        }

        public final void onClick(View view) {
            FinderLiveVisitorFragment finderLiveVisitorFragment;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/live/controller/LiveScrollSquareController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i(this.f168998d.f168980j, "on scrollTipsLayout click");
            FinderLiveService.f159376d.getClass();
            C60735a aVar = FinderLiveService.f159378f;
            if (aVar != null && aVar.mo85682Z()) {
                C76912y0.makeText(MMApplicationContext.getContext(), (int) C0966R.string.mrb, 1).show();
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/LiveScrollSquareController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            FinderLiveVisitorWithoutAffinityUI o3 = this.f168998d.mo84280o3();
            if (!(o3 == null || (finderLiveVisitorFragment = o3.f159020p) == null)) {
                C59062p2 p2Var = this.f168998d;
                ((C66878o0) C39818r.f106831a.mo62445d(finderLiveVisitorFragment).mo75002a(C66878o0.class)).mo75315e0(0.0f);
                p2Var.getClass();
                C7728a.f26169a.mo8843a(2);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/live/controller/LiveScrollSquareController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: fh1.p2$e */
    public static final class C59067e implements C59461x {

        /* renamed from: a */
        public final /* synthetic */ C59453p f168999a;

        public C59067e(C59453p pVar) {
            this.f168999a = pVar;
        }

        /* renamed from: a */
        public List<C59453p> mo9171a() {
            return C26236u.m33719b(this.f168999a);
        }

        /* renamed from: b */
        public List<C59453p> mo9172b() {
            return C26236u.m33719b(this.f168999a);
        }

        /* renamed from: c */
        public void mo9173c(boolean z) {
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.controller.LiveScrollSquareController$showScrollTipsLayout$1", mo125469f = "LiveScrollSquareController.kt", mo125470l = {359, 378}, mo125471m = "invokeSuspend")
    /* renamed from: fh1.p2$f */
    public static final class C59068f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f169000d;

        /* renamed from: e */
        public int f169001e;

        /* renamed from: f */
        public final /* synthetic */ C59062p2 f169002f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59068f(C59062p2 p2Var, C15601d<? super C59068f> dVar) {
            super(2, dVar);
            this.f169002f = p2Var;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C59068f(this.f169002f, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C59068f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:49:0x0147  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                xx3.a r1 = xx3.C15911a.COROUTINE_SUSPENDED
                int r2 = r0.f169001e
                r3 = 1
                r4 = 0
                r6 = 1000(0x3e8, double:4.94E-321)
                r8 = 2
                if (r2 == 0) goto L_0x0027
                if (r2 == r3) goto L_0x0023
                if (r2 != r8) goto L_0x001b
                java.lang.Object r1 = r0.f169000d
                fh1.p2 r1 = (fh1.C59062p2) r1
                kotlin.ResultKt.throwOnFailure(r18)
                goto L_0x00f6
            L_0x001b:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0023:
                kotlin.ResultKt.throwOnFailure(r18)
                goto L_0x0033
            L_0x0027:
                kotlin.ResultKt.throwOnFailure(r18)
                r0.f169001e = r3
                java.lang.Object r2 = a14.C53965x0.m60607b(r6, r0)
                if (r2 != r1) goto L_0x0033
                return r1
            L_0x0033:
                fh1.p2 r2 = r0.f169002f
                android.view.ViewGroup r9 = r2.f168981n
                r10 = 0
                if (r9 == 0) goto L_0x0063
                android.view.ViewGroup r2 = r2.f168986s
                if (r2 != 0) goto L_0x003f
                goto L_0x0044
            L_0x003f:
                java.lang.String r11 = "scrollTipsLayout"
                r2.setTransitionName(r11)
            L_0x0044:
                androidx.transition.AutoTransition r2 = new androidx.transition.AutoTransition
                r2.<init>()
                ek1.b r11 = new ek1.b
                r11.<init>()
                r2.mo145348U(r11)
                r2.mo145351X(r10)
                r11 = 250(0xfa, double:1.235E-321)
                r2.mo145349V(r11)
                rx3.b0 r11 = rx3.C13598b0.f38549a
                java.lang.Class<androidx.recyclerview.widget.RecyclerView> r11 = androidx.recyclerview.widget.RecyclerView.class
                r2.mo145338s(r11, r3)
                androidx.transition.C103834d.m138407a(r9, r2)
            L_0x0063:
                fh1.p2 r2 = r0.f169002f
                gh1.p r2 = r2.f168987t
                if (r2 == 0) goto L_0x006c
                r2.mo84560c(r10)
            L_0x006c:
                fh1.p2 r2 = r0.f169002f
                java.lang.Class<fh1.s2> r9 = fh1.C59079s2.class
                com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r2 = r2.controller(r9)
                r11 = r2
                fh1.s2 r11 = (fh1.C59079s2) r11
                if (r11 == 0) goto L_0x0085
                r12 = 0
                boolean r13 = r11.mo84287n3()
                r14 = 1
                r15 = 1
                r16 = 0
                fh1.C59079s2.m69007m3(r11, r12, r13, r14, r15, r16)
            L_0x0085:
                fh1.p2 r2 = r0.f169002f
                com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI r9 = r2.mo84280o3()
                if (r9 == 0) goto L_0x009d
                bl3.r r10 = bl3.C39818r.f106831a
                bl3.r$a r9 = r10.mo62444c(r9)
                java.lang.Class<dk1.g> r10 = dk1.C58312g.class
                androidx.lifecycle.i0 r9 = r9.mo75002a(r10)
                dk1.g r9 = (dk1.C58312g) r9
                boolean r10 = r9.f166967e
            L_0x009d:
                r9 = r10 ^ 1
                r2.mo84274L3(r9)
                fh1.p2 r2 = r0.f169002f
                r2.getClass()
                ek1.a r2 = ek1.C7728a.f26169a
                r2.mo8843a(r3)
                fh1.p2 r2 = r0.f169002f
                te3.v61 r9 = r2.f168992y
                if (r9 == 0) goto L_0x0150
                java.lang.String r10 = r2.f168980j
                java.lang.StringBuilder r11 = new java.lang.StringBuilder
                r11.<init>()
                java.lang.String r12 = "showScrollTipsLayout recommendPreloadInfo flag: "
                r11.append(r12)
                long r12 = r9.f143342d
                r11.append(r12)
                java.lang.String r12 = " duration: "
                r11.append(r12)
                int r12 = r9.f143344f
                r11.append(r12)
                java.lang.String r11 = r11.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
                te3.v61 r10 = r2.f168992y
                if (r10 == 0) goto L_0x00dc
                long r10 = r10.f143342d
                goto L_0x00dd
            L_0x00dc:
                r10 = r4
            L_0x00dd:
                r12 = 4
                boolean r10 = o40.C61926c.m72697v(r10, r12)
                if (r10 == 0) goto L_0x0150
                int r9 = r9.f143344f
                long r9 = (long) r9
                long r9 = r9 * r6
                r0.f169000d = r2
                r0.f169001e = r8
                java.lang.Object r6 = a14.C53965x0.m60607b(r9, r0)
                if (r6 != r1) goto L_0x00f5
                return r1
            L_0x00f5:
                r1 = r2
            L_0x00f6:
                com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI r2 = r1.mo84280o3()
                if (r2 == 0) goto L_0x0150
                com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment r6 = r2.f159020p
                if (r6 == 0) goto L_0x0150
                bl3.r r7 = bl3.C39818r.f106831a
                bl3.r$a r6 = r7.mo62445d(r6)
                java.lang.Class<zk1.o0> r7 = zk1.C66878o0.class
                androidx.lifecycle.i0 r6 = r6.mo75002a(r7)
                zk1.o0 r6 = (zk1.C66878o0) r6
                r7 = 3
                te3.xp2 r9 = new te3.xp2
                r9.<init>()
                com.tencent.mm.plugin.finder.live.model.FinderLiveService r10 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                java.lang.Class<cl1.u> r11 = cl1.C55001u.class
                androidx.lifecycle.i0 r10 = r10.mo77630e(r11)
                cl1.u r10 = (cl1.C55001u) r10
                if (r10 == 0) goto L_0x0127
                te3.c21 r10 = r10.f154420q
                if (r10 == 0) goto L_0x0127
                long r4 = r10.f182392d
            L_0x0127:
                r9.f186373h = r4
                ok1.e r10 = ok1.C62042e.f176370a
                java.lang.String r1 = r1.f168980j
                te3.h71 r1 = r10.mo87008H(r2, r4, r1)
                r9.f186372g = r1
                r9.f186374i = r3
                long r1 = r6.f192127i
                r9.f186376n = r1
                java.lang.Class<kq.g> r1 = p185kq.C61130g.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                kq.g r1 = (p185kq.C61130g) r1
                java.lang.String r1 = r1.mo33244gK()
                if (r1 != 0) goto L_0x0149
                java.lang.String r1 = ""
            L_0x0149:
                r9.f186377o = r1
                rx3.b0 r1 = rx3.C13598b0.f38549a
                r6.mo90871d3(r7, r9)
            L_0x0150:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: fh1.C59062p2.C59068f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: fh1.p2$g */
    public static final class C59069g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C59062p2 f169003d;

        /* renamed from: e */
        public final /* synthetic */ int f169004e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C59069g(C59062p2 p2Var, int i) {
            super(0);
            this.f169003d = p2Var;
            this.f169004e = i;
        }

        public Object invoke() {
            C59062p2 p2Var = this.f169003d;
            if (C61926c.m72696u(p2Var.f27262f, 4)) {
                p2Var.mo84270G3();
            }
            this.f169003d.mo84269F3().mo84599g(this.f169004e);
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59062p2(LiveRoomControllerStore liveRoomControllerStore) {
        super(liveRoomControllerStore);
        C87412m.m108594g(liveRoomControllerStore, "store");
    }

    /* renamed from: F1 */
    public void mo77758F1(boolean z, boolean z2, float f) {
        C13598b0 b0Var;
        String str = this.f168980j;
        Log.m105924i(str, "onTouchScrollUp isClickEvent: " + z + " inOverScrollRange: " + z2 + " offestY: " + f);
        if (z || !z2) {
            C62297m mVar = this.f168984q;
            if (mVar != null) {
                mVar.mo84323h(new C59064b(this, ((C55001u) business(C55001u.class)).f154416j));
                b0Var = C13598b0.f38549a;
            } else {
                b0Var = null;
            }
            if (b0Var == null) {
                mo84276N3(false, 0);
                return;
            }
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, 0.0f});
        ofFloat.addUpdateListener(new C59065c(this));
        ofFloat.setDuration(100).start();
    }

    /* renamed from: F3 */
    public final C59522a mo84269F3() {
        return (C59522a) ((C36570n) this.f168979B).getValue();
    }

    /* renamed from: G3 */
    public final void mo84270G3() {
        mo84274L3(false);
        C59453p pVar = this.f168987t;
        if (pVar != null) {
            pVar.mo84560c(8);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0027, code lost:
        r0 = r0.f159020p;
     */
    /* renamed from: I3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo84271I3() {
        /*
            r4 = this;
            ok1.e r0 = ok1.C62042e.f176370a
            boolean r0 = r0.mo87030O0()
            r1 = 1
            if (r0 == 0) goto L_0x000a
            return r1
        L_0x000a:
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI r0 = r4.mo84280o3()
            if (r0 == 0) goto L_0x0020
            cj1.n4$a r2 = cj1.C0576n4.f1379b
            android.content.Intent r0 = r0.getIntent()
            cj1.n4 r0 = r2.mo598a(r0)
            if (r0 != 0) goto L_0x001e
            cj1.n4 r0 = r4.f168993z
        L_0x001e:
            r4.f168993z = r0
        L_0x0020:
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI r0 = r4.mo84280o3()
            r2 = 0
            if (r0 == 0) goto L_0x003e
            com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment r0 = r0.f159020p
            if (r0 == 0) goto L_0x003e
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r0 = r3.mo62445d(r0)
            java.lang.Class<zk1.o0> r3 = zk1.C66878o0.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r3)
            zk1.o0 r0 = (zk1.C66878o0) r0
            boolean r0 = r0.mo90870c3()
            goto L_0x003f
        L_0x003e:
            r0 = 0
        L_0x003f:
            cj1.n4 r3 = r4.f168993z
            if (r3 == 0) goto L_0x004d
            te3.wp2 r3 = r3.f1381a
            if (r3 == 0) goto L_0x004d
            boolean r3 = r3.f186152d
            if (r3 != 0) goto L_0x004d
            r3 = 1
            goto L_0x004e
        L_0x004d:
            r3 = 0
        L_0x004e:
            if (r3 == 0) goto L_0x0054
            if (r0 != 0) goto L_0x0053
            goto L_0x0054
        L_0x0053:
            r1 = 0
        L_0x0054:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C59062p2.mo84271I3():boolean");
    }

    /* renamed from: J1 */
    public void mo9728J1(C8324b bVar) {
        C87412m.m108594g(bVar, "micInfoData");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001c, code lost:
        r2 = r2.f159020p;
     */
    /* renamed from: J3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo84272J3(int r8, java.lang.String r9) {
        /*
            r7 = this;
            boolean r0 = r7.mo84271I3()
            java.lang.Class<ky2.i> r1 = ky2.C10432i.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ky2.i r1 = (ky2.C10432i) r1
            boolean r1 = r1.mo10750e()
            r2 = 4
            boolean r8 = o40.C61926c.m72696u(r8, r2)
            com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI r2 = r7.mo84280o3()
            r3 = 0
            if (r2 == 0) goto L_0x0033
            com.tencent.mm.plugin.finder.live.fragment.FinderLiveVisitorFragment r2 = r2.f159020p
            if (r2 == 0) goto L_0x0033
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r2 = r4.mo62445d(r2)
            java.lang.Class<zk1.o0> r4 = zk1.C66878o0.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r4)
            zk1.o0 r2 = (zk1.C66878o0) r2
            boolean r2 = r2.mo90870c3()
            goto L_0x0034
        L_0x0033:
            r2 = 0
        L_0x0034:
            java.lang.String r4 = r7.f168980j
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "isSwitchEnableScrollSquare source: "
            r5.append(r6)
            r5.append(r9)
            java.lang.String r9 = " isDisableScrollSquare: "
            r5.append(r9)
            r5.append(r0)
            java.lang.String r9 = " isFirstItem: "
            r5.append(r9)
            r5.append(r2)
            java.lang.String r9 = " isSwitchEnable: "
            r5.append(r9)
            r5.append(r8)
            java.lang.String r9 = " isTeenMode: "
            r5.append(r9)
            r5.append(r1)
            java.lang.String r9 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r9)
            if (r0 != 0) goto L_0x0073
            if (r2 == 0) goto L_0x0073
            if (r8 == 0) goto L_0x0073
            if (r1 != 0) goto L_0x0073
            r3 = 1
        L_0x0073:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C59062p2.mo84272J3(int, java.lang.String):boolean");
    }

    /* renamed from: K3 */
    public final void mo84273K3(boolean z) {
        if (mo84271I3()) {
            Log.m105924i(this.f168980j, "setIsInFluentSwitch not supportScrollSquare");
            return;
        }
        this.f168988u = z;
        mo84278m3("setIsInFluentSwitch: " + z);
    }

    /* renamed from: L3 */
    public final void mo84274L3(boolean z) {
        String str = this.f168980j;
        Log.m105924i(str, "setIsSupportNestScroll: " + z);
        FinderLiveRefreshLoadMoreLayout finderLiveRefreshLoadMoreLayout = this.f168983p;
        if (finderLiveRefreshLoadMoreLayout != null) {
            finderLiveRefreshLoadMoreLayout.setSupportNestScroll(z);
        }
    }

    /* renamed from: M2 */
    public void mo77759M2(float f) {
        float f2 = 0.0f;
        if (f < 0.0f) {
            float f3 = this.f168985r;
            f2 = ((float) 1) - ((f + f3) / f3);
        }
        C62297m mVar = this.f168984q;
        C59113a aVar = mVar instanceof C59113a ? (C59113a) mVar : null;
        if (aVar != null) {
            aVar.f169076e.mo84338A(f2);
        }
        this.f168978A = true;
    }

    /* renamed from: M3 */
    public final void mo84275M3() {
        C58924d dVar;
        if (mo84271I3() || this.f168989v) {
            String str = this.f168980j;
            Log.m105924i(str, "onLiveActivate not supportScrollSquare, hasControllerInit: " + this.f168989v);
        } else {
            this.f168989v = true;
            C11207i.m11066b(this, (C66212f) null, (C53934p0) null, new C59072q2(this, (C15601d<? super C59072q2>) null), 3, (Object) null);
            FinderLiveService.f159376d.getClass();
            C60735a aVar = FinderLiveService.f159378f;
            C62197e eVar = aVar instanceof C62197e ? (C62197e) aVar : null;
            if (!(eVar == null || (dVar = eVar.f176822Y0.f152627a) == null)) {
                dVar.mo84120h(this);
            }
        }
        ViewGroup viewGroup = this.f168981n;
        C56032b bVar = viewGroup instanceof C56032b ? (C56032b) viewGroup : null;
        if (bVar != null) {
            C53896h0 h0Var = C53872d1.f151117a;
            C11207i.m11070f(bVar, C58901s.f168555a, (C53934p0) null, new C59068f(this, (C15601d<? super C59068f>) null), 2, (Object) null);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0096  */
    /* renamed from: N3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84276N3(boolean r15, long r16) {
        /*
            r14 = this;
            r0 = r14
            r1 = 0
            r0.f168978A = r1
            zt3.t r2 = zt3.C119157j.f356862d
            cj1.w5 r3 = cj1.C28594w5.f78482d
            zt3.j r2 = (zt3.C119157j) r2
            java.lang.String r4 = "Finder.LiveExceptionMonitor"
            r2.mo183876g(r3, r4)
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r2.getClass()
            j50.a r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r3 == 0) goto L_0x001b
            r3.mo75580f0()
        L_0x001b:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159349B
            if (r3 == 0) goto L_0x0024
            gh1.j r4 = gh1.C59447j.f169870a
            r4.mo84553e(r3)
        L_0x0024:
            r2.mo77608K()
            java.lang.Class<cl1.d> r3 = cl1.C54951d.class
            androidx.lifecycle.i0 r3 = r2.mo77630e(r3)
            cl1.d r3 = (cl1.C54951d) r3
            r4 = 2
            if (r3 == 0) goto L_0x003d
            com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData<java.lang.Integer> r3 = r3.f154005j
            if (r3 == 0) goto L_0x003d
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r3.postValue(r5)
        L_0x003d:
            ok1.e r3 = ok1.C62042e.f176370a
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r6 = "getContext()"
            gy3.C87412m.m108593f(r5, r6)
            java.lang.Class r3 = r3.mo87062a0(r5)
            android.content.Intent r5 = new android.content.Intent
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5.<init>(r6, r3)
            java.lang.Class<cl1.v1> r6 = cl1.C55004v1.class
            androidx.lifecycle.i0 r2 = r2.mo77630e(r6)
            cl1.v1 r2 = (cl1.C55004v1) r2
            r6 = 1
            if (r2 == 0) goto L_0x006f
            java.util.LinkedList<te3.aq2> r2 = r2.f154438i
            int r2 = r2.size()
            if (r2 <= 0) goto L_0x006a
            r2 = 1
            goto L_0x006b
        L_0x006a:
            r2 = 0
        L_0x006b:
            if (r2 != r6) goto L_0x006f
            r2 = 1
            goto L_0x0070
        L_0x006f:
            r2 = 0
        L_0x0070:
            if (r2 == 0) goto L_0x0080
            java.lang.String r2 = r0.f168980j
            java.lang.String r7 = "miniWindowStartActivity isMultiStreamEnable justRemoveMiniWindow"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r7)
            j50.a r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            if (r2 == 0) goto L_0x0080
            r2.mo85683a0()
        L_0x0080:
            boolean r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159380h
            if (r2 != 0) goto L_0x00b9
            com.tencent.mm.plugin.finder.live.view.b r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r2 == 0) goto L_0x00b9
            android.content.Context r7 = r2.getContext()
            java.lang.Class r7 = r7.getClass()
            boolean r3 = gy3.C87412m.m108589b(r7, r3)
            if (r3 != 0) goto L_0x00b6
            android.content.Context r3 = r2.getContext()
            boolean r7 = r3 instanceof com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI
            if (r7 == 0) goto L_0x00a1
            com.tencent.mm.plugin.finder.ui.MMFinderUI r3 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r3
            goto L_0x00a2
        L_0x00a1:
            r3 = 0
        L_0x00a2:
            if (r3 == 0) goto L_0x00b6
            androidx.lifecycle.j r7 = r3.getLifecycle()
            androidx.lifecycle.j$c r7 = r7.getCurrentState()
            androidx.lifecycle.j$c r8 = androidx.lifecycle.C39623j.C39626c.DESTROYED
            if (r7 == r8) goto L_0x00b6
            r2.setFinishActivityNotReleaseLive(r6)
            r3.finish()
        L_0x00b6:
            r2.setCheckMiniWin(r6)
        L_0x00b9:
            cj1.n4$a r2 = cj1.C0576n4.f1379b
            cj1.n4 r3 = r0.f168993z
            r2.mo599b(r5, r3)
            java.lang.String r2 = "LAUNCH_WITH_ANIM"
            r3 = r15
            r5.putExtra(r2, r15)
            java.lang.String r2 = "CURRENT_FEED_ID"
            r7 = r16
            r5.putExtra(r2, r7)
            java.lang.String r2 = "route_to_maximize"
            r5.putExtra(r2, r6)
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.t1 r2 = (ht1.C60200t1) r2
            r2.mo76876sZ(r4, r5)
            r2 = 872415232(0x34000000, float:1.1920929E-7)
            r5.addFlags(r2)
            android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            k20.a r3 = new k20.a
            r3.<init>()
            r3.mo10233c(r5)
            java.lang.Object[] r7 = r3.mo10232b()
            java.lang.String r8 = "com/tencent/mm/plugin/finder/live/controller/LiveScrollSquareController"
            java.lang.String r9 = "startLiveActivity"
            java.lang.String r10 = "(ZJ)V"
            java.lang.String r11 = "Undefined"
            java.lang.String r12 = "startActivity"
            java.lang.String r13 = "(Landroid/content/Intent;)V"
            r6 = r2
            j20.C117292a.m165358d(r6, r7, r8, r9, r10, r11, r12, r13)
            java.lang.Object r1 = r3.mo10231a(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            r2.startActivity(r1)
            java.lang.String r7 = "com/tencent/mm/plugin/finder/live/controller/LiveScrollSquareController"
            java.lang.String r8 = "startLiveActivity"
            java.lang.String r9 = "(ZJ)V"
            java.lang.String r10 = "Undefined"
            java.lang.String r11 = "startActivity"
            java.lang.String r12 = "(Landroid/content/Intent;)V"
            j20.C117292a.m165359e(r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C59062p2.mo84276N3(boolean, long):void");
    }

    /* renamed from: Q */
    public void mo84277Q(boolean z) {
        String str = this.f168980j;
        Log.m105924i(str, "onSlideBarDragFinished " + z);
        if (mo84271I3()) {
            Log.m105924i(this.f168980j, "onSlideBarDragFinished not supportScrollSquare");
        } else if (z) {
            mo84274L3(false);
        } else if (mo84272J3(((C54991o) business(C54991o.class)).f154324i, "onSlideBarDragFinished")) {
            mo84274L3(true);
        }
    }

    /* renamed from: X2 */
    public void mo75898X2() {
        mo84269F3().mo84597e();
    }

    /* renamed from: d */
    public void mo77760d() {
        C62297m mVar;
        Class cls = C54991o.class;
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        C62197e eVar = aVar instanceof C62197e ? (C62197e) aVar : null;
        int i = 0;
        View childAt = mo84269F3().f170125h.getChildAt(0);
        TXCloudVideoView tXCloudVideoView = childAt instanceof TXCloudVideoView ? (TXCloudVideoView) childAt : null;
        C58924d dVar = eVar != null ? eVar.f176822Y0.f152627a : null;
        String str = this.f168980j;
        Log.m105924i(str, "createOutDirector player:" + dVar);
        long j = ((C55001u) business(C55001u.class)).f154416j;
        int i2 = ((C54991o) business(cls)).f154335l1;
        int i3 = ((C54991o) business(cls)).f154338m1;
        if (!(tXCloudVideoView == null || j == 0)) {
            TextureView videoView = tXCloudVideoView.getVideoView();
            C87412m.m108593f(videoView, "playerView.videoView");
            C59114b bVar = r6;
            C59114b bVar2 = new C59114b(C61401a.LIVE_SCROLL_SQUARE, j, tXCloudVideoView, i2, i3, (((float) i2) * 1.0f) / ((float) i3), dVar, (SurfaceTexture) null, videoView, mo84269F3());
            C62293i iVar = C62293i.f177081a;
            if (iVar.mo87360e(j) == null || (mVar = this.f168984q) == null) {
                Context context = MMApplicationContext.getContext();
                C87412m.m108593f(context, "getContext()");
                this.f168984q = iVar.mo87363h(context, bVar);
            } else {
                mVar.mo84319d(bVar);
            }
        }
        C62297m mVar2 = this.f168984q;
        C59113a aVar2 = mVar2 instanceof C59113a ? (C59113a) mVar2 : null;
        if (aVar2 != null) {
            C59119e eVar2 = aVar2.f169076e;
            ViewGroup.LayoutParams layoutParams = eVar2.mo84341z().f170124g.getLayoutParams();
            C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            eVar2.f169100w = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            eVar2.f169101x = (((float) eVar2.mo88661s().width()) * 1.0f) / ((float) eVar2.mo88660q().width());
            eVar2.f169102y = (((float) eVar2.mo88661s().height()) * 1.0f) / ((float) eVar2.mo88660q().height());
            eVar2.f169103z = (float) (eVar2.mo88661s().centerX() - eVar2.mo88660q().centerX());
            eVar2.mo88661s().centerY();
            eVar2.mo88660q().centerY();
            View view = eVar2.f181116q;
            eVar2.f169096A = view != null ? view.getWidth() : 0;
            View view2 = eVar2.f181116q;
            if (view2 != null) {
                i = view2.getHeight();
            }
            eVar2.f169097B = i;
            eVar2.mo84341z().f170137w.setAlpha(1.0f);
            String str2 = eVar2.f181104e;
            Log.m105924i(str2, "onTouchStart contentStartTop: " + eVar2.f169100w + " scaleRatioX: " + eVar2.f169101x + " scaleRatioY: " + eVar2.f169102y + " translationX: " + eVar2.f169103z + " videoViewWidth: " + eVar2.f169096A + " videoViewHeight: " + eVar2.f169097B);
        }
        ViewGroup.LayoutParams layoutParams2 = mo84269F3().f170124g.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        this.f168985r = marginLayoutParams != null ? (float) marginLayoutParams.topMargin : 0.0f;
        this.f168978A = true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        r0 = r0.f170139y;
     */
    /* renamed from: g2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9729g2(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.mo84271I3()
            if (r0 == 0) goto L_0x000e
            java.lang.String r4 = r3.f168980j
            java.lang.String r0 = "onAnchorAudioChange not supportScrollSquare"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r0)
            return
        L_0x000e:
            gk1.a r0 = r3.mo84269F3()
            r1 = 0
            if (r0 == 0) goto L_0x001e
            com.tencent.mm.view.ratio.RatioLayout r0 = r0.f170139y
            if (r0 == 0) goto L_0x001e
            iq3.b r0 = r0.getAdapter()
            goto L_0x001f
        L_0x001e:
            r0 = r1
        L_0x001f:
            boolean r2 = r0 instanceof uk1.C65409j
            if (r2 == 0) goto L_0x0026
            r1 = r0
            uk1.j r1 = (uk1.C65409j) r1
        L_0x0026:
            if (r1 == 0) goto L_0x002b
            r1.mo89490k(r4)
        L_0x002b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C59062p2.mo9729g2(boolean):void");
    }

    /* renamed from: l3 */
    public void mo9314l3(int i) {
        if (mo84271I3()) {
            Log.m105924i(this.f168980j, "updateState not supportScrollSquare");
        } else {
            C61926c.m72668M(new C59069g(this, i));
        }
    }

    /* renamed from: m2 */
    public void mo9730m2(int i, int i2) {
        if (mo84271I3()) {
            Log.m105924i(this.f168980j, "onLiveStateResolutionChange not supportScrollSquare");
            return;
        }
        C59079s2 s2Var = (C59079s2) controller(C59079s2.class);
        if (s2Var != null) {
            boolean z = true;
            if (i < i2) {
                if (!(((C55004v1) business(C55004v1.class)).f154438i.size() > 0)) {
                    z = false;
                }
            }
            C59079s2.m69007m3(s2Var, false, z, false, 5, (Object) null);
        }
        C59522a F3 = mo84269F3();
        F3.getClass();
        Log.m105924i("LiveScrollPanelWidget", "adjustPanelSize videoWidth: " + i + " videoHeight: " + i2 + " mode: " + F3.f170120D);
        if (F3.f170120D == C59522a.f170115I) {
            C61926c.m72668M(new C59524b(F3, C65928b.f189533a.mo89964b(i, i2)));
        }
    }

    /* renamed from: m3 */
    public final void mo84278m3(String str) {
        if (!this.f168990w) {
            String str2 = this.f168980j;
            Log.m105924i(str2, "checkScrollTipsEnable source: " + str + " view is unmount");
            this.f168991x = true;
            return;
        }
        boolean u = C61926c.m72696u(this.f27262f, 4);
        String str3 = this.f168980j;
        Log.m105924i(str3, "checkScrollTipsEnable: source " + str + " isLiveFinish: " + u);
        if (this.f168988u || u || !mo84272J3(((C54991o) business(C54991o.class)).f154324i, str)) {
            mo84270G3();
        } else {
            mo84275M3();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000e, code lost:
        r3 = r3.f172989A;
     */
    /* renamed from: n3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo84279n3(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.Class<hr.t> r0 = p165hr.C60106t.class
            java.lang.Class<cl1.o> r1 = cl1.C54991o.class
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r2.getClass()
            j50.a r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            r4 = 0
            if (r3 == 0) goto L_0x0017
            d50.i r3 = r3.f172989A
            if (r3 == 0) goto L_0x0017
            boolean r3 = r3.mo82888j()
            goto L_0x0018
        L_0x0017:
            r3 = 0
        L_0x0018:
            java.lang.String r5 = r12.f168980j
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = " live square close live, isSquarePanelMode: "
            r6.append(r7)
            r6.append(r3)
            java.lang.String r7 = " source: "
            r6.append(r7)
            r6.append(r13)
            java.lang.String r13 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
            if (r3 == 0) goto L_0x00db
            android.content.Context r13 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            boolean r13 = com.tencent.p014mm.sdk.platformtools.Util.isTopApplication(r13)
            boolean r3 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159380h
            if (r3 != 0) goto L_0x0057
            bl3.r r3 = bl3.C39818r.f106831a
            java.lang.Class<ht1.t1> r5 = ht1.C60200t1.class
            bl3.r$a r3 = r3.mo62446e(r5)
            java.lang.Class<fe1.m> r5 = fe1.C58966m.class
            bl3.c r3 = r3.mo62447c(r5)
            fe1.m r3 = (fe1.C58966m) r3
            r3.mo5195m0()
        L_0x0057:
            wg1.y2 r5 = wg1.C66110y2.f190024a
            r6 = 3
            androidx.lifecycle.i0 r3 = r2.mo77630e(r1)
            cl1.o r3 = (cl1.C54991o) r3
            if (r3 == 0) goto L_0x0066
            int r3 = r3.f154284Y2
            r7 = r3
            goto L_0x0067
        L_0x0066:
            r7 = 0
        L_0x0067:
            androidx.lifecycle.i0 r1 = r2.mo77630e(r1)
            cl1.o r1 = (cl1.C54991o) r1
            if (r1 == 0) goto L_0x0073
            int r1 = r1.f154291a1
            r8 = r1
            goto L_0x0074
        L_0x0073:
            r8 = 0
        L_0x0074:
            r9 = 0
            r10 = 8
            r11 = 0
            wg1.C66110y2.m77912b(r5, r6, r7, r8, r9, r10, r11)
            r1 = 2
            r3 = 0
            com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.m63768J(r2, r13, r3, r1, r3)
            di3.d r13 = di3.C86312j.m106911c(r0)
            hr.t r13 = (p165hr.C60106t) r13
            hg1.i r13 = r13.Cx0()
            r13.mo58846jo()
            di3.d r13 = di3.C86312j.m106911c(r0)
            hr.t r13 = (p165hr.C60106t) r13
            hg1.b r13 = r13.yx0()
            r13.mo9439Yt()
            java.lang.Class<ak1.w> r13 = ak1.C54116w.class
            di3.d r13 = di3.C86312j.m106911c(r13)
            java.lang.String r0 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r13, r0)
            r5 = r13
            ak1.w r5 = (ak1.C54116w) r5
            com.tencent.mm.plugin.finder.live.view.b r13 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159379g
            if (r13 == 0) goto L_0x00b2
            android.content.Context r13 = r13.getContext()
            r6 = r13
            goto L_0x00b3
        L_0x00b2:
            r6 = r3
        L_0x00b3:
            ak1.f0$q0 r7 = ak1.C54067f0.C54079q0.CloseTypeFloat
            al1.i r13 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159398z
            if (r13 == 0) goto L_0x00bb
            android.os.Bundle r3 = r13.f151996k
        L_0x00bb:
            r8 = r3
            r9 = 0
            r10 = 8
            r11 = 0
            ak1.C54116w.wy0(r5, r6, r7, r8, r9, r10, r11)
            cj1.n4$a r13 = cj1.C0576n4.f1379b
            java.lang.String r13 = "Finder.FinderLiveScrollSquareBundle"
            java.lang.String r0 = "clearBundleStore"
            java.lang.Object[] r1 = new java.lang.Object[r4]
            com.tencent.p014mm.sdk.platformtools.Log.printInfoStack(r13, r0, r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, cj1.n4> r13 = cj1.C0576n4.f1380c
            monitor-enter(r13)
            r13.clear()     // Catch:{ all -> 0x00d8 }
            rx3.b0 r0 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00d8 }
            monitor-exit(r13)
            goto L_0x00db
        L_0x00d8:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C59062p2.mo84279n3(java.lang.String):void");
    }

    /* renamed from: o3 */
    public final FinderLiveVisitorWithoutAffinityUI mo84280o3() {
        ViewGroup viewGroup = this.f168981n;
        Context context = viewGroup != null ? viewGroup.getContext() : null;
        if (context instanceof FinderLiveVisitorWithoutAffinityUI) {
            return (FinderLiveVisitorWithoutAffinityUI) context;
        }
        return null;
    }

    public void onLiveActivate() {
    }

    public void onLiveDeactivate() {
        C58924d dVar;
        super.onLiveDeactivate();
        if (mo84271I3()) {
            Log.m105924i(this.f168980j, "onLiveDeactivate not supportScrollSquare");
            return;
        }
        FinderLiveService.f159376d.getClass();
        C60735a aVar = FinderLiveService.f159378f;
        C62197e eVar = aVar instanceof C62197e ? (C62197e) aVar : null;
        if (eVar != null && (dVar = eVar.f176822Y0.f152627a) != null) {
            dVar.mo84122k(this);
        }
    }

    public void onLiveStart(C52005xq0 xq02) {
        this.f168992y = xq02 != null ? xq02.f144838Z0 : null;
        FinderLiveVisitorWithoutAffinityUI o3 = mo84280o3();
        if (o3 != null && o3.getIntent() != null) {
            if (mo84272J3(xq02 != null ? xq02.f144863r : 0, "onLiveStart")) {
                mo84275M3();
            } else {
                mo84270G3();
            }
        }
    }

    public void onLiveStartFromWindow() {
        mo84278m3("onLiveStartFromWindow");
    }

    public void onViewMount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f168990w = true;
        this.f168981n = viewGroup;
        this.f168983p = (FinderLiveRefreshLoadMoreLayout) viewGroup.getRootView().findViewById(C0966R.C0970id.dyi);
        this.f168982o = (ImageView) viewGroup.findViewById(C0966R.C0970id.fv6);
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(C0966R.C0970id.jz_);
        this.f168986s = viewGroup2;
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        ViewGroup.LayoutParams layoutParams = viewGroup2 != null ? viewGroup2.getLayoutParams() : null;
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        }
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = C85875k4.m106198o(viewGroup.getContext()) - C76577a.m92157h(MMApplicationContext.getContext(), C0966R.dimen.f3766df);
        }
        ViewGroup viewGroup3 = this.f168986s;
        if (viewGroup3 != null) {
            viewGroup3.setOnClickListener(new C59066d(this));
        }
        ViewGroup viewGroup4 = this.f168986s;
        if (viewGroup4 != null) {
            C59453p pVar = new C59453p(viewGroup4, this);
            this.f168987t = pVar;
            this.f27265i = new C59067e(pVar);
        }
        mo84270G3();
        String str = this.f168980j;
        Log.m105924i(str, "onViewMount isNeedCheckScrollTipsEnable: " + this.f168991x);
        if (this.f168991x) {
            mo84278m3("onViewMount");
            this.f168991x = false;
        }
    }

    public void onViewUnmount(ViewGroup viewGroup) {
        C87412m.m108594g(viewGroup, "pluginLayout");
        this.f27265i = null;
        this.f168990w = false;
        mo84270G3();
        this.f168987t = null;
    }

    /* renamed from: s */
    public void mo75899s() {
        mo84269F3().mo84596d();
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [iq3.b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo9732v0(org.json.JSONObject r12) {
        /*
            r11 = this;
            boolean r0 = r11.mo84271I3()
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            com.tencent.mm.plugin.finder.live.model.FinderLiveService r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
            r0.getClass()
            j50.a r0 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159378f
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001d
            d50.i r0 = r0.f172989A
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.mo82888j()
            if (r0 != r1) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            if (r1 == 0) goto L_0x0067
            boolean r0 = r11.f168978A
            if (r0 != 0) goto L_0x0067
            gk1.a r0 = r11.mo84269F3()
            if (r0 == 0) goto L_0x0067
            com.tencent.mm.view.ratio.RatioLayout r0 = r0.f170139y
            if (r0 == 0) goto L_0x0067
            int r1 = r0.getWidth()
            r2 = 0
            if (r1 == 0) goto L_0x004a
            int r1 = r0.getHeight()
            if (r1 == 0) goto L_0x004a
            android.graphics.Point r1 = new android.graphics.Point
            int r3 = r0.getWidth()
            int r4 = r0.getHeight()
            r1.<init>(r3, r4)
            r10 = r1
            goto L_0x004b
        L_0x004a:
            r10 = r2
        L_0x004b:
            iq3.b r0 = r0.getAdapter()
            boolean r1 = r0 instanceof uk1.C65409j
            if (r1 == 0) goto L_0x0056
            r2 = r0
            uk1.j r2 = (uk1.C65409j) r2
        L_0x0056:
            r5 = r2
            if (r5 == 0) goto L_0x0067
            r6 = 1
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r0 = r11.getStore()
            fj1.b r7 = r0.getLiveRoomData()
            r8 = 0
            r9 = r12
            r5.mo89491l(r6, r7, r8, r9, r10)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fh1.C59062p2.mo9732v0(org.json.JSONObject):void");
    }

    /* renamed from: w1 */
    public void mo84281w1(boolean z) {
    }
}
