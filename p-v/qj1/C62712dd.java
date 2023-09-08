package qj1;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53895h;
import a14.C53934p0;
import a14.C53965x0;
import a14.C53973z1;
import ak1.C54067f0;
import ak1.C54116w;
import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import cl1.C54979h1;
import cl1.C54991o;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.plugin.finder.live.model.FinderLiveService;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.xweb.util.WXWebReporter;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import fh1.C59043k2;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import il1.C60491p4;
import j20.C117292a;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.ResultKt;
import nk1.C11207i;
import np1.C61866i0;
import o40.C61926c;
import o40.C61937h;
import ok1.C62042e;
import pe3.C47465a;
import pe3.C89349b;
import qj1.C62966ri;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import sk1.C13695o;
import sk1.C13696v;
import sk1.C63956k;
import sk1.C63957l;
import sk1.C63958m;
import sk1.C63959n;
import sk1.C63960p;
import sk1.C63961q;
import sk1.C63962r;
import sk1.C63963s;
import sk1.C63964u;
import sk1.C63965x;
import sx3.C26236u;
import sx3.C64197v;
import te3.C49466fs3;
import te3.C49712hj1;
import te3.C51647v51;
import te3.C64605o91;
import te3.C64822x51;
import wx3.C15601d;
import wx3.C66212f;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: qj1.dd */
public final class C62712dd extends C62660c {

    /* renamed from: A */
    public C53973z1 f178054A;

    /* renamed from: B */
    public final List<Class<?>> f178055B;

    /* renamed from: C */
    public final List<Class<?>> f178056C;

    /* renamed from: D */
    public final List<Class<?>> f178057D;

    /* renamed from: E */
    public final C13601g f178058E;

    /* renamed from: F */
    public final C32226l<C63956k, C13598b0> f178059F;

    /* renamed from: p */
    public final ViewGroup f178060p;

    /* renamed from: q */
    public final ViewGroup f178061q;

    /* renamed from: r */
    public final C58124b f178062r;

    /* renamed from: s */
    public final String f178063s = "FinderLivePromoteBubblePlugin";

    /* renamed from: t */
    public final LinkedList<C62723k> f178064t;

    /* renamed from: u */
    public C62966ri f178065u;

    /* renamed from: v */
    public ViewGroup f178066v;

    /* renamed from: w */
    public ScrollView f178067w;

    /* renamed from: x */
    public View f178068x;

    /* renamed from: y */
    public final Point f178069y;

    /* renamed from: z */
    public C53973z1 f178070z;

    /* renamed from: qj1.dd$a */
    public static final class C62713a implements C62723k {

        /* renamed from: a */
        public final /* synthetic */ C62712dd f178071a;

        public C62713a(C62712dd ddVar) {
            this.f178071a = ddVar;
        }

        /* renamed from: a */
        public C62966ri mo87733a(C63956k kVar) {
            C87412m.m108594g(kVar, "promoteData");
            Context context = this.f178071a.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            C45795b A0 = this.f178071a.mo87684A0();
            C62712dd ddVar = this.f178071a;
            return new C62674cd(context, A0, ddVar.f178062r, ddVar.f178059F, kVar);
        }

        /* renamed from: b */
        public boolean mo87734b(C63956k kVar) {
            C87412m.m108594g(kVar, "data");
            return kVar instanceof C63961q;
        }
    }

    /* renamed from: qj1.dd$b */
    public static final class C62714b implements C62723k {

        /* renamed from: a */
        public final /* synthetic */ C62712dd f178072a;

        public C62714b(C62712dd ddVar) {
            this.f178072a = ddVar;
        }

        /* renamed from: a */
        public C62966ri mo87733a(C63956k kVar) {
            C87412m.m108594g(kVar, "promoteData");
            View findViewById = this.f178072a.f178060p.findViewById(C0966R.C0970id.jjn);
            C87412m.m108593f(findViewById, "liveRootView.findViewByI…pping_entrance_container)");
            View inflate = C85868k2.m106137b(this.f178072a.f166287d.getContext()).inflate(C0966R.C0971layout.cwy, (ViewGroup) null);
            C87412m.m108592e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            C62712dd ddVar = this.f178072a;
            return new C62850ke((ViewGroup) findViewById, (ViewGroup) inflate, ddVar.f178062r, ddVar.f178059F, kVar);
        }

        /* renamed from: b */
        public boolean mo87734b(C63956k kVar) {
            C87412m.m108594g(kVar, "data");
            return (kVar instanceof C63965x) || (kVar instanceof C13696v);
        }
    }

    /* renamed from: qj1.dd$c */
    public static final class C62715c implements C62723k {

        /* renamed from: a */
        public final /* synthetic */ C62712dd f178073a;

        public C62715c(C62712dd ddVar) {
            this.f178073a = ddVar;
        }

        /* renamed from: a */
        public C62966ri mo87733a(C63956k kVar) {
            C87412m.m108594g(kVar, "promoteData");
            Context context = this.f178073a.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            C45795b A0 = this.f178073a.mo87684A0();
            C62712dd ddVar = this.f178073a;
            return new C62690d(context, A0, ddVar.f178062r, ddVar.f178059F, kVar);
        }

        /* renamed from: b */
        public boolean mo87734b(C63956k kVar) {
            C87412m.m108594g(kVar, "data");
            return kVar instanceof C63964u;
        }
    }

    /* renamed from: qj1.dd$d */
    public static final class C62716d implements C62723k {

        /* renamed from: a */
        public final /* synthetic */ C62712dd f178074a;

        public C62716d(C62712dd ddVar) {
            this.f178074a = ddVar;
        }

        /* renamed from: a */
        public C62966ri mo87733a(C63956k kVar) {
            C87412m.m108594g(kVar, "promoteData");
            Context context = this.f178074a.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            C45795b A0 = this.f178074a.mo87684A0();
            C62712dd ddVar = this.f178074a;
            return new C12572oc(context, A0, ddVar.f178062r, ddVar.f178059F, kVar);
        }

        /* renamed from: b */
        public boolean mo87734b(C63956k kVar) {
            C87412m.m108594g(kVar, "data");
            return kVar instanceof C13695o;
        }
    }

    /* renamed from: qj1.dd$e */
    public static final class C62717e implements C62723k {

