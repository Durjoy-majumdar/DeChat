package com.tencent.p014mm.plugin.finder.profile.uic;

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
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.finder.feed.model.FinderProfileMusicLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import mo1.C11007i1;
import mo1.C11062x;
import mo1.C61510g1;
import mo1.C61511h1;
import o40.C61926c;
import p192l4.C10462b;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C64488kb1;
import ye1.C66625b0;
import zc1.C66785b;
import zp3.C16380c;

/* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileMusicUIC */
public final class FinderProfileMusicUIC extends C11062x {

    /* renamed from: o */
    public final C13601g f160623o = C36568h.m40985a(new C56222f(this));

    /* renamed from: p */
    public final C13601g f160624p = C36568h.m40985a(new C56221e(this));

    /* renamed from: q */
    public final C13601g f160625q = C36568h.m40985a(new C56220d(this));

    /* renamed from: r */
    public WxRecyclerAdapter<C0740i2> f160626r;

    /* renamed from: s */
    public final C13601g f160627s = C36568h.m40985a(new C56219c(this));

    /* renamed from: t */
    public final C13601g f160628t = C36568h.m40985a(new C56218b(this));

    /* renamed from: u */
    public FrameLayout f160629u;

    /* renamed from: v */
    public C64488kb1 f160630v;

    /* renamed from: w */
    public final FinderProfileMusicUIC$musicPlayEventListener$1 f160631w;

    /* renamed from: x */
    public final IListener<?> f160632x;

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileMusicUIC$a */
    public final class C56215a extends C16380c {

        /* renamed from: e */
        public final /* synthetic */ FinderProfileMusicUIC f160633e;

        /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileMusicUIC$a$a */
        public static final class C56216a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderProfileMusicUIC f160634d;

            /* renamed from: e */
            public final /* synthetic */ C56215a f160635e;

            /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileMusicUIC$a$a$a */
            public /* synthetic */ class C56217a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f160636a;

