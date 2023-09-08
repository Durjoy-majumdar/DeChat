package mo1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.feed.model.FinderProfileQQMusicLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileQQMusicUIC$initLayout$2;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import o40.C61926c;
import p192l4.C10462b;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import ye1.C66626c0;
import zc1.C66785b;
import zp3.C16380c;

/* renamed from: mo1.m1 */
public final class C61514m1 extends C11062x {

    /* renamed from: o */
    public final C13601g f174872o = C36568h.m40985a(new C61522f(this));

    /* renamed from: p */
    public final C13601g f174873p = C36568h.m40985a(new C61521e(this));

    /* renamed from: q */
    public final C13601g f174874q = C36568h.m40985a(new C61520d(this));

    /* renamed from: r */
    public WxRecyclerAdapter<C0740i2> f174875r;

    /* renamed from: s */
    public final C13601g f174876s = C36568h.m40985a(new C61519c(this));

    /* renamed from: t */
    public final C13601g f174877t = C36568h.m40985a(new C61518b(this));

    /* renamed from: u */
    public FrameLayout f174878u;

    /* renamed from: mo1.m1$a */
    public final class C61515a extends C16380c {

        /* renamed from: e */
        public final /* synthetic */ C61514m1 f174879e;

        /* renamed from: mo1.m1$a$a */
        public static final class C61516a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ C61514m1 f174880d;

            /* renamed from: e */
            public final /* synthetic */ C61515a f174881e;

            /* renamed from: mo1.m1$a$a$a */
            public /* synthetic */ class C61517a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f174882a;

