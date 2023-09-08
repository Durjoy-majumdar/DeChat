package sp1;

import a14.C0000n0;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53915k2;
import a14.C53934p0;
import ak1.C54067f0;
import ak1.C54108o;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.lifecycle.C0125s;
import cj1.C54795n5;
import cl1.C54979h1;
import cl1.C54991o;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import d60.C58124b;
import di3.C7335d;
import di3.C86312j;
import f14.C58901s;
import fy3.C32224a;
import fy3.C32227p;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kotlin.ResultKt;
import nk1.C11207i;
import org.libpag.PAGFile;
import org.libpag.PAGView;
import org.libpag.SimplePAGViewUpdateListener;
import qj1.C62660c;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sk1.C63964u;
import sk1.C63965x;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;
import zj1.C16217b;

/* renamed from: sp1.a */
public final class C13764a implements C64121q0 {

    /* renamed from: a */
    public final ViewGroup f38868a;

    /* renamed from: b */
    public final C58124b f38869b;

    /* renamed from: c */
    public final C62660c f38870c;

    /* renamed from: d */
    public final String f38871d = "FinderLiveAnchorShoppingEntranceWidget";

    /* renamed from: e */
    public final String f38872e = "finder_live_shopping_entrance_fire.pag";

    /* renamed from: f */
    public int f38873f;

    /* renamed from: g */
    public boolean f38874g = true;

    /* renamed from: h */
    public final PAGView f38875h;

    /* renamed from: i */
    public final C13601g f38876i;

    /* renamed from: j */
    public final View f38877j;

    /* renamed from: k */
    public final String f38878k;

    /* renamed from: sp1.a$a */
    public static final class C13765a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C13764a f38879d;

        public C13765a(C13764a aVar) {
            this.f38879d = aVar;
        }

        public final void onClick(View view) {
            Class cls = C54108o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/view/FinderLiveAnchorShoppingEntranceWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C0740i2 i2Var = ((C54979h1) this.f38879d.f38870c.mo87696x0(C54979h1.class)).f154147v;
            Bundle bundle = new Bundle();
            if (i2Var instanceof C63965x) {
                bundle.putLong("PARAM_FINDER_LIVE_BUBBLE_PRODUCTID", ((C63965x) i2Var).f181347t);
            } else if (i2Var instanceof C63964u) {
                bundle.putLong("PARAM_FINDER_LIVE_BUBBLE_ADID", ((C63964u) i2Var).f181326t);
            }
            bundle.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", true);
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C8777j5.C8778a.m8606g((C8777j5) c, C54067f0.C0064m.SHOP, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING), (String) null, 4, (Object) null);
            this.f38879d.f38869b.statusChange(C58124b.C58125b.FINDER_LIVE_SHOPPING_LIST_SHOW, bundle);
            C16217b.f43438a.mo14745b(this.f38879d.f38878k, false);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveAnchorShoppingEntranceWidget$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: sp1.a$b */
    public static final class C13766b implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ C13764a f38880d;

        public C13766b(C13764a aVar) {
            this.f38880d = aVar;
        }

