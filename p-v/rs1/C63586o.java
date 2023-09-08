package rs1;

import android.animation.Animator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.camera.core.FocusMeteringAction;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0755n0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C58739j4;
import er1.C58784w3;
import f40.C86709a0;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import jq3.C60905o;
import jq3.C9493c;
import k20.C60958c;
import k20.C9556a;
import os1.C11739f;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C51124rl1;
import up1.C37521f;
import ve1.C14576n2;

/* renamed from: rs1.o */
public final class C63586o extends UIComponent {

    /* renamed from: v */
    public static final /* synthetic */ int f180303v = 0;

    /* renamed from: d */
    public final C13601g f180304d = C36568h.m40985a(new C63592g(this));

    /* renamed from: e */
    public final C13601g f180305e = C36568h.m40985a(new C63589c(this));

    /* renamed from: f */
    public final C13601g f180306f = C36568h.m40985a(new C63588b(this));

    /* renamed from: g */
    public final C11739f f180307g;

    /* renamed from: h */
    public final MMHandler f180308h;

    /* renamed from: i */
    public int f180309i;

    /* renamed from: j */
    public C0755n0 f180310j;

    /* renamed from: n */
    public C14576n2 f180311n;

    /* renamed from: o */
    public C60905o f180312o;

    /* renamed from: p */
    public C63512a f180313p;

    /* renamed from: q */
    public int[] f180314q;

    /* renamed from: r */
    public int f180315r;

    /* renamed from: s */
    public int f180316s;

    /* renamed from: t */
    public final C13601g f180317t;

    /* renamed from: u */
    public C63587a f180318u;

    /* renamed from: rs1.o$d */
    public static final class C13343d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C63586o f37840d;

        /* renamed from: e */
        public final /* synthetic */ int f37841e;

        public C13343d(C63586o oVar, int i) {
            this.f37840d = oVar;
            this.f37841e = i;
        }

