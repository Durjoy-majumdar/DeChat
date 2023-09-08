package rs1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.feed.model.FinderEmojiListLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderEmojiSelectUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileUI;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderEmojiListUIC$initView$2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fe1.C58961d;
import fe1.C58969q;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import mo1.C11059w;
import p192l4.C10462b;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import te3.C50700ol1;
import te3.C50955qg0;
import te3.C51103rg0;
import up1.C37521f;
import ye1.C66630l;
import zp3.C16380c;
import zt3.C119157j;

/* renamed from: rs1.o1 */
public final class C63599o1 extends C11059w {

    /* renamed from: e */
    public RefreshLoadMoreLayout f180345e;

    /* renamed from: f */
    public FrameLayout f180346f;

    /* renamed from: g */
    public final C13601g f180347g = C36568h.m40985a(new C63605d(this));

    /* renamed from: h */
    public final C13601g f180348h = C36568h.m40985a(new C63603b(this));

    /* renamed from: i */
    public WxRecyclerAdapter<C0740i2> f180349i;

    /* renamed from: j */
    public final C49712hj1 f180350j;

    /* renamed from: n */
    public final C13601g f180351n;

    /* renamed from: o */
    public final C13601g f180352o;

    /* renamed from: p */
    public final C13601g f180353p;

    /* renamed from: rs1.o1$a */
    public final class C63600a extends C16380c {

        /* renamed from: e */
        public final /* synthetic */ C63599o1 f180354e;

        /* renamed from: rs1.o1$a$a */
        public static final class C63601a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ C63599o1 f180355d;

            /* renamed from: e */
            public final /* synthetic */ C63600a f180356e;

            /* renamed from: rs1.o1$a$a$a */
            public static final class C63602a implements View.OnClickListener {

                /* renamed from: d */
                public final /* synthetic */ C63599o1 f180357d;

                /* renamed from: e */
                public final /* synthetic */ C63600a f180358e;

                public C63602a(C63599o1 o1Var, C63600a aVar) {
                    this.f180357d = o1Var;
                    this.f180358e = aVar;
                }

                public final void onClick(View view) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(view);
                    Object[] array = arrayList.toArray();
                    arrayList.clear();
                    C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderEmojiListUIC$ViewActionCallback$updateState$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    RefreshLoadMoreLayout refreshLoadMoreLayout = this.f180357d.f180345e;
                    if (refreshLoadMoreLayout != null) {
                        RefreshLoadMoreLayout.m66897N(refreshLoadMoreLayout, 0, false, 3, (Object) null);
                        this.f180358e.mo5115a();
                        C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderEmojiListUIC$ViewActionCallback$updateState$1$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        return;
                    }
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
            }

            public C63601a(C63599o1 o1Var, C63600a aVar) {
                this.f180355d = o1Var;
                this.f180356e = aVar;
            }