        /* renamed from: a */
        public final /* synthetic */ C62712dd f178075a;

        public C62717e(C62712dd ddVar) {
            this.f178075a = ddVar;
        }

        /* renamed from: a */
        public C62966ri mo87733a(C63956k kVar) {
            C87412m.m108594g(kVar, "promoteData");
            Context context = this.f178075a.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            C45795b A0 = this.f178075a.mo87684A0();
            C62712dd ddVar = this.f178075a;
            return new C62651bb(context, A0, ddVar.f178062r, ddVar.f178059F, kVar);
        }

        /* renamed from: b */
        public boolean mo87734b(C63956k kVar) {
            C87412m.m108594g(kVar, "data");
            return kVar instanceof C63959n;
        }
    }

    /* renamed from: qj1.dd$f */
    public static final class C62718f implements C62723k {

        /* renamed from: a */
        public final /* synthetic */ C62712dd f178076a;

        public C62718f(C62712dd ddVar) {
            this.f178076a = ddVar;
        }

        /* renamed from: a */
        public C62966ri mo87733a(C63956k kVar) {
            C87412m.m108594g(kVar, "promoteData");
            Context context = this.f178076a.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            C45795b A0 = this.f178076a.mo87684A0();
            C62712dd ddVar = this.f178076a;
            return new C62784fi(context, A0, ddVar.f178062r, ddVar.f178059F, kVar);
        }

        /* renamed from: b */
        public boolean mo87734b(C63956k kVar) {
            C87412m.m108594g(kVar, "data");
            return kVar instanceof C63960p;
        }
    }

    /* renamed from: qj1.dd$g */
    public static final class C62719g implements C62723k {

        /* renamed from: a */
        public final /* synthetic */ C62712dd f178077a;

        public C62719g(C62712dd ddVar) {
            this.f178077a = ddVar;
        }

        /* renamed from: a */
        public C62966ri mo87733a(C63956k kVar) {
            C87412m.m108594g(kVar, "promoteData");
            Context context = this.f178077a.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            C45795b A0 = this.f178077a.mo87684A0();
            C62712dd ddVar = this.f178077a;
            return new C62996td(context, A0, ddVar.f178062r, ddVar.f178059F, kVar);
        }

        /* renamed from: b */
        public boolean mo87734b(C63956k kVar) {
            C87412m.m108594g(kVar, "data");
            return kVar instanceof C63962r;
        }
    }

    /* renamed from: qj1.dd$h */
    public static final class C62720h implements C62723k {

        /* renamed from: a */
        public final /* synthetic */ C62712dd f178078a;

        public C62720h(C62712dd ddVar) {
            this.f178078a = ddVar;
        }

        /* renamed from: a */
        public C62966ri mo87733a(C63956k kVar) {
            C87412m.m108594g(kVar, "promoteData");
            Context context = this.f178078a.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            C45795b A0 = this.f178078a.mo87684A0();
            C62712dd ddVar = this.f178078a;
            return new C62932q8(context, A0, ddVar.f178062r, ddVar.f178059F, kVar);
        }

        /* renamed from: b */
        public boolean mo87734b(C63956k kVar) {
            C87412m.m108594g(kVar, "data");
            return kVar instanceof C63958m;
        }
    }

    /* renamed from: qj1.dd$i */
    public static final class C62721i implements C62723k {

        /* renamed from: a */
        public final /* synthetic */ C62712dd f178079a;

        public C62721i(C62712dd ddVar) {
            this.f178079a = ddVar;
        }

        /* renamed from: a */
        public C62966ri mo87733a(C63956k kVar) {
            C87412m.m108594g(kVar, "promoteData");
            Context context = this.f178079a.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            C45795b A0 = this.f178079a.mo87684A0();
            C62712dd ddVar = this.f178079a;
            return new C63122y6(context, A0, ddVar.f178062r, ddVar.f178059F, kVar);
        }

        /* renamed from: b */
        public boolean mo87734b(C63956k kVar) {
            C87412m.m108594g(kVar, "data");
            return kVar instanceof C63957l;
        }
    }

    /* renamed from: qj1.dd$j */
    public static final class C62722j implements C62723k {

        /* renamed from: a */
        public final /* synthetic */ C62712dd f178080a;

        public C62722j(C62712dd ddVar) {
            this.f178080a = ddVar;
        }

        /* renamed from: a */
        public C62966ri mo87733a(C63956k kVar) {
            C87412m.m108594g(kVar, "promoteData");
            Context context = this.f178080a.f166287d.getContext();
            C87412m.m108593f(context, "root.context");
            C45795b A0 = this.f178080a.mo87684A0();
            C62712dd ddVar = this.f178080a;
            return new C63138yd(context, A0, ddVar.f178062r, ddVar.f178059F, kVar);
        }

        /* renamed from: b */
        public boolean mo87734b(C63956k kVar) {
            C87412m.m108594g(kVar, "data");
            return kVar instanceof C63963s;
        }
    }

    /* renamed from: qj1.dd$k */
    public interface C62723k {
        /* renamed from: a */
        C62966ri mo87733a(C63956k kVar);

        /* renamed from: b */
        boolean mo87734b(C63956k kVar);
    }

    /* renamed from: qj1.dd$l */
    public static final class C62724l extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62712dd f178081d;

        /* renamed from: e */
        public final /* synthetic */ C62966ri f178082e;

        /* renamed from: f */
        public final /* synthetic */ C62966ri f178083f;

        /* renamed from: g */
        public final /* synthetic */ View f178084g;

        /* renamed from: h */
        public final /* synthetic */ View f178085h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62724l(C62712dd ddVar, C62966ri riVar, C62966ri riVar2, View view, View view2) {
            super(0);
            this.f178081d = ddVar;
            this.f178082e = riVar;
            this.f178083f = riVar2;
            this.f178084g = view;
            this.f178085h = view2;
        }

