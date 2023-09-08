package kf1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import dq1.C7461a;
import ef1.C58556f;
import ef1.C58563g;
import fo1.C8178c;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C9496f;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import lp3.C88643g;
import mf1.C10811d1;
import o40.C61926c;
import pe1.C35464c;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import up1.C14367u0;
import up1.C37521f;
import zt3.C119157j;

/* renamed from: kf1.h */
public abstract class C9753h implements C8178c<C9732g> {

    /* renamed from: d */
    public final MMActivity f30214d;

    /* renamed from: e */
    public final int f30215e;

    /* renamed from: f */
    public final int f30216f;

    /* renamed from: g */
    public final int f30217g;

    /* renamed from: h */
    public final String f30218h;

    /* renamed from: i */
    public int f30219i;

    /* renamed from: j */
    public RefreshLoadMoreLayout f30220j;

    /* renamed from: n */
    public WxRecyclerAdapter<?> f30221n;

    /* renamed from: o */
    public C9732g f30222o;

    /* renamed from: p */
    public final int f30223p;

    /* renamed from: q */
    public C14367u0 f30224q;

    /* renamed from: r */
    public View f30225r;

    /* renamed from: s */
    public View f30226s;

    /* renamed from: t */
    public final C13601g f30227t;

    /* renamed from: kf1.h$a */
    public static final class C9754a extends C87413o implements C32224a<C10811d1> {

        /* renamed from: d */
        public final /* synthetic */ C9753h f30228d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9754a(C9753h hVar) {
            super(0);
            this.f30228d = hVar;
        }

        public Object invoke() {
            C9753h hVar = this.f30228d;
            return new C10811d1(hVar.f30218h, hVar.f30220j);
        }
    }

    /* renamed from: kf1.h$b */
    public static final class C9755b extends WxRecyclerAdapter<C0740i2> {

        /* renamed from: G */
        public final /* synthetic */ C9753h f30229G;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9755b(ArrayList<C0740i2> arrayList, C9753h hVar, C9500j jVar, boolean z) {
            super(jVar, arrayList, z);
            this.f30229G = hVar;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
            C60905o oVar = (C60905o) zVar;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(list, "payloads");
            super.onBindViewHolder(oVar, i, list);
            this.f30229G.mo9293P0(oVar, i);
        }

        /* renamed from: w6 */
        public void mo10297w6(RecyclerView recyclerView) {
            C58556f j3;
            C87412m.m108594g(recyclerView, "recyclerView");
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f30229G.f30214d);
            if (f != null && (j3 = f.mo12854j3(this.f30229G.f30217g)) != null) {
                new C58563g(j3).onScrollStateChanged(recyclerView, 5);
            }
        }