            public final void run() {
                Fragment fragment = this.f180355d.getFragment();
                if (!(fragment != null && fragment.isDetached()) && !this.f180355d.getActivity().isDestroyed() && !this.f180355d.getActivity().isFinishing()) {
                    Log.m105924i("FinderEmojiListUIC", "[updateState] state=" + this.f180355d.mo88456c3().f158664e + " cachedState=" + this.f180355d.mo88456c3().f158665f);
                    FrameLayout frameLayout = this.f180355d.f180346f;
                    if (frameLayout != null) {
                        frameLayout.setOnClickListener((View.OnClickListener) null);
                        frameLayout.setVisibility(8);
                        if (this.f180355d.mo88456c3().f158665f == FinderEmojiListLoader.C55739a.NO_CACHE) {
                            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f180355d.f180345e;
                            if (refreshLoadMoreLayout != null) {
                                refreshLoadMoreLayout.setSuperNestedScroll(false);
                                int ordinal = this.f180355d.mo88456c3().f158664e.ordinal();
                                if (ordinal == 1) {
                                    C63599o1 o1Var = this.f180355d;
                                    FrameLayout frameLayout2 = o1Var.f180346f;
                                    if (frameLayout2 != null) {
                                        frameLayout2.setVisibility(0);
                                        o1Var.mo88457d3().f191594c.setVisibility(8);
                                        o1Var.mo88457d3().f191595d.setVisibility(8);
                                        o1Var.mo88457d3().f191593b.setVisibility(0);
                                        return;
                                    }
                                    C87412m.m108603p("stateLayout");
                                    throw null;
                                } else if (ordinal == 2) {
                                    C63599o1 o1Var2 = this.f180355d;
                                    FrameLayout frameLayout3 = o1Var2.f180346f;
                                    if (frameLayout3 != null) {
                                        frameLayout3.setVisibility(0);
                                        o1Var2.mo88457d3().f191594c.setVisibility(0);
                                        o1Var2.mo88457d3().f191595d.setVisibility(8);
                                        o1Var2.mo88457d3().f191593b.setVisibility(8);
                                        return;
                                    }
                                    C87412m.m108603p("stateLayout");
                                    throw null;
                                } else if (ordinal == 3) {
                                    C63599o1 o1Var3 = this.f180355d;
                                    FrameLayout frameLayout4 = o1Var3.f180346f;
                                    if (frameLayout4 != null) {
                                        C63600a aVar = this.f180356e;
                                        frameLayout4.setVisibility(0);
                                        o1Var3.mo88457d3().f191594c.setVisibility(8);
                                        o1Var3.mo88457d3().f191595d.setVisibility(0);
                                        o1Var3.mo88457d3().f191593b.setVisibility(8);
                                        frameLayout4.setOnClickListener(new C63602a(o1Var3, aVar));
                                        return;
                                    }
                                    C87412m.m108603p("stateLayout");
                                    throw null;
                                }
                            } else {
                                C87412m.m108603p("rlLayout");
                                throw null;
                            }
                        } else if (this.f180355d.getActivity() instanceof FinderProfileUI) {
                            RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f180355d.f180345e;
                            if (refreshLoadMoreLayout2 != null) {
                                refreshLoadMoreLayout2.setSuperNestedScroll(true);
                            } else {
                                C87412m.m108603p("rlLayout");
                                throw null;
                            }
                        } else if (this.f180355d.getActivity() instanceof FinderEmojiSelectUI) {
                            RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f180355d.f180345e;
                            if (refreshLoadMoreLayout3 != null) {
                                refreshLoadMoreLayout3.setSuperNestedScroll(false);
                            } else {
                                C87412m.m108603p("rlLayout");
                                throw null;
                            }
                        }
                    } else {
                        C87412m.m108603p("stateLayout");
                        throw null;
                    }
                }
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63600a(C63599o1 o1Var, RefreshLoadMoreLayout refreshLoadMoreLayout) {
            super(refreshLoadMoreLayout);
            C87412m.m108594g(refreshLoadMoreLayout, "rlLayout");
            this.f180354e = o1Var;
        }

        /* renamed from: a */
        public void mo5115a() {
            ((C119157j) C119157j.f356862d).mo183895z(new C63601a(this.f180354e, this));
        }
    }

    /* renamed from: rs1.o1$b */
    public static final class C63603b extends C87413o implements C32224a<C63600a> {

        /* renamed from: d */
        public final /* synthetic */ C63599o1 f180359d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63603b(C63599o1 o1Var) {
            super(0);
            this.f180359d = o1Var;
        }

        public Object invoke() {
            C63599o1 o1Var = this.f180359d;
            RefreshLoadMoreLayout refreshLoadMoreLayout = o1Var.f180345e;
            if (refreshLoadMoreLayout != null) {
                return new C63600a(o1Var, refreshLoadMoreLayout);
            }
            C87412m.m108603p("rlLayout");
            throw null;
        }
    }

    /* renamed from: rs1.o1$c */
    public static final class C63604c extends C87413o implements C32224a<FinderEmojiListLoader> {

        /* renamed from: d */
        public final /* synthetic */ C63599o1 f180360d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63604c(C63599o1 o1Var) {
            super(0);
            this.f180360d = o1Var;
        }