        public Object invoke() {
            if (this.f178081d.mo87730h1(this.f178082e)) {
                this.f178081d.mo87728f1(this.f178083f, this.f178082e);
            } else {
                ViewGroup viewGroup = this.f178081d.f178066v;
                if (viewGroup != null) {
                    viewGroup.removeView(this.f178084g);
                    ViewGroup viewGroup2 = this.f178081d.f178066v;
                    if (viewGroup2 != null) {
                        viewGroup2.addView(this.f178085h);
                        ViewGroup viewGroup3 = this.f178081d.f178066v;
                        if (viewGroup3 != null) {
                            viewGroup3.requestLayout();
                        } else {
                            C87412m.m108603p("promoteBubbleContainer");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("promoteBubbleContainer");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("promoteBubbleContainer");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.dd$m */
    public static final class C62725m extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C62712dd f178086d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62725m(C62712dd ddVar) {
            super(0);
            this.f178086d = ddVar;
        }

        public Object invoke() {
            return Integer.valueOf(C76577a.m92157h(this.f178086d.f166287d.getContext(), C0966R.dimen.f3766df));
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.live.plugin.FinderLivePromoteBubblePlugin$checkAndLaunchDelayDismissJob$2$1", mo125469f = "FinderLivePromoteBubblePlugin.kt", mo125470l = {536}, mo125471m = "invokeSuspend")
    /* renamed from: qj1.dd$n */
    public static final class C62726n extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f178087d;

        /* renamed from: e */
        public final /* synthetic */ C63956k f178088e;

        /* renamed from: f */
        public final /* synthetic */ C62712dd f178089f;

        /* renamed from: g */
        public final /* synthetic */ C63956k f178090g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62726n(C63956k kVar, C62712dd ddVar, C63956k kVar2, C15601d<? super C62726n> dVar) {
            super(2, dVar);
            this.f178088e = kVar;
            this.f178089f = ddVar;
            this.f178090g = kVar2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C62726n(this.f178088e, this.f178089f, this.f178090g, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C62726n) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f178087d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f178087d = 1;
                if (C53965x0.m60607b(((long) this.f178088e.f181296i) * 1000, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C0740i2 i2Var = ((C54979h1) this.f178089f.mo87696x0(C54979h1.class)).f154147v;
            C63956k kVar = i2Var instanceof C63956k ? (C63956k) i2Var : null;
            long j = kVar != null ? kVar.f181291d : 0;
            String str = this.f178089f.f178063s;
            Log.m105924i(str, "[checkAndLaunchDelayDismissJob] after dalay curPromoteDataId = " + j + " , remotePromoteDataId = " + this.f178090g.f181291d);
            if (j == this.f178090g.f181291d) {
                FinderLiveService.f159376d.getClass();
                C56032b bVar = FinderLiveService.f159379g;
                if (bVar != null) {
                    C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_PROMTE_DEL;
                    Bundle bundle = new Bundle();
                    C63956k kVar2 = this.f178090g;
                    C64822x51 x512 = new C64822x51();
                    x512.f186254d = kVar2.f181298n;
                    C89349b bVar3 = kVar2.f181297j;
                    if (bVar3 != null) {
                        byte[] f = bVar3.mo123703f();
                        x512.f186256f = new C89349b(f, 0, f.length);
                    }
                    x512.f186258h = kVar2.f181291d;
                    C13598b0 b0Var = C13598b0.f38549a;
                    bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", x512.toByteArray());
                    bVar.statusChange(bVar2, bundle);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.dd$o */
    public static final class C62727o implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62966ri f178091d;

        /* renamed from: e */
        public final /* synthetic */ C62712dd f178092e;

        public C62727o(C62966ri riVar, C62712dd ddVar) {
            this.f178091d = riVar;
            this.f178092e = ddVar;
        }

        /* JADX WARNING: type inference failed for: r5v1, types: [android.view.ViewGroup$LayoutParams] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r10 = this;
                qj1.ri r0 = r10.f178091d
                android.view.View r0 = r0.getView()
                qj1.ri r1 = r10.f178091d
                int r1 = r1.mo12180a0()
                android.view.View r0 = r0.findViewById(r1)
                qj1.ri r1 = r10.f178091d
                android.view.View r1 = r1.getView()
                qj1.ri r2 = r10.f178091d
                int r2 = r2.mo12179V()
                android.view.View r1 = r1.findViewById(r2)
                qj1.dd r2 = r10.f178092e
                android.graphics.Point r3 = r2.f178069y
                int r3 = r3.y
                android.view.ViewGroup r2 = r2.f166287d
                android.content.Context r2 = r2.getContext()
                r4 = 2131165301(0x7f070075, float:1.7944815E38)
                int r2 = kg3.C76577a.m92157h(r2, r4)
                int r3 = r3 - r2
                qj1.dd r2 = r10.f178092e
                if (r0 == 0) goto L_0x009e
                if (r1 == 0) goto L_0x009e
                android.view.ViewGroup$LayoutParams r4 = r0.getLayoutParams()
                boolean r5 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
                r6 = 0
                if (r5 == 0) goto L_0x0046
                android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
                goto L_0x0047
            L_0x0046:
                r4 = r6
            L_0x0047:
                android.view.ViewGroup$LayoutParams r5 = r1.getLayoutParams()
                boolean r7 = r5 instanceof android.view.ViewGroup.MarginLayoutParams
                if (r7 == 0) goto L_0x0052
                r6 = r5
                android.view.ViewGroup$MarginLayoutParams r6 = (android.view.ViewGroup.MarginLayoutParams) r6
            L_0x0052:
                if (r4 != 0) goto L_0x0055
                goto L_0x0057
            L_0x0055:
                r4.width = r3
            L_0x0057:
                android.view.ViewGroup r5 = r2.f166287d
                android.content.Context r5 = r5.getContext()
                r7 = 2131165324(0x7f07008c, float:1.7944862E38)
                kg3.C76577a.m92157h(r5, r7)
                android.view.ViewGroup r5 = r2.f166287d
                android.content.Context r5 = r5.getContext()
                r7 = 2131165367(0x7f0700b7, float:1.794495E38)
                int r5 = kg3.C76577a.m92157h(r5, r7)
                android.view.ViewGroup r7 = r2.f166287d
                android.content.Context r7 = r7.getContext()
                r8 = 2131165351(0x7f0700a7, float:1.7944917E38)
                int r7 = kg3.C76577a.m92157h(r7, r8)
                r8 = 0
                if (r6 == 0) goto L_0x008b
                int r9 = r6.topMargin
                r6.setMargins(r8, r9, r7, r8)
                r1.setLayoutParams(r6)
                r1.invalidate()
            L_0x008b:
                if (r4 == 0) goto L_0x0098
                android.view.ViewGroup r1 = r2.f166287d
                int r1 = r1.getWidth()
                int r1 = r1 - r3
                int r1 = r1 - r5
                r4.setMargins(r1, r8, r8, r8)
            L_0x0098:
                r0.setLayoutParams(r4)
                r0.invalidate()
            L_0x009e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: qj1.C62712dd.C62727o.run():void");
        }
    }

    /* renamed from: qj1.dd$p */
    public static final class C62728p implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62712dd f178093d;

        /* renamed from: qj1.dd$p$a */
        public static final class C62729a implements Animator.AnimatorListener {

            /* renamed from: d */
            public final /* synthetic */ C62712dd f178094d;

            public C62729a(C62712dd ddVar) {
                this.f178094d = ddVar;
            }

            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator) {
                View view = this.f178094d.f178068x;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubblePlugin$delPromoteData$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubblePlugin$delPromoteData$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view2 = this.f178094d.f178068x;
                    if (view2 != null) {
                        C9556a aVar2 = new C9556a();
                        aVar2.mo10233c(Float.valueOf(1.0f));
                        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubblePlugin$delPromoteData$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        view2.setAlpha(((Float) aVar2.mo10231a(0)).floatValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubblePlugin$delPromoteData$1$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                        this.f178094d.mo10792g(8);
                        C62712dd ddVar = this.f178094d;
                        ddVar.mo87689H0((View) null, ddVar.f178063s);
                        return;
                    }
                    C87412m.m108603p("promoteAnchorBubbleDelToast");
                    throw null;
                }
                C87412m.m108603p("promoteAnchorBubbleDelToast");
                throw null;
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }
        }

        public C62728p(C62712dd ddVar) {
            this.f178093d = ddVar;
        }

        public final void run() {
            View view = this.f178093d.f178068x;
            if (view != null) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", new float[]{1.0f, 0.0f}).setDuration(1000);
                C87412m.m108593f(duration, "ofFloat(promoteAnchorBub…1f, 0f).setDuration(1000)");
                duration.addListener(new C62729a(this.f178093d));
                duration.start();
                return;
            }
            C87412m.m108603p("promoteAnchorBubbleDelToast");
            throw null;
        }
    }

    /* renamed from: qj1.dd$q */
    public static final class C62730q extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62712dd f178095d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62730q(C62712dd ddVar) {
            super(0);
            this.f178095d = ddVar;
        }

        public Object invoke() {
            ViewGroup viewGroup = this.f178095d.f178066v;
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                this.f178095d.mo10792g(8);
                C62712dd ddVar = this.f178095d;
                ddVar.mo87689H0((View) null, ddVar.f178063s);
                return C13598b0.f38549a;
            }
            C87412m.m108603p("promoteBubbleContainer");
            throw null;
        }
    }

    /* renamed from: qj1.dd$r */
    public static final class C62731r extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62712dd f178096d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62731r(C62712dd ddVar) {
            super(0);
            this.f178096d = ddVar;
        }

        public Object invoke() {
            ((C54979h1) this.f178096d.mo87696x0(C54979h1.class)).f154145t.postValue(Boolean.FALSE);
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.dd$s */
    public static final class C62732s implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62966ri f178097d;

        public C62732s(C62966ri riVar) {
            this.f178097d = riVar;
        }

        public final void run() {
            this.f178097d.mo12186k();
        }
    }

    /* renamed from: qj1.dd$t */
    public static final class C62733t extends C87413o implements C32226l<C63956k, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C62712dd f178098d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62733t(C62712dd ddVar) {
            super(1);
            this.f178098d = ddVar;
        }

        public Object invoke(Object obj) {
            C53973z1 z1Var;
            C63956k kVar = (C63956k) obj;
            C87412m.m108594g(kVar, "item");
            String str = this.f178098d.f178063s;
            Log.m105924i(str, "[onBubbleContentClick] itemId = " + kVar.f181291d);
            if (this.f178098d.f178056C.contains(kVar.getClass()) && (z1Var = this.f178098d.f178054A) != null) {
                C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
            }
            C59043k2 k2Var = (C59043k2) this.f178098d.mo87685B0(C59043k2.class);
            if (k2Var != null) {
                C49466fs3 fs32 = new C49466fs3();
                fs32.f133672d = kVar.f181291d;
                fs32.f133674f = 1;
                fs32.f133673e = 2;
                k2Var.mo84257n3(fs32);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: qj1.dd$u */
    public static final class C62734u implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62712dd f178099d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f178100e;

        public C62734u(C62712dd ddVar, Bundle bundle) {
            this.f178099d = ddVar;
            this.f178100e = bundle;
        }

        public final void run() {
            C62966ri riVar = this.f178099d.f178065u;
            if (riVar != null) {
                riVar.mo12174A(this.f178100e, 0);
            }
        }
    }

    /* renamed from: qj1.dd$v */
    public static final class C62735v implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62712dd f178101d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f178102e;

        /* renamed from: f */
        public final /* synthetic */ long f178103f;

        public C62735v(C62712dd ddVar, Bundle bundle, long j) {
            this.f178101d = ddVar;
            this.f178102e = bundle;
            this.f178103f = j;
        }

        public final void run() {
            C62966ri riVar = this.f178101d.f178065u;
            if (riVar != null) {
                riVar.mo12174A(this.f178102e, this.f178103f);
            }
        }
    }

    /* renamed from: qj1.dd$w */
    public static final class C62736w implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62712dd f178104d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f178105e;

        /* renamed from: f */
        public final /* synthetic */ Object f178106f;

        public C62736w(C62712dd ddVar, Bundle bundle, Object obj) {
            this.f178104d = ddVar;
            this.f178105e = bundle;
            this.f178106f = obj;
        }

        public final void run() {
            C62966ri riVar = this.f178104d.f178065u;
            if (riVar != null) {
                riVar.mo12183e(this.f178105e, this.f178106f, 0);
            }
        }
    }

    /* renamed from: qj1.dd$x */
    public static final class C62737x implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C62712dd f178107d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f178108e;

        /* renamed from: f */
        public final /* synthetic */ Object f178109f;

        /* renamed from: g */
        public final /* synthetic */ long f178110g;

        public C62737x(C62712dd ddVar, Bundle bundle, Object obj, long j) {
            this.f178107d = ddVar;
            this.f178108e = bundle;
            this.f178109f = obj;
            this.f178110g = j;
        }

        public final void run() {
            C62966ri riVar = this.f178107d.f178065u;
            if (riVar != null) {
                riVar.mo12183e(this.f178108e, this.f178109f, this.f178110g);
            }
        }
    }

    /* renamed from: qj1.dd$y */
    public static final class C62738y extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C58124b.C58125b f178111d;

        /* renamed from: e */
        public final /* synthetic */ Bundle f178112e;

        /* renamed from: f */
        public final /* synthetic */ C62712dd f178113f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C62738y(C58124b.C58125b bVar, Bundle bundle, C62712dd ddVar) {
            super(0);
            this.f178111d = bVar;
            this.f178112e = bundle;
            this.f178113f = ddVar;
        }

        public Object invoke() {
            byte[] byteArray;
            byte[] byteArray2;
            int ordinal = this.f178111d.ordinal();
            if (ordinal != 106) {
                switch (ordinal) {
                    case 112:
                        Bundle bundle = this.f178112e;
                        if (!(bundle == null || (byteArray = bundle.getByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA")) == null)) {
                            C62712dd ddVar = this.f178113f;
                            C63956k y1 = C62042e.f176370a.mo87130y1(byteArray);
                            if (y1 != null) {
                                C53973z1 z1Var = ddVar.f178070z;
                                if (z1Var != null) {
                                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                                }
                                ddVar.f178070z = C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C62809hd(y1, ddVar, (C15601d<? super C62809hd>) null), 3, (Object) null);
                                break;
                            }
                        }
                        break;
                    case 113:
                        Bundle bundle2 = this.f178112e;
                        if (!(bundle2 == null || (byteArray2 = bundle2.getByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA")) == null)) {
                            C62712dd ddVar2 = this.f178113f;
                            C53973z1 z1Var2 = ddVar2.f178070z;
                            if (z1Var2 != null) {
                                C53973z1.C53974a.m60623a(z1Var2, (CancellationException) null, 1, (Object) null);
                            }
                            C63956k y15 = C62042e.f176370a.mo87130y1(byteArray2);
                            if (y15 != null) {
                                ddVar2.f178070z = C53895h.m60466d(C0001s1.f0d, (C66212f) null, (C53934p0) null, new C62821id(ddVar2, y15, (C15601d<? super C62821id>) null), 3, (Object) null);
                                break;
                            }
                        }
                        break;
                    case 114:
                        C53973z1 z1Var3 = this.f178113f.f178070z;
                        if (z1Var3 != null) {
                            C53973z1.C53974a.m60623a(z1Var3, (CancellationException) null, 1, (Object) null);
                        }
                        C61926c.m72668M(new C62832jd(this.f178112e, this.f178113f));
                        break;
                }
            } else {
                C62712dd ddVar3 = this.f178113f;
                if (ddVar3.f178065u instanceof C63122y6) {
                    ddVar3.mo87727e1(false, false, false);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62712dd(ViewGroup viewGroup, ViewGroup viewGroup2, C58124b bVar) {
        super(viewGroup2, bVar, (C49712hj1) null);
        C87412m.m108594g(viewGroup, "liveRootView");
        C87412m.m108594g(viewGroup2, "promoteBubbleContainerParent");
        C87412m.m108594g(bVar, "statusMonitor");
        this.f178060p = viewGroup;
        this.f178061q = viewGroup2;
        this.f178062r = bVar;
        LinkedList<C62723k> linkedList = new LinkedList<>();
        this.f178064t = linkedList;
        this.f178069y = C75044y4.m89990b(MMApplicationContext.getContext());
        this.f178055B = C26236u.m33719b(C63122y6.class);
        this.f178056C = C64197v.m75537f(C13695o.class, C63960p.class);
        this.f178057D = C64197v.m75537f(C63965x.class, C13696v.class, C63963s.class);
        this.f178058E = C36568h.m40985a(new C62725m(this));
        this.f178059F = new C62733t(this);
        View findViewById = viewGroup2.findViewById(C0966R.C0970id.dxh);
        C87412m.m108593f(findViewById, "promoteBubbleContainerPa…e_bubble_container_child)");
        this.f178066v = (ViewGroup) findViewById;
        View findViewById2 = viewGroup2.findViewById(C0966R.C0970id.dxi);
        C87412m.m108593f(findViewById2, "promoteBubbleContainerPa…ble_container_scrollview)");
        this.f178067w = (ScrollView) findViewById2;
        View findViewById3 = viewGroup2.findViewById(C0966R.C0970id.dxe);
        C87412m.m108593f(findViewById3, "promoteBubbleContainerPa…mote_bubble_anchor_toast)");
        this.f178068x = findViewById3;
        View findViewById4 = viewGroup2.findViewById(C0966R.C0970id.dxf);
        C87412m.m108593f(findViewById4, "promoteBubbleContainerPa…bubble_anchor_toast_text)");
        C85875k4.m106189j0(((TextView) findViewById4).getPaint(), 0.8f);
        linkedList.add(new C62714b(this));
        linkedList.add(new C62715c(this));
        linkedList.add(new C62716d(this));
        linkedList.add(new C62717e(this));
        linkedList.add(new C62718f(this));
        linkedList.add(new C62719g(this));
        linkedList.add(new C62720h(this));
        linkedList.add(new C62721i(this));
        linkedList.add(new C62722j(this));
        linkedList.add(new C62713a(this));
        if (!mo82893g0()) {
            Point b = C75044y4.m89990b(viewGroup2.getContext());
            if (b.x >= (b.y / 3) * 2) {
                ViewGroup.LayoutParams layoutParams = viewGroup2.getLayoutParams();
                layoutParams.width = (b.x / 2) + ((int) viewGroup2.getContext().getResources().getDimension(C0966R.dimen.f3760da));
                viewGroup2.setLayoutParams(layoutParams);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x001e, code lost:
        r1 = r1.mo12177J();
     */
    /* renamed from: Z0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m73744Z0(qj1.C62712dd r7, sk1.C63956k r8) {
        /*
            java.lang.Class<cl1.h1> r0 = cl1.C54979h1.class
            java.lang.String r1 = r7.f178063s
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[addPromoteData],promoteData = "
            r2.append(r3)
            long r4 = r8.f181291d
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            qj1.ri r1 = r7.f178065u
            if (r1 == 0) goto L_0x0027
            sk1.k r1 = r1.mo12177J()
            if (r1 == 0) goto L_0x0027
            long r1 = r1.f181291d
            goto L_0x0029
        L_0x0027:
            r1 = -1
        L_0x0029:
            long r4 = r8.mo13074d()
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x004d
            java.lang.String r7 = r7.f178063s
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            long r1 = r8.f181291d
            r0.append(r1)
            java.lang.String r8 = ", already add"
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            goto L_0x00b2
        L_0x004d:
            androidx.lifecycle.i0 r1 = r7.mo87696x0(r0)
            cl1.h1 r1 = (cl1.C54979h1) r1
            boolean r1 = r1.f154137i
            if (r1 != 0) goto L_0x0068
            boolean r1 = r8 instanceof sk1.C63965x
            if (r1 != 0) goto L_0x005f
            boolean r1 = r8 instanceof sk1.C13696v
            if (r1 == 0) goto L_0x0068
        L_0x005f:
            java.lang.String r7 = "MMFinder.LiveShopSlice"
            java.lang.String r8 = "shoppingAvailable false, reset promotingProduct"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r8)
            goto L_0x00b2
        L_0x0068:
            r7.mo87731i1(r8)
            r7.mo87725c1(r8)
            qj1.ri r1 = r7.mo87729g1(r8)
            if (r1 == 0) goto L_0x009e
            qj1.ri r2 = r7.f178065u
            if (r2 == 0) goto L_0x007b
            r2.mo12190w()
        L_0x007b:
            r1.mo12175C(r8)
            r7.mo87726d1(r1)
            qj1.ri r2 = r7.f178065u
            r7.mo87724b1(r2, r1)
            r7.f178065u = r1
            androidx.lifecycle.i0 r1 = r7.mo87696x0(r0)
            cl1.h1 r1 = (cl1.C54979h1) r1
            r1.mo75948o3(r8)
            r8 = 0
            r7.mo10792g(r8)
            r7.mo87732j1()
            r8 = 0
            java.lang.String r1 = r7.f178063s
            r7.mo87689H0(r8, r1)
        L_0x009e:
            androidx.lifecycle.i0 r8 = r7.mo87696x0(r0)
            cl1.h1 r8 = (cl1.C54979h1) r8
            r0 = 0
            r8.f154118J = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            qj1.ed r8 = new qj1.ed
            r8.<init>(r7)
            o40.C61926c.m72666K(r0, r8)
        L_0x00b2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62712dd.m73744Z0(qj1.dd, sk1.k):void");
    }

    /* renamed from: a1 */
    public static final void m73745a1(C62712dd ddVar) {
        C60491p4 p4Var;
        C63084w6 w6Var = (C63084w6) ddVar.mo87687E0(C63084w6.class);
        if (!(w6Var == null || (p4Var = w6Var.f179023q) == null)) {
            p4Var.mo85445a();
        }
        C62750di diVar = (C62750di) ddVar.mo87687E0(C62750di.class);
        if (diVar != null) {
            diVar.mo10792g(8);
        }
        C62707db dbVar = (C62707db) ddVar.mo87687E0(C62707db.class);
        if (dbVar != null) {
            dbVar.mo87720b1();
        }
    }

    /* renamed from: O0 */
    public void mo12017O0(Configuration configuration) {
        if (!mo82893g0()) {
            Point b = C75044y4.m89990b(this.f178061q.getContext());
            if (b.x >= (b.y / 3) * 2) {
                ViewGroup.LayoutParams layoutParams = this.f178061q.getLayoutParams();
                layoutParams.width = (b.x / 2) + ((int) this.f178061q.getContext().getResources().getDimension(C0966R.dimen.f3760da));
                this.f178061q.setLayoutParams(layoutParams);
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = this.f178061q.getLayoutParams();
            layoutParams2.width = -1;
            this.f178061q.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: Q0 */
    public void mo12018Q0(Bundle bundle) {
        this.f166287d.postDelayed(new C62734u(this, bundle), 500);
    }

    /* renamed from: R0 */
    public void mo87692R0(Bundle bundle, long j) {
        this.f166287d.postDelayed(new C62735v(this, bundle, j), 500);
    }

    /* renamed from: T0 */
    public void mo11982T0(Bundle bundle, Object obj) {
        this.f166287d.postDelayed(new C62736w(this, bundle, obj), 500);
    }

    /* renamed from: b */
    public boolean mo3200b() {
        return true;
    }

    /* renamed from: b1 */
    public final void mo87724b1(C62966ri riVar, C62966ri riVar2) {
        View view = riVar != null ? riVar.getView() : null;
        View view2 = riVar2.getView();
        ViewGroup viewGroup = this.f178066v;
        if (viewGroup == null) {
            C87412m.m108603p("promoteBubbleContainer");
            throw null;
        } else if (viewGroup.getChildCount() == 0 || view == null) {
            if (mo87730h1(riVar2)) {
                mo87728f1(riVar, riVar2);
                return;
            }
            ViewGroup viewGroup2 = this.f178066v;
            if (viewGroup2 != null) {
                viewGroup2.addView(view2);
                ViewGroup viewGroup3 = this.f178066v;
                if (viewGroup3 != null) {
                    viewGroup3.requestLayout();
                } else {
                    C87412m.m108603p("promoteBubbleContainer");
                    throw null;
                }
            } else {
                C87412m.m108603p("promoteBubbleContainer");
                throw null;
            }
        } else if (mo87730h1(riVar)) {
            C62724l lVar = new C62724l(this, riVar2, riVar, view, view2);
            if (riVar != null) {
                riVar.mo12176F(new C12427gd(lVar));
            }
        } else {
            View view3 = riVar != null ? riVar.getView() : null;
            View view4 = riVar2.getView();
            if (mo87730h1(riVar2)) {
                mo87728f1(riVar, riVar2);
                return;
            }
            ViewGroup viewGroup4 = this.f178066v;
            if (viewGroup4 != null) {
                int height = viewGroup4.getHeight();
                ViewGroup.LayoutParams layoutParams = this.f178061q.getLayoutParams();
                layoutParams.height = height;
                this.f178061q.setLayoutParams(layoutParams);
                ViewGroup viewGroup5 = this.f178066v;
                if (viewGroup5 != null) {
                    viewGroup5.addView(view4);
                    view4.post(new C62774fd(view3, view4, this, riVar2));
                    return;
                }
                C87412m.m108603p("promoteBubbleContainer");
                throw null;
            }
            C87412m.m108603p("promoteBubbleContainer");
            throw null;
        }
    }

    /* renamed from: c1 */
    public final void mo87725c1(C63956k kVar) {
        if (!C62042e.f176370a.mo87027N0()) {
            C0740i2 i2Var = ((C54979h1) mo87696x0(C54979h1.class)).f154147v;
            C63956k kVar2 = i2Var instanceof C63956k ? (C63956k) i2Var : null;
            long j = kVar2 != null ? kVar2.f181291d : 0;
            String str = this.f178063s;
            Log.m105924i(str, "[checkAndLaunchDelayDismissJob] curPromoteDataId = " + j + " , remotePromoteDataId = " + kVar.f181291d + " , delay:" + kVar.f181296i);
            if (j != kVar.f181291d || this.f178065u == null) {
                C53973z1 z1Var = this.f178054A;
                boolean z = true;
                if (z1Var != null) {
                    C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                }
                if (kVar.f181296i <= 0) {
                    z = false;
                }
                C63956k kVar3 = z ? kVar : null;
                if (kVar3 != null) {
                    this.f178054A = C11207i.m11067c(this, (C66212f) null, (C53934p0) null, new C62726n(kVar3, this, kVar, (C15601d<? super C62726n>) null), 3, (Object) null);
                    return;
                }
                return;
            }
            Log.m105924i(this.f178063s, "[checkAndLaunchDelayDismissJob] return");
        }
    }

    /* renamed from: d1 */
    public final void mo87726d1(C62966ri riVar) {
        if (mo82893g0() && !this.f178055B.contains(riVar.getClass())) {
            riVar.getView().post(new C62727o(riVar, this));
        }
    }

    /* renamed from: e */
    public void mo12022e(Bundle bundle, Object obj, long j) {
        this.f166287d.postDelayed(new C62737x(this, bundle, obj, j), 500);
    }

    /* renamed from: e1 */
    public final void mo87727e1(boolean z, boolean z2, boolean z3) {
        String str;
        C62966ri riVar;
        boolean z4 = z;
        Class cls = C54979h1.class;
        C0740i2 i2Var = ((C54979h1) mo87696x0(cls)).f154147v;
        if (!C62042e.f176370a.mo87027N0() || i2Var == null || this.f178057D.contains(i2Var.getClass()) || !z2) {
            C62966ri riVar2 = this.f178065u;
            if (riVar2 != null) {
                riVar2.mo12190w();
            }
            if (z4) {
                ((C54979h1) mo87696x0(cls)).mo75948o3((C0740i2) null);
            }
            if (mo87730h1(this.f178065u)) {
                C62966ri riVar3 = this.f178065u;
                C62730q qVar = new C62730q(this);
                if (riVar3 != null) {
                    riVar3.mo12176F(new C12427gd(qVar));
                }
                riVar = null;
            } else {
                ViewGroup viewGroup = this.f178066v;
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                    mo10792g(8);
                    riVar = null;
                    mo87689H0((View) null, this.f178063s);
                } else {
                    C87412m.m108603p("promoteBubbleContainer");
                    throw null;
                }
            }
            this.f178065u = riVar;
        } else {
            C62966ri riVar4 = this.f178065u;
            if (riVar4 != null) {
                riVar4.mo12190w();
            }
            if (z4) {
                ((C54979h1) mo87696x0(cls)).mo75948o3((C0740i2) null);
            }
            this.f178065u = null;
            ViewGroup viewGroup2 = this.f178066v;
            if (viewGroup2 != null) {
                viewGroup2.removeAllViews();
                View view = this.f178068x;
                if (view != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    View view2 = view;
                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubblePlugin", "delPromoteData", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLivePromoteBubblePlugin", "delPromoteData", "(ZZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View view3 = this.f178068x;
                    if (view3 != null) {
                        view3.postDelayed(new C62728p(this), 1500);
                    } else {
                        C87412m.m108603p("promoteAnchorBubbleDelToast");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("promoteAnchorBubbleDelToast");
                    throw null;
                }
            } else {
                C87412m.m108603p("promoteBubbleContainer");
                throw null;
            }
        }
        if (z4 && (i2Var instanceof C63965x)) {
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C63965x xVar = (C63965x) i2Var;
            C54116w.Rx0((C54116w) c, C54067f0.C54081r0.CommerceActionAnchorCloseBubble, (String) null, String.valueOf(xVar.f181347t), (String) null, (String) null, (String) null, 0, 0, C61866i0.f175909a.mo86794e(xVar.f181346s), WXWebReporter.KEY_TRY_FIX_DEX_FAILED, (Object) null);
        }
        if (z2) {
            C64605o91 o912 = new C64605o91();
            long j = 0;
            if (!z4) {
                C63956k kVar = i2Var instanceof C63956k ? (C63956k) i2Var : null;
                if (kVar != null) {
                    j = kVar.f181291d;
                }
                ((C54979h1) mo87696x0(cls)).f154118J = j;
            }
            o912.f184634d = j;
            boolean z5 = i2Var instanceof C63956k;
            C63956k kVar2 = z5 ? (C63956k) i2Var : null;
            o912.f184635e = kVar2 != null ? kVar2.mo13072a() : null;
            o912.f184636f = null;
            o912.f184637g = !z4;
            if (z4 || z3) {
                str = "";
            } else {
                C63956k kVar3 = z5 ? (C63956k) i2Var : null;
                str = kVar3 != null ? kVar3.f181302r : null;
            }
            o912.f184638h = str;
            o912.f184639i = ((C54979h1) mo87684A0().mo71262a(cls)).f154120L;
            String str2 = this.f178063s;
            Log.m105924i(str2, "[delPromoteData] deleteByAnchor:" + z4 + " ,hidden_state = " + o912.f184637g + ", extBUf = " + o912.f184635e + ", current_promoting_id = " + o912.f184634d + ", current_promoting_sub_id=" + o912.f184638h);
            FinderLiveService.f159376d.getClass();
            FinderLiveService.f159383n.mo75802h(10, o912);
        }
        C61926c.m72666K(1000, new C62731r(this));
    }

    /* renamed from: f1 */
    public final void mo87728f1(C62966ri riVar, C62966ri riVar2) {
        View view = riVar != null ? riVar.getView() : null;
        View view2 = riVar2.getView();
        ViewGroup viewGroup = this.f178066v;
        if (viewGroup != null) {
            viewGroup.removeView(view);
            ViewGroup viewGroup2 = this.f178066v;
            if (viewGroup2 != null) {
                viewGroup2.addView(view2);
                if (C62042e.f176370a.mo87027N0()) {
                    C12490l0 l0Var = (C12490l0) mo87687E0(C12490l0.class);
                    if (l0Var != null) {
                        l0Var.f35929s.mo13126b();
                    }
                } else {
                    C62741dg dgVar = (C62741dg) mo87687E0(C62741dg.class);
                    if (dgVar != null) {
                        dgVar.f178123r.mo13126b();
                    }
                }
                view2.post(new C62732s(riVar2));
                return;
            }
            C87412m.m108603p("promoteBubbleContainer");
            throw null;
        }
        C87412m.m108603p("promoteBubbleContainer");
        throw null;
    }

    /* renamed from: g1 */
    public final C62966ri mo87729g1(C63956k kVar) {
        for (C62723k kVar2 : this.f178064t) {
            if (kVar2.mo87734b(kVar)) {
                return kVar2.mo87733a(kVar);
            }
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo3206h() {
        return true;
    }

    /* renamed from: h1 */
    public final boolean mo87730h1(C62966ri riVar) {
        return (riVar instanceof C62850ke) || (riVar instanceof C63138yd);
    }

    /* renamed from: i0 */
    public void mo8357i0() {
        super.mo8357i0();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        r0 = r0.mo12177J();
     */
    /* renamed from: i1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo87731i1(sk1.C63956k r6) {
        /*
            r5 = this;
            ok1.e r0 = ok1.C62042e.f176370a
            boolean r0 = r0.mo87027N0()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            qj1.ri r0 = r5.f178065u
            if (r0 == 0) goto L_0x0016
            sk1.k r0 = r0.mo12177J()
            if (r0 == 0) goto L_0x0016
            long r0 = r0.f181291d
            goto L_0x0018
        L_0x0016:
            r0 = 0
        L_0x0018:
            long r2 = r6.f181291d
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x0051
            java.lang.String r0 = r5.f178063s
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[reportPromoteExpose] promoteId = "
            r1.append(r2)
            long r2 = r6.f181291d
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r0, r1)
            java.lang.Class<fh1.k2> r0 = fh1.C59043k2.class
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r5.mo87685B0(r0)
            fh1.k2 r0 = (fh1.C59043k2) r0
            if (r0 == 0) goto L_0x0051
            te3.fs3 r1 = new te3.fs3
            r1.<init>()
            long r2 = r6.f181291d
            r1.f133672d = r2
            r6 = 1
            r1.f133674f = r6
            r1.f133673e = r6
            r0.mo84257n3(r1)
        L_0x0051:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj1.C62712dd.mo87731i1(sk1.k):void");
    }

    /* renamed from: j1 */
    public final void mo87732j1() {
        String str;
        C47465a b;
        Class cls = C54979h1.class;
        C0740i2 i2Var = ((C54979h1) mo87684A0().mo71262a(cls)).f154147v;
        C89349b bVar = null;
        C63956k kVar = i2Var instanceof C63956k ? (C63956k) i2Var : null;
        C64605o91 o912 = new C64605o91();
        o912.f184634d = kVar != null ? kVar.f181291d : 0;
        o912.f184635e = kVar != null ? kVar.mo13072a() : null;
        if (kVar != null) {
            bVar = new C89349b(kVar.mo13073b().toByteArray());
        }
        o912.f184636f = bVar;
        if (kVar == null || (str = kVar.f181302r) == null) {
            str = "";
        }
        o912.f184638h = str;
        o912.f184639i = ((C54979h1) mo87684A0().mo71262a(cls)).f154120L;
        Object obj = "null";
        Object h = (kVar == null || (b = kVar.mo13073b()) == null) ? obj : C61937h.m72709h(b);
        if (kVar != null) {
            C51647v51 v512 = new C51647v51();
            C89349b a = kVar.mo13072a();
            if (a != null) {
                v512.parseFrom(a.mo123703f());
            }
            obj = C61937h.m72709h(v512);
        }
        String str2 = this.f178063s;
        Log.m105924i(str2, "[startOrUpdatePollingData] update polling extBUf = " + o912.f184635e + ", current_promoting_id = " + o912.f184634d + ", promote_info_buffer = " + h + ", ext_buffer = " + obj);
        FinderLiveService.f159376d.getClass();
        FinderLiveService.f159383n.mo75802h(10, o912);
    }

    /* renamed from: m */
    public boolean mo3208m() {
        return true;
    }

    /* renamed from: r0 */
    public void mo8358r0() {
        C62966ri riVar = this.f178065u;
        if (riVar != null) {
            riVar.onPause();
        }
    }

    /* renamed from: u0 */
    public void mo3210u0(C58124b.C58125b bVar, Bundle bundle) {
        C87412m.m108594g(bVar, "status");
        C61926c.m72668M(new C62738y(bVar, bundle, this));
    }

    /* renamed from: w0 */
    public void mo3211w0() {
        super.mo3211w0();
        if (!((C54991o) mo87696x0(C54991o.class)).f154255S3) {
            mo87727e1(false, false, false);
        }
        C62042e.f176370a.getClass();
        FinderLiveService.f159376d.getClass();
        FinderLiveService.f159383n.mo75800f(10);
        ValueAnimator valueAnimator = C62966ri.C12651a.f36240a;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        C62966ri.C12651a.f36240a = null;
        this.f178065u = null;
        C53973z1 z1Var = this.f178070z;
        if (z1Var != null) {
            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
        }
    }
}
