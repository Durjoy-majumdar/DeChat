package com.tencent.p014mm.plugin.finder.nearby.video;

import ak1.C54059a;
import ak1.C54067f0;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39623j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl0.C67288e;
import bl3.C39818r;
import cm1.C0740i2;
import cm1.C0797z;
import cm1.C55012e1;
import cm1.C55018j0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import com.tencent.p014mm.plugin.finder.nearby.video.NearbyVideoStaggeredConfig;
import com.tencent.p014mm.plugin.finder.p056ui.FinderShareFeedRelUI;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.recyclerview.WxRecyclerView;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import de1.C7267b;
import de1.C7287o;
import di3.C7335d;
import di3.C86312j;
import dp1.C20480e0;
import dp1.C58417y0;
import dp1.C7450q;
import eb0.C31543z5;
import ef1.C58556f;
import er1.C58684b;
import er1.C58784w3;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import jq3.C60896i;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9494d;
import jq3.C9496f;
import jq3.C9499g;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import lm1.C10544b;
import lm1.C10575t;
import ln1.C10583e;
import o40.C61926c;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import te3.C49712hj1;
import te3.C51449tu2;
import up1.C14367u0;
import up1.C37521f;
import ve1.C14443a1;
import ve1.C14590p;

/* renamed from: com.tencent.mm.plugin.finder.nearby.video.j */
public final class C3352j implements C3343b<C0740i2> {

    /* renamed from: d */
    public final C49712hj1 f15804d;

    /* renamed from: e */
    public final MMActivity f15805e;

    /* renamed from: f */
    public final AbsNearByFragment f15806f;

    /* renamed from: g */
    public final C3342a<C0740i2> f15807g;

    /* renamed from: h */
    public final View f15808h;

    /* renamed from: i */
    public C14367u0 f15809i;

    /* renamed from: j */
    public int f15810j = -1;

    /* renamed from: n */
    public final C10575t f15811n;

    /* renamed from: o */
    public final C13601g f15812o;

    /* renamed from: com.tencent.mm.plugin.finder.nearby.video.j$a */
    public static final class C3353a implements C60898l.C9502b<C60905o> {

        /* renamed from: d */
        public final /* synthetic */ ArrayList<C0740i2> f15813d;

        /* renamed from: e */
        public final /* synthetic */ C3352j f15814e;

        /* renamed from: f */
        public final /* synthetic */ RecyclerView f15815f;

        public C3353a(ArrayList<C0740i2> arrayList, C3352j jVar, RecyclerView recyclerView) {
            this.f15813d = arrayList;
            this.f15814e = jVar;
            this.f15815f = recyclerView;
        }