        public final void run() {
            RecyclerView.C16631z I0 = this.f37840d.mo88435d3().mo17023I0(this.f37841e);
            if (I0 != null) {
                C63586o oVar = this.f37840d;
                if (I0 instanceof C60905o) {
                    Object obj = ((C60905o) I0).f173503E;
                    boolean z = false;
                    int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USREINFO_FINDER_SLIDE_LEFT_TIPS_COUNT_INT_SYNC, 0);
                    if (obj instanceof BaseFinderFeed) {
                        BaseFinderFeed baseFinderFeed = (BaseFinderFeed) obj;
                        if (baseFinderFeed.mo3470D() != null) {
                            C51124rl1 D = baseFinderFeed.mo3470D();
                            if (D != null && D.f141000f == 8) {
                                C37521f.f99374d.getClass();
                                if (C37521f.f99503r5.mo60266n().intValue() == 1) {
                                    z = true;
                                }
                                if (!z) {
                                    C51124rl1 D2 = baseFinderFeed.mo3470D();
                                    C63586o.m74921g3(oVar, true, D2 != null ? D2.f140999e : null, 0, (Drawable) null, 12, (Object) null);
                                } else if (j >= 3) {
                                    C51124rl1 D3 = baseFinderFeed.mo3470D();
                                    C63586o.m74921g3(oVar, true, D3 != null ? D3.f140999e : null, 0, (Drawable) null, 12, (Object) null);
                                }
                                baseFinderFeed.mo3512n0((C51124rl1) null);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: rs1.o$a */
    public static final class C63587a {

        /* renamed from: a */
        public final int f180319a;

        /* renamed from: b */
        public CharSequence f180320b;

        /* renamed from: c */
        public long f180321c = FocusMeteringAction.DEFAULT_AUTOCANCEL_DURATION;

        /* renamed from: d */
        public Drawable f180322d;

        /* renamed from: e */
        public int f180323e;

        /* renamed from: f */
        public long f180324f;

        public C63587a(int i) {
            this.f180319a = i;
            Drawable drawable = MMApplicationContext.getResources().getDrawable(C0966R.C0969drawable.f5027uk);
            C87412m.m108593f(drawable, "getResources().getDrawab…er_action_bar_tips_shape)");
            this.f180322d = drawable;
            this.f180323e = -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C63587a) && this.f180319a == ((C63587a) obj).f180319a;
        }

        public int hashCode() {
            return this.f180319a;
        }

        public String toString() {
            return "Action(type=" + this.f180319a + ')';
        }
    }

    /* renamed from: rs1.o$b */
    public static final class C63588b extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C63586o f180325d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63588b(C63586o oVar) {
            super(0);
            this.f180325d = oVar;
        }

        public Object invoke() {
            return (ViewGroup) this.f180325d.getRootView().findViewById(C0966R.C0970id.f5376dh);
        }
    }

    /* renamed from: rs1.o$c */
    public static final class C63589c extends C87413o implements C32224a<ViewGroup> {

        /* renamed from: d */
        public final /* synthetic */ C63586o f180326d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63589c(C63586o oVar) {
            super(0);
            this.f180326d = oVar;
        }

        public Object invoke() {
            return (ViewGroup) this.f180326d.getRootView().findViewById(C0966R.C0970id.f5377di);
        }
    }

    /* renamed from: rs1.o$e */
    public static final class C63590e extends RecyclerView.C0130p {

        /* renamed from: d */
        public final Rect f180327d = new Rect();

        /* renamed from: e */
        public boolean f180328e;

        /* renamed from: f */
        public final /* synthetic */ C63586o f180329f;

        /* renamed from: g */
        public final /* synthetic */ ViewGroup f180330g;

        public C63590e(C63586o oVar, ViewGroup viewGroup) {
            this.f180329f = oVar;
            this.f180330g = viewGroup;
        }

        /* renamed from: a */
        public final void mo88444a() {
            List data;
            boolean z;
            C63586o oVar = this.f180329f;
            if (oVar.f180310j != null) {
                RecyclerView.LayoutManager layoutManager = oVar.mo88435d3().getLayoutManager();
                C13598b0 b0Var = null;
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null) {
                    RecyclerView.C16613e adapter = this.f180329f.mo88435d3().getAdapter();
                    WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
                    int i = -1;
                    if (wxRecyclerAdapter != null && (data = wxRecyclerAdapter.getData()) != null) {
                        ListIterator listIterator = data.listIterator(data.size());
                        while (true) {
                            if (!listIterator.hasPrevious()) {
                                break;
                            }
                            C9493c cVar = (C9493c) listIterator.previous();
                            BaseFinderFeed baseFinderFeed = cVar instanceof BaseFinderFeed ? (BaseFinderFeed) cVar : null;
                            if (baseFinderFeed == null || !baseFinderFeed.mo3477K()) {
                                z = false;
                                continue;
                            } else {
                                z = true;
                                continue;
                            }
                            if (z) {
                                i = listIterator.nextIndex();
                                break;
                            }
                        }
                    }
                    int i2 = i >= 0 ? i + 1 : 0;
                    int C = linearLayoutManager.mo16957C();
                    if (C <= i2 && this.f180330g.getVisibility() != 0) {
                        this.f180330g.setVisibility(0);
                    }
                    if (C == i2 && this.f180330g.getHeight() > 0) {
                        RecyclerView.C16631z I0 = this.f180329f.mo88435d3().mo17023I0(i2);
                        if (I0 != null) {
                            C63586o oVar2 = this.f180329f;
                            ViewGroup viewGroup = this.f180330g;
                            RecyclerView d3 = oVar2.mo88435d3();
                            View view = I0.f44854d;
                            Rect rect = this.f180327d;
                            d3.getClass();
                            RecyclerView.m15804R0(view, rect);
                            Rect rect2 = this.f180327d;
                            rect2.top = Math.max(0, rect2.top);
                            Rect rect3 = this.f180327d;
                            rect3.bottom = Math.max(0, rect3.bottom);
                            if (this.f180327d.height() > 0) {
                                viewGroup.setAlpha((((float) this.f180327d.height()) * 1.0f) / ((float) I0.f44854d.getHeight()));
                            } else {
                                viewGroup.setVisibility(8);
                            }
                            b0Var = C13598b0.f38549a;
                        }
                        if (b0Var == null) {
                            this.f180330g.setVisibility(8);
                        }
                    } else if (C > i2) {
                        this.f180330g.setVisibility(8);
                    }
                }
            }
        }

        /* JADX WARNING: type inference failed for: r9v2, types: [androidx.recyclerview.widget.RecyclerView$LayoutManager] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onScrollStateChanged(androidx.recyclerview.widget.RecyclerView r9, int r10) {
            /*
                r8 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r9)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
                r0.add(r1)
                java.lang.Object[] r7 = r0.toArray()
                r0.clear()
                java.lang.String r2 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$onCreateAfter$1"
                java.lang.String r3 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
                java.lang.String r4 = "onScrollStateChanged"
                java.lang.String r5 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
                r6 = r8
                j20.C117292a.m165356b(r2, r3, r4, r5, r6, r7)
                java.lang.String r0 = "recyclerView"
                gy3.C87412m.m108594g(r9, r0)
                super.onScrollStateChanged(r9, r10)
                androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r9.getLayoutManager()
                boolean r1 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
                r2 = 0
                if (r1 == 0) goto L_0x0036
                androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
                goto L_0x0037
            L_0x0036:
                r0 = r2
            L_0x0037:
                if (r0 == 0) goto L_0x0045
                rs1.o r1 = r8.f180329f
                int r0 = r0.mo16957C()
                int r3 = r1.f180309i
                if (r3 >= r0) goto L_0x0045
                r1.f180309i = r0
            L_0x0045:
                r0 = 1
                if (r10 == 0) goto L_0x004e
                if (r10 == r0) goto L_0x004b
                goto L_0x00ab
            L_0x004b:
                r8.f180328e = r0
                goto L_0x00ab
            L_0x004e:
                rs1.o r10 = r8.f180329f
                r10.mo88434c3()
                r8.mo88444a()
                androidx.recyclerview.widget.RecyclerView$LayoutManager r9 = r9.getLayoutManager()
                boolean r10 = r9 instanceof androidx.recyclerview.widget.LinearLayoutManager
                if (r10 == 0) goto L_0x0061
                r2 = r9
                androidx.recyclerview.widget.LinearLayoutManager r2 = (androidx.recyclerview.widget.LinearLayoutManager) r2
            L_0x0061:
                r9 = -1
                if (r2 == 0) goto L_0x0069
                int r10 = r2.mo16957C()
                goto L_0x006a
            L_0x0069:
                r10 = -1
            L_0x006a:
                boolean r1 = r8.f180328e
                r2 = 0
                if (r1 == 0) goto L_0x00a9
                rs1.o r1 = r8.f180329f
                rs1.o$a r1 = r1.f180318u
                if (r1 == 0) goto L_0x007b
                int r3 = r1.f180323e
                if (r3 != r9) goto L_0x007b
                r9 = 1
                goto L_0x007c
            L_0x007b:
                r9 = 0
            L_0x007c:
                if (r9 != 0) goto L_0x00a9
                if (r1 == 0) goto L_0x0085
                int r9 = r1.f180323e
                if (r9 != r10) goto L_0x0085
                goto L_0x0086
            L_0x0085:
                r0 = 0
            L_0x0086:
                if (r0 != 0) goto L_0x00a9
                long r9 = java.lang.System.currentTimeMillis()
                rs1.o r0 = r8.f180329f
                rs1.o$a r0 = r0.f180318u
                if (r0 == 0) goto L_0x0095
                long r0 = r0.f180324f
                goto L_0x0099
            L_0x0095:
                long r0 = java.lang.System.currentTimeMillis()
            L_0x0099:
                long r9 = r9 - r0
                r0 = 1000(0x3e8, double:4.94E-321)
                int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r3 <= 0) goto L_0x00a9
                rs1.o r9 = r8.f180329f
                rs1.o$a r10 = r9.f180318u
                if (r10 == 0) goto L_0x00a9
                r9.mo88439j3(r2, r10)
            L_0x00a9:
                r8.f180328e = r2
            L_0x00ab:
                java.lang.String r9 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$onCreateAfter$1"
                java.lang.String r10 = "androidx/recyclerview/widget/RecyclerView$OnScrollListener"
                java.lang.String r0 = "onScrollStateChanged"
                java.lang.String r1 = "(Landroidx/recyclerview/widget/RecyclerView;I)V"
                j20.C117292a.m165361g(r8, r9, r10, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rs1.C63586o.C63590e.onScrollStateChanged(androidx.recyclerview.widget.RecyclerView, int):void");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$onCreateAfter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            mo88444a();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$onCreateAfter$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: rs1.o$f */
    public static final class C63591f extends C87413o implements C32224a<ViewTreeObserver.OnPreDrawListener> {

        /* renamed from: d */
        public final /* synthetic */ C63586o f180331d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63591f(C63586o oVar) {
            super(0);
            this.f180331d = oVar;
        }

        public Object invoke() {
            return new C63611p(this.f180331d);
        }
    }

    /* renamed from: rs1.o$g */
    public static final class C63592g extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C63586o f180332d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63592g(C63586o oVar) {
            super(0);
            this.f180332d = oVar;
        }

        public Object invoke() {
            View findViewById = this.f180332d.getRootView().findViewById(C0966R.C0970id.ivb);
            C87412m.m108591d(findViewById);
            return ((RefreshLoadMoreLayout) findViewById).getRecyclerView();
        }
    }

    /* renamed from: rs1.o$h */
    public static final class C63593h implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C63586o f180333d;

        /* renamed from: e */
        public final /* synthetic */ C63587a f180334e;

        public C63593h(C63586o oVar, C63587a aVar) {
            this.f180333d = oVar;
            this.f180334e = aVar;
        }

        public final void run() {
            this.f180333d.mo88439j3(false, this.f180334e);
        }
    }

    /* renamed from: rs1.o$i */
    public static final class C63594i implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C63586o f180335d;

        /* renamed from: e */
        public final /* synthetic */ C63587a f180336e;

        public C63594i(C63586o oVar, C63587a aVar) {
            this.f180335d = oVar;
            this.f180336e = aVar;
        }

        public final void run() {
            this.f180335d.mo88439j3(false, this.f180336e);
        }
    }

