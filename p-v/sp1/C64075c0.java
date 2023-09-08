package sp1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53930o0;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import ak1.C54067f0;
import ak1.C54116w;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.camera.core.FocusMeteringAction;
import cj1.C54735b;
import cj1.C54795n5;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import cm1.C0740i2;
import cm1.C55035v0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveReplayUI;
import com.tencent.p014mm.plugin.finder.live.infrastructure.coroutine.C55908a;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingCouponView;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.util.WXWebReporter;
import d60.C58124b;
import dh1.C7329b;
import di3.C7335d;
import di3.C86312j;
import f14.C58901s;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32230s;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kg3.C76577a;
import kotlin.ResultKt;
import nj3.C76912y0;
import np1.C61865h0;
import np1.C61866i0;
import o40.C61926c;
import ok1.C62042e;
import pe3.C89349b;
import qj1.C62850ke;
import rx3.C13598b0;
import sk1.C13696v;
import sk1.C63965x;
import te3.C49366f21;
import te3.C49712hj1;
import te3.C64822x51;
import tf0.C64916p1;
import tf0.C64919s1;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zp3.C79406f;

/* renamed from: sp1.c0 */
public final class C64075c0 extends FrameLayout {

    /* renamed from: A */
    public C64068b0 f181651A;

    /* renamed from: B */
    public TextView f181652B;

    /* renamed from: C */
    public ArrayList<Long> f181653C;

    /* renamed from: D */
    public C55035v0 f181654D;

    /* renamed from: E */
    public final C54735b f181655E;

    /* renamed from: F */
    public C32224a<C13598b0> f181656F;

    /* renamed from: G */
    public C53973z1 f181657G;

    /* renamed from: H */
    public final long f181658H;

    /* renamed from: I */
    public C45795b f181659I;

    /* renamed from: d */
    public final ViewGroup f181660d;

    /* renamed from: e */
    public final C58124b f181661e;

    /* renamed from: f */
    public final C49712hj1 f181662f;

    /* renamed from: g */
    public final C62850ke f181663g;

    /* renamed from: h */
    public final String f181664h = "Finder.LiveShoppingBubbleWidget";

    /* renamed from: i */
    public View f181665i;

    /* renamed from: j */
    public final View f181666j;

    /* renamed from: n */
    public ViewGroup f181667n;

    /* renamed from: o */
    public ViewGroup f181668o;

    /* renamed from: p */
    public ImageView f181669p;

    /* renamed from: q */
    public FinderLiveShopPromoteContainer f181670q;

    /* renamed from: r */
    public View f181671r;

    /* renamed from: s */
    public TextView f181672s;

    /* renamed from: t */
    public TextView f181673t;

    /* renamed from: u */
    public TextView f181674u;

    /* renamed from: v */
    public FinderLiveShoppingPriceView f181675v;

    /* renamed from: w */
    public WeImageView f181676w;

    /* renamed from: x */
    public WeImageView f181677x;

    /* renamed from: y */
    public LinearLayout f181678y;

    /* renamed from: z */
    public FinderLiveShoppingCouponView f181679z;

    /* renamed from: sp1.c0$a */
    public static final class C64076a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C64075c0 f181680d;

