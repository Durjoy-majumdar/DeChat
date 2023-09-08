package com.tencent.p014mm.plugin.finder.p056ui;

import ak1.C0075i;
import ak1.C54067f0;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C74779i;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.C85861e4;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.C2780c;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.presenter.contract.FinderLikedFeedContract;
import com.tencent.p014mm.plugin.finder.view.C56597e1;
import com.tencent.p014mm.plugin.finder.view.FinderLikeDrawer;
import com.tencent.p014mm.plugin.finder.viewmodel.component.C56711j;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import di3.C7335d;
import di3.C86312j;
import eb0.C75592q0;
import er1.C58784w3;
import fy3.C32224a;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C8777j5;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import kotlin.Metadata;
import l31.C61212e;
import o31.C11345b;
import o31.C76986a;
import rs1.C13140c8;
import rs1.C13194da;
import rs1.C13466ta;
import rs1.C13539y3;
import rs1.C13554z;
import rs1.C48085q4;
import rs1.C63513a1;
import rs1.C63545b1;
import rs1.C63547e;
import rs1.C63575n3;
import rs1.C63648v;
import rs1.C63654v2;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110826x0;
import ts1.C14078c;
import ye1.C15976o;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderLikedFeedUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderFeedDetailUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI */
public final class FinderLikedFeedUI extends MMFinderFeedDetailUI {

    /* renamed from: z */
    public static final /* synthetic */ int f16904z = 0;

    /* renamed from: o */
    public final String f16905o = "Finder.FinderLikedFeedUI";

    /* renamed from: p */
    public String f16906p;

    /* renamed from: q */
    public String f16907q = "";

    /* renamed from: r */
    public String f16908r = "";

    /* renamed from: s */
    public LinkedList<String> f16909s = new LinkedList<>();

    /* renamed from: t */
    public FinderLikedFeedContract.LikedTimelinePresenter f16910t;

    /* renamed from: u */
    public FinderLikedFeedContract.LikedTimelineViewCallback f16911u;

    /* renamed from: v */
    public RefreshLoadMoreLayout f16912v;

    /* renamed from: w */
    public FinderLikeDrawer f16913w;

    /* renamed from: x */
    public final C13601g f16914x = C36568h.m40985a(new C3678d(this));

    /* renamed from: y */
    public final C3676b f16915y = new C3676b();

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI$a */
    public static final class C3675a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLikedFeedUI f16916d;

