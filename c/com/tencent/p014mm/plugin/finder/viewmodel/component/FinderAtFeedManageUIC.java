package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.IResponse;
import com.tencent.p014mm.plugin.finder.loader.FinderAtFeedLoader;
import com.tencent.p014mm.plugin.finder.storage.FinderAtFeedManagerLayoutConfig;
import com.tencent.p014mm.plugin.finder.storage.FinderAtFeedManagerLayoutConfig$getItemConvertFactory$1;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import jq3.C60896i;
import o40.C61926c;
import p192l4.C10462b;
import ps1.C12003a;
import rs1.C13388r0;
import rs1.C13425s0;
import rs1.C13442s8;
import rs1.C13450t0;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import tf1.C13908i;
import tf1.C13916o;
import up1.C14353j0;
import ye1.C15969d;
import zp3.C16380c;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAtFeedManageUIC */
public final class FinderAtFeedManageUIC extends UIComponent {

    /* renamed from: d */
    public FinderAtFeedLoader f18582d;

    /* renamed from: e */
    public final C49712hj1 f18583e;

    /* renamed from: f */
    public String f18584f;

    /* renamed from: g */
    public final C13601g f18585g;

    /* renamed from: h */
    public final C12003a f18586h;

    /* renamed from: i */
    public final C13601g f18587i;

    /* renamed from: j */
    public final C13601g f18588j;

    /* renamed from: n */
    public final C13601g f18589n;

    /* renamed from: o */
    public final C13601g f18590o;

    /* renamed from: p */
    public final C13601g f18591p;

    /* renamed from: q */
    public final C13601g f18592q;

    /* renamed from: r */
    public final C13601g f18593r;

    /* renamed from: s */
    public final C4250c f18594s;

    /* renamed from: t */
    public final FinderAtFeedManageUIC$removeFeedEventListener$1 f18595t;

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAtFeedManageUIC$a */
    public final class C4247a extends C16380c {

        /* renamed from: e */
        public final /* synthetic */ FinderAtFeedManageUIC f18596e;

        /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAtFeedManageUIC$a$a */
        public static final class C4248a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderAtFeedManageUIC f18597d;

            /* renamed from: e */
            public final /* synthetic */ C4247a f18598e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C4248a(FinderAtFeedManageUIC finderAtFeedManageUIC, C4247a aVar) {
                super(0);
                this.f18597d = finderAtFeedManageUIC;
                this.f18598e = aVar;
            }