    /* renamed from: rs1.o$j */
    public static final class C63595j implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C63586o f180337d;

        /* renamed from: e */
        public final /* synthetic */ C63587a f180338e;

        public C63595j(C63586o oVar, C63587a aVar) {
            this.f180337d = oVar;
            this.f180338e = aVar;
        }

        public final void run() {
            this.f180337d.mo88439j3(false, this.f180338e);
        }
    }

    /* renamed from: rs1.o$k */
    public static final class C63596k implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ C63586o f180339d;

        /* renamed from: e */
        public final /* synthetic */ C63587a f180340e;

        public C63596k(C63586o oVar, C63587a aVar) {
            this.f180339d = oVar;
            this.f180340e = aVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            this.f180339d.mo88438i3(false, this.f180340e);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: rs1.o$l */
    public static final class C63597l implements Animator.AnimatorListener {

        /* renamed from: d */
        public final /* synthetic */ View f180341d;

        /* renamed from: e */
        public final /* synthetic */ C63586o f180342e;

        /* renamed from: f */
        public final /* synthetic */ C63587a f180343f;

        public C63597l(View view, C63586o oVar, C63587a aVar) {
            this.f180341d = view;
            this.f180342e = oVar;
            this.f180343f = aVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            View view = this.f180341d;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$showTips$2$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$showTips$2$1", "onAnimationEnd", "(Landroid/animation/Animator;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            C63586o oVar = this.f180342e;
            oVar.f180318u = null;
            oVar.mo88436e3(false, this.f180343f);
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: rs1.o$m */
    public static final class C63598m extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ C63586o f180344d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63598m(C63586o oVar) {
            super(0);
            this.f180344d = oVar;
        }

        public Object invoke() {
            Fragment fragment = this.f180344d.getFragment();
            C87412m.m108592e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment");
            return Integer.valueOf(((FinderHomeTabFragment) fragment).f17334o);
        }
    }

    static {
        int i = MMApplicationContext.getContext().getResources().getDisplayMetrics().heightPixels;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63586o(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
        this.f180307g = (C11739f) a;
        this.f180308h = new MMHandler(Looper.getMainLooper());
        C36568h.m40985a(new C63598m(this));
        this.f180314q = new int[2];
        this.f180317t = C36568h.m40985a(new C63591f(this));
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [androidx.recyclerview.widget.RecyclerView$LayoutManager] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: g3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m74921g3(rs1.C63586o r1, boolean r2, java.lang.CharSequence r3, long r4, android.graphics.drawable.Drawable r6, int r7, java.lang.Object r8) {
        /*
            r8 = r7 & 4
            if (r8 == 0) goto L_0x0006
            r4 = 3000(0xbb8, double:1.482E-320)
        L_0x0006:
            r7 = r7 & 8
            r8 = 0
            if (r7 == 0) goto L_0x000c
            r6 = r8
        L_0x000c:
            r1.getClass()
            rs1.o$a r7 = new rs1.o$a
            r0 = 0
            r7.<init>(r0)
            r7.f180320b = r3
            r7.f180321c = r4
            androidx.recyclerview.widget.RecyclerView r3 = r1.mo88435d3()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r3.getLayoutManager()
            boolean r4 = r3 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r4 == 0) goto L_0x0028
            r8 = r3
            androidx.recyclerview.widget.LinearLayoutManager r8 = (androidx.recyclerview.widget.LinearLayoutManager) r8
        L_0x0028:
            if (r8 == 0) goto L_0x002f
            int r3 = r8.mo16957C()
            goto L_0x0030
        L_0x002f:
            r3 = -1
        L_0x0030:
            r7.f180323e = r3
            long r3 = java.lang.System.currentTimeMillis()
            r7.f180324f = r3
            if (r6 == 0) goto L_0x003c
            r7.f180322d = r6
        L_0x003c:
            rx3.b0 r3 = rx3.C13598b0.f38549a
            r1.mo88439j3(r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C63586o.m74921g3(rs1.o, boolean, java.lang.CharSequence, long, android.graphics.drawable.Drawable, int, java.lang.Object):void");
    }

    /* renamed from: c3 */
    public final void mo88434c3() {
        int C;
        RecyclerView d3;
        RecyclerView.LayoutManager layoutManager = mo88435d3().getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (C = ((LinearLayoutManager) layoutManager).mo16957C()) != -1 && (d3 = mo88435d3()) != null) {
            d3.post(new C13343d(this, C));
        }
    }

    /* renamed from: d3 */
    public final RecyclerView mo88435d3() {
        return (RecyclerView) this.f180304d.getValue();
    }

    /* renamed from: e3 */
    public final void mo88436e3(boolean z, C63587a aVar) {
        Log.m105924i("Finder.DoubleClickTipUIC", "[hideCompleted] isBegin=" + z + " action=" + aVar.f180319a);
    }

    /* renamed from: f3 */
    public final void mo88437f3() {
        C14576n2 n2Var;
        C58784w3 w3Var = C58784w3.f168295a;
        C60905o oVar = this.f180312o;
        C0755n0 n0Var = this.f180310j;
        C58739j4 j4Var = C58739j4.f168176a;
        if (oVar != null && n0Var != null && (n2Var = this.f180311n) != null) {
            n2Var.mo44e(oVar, n0Var, 0, 2019, false, (List<Object>) null);
        }
    }

    /* renamed from: i3 */
    public final void mo88438i3(boolean z, C63587a aVar) {
        Log.m105924i("Finder.DoubleClickTipUIC", "[showCompleted] isBegin=" + z + " action=" + aVar.f180319a);
        int i = aVar.f180319a;
        if (i == 1) {
            if (z) {
                TextView textView = (TextView) findViewById(C0966R.C0970id.kn9);
                if (textView != null) {
                    textView.setText(getContext().getResources().getString(C0966R.string.d6y));
                    textView.setVisibility(0);
                }
                WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.knc);
                if (weImageView != null) {
                    weImageView.setVisibility(0);
                    weImageView.setIconColor(getContext().getResources().getColor(C0966R.color.f3585yj));
                    weImageView.setRotation(-90.0f);
                    weImageView.setImageResource(C0966R.raw.finder_self_feed_like_arrow);
                    return;
                }
                return;
            }
            Fragment fragment = getFragment();
            C87412m.m108592e(fragment, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment");
            C11739f fVar = this.f180307g;
            int i2 = ((FinderHomeTabFragment) fragment).f17334o;
            fVar.getClass();
            C86709a0.m107535s().mo121142i().mo119677K(fVar.mo11601d3(i2), Integer.valueOf(C86709a0.m107535s().mo121142i().mo119689j(fVar.mo11601d3(i2), 0) + 1));
            this.f180308h.postDelayed(new C63593h(this, aVar), aVar.f180321c);
        } else if (i == 2) {
            C115669n.INSTANCE.kvStat(22077, "");
            TextView textView2 = (TextView) findViewById(C0966R.C0970id.kn9);
            if (textView2 != null) {
                textView2.setText(getContext().getResources().getString(C0966R.string.eez));
                textView2.setVisibility(0);
            }
            WeImageView weImageView2 = (WeImageView) findViewById(C0966R.C0970id.knc);
            if (weImageView2 != null) {
                weImageView2.setVisibility(8);
            }
            this.f180308h.postDelayed(new C63594i(this, aVar), aVar.f180321c);
        } else if (i == 0) {
            TextView textView3 = (TextView) findViewById(C0966R.C0970id.kn9);
            if (textView3 != null) {
                textView3.setText(aVar.f180320b);
                textView3.setVisibility(0);
            }
            WeImageView weImageView3 = (WeImageView) findViewById(C0966R.C0970id.knc);
            if (weImageView3 != null) {
                weImageView3.setVisibility(8);
            }
            this.f180308h.postDelayed(new C63595j(this, aVar), aVar.f180321c);
        }
    }

    /* renamed from: j3 */
    public final void mo88439j3(boolean z, C63587a aVar) {
        View findViewById;
        C63587a aVar2 = aVar;
        boolean z2 = false;
        if (z) {
            this.f180318u = aVar2;
            View findViewById2 = findViewById(C0966R.C0970id.f5378dj);
            if (findViewById2 != null) {
                findViewById2.setBackground(aVar2.f180322d);
                findViewById2.animate().cancel();
                mo88438i3(true, aVar2);
                if (findViewById2.getVisibility() == 8) {
                    C9556a aVar3 = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar3.mo10233c(0);
                    View view = findViewById2;
                    C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC", "showTips", "(ZLcom/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$Action;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC", "showTips", "(ZLcom/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$Action;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C9556a aVar4 = new C9556a();
                    aVar4.mo10233c(Float.valueOf(0.0f));
                    C117292a.m165358d(view, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC", "showTips", "(ZLcom/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$Action;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    findViewById2.setAlpha(((Float) aVar4.mo10231a(0)).floatValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC", "showTips", "(ZLcom/tencent/mm/plugin/finder/viewmodel/component/FinderActionBarOverlayUIC$Action;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    findViewById2.animate().alpha(1.0f).setDuration(300).setListener(new C63596k(this, aVar2)).start();
                }
            }
            C63555gb gbVar = (C63555gb) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C63555gb.class);
            TextView textView = gbVar.f180240d;
            if (textView != null) {
                textView.setVisibility(8);
            }
            gbVar.mo88407c3(false);
            Log.m105924i("FinderWifiHintUIC", "[hideHint]");
            return;
        }
        C63587a aVar5 = this.f180318u;
        if (aVar5 != null && aVar5.f180319a == aVar2.f180319a) {
            z2 = true;
        }
        if ((z2 || aVar5 == null) && (findViewById = findViewById(C0966R.C0970id.f5378dj)) != null) {
            findViewById.animate().cancel();
            if (findViewById.getVisibility() == 0) {
                mo88436e3(true, aVar2);
                findViewById.animate().alpha(0.0f).setDuration(300).setListener(new C63597l(findViewById, this, aVar2)).start();
            }
        }
    }

    /* renamed from: k3 */
    public final void mo88440k3() {
        ViewTreeObserver viewTreeObserver;
        Log.m105924i("Finder.DoubleClickTipUIC", "unRegisteActionBarLayoutChangeListener!");
        ViewGroup viewGroup = (ViewGroup) ((C36570n) this.f180306f).getValue();
        if (!(viewGroup == null || (viewTreeObserver = viewGroup.getViewTreeObserver()) == null)) {
            viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener) ((C36570n) this.f180317t).getValue());
        }
        this.f180313p = null;
    }

    public void onCreateAfter(Bundle bundle) {
        super.onCreateAfter(bundle);
        mo88435d3().mo17043c(new C63590e(this, (ViewGroup) findViewById(C0966R.C0970id.f5376dh)));
    }

    public void onDestroy() {
        super.onDestroy();
        this.f180308h.removeCallbacksAndMessages((Object) null);
        mo88440k3();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63586o(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
        this.f180307g = (C11739f) a;
        this.f180308h = new MMHandler(Looper.getMainLooper());
        C36568h.m40985a(new C63598m(this));
        this.f180314q = new int[2];
        this.f180317t = C36568h.m40985a(new C63591f(this));
    }
}