        public C3675a(FinderLikedFeedUI finderLikedFeedUI) {
            this.f16916d = finderLikedFeedUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            FinderLikedFeedUI finderLikedFeedUI = this.f16916d;
            int i = FinderLikedFeedUI.f16904z;
            finderLikedFeedUI.mo4062O7();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI$b */
    public static final class C3676b extends RecyclerView.C0130p {
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderLikedFeedUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderLikedFeedUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderLikedFeedUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            C7335d c = C86312j.m106911c(C8777j5.class);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8602c((C8777j5) c, recyclerView, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR, "2", C0075i.EVENT_ON_SCROLL, 0, 0, 0, 112, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderLikedFeedUI$mOnHellScrollListener$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI$c */
    public static final class C3677c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderLikedFeedUI f16917d;

        public C3677c(FinderLikedFeedUI finderLikedFeedUI) {
            this.f16917d = finderLikedFeedUI;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/ui/FinderLikedFeedUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C39622i0 a = C39818r.f106831a.mo62444c(this.f16917d).mo75002a(C63575n3.class);
            C87412m.m108593f(a, "UICProvider.of(this).get…allNormalUIC::class.java)");
            C63575n3.m74909c3((C63575n3) a, false, false, false, 7, (Object) null);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/ui/FinderLikedFeedUI$onCreate$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderLikedFeedUI$d */
    public static final class C3678d extends C87413o implements C32224a<C15976o> {

        /* renamed from: d */
        public final /* synthetic */ FinderLikedFeedUI f16918d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3678d(FinderLikedFeedUI finderLikedFeedUI) {
            super(0);
            this.f16918d = finderLikedFeedUI;
        }

        public Object invoke() {
            return C15976o.m14888a(this.f16918d.findViewById(C0966R.C0970id.egf));
        }
    }

    /* renamed from: I7 */
    public int mo2194I7() {
        return 2;
    }

    /* renamed from: K7 */
    public int mo2937K7() {
        return 2;
    }

    /* renamed from: N7 */
    public final C15976o mo4061N7() {
        return (C15976o) ((C36570n) this.f16914x).getValue();
    }

    /* renamed from: O7 */
    public final void mo4062O7() {
        FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = this.f16910t;
        if (likedTimelinePresenter != null) {
            C56597e1 r5 = likedTimelinePresenter.mo2579r5();
            boolean z = true;
            if (r5 == null || !r5.mo79924b()) {
                z = false;
            }
            if (z) {
                r5.mo79923a();
                return;
            }
            FinderLikeDrawer finderLikeDrawer = this.f16913w;
            if (finderLikeDrawer == null) {
                C87412m.m108603p("friendLikeDrawer");
                throw null;
            } else if (finderLikeDrawer.mo82541i()) {
                FinderLikeDrawer finderLikeDrawer2 = this.f16913w;
                if (finderLikeDrawer2 != null) {
                    finderLikeDrawer2.mo4615l();
                } else {
                    C87412m.m108603p("friendLikeDrawer");
                    throw null;
                }
            } else {
                C39622i0 a = C39818r.f106831a.mo62444c(this).mo75002a(C63575n3.class);
                C87412m.m108593f(a, "UICProvider.of(this).get…allNormalUIC::class.java)");
                if (!((C63575n3) a).mo88421d3(false)) {
                    finish();
                }
            }
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    /* renamed from: P7 */
    public final void mo4063P7() {
        if (C85875k4.m106208w()) {
            mo4061N7().f42964h.setVisibility(0);
            mo4061N7().f42963g.setVisibility(0);
            mo4061N7().f42962f.setVisibility(4);
            if (!C85875k4.m106199o0()) {
                return;
            }
            if (C85861e4.m106115b(this)) {
                mo4061N7().f42965i.setImageResource(C0966R.raw.icons_outlined_merge);
            } else {
                mo4061N7().f42965i.setImageResource(C0966R.raw.icons_outlined_sperated);
            }
        } else {
            mo4061N7().f42964h.setVisibility(8);
            mo4061N7().f42963g.setVisibility(8);
            mo4061N7().f42962f.setVisibility(8);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.adi;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        return C110826x0.m151017e(C13466ta.class, C13194da.class, C56711j.class, C63648v.class, C63547e.class, C14078c.class, C13539y3.class, C63513a1.class, C63575n3.class, C63545b1.class, C48085q4.class, C13554z.class, C13140c8.class, C63654v2.class);
    }

    public void initView() {
        int dimension = (int) getResources().getDimension(C0966R.dimen.f3736cp);
        C58784w3 w3Var = C58784w3.f168295a;
        Integer b0 = w3Var.mo83917b0(1, true);
        int intValue = b0 != null ? b0.intValue() : C0966R.raw.icons_filled_channels_like_bold;
        AppCompatActivity context = getContext();
        C87412m.m108593f(context, "context");
        String string = getContext().getString(C0966R.string.hep);
        C87412m.m108593f(string, "context.getString(com.te…der_my_inactive_feed_new)");
        setMMTitle(w3Var.mo83957q1(context, string, '#', intValue, C0966R.color.FG_0, dimension, dimension));
        View findViewById = findViewById(C0966R.C0970id.ivb);
        C87412m.m108593f(findViewById, "findViewById(R.id.rl_layout)");
        this.f16912v = (RefreshLoadMoreLayout) findViewById;
        setBackBtn(new C3675a(this));
        getIntent().getLongExtra("KEY_CACHE_ID", 0);
        getIntent().getIntExtra("KEY_CLICK_FEED_POSITION", 0);
        FinderLikeDrawer.Companion companion = FinderLikeDrawer.f17829D;
        AppCompatActivity context2 = getContext();
        C87412m.m108593f(context2, "context");
        Window window = getContext().getWindow();
        C87412m.m108593f(window, "context.window");
        this.f16913w = companion.mo4621a(context2, window, 1);
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f16912v;
        if (refreshLoadMoreLayout != null) {
            View inflate = C85868k2.m106137b(getContext()).inflate(C0966R.C0971layout.b7u, (ViewGroup) null);
            C87412m.m108593f(inflate, "getInflater(context).inf…d_more_footer_dark, null)");
            refreshLoadMoreLayout.setLoadMoreFooter(inflate);
            FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = new FinderLikedFeedContract.LikedTimelinePresenter(this, this.f16907q, this.f16908r, this.f16909s);
            this.f16910t = likedTimelinePresenter;
            FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = new FinderLikedFeedContract.LikedTimelineViewCallback(this, likedTimelinePresenter);
            this.f16911u = likedTimelineViewCallback;
            likedTimelineViewCallback.mo3739a();
            FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback2 = this.f16911u;
            if (likedTimelineViewCallback2 != null) {
                likedTimelineViewCallback2.f15988e.f15978g.register(likedTimelineViewCallback2.mo3741p());
                FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter2 = this.f16910t;
                if (likedTimelinePresenter2 != null) {
                    FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback3 = this.f16911u;
                    if (likedTimelineViewCallback3 != null) {
                        likedTimelinePresenter2.mo3738e(likedTimelineViewCallback3);
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("presenter");
                    throw null;
                }
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        } else {
            C87412m.m108603p("rlLayout");
            throw null;
        }
    }

    public boolean isHideStatusBar() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        mo4062O7();
    }

    public void onConfigurationChanged(Configuration configuration) {
        C87412m.m108594g(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        mo4063P7();
    }

    public void onCreate(Bundle bundle) {
        Class cls = C61212e.class;
        super.onCreate(bundle);
        C11345b bVar = C11345b.FinderLikedFeedUI;
        ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, bVar);
        this.f16906p = C75592q0.m90789s();
        String stringExtra = getIntent().getStringExtra("KEY_FAV_QUERY");
        String str = "";
        if (stringExtra == null) {
            stringExtra = str;
        }
        this.f16907q = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("KEY_REQUEST_ID");
        if (stringExtra2 != null) {
            str = stringExtra2;
        }
        this.f16908r = str;
        LinkedList<String> linkedList = this.f16909s;
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("KEY_TAGS");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new ArrayList<>();
        }
        linkedList.addAll(stringArrayListExtra);
        Log.m105925i(this.f16905o, "username %s", this.f16906p);
        initView();
        View decorView = getWindow().getDecorView();
        C87412m.m108593f(decorView, "window.decorView");
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1024 | 256);
        getWindow().setStatusBarColor(0);
        getController().mo177059O0(this, getResources().getColor(C0966R.color.ahf));
        C74779i.m89536a(this, false);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91112w(new ColorDrawable(0));
            supportActionBar.mo91104o();
        }
        LayoutInflater b = C85868k2.m106137b(getContext());
        View bodyView = getBodyView();
        C87412m.m108592e(bodyView, "null cannot be cast to non-null type android.view.ViewGroup");
        b.inflate(C0966R.C0971layout.f359694ac3, (ViewGroup) bodyView, true);
        mo4061N7().f42961e.setPadding(0, C75044y4.m89994f(this), 0, 0);
        mo4061N7().f42957a.setOnClickListener(new C3786e1(this));
        mo4063P7();
        mo4061N7().f42964h.setOnClickListener(new C3791f1(this));
        mo4061N7().f42959c.setVisibility(8);
        C58784w3.f168295a.mo83945l(getWindow(), false);
        setNavigationbarColor(getResources().getColor(C0966R.color.f3131gg));
        mo4061N7().f42961e.setVisibility(0);
        RefreshLoadMoreLayout refreshLoadMoreLayout = this.f16912v;
        if (refreshLoadMoreLayout != null) {
            refreshLoadMoreLayout.setBackgroundColor(getResources().getColor(C0966R.color.f3493v5));
            FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = this.f16911u;
            if (likedTimelineViewCallback != null) {
                likedTimelineViewCallback.getRecyclerView().mo17043c(this.f16915y);
                WeImageView weImageView = (WeImageView) findViewById(C0966R.C0970id.a2z);
                if (weImageView != null) {
                    weImageView.setIconColor(getResources().getColor(C0966R.color.f3583yg));
                }
                FrameLayout frameLayout = mo4061N7().f42958b;
                frameLayout.setVisibility(0);
                frameLayout.setOnClickListener(new C3677c(this));
                ((TextView) findViewById(C0966R.C0970id.cjg)).setText(getString(C0966R.string.lk_));
                C63575n3 n3Var = (C63575n3) C39818r.f106831a.mo62444c(this).mo75002a(C63575n3.class);
                FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = this.f16910t;
                if (likedTimelinePresenter != null) {
                    n3Var.f180282h = likedTimelinePresenter.f15978g;
                    n3Var.mo88425i3(getIntent().getExtras());
                    ((C61212e) C86312j.m106911c(cls)).mo86178qr(this, bVar).mo86179qs(this, C76986a.Finder);
                    return;
                }
                C87412m.m108603p("presenter");
                throw null;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
        C87412m.m108603p("rlLayout");
        throw null;
    }

    public void onDestroy() {
        super.onDestroy();
        FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = this.f16911u;
        if (likedTimelineViewCallback != null) {
            likedTimelineViewCallback.getRecyclerView().mo17098m1(this.f16915y);
            FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback2 = this.f16911u;
            if (likedTimelineViewCallback2 != null) {
                likedTimelineViewCallback2.f15988e.f15978g.unregister(likedTimelineViewCallback2.mo3741p());
                likedTimelineViewCallback2.f15988e.onDetach();
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    public void onPause() {
        super.onPause();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = this.f16911u;
        if (likedTimelineViewCallback != null) {
            C8777j5.C8778a.m8602c(j5Var, likedTimelineViewCallback.getRecyclerView(), C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR, "2", C0075i.EVENT_ON_PAUSE, 0, 0, 0, 112, (Object) null);
        } else {
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    public void onResume() {
        super.onResume();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        FinderLikedFeedContract.LikedTimelineViewCallback likedTimelineViewCallback = this.f16911u;
        if (likedTimelineViewCallback != null) {
            C8777j5.C8778a.m8602c(j5Var, likedTimelineViewCallback.getRecyclerView(), C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR, "2", C0075i.EVENT_ON_RESUME, 0, 0, 0, 112, (Object) null);
        } else {
            C87412m.m108603p("viewCallback");
            throw null;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        C87412m.m108594g(bundle, "outState");
        super.onSaveInstanceState(bundle);
        FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter = this.f16910t;
        if (likedTimelinePresenter != null) {
            BaseFinderFeedLoader baseFinderFeedLoader = likedTimelinePresenter.f15978g;
            Intent intent = getIntent();
            FinderLikedFeedContract.LikedTimelinePresenter likedTimelinePresenter2 = this.f16910t;
            if (likedTimelinePresenter2 != null) {
                BaseFeedLoader.saveCache$default(baseFinderFeedLoader, intent, likedTimelinePresenter2.f15978g.getInitPos(), (C2780c) null, 4, (Object) null);
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }
}
