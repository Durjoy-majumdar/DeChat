package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import bl3.C39818r;
import cm1.C0763p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.recyclerview.DynamicViewCacheExtension;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.utils.FinderFolderClearManager;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import dp1.C20480e0;
import dp1.C58356b0;
import dp1.C58417y0;
import en3.C97675c;
import en3.C97680h;
import er1.C58784w3;
import f40.C86709a0;
import fe1.C45770k;
import fy3.C32224a;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import je1.C9318i2;
import k20.C60958c;
import k20.C9556a;
import kf1.C9753h;
import kf1.C9916p2;
import kf1.C9934q2;
import o40.C61926c;
import os1.C11739f;
import p599lr.C61381b;
import p823sg.C101614i;
import pe1.C35464c;
import rs1.C13442s8;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49712hj1;
import te3.C50401mh0;
import up1.C37521f;
import uq1.C65430c;
import wc3.C78538u;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC */
public final class FinderTwoFlowTimelineUIC extends UIComponent implements C45770k {

    /* renamed from: d */
    public final C13601g f18795d = C36568h.m40985a(new C4326c(this));

    /* renamed from: e */
    public FinderFollowFeedUIContract$Presenter f18796e;

    /* renamed from: f */
    public C9916p2 f18797f;

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC$a */
    public static final class C4324a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C4324a f18798d = new C4324a();

        public C4324a() {
            super(0);
        }

        public Object invoke() {
            FinderFolderClearManager.f161637a.mo79382a();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC$b */
    public static final class C4325b extends C87413o implements C32226l<C59670o2, Boolean> {

        /* renamed from: d */
        public static final C4325b f18799d = new C4325b();

        public C4325b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C59670o2) obj, LocaleUtil.ITALIAN);
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC$c */
    public static final class C4326c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderTwoFlowTimelineUIC f18800d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4326c(FinderTwoFlowTimelineUIC finderTwoFlowTimelineUIC) {
            super(0);
            this.f18800d = finderTwoFlowTimelineUIC;
        }

