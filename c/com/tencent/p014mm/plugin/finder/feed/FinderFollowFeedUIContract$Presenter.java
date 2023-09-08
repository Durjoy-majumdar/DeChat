package com.tencent.p014mm.plugin.finder.feed;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl3.C39818r;
import cm1.C0740i2;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.plugin.finder.feed.model.BaseFinderFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.FinderTimelineFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.DataBuffer;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.view.manager.FinderStaggeredGridLayoutManager;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import di3.C86312j;
import dp1.C20480e0;
import dp1.C58417y0;
import ef1.C58556f;
import er1.C58784w3;
import er1.C7868s3;
import er1.C7879t1;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import jq3.C60896i;
import jq3.C60898l;
import jq3.C60905o;
import jq3.C9493c;
import jq3.C9500j;
import k20.C60958c;
import k20.C9556a;
import kf1.C9732g;
import kf1.C9753h;
import kf1.C9905o2;
import mf1.C10811d1;
import ns3.C11264b;
import ns3.C11266d;
import o40.C61926c;
import os1.C11739f;
import p204mr.C11078h;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C36570n;
import sx3.C110818d0;
import te3.C49712hj1;
import tf1.C13913l;
import up1.C14367u0;
import up1.C37521f;
import ve1.C14443a1;
import ve1.C14590p;

/* renamed from: com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter */
public final class FinderFollowFeedUIContract$Presenter extends C9732g {

    /* renamed from: h */
    public final C11739f f13045h;

    /* renamed from: i */
    public int f13046i;

    /* renamed from: j */
    public boolean f13047j;

    /* renamed from: n */
    public C11739f.C11740a f13048n;

    /* renamed from: o */
    public C60898l.C60899a f13049o;

    /* renamed from: p */
    public C60898l.C60899a f13050p;

    /* renamed from: q */
    public final ConcurrentHashMap<String, RefreshLoadMoreLayout.C7080c<Object>> f13051q;

    /* renamed from: r */
    public C11078h f13052r;

    /* renamed from: s */
    public final FinderFollowFeedUIContract$Presenter$feedProgressListener$1 f13053s;

    /* renamed from: t */
    public final FinderFollowFeedUIContract$Presenter$autoRefreshEventListener$1 f13054t;

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$a */
    public static final class C2505a implements C13913l {

        /* renamed from: a */
        public final /* synthetic */ FinderHomeTabFragment f13056a;

        /* renamed from: b */
        public final /* synthetic */ BaseFinderFeedLoader f13057b;

        /* renamed from: c */
        public final /* synthetic */ FinderFollowFeedUIContract$Presenter f13058c;

        /* renamed from: d */
        public final /* synthetic */ int f13059d;

        /* renamed from: com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$a$a */
        public static final class C2506a extends C87413o implements C32224a<C13598b0> {

            /* renamed from: d */
            public final /* synthetic */ FinderFollowFeedUIContract$Presenter f13060d;

            /* renamed from: e */
            public final /* synthetic */ BaseFinderFeedLoader f13061e;