                static {
                    int[] iArr = new int[FinderProfileQQMusicLoader.C55754d.values().length];
                    iArr[1] = 1;
                    iArr[2] = 2;
                    iArr[3] = 3;
                    iArr[4] = 4;
                    f174882a = iArr;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C61516a(C61514m1 m1Var, C61515a aVar) {
                super(0);
                this.f174880d = m1Var;
                this.f174881e = aVar;
            }

            public Object invoke() {
                C61514m1 m1Var;
                FrameLayout frameLayout;
                C61514m1 m1Var2;
                FrameLayout frameLayout2;
                Fragment fragment = this.f174880d.getFragment();
                if (!(fragment != null && fragment.isDetached())) {
                    Log.m105924i("Finder.ProfileQQMusicUIC", "[updateState] state=" + this.f174880d.mo86477c3().f158716g + " cachedState=" + this.f174880d.mo86477c3().f158717h);
                    FrameLayout frameLayout3 = this.f174880d.f174878u;
                    if (frameLayout3 != null) {
                        frameLayout3.setOnClickListener((View.OnClickListener) null);
                        frameLayout3.setVisibility(8);
                    }
                    if (this.f174880d.mo86477c3().f158717h == FinderProfileQQMusicLoader.C55751a.NO_CACHE) {
                        this.f174880d.mo86478d3().setSuperNestedScroll(false);
                        int ordinal = this.f174880d.mo86477c3().f158716g.ordinal();
                        if (ordinal == 1) {
                            C61514m1 m1Var3 = this.f174880d;
                            FrameLayout frameLayout4 = m1Var3.f174878u;
                            if (frameLayout4 != null) {
                                frameLayout4.setVisibility(0);
                                m1Var3.mo86479e3().f191586d.setVisibility(8);
                                m1Var3.mo86479e3().f191587e.setVisibility(8);
                                m1Var3.mo86479e3().f191585c.setVisibility(0);
                            }
                        } else if (ordinal == 2) {
                            C61514m1 m1Var4 = this.f174880d;
                            FrameLayout frameLayout5 = m1Var4.f174878u;
                            if (frameLayout5 != null) {
                                frameLayout5.setVisibility(0);
                                m1Var4.mo86479e3().f191586d.setVisibility(0);
                                m1Var4.mo86479e3().f191587e.setVisibility(8);
                                m1Var4.mo86479e3().f191585c.setVisibility(8);
                            }
                        } else if (ordinal == 3 && (frameLayout2 = m1Var2.f174878u) != null) {
                            C61515a aVar = this.f174881e;
                            frameLayout2.setVisibility(0);
                            (m1Var2 = this.f174880d).mo86479e3().f191586d.setVisibility(8);
                            m1Var2.mo86479e3().f191587e.setVisibility(0);
                            m1Var2.mo86479e3().f191585c.setVisibility(8);
                            frameLayout2.setOnClickListener(new C61512l1(m1Var2, aVar));
                        }
                    } else {
                        this.f174880d.mo86478d3().setSuperNestedScroll(true);
                    }
                    if (C61517a.f174882a[this.f174880d.mo86477c3().f158716g.ordinal()] == 4 && (frameLayout = m1Var.f174878u) != null) {
                        frameLayout.setVisibility(0);
                        (m1Var = this.f174880d).mo86479e3().f191586d.setVisibility(8);
                        m1Var.mo86479e3().f191587e.setVisibility(8);
                        m1Var.mo86479e3().f191585c.setVisibility(8);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61515a(C61514m1 m1Var, RefreshLoadMoreLayout refreshLoadMoreLayout) {
            super(refreshLoadMoreLayout);
            C87412m.m108594g(refreshLoadMoreLayout, "rlLayout");
            this.f174879e = m1Var;
        }

        /* renamed from: a */
        public void mo5115a() {
            C61926c.m72666K(0, new C61516a(this.f174879e, this));
        }
    }

    /* renamed from: mo1.m1$b */
    public static final class C61518b extends C87413o implements C32224a<C61515a> {

        /* renamed from: d */
        public final /* synthetic */ C61514m1 f174883d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61518b(C61514m1 m1Var) {
            super(0);
            this.f174883d = m1Var;
        }

        public Object invoke() {
            C61514m1 m1Var = this.f174883d;
            RefreshLoadMoreLayout d3 = m1Var.mo86478d3();
            C87412m.m108593f(d3, "rlLayout");
            return new C61515a(m1Var, d3);
        }
    }

    /* renamed from: mo1.m1$c */
    public static final class C61519c extends C87413o implements C32224a<FinderProfileQQMusicLoader> {

        /* renamed from: d */
        public final /* synthetic */ C61514m1 f174884d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61519c(C61514m1 m1Var) {
            super(0);
            this.f174884d = m1Var;
        }

        public Object invoke() {
            String username = this.f174884d.getUsername();
            String O5 = C66785b.f191882e.mo90662O5();
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f174884d.getActivity());
            return new FinderProfileQQMusicLoader(23, username, O5, f != null ? f.mo12861q3() : null);
        }
    }

    /* renamed from: mo1.m1$d */
    public static final class C61520d extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ C61514m1 f174885d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61520d(C61514m1 m1Var) {
            super(0);
            this.f174885d = m1Var;
        }

        public Object invoke() {
            return this.f174885d.mo86478d3().getRecyclerView();
        }
    }

    /* renamed from: mo1.m1$e */
    public static final class C61521e extends C87413o implements C32224a<RefreshLoadMoreLayout> {

        /* renamed from: d */
        public final /* synthetic */ C61514m1 f174886d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61521e(C61514m1 m1Var) {
            super(0);
            this.f174886d = m1Var;
        }

        public Object invoke() {
            return this.f174886d.mo86479e3().f191584b;
        }
    }

    /* renamed from: mo1.m1$f */
    public static final class C61522f extends C87413o implements C32224a<C66626c0> {

        /* renamed from: d */
        public final /* synthetic */ C61514m1 f174887d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C61522f(C61514m1 m1Var) {
            super(0);
            this.f174887d = m1Var;
        }

        public Object invoke() {
            View findViewById = this.f174887d.findViewById(C0966R.C0970id.gks);
            FrameLayout frameLayout = (FrameLayout) findViewById;
            int i = C0966R.C0970id.i5g;
            FrameLayout frameLayout2 = (FrameLayout) C10462b.m10395a(findViewById, C0966R.C0970id.i5g);
            if (frameLayout2 != null) {
                i = C0966R.C0970id.i5i;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C10462b.m10395a(findViewById, C0966R.C0970id.i5i);
                if (coordinatorLayout != null) {
                    i = C0966R.C0970id.i6k;
                    WxRecyclerView wxRecyclerView = (WxRecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.i6k);
                    if (wxRecyclerView != null) {
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
                                        return new C66626c0(frameLayout, frameLayout, frameLayout2, coordinatorLayout, wxRecyclerView, refreshLoadMoreLayout, progressBar, textView, textView2);
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61514m1(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }

    /* renamed from: c3 */
    public final FinderProfileQQMusicLoader mo86477c3() {
        return (FinderProfileQQMusicLoader) ((C36570n) this.f174876s).getValue();
    }

    /* renamed from: d3 */
    public final RefreshLoadMoreLayout mo86478d3() {
        return (RefreshLoadMoreLayout) ((C36570n) this.f174873p).getValue();
    }

    /* renamed from: e3 */
    public final C66626c0 mo86479e3() {
        return (C66626c0) ((C36570n) this.f174872o).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ao9;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo86477c3().register((C61515a) ((C36570n) this.f174877t).getValue());
        mo86478d3().setEnableRefresh(false);
        mo86478d3().setSuperNestedScroll(true);
        mo86478d3().setActionCallback(new C11020n1(this));
        RefreshLoadMoreLayout d3 = mo86478d3();
        View inflate = C85868k2.m106137b(getActivity()).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
        C87412m.m108593f(inflate, "getInflater(activity).in…t.load_more_footer, null)");
        d3.setLoadMoreFooter(inflate);
        WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = new WxRecyclerAdapter<>(new FinderProfileQQMusicUIC$initLayout$2(this), mo86477c3().getDataListJustForAdapter(), true);
        this.f174875r = wxRecyclerAdapter;
        wxRecyclerAdapter.f173488o = new C61524o1(this);
        RecyclerView recyclerView = (RecyclerView) ((C36570n) this.f174874q).getValue();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(this.f174875r);
        mo86477c3().f158718i = new C11045q1(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(C0966R.C0970id.i5g);
        this.f174878u = frameLayout;
        if (frameLayout != null) {
            frameLayout.setBackgroundResource(C0966R.C0969drawable.a46);
        }
        FrameLayout frameLayout2 = this.f174878u;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        mo86477c3().onAlive();
        BaseFeedLoader.requestInit$default(mo86477c3(), false, 1, (Object) null);
        mo86477c3().requestRefresh();
    }

    public void onDestroy() {
        super.onDestroy();
        mo86477c3().onDead();
        mo86477c3().unregister((C61515a) ((C36570n) this.f174877t).getValue());
    }
}