        /* renamed from: q */
        public void mo734q(RecyclerView.C16613e eVar, View view, int i, RecyclerView.C16631z zVar) {
            RecyclerView.C16613e eVar2 = eVar;
            int i2 = i;
            C87412m.m108594g(eVar2, "adapter");
            C87412m.m108594g(view, "view");
            C87412m.m108594g((C60905o) zVar, "holder");
            int c6 = ((WxRecyclerAdapter) eVar2).mo85796c6();
            if (i2 >= c6) {
                int i3 = i2 - c6;
                C0740i2 i2Var = this.f15813d.get(i3);
                C87412m.m108593f(i2Var, "data[position - headCount]");
                C0740i2 i2Var2 = i2Var;
                Intent intent = new Intent();
                C13442s8.C13443a aVar = C13442s8.f38060Q0;
                Context context = view.getContext();
                C87412m.m108593f(context, "view.context");
                C13442s8.C13443a.m12791e(aVar, context, intent, 0, (String) null, 0, 0, false, 0, 252, (Object) null);
                C58784w3 w3Var = C58784w3.f168295a;
                C0740i2 T = w3Var.mo83901T(i3, this.f15813d);
                String str = "1002-" + C31543z5.m39453c();
                C3352j jVar = this.f15814e;
                jVar.f15810j = i3;
                BaseFinderFeed baseFinderFeed = T instanceof BaseFinderFeed ? (BaseFinderFeed) T : null;
                if (baseFinderFeed != null) {
                    ArrayList<C0740i2> arrayList = this.f15813d;
                    RecyclerView recyclerView = this.f15815f;
                    if (baseFinderFeed.mo3513o().isLiveFeed()) {
                        C10575t tVar = jVar.f15811n;
                        String str2 = jVar.f15804d.f134671e;
                        if (str2 == null) {
                            str2 = "";
                        }
                        tVar.mo10832d(i2Var2, i, i3, view, arrayList, str2, str, recyclerView);
                    } else {
                        intent.putExtra("feed_object_id", baseFinderFeed.getItemId());
                        intent.putExtra("feed_object_nonceId", baseFinderFeed.mo3513o().getObjectNonceId());
                        intent.putExtra("tab_type", 10);
                        intent.putExtra("key_reuqest_scene", 17);
                        intent.putExtra("key_comment_scene", 16);
                        intent.putExtra("key_from_comment_scene", 15);
                        intent.putExtra("key_click_tab_context_id", str);
                        C7267b bVar = C7267b.f25328d;
                        RecyclerView recyclerView2 = jVar.getRecyclerView();
                        long itemId = baseFinderFeed.getItemId();
                        C3342a<C0740i2> aVar2 = jVar.f15807g;
                        C87412m.m108592e(aVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.video.NearbyVideoPresenter");
                        C7287o.m7447c(intent, view, 0, false, false, C7267b.Ax0(bVar, recyclerView2, itemId, ((NearbyVideoPresenter) aVar2).getFeedLoader().getDataListJustForAdapter(), (C32226l) null, 8, (Object) null), 14, (Object) null);
                        MMActivity mMActivity = jVar.f15805e;
                        ((C58684b) C86312j.m106911c(C58684b.class)).getClass();
                        C87412m.m108594g(mMActivity, "context");
                        C58784w3.m68435a(w3Var, intent, 0, (String) null, 6, (Object) null);
                        intent.setClass(mMActivity, FinderShareFeedRelUI.class);
                        C20480e0.f57583a.mo32031d();
                        C9556a aVar3 = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar3.mo10233c(Integer.valueOf(C67288e.CTRL_INDEX));
                        aVar3.mo10233c(intent);
                        C117292a.m165364j(mMActivity, aVar3.mo10232b(), "com/tencent/mm/plugin/finder/utils/ActivityRouter", "enterFinderShareFeedDetailUI", "(Landroid/app/Activity;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                    }
                }
                C13442s8 s8Var = (C13442s8) C39818r.f106831a.mo62445d(this.f15814e.f15806f).mo75002a(C13442s8.class);
                if (s8Var != null) {
                    C49712hj1 q3 = s8Var.mo12861q3();
                    C3352j jVar2 = this.f15814e;
                    C7335d c = C86312j.m106911c(C58417y0.class);
                    C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                    C58417y0.Qx0((C58417y0) c, q3, i2Var2.getItemId(), jVar2.mo3679p().getRecyclerView(), 0, (String) null, 24, (Object) null);
                    C7450q.f25643a.mo8594b(q3, i2Var2, 18);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.video.j$b */
    public static final class C3354b extends RefreshLoadMoreLayout.C57879a {

        /* renamed from: a */
        public final /* synthetic */ C3352j f15816a;

        public C3354b(C3352j jVar) {
            this.f15816a = jVar;
        }

        /* renamed from: b */
        public void mo2561b(int i) {
            this.f15816a.f15807g.onLoadMore();
        }

        /* renamed from: c */
        public void mo2562c(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        }

        /* renamed from: d */
        public void mo3680d(int i) {
            this.f15816a.f15807g.onRefresh();
        }

        /* renamed from: e */
        public void mo3681e(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f15816a.f15807g.onRefreshEnd(cVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.video.j$c */
    public static final class C3355c extends C9499g<C9493c> {

        /* renamed from: a */
        public final /* synthetic */ C3352j f15817a;

        public C3355c(C3352j jVar) {
            this.f15817a = jVar;
        }

        /* renamed from: b */
        public void mo752b(Set<C9494d<C9493c>> set) {
            String str;
            C87412m.m108594g(set, "recordsSet");
            Log.m105924i("NearbyVideoViewCallback", "onExposeTimeRecorded: size = " + set.size());
            LinkedList linkedList = new LinkedList();
            C3352j jVar = this.f15817a;
            for (C9494d dVar : set) {
                T t = dVar.f29663a;
                if (t instanceof C0797z) {
                    C54059a aVar = new C54059a();
                    T t2 = dVar.f29663a;
                    C87412m.m108592e(t2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedLive");
                    C0797z zVar = (C0797z) t2;
                    int i = dVar.f29667e;
                    C54067f0.C54078q qVar = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD;
                    AbsNearByFragment absNearByFragment = jVar.f15806f;
                    if (absNearByFragment == null || (str = absNearByFragment.mo3551S()) == null) {
                        str = "";
                    }
                    aVar.mo74735d(zVar, i, qVar, "temp_32", str, jVar.f15811n.mo10830b(dVar.f29667e, dVar.f29668f, "onExpose"));
                } else if (t instanceof BaseFinderFeed) {
                    C51449tu2 tu22 = new C51449tu2();
                    T t3 = dVar.f29663a;
                    C87412m.m108592e(t3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                    BaseFinderFeed baseFinderFeed = (BaseFinderFeed) t3;
                    tu22.f142417d = baseFinderFeed.getItemId();
                    C55012e1.f154468d.mo76062f(tu22, jVar.f15807g.getCommentScene(), -1);
                    tu22.f142422i = (int) dVar.f29666d;
                    tu22.f142421h = baseFinderFeed.mo3526z();
                    linkedList.add(tu22);
                    Log.m105924i("NearbyVideoViewCallback", "onExposeTimeRecorded pos:" + dVar.f29667e + " exposeTime:" + dVar.f29666d + " nick:" + baseFinderFeed.mo3513o().getFeedObject().nickname + ", feedId=" + C61926c.m72691p(baseFinderFeed.getItemId()));
                } else {
                    Log.m105918d("NearbyVideoViewCallback", "onExposeTimeRecorded pos:" + dVar.f29667e + " exposeTime:" + dVar.f29666d);
                }
            }
            C10583e.f31911a.mo10839g(this.f15817a.f15807g.getCommentScene(), linkedList);
            C55012e1.f154468d.mo76060d(linkedList);
        }

        /* renamed from: c */
        public void mo753c(C9494d<C9493c> dVar) {
            C87412m.m108594g(dVar, "item");
            T t = dVar.f29663a;
            if (t instanceof C55018j0) {
                C51449tu2 tu22 = new C51449tu2();
                T t2 = dVar.f29663a;
                C87412m.m108592e(t2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.FinderFeedVideo");
                C55018j0 j0Var = (C55018j0) t2;
                tu22.f142417d = j0Var.getItemId();
                tu22.f142422i = (int) dVar.f29664b;
                C55012e1.f154468d.mo76062f(tu22, this.f15817a.f15807g.getCommentScene(), -1);
                ((LinkedList) C10583e.f31911a.mo10836d(this.f15817a.f15807g.getCommentScene())).add(tu22);
                Log.m105918d("NearbyVideoViewCallback", "onItemExposeStart id:" + tu22.f142417d + " nick:" + j0Var.mo3513o().getFeedObject().nickname);
            } else if (t instanceof BaseFinderFeed) {
                C87412m.m108592e(t, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.model.BaseFinderFeed");
                BaseFinderFeed baseFinderFeed = (BaseFinderFeed) t;
                Log.m105918d("NearbyVideoViewCallback", "onItemExposeStart: commentScene=" + this.f15817a.f15804d.f134675i + ", nick=" + baseFinderFeed.mo3513o().getFeedObject().nickname + ", id=" + C61926c.m72691p(baseFinderFeed.getItemId()));
                C51449tu2 tu23 = new C51449tu2();
                tu23.f142417d = baseFinderFeed.getItemId();
                tu23.f142423j = dVar.f29667e;
                tu23.f142421h = ((C58417y0) C86312j.m106911c(C58417y0.class)).mo83281Cu(baseFinderFeed.getItemId(), this.f15817a.f15804d.f134675i);
                tu23.f142428r = 1;
                C55012e1 e1Var = C55012e1.f154468d;
                LinkedList linkedList = new LinkedList();
                linkedList.add(tu23);
                e1Var.mo76060d(linkedList);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.video.j$d */
    public static final class C3356d extends C87413o implements C32226l<View, Boolean> {

        /* renamed from: d */
        public static final C3356d f15818d = new C3356d();

        public C3356d() {
            super(1);
        }

        public Object invoke(Object obj) {
            View view = (View) obj;
            C87412m.m108594g(view, LocaleUtil.ITALIAN);
            Context context = view.getContext();
            AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
            return Boolean.valueOf(appCompatActivity == null || appCompatActivity.getLifecycle().getCurrentState() == C39623j.C39626c.RESUMED);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.video.j$e */
    public static final class C3357e extends WxRecyclerAdapter<C0740i2> {
        public C3357e(ArrayList<C0740i2> arrayList, C9500j jVar) {
            super(jVar, arrayList, false);
        }

        /* renamed from: z6 */
        public void onViewAttachedToWindow(C60905o oVar) {
            C87412m.m108594g(oVar, "holder");
            super.onViewAttachedToWindow(oVar);
            ViewGroup.LayoutParams layoutParams = oVar.f44854d.getLayoutParams();
            if (layoutParams != null && (layoutParams instanceof StaggeredGridLayoutManager.LayoutParams)) {
                ((StaggeredGridLayoutManager.LayoutParams) layoutParams).f44911i = oVar.f44859i == -1;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.video.j$f */
    public static final class C3358f extends C87413o implements C32226l<Integer, C60896i<?>> {

        /* renamed from: d */
        public final /* synthetic */ C3352j f15819d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3358f(C3352j jVar) {
            super(1);
            this.f15819d = jVar;
        }

        public Object invoke(Object obj) {
            if (((Number) obj).intValue() == -1) {
                return new C14443a1(new C3360k(this.f15819d), new C3361l(this.f15819d), false, 4, (C8480h) null);
            }
            if (BuildInfo.DEBUG || BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED) {
                throw new RuntimeException("type invalid");
            }
            Log.printInfoStack("RecyclerViewAdapterEx", "type invalid", new Object[0]);
            return new C14590p();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.video.j$g */
    public static final class C3359g extends C87413o implements C32224a<RefreshLoadMoreLayout> {

        /* renamed from: d */
        public final /* synthetic */ C3352j f15820d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3359g(C3352j jVar) {
            super(0);
            this.f15820d = jVar;
        }

        public Object invoke() {
            return (RefreshLoadMoreLayout) this.f15820d.f15808h.findViewById(C0966R.C0970id.ivb);
        }
    }

    public C3352j(C49712hj1 hj12, MMActivity mMActivity, AbsNearByFragment absNearByFragment, C3342a<C0740i2> aVar, View view) {
        C87412m.m108594g(hj12, "contextObj");
        C87412m.m108594g(mMActivity, "baseContext");
        C87412m.m108594g(absNearByFragment, "fragment");
        C87412m.m108594g(aVar, "presenter");
        C87412m.m108594g(view, "parent");
        this.f15804d = hj12;
        this.f15805e = mMActivity;
        this.f15806f = absNearByFragment;
        this.f15807g = aVar;
        this.f15808h = view;
        this.f15809i = new NearbyVideoStaggeredConfig(mMActivity);
        this.f15811n = new C10575t(hj12, mMActivity, absNearByFragment, 15, (C10544b<C0740i2>) null);
        this.f15812o = C36568h.m40985a(new C3359g(this));
    }

    /* renamed from: c */
    public RefreshLoadMoreLayout mo3668c() {
        RefreshLoadMoreLayout p = mo3679p();
        C87412m.m108593f(p, "rlLayout");
        return p;
    }

    /* renamed from: d */
    public void mo3669d(ArrayList<C0740i2> arrayList) {
        C87412m.m108594g(arrayList, "data");
        Resources resources = MMApplicationContext.getContext().getResources();
        mo3679p().setLimitTopRequest(((int) resources.getDimension(C0966R.dimen.a8a)) - ((int) resources.getDimension(C0966R.dimen.f3709c2)));
        mo3679p().setRefreshTargetY(((int) resources.getDimension(C0966R.dimen.f3758d_)) - ((int) resources.getDimension(C0966R.dimen.a8a)));
        mo3679p().setDamping(1.85f);
        RecyclerView recyclerView = mo3679p().getRecyclerView();
        C14367u0 u0Var = this.f15809i;
        Context context = this.f15808h.getContext();
        C87412m.m108593f(context, "parent.context");
        recyclerView.setLayoutManager(u0Var.mo3666d(context));
        ((NearbyVideoStaggeredConfig) this.f15809i).getClass();
        recyclerView.mo17085h0(new NearbyVideoStaggeredConfig.C3339a());
        recyclerView.setRecycledViewPool(this.f15809i.mo3667e(this.f15805e));
        RecyclerView.C16616j itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            itemAnimator.f44810f = 0;
        }
        C14367u0 u0Var2 = this.f15809i;
        C3358f fVar = new C3358f(this);
        NearbyVideoStaggeredConfig nearbyVideoStaggeredConfig = (NearbyVideoStaggeredConfig) u0Var2;
        nearbyVideoStaggeredConfig.getClass();
        C3357e eVar = new C3357e(arrayList, new NearbyVideoStaggeredConfig$getItemConvertFactory$1(nearbyVideoStaggeredConfig, fVar));
        eVar.f173488o = new C3353a(arrayList, this, recyclerView);
        recyclerView.setAdapter(eVar);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemViewCacheSize(4);
        C37521f.f99374d.getClass();
        ((WxRecyclerView) recyclerView).setFlingSpeedFactor(C37521f.f99271R1.mo60266n().intValue());
        mo3679p().setActionCallback(new C3354b(this));
        C39622i0 a = C39818r.f106831a.mo62445d(this.f15806f).mo75002a(C13442s8.class);
        C87412m.m108593f(a, "UICProvider.of(fragment)…rReporterUIC::class.java)");
        C13442s8.C13443a aVar = C13442s8.f38060Q0;
        C58556f j3 = ((C13442s8) a).mo12854j3(-1);
        if (j3 != null) {
            j3.mo83455c(recyclerView);
        }
        C9496f.m9181b(recyclerView, new C3355c(this), C3356d.f15818d);
    }

    public MMFragmentActivity getActivity() {
        return this.f15805e;
    }

    public RecyclerView getRecyclerView() {
        return mo3679p().getRecyclerView();
    }

    /* renamed from: p */
    public final RefreshLoadMoreLayout mo3679p() {
        return (RefreshLoadMoreLayout) ((C36570n) this.f15812o).getValue();
    }
}