        public Object invoke() {
            C51103rg0 rg02;
            LinkedList<C50955qg0> linkedList;
            T t;
            C50700ol1 ol12;
            boolean z;
            C63599o1 o1Var = this.f180360d;
            o1Var.getClass();
            C37521f.f99374d.getClass();
            int i = C37521f.f99162E6.mo60266n().intValue() == 1 ? -1272779573 : 0;
            C58969q b = C58961d.f168673a.mo84155b((String) o1Var.f180352o.getValue());
            if (!(b == null || (rg02 = b.field_bindInfoList) == null || (linkedList = rg02.f140887d) == null)) {
                Iterator<T> it = linkedList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t = null;
                        break;
                    }
                    t = it.next();
                    if (((C50955qg0) t).f140290d == 5) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        break;
                    }
                }
                C50955qg0 qg02 = (C50955qg0) t;
                if (!(qg02 == null || (ol12 = qg02.f140295i) == null)) {
                    i = ol12.f139250d;
                }
            }
            return new FinderEmojiListLoader(i, this.f180360d.f180350j);
        }
    }

    /* renamed from: rs1.o1$d */
    public static final class C63605d extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C63599o1 f180361d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63605d(C63599o1 o1Var) {
            super(0);
            this.f180361d = o1Var;
        }

        public Object invoke() {
            RefreshLoadMoreLayout refreshLoadMoreLayout = this.f180361d.f180345e;
            if (refreshLoadMoreLayout != null) {
                return refreshLoadMoreLayout.getRecyclerView();
            }
            C87412m.m108603p("rlLayout");
            throw null;
        }
    }

    /* renamed from: rs1.o1$e */
    public static final class C63606e extends C87413o implements C32224a<C66630l> {

        /* renamed from: d */
        public final /* synthetic */ C63599o1 f180362d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63606e(C63599o1 o1Var) {
            super(0);
            this.f180362d = o1Var;
        }

        public Object invoke() {
            View findViewById = this.f180362d.findViewById(C0966R.C0970id.gks);
            int i = C0966R.C0970id.f357920cg1;
            FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f357920cg1);
            if (frameLayout != null) {
                i = C0966R.C0970id.f357922cg3;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f357922cg3);
                if (coordinatorLayout != null) {
                    i = C0966R.C0970id.chi;
                    WxRecyclerView wxRecyclerView = (WxRecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.chi);
                    if (wxRecyclerView != null) {
                        FrameLayout frameLayout2 = (FrameLayout) findViewById;
                        i = C0966R.C0970id.ivb;
                        RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ivb);
                        if (refreshLoadMoreLayout != null) {
                            i = C0966R.C0970id.kne;
                            ProgressBar progressBar = (ProgressBar) C10462b.m10395a(findViewById, C0966R.C0970id.kne);
                            if (progressBar != null) {
                                i = C0966R.C0970id.knh;
                                TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.knh);
                                if (textView != null) {
                                    i = C0966R.C0970id.knl;
                                    TextView textView2 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.knl);
                                    if (textView2 != null) {
                                        return new C66630l(frameLayout2, frameLayout, coordinatorLayout, wxRecyclerView, frameLayout2, refreshLoadMoreLayout, progressBar, textView, textView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* renamed from: rs1.o1$f */
    public static final class C63607f extends C87413o implements C32224a<String> {

        /* renamed from: d */
        public final /* synthetic */ C63599o1 f180363d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C63607f(C63599o1 o1Var) {
            super(0);
            this.f180363d = o1Var;
        }

        public Object invoke() {
            return this.f180363d.getActivity().getIntent().getStringExtra("finder_username");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63599o1(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C49712hj1 hj12;
        Fragment parentFragment;
        Class cls = C13442s8.class;
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        Fragment fragment = getFragment();
        if (fragment == null || (parentFragment = fragment.getParentFragment()) == null) {
            hj12 = ((C13442s8) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls)).mo12861q3();
        } else {
            hj12 = ((C13442s8) C39818r.f106831a.mo62445d(parentFragment).mo75002a(cls)).mo12861q3();
        }
        this.f180350j = hj12;
        this.f180351n = C36568h.m40985a(new C63604c(this));
        this.f180352o = C36568h.m40985a(new C63607f(this));
        this.f180353p = C36568h.m40985a(new C63606e(this));
    }

    /* renamed from: c3 */
    public final FinderEmojiListLoader mo88456c3() {
        return (FinderEmojiListLoader) this.f180351n.getValue();
    }

    /* renamed from: d3 */
    public final C66630l mo88457d3() {
        return (C66630l) this.f180353p.getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a_g;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View findViewById = findViewById(C0966R.C0970id.ivb);
        C87412m.m108593f(findViewById, "findViewById(R.id.rl_layout)");
        this.f180345e = (RefreshLoadMoreLayout) findViewById;
        View findViewById2 = findViewById(C0966R.C0970id.f357920cg1);
        C87412m.m108593f(findViewById2, "findViewById(R.id.emoji_loading_state_container)");
        this.f180346f = (FrameLayout) findViewById2;
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f180345e;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.setEnableRefresh(false);
            RefreshLoadMoreLayout refreshLoadMoreLayout2 = this.f180345e;
            if (refreshLoadMoreLayout2 != null) {
                refreshLoadMoreLayout2.setSuperNestedScroll(true);
                RefreshLoadMoreLayout refreshLoadMoreLayout3 = this.f180345e;
                if (refreshLoadMoreLayout3 != null) {
                    refreshLoadMoreLayout3.setActionCallback(new C63612p1(this));
                    RefreshLoadMoreLayout refreshLoadMoreLayout4 = this.f180345e;
                    if (refreshLoadMoreLayout4 != null) {
                        View inflate = C85868k2.m106137b(getActivity()).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
                        C87412m.m108593f(inflate, "getInflater(activity).in…t.load_more_footer, null)");
                        refreshLoadMoreLayout4.setLoadMoreFooter(inflate);
                        WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = new WxRecyclerAdapter<>(new FinderEmojiListUIC$initView$2(), mo88456c3().getDataListJustForAdapter(), true);
                        this.f180349i = wxRecyclerAdapter;
                        wxRecyclerAdapter.f173488o = new C13375q1(this);
                        RecyclerView recyclerView = (RecyclerView) ((C36570n) this.f180347g).getValue();
                        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                        WxRecyclerAdapter<C0740i2> wxRecyclerAdapter2 = this.f180349i;
                        if (wxRecyclerAdapter2 != null) {
                            recyclerView.setAdapter(wxRecyclerAdapter2);
                            mo88456c3().f158666g = new C13389r1(this);
                            FrameLayout frameLayout = this.f180346f;
                            if (frameLayout != null) {
                                frameLayout.setBackgroundResource(C0966R.C0969drawable.a46);
                                FrameLayout frameLayout2 = this.f180346f;
                                if (frameLayout2 != null) {
                                    frameLayout2.setVisibility(0);
                                    BaseFeedLoader.requestInit$default(mo88456c3(), false, 1, (Object) null);
                                    mo88456c3().requestRefresh();
                                    mo88456c3().register((C63600a) ((C36570n) this.f180348h).getValue());
                                    return;
                                }
                                C87412m.m108603p("stateLayout");
                                throw null;
                            }
                            C87412m.m108603p("stateLayout");
                            throw null;
                        }
                        C87412m.m108603p("emojiAdapter");
                        throw null;
                    }
                    C87412m.m108603p("rlLayout");
                    throw null;
                }
                C87412m.m108603p("rlLayout");
                throw null;
            }
            C87412m.m108603p("rlLayout");
            throw null;
        }
        C87412m.m108603p("rlLayout");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        mo88456c3().unregister((C63600a) ((C36570n) this.f180348h).getValue());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C63599o1(Fragment fragment) {
        super(fragment);
        C49712hj1 hj12;
        Fragment parentFragment;
        Class cls = C13442s8.class;
        C87412m.m108594g(fragment, "fragment");
        Fragment fragment2 = getFragment();
        if (fragment2 == null || (parentFragment = fragment2.getParentFragment()) == null) {
            hj12 = ((C13442s8) C39818r.f106831a.mo62444c(getActivity()).mo75002a(cls)).mo12861q3();
        } else {
            hj12 = ((C13442s8) C39818r.f106831a.mo62445d(parentFragment).mo75002a(cls)).mo12861q3();
        }
        this.f180350j = hj12;
        this.f180351n = C36568h.m40985a(new C63604c(this));
        this.f180352o = C36568h.m40985a(new C63607f(this));
        this.f180353p = C36568h.m40985a(new C63606e(this));
    }
}
