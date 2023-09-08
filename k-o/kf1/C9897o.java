package kf1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.storage.FinderStaggeredConfig;
import com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import dq1.C7461a;
import ef1.C58556f;
import ef1.C58563g;
import fo1.C8178c;
import gy3.C8480h;
import gy3.C87412m;
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
import te3.C49712hj1;
import up1.C37521f;
import zt3.C119157j;

/* renamed from: kf1.o */
public abstract class C9897o<T extends C0740i2> implements C8178c<C9864n<T>> {

    /* renamed from: d */
    public final MMActivity f30509d;

    /* renamed from: e */
    public final int f30510e;

    /* renamed from: f */
    public C9864n<T> f30511f;

    /* renamed from: g */
    public View f30512g;

    /* renamed from: h */
    public RefreshLoadMoreLayout f30513h;

    /* renamed from: i */
    public WxRecyclerAdapter<?> f30514i;

    /* renamed from: j */
    public RecyclerView.LayoutManager f30515j;

    /* renamed from: kf1.o$a */
    public static final class C9898a extends WxRecyclerAdapter<C0740i2> {

        /* renamed from: G */
        public final /* synthetic */ C9897o<T> f30516G;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9898a(ArrayList<C0740i2> arrayList, C9897o<T> oVar, C9500j jVar, boolean z) {
            super(jVar, arrayList, z);
            this.f30516G = oVar;
        }

        public void onBindViewHolder(RecyclerView.C16631z zVar, int i, List list) {
            C60905o oVar = (C60905o) zVar;
            C87412m.m108594g(oVar, "holder");
            C87412m.m108594g(list, "payloads");
            super.onBindViewHolder(oVar, i, list);
            this.f30516G.getClass();
        }