        public void onGlobalLayout() {
            if (this.f38880d.f38870c.mo87688G0()) {
                this.f38880d.f38868a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                String str = this.f38880d.f38871d;
                Log.m105924i(str, "watchShoppingEntrancePosition removeOnGlobalLayoutListener:" + this);
                return;
            }
            C13764a aVar = this.f38880d;
            int i = aVar.f38873f;
            aVar.f38873f = i + 1;
            if (i >= Integer.MAX_VALUE) {
                aVar.f38873f = 0;
            }
        }
    }

    /* renamed from: sp1.a$c */
    public static final class C13767c extends C87413o implements C32224a<View> {

        /* renamed from: d */
        public final /* synthetic */ C13764a f38881d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13767c(C13764a aVar) {
            super(0);
            this.f38881d = aVar;
        }

        public Object invoke() {
            return this.f38881d.f38868a.findViewById(C0966R.C0970id.dyt);
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.view.FinderLiveAnchorShoppingEntranceWidget$playPromotePag$1", mo125469f = "FinderLiveAnchorShoppingEntranceWidget.kt", mo125470l = {89}, mo125471m = "invokeSuspend")
    /* renamed from: sp1.a$d */
    public static final class C13768d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public int f38882d;

        /* renamed from: e */
        public final /* synthetic */ C13764a f38883e;

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.view.FinderLiveAnchorShoppingEntranceWidget$playPromotePag$1$1", mo125469f = "FinderLiveAnchorShoppingEntranceWidget.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: sp1.a$d$a */
        public static final class C13769a extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C13764a f38884d;

            /* renamed from: sp1.a$d$a$a */
            public static final class C13770a extends SimplePAGViewUpdateListener {

                /* renamed from: d */
                public final /* synthetic */ C13764a f38885d;

                public C13770a(C13764a aVar) {
                    this.f38885d = aVar;
                }

                public void onAnimationCancel(PAGView pAGView) {
                    if (pAGView != null) {
                        C13764a aVar = this.f38885d;
                        pAGView.removeListener(this);
                        View view = (View) ((C36570n) aVar.f38876i).getValue();
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveAnchorShoppingEntranceWidget$playPromotePag$1$1$1", "onAnimationCancel", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveAnchorShoppingEntranceWidget$playPromotePag$1$1$1", "onAnimationCancel", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        pAGView.setVisibility(8);
                    }
                }

                public void onAnimationEnd(PAGView pAGView) {
                    if (pAGView != null) {
                        C13764a aVar = this.f38885d;
                        pAGView.removeListener(this);
                        View view = (View) ((C36570n) aVar.f38876i).getValue();
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveAnchorShoppingEntranceWidget$playPromotePag$1$1$1", "onAnimationEnd", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveAnchorShoppingEntranceWidget$playPromotePag$1$1$1", "onAnimationEnd", "(Lorg/libpag/PAGView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        pAGView.setVisibility(8);
                    }
                }

                public void onAnimationRepeat(PAGView pAGView) {
                }

                public void onAnimationStart(PAGView pAGView) {
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C13769a(C13764a aVar, C15601d<? super C13769a> dVar) {
                super(2, dVar);
                this.f38884d = aVar;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C13769a(this.f38884d, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C13769a) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                this.f38884d.f38875h.play();
                this.f38884d.f38875h.setVisibility(0);
                View view = (View) ((C36570n) this.f38884d.f38876i).getValue();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/view/FinderLiveAnchorShoppingEntranceWidget$playPromotePag$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/shopping/view/FinderLiveAnchorShoppingEntranceWidget$playPromotePag$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C13764a aVar2 = this.f38884d;
                aVar2.f38875h.addListener(new C13770a(aVar2));
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13768d(C13764a aVar, C15601d<? super C13768d> dVar) {
            super(2, dVar);
            this.f38883e = aVar;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C13768d(this.f38883e, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C13768d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        public final Object invokeSuspend(Object obj) {
            C15911a aVar = C15911a.COROUTINE_SUSPENDED;
            int i = this.f38882d;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.f38883e.f38875h.stop();
                if (this.f38883e.f38875h.getComposition() == null) {
                    C13764a aVar2 = this.f38883e;
                    aVar2.f38875h.setComposition(PAGFile.Load(aVar2.f38868a.getContext().getAssets(), this.f38883e.f38872e));
                }
                this.f38883e.f38875h.flush();
                this.f38883e.f38875h.setRepeatCount(1);
                C53896h0 h0Var = C53872d1.f151117a;
                C53915k2 k2Var = C58901s.f168555a;
                C13769a aVar3 = new C13769a(this.f38883e, (C15601d<? super C13769a>) null);
                this.f38882d = 1;
                if (C53895h.m60469g(k2Var, aVar3, this) == aVar) {
                    return aVar;
                }
            } else if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C13598b0.f38549a;
        }
    }

    public C13764a(ViewGroup viewGroup, C58124b bVar, C62660c cVar) {
        C87412m.m108594g(viewGroup, "root");
        C87412m.m108594g(bVar, "statusMonitor");
        C87412m.m108594g(cVar, "basePlugin");
        this.f38868a = viewGroup;
        this.f38869b = bVar;
        this.f38870c = cVar;
        this.f38875h = (PAGView) viewGroup.findViewById(C0966R.C0970id.o7m);
        this.f38876i = C36568h.m40985a(new C13767c(this));
        View findViewById = viewGroup.findViewById(C0966R.C0970id.ool);
        this.f38877j = findViewById;
        TextView textView = (TextView) viewGroup.findViewById(C0966R.C0970id.ooj);
        this.f38878k = "anchorlive.bottom.shopping";
        viewGroup.setOnClickListener(new C13765a(this));
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(new C13766b(this));
        C16217b bVar2 = C16217b.f43438a;
        Context context = viewGroup.getContext();
        C16217b.m15108i(bVar2, context instanceof C0125s ? (C0125s) context : null, "anchorlive.bottom.shopping", findViewById, (View) null, textView, 8, (Object) null);
    }

    /* renamed from: b */
    public void mo13126b() {
        C11207i.m11072h(this.f38870c, C53872d1.f151119c, (C53934p0) null, new C13768d(this, (C15601d<? super C13768d>) null), 2, (Object) null);
    }

    /* renamed from: e */
    public ViewGroup mo13127e() {
        return this.f38868a;
    }

    /* renamed from: f */
    public void mo13128f(boolean z) {
        Class cls = C54108o.class;
        Class cls2 = C54979h1.class;
        if (((C54979h1) this.f38870c.mo87696x0(cls2)).f154134f || ((C54979h1) this.f38870c.mo87696x0(cls2)).f154137i) {
            if (this.f38868a.getVisibility() != 0 || this.f38874g) {
                this.f38874g = false;
                ((C54108o) C86312j.m106911c(cls)).mo9602Jz(C54067f0.C0066n.SHOP, ((C54108o) C86312j.m106911c(cls)).Ex0(C54067f0.C0062l.LIVING));
                C16217b.f43438a.mo14751g(this.f38878k);
            }
            mo13129g(0);
            return;
        }
        mo13129g(8);
    }

    /* renamed from: g */
    public void mo13129g(int i) {
        if (((C54991o) this.f38870c.mo87696x0(C54991o.class)).mo75999e4() || i != 0) {
            this.f38868a.setVisibility(i);
            return;
        }
        C54795n5 D0 = this.f38870c.mo14476D0();
        if (D0 != null) {
            D0.mo75716T(this.f38868a, i);
        }
    }

    public boolean isVisible() {
        return this.f38868a.getVisibility() == 0;
    }
}
