package np1;

import a14.C0000n0;
import a14.C0001s1;
import a14.C53872d1;
import a14.C53895h;
import a14.C53896h0;
import a14.C53934p0;
import a14.C53973z1;
import ak1.C54067f0;
import ak1.C54116w;
import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bi1.C0280a;
import bi1.C0281b;
import bi1.C0287e;
import bi1.C0288f;
import cj1.C54789l6;
import cj1.C54795n5;
import cj1.C54804r0;
import cl1.C54979h1;
import cl1.C54991o;
import cl1.C55001u;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.widget.MMSwitchBtn;
import com.tencent.p014mm.plugin.finder.live.view.C56032b;
import com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout;
import com.tencent.p014mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingCouponView;
import com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPanel;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import d14.C45253g;
import d14.C58052j1;
import d14.C58087u0;
import d60.C58124b;
import di0.C86295k;
import di0.C86299o;
import di3.C7335d;
import di3.C86312j;
import er1.C58739j4;
import f14.C58901s;
import fj1.C45795b;
import fy3.C32224a;
import fy3.C32226l;
import fy3.C32227p;
import fy3.C32228q;
import fy3.C32230s;
import gy3.C8479f0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CancellationException;
import k20.C60958c;
import k20.C9556a;
import kg3.C76577a;
import kotlin.ResultKt;
import nk1.C11207i;
import o40.C61926c;
import ok1.C62042e;
import op1.C62075a;
import op1.C62084h;
import op1.C62117x;
import op1.C62118y;
import org.json.JSONObject;
import pe3.C89349b;
import pp1.C62431d;
import pp1.C62438f;
import pp1.C62457g;
import pp1.C62461j;
import qg1.C47826f;
import qj1.C62660c;
import qo3.C12925w;
import qp1.C63315j;
import rx3.C13598b0;
import rx3.C13600d;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sk1.C13696v;
import sk1.C63965x;
import sx3.C36907w;
import te3.C49366f21;
import te3.C49712hj1;
import te3.C49778i01;
import te3.C50351m41;
import te3.C50401mh0;
import te3.C50415mk1;
import te3.C51203s61;
import te3.C52128yk0;
import te3.C64399gj1;
import te3.C64434i11;
import tf0.C64916p1;
import wx3.C15601d;
import xx3.C15911a;
import yx3.C91590f;
import yx3.C91594j;

/* renamed from: np1.a */
public final class C61817a implements View.OnClickListener {

    /* renamed from: A */
    public C61859e0 f175759A;

    /* renamed from: B */
    public final C13601g f175760B = C36568h.m40985a(new C61835o(this));

    /* renamed from: C */
    public C62084h f175761C;

    /* renamed from: D */
    public C62075a f175762D;

    /* renamed from: E */
    public C62084h f175763E;

    /* renamed from: F */
    public int f175764F;

    /* renamed from: G */
    public boolean f175765G;

    /* renamed from: H */
    public boolean f175766H;

    /* renamed from: I */
    public final C13601g f175767I;

    /* renamed from: J */
    public final C32227p<Integer, C86299o, C13598b0> f175768J;

    /* renamed from: K */
    public RecyclerView.C16622o f175769K;

    /* renamed from: L */
    public final HashMap<String, C86299o> f175770L;

    /* renamed from: d */
    public final int f175771d;

    /* renamed from: e */
    public final ViewGroup f175772e;

    /* renamed from: f */
    public final C58124b f175773f;

    /* renamed from: g */
    public final C45795b f175774g;

    /* renamed from: h */
    public final C54795n5 f175775h;

    /* renamed from: i */
    public final C62660c f175776i;

    /* renamed from: j */
    public C62461j f175777j;

    /* renamed from: n */
    public C62457g f175778n;

    /* renamed from: o */
    public View f175779o;

    /* renamed from: p */
    public FinderLiveShoppingPanel f175780p;

    /* renamed from: q */
    public FinderLiveFixClickIssueRecyclerView f175781q;

    /* renamed from: r */
    public final C13601g f175782r = C36568h.m40985a(new C61836p(this));

    /* renamed from: s */
    public final C13601g f175783s = C36568h.m40985a(new C61838r(this));

    /* renamed from: t */
    public FrameLayout f175784t;

    /* renamed from: u */
    public FrameLayout f175785u;

    /* renamed from: v */
    public TextView f175786v;

    /* renamed from: w */
    public View f175787w;

    /* renamed from: x */
    public RecyclerView f175788x;

    /* renamed from: y */
    public RecyclerView f175789y;

    /* renamed from: z */
    public View f175790z;