        public Object invoke() {
            Fragment fragment = this.f18800d.getFragment();
            FinderHomeTabFragment finderHomeTabFragment = fragment instanceof FinderHomeTabFragment ? (FinderHomeTabFragment) fragment : null;
            return Integer.valueOf(finderHomeTabFragment != null ? finderHomeTabFragment.f17334o : 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTwoFlowTimelineUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: c3 */
    public final int mo5178c3() {
        return ((Number) this.f18795d.getValue()).intValue();
    }

    /* renamed from: d3 */
    public final void mo5179d3(boolean z) {
        C13442s8 f;
        C13442s8 f2;
        Class cls = C58417y0.class;
        C9916p2 p2Var = this.f18797f;
        if (p2Var != null) {
            RecyclerView.LayoutManager layoutManager = p2Var.getRecyclerView().getLayoutManager();
            StaggeredGridLayoutManager staggeredGridLayoutManager = layoutManager instanceof StaggeredGridLayoutManager ? (StaggeredGridLayoutManager) layoutManager : null;
            if (staggeredGridLayoutManager != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                aVar.mo10233c(Integer.valueOf(z ^ true ? 1 : 0));
                C117292a.m165358d(staggeredGridLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderTwoFlowTimelineUIC", "onActionbarClick", "(Z)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                staggeredGridLayoutManager.mo17414U(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(staggeredGridLayoutManager, "com/tencent/mm/plugin/finder/viewmodel/component/FinderTwoFlowTimelineUIC", "onActionbarClick", "(Z)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
            if (z) {
                C9916p2 p2Var2 = this.f18797f;
                if (p2Var2 != null) {
                    p2Var2.f30220j.postDelayed(new C9934q2(p2Var2, false), 150);
                    C37521f.f99374d.getClass();
                    if (C37521f.f99420i1.mo60266n().intValue() == 1 && (f2 = C13442s8.f38060Q0.mo12873f(getActivity())) != null) {
                        ((C58417y0) C86312j.m106911c(cls)).zx0(f2.mo12861q3(), 5, mo5178c3());
                        return;
                    }
                    return;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            C37521f.f99374d.getClass();
            if (C37521f.f99420i1.mo60266n().intValue() == 1 && (f = C13442s8.f38060Q0.mo12873f(getActivity())) != null) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                ((C58417y0) c).zx0(f.mo12861q3(), 1, 0);
                return;
            }
            return;
        }
        C87412m.m108603p("viewCallback");
        throw null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aqh;
    }

    /* renamed from: i4 */
    public void mo3121i4(C50401mh0 mh02, int i, int i2) {
        C87412m.m108594g(mh02, "cmdItem");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        RecyclerView recyclerView;
        if (i == 10001 && i2 == -1 && intent != null) {
            FinderFollowFeedUIContract$Presenter finderFollowFeedUIContract$Presenter = this.f18796e;
            if (finderFollowFeedUIContract$Presenter != null) {
                C9753h hVar = finderFollowFeedUIContract$Presenter.f30176f;
                if (hVar != null && (recyclerView = hVar.getRecyclerView()) != null) {
                    C58784w3.m68439o1(C58784w3.f168295a, intent, recyclerView, finderFollowFeedUIContract$Presenter.f30175e, false, (C32226l) null, 24, (Object) null);
                    return;
                }
                return;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    public boolean onBackPressed() {
        if (isBelongFragment()) {
            if (this.f18796e != null) {
                return false;
            }
            C87412m.m108603p("presenter");
            throw null;
        } else if (this.f18796e != null) {
            getActivity().finish();
            return true;
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
        r2 = r2.f44854d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBeforeFinish(android.content.Intent r19) {
        /*
            r18 = this;
            r0 = r18
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter r1 = r0.f18796e
            r2 = 0
            if (r1 == 0) goto L_0x008c
            kf1.h r3 = r1.f30176f
            if (r3 == 0) goto L_0x008b
            androidx.recyclerview.widget.RecyclerView r4 = r3.getRecyclerView()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r4.getLayoutManager()
            java.lang.String r5 = "null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager"
            gy3.C87412m.m108592e(r4, r5)
            androidx.recyclerview.widget.StaggeredGridLayoutManager r4 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r4
            int[] r2 = r4.mo17394A(r2)
            com.tencent.mm.view.recyclerview.WxRecyclerAdapter r4 = r3.mo10346D()
            r5 = 0
            r6 = r2[r5]
            int r4 = r4.mo85796c6()
            int r9 = r6 - r4
            androidx.recyclerview.widget.RecyclerView r3 = r3.getRecyclerView()
            r2 = r2[r5]
            androidx.recyclerview.widget.RecyclerView$z r2 = r3.mo17024J0(r2, r5)
            if (r2 == 0) goto L_0x0041
            android.view.View r2 = r2.f44854d
            if (r2 == 0) goto L_0x0041
            int r5 = r2.getTop()
            r10 = r5
            goto L_0x0042
        L_0x0041:
            r10 = 0
        L_0x0042:
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r2 = r1.f30175e
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r2 = r2.getDataListJustForAdapter()
            java.util.Iterator r2 = r2.iterator()
        L_0x004c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0062
            java.lang.Object r3 = r2.next()
            cm1.i2 r3 = (cm1.C0740i2) r3
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.finder.model.BaseFinderFeed
            if (r4 == 0) goto L_0x004c
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r3 = (com.tencent.p014mm.plugin.finder.model.BaseFinderFeed) r3
            r3.mo3482P()
            goto L_0x004c
        L_0x0062:
            bl3.r r2 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r3 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r2 = r2.mo62446e(r3)
            java.lang.Class<os1.f> r3 = os1.C11739f.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            java.lang.String r3 = "UICProvider.of(FinderCom…meTabStateVM::class.java)"
            gy3.C87412m.m108593f(r2, r3)
            r7 = r2
            os1.f r7 = (os1.C11739f) r7
            int r8 = r1.f13046i
            com.tencent.mm.plugin.finder.feed.model.BaseFinderFeedLoader r1 = r1.f30175e
            com.tencent.mm.plugin.finder.feed.model.internal.DataBuffer r11 = r1.getDataListJustForAdapter()
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 112(0x70, float:1.57E-43)
            r17 = 0
            os1.C11739f.m11436j3(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x008b:
            return
        L_0x008c:
            java.lang.String r1 = "presenter"
            gy3.C87412m.m108603p(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC.onBeforeFinish(android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        int I7;
        Class cls = FinderCommonFeatureService.class;
        boolean z = false;
        int j = C86709a0.m107535s().mo121142i().mo119689j(C72994y1.C72995a.USERINFO_FINDER_NEW_CGI_INT_SYNC, 0);
        if (j == 1) {
            C9318i2.f29109a = "/cgi-bin/mmfinder-bin";
        } else if (j != 2) {
            C9318i2.f29109a = "/cgi-bin/micromsg-bin";
        } else {
            C9318i2.f29109a = "/cgi-bin/micromsg-bin";
        }
        Log.m105924i("Finder.FinderCgiConstants", "config " + j + ' ' + C9318i2.f29109a);
        C65430c cVar = C65430c.f188287c;
        C65430c.f188287c.mo89551b();
        Fragment fragment = getFragment();
        FinderHomeTabFragment finderHomeTabFragment = fragment instanceof FinderHomeTabFragment ? (FinderHomeTabFragment) fragment : null;
        if (finderHomeTabFragment != null) {
            I7 = finderHomeTabFragment.mo2203R();
        } else {
            AppCompatActivity activity = getActivity();
            MMFinderUI mMFinderUI = activity instanceof MMFinderUI ? (MMFinderUI) activity : null;
            I7 = mMFinderUI != null ? mMFinderUI.mo2194I7() : 0;
        }
        int i = I7;
        AppCompatActivity activity2 = getActivity();
        C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) activity2;
        int c3 = mo5178c3();
        Fragment fragment2 = getFragment();
        this.f18796e = new FinderFollowFeedUIContract$Presenter(mMActivity, i, c3, fragment2 instanceof FinderHomeTabFragment ? (FinderHomeTabFragment) fragment2 : null);
        AppCompatActivity activity3 = getActivity();
        C87412m.m108592e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C9916p2 p2Var = new C9916p2((MMActivity) activity3, i, mo5178c3(), getRootView(), getFragment());
        View findViewById = getRootView().findViewById(C0966R.C0970id.ivb);
        C87412m.m108593f(findViewById, "rootView.findViewById(R.id.rl_layout)");
        p2Var.f30220j = (RefreshLoadMoreLayout) findViewById;
        this.f18797f = p2Var;
        FinderFollowFeedUIContract$Presenter finderFollowFeedUIContract$Presenter = this.f18796e;
        if (finderFollowFeedUIContract$Presenter != null) {
            p2Var.mo10355Y0(finderFollowFeedUIContract$Presenter);
            FinderFollowFeedUIContract$Presenter finderFollowFeedUIContract$Presenter2 = this.f18796e;
            if (finderFollowFeedUIContract$Presenter2 != null) {
                C9916p2 p2Var2 = this.f18797f;
                if (p2Var2 != null) {
                    finderFollowFeedUIContract$Presenter2.mo2525t(p2Var2);
                    C37521f fVar = C37521f.f99374d;
                    fVar.getClass();
                    C35464c<Integer> cVar2 = C37521f.f99277R7;
                    if (cVar2.mo60266n().intValue() >= 1) {
                        C9916p2 p2Var3 = this.f18797f;
                        if (p2Var3 != null) {
                            DynamicViewCacheExtension d = C97675c.m125886d(p2Var3.getRecyclerView(), 6, 12, false, (C97680h) null, (MMHandler) null, 28, (Object) null);
                            if (d != null) {
                                fVar.getClass();
                                if (cVar2.mo60266n().intValue() == 2) {
                                    z = true;
                                }
                                d.f56358c = z;
                            }
                        } else {
                            C87412m.m108603p("viewCallback");
                            throw null;
                        }
                    }
                    ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12419l();
                    ((FinderCommonFeatureService) C86312j.m106911c(cls)).f157802n.mo84535d(104, this);
                    ((FinderCommonFeatureService) C86312j.m106911c(cls)).f157802n.mo84535d(108, this);
                    int f = C75044y4.m89994f(getActivity());
                    int a = C75044y4.m89989a(getActivity());
                    ViewGroup.LayoutParams layoutParams = getRootView().findViewById(C0966R.C0970id.f5377di).getLayoutParams();
                    C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    ((FrameLayout.LayoutParams) layoutParams).topMargin = a + f;
                    return;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public void onCreateAfter(Bundle bundle) {
        if (!isBelongFragment()) {
            C78538u.m94868d((MMActivity) getActivity());
        }
        new FinderTwoFlowTimelineUIC$onCreateAfter$1(this, getActivity()).alive();
    }

    public void onCreateBefore(Bundle bundle) {
        if (!isBelongFragment()) {
            C78538u.m94870f(getActivity());
        }
    }

    public void onDestroy() {
        Class cls = FinderCommonFeatureService.class;
        Log.m105924i("FinderTwoFlowTimelineUIC", "onDestroy");
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).f157802n.mo84540i(104, this);
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).f157802n.mo84540i(108, this);
        FinderFollowFeedUIContract$Presenter finderFollowFeedUIContract$Presenter = this.f18796e;
        C49712hj1 hj12 = null;
        if (finderFollowFeedUIContract$Presenter != null) {
            finderFollowFeedUIContract$Presenter.onDetach();
            C101614i<String, SpannableString> iVar = C0763p.f1802a;
            C0763p.f1802a.clear();
            C61926c.m72658C((String) null, C4324a.f18798d, 1, (Object) null);
            C9916p2 p2Var = this.f18797f;
            if (p2Var != null) {
                p2Var.getRecyclerView().setAdapter((RecyclerView.C16613e) null);
                C20480e0 e0Var = C20480e0.f57583a;
                int c3 = mo5178c3();
                C13442s8 f = C13442s8.f38060Q0.mo12873f(getActivity());
                if (f != null) {
                    hj12 = f.mo12861q3();
                }
                e0Var.mo32047v(c3, hj12);
                e0Var.mo32045t(-1);
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public void onPause() {
        super.onPause();
        FinderFollowFeedUIContract$Presenter finderFollowFeedUIContract$Presenter = this.f18796e;
        if (finderFollowFeedUIContract$Presenter != null) {
            finderFollowFeedUIContract$Presenter.mo2526x();
            C20480e0.f57583a.mo32045t(-1);
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [androidx.recyclerview.widget.RecyclerView$LayoutManager] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r11 = this;
            super.onResume()
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter r0 = r11.f18796e
            r1 = 0
            if (r0 == 0) goto L_0x009a
            r0.mo2514G()
            boolean r0 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC.f18784i
            if (r0 == 0) goto L_0x0090
            int r0 = r11.mo5178c3()
            r2 = 3
            if (r0 != r2) goto L_0x0090
            java.lang.String r0 = "FinderTwoFlowTimelineUIC"
            java.lang.String r2 = "[onResume] shouldScrollToPostingItem"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
            kf1.p2 r0 = r11.f18797f
            if (r0 == 0) goto L_0x0089
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            boolean r2 = r0 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r2 == 0) goto L_0x0030
            r1 = r0
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
        L_0x0030:
            r0 = 0
            if (r1 == 0) goto L_0x0086
            k20.a r10 = new k20.a
            r10.<init>()
            java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r10.mo10233c(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r10.mo10233c(r2)
            java.lang.Object[] r3 = r10.mo10232b()
            java.lang.String r4 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderTwoFlowTimelineUIC"
            java.lang.String r5 = "onResume"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "scrollToPositionWithOffset"
            java.lang.String r9 = "(II)V"
            r2 = r1
            j20.C117292a.m165358d(r2, r3, r4, r5, r6, r7, r8, r9)
            java.lang.Object r2 = r10.mo10231a(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r3 = 1
            java.lang.Object r3 = r10.mo10231a(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r1.mo17414U(r2, r3)
            java.lang.String r3 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderTwoFlowTimelineUIC"
            java.lang.String r4 = "onResume"
            java.lang.String r5 = "()V"
            java.lang.String r6 = "Undefined"
            java.lang.String r7 = "scrollToPositionWithOffset"
            java.lang.String r8 = "(II)V"
            r2 = r1
            j20.C117292a.m165359e(r2, r3, r4, r5, r6, r7, r8)
        L_0x0086:
            com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC.f18784i = r0
            goto L_0x0090
        L_0x0089:
            java.lang.String r0 = "viewCallback"
            gy3.C87412m.m108603p(r0)
            throw r1
        L_0x0090:
            dp1.e0 r0 = dp1.C20480e0.f57583a
            int r1 = r11.mo5178c3()
            r0.mo32043q(r1)
            return
        L_0x009a:
            java.lang.String r0 = "presenter"
            gy3.C87412m.m108603p(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC.onResume():void");
    }

    public void onStop() {
        super.onStop();
        if (getActivity().isFinishing()) {
            C20480e0 e0Var = C20480e0.f57583a;
            int c3 = mo5178c3();
            C13442s8 f = C13442s8.f38060Q0.mo12873f(getActivity());
            e0Var.mo32047v(c3, f != null ? f.mo12861q3() : null);
            return;
        }
        C20480e0.f57583a.mo32036i(mo5178c3(), false);
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [androidx.appcompat.app.AppCompatActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUserVisibleFocused() {
        /*
            r8 = this;
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r0 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            super.onUserVisibleFocused()
            bl3.r r1 = bl3.C39818r.f106831a
            bl3.r$a r2 = r1.mo62446e(r0)
            java.lang.Class<os1.f> r3 = os1.C11739f.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            os1.f r2 = (os1.C11739f) r2
            r8.mo5178c3()
            r2.getClass()
            bl3.r$a r2 = r1.mo62446e(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler> r3 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler r2 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler) r2
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC$b r3 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC.C4325b.f18799d
            r2.mo80066B0(r3)
            android.app.Activity r2 = r8.getContext()
            bl3.r$a r2 = r1.mo62443b(r2)
            java.lang.Class<dm1.c> r3 = dm1.C58322c.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r3)
            java.lang.String r3 = "UICProvider.of(context).…layerManager::class.java)"
            gy3.C87412m.m108593f(r2, r3)
            dm1.c r2 = (dm1.C58322c) r2
            r3 = 0
            r2.mo83076e3(r3)
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter r2 = r8.f18796e
            java.lang.String r4 = "presenter"
            if (r2 == 0) goto L_0x0120
            androidx.appcompat.app.AppCompatActivity r2 = r8.getActivity()
            android.content.Intent r2 = r2.getIntent()
            java.lang.String r5 = "KEY_FINDER_POST_FINISH_JUMP_FOLLOW_TAB"
            r6 = 0
            if (r2 == 0) goto L_0x005b
            boolean r2 = r2.getBooleanExtra(r5, r6)
            goto L_0x005c
        L_0x005b:
            r2 = 0
        L_0x005c:
            androidx.appcompat.app.AppCompatActivity r7 = r8.getActivity()
            android.content.Intent r7 = r7.getIntent()
            if (r7 == 0) goto L_0x0069
            r7.removeExtra(r5)
        L_0x0069:
            di3.d r0 = di3.C86312j.m106911c(r0)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r0 = r0.Nt0()
            int r5 = r8.mo5178c3()
            boolean r0 = r0.mo77268h(r5)
            r5 = 1
            if (r2 != 0) goto L_0x00c0
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter r2 = r8.f18796e
            if (r2 == 0) goto L_0x00bc
            r2.mo2515N(r6, r5)
            up1.f r2 = up1.C37521f.f99374d
            r2.getClass()
            pe1.c<java.lang.Integer> r2 = up1.C37521f.f99420i1
            java.lang.Object r2 = r2.mo60266n()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            if (r2 != r5) goto L_0x00ce
            if (r0 == 0) goto L_0x00ce
            rs1.s8$a r0 = rs1.C13442s8.f38060Q0
            androidx.appcompat.app.AppCompatActivity r2 = r8.getActivity()
            rs1.s8 r0 = r0.mo12873f(r2)
            if (r0 == 0) goto L_0x00ce
            java.lang.Class<dp1.y0> r2 = dp1.C58417y0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            java.lang.String r4 = "getService(FinderReportLogic::class.java)"
            gy3.C87412m.m108593f(r2, r4)
            dp1.y0 r2 = (dp1.C58417y0) r2
            te3.hj1 r0 = r0.mo12861q3()
            r4 = 6
            r2.zx0(r0, r4, r6)
            goto L_0x00ce
        L_0x00bc:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x00c0:
            com.tencent.mm.plugin.finder.feed.FinderFollowFeedUIContract$Presenter r0 = r8.f18796e
            if (r0 == 0) goto L_0x011c
            r0.mo2515N(r5, r6)
            java.lang.String r0 = "FinderTwoFlowTimelineUIC"
            java.lang.String r2 = "[onUserVisibleFocused] pass this check"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r2)
        L_0x00ce:
            androidx.appcompat.app.AppCompatActivity r0 = r8.getActivity()
            bl3.r$a r0 = r1.mo62444c(r0)
            java.lang.Class<rs1.s8> r1 = rs1.C13442s8.class
            androidx.lifecycle.i0 r0 = r0.mo75002a(r1)
            rs1.s8 r0 = (rs1.C13442s8) r0
            int r1 = r8.mo5178c3()
            ef1.c r0 = r0.mo12867y3(r1)
            if (r0 == 0) goto L_0x00f4
            ef1.o r1 = new ef1.o
            int r2 = r8.mo5178c3()
            r1.<init>(r2)
            r0.mo83451b(r1)
        L_0x00f4:
            androidx.appcompat.app.AppCompatActivity r0 = r8.getActivity()
            boolean r0 = r0 instanceof com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI
            if (r0 == 0) goto L_0x011b
            androidx.appcompat.app.AppCompatActivity r0 = r8.getActivity()
            boolean r1 = r0 instanceof com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI
            if (r1 == 0) goto L_0x0107
            r3 = r0
            com.tencent.mm.plugin.finder.ui.MMFinderUI r3 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r3
        L_0x0107:
            if (r3 == 0) goto L_0x010d
            int r6 = r3.mo2194I7()
        L_0x010d:
            java.lang.Class<ht1.j5> r0 = ht1.C8777j5.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ht1.j5 r0 = (ht1.C8777j5) r0
            ak1.f0 r0 = r0.getConfig()
            r0.f151419A = r6
        L_0x011b:
            return
        L_0x011c:
            gy3.C87412m.m108603p(r4)
            throw r3
        L_0x0120:
            gy3.C87412m.m108603p(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTwoFlowTimelineUIC.onUserVisibleFocused():void");
    }

    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        ((C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class)).mo11604g3(mo5178c3());
        if (this.f18796e != null) {
            C20480e0 e0Var = C20480e0.f57583a;
            e0Var.mo32045t(mo5178c3());
            e0Var.mo32036i(mo5178c3(), true);
            C58356b0.f167106a.getClass();
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTwoFlowTimelineUIC(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
    }
}