                static {
                    int[] iArr = new int[FinderProfileMusicLoader.C55750d.values().length];
                    iArr[1] = 1;
                    iArr[2] = 2;
                    iArr[3] = 3;
                    iArr[4] = 4;
                    f160636a = iArr;
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C56216a(FinderProfileMusicUIC finderProfileMusicUIC, C56215a aVar) {
                super(0);
                this.f160634d = finderProfileMusicUIC;
                this.f160635e = aVar;
            }

            public Object invoke() {
                FinderProfileMusicUIC finderProfileMusicUIC;
                FrameLayout frameLayout;
                FinderProfileMusicUIC finderProfileMusicUIC2;
                FrameLayout frameLayout2;
                Fragment fragment = this.f160634d.getFragment();
                if (!(fragment != null && fragment.isDetached())) {
                    Log.m105924i("Finder.FinderProfileMusicUIC", "[updateState] state=" + this.f160634d.mo78514d3().f158696f + " cachedState=" + this.f160634d.mo78514d3().f158697g);
                    FrameLayout frameLayout3 = this.f160634d.f160629u;
                    if (frameLayout3 != null) {
                        frameLayout3.setOnClickListener((View.OnClickListener) null);
                        frameLayout3.setVisibility(8);
                    }
                    if (this.f160634d.mo78514d3().f158697g == FinderProfileMusicLoader.C55747a.NO_CACHE) {
                        this.f160634d.mo78515e3().setSuperNestedScroll(false);
                        int ordinal = this.f160634d.mo78514d3().f158696f.ordinal();
                        if (ordinal == 1) {
                            FinderProfileMusicUIC finderProfileMusicUIC3 = this.f160634d;
                            FrameLayout frameLayout4 = finderProfileMusicUIC3.f160629u;
                            if (frameLayout4 != null) {
                                frameLayout4.setVisibility(0);
                                finderProfileMusicUIC3.mo78516f3().f191581d.setVisibility(8);
                                finderProfileMusicUIC3.mo78516f3().f191582e.setVisibility(8);
                                finderProfileMusicUIC3.mo78516f3().f191580c.setVisibility(0);
                            }
                        } else if (ordinal == 2) {
                            FinderProfileMusicUIC finderProfileMusicUIC4 = this.f160634d;
                            FrameLayout frameLayout5 = finderProfileMusicUIC4.f160629u;
                            if (frameLayout5 != null) {
                                frameLayout5.setVisibility(0);
                                finderProfileMusicUIC4.mo78516f3().f191581d.setVisibility(0);
                                finderProfileMusicUIC4.mo78516f3().f191582e.setVisibility(8);
                                finderProfileMusicUIC4.mo78516f3().f191580c.setVisibility(8);
                            }
                        } else if (ordinal == 3 && (frameLayout2 = finderProfileMusicUIC2.f160629u) != null) {
                            C56215a aVar = this.f160635e;
                            frameLayout2.setVisibility(0);
                            (finderProfileMusicUIC2 = this.f160634d).mo78516f3().f191581d.setVisibility(8);
                            finderProfileMusicUIC2.mo78516f3().f191582e.setVisibility(0);
                            finderProfileMusicUIC2.mo78516f3().f191580c.setVisibility(8);
                            frameLayout2.setOnClickListener(new C56235j(finderProfileMusicUIC2, aVar));
                        }
                    } else {
                        this.f160634d.mo78515e3().setSuperNestedScroll(true);
                    }
                    if (C56217a.f160636a[this.f160634d.mo78514d3().f158696f.ordinal()] == 4 && (frameLayout = finderProfileMusicUIC.f160629u) != null) {
                        frameLayout.setVisibility(0);
                        (finderProfileMusicUIC = this.f160634d).mo78516f3().f191581d.setVisibility(8);
                        finderProfileMusicUIC.mo78516f3().f191582e.setVisibility(8);
                        finderProfileMusicUIC.mo78516f3().f191580c.setVisibility(8);
                    }
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56215a(FinderProfileMusicUIC finderProfileMusicUIC, RefreshLoadMoreLayout refreshLoadMoreLayout) {
            super(refreshLoadMoreLayout);
            C87412m.m108594g(refreshLoadMoreLayout, "rlLayout");
            this.f160633e = finderProfileMusicUIC;
        }

        /* renamed from: a */
        public void mo5115a() {
            C61926c.m72666K(0, new C56216a(this.f160633e, this));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileMusicUIC$b */
    public static final class C56218b extends C87413o implements C32224a<C56215a> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileMusicUIC f160637d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56218b(FinderProfileMusicUIC finderProfileMusicUIC) {
            super(0);
            this.f160637d = finderProfileMusicUIC;
        }

        public Object invoke() {
            FinderProfileMusicUIC finderProfileMusicUIC = this.f160637d;
            RefreshLoadMoreLayout e3 = finderProfileMusicUIC.mo78515e3();
            C87412m.m108593f(e3, "rlLayout");
            return new C56215a(finderProfileMusicUIC, e3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileMusicUIC$c */
    public static final class C56219c extends C87413o implements C32224a<FinderProfileMusicLoader> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileMusicUIC f160638d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56219c(FinderProfileMusicUIC finderProfileMusicUIC) {
            super(0);
            this.f160638d = finderProfileMusicUIC;
        }

        public Object invoke() {
            String username = this.f160638d.getUsername();
            String O5 = C66785b.f191882e.mo90662O5();
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f160638d.getActivity());
            return new FinderProfileMusicLoader(username, O5, f != null ? f.mo12861q3() : null);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileMusicUIC$d */
    public static final class C56220d extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileMusicUIC f160639d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56220d(FinderProfileMusicUIC finderProfileMusicUIC) {
            super(0);
            this.f160639d = finderProfileMusicUIC;
        }

        public Object invoke() {
            return this.f160639d.mo78515e3().getRecyclerView();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileMusicUIC$e */
    public static final class C56221e extends C87413o implements C32224a<RefreshLoadMoreLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileMusicUIC f160640d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56221e(FinderProfileMusicUIC finderProfileMusicUIC) {
            super(0);
            this.f160640d = finderProfileMusicUIC;
        }

        public Object invoke() {
            return this.f160640d.mo78516f3().f191579b;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.profile.uic.FinderProfileMusicUIC$f */
    public static final class C56222f extends C87413o implements C32224a<C66625b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderProfileMusicUIC f160641d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56222f(FinderProfileMusicUIC finderProfileMusicUIC) {
            super(0);
            this.f160641d = finderProfileMusicUIC;
        }

        public Object invoke() {
            View findViewById = this.f160641d.findViewById(C0966R.C0970id.gks);
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
                                        return new C66625b0(frameLayout, frameLayout, frameLayout2, coordinatorLayout, wxRecyclerView, refreshLoadMoreLayout, progressBar, textView, textView2);
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
    public FinderProfileMusicUIC(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        C40008f fVar = C40008f.f107254d;
        this.f160631w = new FinderProfileMusicUIC$musicPlayEventListener$1(this, fVar);
        this.f160632x = new FinderProfileMusicUIC$musicCheckErrorListener$1(this, fVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
        r0 = r2.mvInfo;
     */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m64329c3(com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileMusicUIC r1, com.tencent.p014mm.protocal.protobuf.FinderObject r2) {
        /*
            r1.getClass()
            com.tencent.mm.protocal.protobuf.FinderObjectDesc r2 = r2.objectDesc
            if (r2 == 0) goto L_0x000e
            te3.hb1 r0 = r2.mvInfo
            if (r0 == 0) goto L_0x000e
            te3.kb1 r0 = r0.f183456e
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            r1.f160630v = r0
            if (r2 == 0) goto L_0x001d
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderMedia> r1 = r2.media
            if (r1 == 0) goto L_0x001d
            java.lang.Object r1 = sx3.C110818d0.m150916N(r1)
            com.tencent.mm.protocal.protobuf.FinderMedia r1 = (com.tencent.p014mm.protocal.protobuf.FinderMedia) r1
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileMusicUIC.m64329c3(com.tencent.mm.plugin.finder.profile.uic.FinderProfileMusicUIC, com.tencent.mm.protocal.protobuf.FinderObject):void");
    }

    /* renamed from: d3 */
    public final FinderProfileMusicLoader mo78514d3() {
        return (FinderProfileMusicLoader) ((C36570n) this.f160627s).getValue();
    }

    /* renamed from: e3 */
    public final RefreshLoadMoreLayout mo78515e3() {
        return (RefreshLoadMoreLayout) ((C36570n) this.f160624p).getValue();
    }

    /* renamed from: f3 */
    public final C66625b0 mo78516f3() {
        return (C66625b0) ((C36570n) this.f160623o).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.ao4;
    }

    public void onCreate(Bundle bundle) {
        View findViewById;
        View findViewById2;
        super.onCreate(bundle);
        mo78514d3().register((C56215a) ((C36570n) this.f160628t).getValue());
        mo78515e3().setEnableRefresh(false);
        mo78515e3().setSuperNestedScroll(true);
        mo78515e3().setActionCallback(new C61510g1(this));
        View inflate = C85868k2.m106137b(getActivity()).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
        if (((FinderProfileUiStyleUIC) C39818r.f106831a.mo62443b(getContext()).mo75002a(FinderProfileUiStyleUIC.class)).mo3861i0()) {
            if (!(inflate == null || (findViewById2 = inflate.findViewById(C0966R.C0970id.g2s)) == null)) {
                findViewById2.setBackgroundColor(getResources().getColor(C0966R.color.ahf));
            }
        } else if (!(inflate == null || (findViewById = inflate.findViewById(C0966R.C0970id.g2s)) == null)) {
            findViewById.setBackgroundColor(getResources().getColor(C0966R.color.al6));
        }
        RefreshLoadMoreLayout e3 = mo78515e3();
        C87412m.m108593f(inflate, "footer");
        e3.setLoadMoreFooter(inflate);
        WxRecyclerAdapter<C0740i2> wxRecyclerAdapter = new WxRecyclerAdapter<>(new FinderProfileMusicUIC$initLayout$2(this), mo78514d3().getDataListJustForAdapter(), true);
        wxRecyclerAdapter.f173488o = new C61511h1(wxRecyclerAdapter, this);
        this.f160626r = wxRecyclerAdapter;
        RecyclerView recyclerView = (RecyclerView) ((C36570n) this.f160625q).getValue();
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(this.f160626r);
        mo78514d3().f158698h = new C11007i1(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(C0966R.C0970id.i5g);
        this.f160629u = frameLayout;
        if (frameLayout != null) {
            frameLayout.setBackgroundResource(C0966R.C0969drawable.a46);
        }
        FrameLayout frameLayout2 = this.f160629u;
        if (frameLayout2 != null) {
            frameLayout2.setVisibility(0);
        }
        BaseFeedLoader.requestInit$default(mo78514d3(), false, 1, (Object) null);
        mo78514d3().requestRefresh();
    }

    public void onDestroy() {
        super.onDestroy();
        mo78514d3().unregister((C56215a) ((C36570n) this.f160628t).getValue());
    }

    public void onPause() {
        super.onPause();
        this.f160631w.dead();
        this.f160632x.dead();
    }

    public void onResume() {
        super.onResume();
        this.f160631w.alive();
        this.f160632x.alive();
    }
}