    /* renamed from: np1.a$a */
    public static final class C61818a extends C87413o implements C32227p<Boolean, C86299o, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61817a f175791d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61818a(C61817a aVar) {
            super(2);
            this.f175791d = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            ((Boolean) obj).booleanValue();
            C86299o oVar = (C86299o) obj2;
            if (oVar != null) {
                C61817a aVar = this.f175791d;
                C61881v.f175961a.mo86813e(oVar);
                C61817a.m72534c(aVar, oVar);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: np1.a$b */
    public static final class C61819b extends C87413o implements C32227p<Integer, C86299o, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61817a f175792d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61819b(C61817a aVar) {
            super(2);
            this.f175792d = aVar;
        }

        public Object invoke(Object obj, Object obj2) {
            int intValue = ((Number) obj).intValue();
            C86299o oVar = (C86299o) obj2;
            Class cls = C64916p1.class;
            C87412m.m108594g(oVar, "bundle");
            C61817a aVar = this.f175792d;
            C62660c cVar = aVar.f175776i;
            boolean z = cVar != null && cVar.mo82893g0();
            Log.m105924i("Finder.LiveShoppingListPlugin", "openHalfScreenMiniprogram isLandscape:" + z);
            if (z) {
                C62660c cVar2 = aVar.f175776i;
                if (cVar2 != null) {
                    C62660c.m73644Y0(cVar2, "PORTRAIT_ACTION_HALF_SCREEN_MINIPRO", oVar, 0, 4, (Object) null);
                }
            } else {
                aVar.mo86738E(oVar);
            }
            C86295k kVar = oVar.f250937i;
            C49712hj1 hj12 = null;
            C54789l6 l6Var = kVar instanceof C54789l6 ? (C54789l6) kVar : null;
            String p = C61926c.m72691p(l6Var != null ? l6Var.f153584e : 0);
            if (intValue == 1) {
                C64916p1 p1Var = (C64916p1) C86312j.m106911c(cls);
                C62660c cVar3 = this.f175792d.f175776i;
                C56032b z0 = cVar3 != null ? cVar3.mo14484z0() : null;
                FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = z0 instanceof FinderLiveVisitorPluginLayout ? (FinderLiveVisitorPluginLayout) z0 : null;
                if (finderLiveVisitorPluginLayout != null) {
                    hj12 = finderLiveVisitorPluginLayout.getReportObj();
                }
                p1Var.mo76728y(hj12, 18054, C62042e.m72804V(C62042e.f176370a, this.f175792d.f175774g, 28, p, 0, 8, (Object) null));
            } else if (intValue == 2) {
                C64916p1 p1Var2 = (C64916p1) C86312j.m106911c(cls);
                C62660c cVar4 = this.f175792d.f175776i;
                C56032b z05 = cVar4 != null ? cVar4.mo14484z0() : null;
                FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout2 = z05 instanceof FinderLiveVisitorPluginLayout ? (FinderLiveVisitorPluginLayout) z05 : null;
                if (finderLiveVisitorPluginLayout2 != null) {
                    hj12 = finderLiveVisitorPluginLayout2.getReportObj();
                }
                p1Var2.mo76728y(hj12, 18054, C62042e.m72804V(C62042e.f176370a, this.f175792d.f175774g, 27, p, 0, 8, (Object) null));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: np1.a$c */
    public static final class C61820c implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C61817a f175793d;

        public C61820c(C61817a aVar) {
            this.f175793d = aVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f175793d.mo86757n().setVisibility(8);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: np1.a$d */
    public static final class C61821d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C61817a f175794d;

        public C61821d(C61817a aVar) {
            this.f175794d = aVar;
        }

        public final void run() {
            FinderLiveShoppingPanel finderLiveShoppingPanel = this.f175794d.f175780p;
            if (finderLiveShoppingPanel != null) {
                finderLiveShoppingPanel.mo78802a();
            } else {
                C87412m.m108603p("contentGroup");
                throw null;
            }
        }
    }

    /* renamed from: np1.a$e */
    public static final class C61822e extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61817a f175795d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61822e(C61817a aVar) {
            super(1);
            this.f175795d = aVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                this.f175795d.mo86761q();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: np1.a$f */
    public static final class C61823f extends C87413o implements C32226l<Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61817a f175796d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61823f(C61817a aVar) {
            super(1);
            this.f175796d = aVar;
        }

        public Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            if (!this.f175796d.mo86766v()) {
                C54804r0 r0Var = C54804r0.f153631a;
                Context context = this.f175796d.f175772e.getContext();
                C87412m.m108593f(context, "root.context");
                r0Var.mo75761b(context, this.f175796d.f175774g, longValue);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: np1.a$g */
    public static final class C61824g implements RecyclerView.C16622o {

        /* renamed from: d */
        public final /* synthetic */ C61817a f175797d;

        public C61824g(C61817a aVar) {
            this.f175797d = aVar;
        }

        /* renamed from: c */
        public void mo126c(RecyclerView recyclerView, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$initListener$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V", this, array);
            C87412m.m108594g(recyclerView, "p0");
            C87412m.m108594g(motionEvent, "p1");
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$initListener$1", "androidx/recyclerview/widget/RecyclerView$OnItemTouchListener", "onTouchEvent", "(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V");
        }

        /* renamed from: d */
        public void mo127d(boolean z) {
        }

        /* renamed from: e */
        public boolean mo6022e(RecyclerView recyclerView, MotionEvent motionEvent) {
            C87412m.m108594g(recyclerView, "rv");
            C87412m.m108594g(motionEvent, "motionEvent");
            C61817a.m72532a(this.f175797d)[0] = (int) motionEvent.getRawX();
            C61817a.m72532a(this.f175797d)[1] = (int) motionEvent.getRawY();
            return false;
        }
    }

    /* renamed from: np1.a$h */
    public static final class C61825h extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61817a f175798d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61825h(C61817a aVar) {
            super(1);
            this.f175798d = aVar;
        }

        public Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                C61817a aVar = this.f175798d;
                FinderLiveShoppingPanel finderLiveShoppingPanel = aVar.f175780p;
                if (finderLiveShoppingPanel != null) {
                    finderLiveShoppingPanel.mo78805e(new C61856d(aVar));
                } else {
                    C87412m.m108603p("contentGroup");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: np1.a$i */
    public static final class C61826i extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61817a f175799d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61826i(C61817a aVar) {
            super(1);
            this.f175799d = aVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                C62660c cVar = this.f175799d.f175776i;
                boolean z = false;
                if (cVar != null && cVar.mo14483f0() == 0) {
                    z = true;
                }
                if (z) {
                    this.f175799d.mo86742I();
                    C62457g gVar = this.f175799d.f175778n;
                    if (gVar != null) {
                        gVar.mo87495b();
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: np1.a$j */
    public static final class C61827j extends C87413o implements C32226l<Boolean, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61817a f175800d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61827j(C61817a aVar) {
            super(1);
            this.f175800d = aVar;
        }

        public Object invoke(Object obj) {
            if (((Boolean) obj).booleanValue()) {
                this.f175800d.mo86761q();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: np1.a$k */
    public static final class C61828k extends C87413o implements C32228q<C62438f, View, Integer, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61817a f175801d;

        /* renamed from: e */
        public final /* synthetic */ C62084h f175802e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61828k(C61817a aVar, C62084h hVar) {
            super(3);
            this.f175801d = aVar;
            this.f175802e = hVar;
        }

        public Object invoke(Object obj, Object obj2, Object obj3) {
            C62438f fVar = (C62438f) obj;
            View view = (View) obj2;
            int intValue = ((Number) obj3).intValue();
            C87412m.m108594g(fVar, "holder");
            C87412m.m108594g(view, "itemView");
            if (C61817a.m72532a(this.f175801d)[0] == 0 || C61817a.m72532a(this.f175801d)[1] == 0) {
                view.getLocationOnScreen(C61817a.m72532a(this.f175801d));
            }
            C62084h hVar = this.f175802e;
            int i = C61817a.m72532a(this.f175801d)[0];
            int i2 = C61817a.m72532a(this.f175801d)[1];
            hVar.getClass();
            C0740i2 S5 = hVar.mo87156S5(intValue);
            if (S5 instanceof C63965x) {
                Log.m105924i("Finder.LiveShoppingListAdapter", "show popup menu,pos:" + intValue + ",desc:" + fVar.mo87486C().getText() + ",anchorPosX:" + i + ",anchorPosY:" + i2);
                hVar.mo87154Q5().mo108266a();
                hVar.mo87154Q5().mo108273h(view, new C62117x(hVar), new C62118y(hVar, S5), i, i2);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: np1.a$l */
    public static final class C61829l extends C87413o implements C32226l<Long, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C61817a f175803d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61829l(C61817a aVar) {
            super(1);
            this.f175803d = aVar;
        }

        public Object invoke(Object obj) {
            long longValue = ((Number) obj).longValue();
            if (!this.f175803d.mo86766v()) {
                C54804r0 r0Var = C54804r0.f153631a;
                Context context = this.f175803d.f175772e.getContext();
                C87412m.m108593f(context, "root.context");
                r0Var.mo75761b(context, this.f175803d.f175774g, longValue);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: np1.a$m */
    public static final class C61830m implements C62431d.C62433b {

        /* renamed from: a */
        public final /* synthetic */ C61817a f175804a;

        public C61830m(C61817a aVar) {
            this.f175804a = aVar;
        }

        /* renamed from: a */
        public void mo86776a() {
            this.f175804a.mo86748e();
            if (this.f175804a.mo86767w()) {
                ((C54116w) C86312j.m106911c(C54116w.class)).Ix0(2, 6, 0);
            }
        }

        /* renamed from: b */
        public void mo86777b() {
            String str;
            C61817a aVar = this.f175804a;
            Class cls = C54979h1.class;
            List<C0740i2> c3 = ((C54979h1) aVar.f175774g.mo71262a(cls)).mo75937c3();
            C62461j jVar = aVar.f175777j;
            if (jVar != null) {
                if (!((ArrayList) c3).isEmpty()) {
                    str = aVar.f175772e.getContext().getResources().getString(C0966R.string.e7q, new Object[]{Integer.valueOf(((C54979h1) aVar.f175774g.mo71262a(cls)).f154146u)});
                } else {
                    str = aVar.f175772e.getContext().getResources().getString(C0966R.string.e7p);
                }
                jVar.mo87513p(str);
                FinderLiveShoppingPanel finderLiveShoppingPanel = aVar.f175780p;
                if (finderLiveShoppingPanel != null) {
                    View findViewById = finderLiveShoppingPanel.findViewById(C0966R.C0970id.ngg);
                    if (findViewById != null) {
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar2.mo10233c(8);
                        View view = findViewById;
                        C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "animateShowCouponList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "animateShowCouponList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    C62461j jVar2 = aVar.f175777j;
                    if (jVar2 != null) {
                        jVar2.mo87514q(false);
                        C62075a aVar3 = aVar.f175762D;
                        aVar3.getClass();
                        aVar3.f176496o = false;
                        aVar3.f176494j.clear();
                        aVar3.f176494j.addAll(c3);
                        aVar3.mo87143u5();
                        aVar3.notifyDataSetChanged();
                        RecyclerView i = aVar.mo86752i();
                        C9556a aVar4 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar4.mo10233c(0);
                        RecyclerView recyclerView = i;
                        C117292a.m165358d(recyclerView, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "animateShowCouponList", "()V", "Undefined", "scrollToPosition", "(I)V");
                        i.mo17115r1(((Integer) aVar4.mo10231a(0)).intValue());
                        C117292a.m165359e(recyclerView, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "animateShowCouponList", "()V", "Undefined", "scrollToPosition", "(I)V");
                        aVar.mo86752i().setVisibility(0);
                        Log.m105924i("Finder.LiveShoppingListPlugin", "showSecondaryPage false");
                        C62461j jVar3 = aVar.f175777j;
                        if (jVar3 != null) {
                            View o = jVar3.mo87511o();
                            C9556a aVar5 = new C9556a();
                            aVar5.mo10233c(0);
                            View view2 = o;
                            C117292a.m165358d(view2, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showSecondaryPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            o.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showSecondaryPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            C62461j jVar4 = aVar.f175777j;
                            if (jVar4 != null) {
                                View i2 = jVar4.mo87505i();
                                C9556a aVar6 = new C9556a();
                                aVar6.mo10233c(8);
                                View view3 = i2;
                                C117292a.m165358d(view3, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showSecondaryPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                i2.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showSecondaryPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                C62461j jVar5 = aVar.f175777j;
                                if (jVar5 != null) {
                                    View j = jVar5.mo87506j();
                                    C9556a aVar7 = new C9556a();
                                    aVar7.mo10233c(8);
                                    View view4 = j;
                                    C117292a.m165358d(view4, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showSecondaryPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    j.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showSecondaryPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    C62461j jVar6 = aVar.f175777j;
                                    if (jVar6 != null) {
                                        View h = jVar6.mo87504h();
                                        C9556a aVar8 = new C9556a();
                                        aVar8.mo10233c(8);
                                        View view5 = h;
                                        C117292a.m165358d(view5, aVar8.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showSecondaryPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        h.setVisibility(((Integer) aVar8.mo10231a(0)).intValue());
                                        C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showSecondaryPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        C62461j jVar7 = aVar.f175777j;
                                        if (jVar7 != null) {
                                            View k = jVar7.mo87507k();
                                            C9556a aVar9 = new C9556a();
                                            aVar9.mo10233c(8);
                                            View view6 = k;
                                            C117292a.m165358d(view6, aVar9.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showSecondaryPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            k.setVisibility(((Integer) aVar9.mo10231a(0)).intValue());
                                            C117292a.m165359e(view6, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showSecondaryPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            C62461j jVar8 = aVar.f175777j;
                                            if (jVar8 != null) {
                                                jVar8.mo87503g().setImageResource(C0966R.raw.icons_filled_back);
                                                C62461j jVar9 = aVar.f175777j;
                                                if (jVar9 != null) {
                                                    jVar9.mo87503g().setRotation(0.0f);
                                                    C62461j jVar10 = aVar.f175777j;
                                                    if (jVar10 != null) {
                                                        jVar10.mo87502f().setBackground((Drawable) null);
                                                        aVar.mo86757n().setVisibility(0);
                                                        ViewGroup.LayoutParams layoutParams = aVar.mo86757n().getLayoutParams();
                                                        FinderLiveShoppingPanel finderLiveShoppingPanel2 = aVar.f175780p;
                                                        if (finderLiveShoppingPanel2 != null) {
                                                            int i3 = finderLiveShoppingPanel2.getLayoutParams().height;
                                                            C62461j jVar11 = aVar.f175777j;
                                                            if (jVar11 != null) {
                                                                layoutParams.height = (i3 - jVar11.mo87511o().getHeight()) - C76577a.m92155f(aVar.f175772e.getContext(), C0966R.dimen.f3766df);
                                                                ViewGroup.LayoutParams layoutParams2 = aVar.mo86752i().getLayoutParams();
                                                                FinderLiveShoppingPanel finderLiveShoppingPanel3 = aVar.f175780p;
                                                                if (finderLiveShoppingPanel3 != null) {
                                                                    int i4 = finderLiveShoppingPanel3.getLayoutParams().height;
                                                                    C62461j jVar12 = aVar.f175777j;
                                                                    if (jVar12 != null) {
                                                                        layoutParams2.height = (i4 - jVar12.mo87511o().getHeight()) - C75044y4.m89991c(aVar.f175772e.getContext());
                                                                        aVar.mo86757n().setTranslationX((float) aVar.mo86758o().getWidth());
                                                                        aVar.mo86757n().animate().setDuration(300).setInterpolator(new AccelerateDecelerateInterpolator()).translationX(0.0f).setListener((Animator.AnimatorListener) null).start();
                                                                        if (aVar.mo86767w()) {
                                                                            ((C54116w) C86312j.m106911c(C54116w.class)).Ix0(1, 3, 0);
                                                                            return;
                                                                        }
                                                                        return;
                                                                    }
                                                                    C87412m.m108603p("headerHolder");
                                                                    throw null;
                                                                }
                                                                C87412m.m108603p("contentGroup");
                                                                throw null;
                                                            }
                                                            C87412m.m108603p("headerHolder");
                                                            throw null;
                                                        }
                                                        C87412m.m108603p("contentGroup");
                                                        throw null;
                                                    }
                                                    C87412m.m108603p("headerHolder");
                                                    throw null;
                                                }
                                                C87412m.m108603p("headerHolder");
                                                throw null;
                                            }
                                            C87412m.m108603p("headerHolder");
                                            throw null;
                                        }
                                        C87412m.m108603p("headerHolder");
                                        throw null;
                                    }
                                    C87412m.m108603p("headerHolder");
                                    throw null;
                                }
                                C87412m.m108603p("headerHolder");
                                throw null;
                            }
                            C87412m.m108603p("headerHolder");
                            throw null;
                        }
                        C87412m.m108603p("headerHolder");
                        throw null;
                    }
                    C87412m.m108603p("headerHolder");
                    throw null;
                }
                C87412m.m108603p("contentGroup");
                throw null;
            }
            C87412m.m108603p("headerHolder");
            throw null;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0022, code lost:
            r6 = r6.f183575e;
         */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo86778c() {
            /*
                r8 = this;
                np1.a r0 = r8.f175804a
                r0.getClass()
                java.lang.Class<cl1.u> r1 = cl1.C55001u.class
                java.lang.Class<cl1.h1> r2 = cl1.C54979h1.class
                java.lang.Class<cl1.o> r3 = cl1.C54991o.class
                android.content.Intent r4 = new android.content.Intent
                r4.<init>()
                te3.v44 r5 = new te3.v44
                r5.<init>()
                fj1.b r6 = r0.f175774g
                androidx.lifecycle.i0 r6 = r6.mo71262a(r2)
                cl1.h1 r6 = (cl1.C54979h1) r6
                te3.i11 r6 = r6.f154139n
                r7 = 0
                if (r6 == 0) goto L_0x0029
                te3.jp1 r6 = r6.f183575e
                if (r6 == 0) goto L_0x0029
                java.lang.String r6 = r6.f136237d
                goto L_0x002a
            L_0x0029:
                r6 = r7
            L_0x002a:
                r5.f185838d = r6
                fj1.b r6 = r0.f175774g
                androidx.lifecycle.i0 r2 = r6.mo71262a(r2)
                cl1.h1 r2 = (cl1.C54979h1) r2
                te3.i11 r2 = r2.f154139n
                if (r2 == 0) goto L_0x003e
                te3.jp1 r2 = r2.f183575e
                if (r2 == 0) goto L_0x003e
                java.lang.String r7 = r2.f136238e
            L_0x003e:
                r5.f185839e = r7
                fj1.b r2 = r0.f175774g
                androidx.lifecycle.i0 r2 = r2.mo71262a(r1)
                cl1.u r2 = (cl1.C55001u) r2
                long r6 = r2.f154416j
                r5.f185840f = r6
                fj1.b r2 = r0.f175774g
                androidx.lifecycle.i0 r1 = r2.mo71262a(r1)
                cl1.u r1 = (cl1.C55001u) r1
                te3.c21 r1 = r1.f154420q
                long r1 = r1.f182392d
                r5.f185841g = r1
                fj1.b r1 = r0.f175774g
                androidx.lifecycle.i0 r1 = r1.mo71262a(r3)
                cl1.o r1 = (cl1.C54991o) r1
                java.lang.String r1 = r1.f154345o
                r5.f185842h = r1
                fj1.b r1 = r0.f175774g
                androidx.lifecycle.i0 r1 = r1.mo71262a(r3)
                cl1.o r1 = (cl1.C54991o) r1
                long r1 = r1.f154325i1
                java.lang.String r1 = java.lang.String.valueOf(r1)
                r5.f185843i = r1
                fj1.b r1 = r0.f175774g
                androidx.lifecycle.i0 r1 = r1.mo71262a(r3)
                cl1.o r1 = (cl1.C54991o) r1
                java.lang.String r1 = r1.f154318g2
                r5.f185844j = r1
                fj1.b r1 = r0.f175774g
                androidx.lifecycle.i0 r1 = r1.mo71262a(r3)
                cl1.o r1 = (cl1.C54991o) r1
                java.lang.String r1 = r1.f154203G1
                r5.f185845n = r1
                fj1.b r1 = r0.f175774g
                androidx.lifecycle.i0 r1 = r1.mo71262a(r3)
                cl1.o r1 = (cl1.C54991o) r1
                boolean r1 = r1.f154190D
                if (r1 == 0) goto L_0x009c
                r1 = 3
                goto L_0x009d
            L_0x009c:
                r1 = 1
            L_0x009d:
                r5.f185846o = r1
                byte[] r1 = r5.toByteArray()
                java.lang.String r2 = "KEY_PARAMS"
                r4.putExtra(r2, r1)
                op1.h r1 = r0.f175761C
                java.util.LinkedList<cm1.i2> r1 = r1.f176535i
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r1 = r1.iterator()
            L_0x00b5:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x00c7
                java.lang.Object r3 = r1.next()
                boolean r5 = r3 instanceof sk1.C63965x
                if (r5 == 0) goto L_0x00b5
                r2.add(r3)
                goto L_0x00b5
            L_0x00c7:
                java.util.ArrayList r1 = new java.util.ArrayList
                r3 = 10
                int r3 = sx3.C36907w.m41090l(r2, r3)
                r1.<init>(r3)
                java.util.Iterator r2 = r2.iterator()
            L_0x00d6:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L_0x00ec
                java.lang.Object r3 = r2.next()
                sk1.x r3 = (sk1.C63965x) r3
                te3.fp1 r3 = r3.f181346s
                byte[] r3 = r3.toByteArray()
                r1.add(r3)
                goto L_0x00d6
            L_0x00ec:
                java.lang.String r2 = "KEY_PRODUCTLIST"
                r4.putExtra(r2, r1)
                java.lang.Class<tf0.o1> r1 = tf0.C13883o1.class
                di3.d r1 = di3.C86312j.m106911c(r1)
                tf0.o1 r1 = (tf0.C13883o1) r1
                android.view.ViewGroup r0 = r0.f175772e
                android.content.Context r0 = r0.getContext()
                java.lang.String r2 = "null cannot be cast to non-null type android.app.Activity"
                gy3.C87412m.m108592e(r0, r2)
                android.app.Activity r0 = (android.app.Activity) r0
                r2 = 1013(0x3f5, float:1.42E-42)
                r1.mo13274YX(r0, r4, r2)
                np1.a r0 = r8.f175804a
                boolean r0 = r0.mo86767w()
                if (r0 == 0) goto L_0x0121
                java.lang.Class<ak1.w> r0 = ak1.C54116w.class
                di3.d r0 = di3.C86312j.m106911c(r0)
                ak1.w r0 = (ak1.C54116w) r0
                r1 = 2
                r2 = 5
                r3 = 0
                r0.Ix0(r1, r2, r3)
            L_0x0121:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: np1.C61817a.C61830m.mo86778c():void");
        }
    }

    /* renamed from: np1.a$n */
    public static final class C61831n implements FinderLiveShoppingCouponView.C3609a {

        /* renamed from: a */
        public final /* synthetic */ C61817a f175805a;

        /* renamed from: np1.a$n$a */
        public static final class C61832a extends C87413o implements C32230s<Boolean, Integer, Integer, String, C49366f21, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C61817a f175806d;

            /* renamed from: e */
            public final /* synthetic */ boolean f175807e;

            /* renamed from: f */
            public final /* synthetic */ C13696v f175808f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C61832a(C61817a aVar, boolean z, C13696v vVar) {
                super(5);
                this.f175806d = aVar;
                this.f175807e = z;
                this.f175808f = vVar;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:9:0x0059, code lost:
                r2 = ((cl1.C54979h1) r2.mo71262a(r5)).f154113E;
             */
            /* renamed from: D */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object mo237D(java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, java.lang.Object r5, java.lang.Object r6) {
                /*
                    r1 = this;
                    java.lang.Boolean r2 = (java.lang.Boolean) r2
                    boolean r2 = r2.booleanValue()
                    java.lang.Number r3 = (java.lang.Number) r3
                    r3.intValue()
                    java.lang.Number r4 = (java.lang.Number) r4
                    int r3 = r4.intValue()
                    java.lang.String r5 = (java.lang.String) r5
                    te3.f21 r6 = (te3.C49366f21) r6
                    java.lang.Class<cl1.f1> r4 = cl1.C54974f1.class
                    java.lang.Class<cl1.h1> r5 = cl1.C54979h1.class
                    r6 = 1
                    r0 = 0
                    if (r2 != 0) goto L_0x0051
                    r2 = -200187(0xfffffffffffcf205, float:NaN)
                    if (r3 == r2) goto L_0x0051
                    java.lang.String r2 = "Finder.LiveShoppingListPlugin"
                    java.lang.String r4 = "issue coupon failed"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r4)
                    np1.a r2 = r1.f175806d
                    android.view.ViewGroup r2 = r2.f175772e
                    android.content.Context r2 = r2.getContext()
                    np1.a r4 = r1.f175806d
                    android.view.ViewGroup r4 = r4.f175772e
                    android.content.Context r4 = r4.getContext()
                    android.content.res.Resources r4 = r4.getResources()
                    r5 = 2131828818(0x7f112052, float:1.9290588E38)
                    java.lang.Object[] r6 = new java.lang.Object[r6]
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r6[r0] = r3
                    java.lang.String r3 = r4.getString(r5, r6)
                    nj3.C76912y0.m92767f(r2, r3)
                    goto L_0x0101
                L_0x0051:
                    boolean r2 = r1.f175807e
                    if (r2 == 0) goto L_0x00a9
                    fj1.b r2 = fj1.C45795b.f123698n
                    if (r2 == 0) goto L_0x0069
                    androidx.lifecycle.i0 r2 = r2.mo71262a(r5)
                    cl1.h1 r2 = (cl1.C54979h1) r2
                    te3.gj1 r2 = r2.f154113E
                    if (r2 == 0) goto L_0x0069
                    int r2 = r2.f183343d
                    if (r2 != r6) goto L_0x0069
                    r2 = 1
                    goto L_0x006a
                L_0x0069:
                    r2 = 0
                L_0x006a:
                    if (r2 == 0) goto L_0x00a9
                    com.tencent.mm.plugin.finder.live.model.FinderLiveService r2 = com.tencent.p014mm.plugin.finder.live.model.FinderLiveService.f159376d
                    androidx.lifecycle.i0 r3 = r2.mo77630e(r5)
                    cl1.h1 r3 = (cl1.C54979h1) r3
                    if (r3 == 0) goto L_0x007f
                    te3.gj1 r3 = r3.f154113E
                    if (r3 == 0) goto L_0x007f
                    int r3 = r3.f183344e
                    if (r3 != 0) goto L_0x007f
                    goto L_0x0080
                L_0x007f:
                    r6 = 0
                L_0x0080:
                    if (r6 == 0) goto L_0x00a9
                    androidx.lifecycle.i0 r3 = r2.mo77630e(r4)
                    cl1.f1 r3 = (cl1.C54974f1) r3
                    if (r3 == 0) goto L_0x00a9
                    te3.fp1 r3 = r3.f154098g
                    if (r3 == 0) goto L_0x00a9
                    np1.a r6 = r1.f175806d
                    androidx.lifecycle.i0 r2 = r2.mo77630e(r4)
                    cl1.f1 r2 = (cl1.C54974f1) r2
                    if (r2 != 0) goto L_0x0099
                    goto L_0x009d
                L_0x0099:
                    r4 = 0
                    r2.mo75934c3(r4)
                L_0x009d:
                    te3.yh3 r2 = r3.f183160E
                    if (r2 != 0) goto L_0x00a2
                    goto L_0x00a4
                L_0x00a2:
                    r2.f186537i = r0
                L_0x00a4:
                    op1.h r2 = r6.f175761C
                    r2.notifyDataSetChanged()
                L_0x00a9:
                    sk1.v r2 = r1.f175808f
                    boolean r3 = r1.f175807e
                    r2.f38758E = r3
                    np1.a r3 = r1.f175806d
                    op1.a r3 = r3.f175762D
                    r3.mo87141O4(r2)
                    np1.a r2 = r1.f175806d
                    fj1.b r2 = r2.f175774g
                    androidx.lifecycle.i0 r2 = r2.mo71262a(r5)
                    cl1.h1 r2 = (cl1.C54979h1) r2
                    p40.a<cm1.i2> r2 = r2.f154140o
                    boolean r3 = r1.f175807e
                    np1.a r4 = r1.f175806d
                    if (r3 == 0) goto L_0x00f3
                    np1.f r3 = np1.C61860f.f175896d
                    r2.getClass()
                    java.lang.String r5 = "action"
                    gy3.C87412m.m108594g(r3, r5)
                    java.util.List<E> r5 = r2.f127225a
                    java.lang.String r6 = "list"
                    gy3.C87412m.m108593f(r5, r6)
                    monitor-enter(r5)
                    java.util.Iterator r6 = r5.iterator()     // Catch:{ all -> 0x00f0 }
                L_0x00de:
                    boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00f0 }
                    if (r0 == 0) goto L_0x00ec
                    java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x00f0 }
                    r3.invoke(r0)     // Catch:{ all -> 0x00f0 }
                    goto L_0x00de
                L_0x00ec:
                    rx3.b0 r3 = rx3.C13598b0.f38549a     // Catch:{ all -> 0x00f0 }
                    monitor-exit(r5)
                    goto L_0x00f3
                L_0x00f0:
                    r2 = move-exception
                    monitor-exit(r5)
                    throw r2
                L_0x00f3:
                    op1.h r3 = r4.f175761C
                    r3.mo87166c6(r2)
                    boolean r2 = r1.f175807e
                    if (r2 == 0) goto L_0x0101
                    np1.a r2 = r1.f175806d
                    r2.mo86768x()
                L_0x0101:
                    rx3.b0 r2 = rx3.C13598b0.f38549a
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: np1.C61817a.C61831n.C61832a.mo237D(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        }

        /* renamed from: np1.a$n$b */
        public static final class C61833b extends C87413o implements C32226l<Boolean, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C61817a f175809d;

            /* renamed from: e */
            public final /* synthetic */ C13696v f175810e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C61833b(C61817a aVar, C13696v vVar) {
                super(1);
                this.f175809d = aVar;
                this.f175810e = vVar;
            }

            public Object invoke(Object obj) {
                C61926c.m72668M(new C61862g(this.f175809d, ((Boolean) obj).booleanValue(), this.f175810e));
                return C13598b0.f38549a;
            }
        }

        /* renamed from: np1.a$n$c */
        public static final class C61834c extends C87413o implements C32227p<Boolean, C51203s61, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C61817a f175811d;

            /* renamed from: e */
            public final /* synthetic */ C13696v f175812e;

            /* renamed from: f */
            public final /* synthetic */ FinderLiveShoppingCouponView f175813f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C61834c(C61817a aVar, C13696v vVar, FinderLiveShoppingCouponView finderLiveShoppingCouponView) {
                super(2);
                this.f175811d = aVar;
                this.f175812e = vVar;
                this.f175813f = finderLiveShoppingCouponView;
            }

            public Object invoke(Object obj, Object obj2) {
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C51203s61 s612 = (C51203s61) obj2;
                C62042e eVar = C62042e.f176370a;
                Context context = this.f175811d.f175772e.getContext();
                C87412m.m108593f(context, "root.context");
                eVar.mo87047U1(context, false);
                ((C54116w) C86312j.m106911c(C54116w.class)).Tx0(C54067f0.C54081r0.CommerceActionCouponClick, this.f175812e, booleanValue ? "0" : "1");
                C13696v vVar = this.f175812e;
                Integer num = null;
                String str = s612 != null ? s612.f141341e : null;
                int i = s612 != null ? s612.f141342f : 0;
                if (s612 != null) {
                    num = Integer.valueOf(s612.f141343g);
                }
                vVar.mo13078l(str, i, num);
                Log.m105924i("Finder.LiveShoppingListPlugin", "receive coupon success: " + this.f175812e);
                this.f175813f.mo3995b(this.f175812e, false, false);
                this.f175811d.mo86747O();
                if (!booleanValue) {
                    Log.m105924i("Finder.LiveShoppingListPlugin", "receive coupon failed");
                } else {
                    C13696v vVar2 = this.f175812e;
                    Context context2 = this.f175811d.f175772e.getContext();
                    C87412m.m108593f(context2, "root.context");
                    vVar2.mo13077k(context2);
                    this.f175811d.f175762D.mo87141O4(this.f175812e);
                    C61817a aVar = this.f175811d;
                    aVar.f175761C.mo87166c6(((C54979h1) aVar.f175774g.mo71262a(C54979h1.class)).f154140o);
                }
                return C13598b0.f38549a;
            }
        }

        public C61831n(C61817a aVar) {
            this.f175805a = aVar;
        }

        /* renamed from: a */
        public void mo4000a(C13696v vVar, FinderLiveShoppingCouponView finderLiveShoppingCouponView) {
            C13696v vVar2 = vVar;
            FinderLiveShoppingCouponView finderLiveShoppingCouponView2 = finderLiveShoppingCouponView;
            Class cls = C54991o.class;
            Class cls2 = C55001u.class;
            Class cls3 = C54116w.class;
            C87412m.m108594g(vVar2, "item");
            C87412m.m108594g(finderLiveShoppingCouponView2, "view");
            int i = 1;
            String str = "";
            if (this.f175805a.mo86766v()) {
                boolean z = !vVar2.f38758E;
                if (this.f175805a.mo86767w()) {
                    ((C54116w) C86312j.m106911c(cls3)).Ix0(1, 4, 0);
                } else {
                    C61865h0.f175908a.mo86790a(this.f175805a.f175774g, z);
                }
                C61817a aVar = this.f175805a;
                C54795n5 n5Var = aVar.f175775h;
                if (n5Var != null) {
                    Context context = aVar.f175772e.getContext();
                    C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    MMActivity mMActivity = (MMActivity) context;
                    String str2 = vVar2.f38763u;
                    if (str2 != null) {
                        str = str2;
                    }
                    if (!z) {
                        i = 2;
                    }
                    n5Var.mo75753u(mMActivity, str, i, new C61832a(this.f175805a, z, vVar2));
                    return;
                }
                return;
            }
            C7335d c = C86312j.m106911c(cls3);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            ((C54116w) c).Tx0(C54067f0.C54081r0.CommerceActionCouponHalfPageClick, vVar2, (String) null);
            int i2 = vVar2.f38761s.f142892B;
            if (i2 == 1) {
                C62042e eVar = C62042e.f176370a;
                Context context2 = this.f175805a.f175772e.getContext();
                C87412m.m108593f(context2, "root.context");
                eVar.mo87047U1(context2, true);
                C61817a aVar2 = this.f175805a;
                C54795n5 n5Var2 = aVar2.f175775h;
                if (n5Var2 != null) {
                    Context context3 = aVar2.f175772e.getContext();
                    C87412m.m108592e(context3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    n5Var2.mo75746n((MMActivity) context3, ((C55001u) this.f175805a.f175774g.mo71262a(cls2)).f154420q.f182392d, ((C55001u) this.f175805a.f175774g.mo71262a(cls2)).f154416j, ((C54991o) this.f175805a.f175774g.mo71262a(cls)).f154345o, ((C55001u) this.f175805a.f175774g.mo71262a(cls2)).f154417n, vVar2.f38763u, 3, ((C54991o) this.f175805a.f175774g.mo71262a(cls)).f154357q3, new C61833b(this.f175805a, vVar2));
                }
            } else if (i2 == 2) {
                C62042e eVar2 = C62042e.f176370a;
                Context context4 = this.f175805a.f175772e.getContext();
                C87412m.m108593f(context4, "root.context");
                eVar2.mo87047U1(context4, true);
                C61817a aVar3 = this.f175805a;
                C54795n5 n5Var3 = aVar3.f175775h;
                if (n5Var3 != null) {
                    Context context5 = aVar3.f175772e.getContext();
                    C87412m.m108592e(context5, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    MMActivity mMActivity2 = (MMActivity) context5;
                    LinkedList linkedList = new LinkedList();
                    String str3 = vVar2.f38763u;
                    if (str3 != null) {
                        str = str3;
                    }
                    linkedList.add(str);
                    C13598b0 b0Var = C13598b0.f38549a;
                    n5Var3.mo75757y(mMActivity2, linkedList, true, new C61834c(this.f175805a, vVar2, finderLiveShoppingCouponView2));
                }
            } else if (i2 == 3) {
                this.f175805a.mo86760p(true, true);
                ((C54116w) C86312j.m106911c(cls3)).Tx0(C54067f0.C54081r0.CommerceActionCouponClick, vVar2, "0");
            }
        }
    }

    /* renamed from: np1.a$o */
    public static final class C61835o extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C61817a f175814d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61835o(C61817a aVar) {
            super(0);
            this.f175814d = aVar;
        }

        public Object invoke() {
            return Boolean.valueOf(C62042e.f176370a.mo87027N0() || ((C54991o) this.f175814d.f175774g.mo71262a(C54991o.class)).f154190D);
        }
    }

    /* renamed from: np1.a$p */
    public static final class C61836p extends C87413o implements C32224a<ProgressBar> {

        /* renamed from: d */
        public final /* synthetic */ C61817a f175815d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61836p(C61817a aVar) {
            super(0);
            this.f175815d = aVar;
        }

        public Object invoke() {
            return (ProgressBar) this.f175815d.f175772e.findViewById(C0966R.C0970id.f358230dz1);
        }
    }

    /* renamed from: np1.a$q */
    public static final class C61837q implements C47826f.C47827a {

        /* renamed from: a */
        public final /* synthetic */ C61817a f175816a;

        public C61837q(C61817a aVar) {
            this.f175816a = aVar;
        }

        /* renamed from: a */
        public void mo9151a(int i, long j, C50415mk1 mk12) {
        }

        /* renamed from: b */
        public void mo9152b(int i, int i2, String str, int i3, C50415mk1 mk12) {
        }

        /* renamed from: c */
        public void mo9153c(int i, long j) {
            this.f175816a.f175765G = true;
            Log.m105924i("Finder.LiveShoppingListPlugin", "notify visitor shopping success times:" + this.f175816a.f175764F);
        }

        /* renamed from: d */
        public void mo9154d(int i, int i2, String str, int i3) {
            Log.m105924i("Finder.LiveShoppingListPlugin", "notify visitor shopping fail times:" + this.f175816a.f175764F);
            this.f175816a.mo86768x();
        }
    }

    /* renamed from: np1.a$r */
    public static final class C61838r extends C87413o implements C32224a<TextView> {

        /* renamed from: d */
        public final /* synthetic */ C61817a f175817d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61838r(C61817a aVar) {
            super(0);
            this.f175817d = aVar;
        }

        public Object invoke() {
            TextView textView = (TextView) this.f175817d.f175772e.findViewById(C0966R.C0970id.dz6);
            textView.setOnClickListener(this.f175817d);
            return textView;
        }
    }

    /* renamed from: np1.a$s */
    public static final class C61839s implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C61817a f175818d;

        public C61839s(C61817a aVar) {
            this.f175818d = aVar;
        }

        public final void run() {
            FinderLiveShoppingPanel finderLiveShoppingPanel = this.f175818d.f175780p;
            if (finderLiveShoppingPanel != null) {
                finderLiveShoppingPanel.mo78804d();
            } else {
                C87412m.m108603p("contentGroup");
                throw null;
            }
        }
    }

    /* renamed from: np1.a$t */
    public static final class C61840t implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C61817a f175819d;

        public C61840t(C61817a aVar) {
            this.f175819d = aVar;
        }

        public final void run() {
            FinderLiveShoppingPanel finderLiveShoppingPanel = this.f175819d.f175780p;
            if (finderLiveShoppingPanel != null) {
                finderLiveShoppingPanel.mo78804d();
            } else {
                C87412m.m108603p("contentGroup");
                throw null;
            }
        }
    }

    /* renamed from: np1.a$u */
    public static final class C61841u implements ViewTreeObserver.OnGlobalLayoutListener {

        /* renamed from: d */
        public final /* synthetic */ C61817a f175820d;

        /* renamed from: e */
        public final /* synthetic */ int f175821e;

        public C61841u(C61817a aVar, int i) {
            this.f175820d = aVar;
            this.f175821e = i;
        }

        public void onGlobalLayout() {
            this.f175820d.mo86758o().getViewTreeObserver().removeOnGlobalLayoutListener(this);
            C61817a aVar = this.f175820d;
            if (!aVar.f175766H) {
                int indexOf = aVar.f175761C.f176539p.indexOf(2) + this.f175821e;
                RecyclerView.LayoutManager layoutManager = this.f175820d.mo86758o().getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    aVar2.mo10233c(Integer.valueOf(indexOf));
                    C117292a.m165358d(linearLayoutManager, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$showProductList$1", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    linearLayoutManager.mo16973V(((Integer) aVar2.mo10231a(0)).intValue(), ((Integer) aVar2.mo10231a(1)).intValue());
                    C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal$showProductList$1", "onGlobalLayout", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                }
                Log.m105924i("Finder.LiveShoppingListPlugin", "showProductList size:" + this.f175820d.f175761C.f176535i.size() + ",scrollToPosition:" + this.f175821e + ", realPos: " + indexOf);
                this.f175820d.f175766H = true;
            }
        }
    }

    @C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.FinderLiveShoppingListInternal$showShoppingContent$1", mo125469f = "FinderLiveShoppingListInternal.kt", mo125470l = {697, 1482, 1489}, mo125471m = "invokeSuspend")
    /* renamed from: np1.a$v */
    public static final class C61842v extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

        /* renamed from: d */
        public Object f175822d;

        /* renamed from: e */
        public Object f175823e;

        /* renamed from: f */
        public int f175824f;

        /* renamed from: g */
        public final /* synthetic */ C61817a f175825g;

        /* renamed from: h */
        public final /* synthetic */ int f175826h;

        /* renamed from: i */
        public final /* synthetic */ boolean f175827i;

        /* renamed from: j */
        public final /* synthetic */ Bundle f175828j;

        /* renamed from: n */
        public final /* synthetic */ boolean f175829n;

        /* renamed from: np1.a$v$a */
        public static final class C61843a extends C87413o implements C32226l<C49778i01, C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C45795b f175830d;

            /* renamed from: e */
            public final /* synthetic */ C61817a f175831e;

            /* renamed from: f */
            public final /* synthetic */ boolean f175832f;

            /* renamed from: g */
            public final /* synthetic */ Bundle f175833g;

            /* renamed from: h */
            public final /* synthetic */ boolean f175834h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C61843a(C45795b bVar, C61817a aVar, boolean z, Bundle bundle, boolean z2) {
                super(1);
                this.f175830d = bVar;
                this.f175831e = aVar;
                this.f175832f = z;
                this.f175833g = bundle;
                this.f175834h = z2;
            }

            public Object invoke(Object obj) {
                C89349b bVar;
                C49778i01 i012 = (C49778i01) obj;
                if (!(((C54979h1) this.f175830d.mo71262a(C54979h1.class)).f154143r || i012 == null || (bVar = i012.f134996e) == null)) {
                    C61817a aVar = this.f175831e;
                    boolean z = this.f175832f;
                    Bundle bundle = this.f175833g;
                    boolean z2 = this.f175834h;
                    C64434i11 i112 = new C64434i11();
                    i112.parseFrom(bVar.mo123703f());
                    C61817a.m72535d(aVar, z, bundle, z2, i112);
                }
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.FinderLiveShoppingListInternal$showShoppingContent$1$2$1", mo125469f = "FinderLiveShoppingListInternal.kt", mo125470l = {699}, mo125471m = "invokeSuspend")
        /* renamed from: np1.a$v$b */
        public static final class C61844b extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f175835d;

            /* renamed from: e */
            public final /* synthetic */ C61817a f175836e;

            /* renamed from: f */
            public final /* synthetic */ C64434i11 f175837f;

            /* renamed from: g */
            public final /* synthetic */ C8479f0<C53973z1> f175838g;

            /* renamed from: h */
            public final /* synthetic */ boolean f175839h;

            /* renamed from: i */
            public final /* synthetic */ Bundle f175840i;

            /* renamed from: j */
            public final /* synthetic */ boolean f175841j;

            /* renamed from: np1.a$v$b$a */
            public static final class C61845a<T> implements C45253g {

                /* renamed from: d */
                public final /* synthetic */ C64434i11 f175842d;

                /* renamed from: e */
                public final /* synthetic */ C8479f0<C53973z1> f175843e;

                /* renamed from: f */
                public final /* synthetic */ C61817a f175844f;

                /* renamed from: g */
                public final /* synthetic */ boolean f175845g;

                /* renamed from: h */
                public final /* synthetic */ Bundle f175846h;

                /* renamed from: i */
                public final /* synthetic */ boolean f175847i;

                public C61845a(C64434i11 i112, C8479f0<C53973z1> f0Var, C61817a aVar, boolean z, Bundle bundle, boolean z2) {
                    this.f175842d = i112;
                    this.f175843e = f0Var;
                    this.f175844f = aVar;
                    this.f175845g = z;
                    this.f175846h = bundle;
                    this.f175847i = z2;
                }

                public Object emit(Object obj, C15601d dVar) {
                    if (((Boolean) obj).booleanValue()) {
                        C61817a.m72535d(this.f175844f, this.f175845g, this.f175846h, this.f175847i, this.f175842d);
                        C53973z1 z1Var = (C53973z1) this.f175843e.f27484d;
                        if (z1Var != null) {
                            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                        }
                    }
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C61844b(C61817a aVar, C64434i11 i112, C8479f0<C53973z1> f0Var, boolean z, Bundle bundle, boolean z2, C15601d<? super C61844b> dVar) {
                super(2, dVar);
                this.f175836e = aVar;
                this.f175837f = i112;
                this.f175838g = f0Var;
                this.f175839h = z;
                this.f175840i = bundle;
                this.f175841j = z2;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C61844b(this.f175836e, this.f175837f, this.f175838g, this.f175839h, this.f175840i, this.f175841j, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                ((C61844b) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                return C15911a.COROUTINE_SUSPENDED;
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f175835d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C58087u0<Boolean> u0Var = ((C54979h1) this.f175836e.f175774g.mo71262a(C54979h1.class)).f154129V;
                    C61845a aVar2 = new C61845a(this.f175837f, this.f175838g, this.f175836e, this.f175839h, this.f175840i, this.f175841j);
                    this.f175835d = 1;
                    if (((C58052j1) u0Var).mo31880a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                throw new C13600d();
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.FinderLiveShoppingListInternal$showShoppingContent$1$3$1", mo125469f = "FinderLiveShoppingListInternal.kt", mo125470l = {709}, mo125471m = "invokeSuspend")
        /* renamed from: np1.a$v$c */
        public static final class C61846c extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public int f175848d;

            /* renamed from: e */
            public final /* synthetic */ C61817a f175849e;

            /* renamed from: f */
            public final /* synthetic */ boolean f175850f;

            /* renamed from: g */
            public final /* synthetic */ C8479f0<C53973z1> f175851g;

            /* renamed from: np1.a$v$c$a */
            public static final class C61847a<T> implements C45253g {

                /* renamed from: d */
                public final /* synthetic */ C61817a f175852d;

                /* renamed from: e */
                public final /* synthetic */ boolean f175853e;

                /* renamed from: f */
                public final /* synthetic */ C8479f0<C53973z1> f175854f;

                public C61847a(C61817a aVar, boolean z, C8479f0<C53973z1> f0Var) {
                    this.f175852d = aVar;
                    this.f175853e = z;
                    this.f175854f = f0Var;
                }

                public Object emit(Object obj, C15601d dVar) {
                    if (((Boolean) obj).booleanValue()) {
                        if (this.f175852d.f175776i.mo14483f0() == 0 || this.f175852d.mo86765u(this.f175853e)) {
                            C61817a aVar = this.f175852d;
                            if (aVar.mo86765u(this.f175853e)) {
                                aVar.mo86741H();
                            }
                            aVar.mo86756m().setVisibility(0);
                            aVar.mo86755l().setVisibility(8);
                            C62461j jVar = aVar.f175777j;
                            if (jVar != null) {
                                View o = jVar.mo87511o();
                                C9556a aVar2 = new C9556a();
                                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                aVar2.mo10233c(8);
                                C117292a.m165358d(o, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "onGetShoppingListFail", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                o.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                C117292a.m165359e(o, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "onGetShoppingListFail", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                aVar.mo86758o().setVisibility(8);
                                C62457g gVar = aVar.f175778n;
                                if (gVar != null) {
                                    gVar.mo87494a(false, aVar.mo86766v());
                                }
                                Log.m105924i("Finder.LiveShoppingListPlugin", "onGetShoppingListFail");
                                C62461j jVar2 = this.f175852d.f175777j;
                                if (jVar2 != null) {
                                    jVar2.mo87498b();
                                } else {
                                    C87412m.m108603p("headerHolder");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("headerHolder");
                                throw null;
                            }
                        }
                        C53973z1 z1Var = (C53973z1) this.f175854f.f27484d;
                        if (z1Var != null) {
                            C53973z1.C53974a.m60623a(z1Var, (CancellationException) null, 1, (Object) null);
                        }
                    }
                    return C13598b0.f38549a;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C61846c(C61817a aVar, boolean z, C8479f0<C53973z1> f0Var, C15601d<? super C61846c> dVar) {
                super(2, dVar);
                this.f175849e = aVar;
                this.f175850f = z;
                this.f175851g = f0Var;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C61846c(this.f175849e, this.f175850f, this.f175851g, dVar);
            }

            public Object invoke(Object obj, Object obj2) {
                ((C61846c) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
                return C15911a.COROUTINE_SUSPENDED;
            }

            public final Object invokeSuspend(Object obj) {
                C15911a aVar = C15911a.COROUTINE_SUSPENDED;
                int i = this.f175848d;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    C58087u0<Boolean> u0Var = ((C54979h1) this.f175849e.f175774g.mo71262a(C54979h1.class)).f154129V;
                    C61847a aVar2 = new C61847a(this.f175849e, this.f175850f, this.f175851g);
                    this.f175848d = 1;
                    if (((C58052j1) u0Var).mo31880a(aVar2, this) == aVar) {
                        return aVar;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                throw new C13600d();
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.FinderLiveShoppingListInternal$showShoppingContent$1$invokeSuspend$$inlined$fail$default$1", mo125469f = "FinderLiveShoppingListInternal.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: np1.a$v$d */
        public static final class C61848d extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C0287e f175855d;

            /* renamed from: e */
            public final /* synthetic */ C8479f0 f175856e;

            /* renamed from: f */
            public final /* synthetic */ C61817a f175857f;

            /* renamed from: g */
            public final /* synthetic */ boolean f175858g;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C61848d(C0287e eVar, C15601d dVar, C8479f0 f0Var, C61817a aVar, boolean z) {
                super(2, dVar);
                this.f175855d = eVar;
                this.f175856e = f0Var;
                this.f175857f = aVar;
                this.f175858g = z;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C61848d(this.f175855d, dVar, this.f175856e, this.f175857f, this.f175858g);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C61848d) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C0280a aVar = (C0280a) ((C0281b) this.f175855d).f843b;
                C8479f0 f0Var = this.f175856e;
                C61817a aVar2 = this.f175857f;
                C62660c cVar = aVar2.f175776i;
                C53896h0 h0Var = C53872d1.f151117a;
                f0Var.f27484d = C11207i.m11072h(cVar, C58901s.f168555a, (C53934p0) null, new C61846c(aVar2, this.f175858g, f0Var, (C15601d<? super C61846c>) null), 2, (Object) null);
                return C13598b0.f38549a;
            }
        }

        @C91590f(mo125468c = "com.tencent.mm.plugin.finder.shopping.FinderLiveShoppingListInternal$showShoppingContent$1$invokeSuspend$$inlined$success$default$1", mo125469f = "FinderLiveShoppingListInternal.kt", mo125470l = {}, mo125471m = "invokeSuspend")
        /* renamed from: np1.a$v$e */
        public static final class C61849e extends C91594j implements C32227p<C0000n0, C15601d<? super C13598b0>, Object> {

            /* renamed from: d */
            public final /* synthetic */ C0287e f175859d;

            /* renamed from: e */
            public final /* synthetic */ C8479f0 f175860e;

            /* renamed from: f */
            public final /* synthetic */ C61817a f175861f;

            /* renamed from: g */
            public final /* synthetic */ boolean f175862g;

            /* renamed from: h */
            public final /* synthetic */ Bundle f175863h;

            /* renamed from: i */
            public final /* synthetic */ boolean f175864i;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C61849e(C0287e eVar, C15601d dVar, C8479f0 f0Var, C61817a aVar, boolean z, Bundle bundle, boolean z2) {
                super(2, dVar);
                this.f175859d = eVar;
                this.f175860e = f0Var;
                this.f175861f = aVar;
                this.f175862g = z;
                this.f175863h = bundle;
                this.f175864i = z2;
            }

            public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
                return new C61849e(this.f175859d, dVar, this.f175860e, this.f175861f, this.f175862g, this.f175863h, this.f175864i);
            }

            public Object invoke(Object obj, Object obj2) {
                return ((C61849e) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
            }

            public final Object invokeSuspend(Object obj) {
                ResultKt.throwOnFailure(obj);
                C8479f0 f0Var = this.f175860e;
                C61817a aVar = this.f175861f;
                C62660c cVar = aVar.f175776i;
                C53896h0 h0Var = C53872d1.f151117a;
                f0Var.f27484d = C11207i.m11072h(cVar, C58901s.f168555a, (C53934p0) null, new C61844b(aVar, (C64434i11) ((C0288f) this.f175859d).f855b, f0Var, this.f175862g, this.f175863h, this.f175864i, (C15601d<? super C61844b>) null), 2, (Object) null);
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61842v(C61817a aVar, int i, boolean z, Bundle bundle, boolean z2, C15601d<? super C61842v> dVar) {
            super(2, dVar);
            this.f175825g = aVar;
            this.f175826h = i;
            this.f175827i = z;
            this.f175828j = bundle;
            this.f175829n = z2;
        }

        public final C15601d<C13598b0> create(Object obj, C15601d<?> dVar) {
            return new C61842v(this.f175825g, this.f175826h, this.f175827i, this.f175828j, this.f175829n, dVar);
        }

        public Object invoke(Object obj, Object obj2) {
            return ((C61842v) create((C0000n0) obj, (C15601d) obj2)).invokeSuspend(C13598b0.f38549a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:43:0x0196  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r34) {
            /*
                r33 = this;
                r0 = r33
                java.lang.Class<cl1.o> r1 = cl1.C54991o.class
                java.lang.Class<cl1.u> r2 = cl1.C55001u.class
                java.lang.Class<cl1.h1> r3 = cl1.C54979h1.class
                xx3.a r4 = xx3.C15911a.COROUTINE_SUSPENDED
                int r5 = r0.f175824f
                r6 = 3
                r7 = 1
                r8 = 2
                if (r5 == 0) goto L_0x0041
                if (r5 == r7) goto L_0x0035
                if (r5 == r8) goto L_0x0028
                if (r5 != r6) goto L_0x0020
                java.lang.Object r1 = r0.f175822d
                bi1.e r1 = (bi1.C0287e) r1
                kotlin.ResultKt.throwOnFailure(r34)
                goto L_0x01b5
            L_0x0020:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L_0x0028:
                java.lang.Object r1 = r0.f175823e
                bi1.e r1 = (bi1.C0287e) r1
                java.lang.Object r2 = r0.f175822d
                gy3.f0 r2 = (gy3.C8479f0) r2
                kotlin.ResultKt.throwOnFailure(r34)
                goto L_0x018d
            L_0x0035:
                java.lang.Object r1 = r0.f175822d
                gy3.f0 r1 = (gy3.C8479f0) r1
                kotlin.ResultKt.throwOnFailure(r34)
                r2 = r1
                r1 = r34
                goto L_0x0160
            L_0x0041:
                kotlin.ResultKt.throwOnFailure(r34)
                np1.a r5 = r0.f175825g
                fj1.b r5 = r5.f175774g
                androidx.lifecycle.i0 r5 = r5.mo71262a(r3)
                cl1.h1 r5 = (cl1.C54979h1) r5
                boolean r5 = r5.f154142q
                if (r5 == 0) goto L_0x0070
                fj1.b$a r5 = fj1.C45795b.f123697j
                fj1.b r5 = fj1.C45795b.f123698n
                if (r5 == 0) goto L_0x0083
                np1.a r11 = r0.f175825g
                boolean r12 = r0.f175827i
                android.os.Bundle r13 = r0.f175828j
                boolean r14 = r0.f175829n
                ok1.e r15 = ok1.C62042e.f176370a
                np1.a$v$a r10 = new np1.a$v$a
                r9 = r10
                r6 = r10
                r10 = r5
                r9.<init>(r10, r11, r12, r13, r14)
                java.lang.String r9 = "FinderLiveGetLeadsComponentListRequest-showShoppingContent"
                r15.mo86993B1(r5, r9, r6)
                goto L_0x0083
            L_0x0070:
                np1.a r5 = r0.f175825g
                fj1.b r5 = r5.f175774g
                androidx.lifecycle.i0 r5 = r5.mo71262a(r3)
                cl1.h1 r5 = (cl1.C54979h1) r5
                d14.u0<java.lang.Boolean> r5 = r5.f154129V
                java.lang.Boolean r6 = java.lang.Boolean.TRUE
                d14.j1 r5 = (d14.C58052j1) r5
                r5.setValue(r6)
            L_0x0083:
                np1.a r5 = r0.f175825g
                fj1.b r5 = r5.f175774g
                androidx.lifecycle.i0 r5 = r5.mo71262a(r3)
                cl1.h1 r5 = (cl1.C54979h1) r5
                boolean r5 = r5.f154143r
                if (r5 == 0) goto L_0x01b5
                gy3.f0 r5 = new gy3.f0
                r5.<init>()
                dj1.l0 r6 = new dj1.l0
                np1.a r9 = r0.f175825g
                fj1.b r9 = r9.f175774g
                androidx.lifecycle.i0 r9 = r9.mo71262a(r2)
                cl1.u r9 = (cl1.C55001u) r9
                te3.c21 r9 = r9.f154420q
                long r9 = r9.f182392d
                np1.a r11 = r0.f175825g
                fj1.b r11 = r11.f175774g
                androidx.lifecycle.i0 r11 = r11.mo71262a(r2)
                cl1.u r11 = (cl1.C55001u) r11
                long r11 = r11.f154416j
                np1.a r13 = r0.f175825g
                int r14 = r13.f175771d
                if (r14 != r8) goto L_0x00bf
                zc1.b r13 = zc1.C66785b.f191882e
                java.lang.String r13 = r13.mo90662O5()
                goto L_0x00c9
            L_0x00bf:
                fj1.b r13 = r13.f175774g
                androidx.lifecycle.i0 r13 = r13.mo71262a(r1)
                cl1.o r13 = (cl1.C54991o) r13
                java.lang.String r13 = r13.f154345o
            L_0x00c9:
                r21 = r13
                np1.a r13 = r0.f175825g
                fj1.b r13 = r13.f175774g
                androidx.lifecycle.i0 r2 = r13.mo71262a(r2)
                cl1.u r2 = (cl1.C55001u) r2
                byte[] r2 = r2.f154417n
                np1.a r13 = r0.f175825g
                ok1.e r14 = ok1.C62042e.f176370a
                boolean r14 = r14.mo87027N0()
                if (r14 == 0) goto L_0x00f3
                fj1.b r13 = r13.f175774g
                androidx.lifecycle.i0 r3 = r13.mo71262a(r3)
                cl1.h1 r3 = (cl1.C54979h1) r3
                boolean r3 = r3.f154135g
                if (r3 == 0) goto L_0x00f0
                r23 = 1
                goto L_0x00f6
            L_0x00f0:
                r23 = 2
                goto L_0x00f6
            L_0x00f3:
                r3 = 0
                r23 = 0
            L_0x00f6:
                zc1.b r3 = zc1.C66785b.f191882e
                java.lang.String r24 = r3.mo90662O5()
                np1.a r3 = r0.f175825g
                fj1.b r3 = r3.f175774g
                androidx.lifecycle.i0 r3 = r3.mo71262a(r1)
                cl1.o r3 = (cl1.C54991o) r3
                java.lang.String r3 = r3.f154318g2
                r26 = 0
                r27 = 0
                int r13 = r0.f175826h
                bl3.r r14 = bl3.C39818r.f106831a
                np1.a r15 = r0.f175825g
                android.view.ViewGroup r15 = r15.f175772e
                android.content.Context r15 = r15.getContext()
                java.lang.String r8 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
                gy3.C87412m.m108592e(r15, r8)
                com.tencent.mm.ui.MMActivity r15 = (com.tencent.p014mm.p136ui.MMActivity) r15
                bl3.r$a r8 = r14.mo62444c(r15)
                java.lang.Class<ht1.g4> r14 = ht1.C60172g4.class
                bl3.c r8 = r8.mo62447c(r14)
                ht1.g4 r8 = (ht1.C60172g4) r8
                te3.hj1 r29 = r8.mo12861q3()
                np1.a r8 = r0.f175825g
                fj1.b r8 = r8.f175774g
                androidx.lifecycle.i0 r1 = r8.mo71262a(r1)
                cl1.o r1 = (cl1.C54991o) r1
                java.lang.String r1 = r1.f154357q3
                r31 = 256(0x100, float:3.59E-43)
                r32 = 0
                r16 = r6
                r17 = r9
                r19 = r11
                r22 = r2
                r25 = r3
                r28 = r13
                r30 = r1
                r16.<init>(r17, r19, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
                a14.h0 r1 = a14.C53872d1.f151117a
                a14.k2 r1 = f14.C58901s.f168555a
                r0.f175822d = r5
                r0.f175824f = r7
                java.lang.Object r1 = bi1.C0283d.m243a(r6, r1, r0)
                if (r1 != r4) goto L_0x015f
                return r4
            L_0x015f:
                r2 = r5
            L_0x0160:
                bi1.e r1 = (bi1.C0287e) r1
                np1.a r9 = r0.f175825g
                boolean r10 = r0.f175827i
                android.os.Bundle r11 = r0.f175828j
                boolean r12 = r0.f175829n
                boolean r3 = r1 instanceof bi1.C0288f
                if (r3 == 0) goto L_0x018d
                wx3.f r3 = r1.f854a
                if (r3 != 0) goto L_0x0176
                wx3.f r3 = r33.getContext()
            L_0x0176:
                np1.a$v$e r13 = new np1.a$v$e
                r7 = 0
                r5 = r13
                r6 = r1
                r8 = r2
                r5.<init>(r6, r7, r8, r9, r10, r11, r12)
                r0.f175822d = r2
                r0.f175823e = r1
                r5 = 2
                r0.f175824f = r5
                java.lang.Object r3 = a14.C53895h.m60469g(r3, r13, r0)
                if (r3 != r4) goto L_0x018d
                return r4
            L_0x018d:
                r8 = r2
                np1.a r9 = r0.f175825g
                boolean r10 = r0.f175827i
                boolean r2 = r1 instanceof bi1.C0281b
                if (r2 == 0) goto L_0x01b5
                wx3.f r2 = r1.f854a
                if (r2 != 0) goto L_0x019e
                wx3.f r2 = r33.getContext()
            L_0x019e:
                np1.a$v$d r3 = new np1.a$v$d
                r7 = 0
                r5 = r3
                r6 = r1
                r5.<init>(r6, r7, r8, r9, r10)
                r0.f175822d = r1
                r1 = 0
                r0.f175823e = r1
                r1 = 3
                r0.f175824f = r1
                java.lang.Object r1 = a14.C53895h.m60469g(r2, r3, r0)
                if (r1 != r4) goto L_0x01b5
                return r4
            L_0x01b5:
                rx3.b0 r1 = rx3.C13598b0.f38549a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: np1.C61817a.C61842v.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* renamed from: np1.a$w */
    public static final class C61850w extends C87413o implements C32224a<int[]> {

        /* renamed from: d */
        public static final C61850w f175865d = new C61850w();

        public C61850w() {
            super(0);
        }

        public Object invoke() {
            return new int[2];
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:57:0x025c  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x028f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C61817a(int r6, android.view.ViewGroup r7, d60.C58124b r8, fj1.C45795b r9, cj1.C54795n5 r10, qj1.C62660c r11) {
        /*
            r5 = this;
            java.lang.String r0 = "Finder.LiveShoppingListPlugin"
            java.lang.String r1 = "root"
            gy3.C87412m.m108594g(r7, r1)
            java.lang.String r1 = "statusMonitor"
            gy3.C87412m.m108594g(r8, r1)
            java.lang.String r1 = "buContext"
            gy3.C87412m.m108594g(r9, r1)
            r5.<init>()
            r5.f175771d = r6
            r5.f175772e = r7
            r5.f175773f = r8
            r5.f175774g = r9
            r5.f175775h = r10
            r5.f175776i = r11
            np1.a$p r6 = new np1.a$p
            r6.<init>(r5)
            rx3.g r6 = rx3.C36568h.m40985a(r6)
            r5.f175782r = r6
            np1.a$r r6 = new np1.a$r
            r6.<init>(r5)
            rx3.g r6 = rx3.C36568h.m40985a(r6)
            r5.f175783s = r6
            np1.a$o r6 = new np1.a$o
            r6.<init>(r5)
            rx3.g r6 = rx3.C36568h.m40985a(r6)
            r5.f175760B = r6
            op1.h r6 = new op1.h
            android.content.Context r10 = r7.getContext()
            java.lang.String r1 = "root.context"
            gy3.C87412m.m108593f(r10, r1)
            int r2 = r8.getLiveRole()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L_0x0057
            r2 = 1
            goto L_0x0058
        L_0x0057:
            r2 = 0
        L_0x0058:
            r6.<init>(r10, r2, r9)
            r5.f175761C = r6
            op1.a r6 = new op1.a
            android.content.Context r10 = r7.getContext()
            gy3.C87412m.m108593f(r10, r1)
            int r2 = r8.getLiveRole()
            if (r2 != r4) goto L_0x006e
            r2 = 1
            goto L_0x006f
        L_0x006e:
            r2 = 0
        L_0x006f:
            r6.<init>(r10, r2, r9)
            r5.f175762D = r6
            op1.h r6 = new op1.h
            android.content.Context r10 = r7.getContext()
            gy3.C87412m.m108593f(r10, r1)
            int r8 = r8.getLiveRole()
            if (r8 != r4) goto L_0x0085
            r8 = 1
            goto L_0x0086
        L_0x0085:
            r8 = 0
        L_0x0086:
            r6.<init>(r10, r8, r9)
            r5.f175763E = r6
            np1.a$w r6 = np1.C61817a.C61850w.f175865d
            rx3.g r6 = rx3.C36568h.m40985a(r6)
            r5.f175767I = r6
            np1.a$b r6 = new np1.a$b
            r6.<init>(r5)
            r5.f175768J = r6
            pp1.j r6 = new pp1.j
            r8 = 0
            if (r11 == 0) goto L_0x00aa
            com.tencent.mm.plugin.finder.live.view.b r10 = r11.mo14484z0()
            if (r10 == 0) goto L_0x00aa
            com.tencent.mm.plugin.finder.live.infrastructure.coroutine.a r10 = r10.getViewScope()
            goto L_0x00ab
        L_0x00aa:
            r10 = r8
        L_0x00ab:
            r6.<init>(r5, r7, r9, r10)
            r5.f175777j = r6
            r6 = 2131304785(0x7f092151, float:1.8227722E38)
            android.view.View r6 = r7.findViewById(r6)
            java.lang.String r10 = "root.findViewById(R.id.f…shopping_list_blank_area)"
            gy3.C87412m.m108593f(r6, r10)
            r5.f175779o = r6
            r6 = 2131304786(0x7f092152, float:1.8227724E38)
            android.view.View r6 = r7.findViewById(r6)
            java.lang.String r10 = "root.findViewById(R.id.f…opping_list_content_area)"
            gy3.C87412m.m108593f(r6, r10)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel r6 = (com.tencent.p014mm.plugin.finder.shopping.view.FinderLiveShoppingPanel) r6
            r5.f175780p = r6
            r10 = 2131304285(0x7f091f5d, float:1.8226708E38)
            android.view.View r10 = r7.findViewById(r10)
            r6.setMaskView(r10)
            r6 = 2131304264(0x7f091f48, float:1.8226666E38)
            android.view.View r6 = r7.findViewById(r6)
            java.lang.String r7 = "root.findViewById(R.id.f…ve_shopping_list_content)"
            gy3.C87412m.m108593f(r6, r7)
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView r6 = (com.tencent.p014mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView) r6
            r5.f175781q = r6
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView r6 = r5.mo86758o()     // Catch:{ Exception -> 0x0115 }
            op1.h r7 = r5.f175761C     // Catch:{ Exception -> 0x0115 }
            if (r11 == 0) goto L_0x00f5
            com.tencent.mm.plugin.finder.live.view.b r10 = r11.mo14484z0()     // Catch:{ Exception -> 0x0115 }
            goto L_0x00f6
        L_0x00f5:
            r10 = r8
        L_0x00f6:
            boolean r11 = r10 instanceof com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout     // Catch:{ Exception -> 0x0115 }
            if (r11 == 0) goto L_0x00fd
            com.tencent.mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout r10 = (com.tencent.p014mm.plugin.finder.live.view.FinderLiveVisitorPluginLayout) r10     // Catch:{ Exception -> 0x0115 }
            goto L_0x00fe
        L_0x00fd:
            r10 = r8
        L_0x00fe:
            if (r10 == 0) goto L_0x0105
            te3.hj1 r10 = r10.getReportObj()     // Catch:{ Exception -> 0x0115 }
            goto L_0x0106
        L_0x0105:
            r10 = r8
        L_0x0106:
            java.lang.String r11 = "shoppingListAdapter"
            gy3.C87412m.m108594g(r7, r11)     // Catch:{ Exception -> 0x0115 }
            np1.g0 r11 = new np1.g0     // Catch:{ Exception -> 0x0115 }
            r11.<init>(r7, r10, r9)     // Catch:{ Exception -> 0x0115 }
            zp3.C23564m.m28137g(r6, r11)     // Catch:{ Exception -> 0x0115 }
            goto L_0x011b
        L_0x0115:
            r6 = move-exception
            er1.j4 r7 = er1.C58739j4.f168176a
            r7.mo83712h0(r6, r0)
        L_0x011b:
            android.view.ViewGroup r6 = r5.f175772e
            r7 = 2131304287(0x7f091f5f, float:1.8226712E38)
            android.view.View r6 = r6.findViewById(r7)
            java.lang.String r7 = "root.findViewById(R.id.f…secondary_page_container)"
            gy3.C87412m.m108593f(r6, r7)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r5.f175784t = r6
            android.view.ViewGroup r6 = r5.f175772e
            r7 = 2131304260(0x7f091f44, float:1.8226658E38)
            android.view.View r6 = r6.findViewById(r7)
            java.lang.String r7 = "root.findViewById(R.id.f…list_of_coupon_container)"
            gy3.C87412m.m108593f(r6, r7)
            android.widget.FrameLayout r6 = (android.widget.FrameLayout) r6
            r5.f175785u = r6
            android.view.ViewGroup r6 = r5.f175772e
            r7 = 2131304257(0x7f091f41, float:1.8226651E38)
            android.view.View r6 = r6.findViewById(r7)
            java.lang.String r7 = "root.findViewById(R.id.f…ping_coupon_list_content)"
            gy3.C87412m.m108593f(r6, r7)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            r5.f175788x = r6
            android.view.ViewGroup r6 = r5.f175772e
            r7 = 2131304261(0x7f091f45, float:1.822666E38)
            android.view.View r6 = r6.findViewById(r7)
            java.lang.String r7 = "root.findViewById(R.id.f…d_list_of_coupon_content)"
            gy3.C87412m.m108593f(r6, r7)
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            r5.f175789y = r6
            android.view.ViewGroup r6 = r5.f175772e
            r7 = 2131304273(0x7f091f51, float:1.8226684E38)
            android.view.View r6 = r6.findViewById(r7)
            r5.f175790z = r6
            android.view.ViewGroup r6 = r5.f175772e
            r7 = 2131305707(0x7f0924eb, float:1.8229592E38)
            android.view.View r6 = r6.findViewById(r7)
            java.lang.String r7 = "root.findViewById(R.id.goods_of_coupon_title)"
            gy3.C87412m.m108593f(r6, r7)
            android.widget.TextView r6 = (android.widget.TextView) r6
            r5.f175786v = r6
            android.view.ViewGroup r6 = r5.f175772e
            r7 = 2131305708(0x7f0924ec, float:1.8229594E38)
            android.view.View r6 = r6.findViewById(r7)
            java.lang.String r7 = "root.findViewById(R.id.goods_of_coupon_title_root)"
            gy3.C87412m.m108593f(r6, r7)
            r5.f175787w = r6
            r5.mo86764t()
            r5.mo86762r()
            qj1.c r6 = r5.f175776i
            if (r6 == 0) goto L_0x01a2
            boolean r6 = r6.mo82893g0()
            if (r6 != r4) goto L_0x01a2
            r6 = 1
            goto L_0x01a3
        L_0x01a2:
            r6 = 0
        L_0x01a3:
            java.lang.String r7 = "contentGroup"
            if (r6 == 0) goto L_0x0299
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView r6 = r5.mo86758o()
            androidx.recyclerview.widget.LinearLayoutManager r9 = new androidx.recyclerview.widget.LinearLayoutManager
            android.view.ViewGroup r10 = r5.f175772e
            android.content.Context r10 = r10.getContext()
            r9.<init>(r10, r4, r3)
            r6.setLayoutManager(r9)
            op1.h r9 = r5.f175761C
            r6.setAdapter(r9)
            pp1.j r9 = r5.f175777j
            if (r9 == 0) goto L_0x0293
            android.view.View r9 = r9.mo87511o()
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            if (r9 == 0) goto L_0x01e6
            int r9 = r9.height
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            int r10 = r9.intValue()
            if (r10 <= 0) goto L_0x01da
            r10 = 1
            goto L_0x01db
        L_0x01da:
            r10 = 0
        L_0x01db:
            if (r10 == 0) goto L_0x01de
            goto L_0x01df
        L_0x01de:
            r9 = r8
        L_0x01df:
            if (r9 == 0) goto L_0x01e6
            int r9 = r9.intValue()
            goto L_0x01f5
        L_0x01e6:
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131165363(0x7f0700b3, float:1.794494E38)
            int r9 = r9.getDimensionPixelOffset(r10)
        L_0x01f5:
            android.view.ViewGroup$LayoutParams r10 = r6.getLayoutParams()
            android.view.ViewGroup r11 = r5.f175772e
            android.content.Context r11 = r11.getContext()
            android.graphics.Point r11 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r11)
            int r11 = r11.y
            int r11 = r11 - r9
            r10.height = r11
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "initLandscapeShoppingList,titleGroupHeight:"
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = ", shoppingList height:"
            r10.append(r9)
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            int r6 = r6.height
            r10.append(r6)
            java.lang.String r6 = r10.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r6)
            androidx.recyclerview.widget.RecyclerView r6 = r5.mo86752i()
            androidx.recyclerview.widget.LinearLayoutManager r9 = new androidx.recyclerview.widget.LinearLayoutManager
            android.view.ViewGroup r10 = r5.f175772e
            android.content.Context r10 = r10.getContext()
            r9.<init>(r10, r4, r3)
            r6.setLayoutManager(r9)
            op1.a r9 = r5.f175762D
            r6.setAdapter(r9)
            androidx.recyclerview.widget.RecyclerView r6 = r5.mo86753j()
            androidx.recyclerview.widget.LinearLayoutManager r9 = new androidx.recyclerview.widget.LinearLayoutManager
            android.view.ViewGroup r10 = r5.f175772e
            android.content.Context r10 = r10.getContext()
            r9.<init>(r10, r4, r3)
            r6.setLayoutManager(r9)
            op1.h r9 = r5.f175763E
            r6.setAdapter(r9)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel r6 = r5.f175780p
            if (r6 == 0) goto L_0x028f
            android.view.ViewGroup r9 = r5.f175772e
            android.content.Context r9 = r9.getContext()
            android.graphics.Point r9 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r9)
            int r9 = r9.y
            float r9 = (float) r9
            r6.setTranslationX(r9)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel r6 = r5.f175780p
            if (r6 == 0) goto L_0x028b
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            java.lang.String r7 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"
            gy3.C87412m.m108592e(r6, r7)
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r6 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r6
            android.view.ViewGroup r7 = r5.f175772e
            android.content.Context r7 = r7.getContext()
            android.graphics.Point r7 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r7)
            int r7 = r7.y
            r6.width = r7
            goto L_0x0467
        L_0x028b:
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x028f:
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x0293:
            java.lang.String r6 = "headerHolder"
            gy3.C87412m.m108603p(r6)
            throw r8
        L_0x0299:
            android.content.Context r6 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.graphics.Point r6 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r6)
            int r6 = r6.y
            float r6 = (float) r6
            gg1.a r9 = gg1.C32444a.f86121a
            int r9 = r9.mo58621b()
            float r9 = (float) r9
            r10 = 1120403456(0x42c80000, float:100.0)
            float r9 = r9 / r10
            float r6 = r6 * r9
            int r6 = (int) r6
            android.content.Context r9 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r9 = r9.getResources()
            r10 = 2131165339(0x7f07009b, float:1.7944892E38)
            float r9 = r9.getDimension(r10)
            int r9 = (int) r9
            int r6 = r6 + r9
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel r9 = r5.f175780p
            if (r9 == 0) goto L_0x047b
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            r9.height = r6
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView r9 = r5.mo86758o()
            androidx.recyclerview.widget.LinearLayoutManager r10 = new androidx.recyclerview.widget.LinearLayoutManager
            android.view.ViewGroup r11 = r5.f175772e
            android.content.Context r11 = r11.getContext()
            r10.<init>(r11, r4, r3)
            r9.setLayoutManager(r10)
            op1.h r10 = r5.f175761C
            r9.setAdapter(r10)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            java.lang.String r11 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            gy3.C87412m.m108592e(r10, r11)
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            int r10 = r10.topMargin
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            int r11 = r10.intValue()
            if (r11 <= 0) goto L_0x02fc
            r11 = 1
            goto L_0x02fd
        L_0x02fc:
            r11 = 0
        L_0x02fd:
            if (r11 == 0) goto L_0x0300
            goto L_0x0301
        L_0x0300:
            r10 = r8
        L_0x0301:
            if (r10 == 0) goto L_0x0308
            int r10 = r10.intValue()
            goto L_0x0317
        L_0x0308:
            android.content.Context r10 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131166434(0x7f0704e2, float:1.7947113E38)
            int r10 = r10.getDimensionPixelOffset(r11)
        L_0x0317:
            android.view.ViewGroup r11 = r5.f175772e
            android.content.Context r11 = r11.getContext()
            int r11 = com.tencent.p014mm.p136ui.C75044y4.m89991c(r11)
            android.view.ViewGroup$LayoutParams r1 = r9.getLayoutParams()
            int r2 = r6 - r10
            int r2 = r2 - r11
            r1.height = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "initPortraitShoppingList,panelHeight:"
            r1.append(r2)
            r1.append(r6)
            java.lang.String r2 = ", shopListMarginTop:"
            r1.append(r2)
            r1.append(r10)
            java.lang.String r10 = ",navigationBarHeight:"
            r1.append(r10)
            r1.append(r11)
            java.lang.String r10 = ",shoppingList height:"
            r1.append(r10)
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            int r9 = r9.height
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r9)
            androidx.recyclerview.widget.RecyclerView r9 = r5.mo86752i()
            androidx.recyclerview.widget.LinearLayoutManager r10 = new androidx.recyclerview.widget.LinearLayoutManager
            android.view.ViewGroup r11 = r5.f175772e
            android.content.Context r11 = r11.getContext()
            r10.<init>(r11, r4, r3)
            r9.setLayoutManager(r10)
            op1.a r10 = r5.f175762D
            r9.setAdapter(r10)
            androidx.recyclerview.widget.RecyclerView r9 = r5.mo86753j()
            androidx.recyclerview.widget.LinearLayoutManager r10 = new androidx.recyclerview.widget.LinearLayoutManager
            android.view.ViewGroup r11 = r5.f175772e
            android.content.Context r11 = r11.getContext()
            r10.<init>(r11, r4, r3)
            r9.setLayoutManager(r10)
            op1.h r10 = r5.f175763E
            r9.setAdapter(r10)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel r9 = r5.f175780p
            if (r9 == 0) goto L_0x0477
            android.view.ViewGroup r10 = r5.f175772e
            android.content.Context r10 = r10.getContext()
            android.graphics.Point r10 = com.tencent.p014mm.p136ui.C75044y4.m89990b(r10)
            int r10 = r10.y
            float r10 = (float) r10
            r9.setTranslationY(r10)
            android.view.ViewGroup$LayoutParams r10 = r9.getLayoutParams()
            r10.height = r6
            pp1.h r10 = new pp1.h
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel r11 = r5.f175780p
            if (r11 == 0) goto L_0x0473
            r0 = 2131305891(0x7f0925a3, float:1.8229966E38)
            android.view.View r11 = r11.findViewById(r0)
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel r0 = r5.f175780p
            if (r0 == 0) goto L_0x046f
            r1 = 2131305889(0x7f0925a1, float:1.8229962E38)
            android.view.View r0 = r0.findViewById(r1)
            float r1 = r9.getTranslationY()
            float r6 = (float) r6
            float r1 = r1 - r6
            int r6 = (int) r1
            r10.<init>(r11, r0, r6)
            r9.f160988v = r10
            np1.e0 r6 = new np1.e0
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView r10 = r5.mo86758o()
            r6.<init>(r9, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "start enableNestedScrollControl:"
            r10.append(r11)
            rx3.g r11 = r6.f175887c
            rx3.n r11 = (rx3.C36570n) r11
            java.lang.Object r11 = r11.getValue()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r11 = "ShoppingPanelNestedScrollController"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r10)
            rx3.g r10 = r6.f175887c
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L_0x0407
            goto L_0x042b
        L_0x0407:
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView r10 = r6.f175886b
            androidx.recyclerview.widget.RecyclerView$LayoutManager r10 = r10.getLayoutManager()
            boolean r11 = r10 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r11 == 0) goto L_0x0414
            androidx.recyclerview.widget.LinearLayoutManager r10 = (androidx.recyclerview.widget.LinearLayoutManager) r10
            goto L_0x0415
        L_0x0414:
            r10 = r8
        L_0x0415:
            if (r10 != 0) goto L_0x0418
            goto L_0x042b
        L_0x0418:
            r6.f175891g = r10
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel r10 = r6.f175885a
            boolean r11 = r10.f160982p
            r10.f160983q = r11
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView r10 = r6.f175886b
            np1.f0 r11 = new np1.f0
            r11.<init>(r6)
            r10.setTouchEventListener(r11)
            r3 = 1
        L_0x042b:
            if (r3 == 0) goto L_0x0447
            com.tencent.mm.plugin.finder.shopping.view.FinderLiveShoppingPanel r10 = r5.f175780p
            if (r10 == 0) goto L_0x0443
            r7 = 2131313507(0x7f094363, float:1.8245413E38)
            android.view.View r7 = r10.findViewById(r7)
            if (r7 == 0) goto L_0x0447
            np1.e r8 = new np1.e
            r8.<init>(r5)
            r7.setOnTouchListener(r8)
            goto L_0x0447
        L_0x0443:
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x0447:
            r5.f175759A = r6
            java.lang.String r6 = r9.getTAG()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "initPortraitShoppingList,contentGroup height:"
            r7.append(r8)
            android.view.ViewGroup$LayoutParams r8 = r9.getLayoutParams()
            int r8 = r8.height
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r7)
        L_0x0467:
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r5.f175770L = r6
            return
        L_0x046f:
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x0473:
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x0477:
            gy3.C87412m.m108603p(r7)
            throw r8
        L_0x047b:
            gy3.C87412m.m108603p(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.C61817a.<init>(int, android.view.ViewGroup, d60.b, fj1.b, cj1.n5, qj1.c):void");
    }

    /* renamed from: L */
    public static /* synthetic */ void m72531L(C61817a aVar, Bundle bundle, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            z2 = false;
        }
        aVar.mo86744K(bundle, i, z, z2);
    }

    /* renamed from: a */
    public static final int[] m72532a(C61817a aVar) {
        return (int[]) ((C36570n) aVar.f175767I).getValue();
    }

    /* renamed from: b */
    public static final void m72533b(C61817a aVar, int i, int i2, C32228q qVar) {
        C61817a aVar2 = aVar;
        aVar.getClass();
        Class cls = C55001u.class;
        C8479f0 f0Var = new C8479f0();
        C0001s1 s1Var = C0001s1.f0d;
        C53896h0 h0Var = C53872d1.f151117a;
        C53973z1 d = C53895h.m60466d(s1Var, C58901s.f168555a, (C53934p0) null, new C11249i(f0Var, aVar, (C15601d<? super C11249i>) null), 2, (Object) null);
        C54795n5 n5Var = aVar2.f175775h;
        if (n5Var != null) {
            Context context = aVar2.f175772e.getContext();
            C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            long j = ((C55001u) aVar2.f175774g.mo71262a(cls)).f154420q.f182392d;
            long j2 = ((C55001u) aVar2.f175774g.mo71262a(cls)).f154416j;
            String str = ((C54991o) aVar2.f175774g.mo71262a(C54991o.class)).f154345o;
            C50401mh0 mh02 = new C50401mh0();
            C58739j4 j4Var = C58739j4.f168176a;
            C50351m41 m412 = new C50351m41();
            int i3 = i;
            m412.f137829d = i3;
            int i4 = i2;
            m412.f137830e = i4;
            C13598b0 b0Var = C13598b0.f38549a;
            mh02.f138029e = j4Var.mo83710g0(m412);
            mh02.f138028d = 104;
            n5Var.mo75737h((MMActivity) context, j, j2, str, mh02, new C11248h(d, f0Var, qVar, i3, i4));
        }
    }

    /* renamed from: c */
    public static final void m72534c(C61817a aVar, C86299o oVar) {
        C62660c cVar = aVar.f175776i;
        boolean z = true;
        if (cVar == null || !cVar.mo82893g0()) {
            z = false;
        }
        Log.m105924i("Finder.LiveShoppingListPlugin", "openFullScreenMiniprogram isLandscape:" + z);
        if (z) {
            C62660c cVar2 = aVar.f175776i;
            if (cVar2 != null) {
                C62660c.m73644Y0(cVar2, "PORTRAIT_ACTION_FULL_SCREEN_MINIPRO", oVar, 0, 4, (Object) null);
                return;
            }
            return;
        }
        aVar.mo86737D(oVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00eb, code lost:
        if ((!r10.isEmpty()) != false) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ee, code lost:
        if (r4 == false) goto L_0x00f0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x02fa  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m72535d(np1.C61817a r18, boolean r19, android.os.Bundle r20, boolean r21, te3.C64434i11 r22) {
        /*
            r0 = r18
            r1 = r20
            r2 = r21
            np1.i0 r3 = np1.C61866i0.f175909a
            fj1.b r4 = r0.f175774g
            r5 = 0
            r6 = r22
            r3.mo86800l(r5, r4, r6)
            r18.mo86750g()
            qj1.c r3 = r0.f175776i
            r4 = 0
            r6 = 1
            if (r3 == 0) goto L_0x0021
            int r3 = r3.mo14483f0()
            if (r3 != 0) goto L_0x0021
            r3 = 1
            goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            if (r3 != 0) goto L_0x002a
            boolean r3 = r18.mo86765u(r19)
            if (r3 == 0) goto L_0x0342
        L_0x002a:
            java.lang.Class<cl1.o> r3 = cl1.C54991o.class
            java.lang.Class<cl1.h1> r7 = cl1.C54979h1.class
            r18.mo86747O()
            boolean r8 = r18.mo86765u(r19)
            java.lang.String r9 = "headerHolder"
            if (r8 == 0) goto L_0x024b
            fj1.b r8 = r0.f175774g
            androidx.lifecycle.i0 r8 = r8.mo71262a(r7)
            cl1.h1 r8 = (cl1.C54979h1) r8
            p40.a<cm1.i2> r8 = r8.f154140o
            boolean r8 = r8.mo87254e()
            if (r8 == 0) goto L_0x0059
            fj1.b r8 = r0.f175774g
            androidx.lifecycle.i0 r8 = r8.mo71262a(r7)
            cl1.h1 r8 = (cl1.C54979h1) r8
            p40.a<cm1.i2> r8 = r8.f154141p
            boolean r8 = r8.mo87254e()
            if (r8 != 0) goto L_0x00f0
        L_0x0059:
            fj1.b r8 = r0.f175774g
            androidx.lifecycle.i0 r8 = r8.mo71262a(r3)
            cl1.o r8 = (cl1.C54991o) r8
            boolean r8 = r8.mo75999e4()
            if (r8 != 0) goto L_0x01bc
            fj1.b r8 = r0.f175774g
            androidx.lifecycle.i0 r8 = r8.mo71262a(r7)
            cl1.h1 r8 = (cl1.C54979h1) r8
            p40.a<cm1.i2> r10 = r8.f154140o
            java.util.List r10 = r10.mo87250a()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x0080:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x0092
            java.lang.Object r12 = r10.next()
            boolean r13 = r12 instanceof sk1.C63965x
            if (r13 == 0) goto L_0x0080
            r11.add(r12)
            goto L_0x0080
        L_0x0092:
            boolean r10 = r11.isEmpty()
            r10 = r10 ^ r6
            if (r10 != 0) goto L_0x00ed
            p40.a<cm1.i2> r10 = r8.f154140o
            java.util.List r10 = r10.mo87250a()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.ArrayList r10 = (java.util.ArrayList) r10
            java.util.Iterator r10 = r10.iterator()
        L_0x00aa:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x00bc
            java.lang.Object r12 = r10.next()
            boolean r13 = r12 instanceof sk1.C63964u
            if (r13 == 0) goto L_0x00aa
            r11.add(r12)
            goto L_0x00aa
        L_0x00bc:
            boolean r10 = r11.isEmpty()
            r10 = r10 ^ r6
            if (r10 != 0) goto L_0x00ed
            p40.a<cm1.i2> r8 = r8.f154141p
            java.util.List r8 = r8.mo87250a()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            java.util.Iterator r8 = r8.iterator()
        L_0x00d4:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L_0x00e6
            java.lang.Object r11 = r8.next()
            boolean r12 = r11 instanceof sk1.C48416t
            if (r12 == 0) goto L_0x00d4
            r10.add(r11)
            goto L_0x00d4
        L_0x00e6:
            boolean r8 = r10.isEmpty()
            r8 = r8 ^ r6
            if (r8 == 0) goto L_0x00ee
        L_0x00ed:
            r4 = 1
        L_0x00ee:
            if (r4 != 0) goto L_0x01bc
        L_0x00f0:
            if (r2 != 0) goto L_0x02fd
            r18.mo86748e()
            fj1.b r1 = r0.f175774g
            java.lang.Class<ak1.o> r4 = ak1.C54108o.class
            java.lang.String r6 = "buContext"
            gy3.C87412m.m108594g(r1, r6)
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            androidx.lifecycle.i0 r8 = r1.mo71262a(r3)
            cl1.o r8 = (cl1.C54991o) r8
            boolean r8 = r8.mo75995c4()
            java.lang.String r10 = "getService(HellLiveReport::class.java)"
            java.lang.String r11 = "sessionid"
            java.lang.String r12 = "type"
            if (r8 == 0) goto L_0x0145
            r1 = 7
            r6.put(r12, r1)
            di3.d r1 = di3.C86312j.m106911c(r4)
            ak1.o r1 = (ak1.C54108o) r1
            r1.getClass()
            ak1.f0 r1 = ak1.C54108o.f151869h
            java.lang.String r1 = r1.f151475s
            r6.put(r11, r1)
            di3.d r1 = di3.C86312j.m106911c(r4)
            gy3.C87412m.m108593f(r1, r10)
            r11 = r1
            ht1.j5 r11 = (ht1.C8777j5) r11
            r12 = 6
            java.lang.String r14 = r6.toString()
            r15 = 0
            r16 = 4
            r17 = 0
            ht1.C8777j5.C8778a.m8600a(r11, r12, r14, r15, r16, r17)
            goto L_0x02fd
        L_0x0145:
            androidx.lifecycle.i0 r3 = r1.mo71262a(r3)
            cl1.o r3 = (cl1.C54991o) r3
            boolean r3 = r3.mo75999e4()
            if (r3 == 0) goto L_0x02fd
            r3 = 10
            r6.put(r12, r3)
            androidx.lifecycle.i0 r3 = r1.mo71262a(r7)
            cl1.h1 r3 = (cl1.C54979h1) r3
            java.lang.String r3 = r3.f154151z
            java.lang.String r8 = "appid"
            r6.put(r8, r3)
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            androidx.lifecycle.i0 r1 = r1.mo71262a(r3)
            cl1.u r1 = (cl1.C55001u) r1
            te3.c21 r1 = r1.f154420q
            long r12 = r1.f182392d
            r14 = 0
            java.lang.String r1 = "liveid"
            int r3 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r3 >= 0) goto L_0x017d
            java.lang.String r3 = ""
            r6.put(r1, r3)
            goto L_0x018c
        L_0x017d:
            java.lang.Class<kq.h> r3 = p185kq.C10383h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            kq.h r3 = (p185kq.C10383h) r3
            java.lang.String r3 = r3.mo10700XQ(r12)
            r6.put(r1, r3)
        L_0x018c:
            java.lang.String r1 = t91.C64208c.f181967q
            java.lang.String r3 = "clickid"
            r6.put(r3, r1)
            di3.d r1 = di3.C86312j.m106911c(r4)
            ak1.o r1 = (ak1.C54108o) r1
            r1.getClass()
            ak1.f0 r1 = ak1.C54108o.f151869h
            java.lang.String r1 = r1.f151475s
            r6.put(r11, r1)
            di3.d r1 = di3.C86312j.m106911c(r4)
            gy3.C87412m.m108593f(r1, r10)
            r11 = r1
            ht1.j5 r11 = (ht1.C8777j5) r11
            ak1.g0 r12 = ak1.C0073g0.LIVE_ANCHOR_ACTION_COMMERCE
            java.lang.String r13 = r6.toString()
            r14 = 0
            r15 = 4
            r16 = 0
            ht1.C8777j5.C8778a.m8605f(r11, r12, r13, r14, r15, r16)
            goto L_0x02fd
        L_0x01bc:
            r18.mo86741H()
            fj1.b r3 = r0.f175774g
            androidx.lifecycle.i0 r3 = r3.mo71262a(r7)
            cl1.h1 r3 = (cl1.C54979h1) r3
            p40.a<cm1.i2> r3 = r3.f154140o
            java.util.List r3 = r3.mo87250a()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x01d8:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x01ea
            java.lang.Object r6 = r3.next()
            boolean r8 = r6 instanceof sk1.C63965x
            if (r8 == 0) goto L_0x01d8
            r4.add(r6)
            goto L_0x01d8
        L_0x01ea:
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x0224
            fj1.b r3 = r0.f175774g
            androidx.lifecycle.i0 r3 = r3.mo71262a(r7)
            cl1.h1 r3 = (cl1.C54979h1) r3
            p40.a<cm1.i2> r3 = r3.f154140o
            java.util.List r3 = r3.mo87250a()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0209:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x021b
            java.lang.Object r6 = r3.next()
            boolean r8 = r6 instanceof sk1.C63964u
            if (r8 == 0) goto L_0x0209
            r4.add(r6)
            goto L_0x0209
        L_0x021b:
            boolean r3 = r4.isEmpty()
            if (r3 == 0) goto L_0x0224
            r18.mo86742I()
        L_0x0224:
            fj1.b r3 = r0.f175774g
            androidx.lifecycle.i0 r3 = r3.mo71262a(r7)
            cl1.h1 r3 = (cl1.C54979h1) r3
            p40.a<cm1.i2> r3 = r3.f154140o
            r0.mo86743J(r3, r1)
            pp1.g r1 = r0.f175778n
            if (r1 == 0) goto L_0x0238
            r1.mo87495b()
        L_0x0238:
            fj1.b r1 = r0.f175774g
            androidx.lifecycle.i0 r1 = r1.mo71262a(r7)
            cl1.h1 r1 = (cl1.C54979h1) r1
            boolean r1 = r1.mo75938d3()
            if (r1 == 0) goto L_0x02fd
            r18.mo86768x()
            goto L_0x02fd
        L_0x024b:
            fj1.b r3 = r0.f175774g
            androidx.lifecycle.i0 r3 = r3.mo71262a(r7)
            cl1.h1 r3 = (cl1.C54979h1) r3
            p40.a<cm1.i2> r3 = r3.f154140o
            if (r3 == 0) goto L_0x0278
            java.util.List r3 = r3.mo87250a()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0266:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x0279
            java.lang.Object r10 = r3.next()
            boolean r11 = r10 instanceof sk1.C63965x
            if (r11 == 0) goto L_0x0266
            r8.add(r10)
            goto L_0x0266
        L_0x0278:
            r8 = r5
        L_0x0279:
            if (r8 == 0) goto L_0x0284
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L_0x0282
            goto L_0x0284
        L_0x0282:
            r3 = 0
            goto L_0x0285
        L_0x0284:
            r3 = 1
        L_0x0285:
            if (r3 == 0) goto L_0x02d8
            fj1.b r3 = r0.f175774g
            androidx.lifecycle.i0 r3 = r3.mo71262a(r7)
            cl1.h1 r3 = (cl1.C54979h1) r3
            p40.a<cm1.i2> r3 = r3.f154140o
            if (r3 == 0) goto L_0x02b4
            java.util.List r3 = r3.mo87250a()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x02a2:
            boolean r10 = r3.hasNext()
            if (r10 == 0) goto L_0x02b5
            java.lang.Object r10 = r3.next()
            boolean r11 = r10 instanceof sk1.C63964u
            if (r11 == 0) goto L_0x02a2
            r8.add(r10)
            goto L_0x02a2
        L_0x02b4:
            r8 = r5
        L_0x02b5:
            if (r8 == 0) goto L_0x02bd
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L_0x02be
        L_0x02bd:
            r4 = 1
        L_0x02be:
            if (r4 == 0) goto L_0x02d8
            r18.mo86742I()
            fj1.b r3 = r0.f175774g
            androidx.lifecycle.i0 r3 = r3.mo71262a(r7)
            cl1.h1 r3 = (cl1.C54979h1) r3
            p40.a<cm1.i2> r3 = r3.f154140o
            r0.mo86743J(r3, r1)
            pp1.g r1 = r0.f175778n
            if (r1 == 0) goto L_0x02ec
            r1.mo87495b()
            goto L_0x02ec
        L_0x02d8:
            fj1.b r3 = r0.f175774g
            androidx.lifecycle.i0 r3 = r3.mo71262a(r7)
            cl1.h1 r3 = (cl1.C54979h1) r3
            p40.a<cm1.i2> r3 = r3.f154140o
            r0.mo86743J(r3, r1)
            pp1.j r1 = r0.f175777j
            if (r1 == 0) goto L_0x0347
            r1.mo87500d()
        L_0x02ec:
            fj1.b r1 = r0.f175774g
            androidx.lifecycle.i0 r1 = r1.mo71262a(r7)
            cl1.h1 r1 = (cl1.C54979h1) r1
            boolean r1 = r1.mo75938d3()
            if (r1 == 0) goto L_0x02fd
            r18.mo86768x()
        L_0x02fd:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "onGetShoppingListSuccess size:"
            r1.append(r3)
            fj1.b r3 = r0.f175774g
            androidx.lifecycle.i0 r3 = r3.mo71262a(r7)
            cl1.h1 r3 = (cl1.C54979h1) r3
            p40.a<cm1.i2> r3 = r3.f154140o
            if (r3 == 0) goto L_0x031c
            int r3 = r3.mo87252c()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L_0x031d
        L_0x031c:
            r3 = r5
        L_0x031d:
            r1.append(r3)
            java.lang.String r3 = ", checkProductFirst:"
            r1.append(r3)
            r3 = r19
            r1.append(r3)
            java.lang.String r3 = ", refresh:"
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Finder.LiveShoppingListPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            pp1.j r0 = r0.f175777j
            if (r0 == 0) goto L_0x0343
            r0.mo87498b()
        L_0x0342:
            return
        L_0x0343:
            gy3.C87412m.m108603p(r9)
            throw r5
        L_0x0347:
            gy3.C87412m.m108603p(r9)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.C61817a.m72535d(np1.a, boolean, android.os.Bundle, boolean, te3.i11):void");
    }

    /* renamed from: A */
    public final void mo86734A(Bundle bundle) {
        Log.m105924i("Finder.LiveShoppingListPlugin", "refresh shop page,view visibility:" + this.f175772e.getVisibility());
        m72531L(this, bundle, mo86766v() ? 0 : 3, true, false, 8, (Object) null);
    }

    /* renamed from: B */
    public final void mo86735B(Bundle bundle) {
        C62660c cVar = this.f175776i;
        if (cVar != null) {
            cVar.mo10792g(8);
        }
        if (!mo86766v()) {
            C7335d c = C86312j.m106911c(C54116w.class);
            C87412m.m108593f(c, "getService(HellLiveVisitorReoprter::class.java)");
            C54116w.Rx0((C54116w) c, C54067f0.C54081r0.CommerceActionExitHalfPage, (String) null, (String) null, (String) null, (String) null, (String) null, 0, 0, (JSONObject) null, 504, (Object) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0093, code lost:
        if (r0 == false) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01bf, code lost:
        if ((r1 != null ? r1.mo88856d() : false) == true) goto L_0x01c3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x019e  */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86736C(android.os.Bundle r23) {
        /*
            r22 = this;
            r7 = r22
            java.lang.Class<ak1.w> r8 = ak1.C54116w.class
            java.lang.Class<cl1.h1> r9 = cl1.C54979h1.class
            java.lang.Class<cl1.o> r10 = cl1.C54991o.class
            boolean r11 = r22.mo86766v()
            ok1.e r0 = ok1.C62042e.f176370a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onShoppingListShow param:"
            r1.append(r2)
            r2 = r23
            r1.append(r2)
            java.lang.String r3 = ",inAnchorMode:"
            r1.append(r3)
            r1.append(r11)
            java.lang.String r3 = ", liveStatus:"
            r1.append(r3)
            fj1.b r3 = r7.f175774g
            androidx.lifecycle.i0 r3 = r3.mo71262a(r10)
            cl1.o r3 = (cl1.C54991o) r3
            int r3 = r3.f154295b1
            r1.append(r3)
            java.lang.String r3 = ", stack:"
            r1.append(r3)
            com.tencent.mm.sdk.platformtools.MMStack r3 = com.tencent.p014mm.sdk.platformtools.Util.getStack()
            r1.append(r3)
            r3 = 44
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "Finder.LiveShoppingListPlugin"
            r0.mo86998D1(r3, r1)
            android.widget.FrameLayout r0 = r22.mo86757n()
            r1 = 8
            r0.setVisibility(r1)
            android.widget.FrameLayout r0 = r22.mo86754k()
            r0.setVisibility(r1)
            int r0 = r7.f175771d
            r1 = 2
            r12 = 1
            r13 = 0
            if (r0 == r1) goto L_0x0095
            fj1.b r0 = r7.f175774g
            androidx.lifecycle.i0 r0 = r0.mo71262a(r10)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r0 = r0.mo75999e4()
            if (r0 != 0) goto L_0x0095
            if (r11 == 0) goto L_0x00ab
            fj1.b r0 = r7.f175774g
            androidx.lifecycle.i0 r0 = r0.mo71262a(r10)
            cl1.o r0 = (cl1.C54991o) r0
            boolean r3 = r0.mo75995c4()
            if (r3 != 0) goto L_0x0092
            int r0 = r0.f154295b1
            if (r0 != r12) goto L_0x008c
            r0 = 1
            goto L_0x008d
        L_0x008c:
            r0 = 0
        L_0x008d:
            if (r0 == 0) goto L_0x0090
            goto L_0x0092
        L_0x0090:
            r0 = 0
            goto L_0x0093
        L_0x0092:
            r0 = 1
        L_0x0093:
            if (r0 == 0) goto L_0x00ab
        L_0x0095:
            if (r11 == 0) goto L_0x0099
            r3 = 0
            goto L_0x009a
        L_0x0099:
            r3 = 2
        L_0x009a:
            r4 = 0
            r5 = 0
            r6 = 12
            r14 = 0
            r0 = r22
            r1 = r23
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            m72531L(r0, r1, r2, r3, r4, r5, r6)
        L_0x00ab:
            java.lang.String r0 = ""
            if (r11 == 0) goto L_0x019e
            boolean r1 = r22.mo86767w()
            if (r1 == 0) goto L_0x00c1
            di3.d r0 = di3.C86312j.m106911c(r8)
            ak1.w r0 = (ak1.C54116w) r0
            r1 = 3
            r0.Ix0(r1, r13, r13)
            goto L_0x020d
        L_0x00c1:
            fj1.b r1 = r7.f175774g
            java.lang.Class<ak1.o> r2 = ak1.C54108o.class
            java.lang.String r3 = "buContext"
            gy3.C87412m.m108594g(r1, r3)
            org.json.JSONObject r3 = new org.json.JSONObject
            r3.<init>()
            java.lang.String r4 = "type"
            r3.put(r4, r12)
            di3.d r5 = di3.C86312j.m106911c(r2)
            ak1.o r5 = (ak1.C54108o) r5
            r5.getClass()
            ak1.f0 r5 = ak1.C54108o.f151869h
            java.lang.String r6 = r5.f151475s
            java.lang.String r8 = "sessionid"
            r3.put(r8, r6)
            java.lang.String r6 = "shopwindowid"
            r3.put(r6, r0)
            androidx.lifecycle.i0 r6 = r1.mo71262a(r10)
            cl1.o r6 = (cl1.C54991o) r6
            boolean r6 = r6.mo75995c4()
            java.lang.String r8 = "getService(HellLiveReport::class.java)"
            if (r6 == 0) goto L_0x0114
            di3.d r0 = di3.C86312j.m106911c(r2)
            gy3.C87412m.m108593f(r0, r8)
            r9 = r0
            ht1.j5 r9 = (ht1.C8777j5) r9
            r10 = 6
            java.lang.String r12 = r3.toString()
            r13 = 0
            r14 = 4
            r15 = 0
            ht1.C8777j5.C8778a.m8600a(r9, r10, r12, r13, r14, r15)
            goto L_0x020d
        L_0x0114:
            androidx.lifecycle.i0 r6 = r1.mo71262a(r10)
            cl1.o r6 = (cl1.C54991o) r6
            boolean r6 = r6.mo75999e4()
            if (r6 == 0) goto L_0x020d
            di3.d r6 = di3.C86312j.m106911c(r2)
            ak1.o r6 = (ak1.C54108o) r6
            r6.getClass()
            boolean r5 = r5.f151450c0
            if (r5 == 0) goto L_0x0132
            r5 = 9
            r3.put(r4, r5)
        L_0x0132:
            androidx.lifecycle.i0 r4 = r1.mo71262a(r9)
            cl1.h1 r4 = (cl1.C54979h1) r4
            java.lang.String r4 = r4.f154151z
            java.lang.String r5 = "appid"
            r3.put(r5, r4)
            java.lang.Class<cl1.u> r4 = cl1.C55001u.class
            androidx.lifecycle.i0 r4 = r1.mo71262a(r4)
            cl1.u r4 = (cl1.C55001u) r4
            te3.c21 r4 = r4.f154420q
            long r4 = r4.f182392d
            r10 = 0
            java.lang.String r6 = "liveid"
            int r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x0157
            r3.put(r6, r0)
            goto L_0x0166
        L_0x0157:
            java.lang.Class<kq.h> r10 = p185kq.C10383h.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            kq.h r10 = (p185kq.C10383h) r10
            java.lang.String r4 = r10.mo10700XQ(r4)
            r3.put(r6, r4)
        L_0x0166:
            java.lang.String r4 = t91.C64208c.f181967q
            java.lang.String r5 = "clickid"
            r3.put(r5, r4)
            t91.C64208c.f181967q = r0
            androidx.lifecycle.i0 r1 = r1.mo71262a(r9)
            cl1.h1 r1 = (cl1.C54979h1) r1
            cm1.i2 r1 = r1.f154147v
            if (r1 == 0) goto L_0x0181
            long r0 = r1.getItemId()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0181:
            java.lang.String r1 = "productid"
            r3.put(r1, r0)
            di3.d r0 = di3.C86312j.m106911c(r2)
            gy3.C87412m.m108593f(r0, r8)
            r9 = r0
            ht1.j5 r9 = (ht1.C8777j5) r9
            ak1.g0 r10 = ak1.C0073g0.LIVE_ANCHOR_ACTION_COMMERCE
            java.lang.String r11 = r3.toString()
            r12 = 0
            r13 = 4
            r14 = 0
            ht1.C8777j5.C8778a.m8605f(r9, r10, r11, r12, r13, r14)
            goto L_0x020d
        L_0x019e:
            qj1.c r1 = r7.f175776i
            r2 = 0
            if (r1 == 0) goto L_0x01c2
            java.lang.Class<qj1.dg> r3 = qj1.C62741dg.class
            qj1.c r1 = r1.mo87687E0(r3)
            qj1.dg r1 = (qj1.C62741dg) r1
            if (r1 == 0) goto L_0x01c2
            sp1.q0 r1 = r1.f178123r
            boolean r3 = r1 instanceof sp1.C64123r0
            if (r3 == 0) goto L_0x01b6
            sp1.r0 r1 = (sp1.C64123r0) r1
            goto L_0x01b7
        L_0x01b6:
            r1 = r2
        L_0x01b7:
            if (r1 == 0) goto L_0x01be
            boolean r1 = r1.mo88856d()
            goto L_0x01bf
        L_0x01be:
            r1 = 0
        L_0x01bf:
            if (r1 != r12) goto L_0x01c2
            goto L_0x01c3
        L_0x01c2:
            r12 = 0
        L_0x01c3:
            if (r12 == 0) goto L_0x01ed
            np1.i0 r1 = np1.C61866i0.f175909a
            fj1.b r3 = r7.f175774g
            androidx.lifecycle.i0 r3 = r3.mo71262a(r9)
            cl1.h1 r3 = (cl1.C54979h1) r3
            te3.vx0 r3 = r3.f154126S
            if (r3 == 0) goto L_0x01e9
            te3.w44 r3 = r3.f143755d
            if (r3 == 0) goto L_0x01e9
            te3.u44 r3 = r3.f143856e
            if (r3 == 0) goto L_0x01e9
            java.util.LinkedList<java.lang.String> r3 = r3.f142599g
            if (r3 == 0) goto L_0x01e9
            java.lang.Object r3 = sx3.C110818d0.m150916N(r3)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L_0x01e8
            goto L_0x01e9
        L_0x01e8:
            r0 = r3
        L_0x01e9:
            org.json.JSONObject r2 = r1.mo86793d(r0, r2)
        L_0x01ed:
            r19 = r2
            di3.d r0 = di3.C86312j.m106911c(r8)
            java.lang.String r1 = "getService(HellLiveVisitorReoprter::class.java)"
            gy3.C87412m.m108593f(r0, r1)
            r9 = r0
            ak1.w r9 = (ak1.C54116w) r9
            ak1.f0$r0 r10 = ak1.C54067f0.C54081r0.CommerceActionShoppingButtonClick
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r20 = 248(0xf8, float:3.48E-43)
            r21 = 0
            ak1.C54116w.Rx0(r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21)
        L_0x020d:
            r22.mo86750g()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.C61817a.mo86736C(android.os.Bundle):void");
    }

    /* renamed from: D */
    public final void mo86737D(C86299o oVar) {
        C61885z zVar;
        C56032b F0;
        C54804r0 r0Var = C54804r0.f153631a;
        Context context = this.f175772e.getContext();
        C87412m.m108593f(context, "root.context");
        C45795b bVar = this.f175774g;
        C62660c cVar = this.f175776i;
        if (cVar == null || (F0 = cVar.mo14482F0()) == null) {
            zVar = null;
        } else {
            String str = oVar.f250930b;
            C87412m.m108593f(str, "bundle.appId");
            zVar = new C61885z(F0, str);
        }
        r0Var.mo75766h(context, bVar, oVar, true, zVar);
    }

    /* renamed from: E */
    public final void mo86738E(C86299o oVar) {
        C54804r0 r0Var = C54804r0.f153631a;
        Context context = this.f175772e.getContext();
        C87412m.m108593f(context, "root.context");
        C45795b bVar = this.f175774g;
        C62660c cVar = this.f175776i;
        r0Var.mo75767i(context, bVar, oVar, cVar != null ? cVar.mo14482F0() : null);
    }

    /* renamed from: F */
    public final void mo86739F(boolean z) {
        String str;
        if (mo86757n().getVisibility() == 0 && !z) {
            return;
        }
        if (mo86754k().getVisibility() != 0 || z) {
            C62461j jVar = this.f175777j;
            if (jVar != null) {
                jVar.mo87513p((String) null);
                C62461j jVar2 = this.f175777j;
                if (jVar2 != null) {
                    Object value = ((C36570n) jVar2.f177489q).getValue();
                    C87412m.m108593f(value, "<get-orderTv>(...)");
                    TextView textView = (TextView) value;
                    if (mo86766v()) {
                        C62461j jVar3 = this.f175777j;
                        if (jVar3 != null) {
                            View i = jVar3.mo87505i();
                            C9556a aVar = new C9556a();
                            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                            aVar.mo10233c(8);
                            View view = i;
                            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "setMainListTopButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            i.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "setMainListTopButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            str = "";
                        } else {
                            C87412m.m108603p("headerHolder");
                            throw null;
                        }
                    } else {
                        C62461j jVar4 = this.f175777j;
                        if (jVar4 != null) {
                            View i2 = jVar4.mo87505i();
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view2 = i2;
                            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "setMainListTopButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            i2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "setMainListTopButton", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            str = this.f175772e.getContext().getString(C0966R.string.e87);
                        } else {
                            C87412m.m108603p("headerHolder");
                            throw null;
                        }
                    }
                    textView.setText(str);
                    return;
                }
                C87412m.m108603p("headerHolder");
                throw null;
            }
            C87412m.m108603p("headerHolder");
            throw null;
        }
    }

    /* renamed from: G */
    public final void mo86740G() {
        LinkedList<C63965x> linkedList = ((C54979h1) this.f175774g.mo71262a(C54979h1.class)).f154144s;
        if (!(linkedList == null || linkedList.isEmpty())) {
            mo86760p(false, false);
            C62457g gVar = this.f175778n;
            if (gVar != null) {
                gVar.mo87494a(false, mo86766v());
            }
            mo86755l().setVisibility(8);
            C62461j jVar = this.f175777j;
            if (jVar != null) {
                View o = jVar.mo87511o();
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(o, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showCanUseCouponProductList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                o.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(o, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showCanUseCouponProductList", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo86758o().setVisibility(0);
                mo86756m().setVisibility(8);
                mo86739F(false);
                mo86749f(Boolean.TRUE);
                FinderLiveShoppingPanel finderLiveShoppingPanel = this.f175780p;
                if (finderLiveShoppingPanel != null) {
                    finderLiveShoppingPanel.post(new C61839s(this));
                    C62660c cVar = this.f175776i;
                    if (cVar != null) {
                        cVar.mo10792g(0);
                        return;
                    }
                    return;
                }
                C87412m.m108603p("contentGroup");
                throw null;
            }
            C87412m.m108603p("headerHolder");
            throw null;
        }
    }

    /* renamed from: H */
    public final void mo86741H() {
        Log.m105924i("Finder.LiveShoppingListPlugin", "showEmptyShoppingPanel");
        mo86755l().setVisibility(8);
        mo86756m().setVisibility(8);
        C62457g gVar = this.f175778n;
        if (gVar != null) {
            gVar.mo87494a(false, mo86766v());
        }
        C62461j jVar = this.f175777j;
        if (jVar != null) {
            View o = jVar.mo87511o();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(o, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showEmptyShoppingPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            o.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(o, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showEmptyShoppingPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo86758o().setVisibility(8);
            FinderLiveShoppingPanel finderLiveShoppingPanel = this.f175780p;
            if (finderLiveShoppingPanel != null) {
                finderLiveShoppingPanel.post(new C61840t(this));
                C62660c cVar = this.f175776i;
                if (cVar != null) {
                    cVar.mo10792g(0);
                    return;
                }
                return;
            }
            C87412m.m108603p("contentGroup");
            throw null;
        }
        C87412m.m108603p("headerHolder");
        throw null;
    }

    /* renamed from: I */
    public final void mo86742I() {
        Log.m105924i("Finder.LiveShoppingListPlugin", "showEmptyContent");
        C62461j jVar = this.f175777j;
        if (jVar != null) {
            View j = jVar.mo87506j();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(j, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodsEmptyContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            j.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(j, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodsEmptyContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            try {
                if (this.f175778n == null) {
                    C61866i0 i0Var = C61866i0.f175909a;
                    ViewGroup viewGroup = this.f175772e;
                    i0Var.getClass();
                    C87412m.m108594g(viewGroup, "root");
                    View inflate = ((ViewStub) viewGroup.findViewById(C0966R.C0970id.dyy)).inflate();
                    C87412m.m108593f(inflate, "stub.inflate()");
                    this.f175778n = new C62457g(inflate, this);
                }
            } catch (Exception e) {
                C58739j4.f168176a.mo83712h0(e, "Finder.LiveShoppingListPlugin-initEmptyHolder");
            }
            C62457g gVar = this.f175778n;
            if (gVar != null) {
                gVar.mo87494a(true, mo86766v());
            }
            mo86755l().setVisibility(8);
            C62461j jVar2 = this.f175777j;
            if (jVar2 != null) {
                View o = jVar2.mo87511o();
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(0);
                C117292a.m165358d(o, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodsEmptyContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                o.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(o, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodsEmptyContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                C62461j jVar3 = this.f175777j;
                if (jVar3 != null) {
                    jVar3.mo87513p((String) null);
                    mo86739F(false);
                    mo86756m().setVisibility(8);
                    return;
                }
                C87412m.m108603p("headerHolder");
                throw null;
            }
            C87412m.m108603p("headerHolder");
            throw null;
        }
        C87412m.m108603p("headerHolder");
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x0128 A[LOOP:2: B:36:0x0105->B:48:0x0128, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0126 A[SYNTHETIC] */
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86743J(p40.C62192a<cm1.C0740i2> r18, android.os.Bundle r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "productList"
            gy3.C87412m.m108594g(r1, r3)
            java.util.List r3 = r18.mo87250a()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x001a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x002c
            java.lang.Object r5 = r3.next()
            boolean r6 = r5 instanceof sk1.C63965x
            if (r6 == 0) goto L_0x001a
            r4.add(r5)
            goto L_0x001a
        L_0x002c:
            boolean r3 = r4.isEmpty()
            r4 = 1
            r3 = r3 ^ r4
            r5 = 0
            if (r3 == 0) goto L_0x0040
            pp1.g r3 = r0.f175778n
            if (r3 == 0) goto L_0x0040
            boolean r6 = r17.mo86766v()
            r3.mo87494a(r5, r6)
        L_0x0040:
            android.widget.ProgressBar r3 = r17.mo86755l()
            r6 = 8
            r3.setVisibility(r6)
            pp1.j r3 = r0.f175777j
            if (r3 == 0) goto L_0x01fc
            android.view.View r3 = r3.mo87511o()
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            r15.mo10233c(r8)
            java.lang.Object[] r9 = r15.mo10232b()
            java.lang.String r10 = "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal"
            java.lang.String r11 = "showProductList"
            java.lang.String r12 = "(Lcom/tencent/mm/kt/collections/MMSynchronizedList;Landroid/os/Bundle;)V"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r8 = r3
            r7 = r15
            r15 = r16
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r7 = r7.mo10231a(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r3.setVisibility(r7)
            java.lang.String r9 = "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal"
            java.lang.String r10 = "showProductList"
            java.lang.String r11 = "(Lcom/tencent/mm/kt/collections/MMSynchronizedList;Landroid/os/Bundle;)V"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView r3 = r17.mo86758o()
            r3.setVisibility(r5)
            android.widget.TextView r3 = r17.mo86756m()
            r3.setVisibility(r6)
            r0.mo86739F(r5)
            op1.h r3 = r0.f175761C
            r3.mo87166c6(r1)
            if (r2 == 0) goto L_0x0147
            java.lang.String r3 = "PARAM_FINDER_LIVE_BUBBLE_PRODUCTID"
            boolean r6 = r2.containsKey(r3)
            java.lang.String r7 = "PARAM_FINDER_LIVE_BUBBLE_ADID"
            if (r6 != 0) goto L_0x00be
            boolean r6 = r2.containsKey(r7)
            if (r6 == 0) goto L_0x0147
        L_0x00be:
            r8 = 0
            long r10 = r2.getLong(r3, r8)
            long r2 = r2.getLong(r7, r8)
            r6 = -1
            int r7 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x00f8
            op1.h r2 = r0.f175761C
            java.util.LinkedList<cm1.i2> r2 = r2.f176535i
            java.util.Iterator r2 = r2.iterator()
            r3 = 0
        L_0x00d6:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto L_0x012b
            java.lang.Object r7 = r2.next()
            cm1.i2 r7 = (cm1.C0740i2) r7
            boolean r8 = r7 instanceof sk1.C63965x
            if (r8 == 0) goto L_0x00f0
            sk1.x r7 = (sk1.C63965x) r7
            long r7 = r7.f181347t
            int r9 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r9 != 0) goto L_0x00f0
            r7 = 1
            goto L_0x00f1
        L_0x00f0:
            r7 = 0
        L_0x00f1:
            if (r7 == 0) goto L_0x00f5
            r6 = r3
            goto L_0x012b
        L_0x00f5:
            int r3 = r3 + 1
            goto L_0x00d6
        L_0x00f8:
            int r7 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r7 == 0) goto L_0x012b
            op1.h r7 = r0.f175761C
            java.util.LinkedList<cm1.i2> r7 = r7.f176535i
            java.util.Iterator r7 = r7.iterator()
            r10 = 0
        L_0x0105:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto L_0x012b
            java.lang.Object r11 = r7.next()
            cm1.i2 r11 = (cm1.C0740i2) r11
            boolean r12 = r11 instanceof sk1.C63964u
            if (r12 == 0) goto L_0x0123
            sk1.u r11 = (sk1.C63964u) r11
            long r11 = r11.f181326t
            int r13 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r13 == 0) goto L_0x0123
            int r13 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r13 != 0) goto L_0x0123
            r11 = 1
            goto L_0x0124
        L_0x0123:
            r11 = 0
        L_0x0124:
            if (r11 == 0) goto L_0x0128
            r6 = r10
            goto L_0x012b
        L_0x0128:
            int r10 = r10 + 1
            goto L_0x0105
        L_0x012b:
            if (r6 < 0) goto L_0x0147
            op1.h r2 = r0.f175761C
            java.util.LinkedList<cm1.i2> r2 = r2.f176535i
            int r2 = r2.size()
            if (r6 >= r2) goto L_0x0147
            com.tencent.mm.plugin.finder.live.widget.FinderLiveFixClickIssueRecyclerView r2 = r17.mo86758o()
            android.view.ViewTreeObserver r2 = r2.getViewTreeObserver()
            np1.a$u r3 = new np1.a$u
            r3.<init>(r0, r6)
            r2.addOnGlobalLayoutListener(r3)
        L_0x0147:
            java.util.HashMap<java.lang.String, di0.o> r2 = r0.f175770L
            r2.clear()
            np1.t r2 = np1.C61879t.f175959d
            java.util.List r1 = r1.mo87251b(r2)
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
            r7 = 0
        L_0x0159:
            boolean r2 = r1.hasNext()
            r3 = 3
            if (r2 == 0) goto L_0x0195
            java.lang.Object r2 = r1.next()
            cm1.i2 r2 = (cm1.C0740i2) r2
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.convert.ShopWindowShelfProductItem"
            gy3.C87412m.m108592e(r2, r6)
            sk1.x r2 = (sk1.C63965x) r2
            int r6 = r2.f181336D
            if (r6 != r4) goto L_0x017c
            te3.l40 r2 = r2.f181335C
            if (r2 == 0) goto L_0x0159
            ok1.e r6 = ok1.C62042e.f176370a
            di0.o r7 = r6.mo87118t0(r2, r3)
            goto L_0x0159
        L_0x017c:
            te3.l40 r2 = r2.f181335C
            if (r2 == 0) goto L_0x0159
            java.util.HashMap<java.lang.String, di0.o> r6 = r0.f175770L
            java.lang.String r8 = r2.f184031d
            if (r8 != 0) goto L_0x0188
            java.lang.String r8 = ""
        L_0x0188:
            ok1.e r9 = ok1.C62042e.f176370a
            di0.o r2 = r9.mo87118t0(r2, r3)
            java.lang.Object r2 = r6.put(r8, r2)
            di0.o r2 = (di0.C86299o) r2
            goto L_0x0159
        L_0x0195:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "prehotMiniprogram promotingBundle:"
            r1.append(r2)
            r1.append(r7)
            java.lang.String r2 = ",bundle size:"
            r1.append(r2)
            java.util.HashMap<java.lang.String, di0.o> r2 = r0.f175770L
            int r2 = r2.size()
            r1.append(r2)
            java.lang.String r2 = ",MAX_PREHOT_SIZE:3"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Finder.LiveShoppingListPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            if (r7 == 0) goto L_0x01d1
            np1.w r1 = np1.C61882w.f175962a
            fj1.b r2 = r0.f175774g
            r1.mo86816c(r2, r7, r5)
            java.util.HashMap<java.lang.String, di0.o> r1 = r0.f175770L
            java.lang.String r2 = r7.f250930b
            java.lang.Object r1 = r1.remove(r2)
            di0.o r1 = (di0.C86299o) r1
        L_0x01d1:
            java.util.HashMap<java.lang.String, di0.o> r1 = r0.f175770L
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x01dc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x01fb
            java.lang.Object r4 = r1.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            int r6 = r2 + 1
            if (r2 >= r3) goto L_0x01f9
            np1.w r2 = np1.C61882w.f175962a
            fj1.b r7 = r0.f175774g
            java.lang.Object r4 = r4.getValue()
            di0.o r4 = (di0.C86299o) r4
            r2.mo86816c(r7, r4, r5)
        L_0x01f9:
            r2 = r6
            goto L_0x01dc
        L_0x01fb:
            return
        L_0x01fc:
            java.lang.String r1 = "headerHolder"
            gy3.C87412m.m108603p(r1)
            r1 = 0
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.C61817a.mo86743J(p40.a, android.os.Bundle):void");
    }

    /* renamed from: K */
    public final void mo86744K(Bundle bundle, int i, boolean z, boolean z2) {
        Bundle bundle2 = bundle;
        boolean z3 = z2;
        Class cls = C54979h1.class;
        ((C58052j1) ((C54979h1) this.f175774g.mo71262a(cls)).f154129V).setValue(Boolean.FALSE);
        boolean z4 = bundle2 != null && bundle2.getBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", false);
        Log.m105924i("Finder.LiveShoppingListPlugin", "showShoppingContent is refresh:" + z + "，checkProductFirst:" + z4 + ",pullScene:" + i + ",fromChildPage:" + z3);
        if (!z3) {
            mo86760p(false, false);
            C62660c cVar = this.f175776i;
            if (cVar != null) {
                C11207i.m11072h(cVar, C53872d1.f151119c, (C53934p0) null, new C61842v(this, i, z4, bundle, z, (C15601d<? super C61842v>) null), 2, (Object) null);
            }
        }
        C62461j jVar = this.f175777j;
        if (jVar != null) {
            jVar.mo87498b();
            this.f175766H = false;
            if (!mo86765u(z4)) {
                C62660c cVar2 = this.f175776i;
                if (cVar2 != null) {
                    cVar2.mo10792g(0);
                }
                if (((C54979h1) this.f175774g.mo71262a(cls)).f154140o.mo87254e()) {
                    Log.m105924i("Finder.LiveShoppingListPlugin", "showShoppingLoading");
                    mo86755l().setVisibility(0);
                    mo86756m().setVisibility(8);
                    C62457g gVar = this.f175778n;
                    if (gVar != null) {
                        gVar.mo87494a(false, mo86766v());
                    }
                    C62461j jVar2 = this.f175777j;
                    if (jVar2 != null) {
                        View o = jVar2.mo87511o();
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        View view = o;
                        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showShoppingLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        o.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(view, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showShoppingLoading", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        mo86758o().setVisibility(8);
                        FinderLiveShoppingPanel finderLiveShoppingPanel = this.f175780p;
                        if (finderLiveShoppingPanel != null) {
                            finderLiveShoppingPanel.post(new C61880u(this));
                        } else {
                            C87412m.m108603p("contentGroup");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("headerHolder");
                        throw null;
                    }
                } else {
                    mo86741H();
                    mo86743J(((C54979h1) this.f175774g.mo71262a(cls)).f154140o, bundle2);
                }
            }
        } else {
            C87412m.m108603p("headerHolder");
            throw null;
        }
    }

    /* renamed from: M */
    public final void mo86745M() {
        C62461j jVar = this.f175777j;
        if (jVar != null) {
            jVar.mo87502f().setOnClickListener((View.OnClickListener) null);
            jVar.mo87505i().setOnClickListener((View.OnClickListener) null);
            jVar.mo87506j().setOnClickListener((View.OnClickListener) null);
            View view = this.f175779o;
            if (view != null) {
                view.setOnClickListener((View.OnClickListener) null);
                RecyclerView.C16622o oVar = this.f175769K;
                if (oVar != null) {
                    mo86758o().mo17096l1(oVar);
                }
                this.f175769K = null;
                FinderLiveShoppingPanel finderLiveShoppingPanel = this.f175780p;
                if (finderLiveShoppingPanel != null) {
                    finderLiveShoppingPanel.setOnVisibilityListener((C32226l<? super Boolean, C13598b0>) null);
                } else {
                    C87412m.m108603p("contentGroup");
                    throw null;
                }
            } else {
                C87412m.m108603p("blankArea");
                throw null;
            }
        } else {
            C87412m.m108603p("headerHolder");
            throw null;
        }
    }

    /* renamed from: N */
    public final void mo86746N() {
        C62084h hVar = this.f175761C;
        hVar.f176543t = null;
        hVar.f176544u = null;
        hVar.f176545v = null;
        hVar.f176546w = null;
        hVar.f176547x = null;
        hVar.f176548y = null;
        hVar.f176549z = null;
        this.f175762D.f176497p = null;
        C62084h hVar2 = this.f175763E;
        hVar2.f176543t = null;
        hVar2.f176544u = null;
        hVar2.f176545v = null;
        hVar2.f176546w = null;
        hVar2.f176547x = null;
        hVar2.f176548y = null;
        hVar2.f176549z = null;
    }

    /* renamed from: O */
    public final void mo86747O() {
        T t;
        boolean z;
        Class cls = C54979h1.class;
        C0740i2 i2Var = ((C54979h1) this.f175774g.mo71262a(cls)).f154147v;
        if (i2Var instanceof C13696v) {
            C58124b bVar = this.f175773f;
            C58124b.C58125b bVar2 = C58124b.C58125b.FINDER_LIVE_PROMTE_REPLACE;
            Bundle bundle = new Bundle();
            Iterator<T> it = ((C54979h1) this.f175774g.mo71262a(cls)).mo75937c3().iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                C0740i2 i2Var2 = (C0740i2) t;
                if (!(i2Var2 instanceof C13696v) || !C87412m.m108589b(((C13696v) i2Var2).f38763u, ((C13696v) i2Var).f38763u)) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    break;
                }
            }
            C0740i2 i2Var3 = (C0740i2) t;
            if (i2Var3 != null) {
                bundle.putByteArray("PARAM_FINDER_LIVE_PROMOTE_DATA", ((C13696v) i2Var3).f38761s.toByteArray());
            }
            C13598b0 b0Var = C13598b0.f38549a;
            bVar.statusChange(bVar2, bundle);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0021, code lost:
        r6 = r6.f183575e;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86748e() {
        /*
            r23 = this;
            r0 = r23
            java.lang.Class<ak1.o> r1 = ak1.C54108o.class
            java.lang.Class<cl1.o> r2 = cl1.C54991o.class
            java.lang.Class<cl1.u> r3 = cl1.C55001u.class
            java.lang.Class<cl1.h1> r4 = cl1.C54979h1.class
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "add product appId:"
            r5.append(r6)
            fj1.b r6 = r0.f175774g
            androidx.lifecycle.i0 r6 = r6.mo71262a(r4)
            cl1.h1 r6 = (cl1.C54979h1) r6
            te3.i11 r6 = r6.f154139n
            r7 = 0
            if (r6 == 0) goto L_0x0028
            te3.jp1 r6 = r6.f183575e
            if (r6 == 0) goto L_0x0028
            java.lang.String r6 = r6.f136237d
            goto L_0x0029
        L_0x0028:
            r6 = r7
        L_0x0029:
            r5.append(r6)
            java.lang.String r6 = ",path:"
            r5.append(r6)
            fj1.b r6 = r0.f175774g
            androidx.lifecycle.i0 r6 = r6.mo71262a(r4)
            cl1.h1 r6 = (cl1.C54979h1) r6
            te3.i11 r6 = r6.f154139n
            if (r6 == 0) goto L_0x0043
            te3.jp1 r6 = r6.f183575e
            if (r6 == 0) goto L_0x0043
            java.lang.String r7 = r6.f136238e
        L_0x0043:
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "Finder.LiveShoppingListPlugin"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r6, r5)
            np1.v r5 = np1.C61881v.f175961a
            fj1.b r6 = r0.f175774g
            np1.a$a r7 = new np1.a$a
            r7.<init>(r0)
            java.lang.String r8 = "liveData"
            gy3.C87412m.m108594g(r6, r8)
            byte[] r8 = com.tencent.p014mm.sdk.platformtools.Util.getUuidRandom()
            java.lang.String r13 = r8.toString()
            di0.o r8 = new di0.o
            r8.<init>()
            androidx.lifecycle.i0 r9 = r6.mo71262a(r4)
            cl1.h1 r9 = (cl1.C54979h1) r9
            te3.i11 r9 = r9.f154139n
            java.lang.String r14 = ""
            if (r9 == 0) goto L_0x007e
            te3.jp1 r9 = r9.f183575e
            if (r9 == 0) goto L_0x007e
            java.lang.String r9 = r9.f136237d
            if (r9 != 0) goto L_0x007f
        L_0x007e:
            r9 = r14
        L_0x007f:
            r8.f250930b = r9
            androidx.lifecycle.i0 r9 = r6.mo71262a(r4)
            cl1.h1 r9 = (cl1.C54979h1) r9
            te3.i11 r9 = r9.f154139n
            if (r9 == 0) goto L_0x0093
            te3.jp1 r9 = r9.f183575e
            if (r9 == 0) goto L_0x0093
            java.lang.String r9 = r9.f136238e
            if (r9 != 0) goto L_0x0094
        L_0x0093:
            r9 = r14
        L_0x0094:
            androidx.lifecycle.i0 r10 = r6.mo71262a(r3)
            cl1.u r10 = (cl1.C55001u) r10
            long r10 = r10.f154416j
            java.lang.String r5 = r5.mo86809a(r9, r10)
            r8.f250934f = r5
            cj1.l6 r5 = new cj1.l6
            r5.<init>()
            r8.f250937i = r5
            r5 = 1176(0x498, float:1.648E-42)
            r8.f250939k = r5
            androidx.lifecycle.i0 r5 = r6.mo71262a(r3)
            cl1.u r5 = (cl1.C55001u) r5
            te3.c21 r5 = r5.f154420q
            long r9 = r5.f182392d
            r19 = 0
            int r5 = (r9 > r19 ? 1 : (r9 == r19 ? 0 : -1))
            if (r5 != 0) goto L_0x00c0
            java.lang.String r5 = "pre_live_add"
            goto L_0x00c2
        L_0x00c0:
            java.lang.String r5 = "post_live_add"
        L_0x00c2:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r5)
            r10 = 58
            r9.append(r10)
            androidx.lifecycle.i0 r11 = r6.mo71262a(r3)
            cl1.u r11 = (cl1.C55001u) r11
            te3.c21 r11 = r11.f154420q
            long r11 = r11.f182392d
            r9.append(r11)
            r9.append(r10)
            androidx.lifecycle.i0 r11 = r6.mo71262a(r2)
            cl1.o r11 = (cl1.C54991o) r11
            java.lang.String r11 = r11.f154345o
            r9.append(r11)
            java.lang.String r11 = "::"
            r9.append(r11)
            androidx.lifecycle.i0 r11 = r6.mo71262a(r2)
            cl1.o r11 = (cl1.C54991o) r11
            long r11 = r11.f154325i1
            r9.append(r11)
            r9.append(r10)
            r9.append(r13)
            r9.append(r10)
            androidx.lifecycle.i0 r11 = r6.mo71262a(r2)
            cl1.o r11 = (cl1.C54991o) r11
            java.lang.String r11 = r11.f154318g2
            r9.append(r11)
            r9.append(r10)
            androidx.lifecycle.i0 r10 = r6.mo71262a(r2)
            cl1.o r10 = (cl1.C54991o) r10
            java.lang.String r10 = r10.f154203G1
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r8.f250940l = r9
            di3.d r9 = di3.C86312j.m106911c(r1)
            ak1.o r9 = (ak1.C54108o) r9
            r9.getClass()
            ak1.f0 r15 = ak1.C54108o.f151869h
            java.lang.String r9 = r8.f250940l
            java.lang.String r10 = "sceneNote"
            gy3.C87412m.m108593f(r9, r10)
            r15.getClass()
            r15.f151475s = r9
            t91.c$a r9 = t91.C64208c.f181951a
            java.lang.String r9 = "<set-?>"
            gy3.C87412m.m108594g(r13, r9)
            t91.C64208c.f181967q = r13
            java.lang.Class<ht1.f4> r9 = ht1.C60169f4.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ht1.f4 r9 = (ht1.C60169f4) r9
            java.lang.String r12 = r8.f250930b
            java.lang.String r10 = "bundle.appId"
            gy3.C87412m.m108593f(r12, r10)
            r16 = 1176(0x498, double:5.81E-321)
            androidx.lifecycle.i0 r10 = r6.mo71262a(r2)
            cl1.o r10 = (cl1.C54991o) r10
            long r10 = r10.f154325i1
            java.lang.String r18 = java.lang.String.valueOf(r10)
            androidx.lifecycle.i0 r6 = r6.mo71262a(r2)
            cl1.o r6 = (cl1.C54991o) r6
            java.lang.String r6 = r6.f154318g2
            r10 = 3
            r21 = r14
            r22 = r15
            r14 = r16
            r16 = r18
            r17 = r5
            r18 = r6
            r9.uv0(r10, r12, r13, r14, r16, r17, r18)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r7.invoke(r5, r8)
            fj1.b r5 = r0.f175774g
            d60.b r6 = r0.f175773f
            java.lang.String r7 = "buContext"
            gy3.C87412m.m108594g(r5, r7)
            java.lang.String r7 = "statusMonitor"
            gy3.C87412m.m108594g(r6, r7)
            int r6 = r6.getLiveRole()
            r7 = 1
            if (r6 == r7) goto L_0x0195
            goto L_0x0266
        L_0x0195:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            r8 = 2
            java.lang.String r9 = "type"
            r6.put(r9, r8)
            di3.d r8 = di3.C86312j.m106911c(r1)
            ak1.o r8 = (ak1.C54108o) r8
            r8.getClass()
            r8 = r22
            java.lang.String r9 = r8.f151475s
            java.lang.String r10 = "sessionid"
            r6.put(r10, r9)
            java.lang.String r9 = "shopwindowid"
            r10 = r21
            r6.put(r9, r10)
            androidx.lifecycle.i0 r9 = r5.mo71262a(r2)
            cl1.o r9 = (cl1.C54991o) r9
            boolean r9 = r9.mo75995c4()
            java.lang.String r11 = "getService(HellLiveReport::class.java)"
            if (r9 == 0) goto L_0x01e5
            di3.d r1 = di3.C86312j.m106911c(r1)
            gy3.C87412m.m108593f(r1, r11)
            r12 = r1
            ht1.j5 r12 = (ht1.C8777j5) r12
            r13 = 6
            java.lang.String r15 = r6.toString()
            r16 = 0
            r17 = 4
            r18 = 0
            ht1.C8777j5.C8778a.m8600a(r12, r13, r15, r16, r17, r18)
            goto L_0x0266
        L_0x01e5:
            androidx.lifecycle.i0 r2 = r5.mo71262a(r2)
            cl1.o r2 = (cl1.C54991o) r2
            boolean r2 = r2.mo75999e4()
            if (r2 == 0) goto L_0x0266
            di3.d r2 = di3.C86312j.m106911c(r1)
            ak1.o r2 = (ak1.C54108o) r2
            r2.getClass()
            r8.f151452d0 = r7
            androidx.lifecycle.i0 r2 = r5.mo71262a(r4)
            cl1.h1 r2 = (cl1.C54979h1) r2
            java.lang.String r2 = r2.f154151z
            java.lang.String r7 = "appid"
            r6.put(r7, r2)
            androidx.lifecycle.i0 r2 = r5.mo71262a(r3)
            cl1.u r2 = (cl1.C55001u) r2
            te3.c21 r2 = r2.f154420q
            long r2 = r2.f182392d
            java.lang.String r7 = "liveid"
            int r8 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r8 >= 0) goto L_0x021d
            r6.put(r7, r10)
            goto L_0x022c
        L_0x021d:
            java.lang.Class<kq.h> r8 = p185kq.C10383h.class
            di3.d r8 = di3.C86312j.m106911c(r8)
            kq.h r8 = (p185kq.C10383h) r8
            java.lang.String r2 = r8.mo10700XQ(r2)
            r6.put(r7, r2)
        L_0x022c:
            java.lang.String r2 = t91.C64208c.f181967q
            java.lang.String r3 = "clickid"
            r6.put(r3, r2)
            t91.C64208c.f181967q = r10
            androidx.lifecycle.i0 r2 = r5.mo71262a(r4)
            cl1.h1 r2 = (cl1.C54979h1) r2
            cm1.i2 r2 = r2.f154147v
            if (r2 == 0) goto L_0x0248
            long r2 = r2.getItemId()
            java.lang.Long r14 = java.lang.Long.valueOf(r2)
            goto L_0x0249
        L_0x0248:
            r14 = r10
        L_0x0249:
            java.lang.String r2 = "productid"
            r6.put(r2, r14)
            di3.d r1 = di3.C86312j.m106911c(r1)
            gy3.C87412m.m108593f(r1, r11)
            r12 = r1
            ht1.j5 r12 = (ht1.C8777j5) r12
            ak1.g0 r13 = ak1.C0073g0.LIVE_ANCHOR_ACTION_COMMERCE
            java.lang.String r14 = r6.toString()
            r15 = 0
            r16 = 4
            r17 = 0
            ht1.C8777j5.C8778a.m8605f(r12, r13, r14, r15, r16, r17)
        L_0x0266:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.C61817a.mo86748e():void");
    }

    /* renamed from: f */
    public final void mo86749f(Boolean bool) {
        Class cls = C54979h1.class;
        FinderLiveShoppingPanel finderLiveShoppingPanel = this.f175780p;
        if (finderLiveShoppingPanel != null) {
            View findViewById = finderLiveShoppingPanel.findViewById(C0966R.C0970id.ngg);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "animateShowGoodListOfCoupon", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "animateShowGoodListOfCoupon", "(Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            String string = this.f175772e.getContext().getString(C0966R.string.mvk, new Object[]{((C54979h1) this.f175774g.mo71262a(cls)).f154128U});
            C87412m.m108593f(string, "root.context.getString( …).goodListOfCouponTitle))");
            TextView textView = this.f175786v;
            if (textView != null) {
                textView.setText(string);
                C62084h hVar = this.f175763E;
                LinkedList<C63965x> linkedList = ((C54979h1) this.f175774g.mo71262a(cls)).f154144s;
                hVar.getClass();
                C87412m.m108594g(linkedList, "productList");
                hVar.f176534h.clear();
                hVar.f176534h.addAll(linkedList);
                hVar.notifyDataSetChanged();
                C62461j jVar = this.f175777j;
                if (jVar != null) {
                    jVar.mo87513p("");
                    C62461j jVar2 = this.f175777j;
                    if (jVar2 != null) {
                        jVar2.mo87514q(false);
                        RecyclerView j = mo86753j();
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(0);
                        C117292a.m165358d(j, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "animateShowGoodListOfCoupon", "(Ljava/lang/Boolean;)V", "Undefined", "scrollToPosition", "(I)V");
                        j.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(j, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "animateShowGoodListOfCoupon", "(Ljava/lang/Boolean;)V", "Undefined", "scrollToPosition", "(I)V");
                        mo86753j().setVisibility(0);
                        boolean b = C87412m.m108589b(bool, Boolean.TRUE);
                        Log.m105924i("Finder.LiveShoppingListPlugin", "showSecondaryPage " + b);
                        C62461j jVar3 = this.f175777j;
                        if (jVar3 != null) {
                            View o = jVar3.mo87511o();
                            C9556a aVar3 = new C9556a();
                            aVar3.mo10233c(0);
                            C117292a.m165358d(o, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodListOfCouponPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            o.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                            C117292a.m165359e(o, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodListOfCouponPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            C62461j jVar4 = this.f175777j;
                            if (jVar4 != null) {
                                View i = jVar4.mo87505i();
                                C9556a aVar4 = new C9556a();
                                aVar4.mo10233c(8);
                                C117292a.m165358d(i, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodListOfCouponPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                i.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                C117292a.m165359e(i, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodListOfCouponPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                C62461j jVar5 = this.f175777j;
                                if (jVar5 != null) {
                                    View j2 = jVar5.mo87506j();
                                    C9556a aVar5 = new C9556a();
                                    aVar5.mo10233c(8);
                                    C117292a.m165358d(j2, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodListOfCouponPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    j2.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                                    C117292a.m165359e(j2, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodListOfCouponPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                    C62461j jVar6 = this.f175777j;
                                    if (jVar6 != null) {
                                        View h = jVar6.mo87504h();
                                        C9556a aVar6 = new C9556a();
                                        aVar6.mo10233c(8);
                                        C117292a.m165358d(h, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodListOfCouponPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        h.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                                        C117292a.m165359e(h, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodListOfCouponPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                        C62461j jVar7 = this.f175777j;
                                        if (jVar7 != null) {
                                            View k = jVar7.mo87507k();
                                            C9556a aVar7 = new C9556a();
                                            aVar7.mo10233c(8);
                                            C117292a.m165358d(k, aVar7.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodListOfCouponPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            k.setVisibility(((Integer) aVar7.mo10231a(0)).intValue());
                                            C117292a.m165359e(k, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "showGoodListOfCouponPage", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            ViewGroup.LayoutParams layoutParams = mo86754k().getLayoutParams();
                                            FinderLiveShoppingPanel finderLiveShoppingPanel2 = this.f175780p;
                                            if (finderLiveShoppingPanel2 != null) {
                                                int i2 = finderLiveShoppingPanel2.getLayoutParams().height;
                                                C62461j jVar8 = this.f175777j;
                                                if (jVar8 != null) {
                                                    layoutParams.height = (i2 - jVar8.mo87511o().getHeight()) - C76577a.m92155f(this.f175772e.getContext(), C0966R.dimen.f3766df);
                                                    ViewGroup.LayoutParams layoutParams2 = mo86753j().getLayoutParams();
                                                    FinderLiveShoppingPanel finderLiveShoppingPanel3 = this.f175780p;
                                                    if (finderLiveShoppingPanel3 != null) {
                                                        int i3 = finderLiveShoppingPanel3.getLayoutParams().height;
                                                        C62461j jVar9 = this.f175777j;
                                                        if (jVar9 != null) {
                                                            int height = i3 - jVar9.mo87511o().getHeight();
                                                            View view = this.f175787w;
                                                            if (view != null) {
                                                                layoutParams2.height = (height - view.getHeight()) - C75044y4.m89991c(this.f175772e.getContext());
                                                                if (mo86757n().getVisibility() == 0) {
                                                                    C62461j jVar10 = this.f175777j;
                                                                    if (jVar10 != null) {
                                                                        jVar10.mo87503g().setImageResource(C0966R.raw.icons_filled_back);
                                                                        C62461j jVar11 = this.f175777j;
                                                                        if (jVar11 != null) {
                                                                            jVar11.mo87503g().setRotation(0.0f);
                                                                        } else {
                                                                            C87412m.m108603p("headerHolder");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        C87412m.m108603p("headerHolder");
                                                                        throw null;
                                                                    }
                                                                } else {
                                                                    C62461j jVar12 = this.f175777j;
                                                                    if (jVar12 != null) {
                                                                        jVar12.mo87503g().setImageResource(C0966R.raw.icons_filled_close);
                                                                        C62461j jVar13 = this.f175777j;
                                                                        if (jVar13 != null) {
                                                                            jVar13.mo87503g().setRotation(0.0f);
                                                                        } else {
                                                                            C87412m.m108603p("headerHolder");
                                                                            throw null;
                                                                        }
                                                                    } else {
                                                                        C87412m.m108603p("headerHolder");
                                                                        throw null;
                                                                    }
                                                                }
                                                                C62461j jVar14 = this.f175777j;
                                                                if (jVar14 != null) {
                                                                    jVar14.mo87502f().setBackground((Drawable) null);
                                                                    mo86754k().setVisibility(0);
                                                                    if (b) {
                                                                        mo86754k().setTranslationX(0.0f);
                                                                        return;
                                                                    }
                                                                    mo86754k().setTranslationX((float) mo86758o().getWidth());
                                                                    mo86754k().animate().setDuration(300).setInterpolator(new AccelerateDecelerateInterpolator()).translationX(0.0f).setListener((Animator.AnimatorListener) null).start();
                                                                    return;
                                                                }
                                                                C87412m.m108603p("headerHolder");
                                                                throw null;
                                                            }
                                                            C87412m.m108603p("goodsOfCouponTitleRoot");
                                                            throw null;
                                                        }
                                                        C87412m.m108603p("headerHolder");
                                                        throw null;
                                                    }
                                                    C87412m.m108603p("contentGroup");
                                                    throw null;
                                                }
                                                C87412m.m108603p("headerHolder");
                                                throw null;
                                            }
                                            C87412m.m108603p("contentGroup");
                                            throw null;
                                        }
                                        C87412m.m108603p("headerHolder");
                                        throw null;
                                    }
                                    C87412m.m108603p("headerHolder");
                                    throw null;
                                }
                                C87412m.m108603p("headerHolder");
                                throw null;
                            }
                            C87412m.m108603p("headerHolder");
                            throw null;
                        }
                        C87412m.m108603p("headerHolder");
                        throw null;
                    }
                    C87412m.m108603p("headerHolder");
                    throw null;
                }
                C87412m.m108603p("headerHolder");
                throw null;
            }
            C87412m.m108603p("goodsOfCouponTitleTxt");
            throw null;
        }
        C87412m.m108603p("contentGroup");
        throw null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r1 != false) goto L_0x0036;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86750g() {
        /*
            r12 = this;
            java.lang.Class<cl1.h1> r0 = cl1.C54979h1.class
            android.view.View r9 = r12.f175790z
            if (r9 != 0) goto L_0x0007
            goto L_0x007a
        L_0x0007:
            ok1.e r1 = ok1.C62042e.f176370a
            boolean r1 = r1.mo87027N0()
            r10 = 0
            if (r1 == 0) goto L_0x0038
            fj1.b r1 = r12.f175774g
            androidx.lifecycle.i0 r1 = r1.mo71262a(r0)
            cl1.h1 r1 = (cl1.C54979h1) r1
            long r1 = r1.f154114F
            int r2 = (int) r1
            r1 = 1
            boolean r2 = o40.C61926c.m72696u(r2, r1)
            if (r2 != 0) goto L_0x0036
            fj1.b r2 = r12.f175774g
            androidx.lifecycle.i0 r0 = r2.mo71262a(r0)
            cl1.h1 r0 = (cl1.C54979h1) r0
            te3.yk0 r0 = r0.f154132Y
            if (r0 == 0) goto L_0x0033
            int r0 = r0.f145339d
            if (r0 != r1) goto L_0x0033
            goto L_0x0034
        L_0x0033:
            r1 = 0
        L_0x0034:
            if (r1 == 0) goto L_0x0038
        L_0x0036:
            r0 = 0
            goto L_0x003a
        L_0x0038:
            r0 = 8
        L_0x003a:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r11.mo10233c(r0)
            java.lang.Object[] r2 = r11.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal"
            java.lang.String r4 = "checkOptionVisibility"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "android/view/View_EXEC_"
            java.lang.String r7 = "setVisibility"
            java.lang.String r8 = "(I)V"
            r1 = r9
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r0 = r11.mo10231a(r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r9.setVisibility(r0)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal"
            java.lang.String r3 = "checkOptionVisibility"
            java.lang.String r4 = "()V"
            java.lang.String r5 = "android/view/View_EXEC_"
            java.lang.String r6 = "setVisibility"
            java.lang.String r7 = "(I)V"
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
        L_0x007a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: np1.C61817a.mo86750g():void");
    }

    /* renamed from: h */
    public final void mo86751h() {
        Class cls = C55001u.class;
        Class cls2 = C54991o.class;
        if (!C61926c.m72696u(((C54991o) this.f175774g.mo71262a(cls2)).f154354q, 16) && ((C54991o) this.f175774g.mo71262a(cls2)).mo75999e4() && C61926c.m72696u((int) ((C54991o) this.f175774g.mo71262a(cls2)).f154358r, 1)) {
            Log.m105924i("Finder.LiveShoppingListPlugin", "checkShoppingAvailableAnchorStatus backEndAnchorStatusFlag:" + ((C54991o) this.f175774g.mo71262a(cls2)).f154358r);
            int i = ((C54991o) this.f175774g.mo71262a(cls2)).f154354q | 16;
            C54795n5 n5Var = this.f175775h;
            if (n5Var != null) {
                C54795n5.C54796a.m61727e(n5Var, ((C55001u) this.f175774g.mo71262a(cls)).f154420q.f182392d, ((C55001u) this.f175774g.mo71262a(cls)).f154416j, i, 16, 2, (C47826f.C47827a) null, 32, (Object) null);
            }
        }
    }

    /* renamed from: i */
    public final RecyclerView mo86752i() {
        RecyclerView recyclerView = this.f175788x;
        if (recyclerView != null) {
            return recyclerView;
        }
        C87412m.m108603p("couponList");
        throw null;
    }

    /* renamed from: j */
    public final RecyclerView mo86753j() {
        RecyclerView recyclerView = this.f175789y;
        if (recyclerView != null) {
            return recyclerView;
        }
        C87412m.m108603p("goodListOfCoupon");
        throw null;
    }

    /* renamed from: k */
    public final FrameLayout mo86754k() {
        FrameLayout frameLayout = this.f175785u;
        if (frameLayout != null) {
            return frameLayout;
        }
        C87412m.m108603p("goodListOfCouponContainer");
        throw null;
    }

    /* renamed from: l */
    public final ProgressBar mo86755l() {
        Object value = ((C36570n) this.f175782r).getValue();
        C87412m.m108593f(value, "<get-loadingBar>(...)");
        return (ProgressBar) value;
    }

    /* renamed from: m */
    public final TextView mo86756m() {
        Object value = ((C36570n) this.f175783s).getValue();
        C87412m.m108593f(value, "<get-retryTip>(...)");
        return (TextView) value;
    }

    /* renamed from: n */
    public final FrameLayout mo86757n() {
        FrameLayout frameLayout = this.f175784t;
        if (frameLayout != null) {
            return frameLayout;
        }
        C87412m.m108603p("secondaryPageContainer");
        throw null;
    }

    /* renamed from: o */
    public final FinderLiveFixClickIssueRecyclerView mo86758o() {
        FinderLiveFixClickIssueRecyclerView finderLiveFixClickIssueRecyclerView = this.f175781q;
        if (finderLiveFixClickIssueRecyclerView != null) {
            return finderLiveFixClickIssueRecyclerView;
        }
        C87412m.m108603p("shoppingList");
        throw null;
    }

    public void onClick(View view) {
        View view2 = view;
        ArrayList arrayList = new ArrayList();
        arrayList.add(view2);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        Integer valueOf = view2 != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == C0966R.C0970id.e7k) {
            mo86761q();
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.dz6) {
            m72531L(this, (Bundle) null, mo86766v() ? 0 : 4, true, false, 8, (Object) null);
        } else if (valueOf != null && valueOf.intValue() == C0966R.C0970id.f358231dz2) {
            Class cls = C54979h1.class;
            Log.m105924i("Finder.LiveShoppingListPlugin", "[onClickOptionView]");
            mo86761q();
            C12925w wVar = new C12925w(this.f175772e.getContext());
            wVar.mo12473m(true);
            wVar.mo12470j(C0966R.C0971layout.aj7);
            C85875k4.m106189j0(((TextView) wVar.f36927f.findViewById(C0966R.C0970id.dwz)).getPaint(), 0.8f);
            MMSwitchBtn mMSwitchBtn = (MMSwitchBtn) wVar.f36927f.findViewById(C0966R.C0970id.f358217dx0);
            View findViewById = wVar.f36927f.findViewById(C0966R.C0970id.dyv);
            View findViewById2 = wVar.f36927f.findViewById(C0966R.C0970id.dwy);
            View findViewById3 = wVar.f36927f.findViewById(C0966R.C0970id.dwk);
            View findViewById4 = wVar.f36927f.findViewById(C0966R.C0970id.dwm);
            View findViewById5 = wVar.f36927f.findViewById(C0966R.C0970id.dww);
            View findViewById6 = wVar.f36927f.findViewById(C0966R.C0970id.dwx);
            View findViewById7 = wVar.f36927f.findViewById(C0966R.C0970id.olj);
            C64399gj1 gj12 = ((C54979h1) this.f175774g.mo71262a(cls)).f154113E;
            if (gj12 != null) {
                mMSwitchBtn.setCheck(gj12.f183343d == 1);
                int i = gj12.f183343d == 1 ? 0 : 8;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                View view3 = findViewById2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "onClickReplayOptionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "onClickReplayOptionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int i2 = gj12.f183344e;
                if (i2 == 0) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view4 = findViewById3;
                    C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "onClickReplayOptionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "onClickReplayOptionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else if (i2 == 1) {
                    C9556a aVar3 = new C9556a();
                    aVar3.mo10233c(0);
                    View view5 = findViewById4;
                    C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "onClickReplayOptionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view5, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "onClickReplayOptionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                View view6 = findViewById7;
                View view7 = findViewById4;
                View view8 = findViewById;
                View view9 = findViewById3;
                mMSwitchBtn.setSwitchListener(new C61874l(gj12, this, mMSwitchBtn, findViewById2, findViewById3, view7));
                View view10 = view7;
                findViewById5.setOnClickListener(new C11256m(this, view9, view10));
                findViewById6.setOnClickListener(new C11258n(this, view9, view10));
                C52128yk0 yk02 = ((C54979h1) this.f175774g.mo71262a(cls)).f154132Y;
                if (yk02 != null && yk02.f145339d == 1) {
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(0);
                    View view11 = view6;
                    C117292a.m165358d(view6, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "onClickReplayOptionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view11.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view11, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "onClickReplayOptionView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view11.setOnClickListener(new C11260o(this, yk02));
                }
                view8.setOnClickListener(new C11261p(wVar));
            }
            wVar.mo5086o();
            wVar.f36937s = new C61876q(this);
        }
        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: p */
    public final void mo86760p(boolean z, boolean z2) {
        Log.m105924i("Finder.LiveShoppingListPlugin", "hideSecondaryPage " + z + ",visibility:" + mo86757n().getVisibility());
        FinderLiveShoppingPanel finderLiveShoppingPanel = this.f175780p;
        if (finderLiveShoppingPanel != null) {
            View findViewById = finderLiveShoppingPanel.findViewById(C0966R.C0970id.ngg);
            if (findViewById != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(findViewById, aVar.mo10232b(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "hideSecondaryPage", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "hideSecondaryPage", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            mo86739F(true);
            C62461j jVar = this.f175777j;
            if (jVar != null) {
                jVar.mo87500d();
                C62461j jVar2 = this.f175777j;
                if (jVar2 != null) {
                    jVar2.mo87499c();
                    C62461j jVar3 = this.f175777j;
                    if (jVar3 != null) {
                        jVar3.mo87498b();
                        C62461j jVar4 = this.f175777j;
                        if (jVar4 != null) {
                            jVar4.mo87513p((String) null);
                            C62461j jVar5 = this.f175777j;
                            if (jVar5 != null) {
                                jVar5.mo87503g().setImageResource(C0966R.raw.icons_filled_arrow);
                                C62461j jVar6 = this.f175777j;
                                if (jVar6 != null) {
                                    jVar6.mo87503g().setRotation(90.0f);
                                    C62461j jVar7 = this.f175777j;
                                    if (jVar7 != null) {
                                        jVar7.mo87502f().setBackgroundResource(C0966R.C0969drawable.a1t);
                                        if (z2) {
                                            mo86744K((Bundle) null, 0, true, true);
                                        }
                                        if (!z) {
                                            mo86757n().setVisibility(8);
                                        } else if (mo86757n().getVisibility() != 8) {
                                            mo86757n().animate().setDuration(300).setInterpolator(new AccelerateDecelerateInterpolator()).translationX((float) mo86758o().getWidth()).setListener(new C61820c(this)).start();
                                        }
                                    } else {
                                        C87412m.m108603p("headerHolder");
                                        throw null;
                                    }
                                } else {
                                    C87412m.m108603p("headerHolder");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("headerHolder");
                                throw null;
                            }
                        } else {
                            C87412m.m108603p("headerHolder");
                            throw null;
                        }
                    } else {
                        C87412m.m108603p("headerHolder");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("headerHolder");
                    throw null;
                }
            } else {
                C87412m.m108603p("headerHolder");
                throw null;
            }
        } else {
            C87412m.m108603p("contentGroup");
            throw null;
        }
    }

    /* renamed from: q */
    public final void mo86761q() {
        Class cls = C54979h1.class;
        Log.m105924i("Finder.LiveShoppingListPlugin", "hideShoppingContent:" + Util.getStack());
        ((C54979h1) this.f175774g.mo71262a(cls)).f154144s.clear();
        C49712hj1 hj12 = null;
        ((C54979h1) this.f175774g.mo71262a(cls)).f154112D = null;
        FinderLiveShoppingPanel finderLiveShoppingPanel = this.f175780p;
        if (finderLiveShoppingPanel != null) {
            finderLiveShoppingPanel.post(new C61821d(this));
            C64916p1 p1Var = (C64916p1) C86312j.m106911c(C64916p1.class);
            C62660c cVar = this.f175776i;
            C56032b z0 = cVar != null ? cVar.mo14484z0() : null;
            FinderLiveVisitorPluginLayout finderLiveVisitorPluginLayout = z0 instanceof FinderLiveVisitorPluginLayout ? (FinderLiveVisitorPluginLayout) z0 : null;
            if (finderLiveVisitorPluginLayout != null) {
                hj12 = finderLiveVisitorPluginLayout.getReportObj();
            }
            p1Var.mo76728y(hj12, 18054, C62042e.m72804V(C62042e.f176370a, this.f175774g, 30, (String) null, 0, 12, (Object) null));
            HashMap<Long, C63315j.C63316a> hashMap = C63315j.f179661d;
            C63315j.f179661d.clear();
            return;
        }
        C87412m.m108603p("contentGroup");
        throw null;
    }

    /* renamed from: r */
    public final void mo86762r() {
        C62084h hVar = this.f175763E;
        hVar.f176543t = this.f175768J;
        hVar.f176545v = new C61822e(this);
        hVar.f176547x = new C61823f(this);
    }

    /* renamed from: s */
    public final void mo86763s() {
        C62461j jVar = this.f175777j;
        if (jVar != null) {
            jVar.mo87502f().setOnClickListener(jVar);
            jVar.mo87505i().setOnClickListener(jVar);
            jVar.mo87506j().setOnClickListener(jVar);
            View view = this.f175779o;
            if (view != null) {
                view.setOnClickListener(this);
                View view2 = this.f175790z;
                if (view2 != null) {
                    view2.setOnClickListener(this);
                }
                C61824g gVar = new C61824g(this);
                mo86758o().mo17092j0(gVar);
                this.f175769K = gVar;
                FinderLiveShoppingPanel finderLiveShoppingPanel = this.f175780p;
                if (finderLiveShoppingPanel != null) {
                    finderLiveShoppingPanel.setOnVisibilityListener(new C61825h(this));
                } else {
                    C87412m.m108603p("contentGroup");
                    throw null;
                }
            } else {
                C87412m.m108603p("blankArea");
                throw null;
            }
        } else {
            C87412m.m108603p("headerHolder");
            throw null;
        }
    }

    /* renamed from: t */
    public final void mo86764t() {
        C61831n nVar = new C61831n(this);
        C62084h hVar = this.f175761C;
        hVar.f176543t = this.f175768J;
        hVar.f176544u = new C61826i(this);
        hVar.f176545v = new C61827j(this);
        hVar.f176546w = new C61828k(this, hVar);
        hVar.f176547x = new C61829l(this);
        hVar.f176548y = new C61830m(this);
        hVar.f176549z = nVar;
        this.f175762D.f176497p = nVar;
    }

    /* renamed from: u */
    public final boolean mo86765u(boolean z) {
        return mo86766v() && z;
    }

    /* renamed from: v */
    public final boolean mo86766v() {
        return ((Boolean) ((C36570n) this.f175760B).getValue()).booleanValue();
    }

    /* renamed from: w */
    public final boolean mo86767w() {
        return ((C54991o) this.f175774g.mo71262a(C54991o.class)).f154190D;
    }

    /* renamed from: x */
    public final void mo86768x() {
        Class cls = C55001u.class;
        if (mo86766v() && !this.f175765G && ((C55001u) this.f175774g.mo71262a(cls)).f154420q.f182392d != 0) {
            Log.m105924i("Finder.LiveShoppingListPlugin", "has notify visitor shopping:" + this.f175765G);
            int i = this.f175764F + 1;
            this.f175764F = i;
            if (i >= 3) {
                this.f175764F = 0;
                return;
            }
            int i2 = ((C54991o) this.f175774g.mo71262a(C54991o.class)).f154354q | 16;
            C54795n5 n5Var = this.f175775h;
            if (n5Var != null) {
                n5Var.mo75724a0(((C55001u) this.f175774g.mo71262a(cls)).f154420q.f182392d, ((C55001u) this.f175774g.mo71262a(cls)).f154416j, i2, 16, 2, new C61837q(this));
            }
        }
    }

    /* renamed from: y */
    public final void mo86769y(int i, int i2, Intent intent) {
        ArrayList arrayList;
        ArrayList<String> stringArrayListExtra;
        if (i != 1013) {
            return;
        }
        if (i2 == -1) {
            if (intent == null || (stringArrayListExtra = intent.getStringArrayListExtra("KEY_PRODUCTLIST")) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(C36907w.m41090l(stringArrayListExtra, 10));
                for (String safeParseLong : stringArrayListExtra) {
                    arrayList.add(Long.valueOf(Util.safeParseLong(safeParseLong)));
                }
            }
            boolean z = false;
            if (intent != null) {
                z = intent.getBooleanExtra("KEY_DELETE", false);
            }
            if (arrayList != null) {
                Class cls = C55001u.class;
                C54795n5 n5Var = this.f175775h;
                if (n5Var != null) {
                    Context context = this.f175772e.getContext();
                    C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    n5Var.mo75737h((MMActivity) context, ((C55001u) this.f175774g.mo71262a(cls)).f154420q.f182392d, ((C55001u) this.f175774g.mo71262a(cls)).f154416j, ((C54991o) this.f175774g.mo71262a(C54991o.class)).f154345o, C62042e.f176370a.mo87131z(z ? 102 : 101, new LinkedList(arrayList)), new C61872j(this));
                }
            }
            Log.m105924i("Finder.LiveShoppingListPlugin", "list:" + arrayList + ",delete:" + z);
            return;
        }
        Log.m105924i("Finder.LiveShoppingListPlugin", "onActivityResult:REQUEST_MANAGER_PRODUCT,resultCode:" + i2);
    }

    /* renamed from: z */
    public final void mo86770z() {
        C61859e0 e0Var = this.f175759A;
        if (!(e0Var == null || e0Var.f175891g == null)) {
            e0Var.f175886b.setTouchEventListener((C32226l<? super MotionEvent, C13598b0>) null);
            e0Var.f175886b.setConsumedTouchEnvent(false);
            e0Var.f175885a.mo78812i();
        }
        this.f175759A = null;
    }
}