            /* renamed from: f */
            public final /* synthetic */ int f13062f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C2506a(FinderFollowFeedUIContract$Presenter finderFollowFeedUIContract$Presenter, BaseFinderFeedLoader baseFinderFeedLoader, int i) {
                super(0);
                this.f13060d = finderFollowFeedUIContract$Presenter;
                this.f13061e = baseFinderFeedLoader;
                this.f13062f = i;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:2:0x0007, code lost:
                r0 = r0.getRecyclerView();
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.Object invoke() {
                /*
                    r14 = this;
                    com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter r0 = r14.f13060d
                    kf1.h r0 = r0.f30176f
                    r1 = 0
                    if (r0 == 0) goto L_0x0012
                    androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
                    if (r0 == 0) goto L_0x0012
                    androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
                    goto L_0x0013
                L_0x0012:
                    r0 = r1
                L_0x0013:
                    java.lang.String r2 = "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager"
                    gy3.C87412m.m108592e(r0, r2)
                    androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
                    com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter r2 = r14.f13060d
                    os1.f$a r3 = r2.f13048n
                    if (r3 == 0) goto L_0x00df
                    com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r4 = r14.f13061e
                    int r5 = r14.f13062f
                    kf1.h r6 = r2.f30176f
                    if (r6 == 0) goto L_0x0032
                    androidx.recyclerview.widget.RecyclerView r6 = r6.getRecyclerView()
                    if (r6 == 0) goto L_0x0032
                    androidx.recyclerview.widget.RecyclerView$e r1 = r6.getAdapter()
                L_0x0032:
                    java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.view.recyclerview.RecyclerViewAdapterEx<@[FlexibleNullability] androidx.recyclerview.widget.RecyclerView.ViewHolder?>"
                    gy3.C87412m.m108592e(r1, r6)
                    jq3.l r1 = (jq3.C60898l) r1
                    int r6 = r3.f34371d
                    int r1 = r1.mo85796c6()
                    int r1 = r1 + r6
                    int r11 = r3.f34372e
                    java.lang.String r3 = r4.getTAG()
                    java.lang.StringBuilder r4 = new java.lang.StringBuilder
                    r4.<init>()
                    java.lang.String r6 = "TimelineInit initdone canTimelineRefresh tabType="
                    r4.append(r6)
                    r4.append(r5)
                    r5 = 32
                    r4.append(r5)
                    boolean r5 = r2.f13047j
                    r4.append(r5)
                    java.lang.String r5 = " lastPos:"
                    r4.append(r5)
                    r4.append(r1)
                    java.lang.String r5 = " fromTopPixel:"
                    r4.append(r5)
                    r4.append(r11)
                    java.lang.String r4 = r4.toString()
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r4)
                    r12 = 0
                    if (r1 <= 0) goto L_0x00ca
                    k20.a r13 = new k20.a
                    r13.<init>()
                    java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
                    r13.mo10233c(r3)
                    java.lang.Object[] r4 = r13.mo10232b()
                    java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$Presenter$3$1$call$1"
                    java.lang.String r6 = "invoke"
                    java.lang.String r7 = "()V"
                    java.lang.String r8 = "Undefined"
                    java.lang.String r9 = "scrollToPosition"
                    java.lang.String r10 = "(I)V"
                    r3 = r0
                    j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
                    java.lang.Object r3 = r13.mo10231a(r12)
                    java.lang.Integer r3 = (java.lang.Integer) r3
                    int r3 = r3.intValue()
                    r0.scrollToPosition(r3)
                    java.lang.String r4 = "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$Presenter$3$1$call$1"
                    java.lang.String r5 = "invoke"
                    java.lang.String r6 = "()V"
                    java.lang.String r7 = "Undefined"
                    java.lang.String r8 = "scrollToPosition"
                    java.lang.String r9 = "(I)V"
                    r3 = r0
                    j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
                    kf1.h r3 = r2.f30176f
                    if (r3 == 0) goto L_0x00ca
                    androidx.recyclerview.widget.RecyclerView r3 = r3.getRecyclerView()
                    if (r3 == 0) goto L_0x00ca
                    com.tencent.mm.plugin.finder.feed.i r4 = new com.tencent.mm.plugin.finder.feed.i
                    r4.<init>(r0, r1, r11)
                    r3.post(r4)
                L_0x00ca:
                    java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.view.RefreshLoadMoreLayout$c<java.lang.Object>> r0 = r2.f13051q
                    java.lang.String r1 = r2.mo2520n0()
                    java.lang.Object r0 = r0.get(r1)
                    com.tencent.mm.view.RefreshLoadMoreLayout$c r0 = (com.tencent.p014mm.view.RefreshLoadMoreLayout.C7080c) r0
                    if (r0 == 0) goto L_0x00df
                    boolean r1 = r0.f24951f
                    if (r1 != 0) goto L_0x00df
                    r2.mo2517f0(r0, r12)
                L_0x00df:
                    rx3.b0 r0 = rx3.C13598b0.f38549a
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter.C2505a.C2506a.invoke():java.lang.Object");
            }
        }

        public C2505a(FinderHomeTabFragment finderHomeTabFragment, BaseFinderFeedLoader baseFinderFeedLoader, FinderFollowFeedUIContract$Presenter finderFollowFeedUIContract$Presenter, int i) {
            this.f13056a = finderHomeTabFragment;
            this.f13057b = baseFinderFeedLoader;
            this.f13058c = finderFollowFeedUIContract$Presenter;
            this.f13059d = i;
        }

        public void call(int i) {
            Bundle bundle;
            FinderHomeTabFragment finderHomeTabFragment = this.f13056a;
            boolean z = true;
            if (finderHomeTabFragment == null || (bundle = finderHomeTabFragment.f17335p) == null || bundle.getInt("RequestScene", -1) != 1) {
                z = false;
            }
            if (z) {
                Log.m105924i(this.f13057b.getTAG(), "IInitDone come from hot card.");
            } else {
                C61926c.m72668M(new C2506a(this.f13058c, this.f13057b, this.f13059d));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$b */
    public static final class C2507b extends C87413o implements C32226l<Integer, C60896i<?>> {

        /* renamed from: d */
        public final /* synthetic */ FinderFollowFeedUIContract$Presenter f13063d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2507b(FinderFollowFeedUIContract$Presenter finderFollowFeedUIContract$Presenter) {
            super(1);
            this.f13063d = finderFollowFeedUIContract$Presenter;
        }

        public Object invoke(Object obj) {
            int intValue = ((Number) obj).intValue();
            if (intValue == -1) {
                C2652k kVar = new C2652k(this.f13063d);
                C37521f.f99374d.getClass();
                return new C14443a1(kVar, (C32224a) null, C37521f.f99322W7.mo60266n().intValue() == 0, 2, (C8480h) null);
            }
            C58784w3.f168295a.mo83916b("FinderFollowFeedUIContract", intValue);
            return new C14590p();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$c */
    public static final class C2508c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ StaggeredGridLayoutManager f13064d;

        public C2508c(StaggeredGridLayoutManager staggeredGridLayoutManager) {
            this.f13064d = staggeredGridLayoutManager;
        }

        public final void run() {
            StaggeredGridLayoutManager staggeredGridLayoutManager = this.f13064d;
            if (staggeredGridLayoutManager != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                aVar.mo10233c(0);
                C117292a.m165358d(staggeredGridLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$Presenter$checkAutoFlingToRefresh$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                staggeredGridLayoutManager.mo17414U(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$Presenter$checkAutoFlingToRefresh$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$d */
    public static final class C2509d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ WxRecyclerAdapter<?> f13065d;

        /* renamed from: e */
        public final /* synthetic */ FinderFollowFeedUIContract$Presenter f13066e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2509d(WxRecyclerAdapter<?> wxRecyclerAdapter, FinderFollowFeedUIContract$Presenter finderFollowFeedUIContract$Presenter) {
            super(0);
            this.f13065d = wxRecyclerAdapter;
            this.f13066e = finderFollowFeedUIContract$Presenter;
        }

        public Object invoke() {
            WxRecyclerAdapter<?> wxRecyclerAdapter = this.f13065d;
            if (wxRecyclerAdapter != null) {
                FinderFollowFeedUIContract$Presenter finderFollowFeedUIContract$Presenter = this.f13066e;
                C60898l.C60899a aVar = finderFollowFeedUIContract$Presenter.f13049o;
                C87412m.m108594g(aVar, "info");
                RefreshLoadMoreLayout refreshLoadMoreLayout = null;
                if (!wxRecyclerAdapter.f173486j.contains(aVar)) {
                    C60898l.m71326Q5(wxRecyclerAdapter, finderFollowFeedUIContract$Presenter.f13049o, false, 2, (Object) null);
                }
                C37521f.f99374d.getClass();
                Log.m105924i("FinderFollowFeedUIContract.Presenter", "[checkNoMoreFooter] EMPTY_FOOTER_IGNORE_CHECK=false");
                C9753h hVar = finderFollowFeedUIContract$Presenter.f30176f;
                if (hVar != null) {
                    refreshLoadMoreLayout = hVar.f30220j;
                }
                if (refreshLoadMoreLayout != null) {
                    refreshLoadMoreLayout.setEnableLoadMore(false);
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$e */
    public static final class C2510e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFollowFeedUIContract$Presenter f13067d;

        public C2510e(FinderFollowFeedUIContract$Presenter finderFollowFeedUIContract$Presenter) {
            this.f13067d = finderFollowFeedUIContract$Presenter;
        }

        public final void run() {
            C58556f j3;
            RecyclerView.C16615g gVar;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f13067d.f30174d);
            if (f != null && (j3 = f.mo12854j3(this.f13067d.f13046i)) != null && (gVar = j3.f167622p) != null) {
                gVar.mo2556b();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$f */
    public static final class C2511f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C2511f f13068d = new C2511f();

        public C2511f() {
            super(0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$g */
    public static final class C2512g implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderFollowFeedUIContract$Presenter f13069d;

        public C2512g(FinderFollowFeedUIContract$Presenter finderFollowFeedUIContract$Presenter) {
            this.f13069d = finderFollowFeedUIContract$Presenter;
        }

        public final void run() {
            C58556f j3;
            RecyclerView.C16615g gVar;
            C13442s8 f = C13442s8.f38060Q0.mo12873f(this.f13069d.f30174d);
            if (f != null && (j3 = f.mo12854j3(this.f13069d.f13046i)) != null && (gVar = j3.f167622p) != null) {
                gVar.mo2556b();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$h */
    public static final class C2513h extends C87413o implements C32226l<BaseFinderFeed, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ C9493c f13070d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2513h(C9493c cVar) {
            super(1);
            this.f13070d = cVar;
        }

        public Object invoke(Object obj) {
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) obj;
            C87412m.m108594g(baseFinderFeed, LocaleUtil.ITALIAN);
            return Boolean.valueOf(this.f13070d.getItemId() == baseFinderFeed.getItemId());
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$i */
    public static final class C2514i extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderFollowFeedUIContract$Presenter f13071d;

        /* renamed from: e */
        public final /* synthetic */ ArrayList<BaseFinderFeed> f13072e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C2514i(FinderFollowFeedUIContract$Presenter finderFollowFeedUIContract$Presenter, ArrayList<BaseFinderFeed> arrayList) {
            super(0);
            this.f13071d = finderFollowFeedUIContract$Presenter;
            this.f13072e = arrayList;
        }

        public Object invoke() {
            FinderFollowFeedUIContract$Presenter finderFollowFeedUIContract$Presenter = this.f13071d;
            int i = finderFollowFeedUIContract$Presenter.f13046i;
            MMActivity mMActivity = finderFollowFeedUIContract$Presenter.f30174d;
            C87412m.m108594g(mMActivity, "context");
            C13442s8 f = C13442s8.f38060Q0.mo12873f(mMActivity);
            if (f != null) {
                C49712hj1 q3 = f.mo12861q3();
                int i2 = f.f38091d;
                if (i == 1) {
                    C2483o0.f12984a.mo2457g(2, q3, i2, false);
                } else if (i == 3) {
                    C2483o0.f12984a.mo2456f(2, q3, i2, false);
                } else if (i == 4) {
                    C2483o0.f12984a.mo2459i(2, q3, i2, false);
                }
            }
            ((FinderTimelineFeedLoader) this.f13071d.f30175e).mo2803e(this.f13072e);
            return C13598b0.f38549a;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FinderFollowFeedUIContract$Presenter(com.tencent.p014mm.p136ui.MMActivity r22, int r23, int r24, com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment r25) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            r3 = r25
            java.lang.Class<os1.f> r4 = os1.C11739f.class
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r5 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            java.lang.String r6 = "context"
            gy3.C87412m.m108594g(r1, r6)
            tf1.i$a r6 = tf1.C13908i.f39090e
            tf1.i r9 = r6.mo13382a(r2)
            bl3.r r6 = bl3.C39818r.f106831a
            bl3.r$a r7 = r6.mo62446e(r5)
            androidx.lifecycle.i0 r7 = r7.mo75002a(r4)
            os1.f r7 = (os1.C11739f) r7
            boolean r7 = r7.mo11603f3(r2)
            r8 = 1
            r10 = r7 ^ 1
            bl3.r$a r7 = r6.mo62444c(r1)
            java.lang.Class<rs1.s8> r11 = rs1.C13442s8.class
            androidx.lifecycle.i0 r7 = r7.mo75002a(r11)
            rs1.s8 r7 = (rs1.C13442s8) r7
            te3.hj1 r11 = r7.mo12853i3(r2)
            ke1.s r12 = new ke1.s
            r12.<init>()
            android.content.Intent r7 = r22.getIntent()
            r13 = 4
            java.lang.String r14 = "KEY_TARGET_TAB_TYPE"
            int r7 = r7.getIntExtra(r14, r13)
            r13 = 0
            if (r7 != r2) goto L_0x0120
            android.content.Intent r7 = r22.getIntent()
            java.lang.String r14 = "KEY_BY_PASS_INFO"
            java.lang.String r7 = r7.getStringExtra(r14)
            android.content.Intent r14 = r22.getIntent()
            java.lang.String r15 = "KEY_BY_PASS_INFO_TYPE"
            int r14 = r14.getIntExtra(r15, r13)
            android.content.Intent r15 = r22.getIntent()
            java.lang.String r8 = "KEY_SOURCE_TYPE"
            int r8 = r15.getIntExtra(r8, r13)
            android.content.Intent r15 = r22.getIntent()
            java.lang.String r13 = "KEY_GUIDE_BAR_OBJ_ID"
            r16 = r4
            r17 = r5
            r4 = -1
            long r18 = r15.getLongExtra(r13, r4)
            int r15 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r15 == 0) goto L_0x0084
            java.lang.Long r4 = java.lang.Long.valueOf(r18)
            goto L_0x0085
        L_0x0084:
            r4 = 0
        L_0x0085:
            android.content.Intent r5 = r22.getIntent()
            r15 = r14
            r13 = 0
            r19 = r6
            java.lang.String r6 = "KEY_OBJECT_ID"
            long r5 = r5.getLongExtra(r6, r13)
            android.content.Intent r13 = r22.getIntent()
            java.lang.String r14 = "KEY_OBJECT_NONCE_ID"
            java.lang.String r13 = r13.getStringExtra(r14)
            if (r13 != 0) goto L_0x00a2
            java.lang.String r13 = ""
        L_0x00a2:
            android.content.Intent r14 = r22.getIntent()
            r0 = -1
            java.lang.String r1 = "key_reuqest_scene"
            int r0 = r14.getIntExtra(r1, r0)
            android.content.Intent r1 = r22.getIntent()
            java.lang.String r14 = "report_scene"
            r20 = r11
            r11 = 0
            int r1 = r1.getIntExtra(r14, r11)
            int r11 = ve1.C14486c8.f40164d
            if (r11 != r2) goto L_0x00c1
            pe3.b r11 = ve1.C14486c8.f40163c
            goto L_0x00c2
        L_0x00c1:
            r11 = 0
        L_0x00c2:
            r12.f29869b = r11
            r12.f29868a = r4
            if (r7 == 0) goto L_0x00ee
            int r4 = r7.length()
            if (r4 != 0) goto L_0x00d0
            r4 = 1
            goto L_0x00d1
        L_0x00d0:
            r4 = 0
        L_0x00d1:
            r11 = 1
            r4 = r4 ^ r11
            if (r4 == 0) goto L_0x00d6
            goto L_0x00d7
        L_0x00d6:
            r7 = 0
        L_0x00d7:
            if (r7 == 0) goto L_0x00ee
            pe3.b r4 = new pe3.b
            java.nio.charset.Charset r11 = z04.C119027c.f356488a
            byte[] r7 = r7.getBytes(r11)
            java.lang.String r11 = "this as java.lang.String).getBytes(charset)"
            gy3.C87412m.m108593f(r7, r11)
            int r11 = r7.length
            r14 = 0
            r4.<init>(r7, r14, r11)
            r12.f29870c = r4
        L_0x00ee:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r15)
            r12.f29871d = r4
            r12.f29874g = r8
            r12.f29872e = r5
            r12.f29873f = r13
            r4 = 15
            if (r1 != r4) goto L_0x0100
            r0 = 6
            goto L_0x0103
        L_0x0100:
            if (r0 >= 0) goto L_0x0103
            r0 = 3
        L_0x0103:
            r12.f29877j = r0
            android.content.Intent r0 = r22.getIntent()
            java.lang.String r1 = "FLOAT_BALL_KEY"
            java.lang.String r0 = r0.getStringExtra(r1)
            if (r0 == 0) goto L_0x011a
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0118
            goto L_0x011a
        L_0x0118:
            r0 = 0
            goto L_0x011b
        L_0x011a:
            r0 = 1
        L_0x011b:
            r1 = 1
            r0 = r0 ^ r1
            r12.f29878k = r0
            goto L_0x0128
        L_0x0120:
            r16 = r4
            r17 = r5
            r19 = r6
            r20 = r11
        L_0x0128:
            if (r3 == 0) goto L_0x0136
            android.os.Bundle r0 = r3.f17335p
            if (r0 == 0) goto L_0x0136
            java.lang.String r1 = "IsFirstEnterTab"
            r4 = 0
            boolean r11 = r0.getBoolean(r1, r4)
            goto L_0x0137
        L_0x0136:
            r11 = 0
        L_0x0137:
            r12.f29875h = r11
            rx3.b0 r0 = rx3.C13598b0.f38549a
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$1 r0 = new com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$1
            r7 = r0
            r8 = r23
            r11 = r20
            r7.<init>(r8, r9, r10, r11, r12)
            r1 = r21
            r4 = r22
            r5 = r23
            r6 = 0
            r1.<init>(r4, r6, r5, r0)
            r4 = r17
            r0 = r19
            bl3.r$a r0 = r0.mo62446e(r4)
            r4 = r16
            androidx.lifecycle.i0 r0 = r0.mo75002a(r4)
            java.lang.String r4 = "UICProvider.of(FinderCom…meTabStateVM::class.java)"
            gy3.C87412m.m108593f(r0, r4)
            os1.f r0 = (os1.C11739f) r0
            r1.f13045h = r0
            cm1.e r4 = new cm1.e
            r4.<init>()
            r1.f13049o = r4
            cm1.g r4 = new cm1.g
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 7
            r10 = 0
            r5 = r4
            r5.<init>(r6, r7, r8, r9, r10)
            r1.f13050p = r4
            java.util.concurrent.ConcurrentHashMap r4 = new java.util.concurrent.ConcurrentHashMap
            r4.<init>()
            r1.f13051q = r4
            com.tencent.mm.ui.MMActivity r4 = r1.f30174d
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$feedProgressListener$1 r5 = new com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$feedProgressListener$1
            r5.<init>(r1, r4)
            r1.f13053s = r5
            com.tencent.mm.ui.MMActivity r4 = r1.f30174d
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$autoRefreshEventListener$1 r5 = new com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$autoRefreshEventListener$1
            r5.<init>(r1, r4)
            r1.f13054t = r5
            r1.f13046i = r2
            boolean r0 = r0.mo11603f3(r2)
            r1.f13047j = r0
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r0 = r1.f30175e
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$a r4 = new com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$a
            r4.<init>(r3, r0, r1, r2)
            r0.setInitDone(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter.<init>(com.tencent.mm.ui.MMActivity, int, int, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment):void");
    }

    /* renamed from: A7 */
    public void mo2513A7(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        RecyclerView recyclerView;
        C87412m.m108594g(cVar, TPReportKeys.PlayerStep.PLAYER_REASON);
        C61926c.m72668M(new C9905o2(cVar, this));
        C9753h hVar = this.f30176f;
        if (!(hVar == null || (recyclerView = hVar.getRecyclerView()) == null)) {
            recyclerView.post(new C2510e(this));
        }
        C20480e0.m22094n(C20480e0.f57583a, this.f13046i, false, (C49712hj1) null, false, 0, false, 28, (Object) null);
        Log.m105924i("FinderFollowFeedUIContract.Presenter", "[onLoadMoreEnd] reason=" + cVar);
        mo2517f0(cVar, false);
    }

    /* renamed from: G */
    public void mo2514G() {
        C7879t1.f26497a.mo8993a();
        if (this.f13046i == 3) {
            long longExtra = this.f30174d.getIntent().getLongExtra("key_finder_post_local_id", -1);
            boolean z = this.f30174d.getIntent().getBooleanExtra("key_form_sns", false) || this.f30174d.getIntent().getBooleanExtra("KEY_POST_DIRECTLY_FROM_SNS", false);
            boolean booleanExtra = this.f30174d.getIntent().getBooleanExtra("KEY_FROM_SDK_SHARE", false);
            boolean booleanExtra2 = this.f30174d.getIntent().getBooleanExtra("KEY_FROM_SNS_SYNC_POST", false);
            if (longExtra != -1 && (z || booleanExtra || booleanExtra2)) {
                BaseFinderFeed onPostStart = this.f30175e.onPostStart(longExtra, z);
                if (z && onPostStart != null) {
                    C7868s3.f26472a.mo8975b(this.f30174d, onPostStart);
                }
            }
            this.f30174d.getIntent().removeExtra("key_finder_post_local_id");
            C61926c.m72668M(new C9905o2((RefreshLoadMoreLayout.C7080c<Object>) null, this));
        }
        C11078h hVar = this.f13052r;
        if (hVar != null) {
            hVar.mo11215b();
        }
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [kf1.h] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0187  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo2515N(boolean r22, boolean r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            do1.h$f r3 = do1.C58341h.C58344f.RefreshContinue
            bl3.r r4 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r5 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r4 = r4.mo62446e(r5)
            java.lang.Class<com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore> r5 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class
            androidx.lifecycle.i0 r4 = r4.mo75002a(r5)
            com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore r4 = (com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) r4
            int r5 = r0.f13046i
            do1.h r4 = r4.mo78457f3(r5)
            os1.f r5 = r0.f13045h
            int r6 = r0.f13046i
            boolean r5 = r5.mo11603f3(r6)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8 = 1
            r9 = 0
            if (r5 == 0) goto L_0x0046
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r5 = r0.f30175e
            boolean r10 = r5 instanceof com.tencent.p014mm.plugin.finder.feed.model.FinderTimelineFeedLoader
            if (r10 == 0) goto L_0x0038
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r5 = (com.tencent.p014mm.plugin.finder.feed.model.FinderTimelineFeedLoader) r5
            goto L_0x0039
        L_0x0038:
            r5 = r9
        L_0x0039:
            if (r5 == 0) goto L_0x0041
            int r5 = r5.f13842e
            if (r5 != 0) goto L_0x0041
            r5 = 1
            goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            if (r5 == 0) goto L_0x0046
            r5 = 1
            goto L_0x0047
        L_0x0046:
            r5 = 0
        L_0x0047:
            if (r4 == 0) goto L_0x0053
            do1.h$e r10 = r4.f167042r
            if (r10 == 0) goto L_0x0053
            boolean r10 = r10.f25557a
            if (r10 != r8) goto L_0x0053
            r10 = 1
            goto L_0x0054
        L_0x0053:
            r10 = 0
        L_0x0054:
            if (r10 == 0) goto L_0x005e
            do1.h$e r10 = r4.f167042r
            do1.h$f r10 = r10.f25558b
            if (r10 != r3) goto L_0x005e
            r10 = 1
            goto L_0x005f
        L_0x005e:
            r10 = 0
        L_0x005f:
            if (r4 == 0) goto L_0x0068
            do1.h$a r11 = r4.f167040p
            if (r11 == 0) goto L_0x0068
            do1.h$f r11 = r11.f167045c
            goto L_0x0069
        L_0x0068:
            r11 = r9
        L_0x0069:
            if (r11 != r3) goto L_0x006d
            r11 = 1
            goto L_0x006e
        L_0x006d:
            r11 = 0
        L_0x006e:
            java.lang.String r12 = "FinderFollowFeedUIContract.Presenter"
            if (r5 == 0) goto L_0x0090
            if (r10 == 0) goto L_0x0090
            if (r4 == 0) goto L_0x0079
            r4.mo83098u(r6, r3)
        L_0x0079:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[checkAutoFlingToRefresh] reset loadingState tabType="
            r3.append(r4)
            int r4 = r0.f13046i
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r3)
            goto L_0x00b1
        L_0x0090:
            if (r5 == 0) goto L_0x00b1
            if (r11 == 0) goto L_0x00b1
            if (r4 == 0) goto L_0x009b
            java.lang.String r3 = "HasRefreshContinueCache"
            r4.mo83089e(r8, r3)
        L_0x009b:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[checkAutoFlingToRefresh] clear last refresh response. tabType="
            r3.append(r4)
            int r4 = r0.f13046i
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r12, r3)
        L_0x00b1:
            if (r5 != 0) goto L_0x00b9
            if (r10 != 0) goto L_0x00b7
            if (r11 == 0) goto L_0x00b9
        L_0x00b7:
            r3 = 1
            goto L_0x00ba
        L_0x00b9:
            r3 = 0
        L_0x00ba:
            if (r3 != 0) goto L_0x00c0
            if (r5 != 0) goto L_0x00c0
            if (r1 == 0) goto L_0x018b
        L_0x00c0:
            kf1.h r3 = r0.f30176f
            if (r3 == 0) goto L_0x00cf
            androidx.recyclerview.widget.RecyclerView r3 = r3.getRecyclerView()
            if (r3 == 0) goto L_0x00cf
            androidx.recyclerview.widget.RecyclerView$LayoutManager r3 = r3.getLayoutManager()
            goto L_0x00d0
        L_0x00cf:
            r3 = r9
        L_0x00d0:
            boolean r4 = r3 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r4 == 0) goto L_0x00d7
            androidx.recyclerview.widget.StaggeredGridLayoutManager r3 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r3
            goto L_0x00d8
        L_0x00d7:
            r3 = r9
        L_0x00d8:
            if (r3 == 0) goto L_0x00df
            int[] r4 = r3.mo17394A(r9)
            goto L_0x00e0
        L_0x00df:
            r4 = r9
        L_0x00e0:
            if (r4 != 0) goto L_0x00e5
            r4 = 2
            int[] r4 = new int[r4]
        L_0x00e5:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r10 = "[checkAutoFlingToRefresh] isHard="
            r5.append(r10)
            r5.append(r1)
            java.lang.String r1 = " isWithRefresh="
            r5.append(r1)
            r5.append(r2)
            java.lang.String r1 = " offset="
            r5.append(r1)
            r5.append(r4)
            java.lang.String r1 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r12, r1)
            if (r3 == 0) goto L_0x0154
            k20.a r1 = new k20.a
            r1.<init>()
            java.lang.ThreadLocal<k20.a> r4 = k20.C60958c.f173611a
            r1.mo10233c(r7)
            r1.mo10233c(r7)
            java.lang.Object[] r14 = r1.mo10232b()
            java.lang.String r15 = "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$Presenter"
            java.lang.String r16 = "checkAutoFlingToRefresh"
            java.lang.String r17 = "(ZZ)Z"
            java.lang.String r18 = "Undefined"
            java.lang.String r19 = "scrollToPositionWithOffset"
            java.lang.String r20 = "(II)V"
            r13 = r3
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r4 = r1.mo10231a(r6)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Object r1 = r1.mo10231a(r8)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3.mo17414U(r4, r1)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/feed/FinderFollowFeedUIContract$Presenter"
            java.lang.String r15 = "checkAutoFlingToRefresh"
            java.lang.String r16 = "(ZZ)Z"
            java.lang.String r17 = "Undefined"
            java.lang.String r18 = "scrollToPositionWithOffset"
            java.lang.String r19 = "(II)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
        L_0x0154:
            kf1.h r1 = r0.f30176f
            if (r1 == 0) goto L_0x0166
            androidx.recyclerview.widget.RecyclerView r1 = r1.getRecyclerView()
            if (r1 == 0) goto L_0x0166
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$c r4 = new com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$c
            r4.<init>(r3)
            r1.post(r4)
        L_0x0166:
            if (r2 == 0) goto L_0x0187
            dp1.e0 r1 = dp1.C20480e0.f57583a
            int r2 = r0.f13046i
            r1.mo32029b(r2)
            kf1.h r1 = r0.f30176f
            boolean r2 = r1 instanceof kf1.C9916p2
            if (r2 == 0) goto L_0x0178
            r9 = r1
            kf1.p2 r9 = (kf1.C9916p2) r9
        L_0x0178:
            if (r9 == 0) goto L_0x0188
            r1 = 0
            com.tencent.mm.view.RefreshLoadMoreLayout r3 = r9.f30220j
            kf1.q2 r4 = new kf1.q2
            r4.<init>(r9, r6)
            r3.postDelayed(r4, r1)
            goto L_0x0188
        L_0x0187:
            r8 = 0
        L_0x0188:
            r0.f13047j = r6
            r6 = r8
        L_0x018b:
            dp1.e0 r1 = dp1.C20480e0.f57583a
            r1.mo32030c()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter.mo2515N(boolean, boolean):boolean");
    }

    /* renamed from: U */
    public C9500j mo2516U() {
        C9753h hVar = this.f30176f;
        C14367u0 Z = hVar != null ? hVar.mo9296Z() : null;
        C87412m.m108591d(Z);
        return Z.mo3010b(new C2507b(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r0 = r0.getRecyclerView();
     */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo2517f0(com.tencent.p014mm.view.RefreshLoadMoreLayout.C7080c<java.lang.Object> r10, boolean r11) {
        /*
            r9 = this;
            kf1.h r0 = r9.f30176f
            r1 = 0
            if (r0 == 0) goto L_0x0010
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            if (r0 == 0) goto L_0x0010
            androidx.recyclerview.widget.RecyclerView$e r0 = r0.getAdapter()
            goto L_0x0011
        L_0x0010:
            r0 = r1
        L_0x0011:
            boolean r2 = r0 instanceof com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter
            if (r2 == 0) goto L_0x0019
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r0 = (com.tencent.p014mm.view.recyclerview.WxRecyclerAdapter) r0
            r2 = r0
            goto L_0x001a
        L_0x0019:
            r2 = r1
        L_0x001a:
            r0 = 0
            if (r2 == 0) goto L_0x0022
            int r3 = r2.mo82597F4()
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            r8 = 1
            if (r3 > 0) goto L_0x0027
            r0 = 1
        L_0x0027:
            up1.f r3 = up1.C37521f.f99374d
            r3.getClass()
            if (r0 == 0) goto L_0x002f
            return
        L_0x002f:
            if (r10 == 0) goto L_0x0077
            if (r0 != 0) goto L_0x0049
            boolean r0 = r10.f24951f
            if (r0 != 0) goto L_0x0049
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$d r11 = new com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter$d
            r11.<init>(r2, r9)
            o40.C61926c.m72668M(r11)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.tencent.mm.view.RefreshLoadMoreLayout$c<java.lang.Object>> r11 = r9.f13051q
            java.lang.String r0 = r9.mo2520n0()
            r11.put(r0, r10)
            goto L_0x0077
        L_0x0049:
            if (r11 == 0) goto L_0x0077
            if (r2 == 0) goto L_0x0077
            jq3.l$a r10 = r9.f13049o
            java.lang.String r11 = "info"
            gy3.C87412m.m108594g(r10, r11)
            java.util.ArrayList<jq3.l$a> r11 = r2.f173486j
            boolean r10 = r11.contains(r10)
            if (r10 == 0) goto L_0x006b
            jq3.l$a r10 = r9.f13049o
            cm1.e r10 = (cm1.C0726e) r10
            int r10 = r10.hashCode()
            long r3 = (long) r10
            r5 = 0
            r6 = 2
            r7 = 0
            jq3.C60898l.m71331i6(r2, r3, r5, r6, r7)
        L_0x006b:
            kf1.h r10 = r9.f30176f
            if (r10 == 0) goto L_0x0071
            com.tencent.mm.view.RefreshLoadMoreLayout r1 = r10.f30220j
        L_0x0071:
            if (r1 != 0) goto L_0x0074
            goto L_0x0077
        L_0x0074:
            r1.setEnableLoadMore(r8)
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter.mo2517f0(com.tencent.mm.view.RefreshLoadMoreLayout$c, boolean):void");
    }

    /* renamed from: j0 */
    public final void mo2518j0(String str) {
        C87412m.m108594g(str, FirebaseAnalytics.C113379b.SOURCE);
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_TWO_FLOW_PRELOAD_NUM_INT_SYNC, 0);
        if (j > 0) {
            Log.m105924i("FinderFollowFeedUIContract.ViewCallback", "checkPreloadThreshold: source=" + str + ", set customPreloadThreshold=" + j);
            C9753h hVar = this.f30176f;
            C10811d1 d1Var = hVar != null ? (C10811d1) ((C36570n) hVar.f30227t).getValue() : null;
            if (d1Var != null) {
                d1Var.f32311f = j;
            }
        }
    }

    /* renamed from: n */
    public void mo2519n() {
        C9753h hVar = this.f30176f;
        if (hVar != null) {
            hVar.mo9297d(this.f30175e.getDataListJustForAdapter());
        }
        mo2518j0("initViewCallback");
    }

    /* renamed from: n0 */
    public final String mo2520n0() {
        List<E> listOfType = this.f30175e.getListOfType(BaseFinderFeed.class);
        boolean z = listOfType.size() == 0;
        long j = 0;
        long id = z ? 0 : ((BaseFinderFeed) listOfType.get(0)).mo3513o().getId();
        if (!z) {
            j = ((BaseFinderFeed) listOfType.get(listOfType.size() - 1)).mo3513o().getId();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f13046i);
        sb.append('_');
        sb.append(id);
        sb.append('_');
        sb.append(j);
        sb.append('_');
        sb.append(listOfType.size());
        return sb.toString();
    }

    /* renamed from: o */
    public void mo2521o() {
        BaseFeedLoader.requestLoadMore$default(this.f30175e, false, 1, (Object) null);
    }

    public void onDetach() {
        super.onDetach();
        this.f13053s.dead();
        this.f13054t.dead();
        C11078h hVar = this.f13052r;
        if (hVar != null) {
            hVar.detach();
        }
    }

    public void onRefreshEnd(RefreshLoadMoreLayout.C7080c<Object> cVar) {
        RecyclerView recyclerView;
        C9753h hVar;
        RefreshLoadMoreLayout refreshLoadMoreLayout;
        RefreshLoadMoreLayout.C7080c<Object> cVar2 = cVar;
        Class cls = C13442s8.class;
        C87412m.m108594g(cVar2, TPReportKeys.PlayerStep.PLAYER_REASON);
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
        C39818r rVar = C39818r.f106831a;
        String str = ((C13442s8) rVar.mo62444c(this.f30174d).mo75002a(cls)).f38098n;
        if (str == null) {
            str = "";
        }
        y0Var.N40(str, "EndCgi");
        Log.m105924i("FinderFollowFeedUIContract.Presenter", "[onRefreshEnd] reason=" + cVar2);
        if (!(cVar2.f24953h > 0 || (hVar = this.f30176f) == null || (refreshLoadMoreLayout = hVar.f30220j) == null)) {
            C37521f.f99374d.getClass();
            refreshLoadMoreLayout.mo82448Q(C37521f.f99287T, C2511f.f13068d);
        }
        C61926c.m72668M(new C9905o2(cVar2, this));
        C9753h hVar2 = this.f30176f;
        if (!(hVar2 == null || (recyclerView = hVar2.getRecyclerView()) == null)) {
            recyclerView.post(new C2512g(this));
        }
        mo2517f0(cVar2, true);
        FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
        int i = this.f13046i;
        if (i == 1) {
            Nx0.mo77263e("TLRecommendTab", "onRefreshEnd");
            Nx0.mo77239M5("TLRecommendTab");
        } else if (i == 3) {
            Nx0.mo77263e("TLFollow", "onRefreshEnd");
            Nx0.mo77239M5("TLFollow");
        } else if (i == 4) {
            Nx0.mo77263e("finder_tl_hot_tab", "onRefreshEnd");
            Nx0.mo77239M5("finder_tl_hot_tab");
        }
        DataBuffer dataListJustForAdapter = this.f30175e.getDataListJustForAdapter();
        boolean z = dataListJustForAdapter.size() > 0 && ((C0740i2) dataListJustForAdapter.get(0)).mo75c() == 2;
        C11078h hVar3 = this.f13052r;
        if (hVar3 != null) {
            hVar3.mo11215b();
        }
        C20480e0.m22094n(C20480e0.f57583a, this.f13046i, false, ((C13442s8) rVar.mo62444c(this.f30174d).mo75002a(cls)).mo12861q3(), z, 0, false, 16, (Object) null);
        mo2518j0("onRefreshEnd");
        FinderHomeUIC finderHomeUIC = (FinderHomeUIC) rVar.mo62444c(this.f30174d).mo62449e(FinderHomeUIC.class);
        if (finderHomeUIC != null) {
            finderHomeUIC.mo5134j3();
        }
    }

    /* renamed from: q */
    public void mo2523q() {
    }

    public void requestRefresh() {
        C9493c cVar;
        Class<BaseFinderFeed> cls = BaseFinderFeed.class;
        ArrayList arrayList = new ArrayList();
        List<E> listOfType = this.f30175e.getListOfType(cls);
        C58784w3 w3Var = C58784w3.f168295a;
        List<E> d0 = w3Var.mo83922d0(this.f30175e.getDataList().getBuffer(), cls);
        Log.m105924i("FinderFollowFeedUIContract.Presenter", "[requestRefresh] tabType=" + this.f13046i + ", dataList=" + listOfType.size() + " buffer=" + ((ArrayList) d0).size());
        listOfType.addAll(d0);
        arrayList.addAll(w3Var.mo83968u0(listOfType, this.f13046i));
        C9753h hVar = this.f30176f;
        RecyclerView recyclerView = hVar != null ? hVar.getRecyclerView() : null;
        RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
        FinderStaggeredGridLayoutManager finderStaggeredGridLayoutManager = layoutManager instanceof FinderStaggeredGridLayoutManager ? (FinderStaggeredGridLayoutManager) layoutManager : null;
        if (finderStaggeredGridLayoutManager != null) {
            int i = finderStaggeredGridLayoutManager.f44890d;
            int[] iArr = new int[i];
            int[] iArr2 = new int[i];
            finderStaggeredGridLayoutManager.mo17394A(iArr);
            finderStaggeredGridLayoutManager.mo17395B(iArr2);
            int i2 = iArr[0];
            int i3 = iArr2[finderStaggeredGridLayoutManager.f44890d - 1];
            if (i2 <= i3) {
                while (true) {
                    RecyclerView.C16631z J0 = recyclerView.mo17024J0(i2, false);
                    C60905o oVar = J0 instanceof C60905o ? (C60905o) J0 : null;
                    if (!(oVar == null || (cVar = (C9493c) oVar.f173503E) == null)) {
                        C61926c.m72673R(arrayList, new C2513h(cVar));
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2++;
                }
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[requestRefresh] tabType=");
            sb.append(this.f13046i);
            sb.append(", unreadList=");
            sb.append(arrayList.size());
            sb.append(" first=");
            BaseFinderFeed baseFinderFeed = (BaseFinderFeed) C110818d0.m150925W(arrayList);
            sb.append(C61926c.m72691p(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0));
            sb.append(" isFirstLoad=");
            BaseFinderFeedLoader baseFinderFeedLoader = this.f30175e;
            C87412m.m108592e(baseFinderFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader");
            sb.append(((FinderTimelineFeedLoader) baseFinderFeedLoader).f13842e);
            Log.m105924i("FinderFollowFeedUIContract.Presenter", sb.toString());
            if (((FinderTimelineFeedLoader) this.f30175e).f13842e == 0) {
                FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
                Nx0.f158530g.add(Nx0.mo77283w(this.f13046i));
            }
            C61926c.m72656A((String) null, new C2514i(this, arrayList));
        }
    }

    /* renamed from: t */
    public void mo2525t(C9753h hVar) {
        RecyclerView recyclerView;
        Class cls = C11266d.class;
        C87412m.m108594g(hVar, "callback");
        super.mo2525t(hVar);
        C39818r rVar = C39818r.f106831a;
        this.f13048n = ((C11739f) rVar.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class)).mo11600c3(this.f13046i);
        this.f13053s.alive();
        this.f13054t.alive();
        BaseFinderFeedLoader baseFinderFeedLoader = this.f30175e;
        C87412m.m108592e(baseFinderFeedLoader, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader");
        FinderTimelineFeedLoader finderTimelineFeedLoader = (FinderTimelineFeedLoader) baseFinderFeedLoader;
        C9753h hVar2 = this.f30176f;
        finderTimelineFeedLoader.f13847j = new WeakReference<>(hVar2 != null ? hVar2.getRecyclerView() : null);
        ((C11264b) rVar.mo62446e(cls).mo62447c(C11264b.class)).mo11321n2(this.f30174d);
        C9753h hVar3 = this.f30176f;
        if (!(hVar3 == null || (recyclerView = hVar3.getRecyclerView()) == null)) {
            MMActivity mMActivity = this.f30174d;
            DataBuffer dataListJustForAdapter = this.f30175e.getDataListJustForAdapter();
            C9753h hVar4 = this.f30176f;
            C87412m.m108591d(hVar4);
            C11078h ft = ((C11266d) C86312j.m106911c(cls)).mo9193ft(mMActivity, recyclerView, dataListJustForAdapter, hVar4.mo10346D());
            this.f13052r = ft;
            if (ft != null) {
                ft.mo11219e();
            }
        }
        BaseFeedLoader.requestInit$default(this.f30175e, false, 1, (Object) null);
    }

    /* renamed from: x */
    public void mo2526x() {
        C20480e0.f57583a.mo32030c();
        C11078h hVar = this.f13052r;
        if (hVar != null) {
            hVar.mo11214a();
        }
    }
}