        public C64076a(C64075c0 c0Var) {
            this.f181680d = c0Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingBubbleWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C32224a<C13598b0> userActionClick = this.f181680d.getUserActionClick();
            if (userActionClick != null) {
                userActionClick.invoke();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingBubbleWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: sp1.c0$b */
    public static final class C64077b implements FinderLiveShoppingCouponView.C3609a {

        /* renamed from: a */
        public final /* synthetic */ C64075c0 f181681a;

        /* renamed from: b */
        public final /* synthetic */ Context f181682b;

        public C64077b(C64075c0 c0Var, Context context) {
            this.f181681a = c0Var;
            this.f181682b = context;
        }

        /* renamed from: a */
        public void mo4000a(C13696v vVar, FinderLiveShoppingCouponView finderLiveShoppingCouponView) {
            C87412m.m108594g(vVar, "item");
            C87412m.m108594g(finderLiveShoppingCouponView, "view");
            this.f181681a.mo88821b(this.f181682b, vVar);
        }
    }

    /* renamed from: sp1.c0$c */
    public static final class C64078c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C64075c0 f181683d;

        public C64078c(C64075c0 c0Var) {
            this.f181683d = c0Var;
        }

        public final void onClick(View view) {
            C0740i2 i2Var;
            Class cls = C54979h1.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingBubbleWidget$closeOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (this.f181683d.f181661e.getLiveRole() == 0) {
                C45795b liveData = this.f181683d.getLiveData();
                Long l = null;
                if ((liveData != null ? ((C54979h1) liveData.mo71262a(cls)).f154147v : null) != null) {
                    C45795b liveData2 = this.f181683d.getLiveData();
                    C0740i2 i2Var2 = liveData2 != null ? ((C54979h1) liveData2.mo71262a(cls)).f154147v : null;
                    if (i2Var2 instanceof C63965x) {
                        C7329b bVar = C7329b.f25441a;
                        C45795b liveData3 = this.f181683d.getLiveData();
                        C87412m.m108591d(liveData3);
                        C7329b.m7474c(bVar, liveData3, 2, 5, (String) null, 0, (String) null, 0, 120, (Object) null);
                        C7335d c = C86312j.m106911c(C54116w.class);
                        C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
                        C54116w wVar = (C54116w) c;
                        C54067f0.C54081r0 r0Var = C54067f0.C54081r0.CommerceActionBubbleTipClose;
                        C45795b liveData4 = this.f181683d.getLiveData();
                        if (!(liveData4 == null || (i2Var = ((C54979h1) liveData4.mo71262a(cls)).f154147v) == null)) {
                            l = Long.valueOf(i2Var.getItemId());
                        }
                        C63965x xVar = (C63965x) i2Var2;
                        C54116w.Rx0(wVar, r0Var, (String) null, String.valueOf(l), (String) null, (String) null, (String) null, 0, 0, C61866i0.f175909a.mo86794e(xVar.f181346s), WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (Object) null);
                        C49712hj1 reportObj = this.f181683d.getReportObj();
                        C62042e eVar = C62042e.f176370a;
                        C58124b bVar2 = this.f181683d.f181661e;
                        C87412m.m108592e(bVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
                        ((C64916p1) C86312j.m106911c(C64916p1.class)).mo76728y(reportObj, 18054, C62042e.m72804V(eVar, ((C56032b) bVar2).getBuContext(), 29, C61926c.m72691p(xVar.f181347t), 0, 8, (Object) null));
                    } else if (i2Var2 instanceof C13696v) {
                        C7329b bVar3 = C7329b.f25441a;
                        C45795b liveData5 = this.f181683d.getLiveData();
                        C87412m.m108591d(liveData5);
                        C7329b.m7474c(bVar3, liveData5, 2, 6, (String) null, 0, (String) null, 0, 120, (Object) null);
                    }
                }
            }
            C64075c0.m75421a(this.f181683d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingBubbleWidget$closeOnClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: sp1.c0$d */
    public static final class C64079d extends C87413o implements C32230s<Boolean, Integer, Integer, String, C49366f21, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Context f181684d;

        /* renamed from: e */
        public final /* synthetic */ C64075c0 f181685e;

        /* renamed from: f */
        public final /* synthetic */ C13696v f181686f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64079d(Context context, C64075c0 c0Var, C13696v vVar) {
            super(5);
            this.f181684d = context;
            this.f181685e = c0Var;
            this.f181686f = vVar;
        }

        /* renamed from: D */
        public Object mo237D(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            ((Number) obj2).intValue();
            int intValue = ((Number) obj3).intValue();
            String str = (String) obj4;
            C49366f21 f212 = (C49366f21) obj5;
            C62042e.f176370a.mo87047U1(this.f181684d, false);
            if (booleanValue || intValue == -200187) {
                this.f181686f.f38758E = false;
                C64075c0.m75421a(this.f181685e);
            } else {
                Log.m105928w(this.f181685e.f181664h, "issue coupon failed");
                Context context = this.f181684d;
                C76912y0.m92767f(context, ((MMActivity) context).getResources().getString(C0966R.string.fyn, new Object[]{Integer.valueOf(intValue)}));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: sp1.c0$e */
    public static final class C64080e extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ Context f181687d;

        /* renamed from: e */
        public final /* synthetic */ C64075c0 f181688e;

        /* renamed from: f */
        public final /* synthetic */ C45795b f181689f;

        /* renamed from: g */
        public final /* synthetic */ C13696v f181690g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64080e(Context context, C64075c0 c0Var, C45795b bVar, C13696v vVar) {
            super(1);
            this.f181687d = context;
            this.f181688e = c0Var;
            this.f181689f = bVar;
            this.f181690g = vVar;
        }

        public Object invoke(Object obj) {
            C61926c.m72668M(new C64088f0(this.f181687d, ((Boolean) obj).booleanValue(), this.f181688e, this.f181689f, this.f181690g));
            return C13598b0.f38549a;
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingBubbleWidget$showCouponBubble$2", mo125469f = "FinderLiveShoppingBubbleWidget.kt", mo125470l = {}, mo125471m = "invokeSuspend")
    /* renamed from: sp1.c0$f */
    public static final class C64081f extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public /* synthetic */ Object f181691d;

        /* renamed from: e */
        public final /* synthetic */ C64075c0 f181692e;

        /* renamed from: f */
        public final /* synthetic */ C13696v f181693f;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingBubbleWidget$showCouponBubble$2$1", mo125469f = "FinderLiveShoppingBubbleWidget.kt", mo125470l = {349}, mo125471m = "invokeSuspend")
        /* renamed from: sp1.c0$f$a */
        public static final class C64082a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f181694d;

            /* renamed from: e */
            public final /* synthetic */ C64075c0 f181695e;

            /* renamed from: f */
            public final /* synthetic */ C13696v f181696f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C64082a(C64075c0 c0Var, C13696v vVar, C15601d<? super C64082a> dVar) {
                super(2, dVar);
                this.f181695e = c0Var;
                this.f181696f = vVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C64082a(this.f181695e, this.f181696f, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C64082a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f181694d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    long j = this.f181695e.f181658H;
                    this.f181694d = 1;
                    if (C53965x0.m60607b(j, this) == aVar) {
                        return aVar;
                    }
                } else if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                FinderLiveService.f159376d.getClass();
                C56032b bVar = FinderLiveService.f159379g;
                if (bVar != null) {
                    C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_PROMTE_DEL;
                    Bundle bundle = new Bundle();
                    C13696v vVar = this.f181696f;
                    C64822x51 x512 = new C64822x51();
                    x512.f186254d = 6;
                    x512.f186256f = new C89349b(vVar.f38761s.toByteArray());
                    x512.f186258h = vVar.f181291d;
                    C13598b0 b0Var = C13598b0.f38549a;
                    bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", x512.toByteArray());
                    bVar.statusChange(bVar2, bundle);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C64081f(C64075c0 c0Var, C13696v vVar, C15601d<? super C64081f> dVar) {
            super(2, dVar);
            this.f181692e = c0Var;
            this.f181693f = vVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            C64081f fVar = new C64081f(this.f181692e, this.f181693f, dVar);
            fVar.f181691d = obj;
            return fVar;
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C64081f) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            ResultKt.throwOnFailure(obj);
            C0000n0 n0Var = (C0000n0) this.f181691d;
            C53973z1 job = this.f181692e.getJob();
            if (job != null) {
                C53973z1.C53974a.m60623a(job, (CancellationException) null, 1, (Object) null);
            }
            C64075c0 c0Var = this.f181692e;
            c0Var.setJob(C53895h.m60466d(n0Var, (C66212f) null, (C53934p0) null, new C64082a(c0Var, this.f181693f, (C15601d<? super C64082a>) null), 3, (Object) null));
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C64075c0(Context context, ViewGroup viewGroup, ViewGroup viewGroup2, C58124b bVar, C49712hj1 hj12, C62850ke keVar) {
        super(context);
        C87412m.m108594g(context, "context");
        C87412m.m108594g(viewGroup, "entranceRoot");
        C87412m.m108594g(viewGroup2, "parent");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(keVar, "plugin");
        this.f181660d = viewGroup2;
        this.f181661e = bVar;
        this.f181662f = hj12;
        this.f181663g = keVar;
        context.getResources().getDimensionPixelOffset(C0966R.dimen.a7l);
        context.getResources().getDimensionPixelOffset(C0966R.dimen.f3736cp);
        MMApplicationContext.getContext().getResources().getDimensionPixelOffset(C0966R.dimen.f3703bv);
        C79406f.m96347a(context, 2.0f);
        C79406f.m96347a(context, 20.0f);
        C79406f.m96347a(context, 12.0f);
        this.f181653C = new ArrayList<>();
        this.f181654D = new C55035v0();
        this.f181655E = new C54735b(hj12);
        this.f181658H = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;
        C64078c cVar = new C64078c(this);
        View inflate = LayoutInflater.from(context).inflate(C0966R.C0971layout.f359756cx0, this, true);
        C87412m.m108593f(inflate, "from(context).inflate(R.…ng_widget_ui, this, true)");
        this.f181665i = inflate;
        View findViewById = inflate.findViewById(C0966R.C0970id.dzf);
        C87412m.m108593f(findViewById, "bubbleRoot.findViewById(…_shopping_widget_ui_root)");
        this.f181666j = findViewById;
        this.f181668o = (ViewGroup) this.f181665i.findViewById(C0966R.C0970id.fad);
        View findViewById2 = this.f181665i.findViewById(C0966R.C0970id.i3t);
        C87412m.m108593f(findViewById2, "bubbleRoot.findViewById(R.id.product_img)");
        this.f181669p = (ImageView) findViewById2;
        View findViewById3 = this.f181665i.findViewById(C0966R.C0970id.i8b);
        C87412m.m108593f(findViewById3, "bubbleRoot.findViewById(R.id.promoting_container)");
        this.f181670q = (FinderLiveShopPromoteContainer) findViewById3;
        View findViewById4 = this.f181665i.findViewById(C0966R.C0970id.c2_);
        C87412m.m108593f(findViewById4, "bubbleRoot.findViewById(R.id.desc_container)");
        this.f181671r = findViewById4;
        View findViewById5 = this.f181665i.findViewById(C0966R.C0970id.nsz);
        C87412m.m108593f(findViewById5, "bubbleRoot.findViewById(R.id.desc_word)");
        this.f181672s = (TextView) findViewById5;
        View findViewById6 = this.f181665i.findViewById(C0966R.C0970id.i3e);
        C87412m.m108593f(findViewById6, "bubbleRoot.findViewById(R.id.product_desc)");
        TextView textView = (TextView) findViewById6;
        this.f181673t = textView;
        textView.setTextSize(2, 14.0f);
        View findViewById7 = this.f181665i.findViewById(C0966R.C0970id.f358967i42);
        C87412m.m108593f(findViewById7, "bubbleRoot.findViewById(R.id.product_seq)");
        this.f181674u = (TextView) findViewById7;
        View findViewById8 = this.f181665i.findViewById(C0966R.C0970id.i2k);
        C87412m.m108593f(findViewById8, "bubbleRoot.findViewById(R.id.price_view)");
        this.f181675v = (FinderLiveShoppingPriceView) findViewById8;
        this.f181679z = (FinderLiveShoppingCouponView) this.f181665i.findViewById(C0966R.C0970id.bum);
        View findViewById9 = this.f181665i.findViewById(C0966R.C0970id.muo);
        C87412m.m108593f(findViewById9, "bubbleRoot.findViewById(R.id.promote_group)");
        this.f181678y = (LinearLayout) findViewById9;
        View findViewById10 = this.f181665i.findViewById(C0966R.C0970id.be4);
        C87412m.m108593f(findViewById10, "bubbleRoot.findViewById(R.id.close)");
        this.f181676w = (WeImageView) findViewById10;
        View findViewById11 = this.f181665i.findViewById(C0966R.C0970id.bev);
        C87412m.m108593f(findViewById11, "bubbleRoot.findViewById(R.id.close_out)");
        this.f181677x = (WeImageView) findViewById11;
        C62042e.m72803Q1(C62042e.f176370a, this.f181676w, 0, 0, 6, (Object) null);
        this.f181676w.setOnClickListener(cVar);
        this.f181677x.setOnClickListener(cVar);
        View findViewById12 = this.f181665i.findViewById(C0966R.C0970id.i39);
        C87412m.m108593f(findViewById12, "bubbleRoot.findViewById(R.id.product_action)");
        TextView textView2 = (TextView) findViewById12;
        this.f181652B = textView2;
        textView2.setOnClickListener(new C64076a(this));
        this.f181652B.setTextSize(2, 14.0f);
        FinderLiveShoppingCouponView finderLiveShoppingCouponView = this.f181679z;
        if (finderLiveShoppingCouponView != null) {
            finderLiveShoppingCouponView.setCallback(new C64077b(this, context));
        }
    }

    /* renamed from: a */
    public static final void m75421a(C64075c0 c0Var) {
        C64059b bVar;
        ViewGroup viewGroup = c0Var.f181667n;
        C13598b0 b0Var = null;
        if (viewGroup != null) {
            viewGroup.setTag((Object) null);
        }
        C64068b0 b0Var2 = c0Var.f181651A;
        if (!(b0Var2 == null || (bVar = b0Var2.f181627c) == null)) {
            bVar.mo88813a(3);
        }
        FinderLiveService.f159376d.getClass();
        C56032b bVar2 = FinderLiveService.f159379g;
        if (bVar2 != null) {
            C58124b.C58125b bVar3 = C58124b.C58125b.FINDER_LIVE_PROMTE_DEL;
            Bundle bundle = new Bundle();
            C45795b bVar4 = c0Var.f181659I;
            C0740i2 i2Var = bVar4 != null ? ((C54979h1) bVar4.mo71262a(C54979h1.class)).f154147v : null;
            if (i2Var != null) {
                C64822x51 x512 = new C64822x51();
                C64919s1 s1Var = (C64919s1) i2Var;
                x512.f186258h = s1Var.mo13074d();
                if (i2Var instanceof C63965x) {
                    x512.f186254d = 5;
                } else if (i2Var instanceof C13696v) {
                    x512.f186254d = 6;
                }
                x512.f186256f = new C89349b(s1Var.mo13073b().toByteArray());
                C13598b0 b0Var3 = C13598b0.f38549a;
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", x512.toByteArray());
                b0Var = C13598b0.f38549a;
            }
            if (b0Var == null) {
                Log.m105924i(c0Var.f181664h, "[hideShoppingBubble] but not promotting product");
            }
            C13598b0 b0Var4 = C13598b0.f38549a;
            bVar2.statusChange(bVar3, bundle);
        }
        c0Var.f181663g.mo87807b1(false);
        c0Var.f181670q.getClass();
        Log.m105924i("FinderLiveShopPromoteContainer", "recycled");
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:0x0462  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m75422e(sp1.C64075c0 r25, te3.C64370fp1 r26, boolean r27, boolean r28, int r29, java.lang.Object r30) {
        /*
            r0 = r25
            r8 = r26
            r9 = 2
            r1 = r29 & 2
            r10 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            if (r1 == 0) goto L_0x0010
            r12 = 0
            goto L_0x0012
        L_0x0010:
            r12 = r27
        L_0x0012:
            r25.getClass()
            java.lang.Class<pl1.s0> r1 = pl1.C11990s0.class
            java.lang.Class<ht1.t1> r2 = ht1.C60200t1.class
            java.lang.String r3 = "data"
            gy3.C87412m.m108594g(r8, r3)
            a14.z1 r3 = r0.f181657G
            r13 = 0
            r14 = 1
            if (r3 == 0) goto L_0x0027
            a14.C53973z1.C53974a.m60623a(r3, r13, r14, r13)
        L_0x0027:
            long r3 = r8.f183176d
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x004a
            java.lang.String r0 = r0.f181664h
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "showShoppingBubble invalid product_id:"
            r1.append(r2)
            long r2 = r8.f183176d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r1)
            goto L_0x05b7
        L_0x004a:
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView r3 = r0.f181675v
            r3.setVisibility(r10)
            android.widget.TextView r3 = r0.f181674u
            cm1.v0 r4 = r0.f181654D
            boolean r4 = r4.f154511a
            r15 = 8
            if (r4 == 0) goto L_0x005b
            r4 = 0
            goto L_0x005d
        L_0x005b:
            r4 = 8
        L_0x005d:
            r3.setVisibility(r4)
            android.view.View r3 = r0.f181671r
            k20.a r4 = new k20.a
            r4.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r4.mo10233c(r11)
            java.lang.Object[] r17 = r4.mo10232b()
            java.lang.String r18 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingBubbleWidget"
            java.lang.String r19 = "showShoppingBubble"
            java.lang.String r20 = "(Lcom/tencent/mm/protocal/protobuf/FinderWindowProductInfo;ZZ)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            r16 = r3
            j20.C117292a.m165358d(r16, r17, r18, r19, r20, r21, r22, r23)
            java.lang.Object r4 = r4.mo10231a(r10)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r3.setVisibility(r4)
            java.lang.String r17 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingBubbleWidget"
            java.lang.String r18 = "showShoppingBubble"
            java.lang.String r19 = "(Lcom/tencent/mm/protocal/protobuf/FinderWindowProductInfo;ZZ)V"
            java.lang.String r20 = "android/view/View_EXEC_"
            java.lang.String r21 = "setVisibility"
            java.lang.String r22 = "(I)V"
            j20.C117292a.m165359e(r16, r17, r18, r19, r20, r21, r22)
            bl3.r r3 = bl3.C39818r.f106831a
            bl3.r$a r4 = r3.mo62446e(r2)
            bl3.c r4 = r4.mo62447c(r1)
            pl1.s0 r4 = (pl1.C11990s0) r4
            k60.d r4 = r4.mo11870V()
            pl1.n0 r7 = new pl1.n0
            java.util.LinkedList<java.lang.String> r13 = r8.f183178f
            java.lang.String r9 = "data.img_urls"
            gy3.C87412m.m108593f(r13, r9)
            java.lang.Object r9 = sx3.C110818d0.m150916N(r13)
            java.lang.String r9 = (java.lang.String) r9
            up1.y r13 = up1.C27696y.THUMB_IMAGE
            r7.<init>(r9, r13)
            android.widget.ImageView r9 = r0.f181669p
            pl1.e0$a r13 = pl1.C11978e0.C11979a.LIVE_SHOPPING_DEFAULT
            bl3.r$a r2 = r3.mo62446e(r2)
            bl3.c r1 = r2.mo62447c(r1)
            pl1.s0 r1 = (pl1.C11990s0) r1
            n60.f r1 = r1.mo11867O2(r13)
            r4.mo85957c(r7, r9, r1)
            int r1 = r8.f183186q
            if (r1 == r14) goto L_0x00e7
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer r1 = r0.f181670q
            r1.setVisibility(r15)
            r30 = r11
            goto L_0x0276
        L_0x00e7:
            java.lang.Class<cl1.h1> r9 = cl1.C54979h1.class
            qj1.ke r1 = r0.f181663g
            androidx.lifecycle.i0 r1 = r1.mo87696x0(r9)
            cl1.h1 r1 = (cl1.C54979h1) r1
            te3.vx0 r1 = r1.f154126S
            if (r1 == 0) goto L_0x00fd
            te3.w44 r1 = r1.f143755d
            if (r1 == 0) goto L_0x00fd
            te3.ah2 r1 = r1.f143855d
            r4 = r1
            goto L_0x00fe
        L_0x00fd:
            r4 = 0
        L_0x00fe:
            qj1.ke r1 = r0.f181663g
            androidx.lifecycle.i0 r1 = r1.mo87696x0(r9)
            cl1.h1 r1 = (cl1.C54979h1) r1
            java.util.HashMap<java.lang.Long, java.lang.Integer> r1 = r1.f154123P
            long r2 = r8.f183176d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r1 = r1.get(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto L_0x0117
            r1 = r11
        L_0x0117:
            int r1 = r1.intValue()
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.DEBUG
            if (r2 != 0) goto L_0x0123
            boolean r2 = com.tencent.p014mm.sdk.platformtools.BuildInfo.IS_FLAVOR_PURPLE
            if (r2 == 0) goto L_0x01a5
        L_0x0123:
            pe1.c<java.lang.Integer> r2 = gg1.C32444a.f86037B0
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != 0) goto L_0x01a5
            java.lang.String r2 = r0.f181664h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r7 = "before test data sales:"
            r3.append(r7)
            int r7 = r8.f183166K
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            r2 = 20
            if (r1 >= r2) goto L_0x014f
            r3 = 1
            goto L_0x0150
        L_0x014f:
            r3 = 2
        L_0x0150:
            long r16 = java.lang.System.currentTimeMillis()
            r30 = r11
            long r10 = (long) r3
            long r16 = r16 % r10
            int r3 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x016d
            double r5 = (double) r14
            double r10 = java.lang.Math.random()
            r3 = 2000(0x7d0, float:2.803E-42)
            double r14 = (double) r3
            double r10 = r10 * r14
            double r5 = r5 + r10
            int r3 = (int) r5
            int r3 = r3 + r1
            r8.f183166K = r3
            goto L_0x016f
        L_0x016d:
            r8.f183166K = r1
        L_0x016f:
            int r3 = r8.f183166K
            if (r3 >= r2) goto L_0x018c
            qj1.ke r2 = r0.f181663g
            androidx.lifecycle.i0 r2 = r2.mo87696x0(r9)
            cl1.h1 r2 = (cl1.C54979h1) r2
            java.util.HashMap<java.lang.Long, java.lang.Integer> r2 = r2.f154123P
            long r5 = r8.f183176d
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            int r5 = r8.f183166K
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2.put(r3, r5)
        L_0x018c:
            java.lang.String r2 = r0.f181664h
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "after test data sales:"
            r3.append(r5)
            int r5 = r8.f183166K
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r3)
            goto L_0x01a7
        L_0x01a5:
            r30 = r11
        L_0x01a7:
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer r2 = r0.f181670q
            boolean r2 = r2.mo78792f()
            java.lang.String r3 = r0.f181664h
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "showPromoteContent hotSellAniming:"
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = ", lastSales:"
            r5.append(r6)
            r5.append(r1)
            java.lang.String r6 = ",curSales:"
            r5.append(r6)
            int r6 = r8.f183166K
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r5)
            if (r4 == 0) goto L_0x023a
            np1.i0 r3 = np1.C61866i0.f175909a
            r3.getClass()
            rx3.g r5 = np1.C61866i0.f175910b
            rx3.n r5 = (rx3.C36570n) r5
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0202
            int r5 = r8.f183166K
            int r6 = r4.f130528d
            if (r5 < r6) goto L_0x0202
            if (r1 >= r5) goto L_0x0202
            java.lang.String r5 = r4.f130531g
            java.lang.String r6 = "shop_ec_hot_sell"
            boolean r3 = r3.mo86801m(r6, r5)
            if (r3 == 0) goto L_0x0202
            r3 = 1
            goto L_0x0203
        L_0x0202:
            r3 = 0
        L_0x0203:
            if (r3 == 0) goto L_0x023a
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer r2 = r0.f181670q
            java.lang.String r3 = r0.f181664h
            r5 = 1
            if (r1 >= r5) goto L_0x020e
            r5 = 1
            goto L_0x020f
        L_0x020e:
            r5 = r1
        L_0x020f:
            int r6 = r8.f183166K
            sp1.h0 r7 = new sp1.h0
            r7.<init>(r0, r8)
            r1 = r2
            r2 = r3
            r3 = r26
            boolean r1 = r1.mo78795i(r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0276
            qj1.ke r1 = r0.f181663g
            androidx.lifecycle.i0 r1 = r1.mo87696x0(r9)
            cl1.h1 r1 = (cl1.C54979h1) r1
            java.util.HashMap<java.lang.Long, java.lang.Integer> r1 = r1.f154123P
            long r2 = r8.f183176d
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            int r3 = r8.f183166K
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r1.put(r2, r3)
            goto L_0x0276
        L_0x023a:
            if (r2 != 0) goto L_0x0276
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShopPromoteContainer r1 = r0.f181670q
            cm1.v0 r2 = r0.f181654D
            boolean r2 = r2.f154512b
            boolean r3 = r25.mo88822c()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = r0.f181664h
            r4.append(r5)
            java.lang.String r5 = " desc:"
            r4.append(r5)
            java.lang.String r5 = r8.f183177e
            r4.append(r5)
            java.lang.String r5 = ",id:"
            r4.append(r5)
            long r5 = r8.f183176d
            r4.append(r5)
            java.lang.String r5 = ",src:"
            r4.append(r5)
            java.lang.String r5 = r8.f183183n
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r5 = 1
            r1.mo78796j(r2, r3, r4, r5)
        L_0x0276:
            android.view.View r1 = r0.f181666j
            r2 = 2131302562(0x7f0918a2, float:1.8223214E38)
            android.content.Context r3 = r25.getContext()
            r4 = 2131828778(0x7f11202a, float:1.9290506E38)
            java.lang.String r3 = r3.getString(r4)
            r1.setTag(r2, r3)
            android.view.View r1 = r0.f181671r
            k20.a r2 = new k20.a
            r2.<init>()
            r3 = r30
            r2.mo10233c(r3)
            java.lang.Object[] r18 = r2.mo10232b()
            java.lang.String r19 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingBubbleWidget"
            java.lang.String r20 = "showShoppingBubble"
            java.lang.String r21 = "(Lcom/tencent/mm/protocal/protobuf/FinderWindowProductInfo;ZZ)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r1
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            r3 = 0
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r18 = "com/tencent/mm/plugin/finder/shopping/view/FinderLiveShoppingBubbleWidget"
            java.lang.String r19 = "showShoppingBubble"
            java.lang.String r20 = "(Lcom/tencent/mm/protocal/protobuf/FinderWindowProductInfo;ZZ)V"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            android.view.View r1 = r0.f181666j
            r2 = 2131302560(0x7f0918a0, float:1.822321E38)
            android.widget.TextView r3 = r0.f181673t
            java.lang.CharSequence r3 = r3.getText()
            r1.setTag(r2, r3)
            sk1.x r1 = new sk1.x
            r1.<init>(r8)
            sp1.i0 r2 = new sp1.i0
            r2.<init>(r0, r1, r8)
            r0.post(r2)
            android.view.View r2 = r0.f181666j
            r3 = 2131302561(0x7f0918a1, float:1.8223212E38)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPriceView r4 = r0.f181675v
            android.widget.TextView r4 = r4.getSellPrice()
            java.lang.CharSequence r4 = r4.getText()
            r2.setTag(r3, r4)
            java.lang.String r2 = r8.f183191v
            if (r2 == 0) goto L_0x0305
            int r2 = r2.length()
            if (r2 != 0) goto L_0x0303
            goto L_0x0305
        L_0x0303:
            r2 = 0
            goto L_0x0306
        L_0x0305:
            r2 = 1
        L_0x0306:
            if (r2 != 0) goto L_0x0318
            android.content.Context r2 = r25.getContext()
            boolean r2 = r2 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveReplayUI
            if (r2 != 0) goto L_0x0318
            android.widget.TextView r2 = r0.f181652B
            java.lang.String r3 = r8.f183191v
            r2.setText(r3)
            goto L_0x0328
        L_0x0318:
            android.widget.TextView r2 = r0.f181652B
            android.content.Context r3 = r25.getContext()
            r4 = 2131828779(0x7f11202b, float:1.9290509E38)
            java.lang.String r3 = r3.getString(r4)
            r2.setText(r3)
        L_0x0328:
            int r2 = r1.f181345M
            r3 = 1
            if (r2 == r3) goto L_0x034f
            android.widget.TextView r2 = r0.f181652B
            r4 = 2131233671(0x7f080b87, float:1.8083486E38)
            r2.setBackgroundResource(r4)
            android.widget.TextView r2 = r0.f181652B
            android.content.Context r4 = r25.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131099940(0x7f060124, float:1.7812247E38)
            int r4 = r4.getColor(r5)
            r2.setTextColor(r4)
            android.widget.TextView r2 = r0.f181652B
            r2.setEnabled(r3)
            goto L_0x0371
        L_0x034f:
            android.widget.TextView r2 = r0.f181652B
            r3 = 2131232844(0x7f08084c, float:1.8081809E38)
            r2.setBackgroundResource(r3)
            android.widget.TextView r2 = r0.f181652B
            android.content.Context r3 = r25.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131099917(0x7f06010d, float:1.78122E38)
            int r3 = r3.getColor(r4)
            r2.setTextColor(r3)
            android.widget.TextView r2 = r0.f181652B
            r3 = 0
            r2.setEnabled(r3)
        L_0x0371:
            te3.fp1 r2 = r1.f181346s
            java.util.LinkedList<te3.z44> r2 = r2.f183165J
            if (r2 == 0) goto L_0x0380
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x037e
            goto L_0x0380
        L_0x037e:
            r2 = 0
            goto L_0x0381
        L_0x0380:
            r2 = 1
        L_0x0381:
            if (r2 != 0) goto L_0x038a
            android.widget.TextView r2 = r0.f181673t
            r5 = 1
            r2.setMaxLines(r5)
            goto L_0x0391
        L_0x038a:
            r5 = 1
            android.widget.TextView r2 = r0.f181673t
            r3 = 2
            r2.setMaxLines(r3)
        L_0x0391:
            boolean r2 = r25.mo88822c()
            if (r2 != 0) goto L_0x03a9
            android.content.Context r2 = r25.getContext()
            boolean r2 = r2 instanceof com.tencent.p014mm.plugin.finder.feed.p052ui.FinderLiveReplayUI
            if (r2 == 0) goto L_0x03a0
            goto L_0x03a9
        L_0x03a0:
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f181676w
            r3 = 0
            r2.setVisibility(r3)
            r4 = 8
            goto L_0x03b1
        L_0x03a9:
            r3 = 0
            com.tencent.mm.ui.widget.imageview.WeImageView r2 = r0.f181676w
            r4 = 8
            r2.setVisibility(r4)
        L_0x03b1:
            boolean r2 = r25.mo88822c()
            if (r2 != 0) goto L_0x03bd
            android.widget.TextView r2 = r0.f181652B
            r2.setVisibility(r3)
            goto L_0x03c2
        L_0x03bd:
            android.widget.TextView r2 = r0.f181652B
            r2.setVisibility(r4)
        L_0x03c2:
            int r2 = r8.f183188s
            java.lang.String r3 = ""
            if (r2 <= 0) goto L_0x03d2
            android.widget.TextView r4 = r0.f181674u
            java.lang.String r2 = java.lang.String.valueOf(r2)
            r4.setText(r2)
            goto L_0x03de
        L_0x03d2:
            android.widget.TextView r2 = r0.f181674u
            r2.setText(r3)
            android.widget.TextView r2 = r0.f181674u
            r4 = 8
            r2.setVisibility(r4)
        L_0x03de:
            if (r12 != 0) goto L_0x0443
            r2 = 0
            r0.setupCouponView(r2)
            long r6 = r8.f183176d
            android.view.ViewGroup r2 = r0.f181660d
            sp1.d0 r4 = new sp1.d0
            r4.<init>(r6, r0)
            r2.post(r4)
            te3.l40 r2 = r8.f183185p
            java.util.ArrayList<java.lang.Long> r4 = r0.f181653C
            long r6 = r8.f183176d
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            boolean r4 = r4.contains(r6)
            if (r4 != 0) goto L_0x0441
            ok1.e r4 = ok1.C62042e.f176370a
            r4.getClass()
            int r6 = r8.f183174T
            if (r6 == 0) goto L_0x040b
            r6 = 1
            goto L_0x040c
        L_0x040b:
            r6 = 0
        L_0x040c:
            if (r6 == 0) goto L_0x0441
            if (r2 == 0) goto L_0x0441
            java.lang.String r6 = r0.f181664h
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = "prerender bubble "
            r7.append(r9)
            long r9 = r8.f183176d
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
            java.util.ArrayList<java.lang.Long> r6 = r0.f181653C
            long r9 = r8.f183176d
            java.lang.Long r7 = java.lang.Long.valueOf(r9)
            r6.add(r7)
            np1.w r6 = np1.C61882w.f175962a
            fj1.b r7 = r0.f181659I
            r9 = 3
            di0.o r2 = r4.mo87118t0(r2, r9)
            r4 = 0
            r6.mo86816c(r7, r2, r4)
            goto L_0x0469
        L_0x0441:
            r4 = 0
            goto L_0x0469
        L_0x0443:
            r4 = 0
            android.view.ViewGroup r2 = r0.f181667n
            if (r2 == 0) goto L_0x045f
            long r6 = r8.f183176d
            java.lang.Object r2 = r2.getTag()
            boolean r9 = r2 instanceof java.lang.Long
            if (r9 != 0) goto L_0x0453
            goto L_0x045f
        L_0x0453:
            java.lang.Number r2 = (java.lang.Number) r2
            long r9 = r2.longValue()
            int r2 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r2 != 0) goto L_0x045f
            r2 = 1
            goto L_0x0460
        L_0x045f:
            r2 = 0
        L_0x0460:
            if (r2 != 0) goto L_0x0469
            cj1.b r2 = r0.f181655E
            long r6 = r8.f183176d
            r2.mo75630a(r6)
        L_0x0469:
            te3.fp1 r2 = r1.f181346s
            java.util.LinkedList<te3.z44> r2 = r2.f183165J
            if (r2 == 0) goto L_0x0478
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0476
            goto L_0x0478
        L_0x0476:
            r2 = 0
            goto L_0x0479
        L_0x0478:
            r2 = 1
        L_0x0479:
            if (r2 == 0) goto L_0x0488
            sp1.b0 r2 = r0.f181651A
            if (r2 == 0) goto L_0x0486
            java.lang.String r6 = r0.f181664h
            android.widget.LinearLayout r7 = r0.f181678y
            r2.mo88819b(r6, r7)
        L_0x0486:
            r2 = 0
            goto L_0x04fb
        L_0x0488:
            android.widget.LinearLayout r2 = r0.f181678y
            int r2 = r2.getMeasuredWidth()
            gy3.d0 r6 = new gy3.d0
            r6.<init>()
            if (r2 <= 0) goto L_0x0496
            goto L_0x04d6
        L_0x0496:
            qj1.ke r2 = r0.f181663g
            boolean r2 = r2.mo82893g0()
            if (r2 == 0) goto L_0x04ae
            android.content.Context r2 = r25.getContext()
            android.content.res.Resources r2 = r2.getResources()
            r7 = 2131166497(0x7f070521, float:1.7947241E38)
            int r2 = r2.getDimensionPixelOffset(r7)
            goto L_0x04d6
        L_0x04ae:
            android.content.Context r2 = r25.getContext()
            android.graphics.Point r2 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r2)
            int r2 = r2.x
            float r2 = (float) r2
            android.content.Context r7 = r25.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r9 = 2131165361(0x7f0700b1, float:1.7944937E38)
            float r7 = r7.getDimension(r9)
            float r2 = r2 - r7
            android.content.Context r7 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r9 = 1118044160(0x42a40000, float:82.0)
            int r7 = zp3.C79406f.m96347a(r7, r9)
            float r7 = (float) r7
            float r2 = r2 - r7
            int r2 = (int) r2
        L_0x04d6:
            r6.f27483d = r2
            sp1.b0 r2 = r0.f181651A
            if (r2 != 0) goto L_0x04ea
            sp1.b0 r2 = new sp1.b0
            android.content.Context r7 = r25.getContext()
            java.lang.String r9 = "context"
            gy3.C87412m.m108593f(r7, r9)
            r2.<init>(r7)
        L_0x04ea:
            r0.f181651A = r2
            qj1.ke r9 = r0.f181663g
            r10 = 0
            r11 = 0
            sp1.g0 r12 = new sp1.g0
            r2 = 0
            r12.<init>(r0, r1, r6, r2)
            r13 = 3
            r14 = 0
            nk1.C11207i.m11072h(r9, r10, r11, r12, r13, r14)
        L_0x04fb:
            android.widget.TextView r6 = r0.f181672s
            te3.fp1 r1 = r1.f181346s
            java.lang.String r7 = "<this>"
            gy3.C87412m.m108594g(r1, r7)
            java.util.LinkedList<te3.z44> r1 = r1.f183165J
            java.lang.String r7 = "this.show_box_items"
            gy3.C87412m.m108593f(r1, r7)
            java.util.Iterator r1 = r1.iterator()
        L_0x0510:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x0528
            java.lang.Object r7 = r1.next()
            r9 = r7
            te3.z44 r9 = (te3.z44) r9
            int r9 = r9.f186625d
            r10 = 5
            if (r9 != r10) goto L_0x0524
            r9 = 1
            goto L_0x0525
        L_0x0524:
            r9 = 0
        L_0x0525:
            if (r9 == 0) goto L_0x0510
            goto L_0x0529
        L_0x0528:
            r7 = r2
        L_0x0529:
            te3.z44 r7 = (te3.z44) r7
            if (r7 == 0) goto L_0x053e
            pe3.b r1 = r7.f186626e
            if (r1 == 0) goto L_0x053e
            te3.h40 r13 = new te3.h40
            r13.<init>()
            byte[] r1 = r1.mo123703f()
            r13.parseFrom(r1)
            goto L_0x053f
        L_0x053e:
            r13 = r2
        L_0x053f:
            if (r13 == 0) goto L_0x0546
            java.lang.String r1 = r13.f183400d
            if (r1 == 0) goto L_0x0546
            goto L_0x0547
        L_0x0546:
            r1 = r3
        L_0x0547:
            r6.setText(r1)
            android.widget.TextView r1 = r0.f181673t
            java.lang.Object r1 = r1.getTag()
            java.lang.String r2 = r8.f183177e
            if (r2 != 0) goto L_0x0555
            r2 = r3
        L_0x0555:
            boolean r1 = gy3.C87412m.m108589b(r1, r2)
            if (r1 != 0) goto L_0x0566
            android.widget.TextView r1 = r0.f181673t
            java.lang.String r2 = r8.f183177e
            if (r2 == 0) goto L_0x0562
            goto L_0x0563
        L_0x0562:
            r2 = r3
        L_0x0563:
            r1.setText(r2)
        L_0x0566:
            java.lang.String r1 = r0.f181664h
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "showShoppingBubble productDesc.tag:"
            r2.append(r4)
            android.widget.TextView r4 = r0.f181673t
            java.lang.Object r4 = r4.getTag()
            r2.append(r4)
            r4 = 33
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            np1.i0 r4 = np1.C61866i0.f175909a
            java.lang.String r1 = r0.f181664h
            java.lang.String r5 = java.lang.String.valueOf(r1)
            qj1.ke r1 = r0.f181663g
            com.tencent.mm.plugin.finder.live.view.b r1 = r1.mo14484z0()
            com.tencent.mm.plugin.finder.live.infrastructure.coroutine.a r6 = r1.getViewScope()
            android.widget.TextView r7 = r0.f181673t
            java.util.LinkedList<java.lang.String> r1 = r8.f183171Q
            java.lang.String r2 = r8.f183177e
            if (r2 != 0) goto L_0x05a4
            r9 = r3
            goto L_0x05a5
        L_0x05a4:
            r9 = r2
        L_0x05a5:
            r10 = 1
            r11 = 0
            r12 = 1
            r13 = 1
            r14 = 0
            sp1.j0 r15 = new sp1.j0
            r15.<init>(r0, r8)
            r16 = 512(0x200, float:7.175E-43)
            r17 = 0
            r8 = r1
            np1.C61866i0.m72597o(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x05b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sp1.C64075c0.m75422e(sp1.c0, te3.fp1, boolean, boolean, int, java.lang.Object):void");
    }

    private final void setupCouponView(boolean z) {
        ViewGroup viewGroup = this.f181668o;
        if (viewGroup != null) {
            viewGroup.setVisibility(z ? 8 : 0);
        }
        this.f181676w.setVisibility((z || (getContext() instanceof FinderLiveReplayUI)) ? 8 : 0);
        FinderLiveShoppingCouponView finderLiveShoppingCouponView = this.f181679z;
        if (finderLiveShoppingCouponView != null) {
            finderLiveShoppingCouponView.setVisibility(z ? 0 : 8);
        }
        if (!z || mo88822c()) {
            this.f181677x.setVisibility(8);
        } else {
            this.f181677x.setVisibility(0);
        }
        if (z) {
            C76577a.m92155f(getContext(), C0966R.dimen.f3736cp);
        } else if (mo88822c() || getContext().getResources().getConfiguration().orientation != 2) {
            C76577a.m92155f(getContext(), C0966R.dimen.a7k);
        } else {
            C76577a.m92155f(getContext(), C0966R.dimen.f3709c2);
        }
    }

    /* renamed from: b */
    public final void mo88821b(Context context, C13696v vVar) {
        C54795n5 D0;
        Context context2 = context;
        C13696v vVar2 = vVar;
        Class cls = C54991o.class;
        Class cls2 = C55001u.class;
        C87412m.m108594g(context2, "context");
        C87412m.m108594g(vVar2, "item");
        C62042e.f176370a.mo87047U1(context2, true);
        if (mo88822c()) {
            C7329b bVar = C7329b.f25441a;
            C45795b bVar2 = this.f181659I;
            C87412m.m108591d(bVar2);
            C7329b.m7474c(bVar, bVar2, 5, 6, (String) null, 0, (String) null, 0, 120, (Object) null);
            C45795b bVar3 = this.f181659I;
            if (bVar3 != null) {
                C61865h0.f175908a.mo86790a(bVar3, false);
            }
            C54795n5 D02 = this.f181663g.mo14476D0();
            if (D02 != null) {
                MMActivity mMActivity = (MMActivity) context2;
                String str = vVar2.f38763u;
                if (str == null) {
                    str = "";
                }
                D02.mo75753u(mMActivity, str, 2, new C64079d(context2, this, vVar2));
                return;
            }
            return;
        }
        C7329b bVar4 = C7329b.f25441a;
        C45795b bVar5 = this.f181659I;
        C87412m.m108591d(bVar5);
        C7329b.m7474c(bVar4, bVar5, 5, 6, (String) null, 0, (String) null, 0, 120, (Object) null);
        C45795b bVar6 = this.f181659I;
        if (bVar6 != null && (D0 = this.f181663g.mo14476D0()) != null) {
            D0.mo75746n((MMActivity) context2, ((C55001u) bVar6.mo71262a(cls2)).f154420q.f182392d, ((C55001u) bVar6.mo71262a(cls2)).f154416j, ((C54991o) bVar6.mo71262a(cls)).f154345o, ((C55001u) bVar6.mo71262a(cls2)).f154417n, vVar2.f38763u, 3, ((C54991o) bVar6.mo71262a(cls)).f154357q3, new C64080e(context2, this, bVar6, vVar2));
        }
    }

    /* renamed from: c */
    public final boolean mo88822c() {
        if (!C62042e.f176370a.mo87027N0()) {
            C45795b bVar = this.f181659I;
            return bVar != null ? ((C54991o) bVar.mo71262a(C54991o.class)).f154190D : false;
        }
    }

    /* renamed from: d */
    public final void mo88823d(C13696v vVar, boolean z) {
        C45795b bVar;
        C55908a aVar;
        C87412m.m108594g(vVar, "data");
        C53973z1 z1Var = this.f181657G;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
        boolean c = mo88822c();
        if (z) {
            FinderLiveShoppingCouponView finderLiveShoppingCouponView = this.f181679z;
            if (finderLiveShoppingCouponView != null) {
                finderLiveShoppingCouponView.mo3995b(vVar, c, false);
            }
        } else {
            FinderLiveShoppingCouponView finderLiveShoppingCouponView2 = this.f181679z;
            if (finderLiveShoppingCouponView2 != null) {
                finderLiveShoppingCouponView2.mo3995b(vVar, c, false);
                finderLiveShoppingCouponView2.getLayoutParams().height = C76577a.m92155f(getContext(), c ? C0966R.dimen.a7o : C0966R.dimen.a7p);
            }
            setupCouponView(true);
            this.f181660d.post(new C64084d0(vVar.getItemId(), this));
        }
        if (!C62042e.f176370a.mo87027N0() && vVar.f38761s.f142892B == 0 && (bVar = this.f181659I) != null && (aVar = bVar.f123702i) != null) {
            C53896h0 h0Var = C53872d1.f151117a;
            C53895h.m60466d(aVar, C58901s.f168555a, (C53934p0) null, new C64081f(this, vVar, (C15601d<? super C64081f>) null), 2, (Object) null);
        }
    }

    public final TextView getActionBtn() {
        return this.f181652B;
    }

    public final View getBubbleRoot() {
        return this.f181665i;
    }

    public final FinderLiveShoppingCouponView getCouponView() {
        return this.f181679z;
    }

    public final C53973z1 getJob() {
        return this.f181657G;
    }

    public final C45795b getLiveData() {
        return this.f181659I;
    }

    public final C62850ke getPlugin() {
        return this.f181663g;
    }

    public final C49712hj1 getReportObj() {
        return this.f181662f;
    }

    public final C55035v0 getShoppingUIConfig() {
        return this.f181654D;
    }

    public final C32224a<C13598b0> getUserActionClick() {
        return this.f181656F;
    }

    public void onDetachedFromWindow() {
        C64059b bVar;
        super.onDetachedFromWindow();
        C54735b bVar2 = this.f181655E;
        C0000n0 n0Var = bVar2.f153398b;
        if (n0Var != null) {
            C53930o0.m60556c(n0Var, (CancellationException) null);
        }
        bVar2.mo75631b();
        C64068b0 b0Var = this.f181651A;
        if (b0Var != null && (bVar = b0Var.f181627c) != null) {
            bVar.mo88813a(3);
        }
    }

    public final void setCouponView(FinderLiveShoppingCouponView finderLiveShoppingCouponView) {
        this.f181679z = finderLiveShoppingCouponView;
    }

    public final void setJob(C53973z1 z1Var) {
        this.f181657G = z1Var;
    }

    public final void setLiveData(C45795b bVar) {
        this.f181659I = bVar;
    }

    public final void setShoppingUIConfig(C55035v0 v0Var) {
        C87412m.m108594g(v0Var, "<set-?>");
        this.f181654D = v0Var;
    }

    public final void setUserActionClick(C32224a<C13598b0> aVar) {
        this.f181656F = aVar;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewGroup viewGroup = this.f181667n;
        if (viewGroup != null) {
            viewGroup.setVisibility(i);
        }
    }
}