        /* renamed from: w6 */
        public void mo10297w6(RecyclerView recyclerView) {
            C58556f j3;
            C87412m.m108594g(recyclerView, "recyclerView");
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f30516G.f30509d);
            if (f != null && (j3 = f.mo12854j3(this.f30516G.f30510e)) != null) {
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
                if (i == 0 || i == -1) {
                    ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = true;
                } else if (this.f30516G.mo10432G0(oVar)) {
                    ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = true;
                }
            }
        }
    }

    /* renamed from: kf1.o$b */
    public static final class C9899b implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ C9897o<T> f30517d;

        public C9899b(C9897o<T> oVar) {
            this.f30517d = oVar;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            C87412m.m108594g(eVar, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g((C60905o) zVar, "holder");
            this.f30517d.mo10438m0(eVar, view, i);
        }
    }

    /* renamed from: kf1.o$c */
    public static final class C9900c extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public boolean f30518a = true;

        /* renamed from: b */
        public final /* synthetic */ C9897o<T> f30519b;

        /* renamed from: kf1.o$c$a */
        public static final class C9901a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C9897o<T> f30520d;

            public C9901a(C9897o<T> oVar) {
                this.f30520d = oVar;
            }

            public final void run() {
                this.f30520d.mo10435Z().mo2478o();
            }
        }

        /* renamed from: kf1.o$c$b */
        public static final class C9902b implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C9897o<T> f30521d;

            public C9902b(C9897o<T> oVar) {
                this.f30521d = oVar;
            }

            public final void run() {
                this.f30521d.mo10435Z().requestRefresh();
            }
        }

        /* renamed from: kf1.o$c$c */
        public static final class C9903c implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C9897o<T> f30522d;

            /* renamed from: e */
            public final /* synthetic */ View f30523e;

            /* renamed from: kf1.o$c$c$a */
            public static final class C9904a implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C9897o<T> f30524d;

                public C9904a(C9897o<T> oVar) {
                    this.f30524d = oVar;
                }

                public final void run() {
                    C37521f fVar = C37521f.f99374d;
                    fVar.getClass();
                    C35464c<Integer> cVar = C37521f.f99461n;
                    if (cVar.mo60266n().intValue() == 3) {
                        fVar.getClass();
                        cVar.mo60265l();
                    }
                    this.f30524d.mo10435Z().requestRefresh();
                }
            }

            public C9903c(C9897o<T> oVar, View view) {
                this.f30522d = oVar;
                this.f30523e = view;
            }

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4$onRefreshEnd$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(8);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4$onRefreshEnd$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4$onRefreshEnd$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f30522d.getClass();
                View findViewById = this.f30523e.findViewById(C0966R.C0970id.i7j);
                if (findViewById != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view3 = findViewById;
                    C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4$onRefreshEnd$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4$onRefreshEnd$1$2", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                ((C119157j) C119157j.f356862d).mo183875f(new C9904a(this.f30522d));
                C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4$onRefreshEnd$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C9900c(C9897o<T> oVar) {
            this.f30519b = oVar;
        }

        /* renamed from: a */
        public void mo3747a(int i) {
            if (this.f30518a && i > 0) {
                this.f30518a = false;
            }
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            ((C119157j) C119157j.f356862d).mo183875f(new C9901a(this.f30519b));
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f30519b.getClass();
            this.f30519b.mo10435Z();
        }

        /* renamed from: d */
        public void mo3680d(int i) {
            View v;
            if (((ArrayList) this.f30519b.mo10435Z().f30443e.f33886d).size() == 0 && (v = this.f30519b.mo10440v()) != null) {
                C9897o<T> oVar = this.f30519b;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                C117292a.m165358d(v, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                v.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(v, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                RefreshLoadMoreLayout refreshLoadMoreLayout = oVar.f30513h;
                if (refreshLoadMoreLayout != null) {
                    refreshLoadMoreLayout.setVisibility(8);
                }
                View findViewById = v.findViewById(C0966R.C0970id.i7j);
                if (findViewById != null) {
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(0);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshBegin", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            this.f30519b.getClass();
            ((C119157j) C119157j.f356862d).mo183875f(new C9902b(this.f30519b));
        }

        /* renamed from: e */
        public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            RefreshLoadMoreLayout.C7080c<Object> cVar2 = cVar;
            C87412m.m108594g(cVar2, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f30519b.getClass();
            View v = this.f30519b.mo10440v();
            if (v != null) {
                C9897o<T> oVar = this.f30519b;
                RecyclerView.C16613e adapter = oVar.f30513h.getRecyclerView().getAdapter();
                WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
                if (cVar2.f24947b != -1) {
                    if ((wxRecyclerAdapter != null ? wxRecyclerAdapter.mo82597F4() : 0) > 0 || oVar.mo10434I0()) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("onRefreshEnd show headerView make rlLayout visible :");
                        sb.append(wxRecyclerAdapter != null ? wxRecyclerAdapter.mo82597F4() : 0);
                        Log.m105924i("Finder.FinderBaseGridFeedUIContract.ViewCallback", sb.toString());
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(8);
                        C117292a.m165358d(v, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        v.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(v, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        View view = oVar.f30512g;
                        if (view != null) {
                            TextView textView = (TextView) view.findViewById(C0966R.C0970id.knx);
                            if (textView != null) {
                                textView.setText(oVar.mo10437k0(cVar2));
                            }
                            TextView textView2 = (TextView) view.findViewById(C0966R.C0970id.f357845c22);
                            if (textView2 != null) {
                                textView2.setText(oVar.mo10439p(cVar2));
                            }
                        }
                        RefreshLoadMoreLayout refreshLoadMoreLayout = oVar.f30513h;
                        if (refreshLoadMoreLayout != null) {
                            refreshLoadMoreLayout.setVisibility(0);
                        }
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("onRefreshEnd showEmptyView for count:");
                        sb4.append(wxRecyclerAdapter != null ? wxRecyclerAdapter.mo82597F4() : 0);
                        Log.m105924i("Finder.FinderBaseGridFeedUIContract.ViewCallback", sb4.toString());
                        Log.m105924i("Finder.FinderBaseGridFeedUIContract.ViewCallback", "showEmptyView");
                        View v2 = oVar.mo10440v();
                        if (v2 != null) {
                            C9556a aVar2 = new C9556a();
                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                            aVar2.mo10233c(0);
                            View view2 = v2;
                            C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            v2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                            C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            RefreshLoadMoreLayout refreshLoadMoreLayout2 = oVar.f30513h;
                            if (refreshLoadMoreLayout2 != null) {
                                refreshLoadMoreLayout2.setVisibility(8);
                            }
                            TextView textView3 = (TextView) v2.findViewById(C0966R.C0970id.cj7);
                            if (textView3 != null) {
                                textView3.setVisibility(0);
                            }
                            View findViewById = v2.findViewById(C0966R.C0970id.i7j);
                            if (findViewById != null) {
                                C9556a aVar3 = new C9556a();
                                aVar3.mo10233c(8);
                                View view3 = findViewById;
                                C117292a.m165358d(view3, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                                C117292a.m165359e(view3, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                            View findViewById2 = v2.findViewById(C0966R.C0970id.is_);
                            if (findViewById2 != null) {
                                C9556a aVar4 = new C9556a();
                                aVar4.mo10233c(8);
                                View view4 = findViewById2;
                                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                findViewById2.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                                C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback", "showEmptyViewInternal", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            }
                        }
                    }
                } else {
                    Log.m105924i("Finder.FinderBaseGridFeedUIContract.ViewCallback", "onRefreshEnd retry");
                    C9556a aVar5 = new C9556a();
                    ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
                    aVar5.mo10233c(0);
                    C117292a.m165358d(v, aVar5.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    v.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
                    C117292a.m165359e(v, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    RefreshLoadMoreLayout refreshLoadMoreLayout3 = oVar.f30513h;
                    if (refreshLoadMoreLayout3 != null) {
                        refreshLoadMoreLayout3.setVisibility(8);
                    }
                    TextView textView4 = (TextView) v.findViewById(C0966R.C0970id.cj7);
                    if (textView4 != null) {
                        textView4.setVisibility(8);
                    }
                    TextView textView5 = (TextView) v.findViewById(C0966R.C0970id.is_);
                    if (textView5 != null) {
                        textView5.setVisibility(0);
                    }
                    View findViewById3 = v.findViewById(C0966R.C0970id.i7j);
                    if (findViewById3 != null) {
                        C9556a aVar6 = new C9556a();
                        aVar6.mo10233c(8);
                        C117292a.m165358d(findViewById3, aVar6.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        findViewById3.setVisibility(((Integer) aVar6.mo10231a(0)).intValue());
                        C117292a.m165359e(findViewById3, "com/tencent/mm/plugin/finder/feed/FinderBaseGridFeedUIContractNew$ViewCallback$initView$4", "onRefreshEnd", "(Lcom/tencent/mm/view/RefreshLoadMoreLayout$MoreReason;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                    View findViewById4 = v.findViewById(C0966R.C0970id.is_);
                    if (findViewById4 != null) {
                        findViewById4.setOnClickListener(new C9903c(oVar, v));
                    }
                }
            }
            this.f30519b.mo10431F0(cVar2);
            this.f30519b.getClass();
            this.f30519b.mo10435Z();
        }
    }

    public C9897o(MMActivity mMActivity, int i, int i2, boolean z, int i3, int i4, C8480h hVar) {
        i3 = (i4 & 16) != 0 ? -1 : i3;
        C87412m.m108594g(mMActivity, "context");
        this.f30509d = mMActivity;
        this.f30510e = i3;
        View findViewById = mMActivity.findViewById(C0966R.C0970id.ivb);
        C87412m.m108591d(findViewById);
        this.f30513h = (RefreshLoadMoreLayout) findViewById;
        new FinderStaggeredConfig(0, (C7461a) null, 3, (C8480h) null);
    }

    /* renamed from: D */
    public abstract RecyclerView.LayoutManager mo10429D(Context context);

    /* renamed from: E0 */
    public abstract void mo10430E0();

    /* renamed from: F0 */
    public abstract void mo10431F0(RefreshLoadMoreLayout.C7080c<Object> cVar);

    /* renamed from: G0 */
    public abstract boolean mo10432G0(C60905o oVar);

    /* renamed from: H0 */
    public abstract boolean mo10433H0();

    /* renamed from: I0 */
    public abstract boolean mo10434I0();

    /* renamed from: Z */
    public final C9864n<T> mo10435Z() {
        C9864n<T> nVar = this.f30511f;
        if (nVar != null) {
            return nVar;
        }
        C87412m.m108603p("present");
        throw null;
    }

    /* renamed from: d */
    public void mo10436d(ArrayList<C0740i2> arrayList) {
        Class cls = C13442s8.class;
        C87412m.m108594g(arrayList, "data");
        RecyclerView recyclerView = this.f30513h.getRecyclerView();
        RecyclerView.LayoutManager D = mo10429D(this.f30509d);
        C87412m.m108594g(D, "<set-?>");
        this.f30515j = D;
        FinderLikeDrawer.Companion companion = FinderLikeDrawer.f17829D;
        MMActivity mMActivity = this.f30509d;
        Window window = mMActivity.getWindow();
        C87412m.m108593f(window, "context.window");
        boolean z = true;
        companion.mo4621a(mMActivity, window, 1);
        RecyclerView.LayoutManager layoutManager = this.f30515j;
        if (layoutManager != null) {
            recyclerView.setLayoutManager(layoutManager);
            C9898a aVar = new C9898a(arrayList, this, mo10435Z().mo2476U(), false);
            this.f30514i = aVar;
            recyclerView.setAdapter(aVar);
            recyclerView.mo17085h0(mo10442y());
            WxRecyclerAdapter<?> wxRecyclerAdapter = this.f30514i;
            if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.f173488o = new C9899b(this);
                View x = mo10441x();
                this.f30512g = x;
                if (x != null) {
                    WxRecyclerAdapter<?> wxRecyclerAdapter2 = this.f30514i;
                    if (wxRecyclerAdapter2 != null) {
                        C60898l.m71329W5(wxRecyclerAdapter2, x, 0, false, 4, (Object) null);
                    } else {
                        C87412m.m108603p("adapter");
                        throw null;
                    }
                }
                this.f30513h.setActionCallback(new C9900c(this));
                C39818r rVar = C39818r.f106831a;
                C58556f j3 = ((C13442s8) rVar.mo62444c(this.f30509d).mo75002a(cls)).mo12854j3(this.f30510e);
                if (j3 != null) {
                    j3.mo83455c(recyclerView);
                }
                Pattern pattern = C61926c.f176038a;
                C61926c.m72701z(C88643g.m110546d(), new C9915p(this));
                C37521f.f99374d.getClass();
                if (C37521f.f99274R4.mo60266n().intValue() == 1) {
                    recyclerView.mo17043c(new C10811d1("Finder.FinderBaseGridFeedUIContract.ViewCallback", this.f30513h));
                }
                C39622i0 a = rVar.mo62444c(this.f30509d).mo75002a(cls);
                C87412m.m108593f(a, "UICProvider.of(context).…rReporterUIC::class.java)");
                C13442s8 s8Var = (C13442s8) a;
                C49712hj1 i3 = s8Var.mo12843J3() ? s8Var.mo12853i3(this.f30510e) : s8Var.mo12861q3();
                int i = i3.f134675i;
                if (!(i == 22 || i == 28 || i == 30 || i == 81 || i == 155 || i == 170)) {
                    z = false;
                }
                Log.m105924i("Finder.FinderBaseGridFeedUIContract.ViewCallback", "needMarkRead:" + z + " commentScene:" + i3.f134675i + " fromCommentScene:" + i3.f134677n);
                if (z) {
                    C9496f.m9181b(recyclerView, new C9933q(i3), C9948r.f30590d);
                    return;
                }
                return;
            }
            C87412m.m108603p("adapter");
            throw null;
        }
        C87412m.m108603p("finderManager");
        throw null;
    }

    /* renamed from: k0 */
    public abstract CharSequence mo10437k0(RefreshLoadMoreLayout.C7080c<Object> cVar);

    /* renamed from: m0 */
    public abstract void mo10438m0(RecyclerView.C16613e<?> eVar, View view, int i);

    /* renamed from: p */
    public abstract String mo10439p(RefreshLoadMoreLayout.C7080c<Object> cVar);

    /* renamed from: v */
    public abstract View mo10440v();

    /* renamed from: x */
    public abstract View mo10441x();

    /* renamed from: y */
    public abstract RecyclerView.C0129l mo10442y();
}