            public Object invoke() {
                try {
                    if (!this.f18597d.getActivity().isFinishing()) {
                        Log.m105924i("Finder.AtFeedManageUIC", "[updateState] state=" + this.f18597d.mo5112e3().f15437i + " cachedState=" + this.f18597d.mo5112e3().f15438j);
                        FinderAtFeedManageUIC.m4427c3(this.f18597d).setOnClickListener((View.OnClickListener) null);
                        FinderAtFeedManageUIC.m4427c3(this.f18597d).setVisibility(8);
                        TextView textView = FinderAtFeedManageUIC.m4428d3(this.f18597d).f42869d;
                        C87412m.m108593f(textView, "uiBinding.tipsNoContent");
                        TextView textView2 = FinderAtFeedManageUIC.m4428d3(this.f18597d).f42870e;
                        C87412m.m108593f(textView2, "uiBinding.tipsRetry");
                        ProgressBar progressBar = FinderAtFeedManageUIC.m4428d3(this.f18597d).f42868c;
                        C87412m.m108593f(progressBar, "uiBinding.tipsLoading");
                        if (this.f18597d.mo5112e3().f15438j != FinderAtFeedLoader.C3251c.NO_CACHE) {
                            if (this.f18597d.mo5112e3().f15438j != FinderAtFeedLoader.C3251c.WITH_INVISIBLE_CACHE) {
                                this.f18597d.mo5114g3().setSuperNestedScroll(false);
                            }
                        }
                        this.f18597d.mo5114g3().setSuperNestedScroll(false);
                        int ordinal = this.f18597d.mo5112e3().f15437i.ordinal();
                        if (ordinal == 1) {
                            FinderAtFeedManageUIC.m4427c3(this.f18597d).setVisibility(0);
                            textView.setVisibility(8);
                            textView2.setVisibility(8);
                            progressBar.setVisibility(0);
                        } else if (ordinal == 2) {
                            FinderAtFeedManageUIC.m4427c3(this.f18597d).setVisibility(0);
                            textView.setVisibility(0);
                            textView2.setVisibility(8);
                            progressBar.setVisibility(8);
                        } else if (ordinal == 3) {
                            FinderAtFeedManageUIC.m4427c3(this.f18597d).setVisibility(0);
                            textView.setVisibility(8);
                            textView2.setVisibility(0);
                            progressBar.setVisibility(8);
                            FinderAtFeedManageUIC.m4427c3(this.f18597d).setOnClickListener(new C4327a(this.f18597d, this.f18598e));
                        }
                    }
                } catch (NullPointerException e) {
                    Log.printErrStackTrace("Finder.AtFeedManageUIC", e, "", new Object[0]);
                }
                return C13598b0.f38549a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4247a(FinderAtFeedManageUIC finderAtFeedManageUIC, RefreshLoadMoreLayout refreshLoadMoreLayout) {
            super(refreshLoadMoreLayout);
            C87412m.m108594g(refreshLoadMoreLayout, "rlLayout");
            this.f18596e = finderAtFeedManageUIC;
        }

        /* renamed from: a */
        public void mo5115a() {
            C61926c.m72666K(0, new C4248a(this.f18596e, this));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAtFeedManageUIC$b */
    public static final class C4249b extends C87413o implements C32224a<C4247a> {

        /* renamed from: d */
        public final /* synthetic */ FinderAtFeedManageUIC f18599d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4249b(FinderAtFeedManageUIC finderAtFeedManageUIC) {
            super(0);
            this.f18599d = finderAtFeedManageUIC;
        }

        public Object invoke() {
            FinderAtFeedManageUIC finderAtFeedManageUIC = this.f18599d;
            RefreshLoadMoreLayout g3 = finderAtFeedManageUIC.mo5114g3();
            C87412m.m108593f(g3, "rlLayout");
            return new C4247a(finderAtFeedManageUIC, g3);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAtFeedManageUIC$c */
    public static final class C4250c extends C13916o.C13919c {
        public C4250c(FinderAtFeedManageUIC finderAtFeedManageUIC) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAtFeedManageUIC$d */
    public static final class C4251d extends C87413o implements C32224a<Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderAtFeedManageUIC f18600d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4251d(FinderAtFeedManageUIC finderAtFeedManageUIC) {
            super(0);
            this.f18600d = finderAtFeedManageUIC;
        }

        public Object invoke() {
            return Boolean.valueOf(this.f18600d.getIntent().getBooleanExtra("KEY_FINDER_SELF_FLAG", false));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAtFeedManageUIC$e */
    public static final class C4252e extends C87413o implements C32224a<FinderAtFeedManagerLayoutConfig> {

        /* renamed from: d */
        public final /* synthetic */ FinderAtFeedManageUIC f18601d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4252e(FinderAtFeedManageUIC finderAtFeedManageUIC) {
            super(0);
            this.f18601d = finderAtFeedManageUIC;
        }

        public Object invoke() {
            FinderAtFeedLoader e3 = this.f18601d.mo5112e3();
            boolean booleanValue = ((Boolean) ((C36570n) this.f18601d.f18585g).getValue()).booleanValue();
            FinderAtFeedManageUIC finderAtFeedManageUIC = this.f18601d;
            return new FinderAtFeedManagerLayoutConfig(3, e3, booleanValue, finderAtFeedManageUIC.f18584f, finderAtFeedManageUIC.f18586h);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAtFeedManageUIC$f */
    public static final class C4253f extends C87413o implements C32224a<RecyclerView.LayoutManager> {

        /* renamed from: d */
        public final /* synthetic */ FinderAtFeedManageUIC f18602d;

        /* renamed from: e */
        public final /* synthetic */ AppCompatActivity f18603e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4253f(FinderAtFeedManageUIC finderAtFeedManageUIC, AppCompatActivity appCompatActivity) {
            super(0);
            this.f18602d = finderAtFeedManageUIC;
            this.f18603e = appCompatActivity;
        }

        public Object invoke() {
            return ((FinderAtFeedManagerLayoutConfig) ((C36570n) this.f18602d.f18587i).getValue()).mo3666d(this.f18603e);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAtFeedManageUIC$g */
    public static final class C4254g extends C87413o implements C32226l<IResponse<C0740i2>, C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderAtFeedManageUIC f18604d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4254g(FinderAtFeedManageUIC finderAtFeedManageUIC) {
            super(1);
            this.f18604d = finderAtFeedManageUIC;
        }

        public Object invoke(Object obj) {
            IResponse iResponse = (IResponse) obj;
            C87412m.m108594g(iResponse, LocaleUtil.ITALIAN);
            boolean canScrollVertically = this.f18604d.mo5113f3().canScrollVertically(1);
            Log.m105924i("Finder.AtFeedManageUIC", "isCallScrollDown :" + canScrollVertically + "  hasMore:" + iResponse.getHasMore());
            if (iResponse.getHasMore() && !canScrollVertically) {
                BaseFeedLoader.requestLoadMore$default(this.f18604d.mo5112e3(), false, 1, (Object) null);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAtFeedManageUIC$h */
    public static final class C4255h extends C87413o implements C32224a<RecyclerView> {

        /* renamed from: d */
        public final /* synthetic */ FinderAtFeedManageUIC f18605d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4255h(FinderAtFeedManageUIC finderAtFeedManageUIC) {
            super(0);
            this.f18605d = finderAtFeedManageUIC;
        }

        public Object invoke() {
            return this.f18605d.mo5114g3().getRecyclerView();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAtFeedManageUIC$i */
    public static final class C4256i extends C87413o implements C32224a<RefreshLoadMoreLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderAtFeedManageUIC f18606d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4256i(FinderAtFeedManageUIC finderAtFeedManageUIC) {
            super(0);
            this.f18606d = finderAtFeedManageUIC;
        }

        public Object invoke() {
            return FinderAtFeedManageUIC.m4428d3(this.f18606d).f42867b;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAtFeedManageUIC$j */
    public static final class C4257j extends C87413o implements C32224a<FrameLayout> {

        /* renamed from: d */
        public final /* synthetic */ FinderAtFeedManageUIC f18607d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4257j(FinderAtFeedManageUIC finderAtFeedManageUIC) {
            super(0);
            this.f18607d = finderAtFeedManageUIC;
        }

        public Object invoke() {
            return FinderAtFeedManageUIC.m4428d3(this.f18607d).f42866a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderAtFeedManageUIC$k */
    public static final class C4258k extends C87413o implements C32224a<C15969d> {

        /* renamed from: d */
        public final /* synthetic */ FinderAtFeedManageUIC f18608d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4258k(FinderAtFeedManageUIC finderAtFeedManageUIC) {
            super(0);
            this.f18608d = finderAtFeedManageUIC;
        }

        public Object invoke() {
            View findViewById = this.f18608d.findViewById(C0966R.C0970id.f6170z_);
            LinearLayout linearLayout = (LinearLayout) findViewById;
            int i = C0966R.C0970id.f6171za;
            TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.f6171za);
            if (textView != null) {
                i = C0966R.C0970id.f6172zb;
                Button button = (Button) C10462b.m10395a(findViewById, C0966R.C0970id.f6172zb);
                if (button != null) {
                    i = C0966R.C0970id.f6173zc;
                    TextView textView2 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.f6173zc);
                    if (textView2 != null) {
                        i = C0966R.C0970id.f6174zd;
                        TextView textView3 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.f6174zd);
                        if (textView3 != null) {
                            i = C0966R.C0970id.a2y;
                            LinearLayout linearLayout2 = (LinearLayout) C10462b.m10395a(findViewById, C0966R.C0970id.a2y);
                            if (linearLayout2 != null) {
                                i = C0966R.C0970id.i5g;
                                FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(findViewById, C0966R.C0970id.i5g);
                                if (frameLayout != null) {
                                    i = C0966R.C0970id.i5i;
                                    CoordinatorLayout coordinatorLayout = (CoordinatorLayout) C10462b.m10395a(findViewById, C0966R.C0970id.i5i);
                                    if (coordinatorLayout != null) {
                                        i = C0966R.C0970id.i6k;
                                        WxRecyclerView wxRecyclerView = (WxRecyclerView) C10462b.m10395a(findViewById, C0966R.C0970id.i6k);
                                        if (wxRecyclerView != null) {
                                            i = C0966R.C0970id.ivb;
                                            RefreshLoadMoreLayout refreshLoadMoreLayout = (RefreshLoadMoreLayout) C10462b.m10395a(findViewById, C0966R.C0970id.ivb);
                                            if (refreshLoadMoreLayout != null) {
                                                i = C0966R.C0970id.f359384kn0;
                                                TextView textView4 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.f359384kn0);
                                                if (textView4 != null) {
                                                    i = C0966R.C0970id.kne;
                                                    ProgressBar progressBar = (ProgressBar) C10462b.m10395a(findViewById, C0966R.C0970id.kne);
                                                    if (progressBar != null) {
                                                        i = C0966R.C0970id.knh;
                                                        TextView textView5 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.knh);
                                                        if (textView5 != null) {
                                                            i = C0966R.C0970id.knl;
                                                            TextView textView6 = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.knl);
                                                            if (textView6 != null) {
                                                                return new C15969d(linearLayout, linearLayout, textView, button, textView2, textView3, linearLayout2, frameLayout, coordinatorLayout, wxRecyclerView, refreshLoadMoreLayout, textView4, progressBar, textView5, textView6);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public FinderAtFeedManageUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f18583e = ((C13442s8) C39818r.f106831a.mo62444c(appCompatActivity).mo75002a(C13442s8.class)).mo12861q3();
        String stringExtra = getIntent().getStringExtra("KEY_PARAMS_USERNAME");
        this.f18584f = stringExtra == null ? "" : stringExtra;
        this.f18585g = C36568h.m40985a(new C4251d(this));
        this.f18586h = new C12003a();
        this.f18587i = C36568h.m40985a(new C4252e(this));
        this.f18588j = C36568h.m40985a(new C4253f(this, appCompatActivity));
        this.f18589n = C36568h.m40985a(new C4249b(this));
        this.f18590o = C36568h.m40985a(new C4257j(this));
        this.f18591p = C36568h.m40985a(new C4256i(this));
        this.f18592q = C36568h.m40985a(new C4255h(this));
        this.f18593r = C36568h.m40985a(new C4258k(this));
        this.f18594s = new C4250c(this);
        this.f18595t = new FinderAtFeedManageUIC$removeFeedEventListener$1(this, C40008f.f107254d);
    }

    /* renamed from: c3 */
    public static final FrameLayout m4427c3(FinderAtFeedManageUIC finderAtFeedManageUIC) {
        return (FrameLayout) ((C36570n) finderAtFeedManageUIC.f18590o).getValue();
    }

    /* renamed from: d3 */
    public static final C15969d m4428d3(FinderAtFeedManageUIC finderAtFeedManageUIC) {
        return (C15969d) ((C36570n) finderAtFeedManageUIC.f18593r).getValue();
    }

    /* renamed from: e3 */
    public final FinderAtFeedLoader mo5112e3() {
        FinderAtFeedLoader finderAtFeedLoader = this.f18582d;
        if (finderAtFeedLoader != null) {
            return finderAtFeedLoader;
        }
        C87412m.m108603p("feedLoader");
        throw null;
    }

    /* renamed from: f3 */
    public final RecyclerView mo5113f3() {
        return (RecyclerView) ((C36570n) this.f18592q).getValue();
    }

    /* renamed from: g3 */
    public final RefreshLoadMoreLayout mo5114g3() {
        return (RefreshLoadMoreLayout) ((C36570n) this.f18591p).getValue();
    }

    public void onCreate(Bundle bundle) {
        C13916o.C13917a aVar;
        super.onCreate(bundle);
        this.f18582d = new FinderAtFeedLoader(C13908i.SELF_FEED_AT_MANAGER, this.f18584f, this.f18583e);
        mo5112e3().register((C4247a) ((C36570n) this.f18589n).getValue());
        mo5114g3().setEnableRefresh(false);
        mo5114g3().setSuperNestedScroll(false);
        mo5114g3().setActionCallback(new C13450t0(this));
        RefreshLoadMoreLayout g3 = mo5114g3();
        View inflate = C85868k2.m106137b(getActivity()).inflate(C0966R.C0971layout.b7t, (ViewGroup) null);
        C87412m.m108593f(inflate, "getInflater(activity).in…t.load_more_footer, null)");
        g3.setLoadMoreFooter(inflate);
        mo5113f3().setLayoutManager((RecyclerView.LayoutManager) ((C36570n) this.f18588j).getValue());
        RecyclerView f3 = mo5113f3();
        ((FinderAtFeedManagerLayoutConfig) ((C36570n) this.f18587i).getValue()).getClass();
        f3.mo17085h0(new C14353j0.C14354a());
        RecyclerView f35 = mo5113f3();
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        f35.setRecycledViewPool(((FinderAtFeedManagerLayoutConfig) ((C36570n) this.f18587i).getValue()).mo3667e((MMActivity) activity));
        RecyclerView f36 = mo5113f3();
        FinderAtFeedManagerLayoutConfig finderAtFeedManagerLayoutConfig = (FinderAtFeedManagerLayoutConfig) ((C36570n) this.f18587i).getValue();
        finderAtFeedManagerLayoutConfig.getClass();
        f36.setAdapter(new WxRecyclerAdapter(new FinderAtFeedManagerLayoutConfig$getItemConvertFactory$1(finderAtFeedManagerLayoutConfig, (C32226l<? super Integer, ? extends C60896i<?>>) null), mo5112e3().getDataListJustForAdapter(), false));
        mo5112e3().setInitDone(new C13388r0(this));
        mo5112e3().f15435g = new C13425s0(this);
        BaseFeedLoader.requestInit$default(mo5112e3(), false, 1, (Object) null);
        mo5112e3().requestRefresh();
        mo5112e3().f15436h = new C4254g(this);
        this.f18595t.alive();
        ConcurrentHashMap<String, C13916o.C13917a> concurrentHashMap = C13916o.f39110a;
        C4250c cVar = this.f18594s;
        C87412m.m108594g(cVar, "owner");
        ConcurrentHashMap<String, C13916o.C13917a> concurrentHashMap2 = C13916o.f39110a;
        if (concurrentHashMap2.keySet().contains("atFeedManage")) {
            C13916o.C13917a aVar2 = concurrentHashMap2.get("atFeedManage");
            if (aVar2 != null) {
                aVar2.f39111a = cVar;
            }
        } else {
            C13916o.C13917a aVar3 = new C13916o.C13917a();
            aVar3.f39111a = cVar;
            concurrentHashMap2.put("atFeedManage", aVar3);
        }
        if (!(!concurrentHashMap2.keySet().contains("atFeedManage") || (aVar = concurrentHashMap2.get("atFeedManage")) == null || aVar.f39111a == null)) {
            Iterator it = ((ArrayList) aVar.f39112b).iterator();
            while (it.hasNext()) {
                ((C13916o.C13918b) it.next()).getClass();
            }
        }
        Log.m105924i("Finder.LoaderShareStore", "");
    }

    public void onDestroy() {
        C13916o.C13917a aVar;
        super.onDestroy();
        mo5112e3().unregister((C4247a) ((C36570n) this.f18589n).getValue());
        this.f18595t.dead();
        ConcurrentHashMap<String, C13916o.C13917a> concurrentHashMap = C13916o.f39110a;
        C87412m.m108594g(this.f18594s, "owner");
        ConcurrentHashMap<String, C13916o.C13917a> concurrentHashMap2 = C13916o.f39110a;
        if (concurrentHashMap2.keySet().contains("atFeedManage")) {
            C13916o.C13917a aVar2 = concurrentHashMap2.get("atFeedManage");
            if (aVar2 != null) {
                if (!(!concurrentHashMap2.keySet().contains("atFeedManage") || (aVar = concurrentHashMap2.get("atFeedManage")) == null || aVar.f39111a == null)) {
                    Iterator it = ((ArrayList) aVar.f39112b).iterator();
                    while (it.hasNext()) {
                        ((C13916o.C13918b) it.next()).getClass();
                    }
                }
                Iterator it4 = ((ArrayList) aVar2.f39112b).iterator();
                while (it4.hasNext()) {
                    ((C13916o.C13918b) it4.next()).getClass();
                }
                if (((ArrayList) aVar2.f39112b).isEmpty()) {
                    C13916o.f39110a.remove("atFeedManage");
                    return;
                }
                return;
            }
            return;
        }
        Log.m105924i("Finder.LoaderShareStore", "unregisterOwner not exit");
    }
}
