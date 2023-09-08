package com.tencent.p014mm.plugin.finder.nearby.live;

import ak1.C0075i;
import ak1.C54067f0;
import ak1.C54108o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bh3.C113177k;
import bl3.C39818r;
import cm1.C0731g;
import cm1.C0740i2;
import cm1.C0784u1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.nearby.live.NearbyLiveFeedLoader;
import com.tencent.p014mm.plugin.finder.nearby.live.play.NearbyLivePlayerViewRecycler;
import com.tencent.p014mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC;
import com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.p014mm.view.refreshLayout.WxRefreshLayout;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C86312j;
import eb0.C31543z5;
import fe1.C8014g;
import fm1.C8137c;
import fy3.C32224a;
import gy3.C8477a0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import hm1.C32946a;
import hn1.C8614b;
import ht1.C60200t1;
import im1.C9202d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import je1.C9311g2;
import kf1.C9833k9;
import kn1.C10364a;
import lm1.C10544b;
import lm1.C10545c;
import lm1.C10550g;
import lm1.C10552h;
import ln1.C21445b;
import ln1.C61313a;
import mm1.C10934a;
import mq3.C47093a;
import nn1.C11233b;
import nn1.C11235c;
import o40.C61926c;
import os1.C11759w;
import pe3.C89349b;
import pm1.C62381d;
import pm1.C62399p;
import ps3.C12005b;
import qm1.C63285a;
import rx3.C13598b0;
import te3.C49599gr0;
import te3.C49712hj1;
import te3.C51942x91;
import up1.C37521f;
import vc1.C37715b;
import zp3.C16389w;

/* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter */
public class NearbyLivePresenter implements C10544b<C0740i2> {

    /* renamed from: A */
    public final NearbyLivePresenter$finderNearbyRefreshEventListener$1 f15599A;

    /* renamed from: B */
    public C0731g f15600B;

    /* renamed from: C */
    public boolean f15601C;

    /* renamed from: D */
    public boolean f15602D;

    /* renamed from: E */
    public boolean f15603E;

    /* renamed from: F */
    public boolean f15604F;

    /* renamed from: G */
    public boolean f15605G;

    /* renamed from: d */
    public final MMActivity f15606d;

    /* renamed from: e */
    public final C49712hj1 f15607e;

    /* renamed from: f */
    public final String f15608f;

    /* renamed from: g */
    public int f15609g;

    /* renamed from: h */
    public boolean f15610h;

    /* renamed from: i */
    public Fragment f15611i;

    /* renamed from: j */
    public C51942x91 f15612j;

    /* renamed from: n */
    public C89349b f15613n;

    /* renamed from: o */
    public C10545c<C0740i2> f15614o;

    /* renamed from: p */
    public final C11759w f15615p;

    /* renamed from: q */
    public C10364a f15616q;

    /* renamed from: r */
    public C9202d f15617r;

    /* renamed from: s */
    public C89349b f15618s;

    /* renamed from: t */
    public C62381d f15619t;

    /* renamed from: u */
    public NearbyLiveFeedLoader f15620u;

    /* renamed from: v */
    public C16389w f15621v = new C3299j(this);

    /* renamed from: w */
    public final NearbyLivePresenter$uninterestEventListener$1 f15622w;

    /* renamed from: x */
    public boolean f15623x;

    /* renamed from: y */
    public boolean f15624y;

    /* renamed from: z */
    public final NearbyLivePresenter$finderNearbyDataUpdateEventListener$1 f15625z;

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$a */
    public static final class C3290a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ WxRefreshLayout f15626d;

        public C3290a(WxRefreshLayout wxRefreshLayout) {
            this.f15626d = wxRefreshLayout;
        }