        /* renamed from: z6 */
        public void onViewAttachedToWindow(C60905o oVar) {
            C87412m.m108594g(oVar, "holder");
            super.onViewAttachedToWindow(oVar);
            ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                int i = oVar.f44859i;
                this.f30229G.getClass();
                if (i != 0) {
                    int i2 = oVar.f44859i;
                    C9753h hVar = this.f30229G;
                    if (i2 != hVar.f30223p) {
                        if (hVar.mo10353W0(oVar)) {
                            ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = true;
                            return;
                        }
                        return;
                    }
                }
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = true;
            }
        }
    }

    /* renamed from: kf1.h$c */
    public static final class C9756c implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ C9753h f30230d;

        public C9756c(C9753h hVar) {
            this.f30230d = hVar;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g((C60905o) zVar, "holder");
            this.f30230d.mo9294Q0(eVar, view, i);
        }
    }

    /* renamed from: kf1.h$d */
    public static final class C9757d extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public boolean f30231a = true;

        /* renamed from: b */
        public final /* synthetic */ C9753h f30232b;

        /* renamed from: kf1.h$d$a */
        public static final class C9758a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C9753h f30233d;

            public C9758a(C9753h hVar) {
                this.f30233d = hVar;
            }

            public final void run() {
                this.f30233d.mo10348I0().mo2521o();
            }
        }

        /* renamed from: kf1.h$d$b */
        public static final class C9759b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C9753h f30234d;

            public C9759b(C9753h hVar) {
                this.f30234d = hVar;
            }

            public final void run() {
                this.f30234d.mo10348I0().requestRefresh();
            }
        }

        /* renamed from: kf1.h$d$c */
        public static final class C9760c implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C9753h f30235d;

            /* renamed from: e */
            public final /* synthetic */ View f30236e;

            /* renamed from: kf1.h$d$c$a */
            public static final class C9761a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C9753h f30237d;

                public C9761a(C9753h hVar) {
                    this.f30237d = hVar;
                }

                public final void run() {
                    C37521f fVar = C37521f.f99374d;
                    fVar.getClass();
                    C35464c<Integer> cVar = C37521f.f99461n;
                    if (cVar.mo60266n().intValue() == 3) {
                        fVar.getClass();
                        cVar.mo60265l();
                    }
                    this.f30237d.mo10348I0().requestRefresh();
                }
            }

            public C9760c(C9753h hVar, View view) {
                this.f30235d = hVar;
                this.f30236e = view;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$5$onRefreshEnd$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$5$onRefreshEnd$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$5$onRefreshEnd$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f30235d.mo10285T0(false);
                View findViewById = this.f30236e.findViewById(C0966R.C0970id.i7j);
                if (findViewById != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view3 = findViewById;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$5$onRefreshEnd$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$5$onRefreshEnd$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                ((C119157j) C119157j.f356862d).mo183875f(new C9761a(this.f30235d));
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$5$onRefreshEnd$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C9757d(C9753h hVar) {
            this.f30232b = hVar;
        }

        /* renamed from: a */
        public void mo3747a(int i) {
            if (this.f30231a && i > 0) {
                this.f30231a = false;
            }
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            ((C119157j) C119157j.f356862d).mo183875f(new C9758a(this.f30232b));
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f30232b.mo10332K0(cVar);
            this.f30232b.mo10348I0().mo2513A7(cVar);
        }

        /* renamed from: d */
        public void mo3680d(int i) {
            View m0;
            if (this.f30232b.mo10348I0().f30175e.getSize() == 0 && (m0 = this.f30232b.mo9299m0()) != null) {
                C9753h hVar = this.f30232b;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(m0, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$5", "onRefreshBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m0.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(m0, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$5", "onRefreshBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                RefreshLoadMoreLayout refreshLoadMoreLayout = hVar.f30220j;
                if (refreshLoadMoreLayout != null) {
                    refreshLoadMoreLayout.setVisibility(8);
                }
                View findViewById = m0.findViewById(C0966R.C0970id.i7j);
                if (findViewById != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$5", "onRefreshBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$5", "onRefreshBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            C9753h hVar2 = this.f30232b;
            hVar2.getClass();
            if (!(hVar2 instanceof C9916p2)) {
                ((C119157j) C119157j.f356862d).mo183875f(new C9759b(this.f30232b));
                return;
            }
            this.f30232b.mo10348I0().requestRefresh();
        }

        /* renamed from: e */
        public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            RefreshLoadMoreLayout.C7080c<Object> cVar2 = cVar;
            C87412m.m108594g(cVar2, TPReportKeys.PlayerStep.PLAYER_REASON);
            if (this.f30232b.mo10334M0(cVar2)) {
                Log.m105924i(this.f30232b.f30218h, "onRefreshEnd handleBySelf");
                this.f30232b.mo10333L0(cVar2);
                return;
            }
            View m0 = this.f30232b.mo9299m0();
            if (m0 != null) {
                C9753h hVar = this.f30232b;
                RecyclerView.C16613e adapter = hVar.getRecyclerView().getAdapter();
                WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
                int i = 0;
                if (cVar2.f24947b != -1) {
                    if ((wxRecyclerAdapter != null ? wxRecyclerAdapter.mo82597F4() : 0) > 0 || hVar.mo10287a1()) {
                        String str = hVar.f30218h;
                        StringBuilder sb = new StringBuilder();
                        sb.append("onRefreshEnd show headerView make rlLayout visible :");
                        sb.append(wxRecyclerAdapter != null ? wxRecyclerAdapter.mo82597F4() : 0);
                        Log.m105924i(str, sb.toString());
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        C117292a.m165358d(m0, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$5", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        m0.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(m0, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$5", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view = hVar.f30225r;
                        if (view != null) {
                            TextView textView = (TextView) view.findViewById(C0966R.C0970id.knx);
                            if (textView != null) {
                                textView.setText(hVar.mo9292J0(cVar2));
                            }
                            TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.f357845c22);
                            if (textView2 != null) {
                                textView2.setText(hVar.mo9298k0(cVar2));
                            }
                        }
                        RefreshLoadMoreLayout refreshLoadMoreLayout = hVar.f30220j;
                        if (refreshLoadMoreLayout != null) {
                            refreshLoadMoreLayout.setVisibility(0);
                        }
                    } else {
                        String str2 = hVar.f30218h;
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("onRefreshEnd showEmptyView for count:");
                        if (wxRecyclerAdapter != null) {
                            i = wxRecyclerAdapter.mo82597F4();
                        }
                        sb4.append(i);
                        Log.m105924i(str2, sb4.toString());
                        hVar.mo10335Z0();
                    }
                } else {
                    Log.m105924i(hVar.f30218h, "onRefreshEnd retry");
                    C9556a aVar2 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar2.mo10233c(0);
                    C117292a.m165358d(m0, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$5", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    m0.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(m0, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$5", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    RefreshLoadMoreLayout refreshLoadMoreLayout2 = hVar.f30220j;
                    if (refreshLoadMoreLayout2 != null) {
                        refreshLoadMoreLayout2.setVisibility(8);
                    }
                    TextView textView3 = (TextView) m0.findViewById(C0966R.C0970id.cj7);
                    if (textView3 != null) {
                        textView3.setVisibility(8);
                    }
                    TextView textView4 = (TextView) m0.findViewById(C0966R.C0970id.is_);
                    if (textView4 != null) {
                        textView4.setVisibility(0);
                    }
                    View findViewById = m0.findViewById(C0966R.C0970id.i7j);
                    if (findViewById != null) {
                        C9556a aVar3 = new C9556a();
                        aVar3.mo10233c(8);
                        View view2 = findViewById;
                        C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$5", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                        C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback$initView$5", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    hVar.mo10285T0(true);
                    View findViewById2 = m0.findViewById(C0966R.C0970id.is_);
                    if (findViewById2 != null) {
                        findViewById2.setOnClickListener(new C9760c(hVar, m0));
                    }
                }
            }
            this.f30232b.mo10352U0(cVar2);
            this.f30232b.mo10351S0(cVar2);
            this.f30232b.mo10348I0().onRefreshEnd(cVar2);
        }
    }

    /* renamed from: kf1.h$e */
    public static final class C9762e extends C87413o implements C32226l<Void, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9753h f30238d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9762e(C9753h hVar) {
            super(1);
            this.f30238d = hVar;
        }

        public Object invoke(Object obj) {
            Void voidR = (Void) obj;
            this.f30238d.mo10348I0().mo2523q();
            if (this.f30238d.mo10354X0()) {
                RefreshLoadMoreLayout.m66897N(this.f30238d.f30220j, 0, false, 3, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    public C9753h(MMActivity mMActivity, int i, int i2, boolean z, int i3) {
        C87412m.m108594g(mMActivity, "context");
        this.f30214d = mMActivity;
        this.f30215e = i;
        this.f30216f = i2;
        this.f30217g = i3;
        this.f30218h = "Finder.FinderBaseGridFeedUIContract.ViewCallback";
        this.f30219i = 3;
        View y = mo10357y(C0966R.C0970id.ivb);
        C87412m.m108591d(y);
        this.f30220j = (RefreshLoadMoreLayout) y;
        this.f30223p = -1;
        this.f30224q = new FinderStaggeredConfig(0, (C7461a) null, 3, (C8480h) null);
        this.f30227t = C36568h.m40985a(new C9754a(this));
    }

    /* renamed from: D */
    public final WxRecyclerAdapter<?> mo10346D() {
        WxRecyclerAdapter<?> wxRecyclerAdapter = this.f30221n;
        if (wxRecyclerAdapter != null) {
            return wxRecyclerAdapter;
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    /* renamed from: E0 */
    public View mo10347E0() {
        return null;
    }

    /* renamed from: F0 */
    public abstract View mo9289F0();

    /* renamed from: G0 */
    public abstract RecyclerView.C0129l mo9290G0();

    /* renamed from: H0 */
    public abstract RecyclerView.LayoutManager mo9291H0(Context context);

    /* renamed from: I0 */
    public final C9732g mo10348I0() {
        C9732g gVar = this.f30222o;
        if (gVar != null) {
            return gVar;
        }
        C87412m.m108603p("present");
        throw null;
    }

    /* renamed from: J0 */
    public abstract CharSequence mo9292J0(RefreshLoadMoreLayout.C7080c<Object> cVar);

    /* renamed from: K0 */
    public void mo10332K0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }

    /* renamed from: L0 */
    public void mo10333L0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }

    /* renamed from: M0 */
    public boolean mo10334M0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        return false;
    }

    /* renamed from: N0 */
    public float mo10349N0() {
        return 0.0f;
    }

    /* renamed from: O0 */
    public boolean mo10350O0() {
        return false;
    }

    /* renamed from: P0 */
    public void mo9293P0(C60905o oVar, int i) {
        C87412m.m108594g(oVar, "holder");
    }

    /* renamed from: Q0 */
    public abstract void mo9294Q0(RecyclerView.C16613e<?> eVar, View view, int i);

    /* renamed from: R0 */
    public abstract void mo9295R0();

    /* renamed from: S0 */
    public void mo10351S0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }

    /* renamed from: T0 */
    public void mo10285T0(boolean z) {
    }

    /* renamed from: U0 */
    public void mo10352U0(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
    }

    /* renamed from: V0 */
    public void mo10286V0() {
        Pattern pattern = C61926c.f176038a;
        C61926c.m72701z(C88643g.m110546d(), new C9762e(this));
    }

    /* renamed from: W0 */
    public boolean mo10353W0(C60905o oVar) {
        C87412m.m108594g(oVar, "holder");
        return false;
    }

    /* renamed from: X0 */
    public boolean mo10354X0() {
        return !(this instanceof C9916p2);
    }

    /* renamed from: Y0 */
    public final void mo10355Y0(C9732g gVar) {
        C87412m.m108594g(gVar, "<set-?>");
        this.f30222o = gVar;
    }

    /* renamed from: Z */
    public C14367u0 mo9296Z() {
        return this.f30224q;
    }

    /* renamed from: Z0 */
    public void mo10335Z0() {
        Log.m105924i(this.f30218h, "showEmptyView");
        View m0 = mo9299m0();
        if (m0 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            View view = m0;
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m0.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f30220j;
            if (refreshLoadMoreLayout != null) {
                refreshLoadMoreLayout.setVisibility(8);
            }
            TextView textView = (TextView) m0.findViewById(C0966R.C0970id.cj7);
            if (textView != null) {
                textView.setVisibility(0);
            }
            View findViewById = m0.findViewById(C0966R.C0970id.i7j);
            if (findViewById != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                C117292a.m165358d(findViewById, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            View findViewById2 = m0.findViewById(C0966R.C0970id.is_);
            if (findViewById2 != null) {
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(8);
                C117292a.m165358d(findViewById2, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContract$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    /* renamed from: a1 */
    public boolean mo10287a1() {
        return this instanceof C9840l6;
    }

    /* renamed from: b */
    public View mo4181b() {
        return null;
    }

    /* renamed from: d */
    public void mo9297d(ArrayList<C0740i2> arrayList) {
        Class cls = C13442s8.class;
        C87412m.m108594g(arrayList, "data");
        RecyclerView recyclerView = this.f30220j.getRecyclerView();
        RecyclerView.LayoutManager H0 = mo9291H0(this.f30214d);
        C87412m.m108594g(H0, "<set-?>");
        recyclerView.setLayoutManager(H0);
        C9755b bVar = new C9755b(arrayList, this, mo10348I0().mo2516U(), mo10350O0());
        this.f30221n = bVar;
        recyclerView.setAdapter(bVar);
        recyclerView.mo17085h0(mo9290G0());
        WxRecyclerAdapter<?> wxRecyclerAdapter = this.f30221n;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.f173488o = new C9756c(this);
            View F0 = mo9289F0();
            this.f30225r = F0;
            if (F0 != null) {
                WxRecyclerAdapter<?> wxRecyclerAdapter2 = this.f30221n;
                if (wxRecyclerAdapter2 != null) {
                    C60898l.m71329W5(wxRecyclerAdapter2, F0, 0, false, 4, (Object) null);
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            }
            View E0 = mo10347E0();
            this.f30226s = E0;
            boolean z = false;
            if (E0 != null) {
                WxRecyclerAdapter<?> wxRecyclerAdapter3 = this.f30221n;
                if (wxRecyclerAdapter3 != null) {
                    wxRecyclerAdapter3.mo85792R5(E0, this.f30223p, false);
                } else {
                    C87412m.m108603p("adapter");
                    throw null;
                }
            }
            this.f30220j.setActionCallback(new C9757d(this));
            C39818r rVar = C39818r.f106831a;
            C58556f j3 = ((C13442s8) rVar.mo62444c(this.f30214d).mo75002a(cls)).mo12854j3(this.f30217g);
            if (j3 != null) {
                j3.mo83455c(recyclerView);
            }
            mo10286V0();
            C37521f.f99374d.getClass();
            if (C37521f.f99274R4.mo60266n().intValue() == 1) {
                recyclerView.mo17043c((C10811d1) ((C36570n) this.f30227t).getValue());
            }
            C39622i0 a = rVar.mo62444c(this.f30214d).mo75002a(cls);
            C87412m.m108593f(a, "UICProvider.of(context).…rReporterUIC::class.java)");
            C13442s8 s8Var = (C13442s8) a;
            C49712hj1 i3 = s8Var.mo12843J3() ? s8Var.mo12853i3(this.f30217g) : s8Var.mo12861q3();
            int i = i3.f134675i;
            if (i == 22 || i == 26 || i == 28 || i == 30 || i == 81 || i == 155 || i == 170) {
                z = true;
            }
            String str = this.f30218h;
            Log.m105924i(str, "needMarkRead:" + z + " commentScene:" + i3.f134675i + " fromCommentScene:" + i3.f134677n);
            if (z) {
                C9496f.m9181b(recyclerView, new C9784i(this, i3), C9804j.f30341d);
                return;
            }
            return;
        }
        C87412m.m108603p("adapter");
        throw null;
    }

    public RecyclerView getRecyclerView() {
        return this.f30220j.getRecyclerView();
    }

    /* renamed from: k0 */
    public abstract String mo9298k0(RefreshLoadMoreLayout.C7080c<Object> cVar);

    /* renamed from: m0 */
    public abstract View mo9299m0();

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.findViewById(r2);
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T extends android.view.View> T mo10357y(int r2) {
        /*
            r1 = this;
            android.view.View r0 = r1.mo4181b()
            if (r0 == 0) goto L_0x000c
            android.view.View r0 = r0.findViewById(r2)
            if (r0 != 0) goto L_0x0012
        L_0x000c:
            com.tencent.mm.ui.MMActivity r0 = r1.f30214d
            android.view.View r0 = r0.findViewById(r2)
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9753h.mo10357y(int):android.view.View");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9753h(MMActivity mMActivity, int i, int i2, boolean z, int i3, int i4, C8480h hVar) {
        this(mMActivity, i, i2, (i4 & 8) != 0 ? false : z, (i4 & 16) != 0 ? -1 : i3);
    }
}