        public final void run() {
            this.f15626d.mo26573d();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$b */
    public static final class C3291b extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ RefreshLoadMoreLayout.C7080c<Object> f15627d;

        /* renamed from: e */
        public final /* synthetic */ NearbyLivePresenter f15628e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3291b(RefreshLoadMoreLayout.C7080c<Object> cVar, NearbyLivePresenter nearbyLivePresenter) {
            super(0);
            this.f15627d = cVar;
            this.f15628e = nearbyLivePresenter;
        }

        public Object invoke() {
            DataBuffer dataList;
            RefreshLoadMoreLayout.C7080c<Object> cVar = this.f15627d;
            boolean z = false;
            if (cVar == null) {
                cVar = new RefreshLoadMoreLayout.C7080c<>(0);
                cVar.f24948c = MMApplicationContext.getContext().getResources().getString(C0966R.string.eey);
            }
            RecyclerView recyclerView = this.f15628e.mo3584n0().getRecyclerView();
            C47093a aVar = null;
            RecyclerView.C16613e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            WxRecyclerAdapter wxRecyclerAdapter = adapter instanceof WxRecyclerAdapter ? (WxRecyclerAdapter) adapter : null;
            boolean z2 = (wxRecyclerAdapter != null ? wxRecyclerAdapter.mo82597F4() : 0) <= 0;
            boolean z3 = cVar.f24946a != 2 && cVar.f24947b == -2;
            Log.m105924i("Finder.NearbyLivePresenter", "[checkEmptyHeader] isEmpty=" + z2 + " reason=" + cVar + " refreshAndNoPermission:" + z3);
            if (z2 || z3) {
                if (z3) {
                    NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f15628e.f15620u;
                    if (!(nearbyLiveFeedLoader == null || (dataList = nearbyLiveFeedLoader.getDataList()) == null)) {
                        dataList.clear();
                    }
                    if (wxRecyclerAdapter != null) {
                        wxRecyclerAdapter.notifyDataSetChanged();
                    }
                }
                WxRefreshLayout c = this.f15628e.mo3584n0().mo10817c();
                if (c != null) {
                    aVar = c.getCommonConfig();
                }
                if (aVar != null) {
                    aVar.f126542d = false;
                }
                C0731g gVar = this.f15628e.f15600B;
                String string = MMApplicationContext.getContext().getResources().getString(C0966R.string.eey);
                C87412m.m108593f(string, "getContext().resources.g…g.finder_no_more_content)");
                gVar.getClass();
                gVar.f1744d = string;
                C0731g gVar2 = this.f15628e.f15600B;
                gVar2.f1745e = cVar.f24947b;
                gVar2.f1746f = 1001;
                String string2 = MMApplicationContext.getContext().getResources().getString(C0966R.string.eey);
                C87412m.m108593f(string2, "getContext().resources.g…g.finder_no_more_content)");
                gVar2.f1744d = string2;
                NearbyLivePresenter nearbyLivePresenter = this.f15628e;
                C51942x91 x912 = nearbyLivePresenter.f15612j;
                if (x912 != null) {
                    C0731g gVar3 = nearbyLivePresenter.f15600B;
                    String string3 = MMApplicationContext.getContext().getResources().getString(C0966R.string.h6f, new Object[]{x912.f144532e});
                    C87412m.m108593f(string3, "getContext().resources.g…ore_content, it.tab_name)");
                    gVar3.getClass();
                    gVar3.f1744d = string3;
                    nearbyLivePresenter.f15600B.f1747g = 1000;
                    E e = cVar.f24949d;
                    if (e instanceof C49599gr0) {
                        C87412m.m108592e(e, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderJumpLiveTab");
                        C51942x91 x913 = ((C49599gr0) e).f134208e;
                        if (x913 != null) {
                            if (x912.f144531d == x913.f144531d) {
                                C0731g gVar4 = nearbyLivePresenter.f15600B;
                                gVar4.f1747g = 1000;
                                String string4 = MMApplicationContext.getContext().getResources().getString(C0966R.string.h6f, new Object[]{x912.f144532e});
                                C87412m.m108593f(string4, "getContext().resources.g…ore_content, it.tab_name)");
                                gVar4.f1744d = string4;
                            } else {
                                C0731g gVar5 = nearbyLivePresenter.f15600B;
                                gVar5.f1747g = 2000;
                                gVar5.f1744d = String.valueOf(x912.f144532e);
                                nearbyLivePresenter.f15600B.f1748h = new C3301b(nearbyLivePresenter, x913);
                            }
                        }
                    }
                }
                if (wxRecyclerAdapter != null && !wxRecyclerAdapter.mo85795Y5(this.f15628e.f15600B)) {
                    wxRecyclerAdapter.mo85793T5(this.f15628e.f15600B, false);
                } else if (wxRecyclerAdapter != null) {
                    wxRecyclerAdapter.mo85798e6((long) this.f15628e.f15600B.hashCode());
                }
            } else if (wxRecyclerAdapter != null) {
                wxRecyclerAdapter.mo85802j6((long) this.f15628e.f15600B.hashCode(), false);
            }
            WxRefreshLayout c2 = this.f15628e.mo3584n0().mo10817c();
            if (c2 != null) {
                if (cVar.f24947b != -1 || !z2) {
                    z = true;
                }
                c2.setNestedScrollingEnabled(z);
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$c */
    public static final class C3292c implements C113177k.C113181e {

        /* renamed from: a */
        public final /* synthetic */ NearbyLivePresenter f15629a;

        public C3292c(NearbyLivePresenter nearbyLivePresenter) {
            this.f15629a = nearbyLivePresenter;
        }

        public final void onOp(Boolean bool) {
            C87412m.m108593f(bool, LocaleUtil.ITALIAN);
            if (bool.booleanValue()) {
                this.f15629a.mo3596x();
                return;
            }
            NearbyLivePresenter nearbyLivePresenter = this.f15629a;
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
            cVar.f24948c = MMApplicationContext.getContext().getResources().getString(C0966R.string.eey);
            cVar.f24947b = -2;
            nearbyLivePresenter.mo3590q(cVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$d */
    public static final class C3293d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ NearbyLivePresenter f15630d;

        public C3293d(NearbyLivePresenter nearbyLivePresenter) {
            this.f15630d = nearbyLivePresenter;
        }

        public final void run() {
            WxRefreshLayout c = this.f15630d.mo3584n0().mo10817c();
            if (c != null) {
                c.mo26604l(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$e */
    public static final class C3294e extends RecyclerView.C0130p {

        /* renamed from: d */
        public final /* synthetic */ NearbyLivePresenter f15631d;

        public C3294e(NearbyLivePresenter nearbyLivePresenter) {
            this.f15631d = nearbyLivePresenter;
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$onAttach$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
            super.onScrollStateChanged(recyclerView, i);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$onAttach$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            Class cls = C54108o.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(recyclerView);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Integer.valueOf(i2));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$onAttach$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
            C87412m.m108594g(recyclerView, "recyclerView");
            super.onScrolled(recyclerView, i, i2);
            ((C54108o) C86312j.m106911c(cls)).Ix0(recyclerView, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD, String.valueOf(this.f15631d.getCommentScene()), C0075i.EVENT_ON_SCROLL, ((C54108o) C86312j.m106911c(cls)).f151873d, ((C54108o) C86312j.m106911c(cls)).f151873d);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter$onAttach$1$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$f */
    public static final class C3295f implements C113177k.C113181e {

        /* renamed from: a */
        public final /* synthetic */ NearbyLivePresenter f15632a;

        public C3295f(NearbyLivePresenter nearbyLivePresenter) {
            this.f15632a = nearbyLivePresenter;
        }

        public final void onOp(Boolean bool) {
            C87412m.m108593f(bool, LocaleUtil.ITALIAN);
            if (bool.booleanValue()) {
                this.f15632a.mo3589p1();
                return;
            }
            NearbyLivePresenter nearbyLivePresenter = this.f15632a;
            RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
            cVar.f24948c = MMApplicationContext.getContext().getResources().getString(C0966R.string.eey);
            cVar.f24947b = -2;
            nearbyLivePresenter.mo3590q(cVar);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$g */
    public static final class C3296g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ NearbyLivePresenter f15633d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3296g(NearbyLivePresenter nearbyLivePresenter) {
            super(0);
            this.f15633d = nearbyLivePresenter;
        }

        public Object invoke() {
            this.f15633d.mo3595u0();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$h */
    public static final class C3297h extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ NearbyLivePresenter f15634d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3297h(NearbyLivePresenter nearbyLivePresenter) {
            super(0);
            this.f15634d = nearbyLivePresenter;
        }

        public Object invoke() {
            if (this.f15634d.f15609g != 0 || !C8614b.f27717a.mo9480e()) {
                NearbyLivePresenter nearbyLivePresenter = this.f15634d;
                if (!nearbyLivePresenter.f15623x) {
                    nearbyLivePresenter.f15623x = true;
                    C61926c.m72657B("LbsPresenter_requestLbs", true, new C3305f(nearbyLivePresenter));
                }
            } else {
                Log.m105924i("Finder.NearbyLivePresenter", "requestRefreshForPermission first enter asyncRequestLbs");
                C61926c.m72657B("LbsPresenter_requestLbs", true, C3303d.f15648d);
                this.f15634d.requestRefresh();
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$i */
    public static final class C3298i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ NearbyLivePresenter f15635d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3298i(NearbyLivePresenter nearbyLivePresenter) {
            super(0);
            this.f15635d = nearbyLivePresenter;
        }

        public Object invoke() {
            this.f15635d.requestRefresh();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.nearby.live.NearbyLivePresenter$j */
    public static final class C3299j implements C16389w {

        /* renamed from: d */
        public final /* synthetic */ NearbyLivePresenter f15636d;

        public C3299j(NearbyLivePresenter nearbyLivePresenter) {
            this.f15636d = nearbyLivePresenter;
        }

        /* renamed from: a */
        public final WxRecyclerAdapter<?> mo3600a() {
            RecyclerView recyclerView = this.f15636d.mo3584n0().getRecyclerView();
            RecyclerView.C16613e adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter instanceof WxRecyclerAdapter) {
                return (WxRecyclerAdapter) adapter;
            }
            return null;
        }

        public void onChanged() {
            this.f15636d.mo3584n0().mo10820u().onChanged();
            C8614b bVar = C8614b.f27717a;
            NearbyLivePresenter nearbyLivePresenter = this.f15636d;
            bVar.mo9481f(nearbyLivePresenter.f15607e, nearbyLivePresenter.f15612j);
            C11233b.f33100i.mo11311a(this.f15636d.mo3582j0()).f33108g = System.currentTimeMillis();
            C11235c.f33110a.mo12482c("recyclerOnChange");
        }

        public void onItemRangeChanged(int i, int i2) {
            C16389w u = this.f15636d.mo3584n0().mo10820u();
            WxRecyclerAdapter<?> a = mo3600a();
            u.onItemRangeChanged(i + (a != null ? a.mo85796c6() : 0), i2);
        }

        public void onItemRangeInserted(int i, int i2) {
            C16389w u = this.f15636d.mo3584n0().mo10820u();
            WxRecyclerAdapter<?> a = mo3600a();
            u.onItemRangeInserted(i + (a != null ? a.mo85796c6() : 0), i2);
            C8614b bVar = C8614b.f27717a;
            NearbyLivePresenter nearbyLivePresenter = this.f15636d;
            bVar.mo9481f(nearbyLivePresenter.f15607e, nearbyLivePresenter.f15612j);
            C11233b.f33100i.mo11311a(this.f15636d.mo3582j0()).f33108g = System.currentTimeMillis();
            C21445b.f60694a.mo33619h(this.f15636d.mo3593s3());
            C11235c.f33110a.mo12482c("recyclerOnInsert");
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            C16389w u = this.f15636d.mo3584n0().mo10820u();
            WxRecyclerAdapter<?> a = mo3600a();
            int i4 = 0;
            int c6 = i + (a != null ? a.mo85796c6() : 0);
            WxRecyclerAdapter<?> a2 = mo3600a();
            if (a2 != null) {
                i4 = a2.mo85796c6();
            }
            u.onItemRangeMoved(c6, i2 + i4, i3);
        }

        public void onItemRangeRemoved(int i, int i2) {
            C16389w u = this.f15636d.mo3584n0().mo10820u();
            WxRecyclerAdapter<?> a = mo3600a();
            u.onItemRangeRemoved(i + (a != null ? a.mo85796c6() : 0), i2);
        }

        public void onPreFinishLoadMore(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f15636d.mo3584n0().mo10820u().onPreFinishLoadMore(cVar);
        }

        public void onPreFinishLoadMoreSmooth(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f15636d.mo3584n0().mo10820u().onPreFinishLoadMoreSmooth(cVar);
            C10364a aVar = this.f15636d.f15616q;
            if (aVar != null) {
                aVar.mo10671a(cVar.f24951f);
            }
        }

        public void onPreFinishRefresh(RefreshLoadMoreLayout.C7080c<Object> cVar) {
            C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
            this.f15636d.mo3584n0().mo10820u().onPreFinishRefresh(cVar);
        }

        public void onItemRangeChanged(int i, int i2, Object obj) {
            C16389w u = this.f15636d.mo3584n0().mo10820u();
            WxRecyclerAdapter<?> a = mo3600a();
            u.onItemRangeChanged(i + (a != null ? a.mo85796c6() : 0), i2, obj);
        }
    }

    public NearbyLivePresenter(MMActivity mMActivity, C49712hj1 hj12, String str) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(hj12, "contextObj");
        C87412m.m108594g(str, "by_pass");
        this.f15606d = mMActivity;
        this.f15607e = hj12;
        this.f15608f = str;
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11759w.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…eloadCacheVM::class.java)");
        this.f15615p = (C11759w) a;
        this.f15622w = new NearbyLivePresenter$uninterestEventListener$1(this, mMActivity);
        Log.m105924i("Finder.NearbyLivePresenter", "#init");
        this.f15624y = true;
        C40008f fVar = C40008f.f107254d;
        this.f15625z = new NearbyLivePresenter$finderNearbyDataUpdateEventListener$1(this, fVar);
        this.f15599A = new NearbyLivePresenter$finderNearbyRefreshEventListener$1(this, fVar);
        this.f15600B = new C0731g((CharSequence) null, 0, 0, 7, (C8480h) null);
        this.f15602D = true;
        this.f15604F = true;
    }

    /* renamed from: G */
    public final void mo3568G(String str) {
        Class cls = FinderCommonFeatureService.class;
        Log.m105924i("Finder.NearbyLivePresenter", "disposeRedDot from " + str);
        boolean z = true;
        if (C37715b.f99914a.mo61298a()) {
            C51942x91 x912 = this.f15612j;
            if (x912 != null && x912.f144531d == 88889) {
                Log.m105924i("Finder.NearbyLivePresenter", "disposeRedDot from " + str + " return for 同城直播.");
                return;
            }
        }
        int commentScene = getCommentScene();
        if (!(commentScene == 9500001 || commentScene == 9500002 || commentScene == 9500004 || commentScene == 9500003)) {
            z = false;
        }
        if (z) {
            Log.m105924i("Finder.NearbyLivePresenter", "disposeRedDot from " + str + " return for in operation game.");
            return;
        }
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77239M5("NearbyLiveTab");
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77263e("NearbyLiveTab", str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: J0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3569J0(boolean r13) {
        /*
            r12 = this;
            lm1.c r0 = r12.mo3584n0()
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            androidx.recyclerview.widget.RecyclerView$LayoutManager r1 = r0.getLayoutManager()
            boolean r2 = r1 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            r9 = 0
            if (r2 == 0) goto L_0x0020
            r2 = 2
            int[] r2 = new int[r2]
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
            r1.mo17394A(r2)
            r1 = r2[r9]
        L_0x001e:
            r10 = r1
            goto L_0x002c
        L_0x0020:
            boolean r2 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r2 == 0) goto L_0x002b
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            int r1 = r1.mo16957C()
            goto L_0x001e
        L_0x002b:
            r10 = 0
        L_0x002c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "[onActionbarClick] position="
            r1.append(r2)
            r1.append(r10)
            java.lang.String r2 = " isDouble="
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Finder.TimelineLbsPresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r2, r1)
            if (r13 == 0) goto L_0x00e0
            r13 = 12
            if (r10 > r13) goto L_0x0092
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r11.mo10233c(r1)
            java.lang.Object[] r2 = r11.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter"
            java.lang.String r4 = "onActionbarClick"
            java.lang.String r5 = "(Z)V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "smoothScrollToPosition"
            java.lang.String r8 = "(I)V"
            r1 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r11.mo10231a(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.mo17149t1(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter"
            java.lang.String r3 = "onActionbarClick"
            java.lang.String r4 = "(Z)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "smoothScrollToPosition"
            java.lang.String r7 = "(I)V"
            r1 = r0
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x00d3
        L_0x0092:
            k20.a r11 = new k20.a
            r11.<init>()
            java.lang.ThreadLocal<k20.a> r1 = k20.C60958c.f173611a
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r11.mo10233c(r1)
            java.lang.Object[] r2 = r11.mo10232b()
            java.lang.String r3 = "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter"
            java.lang.String r4 = "onActionbarClick"
            java.lang.String r5 = "(Z)V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "scrollToPosition"
            java.lang.String r8 = "(I)V"
            r1 = r0
            j20.C117292a.m165358d(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object r1 = r11.mo10231a(r9)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r0.mo17115r1(r1)
            java.lang.String r2 = "com/tencent/mm/plugin/finder/nearby/live/NearbyLivePresenter"
            java.lang.String r3 = "onActionbarClick"
            java.lang.String r4 = "(Z)V"
            java.lang.String r5 = "Undefined"
            java.lang.String r6 = "scrollToPosition"
            java.lang.String r7 = "(I)V"
            r1 = r0
            j20.C117292a.m165359e(r1, r2, r3, r4, r5, r6, r7)
        L_0x00d3:
            if (r10 > r13) goto L_0x00db
            r0 = 20
            r12.mo3579e(r0, r9)
            goto L_0x00e0
        L_0x00db:
            r0 = 100
            r12.mo3579e(r0, r9)
        L_0x00e0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.live.NearbyLivePresenter.mo3569J0(boolean):void");
    }

    /* renamed from: L */
    public C62381d mo3570L() {
        return this.f15619t;
    }

    /* renamed from: L0 */
    public void mo3571L0(C10545c<C0740i2> cVar, boolean z, C89349b bVar) {
        boolean z2;
        C10545c<C0740i2> cVar2 = cVar;
        boolean z3 = z;
        C89349b bVar2 = bVar;
        Class cls = C11759w.class;
        Class<FinderCommonFeatureService> cls2 = FinderCommonFeatureService.class;
        C87412m.m108594g(cVar2, "callback");
        Log.m105924i("Finder.NearbyLivePresenter", "onAttach targetPageForceRefreshFlag:" + z3 + " targetTabPageLastBuffer:" + bVar2);
        C8477a0 a0Var = new C8477a0();
        a0Var.f27482d = this.f15615p.mo11637f3(mo3582j0());
        StringBuilder sb = new StringBuilder();
        sb.append("createFeedLoader canTimelineRefresh=");
        sb.append(a0Var.f27482d);
        sb.append(" memoryCacheFlag:");
        sb.append(mo3582j0());
        sb.append(" tabId: ");
        C51942x91 x912 = this.f15612j;
        C62399p pVar = null;
        sb.append(x912 != null ? Integer.valueOf(x912.f144531d) : null);
        sb.append(" tabName: ");
        C51942x91 x913 = this.f15612j;
        sb.append(x913 != null ? x913.f144532e : null);
        sb.append("  commentScene: ");
        sb.append(getCommentScene());
        sb.append(" contextScene: ");
        sb.append(this.f15607e.f134675i);
        Log.m105924i("Finder.NearbyLivePresenter", sb.toString());
        NearbyLivePresenter$createFeedLoader$1 nearbyLivePresenter$createFeedLoader$1 = new NearbyLivePresenter$createFeedLoader$1(this, this.f15607e, getCommentScene(), mo3593s3(), mo3580f0(), this.f15608f);
        nearbyLivePresenter$createFeedLoader$1.setInitDone(new C10550g(a0Var, this, nearbyLivePresenter$createFeedLoader$1));
        nearbyLivePresenter$createFeedLoader$1.f15533g = new C10552h(this, nearbyLivePresenter$createFeedLoader$1);
        this.f15620u = nearbyLivePresenter$createFeedLoader$1;
        this.f15613n = bVar2;
        this.f15610h = z3;
        if (z3) {
            C39622i0 a = C39818r.f106831a.mo62446e(cls2).mo75002a(cls);
            C87412m.m108593f(a, "UICProvider.of(FinderCom…eloadCacheVM::class.java)");
            C11759w wVar = (C11759w) a;
            int j0 = mo3582j0();
            C11759w.C11760a d3 = ((C11759w) C39818r.f106831a.mo62446e(cls2).mo75002a(cls)).mo11635d3(j0);
            d3.f34434f = C11759w.C11762c.HardRefresh;
            d3.f34433e = 0;
            d3.f34437i = 0;
            Log.m105924i("PreloadCacheManager", "resetFirstPage memoryCacheFlag:" + j0);
        }
        this.f15614o = cVar2;
        C10545c<C0740i2> n0 = mo3584n0();
        NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f15620u;
        C87412m.m108591d(nearbyLiveFeedLoader);
        n0.mo10818d(nearbyLiveFeedLoader.getDataListJustForAdapter());
        NearbyLiveFeedLoader nearbyLiveFeedLoader2 = this.f15620u;
        if (nearbyLiveFeedLoader2 != null) {
            nearbyLiveFeedLoader2.register(this.f15621v);
        }
        ((C12005b) C86312j.m106911c(C12005b.class)).mo11147wX(true);
        this.f15599A.alive();
        this.f15625z.alive();
        this.f15622w.alive();
        RecyclerView recyclerView = mo3584n0().getRecyclerView();
        if (recyclerView != null) {
            recyclerView.mo17043c(new C3294e(this));
            C61313a.f174433b = String.valueOf(this.f15607e.f134675i);
            MMActivity mMActivity = this.f15606d;
            NearbyLiveFeedLoader nearbyLiveFeedLoader3 = this.f15620u;
            C87412m.m108591d(nearbyLiveFeedLoader3);
            DataBuffer dataListJustForAdapter = nearbyLiveFeedLoader3.getDataListJustForAdapter();
            if (C32946a.f89536b.mo60266n().intValue() == 1) {
                z2 = true;
            } else {
                C51942x91 x914 = this.f15612j;
                z2 = x914 != null ? x914.f144536i : false;
            }
            C51942x91 x915 = this.f15612j;
            C62381d dVar = new C62381d(mMActivity, recyclerView, dataListJustForAdapter, z2, x915 != null ? x915.f144531d : 0, false, false, false, (WxRecyclerAdapter) null, 480, (C8480h) null);
            this.f15619t = dVar;
            dVar.mo87429h((C63285a) null);
            ((NearbyLivePlayerViewRecycler) C39818r.f106831a.mo62446e(C8137c.class).mo75002a(NearbyLivePlayerViewRecycler.class)).mo11321n2(this.f15606d);
            if (recyclerView.getAdapter() instanceof WxRecyclerAdapter) {
                RecyclerView.C16613e adapter = recyclerView.getAdapter();
                C87412m.m108592e(adapter, "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.WxRecyclerAdapter<*>");
                WxRecyclerAdapter wxRecyclerAdapter = (WxRecyclerAdapter) adapter;
                C62381d dVar2 = this.f15619t;
                if (dVar2 != null) {
                    pVar = dVar2.f177302r;
                }
                wxRecyclerAdapter.f173489p = pVar;
            }
        }
        if (!(mo3584n0().getRecyclerView() == null || this.f15620u == null)) {
            RecyclerView recyclerView2 = mo3584n0().getRecyclerView();
            C87412m.m108591d(recyclerView2);
            NearbyLiveFeedLoader nearbyLiveFeedLoader4 = this.f15620u;
            C87412m.m108591d(nearbyLiveFeedLoader4);
            this.f15616q = new C10364a(recyclerView2, nearbyLiveFeedLoader4, this.f15612j, getCommentScene());
            RecyclerView recyclerView3 = mo3584n0().getRecyclerView();
            C87412m.m108591d(recyclerView3);
            this.f15617r = new C9202d(recyclerView3);
        }
        mo3594t();
    }

    /* renamed from: M0 */
    public void mo3572M0() {
        int i;
        LinkedList linkedList;
        C51942x91 x912;
        if (this.f15620u == null) {
            Log.m105928w("Finder.NearbyLivePresenter", "storeMemoryCache return for feedLoader:" + this.f15620u);
            return;
        }
        this.f15615p.f34427h.clear();
        NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f15620u;
        C87412m.m108591d(nearbyLiveFeedLoader);
        C9833k9 k9Var = nearbyLiveFeedLoader.f15546w;
        C9202d dVar = this.f15617r;
        int i2 = dVar != null ? dVar.f28941a : 0;
        int i3 = dVar != null ? dVar.f28942b : 0;
        NearbyLiveFeedLoader nearbyLiveFeedLoader2 = this.f15620u;
        C87412m.m108591d(nearbyLiveFeedLoader2);
        int size = nearbyLiveFeedLoader2.getDataListJustForAdapter().size();
        int j0 = mo3582j0();
        Fragment fragment = this.f15611i;
        NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment = fragment instanceof NearbyLiveSquareTabFragment ? (NearbyLiveSquareTabFragment) fragment : null;
        int i4 = (nearbyLiveSquareTabFragment == null || (x912 = nearbyLiveSquareTabFragment.f15691s) == null) ? 0 : x912.f144531d;
        String str = " size:";
        if (!this.f15624y || k9Var == null) {
            String str2 = " enableFoldFollowData:";
            if (size > 0) {
                C11759w wVar = this.f15615p;
                NearbyLiveFeedLoader nearbyLiveFeedLoader3 = this.f15620u;
                C87412m.m108591d(nearbyLiveFeedLoader3);
                C11759w.m11458i3(wVar, j0, i2, i3, nearbyLiveFeedLoader3.getDataListJustForAdapter(), (ArrayList) null, this.f15618s, false, i4, 80, (Object) null);
                Log.m105924i("Finder.NearbyLivePresenter", "[onFinishing] memoryCacheFlag:" + j0 + str2 + this.f15624y + " position:" + i2 + " offset:" + i3 + str + size + " lastBuffer:" + this.f15618s);
                return;
            }
            return;
        }
        int i5 = k9Var.f30391h;
        NearbyLiveFeedLoader nearbyLiveFeedLoader4 = this.f15620u;
        C87412m.m108591d(nearbyLiveFeedLoader4);
        ArrayList arrayList = new ArrayList(nearbyLiveFeedLoader4.getDataListJustForAdapter());
        Iterator it = arrayList.iterator();
        int i6 = 0;
        while (true) {
            if (!it.hasNext()) {
                i6 = -1;
                break;
            }
            C0740i2 i2Var = (C0740i2) it.next();
            Iterator it4 = it;
            if ((i2Var instanceof C0784u1) && ((C0784u1) i2Var).f1835e > i5) {
                break;
            }
            i6++;
            it = it4;
        }
        String str3 = " lastBuffer:";
        LinkedList linkedList2 = new LinkedList(arrayList.subList(0, i5));
        LinkedList linkedList3 = (i6 == -1 || i6 >= arrayList.size()) ? new LinkedList() : new LinkedList(arrayList.subList(i6, arrayList.size()));
        if (i5 == -1 || i6 == -1 || i6 >= arrayList.size() || i6 <= i5) {
            i = size;
            linkedList = (i5 == -1 || i6 != -1 || i5 >= arrayList.size()) ? new LinkedList() : new LinkedList(arrayList.subList(i5, arrayList.size()));
        } else {
            i = size;
            linkedList = new LinkedList(arrayList.subList(i5, i6));
        }
        k9Var.f30389f = new LinkedList<>();
        Iterator it5 = linkedList.iterator();
        while (it5.hasNext()) {
            Iterator it6 = it5;
            C0740i2 i2Var2 = (C0740i2) it5.next();
            String str4 = str;
            if (i2Var2 instanceof BaseFinderFeed) {
                k9Var.f30389f.add(i2Var2);
            }
            it5 = it6;
            str = str4;
        }
        String str5 = str;
        C9311g2 g2Var = C9311g2.f29093a;
        String b = g2Var.mo10063b(linkedList2);
        String b2 = g2Var.mo10063b(linkedList);
        String b3 = g2Var.mo10063b(linkedList3);
        String b4 = g2Var.mo10063b(arrayList);
        Log.m105924i("Finder.NearbyLivePresenter", "onFinishing moreFollowCardIndex:" + i5 + " moreRecommendDividerIndex:" + i6 + " beforeFollowDataListStr:" + b + " followDataListStr:" + b2 + " recommendDataListStr:" + b3 + " dataListStr:" + b4);
        arrayList.clear();
        arrayList.addAll(linkedList2);
        arrayList.add(k9Var);
        arrayList.addAll(linkedList3);
        C11759w.m11458i3(this.f15615p, j0, 0, 0, arrayList, (ArrayList) null, this.f15618s, false, i4, 80, (Object) null);
        Log.m105924i("Finder.NearbyLivePresenter", "[onFinishing] memoryCacheFlag:" + j0 + " enableFoldFollowData:" + this.f15624y + " position:" + 0 + " offset:" + 0 + str5 + i + str3 + this.f15618s);
    }

    /* renamed from: N */
    public int mo3573N() {
        C51942x91 x912 = this.f15612j;
        if (x912 == null) {
            return getCommentScene() + mo3580f0() + 1005000;
        }
        return x912.f144531d + 1005000 + getCommentScene();
    }

    /* renamed from: N0 */
    public void mo3574N0() {
        this.f15603E = true;
        Log.m105924i("Finder.NearbyLivePresenter", "onStart memoryCacheFlag:" + mo3582j0());
        if (!this.f15604F) {
            mo3596x();
        }
        C62381d dVar = this.f15619t;
        if (dVar != null && !dVar.f177296l) {
            mo3583n(this.f15604F, "onStart");
        }
        this.f15604F = false;
    }

    /* renamed from: S0 */
    public void mo3575S0() {
        this.f15603E = false;
        Log.m105924i("Finder.NearbyLivePresenter", "onStop memoryCacheFlag:" + mo3582j0());
        C62381d dVar = this.f15619t;
        if (dVar != null) {
            dVar.mo87435n();
        }
        C62381d dVar2 = this.f15619t;
        if (dVar2 != null) {
            dVar2.mo11214a();
        }
        mo3594t();
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [rx3.b0] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: T0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3576T0() {
        /*
            r14 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onUserVisibleFocused memoryCacheFlag:"
            r0.append(r1)
            int r1 = r14.mo3582j0()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "Finder.NearbyLivePresenter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r0)
            r0 = 1
            r14.f15601C = r0
            nn1.b$a r2 = nn1.C11233b.f33100i
            int r3 = r14.mo3582j0()
            nn1.b r2 = r2.mo11311a(r3)
            long r3 = java.lang.System.currentTimeMillis()
            r2.f33103b = r3
            boolean r2 = r14.f15602D
            r3 = 0
            if (r2 == 0) goto L_0x0145
            mm1.a r2 = mm1.C10934a.f32583a
            te3.x91 r4 = r14.f15612j
            int r5 = r14.getCommentScene()
            java.lang.String r6 = "requestFirstPage"
            boolean r2 = r2.mo11132a(r6, r4, r5)
            r4 = 88889(0x15b39, float:1.2456E-40)
            if (r2 == 0) goto L_0x0095
            te3.x91 r2 = r14.f15612j
            if (r2 == 0) goto L_0x004f
            int r2 = r2.f144531d
            if (r2 != r4) goto L_0x004f
            r2 = 1
            goto L_0x0050
        L_0x004f:
            r2 = 0
        L_0x0050:
            if (r2 == 0) goto L_0x0081
            java.lang.Class<bh3.k> r2 = bh3.C113177k.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            bh3.k r2 = (bh3.C113177k) r2
            bh3.k$b r4 = bh3.C113177k.C113179b.LOCAION
            bh3.k$a r5 = bh3.C113177k.C113178a.LIVE
            lm1.i r6 = new lm1.i
            r6.<init>(r14)
            boolean r2 = r2.mo165712hg(r4, r5, r6)
            if (r2 == 0) goto L_0x0081
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "checkTryRequestFirstPageAgain return for permission:"
            r2.append(r4)
            boolean r4 = r14.f15605G
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
            goto L_0x0145
        L_0x0081:
            com.tencent.mm.plugin.finder.nearby.live.NearbyLiveFeedLoader r1 = r14.f15620u
            gy3.C87412m.m108591d(r1)
            int r2 = r14.mo3582j0()
            int r4 = r14.mo3573N()
            te3.x91 r5 = r14.f15612j
            r1.mo3561e(r2, r4, r5)
            goto L_0x0145
        L_0x0095:
            com.tencent.mm.view.RefreshLoadMoreLayout$c r2 = new com.tencent.mm.view.RefreshLoadMoreLayout$c
            r2.<init>(r3)
            r5 = -2
            r2.f24947b = r5
            r14.mo3590q(r2)
            te3.x91 r2 = r14.f15612j
            if (r2 == 0) goto L_0x00aa
            int r2 = r2.f144531d
            if (r2 != r4) goto L_0x00aa
            r2 = 1
            goto L_0x00ab
        L_0x00aa:
            r2 = 0
        L_0x00ab:
            if (r2 == 0) goto L_0x0145
            java.lang.Class<aw.d> r2 = p447aw.C103918d.class
            f40.o r4 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r4 = r4.mo121142i()
            r5 = 274436(0x43004, float:3.84567E-40)
            java.lang.String r6 = ""
            java.lang.Object r4 = r4.mo119684e(r5, r6)
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.String"
            gy3.C87412m.m108592e(r4, r5)
            java.lang.String r4 = (java.lang.String) r4
            boolean r4 = nc0.C76850a.m92639k(r4)
            java.lang.String r5 = "android.permission.ACCESS_FINE_LOCATION"
            if (r4 == 0) goto L_0x011a
            di3.d r4 = di3.C86312j.m106911c(r2)
            aw.d r4 = (p447aw.C103918d) r4
            com.tencent.mm.ui.MMActivity r6 = r14.f15606d
            boolean r4 = r4.Lb0(r6, r5)
            if (r4 != 0) goto L_0x0131
            f40.o r6 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r6 = r6.mo121142i()
            com.tencent.mm.storage.y1$a r7 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC
            boolean r6 = r6.mo119686g(r7, r3)
            if (r6 != 0) goto L_0x010c
            java.lang.Class<zl.g> r2 = p286zl.C16292g.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            zl.g r2 = (p286zl.C16292g) r2
            com.tencent.mm.ui.MMActivity r5 = r14.f15606d
            r6 = 2131832233(0x7f112da9, float:1.9297514E38)
            java.lang.Object[] r7 = new java.lang.Object[r0]
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()
            r7[r3] = r8
            java.lang.String r6 = r5.getString(r6, r7)
            r7 = 30764(0x782c, float:4.311E-41)
            r2.nr0(r5, r6, r7, r0)
            goto L_0x0131
        L_0x010c:
            di3.d r2 = di3.C86312j.m106911c(r2)
            aw.d r2 = (p447aw.C103918d) r2
            com.tencent.mm.ui.MMActivity r6 = r14.f15606d
            r7 = 153(0x99, float:2.14E-43)
            r2.mo125790zt(r6, r5, r7)
            goto L_0x0131
        L_0x011a:
            di3.d r2 = di3.C86312j.m106911c(r2)
            r6 = r2
            aw.d r6 = (p447aw.C103918d) r6
            com.tencent.mm.ui.MMActivity r7 = r14.f15606d
            java.lang.String r2 = "android.permission.ACCESS_COARSE_LOCATION"
            java.lang.String[] r8 = new java.lang.String[]{r5, r2}
            r9 = 153(0x99, float:2.14E-43)
            r10 = 0
            r11 = 0
            boolean r4 = r6.Uu0(r7, r8, r9, r10, r11)
        L_0x0131:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "requestLocationPermission checkLocation:"
            r2.append(r5)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
        L_0x0145:
            boolean r1 = r14.f15602D
            if (r1 != 0) goto L_0x014c
            r14.mo3596x()
        L_0x014c:
            pm1.d r1 = r14.f15619t
            if (r1 == 0) goto L_0x015a
            r1.f177297m = r0
            java.lang.String r1 = "NearbyLiveAutoPlayManager"
            java.lang.String r2 = "setIsOnUserVisibleFocused: true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r2)
        L_0x015a:
            hn1.b r1 = hn1.C8614b.f27717a
            te3.hj1 r2 = r14.f15607e
            te3.x91 r4 = r14.f15612j
            r1.getClass()
            java.lang.String r5 = "contextObj"
            gy3.C87412m.m108594g(r2, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "onEnterLiveSquareTabPage tab:["
            r5.append(r6)
            r6 = 0
            if (r4 == 0) goto L_0x017c
            int r7 = r4.f144531d
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x017d
        L_0x017c:
            r7 = r6
        L_0x017d:
            r5.append(r7)
            java.lang.String r7 = ", "
            r5.append(r7)
            if (r4 == 0) goto L_0x018a
            java.lang.String r7 = r4.f144532e
            goto L_0x018b
        L_0x018a:
            r7 = r6
        L_0x018b:
            r5.append(r7)
            r7 = 93
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r7 = "NearbyPreloadManager"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            boolean r5 = r1.mo9477b()
            if (r5 != 0) goto L_0x01bc
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "onEnterLiveSquareTabPage return for enableNearbyLivePagesPreload:"
            r0.append(r2)
            boolean r1 = r1.mo9477b()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
            goto L_0x0258
        L_0x01bc:
            if (r4 == 0) goto L_0x0251
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r8 = "onEnterLiveSquareTabPage startPreload preTab:"
            r5.append(r8)
            boolean r8 = r4.f144535h
            r5.append(r8)
            java.lang.String r8 = " nextTab:"
            r5.append(r8)
            boolean r8 = r4.f144534g
            r5.append(r8)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r7, r5)
            boolean r5 = r4.f144534g
            r8 = -1
            if (r5 == 0) goto L_0x0215
            java.util.LinkedList<te3.x91> r5 = hn1.C8614b.f27720d
            int r9 = r5.size()
            r10 = 0
            r11 = -1
        L_0x01eb:
            if (r10 >= r9) goto L_0x01fd
            int r12 = r4.f144531d
            java.lang.Object r13 = r5.get(r10)
            te3.x91 r13 = (te3.C51942x91) r13
            int r13 = r13.f144531d
            if (r12 != r13) goto L_0x01fa
            r11 = r10
        L_0x01fa:
            int r10 = r10 + 1
            goto L_0x01eb
        L_0x01fd:
            int r11 = r11 + r0
            if (r11 < 0) goto L_0x020d
            int r0 = r5.size()
            if (r11 >= r0) goto L_0x020d
            java.lang.Object r0 = r5.get(r11)
            te3.x91 r0 = (te3.C51942x91) r0
            goto L_0x020e
        L_0x020d:
            r0 = r6
        L_0x020e:
            r5 = 14
            java.lang.String r9 = "preloadNextTab"
            r1.mo9484i(r2, r0, r5, r9)
        L_0x0215:
            boolean r0 = r4.f144535h
            if (r0 == 0) goto L_0x024f
            hn1.b r0 = hn1.C8614b.f27717a
            java.util.LinkedList<te3.x91> r1 = hn1.C8614b.f27720d
            r0.getClass()
            int r5 = r1.size()
            r9 = 0
            r10 = -1
        L_0x0226:
            if (r9 >= r5) goto L_0x0238
            int r11 = r4.f144531d
            java.lang.Object r12 = r1.get(r9)
            te3.x91 r12 = (te3.C51942x91) r12
            int r12 = r12.f144531d
            if (r11 != r12) goto L_0x0235
            r10 = r9
        L_0x0235:
            int r9 = r9 + 1
            goto L_0x0226
        L_0x0238:
            int r10 = r10 + r8
            if (r10 < 0) goto L_0x0248
            int r4 = r1.size()
            if (r10 >= r4) goto L_0x0248
            java.lang.Object r1 = r1.get(r10)
            r6 = r1
            te3.x91 r6 = (te3.C51942x91) r6
        L_0x0248:
            r1 = 15
            java.lang.String r4 = "preloadPreTab"
            r0.mo9484i(r2, r6, r1, r4)
        L_0x024f:
            rx3.b0 r6 = rx3.C13598b0.f38549a
        L_0x0251:
            if (r6 != 0) goto L_0x0258
            java.lang.String r0 = "onEnterLiveSquareTabPage return for null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r7, r0)
        L_0x0258:
            boolean r0 = r14.f15602D
            java.lang.String r1 = "onUserVisibleFocused"
            r14.mo3583n(r0, r1)
            r14.f15602D = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.live.NearbyLivePresenter.mo3576T0():void");
    }

    /* renamed from: W0 */
    public void mo3577W0() {
        Log.m105924i("Finder.NearbyLivePresenter", "onUserVisibleUnFocused memoryCacheFlag:" + mo3582j0());
        this.f15601C = false;
        C62381d dVar = this.f15619t;
        if (dVar != null) {
            dVar.f177297m = false;
            Log.m105924i("NearbyLiveAutoPlayManager", "setIsOnUserVisibleFocused: false");
        }
        C62381d dVar2 = this.f15619t;
        if (dVar2 != null) {
            dVar2.mo87435n();
        }
        C62381d dVar3 = this.f15619t;
        if (dVar3 != null) {
            dVar3.mo11214a();
        }
    }

    /* renamed from: a1 */
    public final void mo3578a1(int i, long j, C89349b bVar) {
        String str;
        C21445b bVar2 = C21445b.f60694a;
        int s3 = mo3593s3();
        C51942x91 x912 = this.f15612j;
        if (x912 == null || (str = x912.f144532e) == null) {
            str = "";
        }
        bVar2.mo33622k(i, s3, str);
        NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f15620u;
        C87412m.m108591d(nearbyLiveFeedLoader);
        nearbyLiveFeedLoader.mo3562f(this.f15612j, i, bVar, this.f15610h, j);
    }

    /* renamed from: e */
    public void mo3579e(long j, boolean z) {
        C11235c.f33110a.mo12482c("startFetchLives");
        WxRefreshLayout c = mo3584n0().mo10817c();
        if (c != null) {
            c.postDelayed(new C3290a(c), j);
        }
        Fragment fragment = this.f15611i;
        if (fragment != null && fragment.getParentFragment() != null) {
            C39818r rVar = C39818r.f106831a;
            Fragment fragment2 = this.f15611i;
            C87412m.m108591d(fragment2);
            Fragment parentFragment = fragment2.getParentFragment();
            C87412m.m108591d(parentFragment);
            if (((NearbyLiveSquareUIC) rVar.mo62445d(parentFragment).mo75002a(NearbyLiveSquareUIC.class)).mo3606e3() != 0) {
                C21445b.f60694a.mo33620i(false, false);
            }
        }
    }

    /* renamed from: f0 */
    public int mo3580f0() {
        return 15;
    }

    public int getCommentScene() {
        return 76;
    }

    /* renamed from: j0 */
    public int mo3582j0() {
        C51942x91 x912 = this.f15612j;
        if (x912 == null) {
            return getCommentScene() + mo3580f0() + 1005000;
        }
        return x912.f144531d + 1005000 + getCommentScene();
    }

    /* renamed from: n */
    public final void mo3583n(boolean z, String str) {
        if (z && this.f15615p.mo11637f3(mo3582j0())) {
            Log.m105928w("Finder.NearbyLivePresenter", "checkAutoPlay " + str + " return for checkCache:" + z + " memoryCacheFlag:" + mo3582j0());
        } else if (!this.f15603E) {
            Log.m105924i("Finder.NearbyLivePresenter", "checkAutoPlay " + str + " return for isOnResume:" + this.f15603E + " memoryCacheFlag:" + mo3582j0());
        } else if (!this.f15601C) {
            Log.m105924i("Finder.NearbyLivePresenter", "checkAutoPlay " + str + " return for isOnUserVisibleFocused:" + this.f15601C + " memoryCacheFlag:" + mo3582j0());
        } else {
            Log.m105924i("Finder.NearbyLivePresenter", "checkAutoPlay " + str + " memoryCacheFlag:" + mo3582j0());
            C62381d dVar = this.f15619t;
            if (dVar != null) {
                dVar.mo11215b();
            }
        }
    }

    /* renamed from: n0 */
    public final C10545c<C0740i2> mo3584n0() {
        C10545c<C0740i2> cVar = this.f15614o;
        if (cVar != null) {
            return cVar;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    public void onDetach() {
        ((C12005b) C86312j.m106911c(C12005b.class)).mo11147wX(false);
        this.f15625z.dead();
        this.f15599A.dead();
        this.f15622w.dead();
        NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f15620u;
        if (nearbyLiveFeedLoader != null) {
            nearbyLiveFeedLoader.unregister(this.f15621v);
        }
        NearbyLiveFeedLoader nearbyLiveFeedLoader2 = this.f15620u;
        C87412m.m108591d(nearbyLiveFeedLoader2);
        if (nearbyLiveFeedLoader2.getDataListJustForAdapter().size() > 0) {
            ((C11759w) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11759w.class)).mo11638g3(mo3582j0());
        }
        C62381d dVar = this.f15619t;
        if (dVar != null) {
            dVar.detach();
        }
    }

    public void onLoadMore() {
        C10364a aVar = this.f15616q;
        boolean z = true;
        if (aVar == null || !aVar.f31560h) {
            z = false;
        }
        if (z) {
            Log.m105924i("Finder.NearbyLivePresenter", "onLoadMore return for is preloading.");
            return;
        }
        Log.m105924i("Finder.NearbyLivePresenter", "onLoadMore.");
        NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f15620u;
        if (nearbyLiveFeedLoader != null) {
            nearbyLiveFeedLoader.requestLoadMore(this.f15612j);
        }
    }

    public void onRefresh() {
        C51942x91 x912 = this.f15612j;
        boolean z = false;
        if (x912 != null && x912.f144531d == 88889) {
            z = true;
        }
        if (!z) {
            requestRefresh();
        } else if (!((C113177k) C86312j.m106911c(C113177k.class)).mo165712hg(C113177k.C113179b.LOCAION, C113177k.C113178a.LIVE, new C3295f(this))) {
            mo3589p1();
        }
    }

    public void onRefreshEnd(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        WxRefreshLayout c;
        WxRefreshLayout c2;
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        C11235c.f33110a.mo11310b("onRefreshEnd");
        C11233b a = C11233b.f33100i.mo11311a(mo3582j0());
        a.f33109h = System.currentTimeMillis();
        Log.m105924i("NearbyTimeConsumingHelper-" + a.f33102a, "onVisible->onRefreshEnd:" + (a.f33109h - a.f33103b) + " \nonAttach->startFetch:" + (a.f33104c - a.f33103b) + " \nstartFetch->startCgi:" + (a.f33105d - a.f33104c) + " \nstartCgi->onCgiBack:" + (a.f33106e - a.f33105d) + " \nonCgiBack->onFetchDone:" + (a.f33107f - a.f33106e) + " \nonFetchDone->onViewUpdate:" + (a.f33108g - a.f33107f) + " \nonViewUpdate->onRefreshEnd:" + (a.f33109h - a.f33108g));
        a.f33103b = 0;
        a.f33104c = 0;
        a.f33105d = 0;
        a.f33106e = 0;
        a.f33107f = 0;
        a.f33108g = 0;
        a.f33109h = 0;
        if (cVar.f24953h <= 0 && (c2 = mo3584n0().mo10817c()) != null) {
            c2.mo26605m();
        }
        if (cVar.f24951f && (c = mo3584n0().mo10817c()) != null) {
            c.mo26642z(false);
        }
        mo3590q(cVar);
        mo3568G("onRefreshEnd");
        C10364a aVar = this.f15616q;
        if (aVar != null) {
            aVar.f31562j = false;
        }
        if (aVar != null) {
            aVar.mo10671a(cVar.f24951f);
        }
        mo3583n(false, "onRefreshEnd");
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [androidx.fragment.app.Fragment] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        if ((java.lang.System.currentTimeMillis() - r0.f34448b > ((long) oe1.C35152b.f94276d.mo60266n().intValue())) != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0032, code lost:
        if (r0 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (r0 == null) goto L_0x003d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3588p0(te3.C51942x91 r10) {
        /*
            r9 = this;
            te3.x91 r0 = r9.f15612j
            if (r0 == 0) goto L_0x00ae
            if (r10 == 0) goto L_0x00ae
            bl3.r r1 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r1 = r1.mo62446e(r2)
            java.lang.Class<os1.w> r2 = os1.C11759w.class
            androidx.lifecycle.i0 r1 = r1.mo75002a(r2)
            java.lang.String r2 = "UICProvider.of(FinderCom…eloadCacheVM::class.java)"
            gy3.C87412m.m108593f(r1, r2)
            os1.w r1 = (os1.C11759w) r1
            java.util.LinkedList<te3.x91> r2 = r0.f144537j
            r2.clear()
            int r2 = r10.f144531d
            int r3 = r0.f144531d
            java.lang.String r4 = ""
            r5 = 0
            if (r2 == r3) goto L_0x0037
            java.util.LinkedList<te3.x91> r2 = r0.f144537j
            r2.add(r10)
            java.lang.String r0 = r1.mo11634c3(r0, r10)
            if (r0 != 0) goto L_0x0035
            goto L_0x003d
        L_0x0035:
            r4 = r0
            goto L_0x003d
        L_0x0037:
            java.lang.String r0 = r1.mo11634c3(r0, r5)
            if (r0 != 0) goto L_0x0035
        L_0x003d:
            pm1.d r0 = r9.f15619t
            if (r0 == 0) goto L_0x0044
            r0.mo87435n()
        L_0x0044:
            pm1.d r0 = r9.f15619t
            if (r0 == 0) goto L_0x004b
            r0.mo11214a()
        L_0x004b:
            lm1.c r0 = r9.mo3584n0()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r0.mo10815A(r2)
            java.util.HashMap<java.lang.String, os1.w$d> r0 = r1.f34427h
            java.lang.Object r0 = r0.get(r4)
            os1.w$d r0 = (os1.C11759w.C11763d) r0
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0080
            long r3 = java.lang.System.currentTimeMillis()
            long r6 = r0.f34448b
            long r3 = r3 - r6
            pe1.c<java.lang.Integer> r6 = oe1.C35152b.f94276d
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            long r6 = (long) r6
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x007d
            r3 = 1
            goto L_0x007e
        L_0x007d:
            r3 = 0
        L_0x007e:
            if (r3 == 0) goto L_0x0081
        L_0x0080:
            r0 = r5
        L_0x0081:
            if (r0 == 0) goto L_0x009b
            java.util.ArrayList<cm1.i2> r3 = r0.f34447a
            if (r3 == 0) goto L_0x008f
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x008e
            goto L_0x008f
        L_0x008e:
            r1 = 0
        L_0x008f:
            if (r1 != 0) goto L_0x009b
            lm1.c r1 = r9.mo3584n0()
            java.util.ArrayList<cm1.i2> r0 = r0.f34447a
            r1.mo10815A(r0)
            goto L_0x00a0
        L_0x009b:
            r0 = 0
            r9.mo3579e(r0, r2)
        L_0x00a0:
            androidx.fragment.app.Fragment r0 = r9.f15611i
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment
            if (r1 == 0) goto L_0x00a9
            r5 = r0
            com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment r5 = (com.tencent.p014mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) r5
        L_0x00a9:
            if (r5 != 0) goto L_0x00ac
            goto L_0x00ae
        L_0x00ac:
            r5.f15691s = r10
        L_0x00ae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.nearby.live.NearbyLivePresenter.mo3588p0(te3.x91):void");
    }

    /* renamed from: p1 */
    public final void mo3589p1() {
        C3296g gVar = new C3296g(this);
        C3297h hVar = new C3297h(this);
        C3298i iVar = new C3298i(this);
        C8014g gVar2 = (C8014g) C39818r.f106831a.mo62446e(C60200t1.class).mo62447c(C8014g.class);
        if (!gVar2.mo9103H()) {
            gVar.invoke();
            return;
        }
        C37521f.f99374d.getClass();
        if (C31543z5.m39451a() - gVar2.mo9106t1() < ((long) C37521f.f99296U)) {
            iVar.invoke();
        } else {
            hVar.invoke();
        }
    }

    /* renamed from: q */
    public final void mo3590q(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        C61926c.m72668M(new C3291b(cVar, this));
    }

    /* renamed from: q0 */
    public void mo3591q0(C9833k9 k9Var) {
        C9833k9 k9Var2 = k9Var;
        C87412m.m108594g(k9Var2, "finderStreamCard");
        Log.m105924i("Finder.NearbyLivePresenter", "onLoadMoreFollowFeed.");
        NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f15620u;
        if (nearbyLiveFeedLoader != null) {
            C51942x91 x912 = this.f15612j;
            if (nearbyLiveFeedLoader.f15543t) {
                Log.m105924i(nearbyLiveFeedLoader.getTAG(), "requestMoreFollowFeed return for isFetchingLoadMore");
                nearbyLiveFeedLoader.f15545v.mo3563b("requestMoreFollowFeed");
            }
            String tag = nearbyLiveFeedLoader.getTAG();
            Log.m105924i(tag, "requestMoreFollowFeed pos:" + k9Var2.f30391h + " continueAtTheEnd:" + k9Var2.f30387d.f184850q + " rvFeedList:" + k9Var2.f30389f.size());
            nearbyLiveFeedLoader.f15546w = k9Var2;
            NearbyLiveFeedLoader.C3278d dVar = new NearbyLiveFeedLoader.C3278d(0, 0, "LOCAL_OK", (C49599gr0) null, 0, 24, (C8480h) null);
            dVar.setIncrementList(new LinkedList(k9Var2.f30389f));
            dVar.setPullType(2);
            dVar.setLastBuffer(nearbyLiveFeedLoader.f15538o);
            dVar.setHasMore(k9Var2.f30387d.f184850q);
            NearbyLiveFeedLoader.C3278d dVar2 = dVar;
            dVar2.setRequest(new NearbyLiveFeedLoader.C3277c(2, x912, nearbyLiveFeedLoader.f15538o, nearbyLiveFeedLoader.f15536j, nearbyLiveFeedLoader.f15531e, nearbyLiveFeedLoader.f15530d, nearbyLiveFeedLoader.f15532f, 1, 0, 256, (C8480h) null));
            nearbyLiveFeedLoader.f15543t = true;
            nearbyLiveFeedLoader.onFetchDone(dVar2);
        }
    }

    public final void requestRefresh() {
        C51942x91 x912 = this.f15612j;
        if (!(x912 != null && x912.f144531d == 88889) || ((C113177k) C86312j.m106911c(C113177k.class)).w00(C113177k.C113179b.LOCAION, C113177k.C113178a.LIVE)) {
            Log.m105924i("Finder.NearbyLivePresenter", "requestRefresh");
            mo3578a1(this.f15609g, 0, this.f15613n);
            this.f15609g = 1;
            this.f15610h = false;
            this.f15613n = null;
            C10364a aVar = this.f15616q;
            if (aVar != null) {
                aVar.f31562j = true;
                return;
            }
            return;
        }
        Log.m105924i("Finder.NearbyLivePresenter", "business switch close");
        mo3595u0();
    }

    /* renamed from: s3 */
    public int mo3593s3() {
        return 1001;
    }

    /* renamed from: t */
    public final void mo3594t() {
        this.f15605G = C10934a.f32583a.mo11132a("checkOnPauseDataIsEmpty", this.f15612j, getCommentScene()) && ((C113177k) C86312j.m106911c(C113177k.class)).w00(C113177k.C113179b.LOCAION, C113177k.C113178a.LIVE);
    }

    /* renamed from: u0 */
    public final void mo3595u0() {
        WxRefreshLayout c = mo3584n0().mo10817c();
        if (c != null) {
            c.postDelayed(new C3293d(this), 200);
        }
    }

    /* renamed from: x */
    public final void mo3596x() {
        if (!this.f15603E) {
            Log.m105924i("Finder.NearbyLivePresenter", "shouldTryRequestFirstPageAgain return for isOnResume:" + this.f15603E + " memoryCacheFlag:" + mo3582j0());
        } else if (!this.f15601C) {
            Log.m105924i("Finder.NearbyLivePresenter", "shouldTryRequestFirstPageAgain return for isOnUserVisibleFocused:" + this.f15601C + " memoryCacheFlag:" + mo3582j0());
        } else if (this.f15605G) {
            Log.m105924i("Finder.NearbyLivePresenter", "shouldTryRequestFirstPageAgain return for lastOnPauseHasPermission:" + this.f15605G);
        } else if (!C10934a.f32583a.mo11132a("requestFirstPage", this.f15612j, getCommentScene())) {
            Log.m105924i("Finder.NearbyLivePresenter", "shouldTryRequestFirstPageAgain return for canLoadNearbyCityFeeds.");
        } else {
            C51942x91 x912 = this.f15612j;
            boolean z = false;
            if (x912 != null && x912.f144531d == 88889) {
                z = true;
            }
            if (!z || !((C113177k) C86312j.m106911c(C113177k.class)).mo165712hg(C113177k.C113179b.LOCAION, C113177k.C113178a.LIVE, new C3292c(this))) {
                StringBuilder sb = new StringBuilder();
                sb.append("shouldTryRequestFirstPageAgain requestInit tab:");
                C51942x91 x913 = this.f15612j;
                sb.append(x913 != null ? Integer.valueOf(x913.f144531d) : null);
                sb.append('-');
                C51942x91 x914 = this.f15612j;
                sb.append(x914 != null ? x914.f144532e : null);
                Log.m105924i("Finder.NearbyLivePresenter", sb.toString());
                mo3590q((RefreshLoadMoreLayout.C7080c<Object>) null);
                NearbyLiveFeedLoader nearbyLiveFeedLoader = this.f15620u;
                C87412m.m108591d(nearbyLiveFeedLoader);
                nearbyLiveFeedLoader.mo3561e(mo3582j0(), mo3573N(), this.f15612j);
                return;
            }
            Log.m105924i("Finder.NearbyLivePresenter", "checkTryRequestFirstPageAgain return for permission:" + this.f15605G);
        }
    }
}
