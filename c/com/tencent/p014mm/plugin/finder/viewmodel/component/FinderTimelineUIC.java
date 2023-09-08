package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0763p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.C75044y4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.wcdb.FileUtils;
import di3.C7335d;
import di3.C86312j;
import dp1.C20480e0;
import dp1.C58356b0;
import dp1.C58417y0;
import dp1.C7453v;
import f40.C86709a0;
import fe1.C45770k;
import fy3.C32224a;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;
import hr1.C8730k;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import je1.C9318i2;
import k20.C60958c;
import k20.C9556a;
import ke1.C9603s;
import kf1.C9860m9;
import kf1.C9878n9;
import kf1.C9881nb;
import lf1.C10500a;
import ob0.C11385n;
import ob0.C117747y;
import org.json.JSONObject;
import os1.C11739f;
import p599lr.C61381b;
import p823sg.C101614i;
import pe3.C89349b;
import rs1.C13383r;
import rs1.C13442s8;
import rx3.C13601g;
import rx3.C36568h;
import te3.C49712hj1;
import te3.C50124kf1;
import te3.C50401mh0;
import te3.C51384te1;
import up1.C37521f;
import uq1.C65430c;
import ve1.C14486c8;
import ve1.C14609q3;
import wc3.C78538u;
import z04.C119027c;

/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderTimelineUIC */
public final class FinderTimelineUIC extends UIComponent implements C45770k, C11385n {

    /* renamed from: i */
    public static boolean f18784i;

    /* renamed from: d */
    public C9860m9 f18785d;

    /* renamed from: e */
    public C9878n9 f18786e;

    /* renamed from: f */
    public final C11739f f18787f;

    /* renamed from: g */
    public final C13601g f18788g = C36568h.m40985a(new C4323c(this));

    /* renamed from: h */
    public boolean f18789h;

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderTimelineUIC$a */
    public static final class C4321a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ LinearLayoutManager f18790d;

        /* renamed from: e */
        public final /* synthetic */ boolean f18791e;

        public C4321a(LinearLayoutManager linearLayoutManager, boolean z) {
            this.f18790d = linearLayoutManager;
            this.f18791e = z;
        }

        public final void run() {
            LinearLayoutManager linearLayoutManager = this.f18790d;
            if (linearLayoutManager != null) {
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                aVar.mo10233c(Integer.valueOf(this.f18791e ^ true ? 1 : 0));
                C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC$onActionbarClick$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                linearLayoutManager.mo16973V(((Integer) aVar.mo10231a(0)).intValue(), ((Integer) aVar.mo10231a(1)).intValue());
                C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC$onActionbarClick$1", "run", "()V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderTimelineUIC$b */
    public static final class C4322b extends C87413o implements C32226l<C59670o2, Boolean> {

        /* renamed from: d */
        public static final C4322b f18792d = new C4322b();

        public C4322b() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C59670o2) obj, LocaleUtil.ITALIAN);
            return Boolean.TRUE;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderTimelineUIC$c */
    public static final class C4323c extends C87413o implements C32224a<Integer> {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelineUIC f18793d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4323c(FinderTimelineUIC finderTimelineUIC) {
            super(0);
            this.f18793d = finderTimelineUIC;
        }

        public Object invoke() {
            Fragment fragment = this.f18793d.getFragment();
            FinderHomeTabFragment finderHomeTabFragment = fragment instanceof FinderHomeTabFragment ? (FinderHomeTabFragment) fragment : null;
            return Integer.valueOf(finderHomeTabFragment != null ? finderHomeTabFragment.f17334o : 0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTimelineUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
        this.f18787f = (C11739f) a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: cm1.j0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: c3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo5171c3(android.content.Intent r18) {
        /*
            r17 = this;
            r0 = r18
            boolean r1 = r17.isUserVisibleFocused()
            if (r1 != 0) goto L_0x0009
            return
        L_0x0009:
            r1 = r17
            kf1.n9 r2 = r1.f18786e
            r3 = 0
            if (r2 == 0) goto L_0x010e
            kf1.nb r2 = (kf1.C9881nb) r2
            androidx.recyclerview.widget.RecyclerView r2 = r2.getRecyclerView()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r4 = r2.getLayoutManager()
            boolean r5 = r4 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r5 == 0) goto L_0x010d
            androidx.recyclerview.widget.LinearLayoutManager r4 = (androidx.recyclerview.widget.LinearLayoutManager) r4
            int r4 = r4.mo16957C()
            androidx.recyclerview.widget.RecyclerView$z r2 = r2.mo17023I0(r4)
            boolean r4 = r2 instanceof jq3.C60905o
            if (r4 == 0) goto L_0x002f
            jq3.o r2 = (jq3.C60905o) r2
            goto L_0x0030
        L_0x002f:
            r2 = r3
        L_0x0030:
            r4 = -1
            if (r0 == 0) goto L_0x003c
            java.lang.String r6 = "KEY_VIDEO_START_PLAY_TIME_MS"
            long r6 = r0.getLongExtra(r6, r4)
            r9 = r6
            goto L_0x003d
        L_0x003c:
            r9 = r4
        L_0x003d:
            if (r0 == 0) goto L_0x0045
            java.lang.String r6 = "KEY_CACHE_OBJECT_ID"
            long r4 = r0.getLongExtra(r6, r4)
        L_0x0045:
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L_0x0050
            int r8 = r2.f44859i
            r11 = 4
            if (r8 != r11) goto L_0x0050
            r8 = 1
            goto L_0x0051
        L_0x0050:
            r8 = 0
        L_0x0051:
            r11 = 0
            java.lang.String r13 = " seekTime="
            java.lang.String r14 = "Finder.TimelineUIC"
            if (r8 == 0) goto L_0x00cc
            r7 = 2131302685(0x7f09191d, float:1.8223463E38)
            android.view.View r7 = r2.mo85812D(r7)
            r8 = r7
            com.tencent.mm.plugin.finder.video.FinderVideoLayout r8 = (com.tencent.p014mm.plugin.finder.video.FinderVideoLayout) r8
            if (r8 == 0) goto L_0x010d
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r0 == 0) goto L_0x0070
            java.lang.String r15 = "KEY_VIDEO_PLAY_SPEED_RATIO"
            float r0 = r0.getFloatExtra(r15, r7)
            goto L_0x0072
        L_0x0070:
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x0072:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r15 = "[checkSeek] video feedId="
            r7.append(r15)
            java.lang.String r4 = o40.C61926c.m72691p(r4)
            r7.append(r4)
            r7.append(r13)
            r7.append(r9)
            java.lang.String r4 = " speedRatio="
            r7.append(r4)
            r7.append(r0)
            java.lang.String r4 = r7.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r4)
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 <= 0) goto L_0x010d
            java.lang.Object r2 = r2.f173503E
            boolean r4 = r2 instanceof cm1.C55018j0
            if (r4 == 0) goto L_0x00a5
            r3 = r2
            cm1.j0 r3 = (cm1.C55018j0) r3
        L_0x00a5:
            if (r3 == 0) goto L_0x00c0
            bl3.r r2 = bl3.C39818r.f106831a
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r4 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            bl3.r$a r2 = r2.mo62446e(r4)
            java.lang.Class<os1.u> r4 = os1.C62168u.class
            androidx.lifecycle.i0 r2 = r2.mo75002a(r4)
            os1.u r2 = (os1.C62168u) r2
            long r4 = r3.getItemId()
            r2.mo87219c3(r4)
            r3.f154481f = r6
        L_0x00c0:
            r11 = 3
            r13 = 0
            r14 = 0
            r15 = 24
            r16 = 0
            r12 = r0
            com.tencent.p014mm.plugin.finder.video.FinderVideoLayout.m65079J(r8, r9, r11, r12, r13, r14, r15, r16)
            goto L_0x010d
        L_0x00cc:
            if (r2 == 0) goto L_0x00d4
            int r0 = r2.f44859i
            r3 = 2
            if (r0 != r3) goto L_0x00d4
            goto L_0x00d5
        L_0x00d4:
            r6 = 0
        L_0x00d5:
            if (r6 == 0) goto L_0x010d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "[checkSeek] photo feedId="
            r0.append(r3)
            java.lang.String r3 = o40.C61926c.m72691p(r4)
            r0.append(r3)
            r0.append(r13)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r14, r0)
            int r0 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r0 <= 0) goto L_0x010d
            r0 = 2131297745(0x7f0905d1, float:1.8213444E38)
            android.view.View r0 = r2.mo85812D(r0)
            com.tencent.mm.plugin.finder.music.FinderImgFeedMusicTag r0 = (com.tencent.p014mm.plugin.finder.music.FinderImgFeedMusicTag) r0
            if (r0 == 0) goto L_0x010d
            em1.b r0 = r0.getPlayer()
            if (r0 == 0) goto L_0x010d
            r0.seekTo(r9)
        L_0x010d:
            return
        L_0x010e:
            java.lang.String r0 = "viewCallback"
            gy3.C87412m.m108603p(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC.mo5171c3(android.content.Intent):void");
    }

    /* renamed from: d3 */
    public final int mo5172d3() {
        C9860m9 m9Var = this.f18785d;
        FinderTimelinePresenter finderTimelinePresenter = null;
        if (m9Var != null) {
            if (m9Var instanceof FinderTimelinePresenter) {
                finderTimelinePresenter = (FinderTimelinePresenter) m9Var;
            }
            if (finderTimelinePresenter != null) {
                return finderTimelinePresenter.mo2601K1();
            }
            return 0;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* renamed from: e3 */
    public final int mo5173e3() {
        return ((Number) this.f18788g.getValue()).intValue();
    }

    /* renamed from: f3 */
    public final void mo5174f3(boolean z) {
        C13442s8 f;
        C13442s8 f2;
        boolean z2 = z;
        Class cls = C58417y0.class;
        C9878n9 n9Var = this.f18786e;
        if (n9Var != null) {
            RecyclerView.LayoutManager layoutManager = ((C9881nb) n9Var).getRecyclerView().getLayoutManager();
            C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            int C = ((LinearLayoutManager) layoutManager).mo16957C();
            C9878n9 n9Var2 = this.f18786e;
            if (n9Var2 != null) {
                RecyclerView.LayoutManager layoutManager2 = ((C9881nb) n9Var2).getRecyclerView().getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager2 instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager2 : null;
                int i = 0;
                int i2 = 1;
                if (linearLayoutManager != null) {
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(0);
                    aVar.mo10233c(Integer.valueOf(z2 ^ true ? 1 : 0));
                    C9556a aVar2 = aVar;
                    C117292a.m165358d(linearLayoutManager, aVar.mo10232b(), "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC", "onActionbarClick", "(Z)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                    i2 = 1;
                    linearLayoutManager.mo16973V(((Integer) aVar2.mo10231a(0)).intValue(), ((Integer) aVar2.mo10231a(1)).intValue());
                    C117292a.m165359e(linearLayoutManager, "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC", "onActionbarClick", "(Z)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                }
                if (C <= -1) {
                    C9878n9 n9Var3 = this.f18786e;
                    if (n9Var3 != null) {
                        ((C9881nb) n9Var3).getRecyclerView().post(new C4321a(linearLayoutManager, z2));
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                }
                if (z2) {
                    C9878n9 n9Var4 = this.f18786e;
                    if (n9Var4 != null) {
                        C9878n9.C9879a.m9643a(n9Var4, 150, false, false, 4, (Object) null);
                        C37521f.f99374d.getClass();
                        if (C37521f.f99420i1.mo60266n().intValue() == i2 && (f2 = C13442s8.f38060Q0.mo12873f(getActivity())) != null) {
                            ((C58417y0) C86312j.m106911c(cls)).zx0(f2.mo12861q3(), 5, mo5173e3());
                        }
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                } else {
                    C37521f.f99374d.getClass();
                    if (C37521f.f99420i1.mo60266n().intValue() == i2 && (f = C13442s8.f38060Q0.mo12873f(getActivity())) != null) {
                        C7335d c = C86312j.m106911c(cls);
                        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                        ((C58417y0) c).zx0(f.mo12861q3(), i2, 0);
                    }
                }
                C14609q3.C14610a aVar3 = C14609q3.f40444e;
                C9878n9 n9Var5 = this.f18786e;
                if (n9Var5 != null) {
                    Fragment fragment = getFragment();
                    FinderHomeTabFragment finderHomeTabFragment = fragment instanceof FinderHomeTabFragment ? (FinderHomeTabFragment) fragment : null;
                    if (finderHomeTabFragment != null) {
                        i = finderHomeTabFragment.f17334o;
                    }
                    aVar3.mo13829a((View) null, n9Var5, i);
                    return;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            C87412m.m108603p("viewCallback");
            throw null;
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
        if (mh02.f138028d == 108) {
            C9860m9 m9Var = this.f18785d;
            if (m9Var != null) {
                ((FinderTimelinePresenter) m9Var).mo2618t3();
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (isUserVisibleFocused() && -1 == i2 && i == 101) {
            mo5171c3(intent);
        }
    }

    public boolean onBackPressed() {
        if (isBelongFragment()) {
            C9860m9 m9Var = this.f18785d;
            if (m9Var != null) {
                C9878n9 n9Var = ((FinderTimelinePresenter) m9Var).f13269j;
                if (n9Var == null) {
                    return false;
                }
                return n9Var.onBackPressed();
            }
            C87412m.m108603p("presenter");
            throw null;
        }
        C9860m9 m9Var2 = this.f18785d;
        if (m9Var2 != null) {
            C9878n9 n9Var2 = ((FinderTimelinePresenter) m9Var2).f13269j;
            if (n9Var2 == null ? false : n9Var2.onBackPressed()) {
                return false;
            }
            getActivity().finish();
            return true;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public void onCreate(Bundle bundle) {
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
        C89349b bVar = C14486c8.f40164d == mo5173e3() ? C14486c8.f40163c : null;
        AppCompatActivity activity = getActivity();
        C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity = (MMActivity) activity;
        Fragment fragment = getFragment();
        this.f18785d = new FinderTimelinePresenter(mMActivity, fragment instanceof FinderHomeTabFragment ? (FinderHomeTabFragment) fragment : null, bVar);
        AppCompatActivity activity2 = getActivity();
        C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        MMActivity mMActivity2 = (MMActivity) activity2;
        C9860m9 m9Var = this.f18785d;
        if (m9Var != null) {
            C9881nb nbVar = new C9881nb(mMActivity2, m9Var, getRootView(), getFragment());
            this.f18786e = nbVar;
            C9860m9 m9Var2 = this.f18785d;
            if (m9Var2 != null) {
                m9Var2.onAttach(nbVar);
                ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12419l();
                ((FinderCommonFeatureService) C86312j.m106911c(cls)).f157802n.mo84535d(104, this);
                ((FinderCommonFeatureService) C86312j.m106911c(cls)).f157802n.mo84535d(108, this);
                int f = C75044y4.m89994f(getActivity());
                int a = C75044y4.m89989a(getActivity());
                ViewGroup.LayoutParams layoutParams = getRootView().findViewById(C0966R.C0970id.f5377di).getLayoutParams();
                C87412m.m108592e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                ((FrameLayout.LayoutParams) layoutParams).topMargin = a + f;
                if (getIntent().getIntExtra("FROM_SCENE_KEY", 2) == 6) {
                    z = true;
                }
                this.f18789h = z;
                return;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public void onCreateAfter(Bundle bundle) {
        Bundle bundle2;
        if (!isBelongFragment()) {
            C78538u.m94868d((MMActivity) getActivity());
        }
        Fragment fragment = getFragment();
        String str = null;
        FinderHomeTabFragment finderHomeTabFragment = fragment instanceof FinderHomeTabFragment ? (FinderHomeTabFragment) fragment : null;
        if (((finderHomeTabFragment == null || (bundle2 = finderHomeTabFragment.f17335p) == null || !bundle2.getBoolean("IsFirstEnterTab", false)) ? false : true) && getIntent().getBooleanExtra("KEY_ROUTE_TO_TOPIC", false)) {
            boolean f3 = this.f18787f.mo11603f3(mo5173e3());
            Log.m105924i("Finder.TimelineUIC", "[onCreateAfter] is go to topic, tabType=" + mo5173e3() + " isAutoRefresh=" + f3);
            C9860m9 m9Var = this.f18785d;
            if (m9Var != null) {
                ((FinderTimelinePresenter) m9Var).mo2610S4(true, true, 0);
                C11739f.C11740a c3 = ((C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class)).mo11600c3(mo5173e3());
                c3.f34374g = System.currentTimeMillis();
                c3.f34376i = C11739f.C11742c.InCacheTime;
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        }
        C9860m9 m9Var2 = this.f18785d;
        if (m9Var2 != null) {
            C8730k kVar = ((FinderTimelinePresenter) m9Var2).f13242B.f161828n;
            if (kVar != null) {
                StringBuilder sb = new StringBuilder();
                Fragment fragment2 = getFragment();
                if (fragment2 != null) {
                    str = fragment2.getClass().getSimpleName();
                }
                sb.append(str);
                sb.append("#onViewFocused");
                C8730k.C8731a.m8556a(kVar, sb.toString(), true, false, 4, (Object) null);
            }
            new FinderTimelineUIC$onCreateAfter$2(this, getActivity()).alive();
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public void onCreateBefore(Bundle bundle) {
        if (!isBelongFragment()) {
            C78538u.m94870f(getActivity());
        }
    }

    public void onDestroy() {
        Class cls = FinderCommonFeatureService.class;
        Log.m105924i("Finder.TimelineUIC", "onDestroy");
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).f157802n.mo84540i(104, this);
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).f157802n.mo84540i(108, this);
        C9860m9 m9Var = this.f18785d;
        C49712hj1 hj12 = null;
        if (m9Var != null) {
            ((FinderTimelinePresenter) m9Var).onDetach();
            C101614i<String, SpannableString> iVar = C0763p.f1802a;
            C0763p.f1802a.clear();
            C9878n9 n9Var = this.f18786e;
            if (n9Var != null) {
                ((C9881nb) n9Var).getRecyclerView().setAdapter((RecyclerView.C16613e) null);
                C20480e0 e0Var = C20480e0.f57583a;
                int e3 = mo5173e3();
                C13442s8 f = C13442s8.f38060Q0.mo12873f(getActivity());
                if (f != null) {
                    hj12 = f.mo12861q3();
                }
                e0Var.mo32047v(e3, hj12);
                e0Var.mo32045t(-1);
                return;
            }
            C87412m.m108603p("viewCallback");
            throw null;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public void onNewIntent(Intent intent) {
        Intent intent2 = intent;
        super.onNewIntent(intent);
        if (intent2 != null) {
            mo5171c3(intent);
            if (intent2.getIntExtra("KEY_TARGET_TAB_TYPE", 0) == mo5173e3()) {
                String stringExtra = intent2.getStringExtra("KEY_BY_PASS_INFO");
                int intExtra = intent2.getIntExtra("KEY_BY_PASS_INFO_TYPE", 0);
                int intExtra2 = intent2.getIntExtra("KEY_SOURCE_TYPE", 0);
                long longExtra = intent2.getLongExtra("KEY_OBJECT_ID", 0);
                String stringExtra2 = intent2.getStringExtra("KEY_OBJECT_NONCE_ID");
                if (stringExtra2 == null) {
                    stringExtra2 = "";
                }
                C9603s sVar = new C9603s();
                if (stringExtra != null) {
                    if (!(!(stringExtra.length() == 0))) {
                        stringExtra = null;
                    }
                    if (stringExtra != null) {
                        byte[] bytes = stringExtra.getBytes(C119027c.f356488a);
                        C87412m.m108593f(bytes, "this as java.lang.String).getBytes(charset)");
                        sVar.f29870c = new C89349b(bytes, 0, bytes.length);
                    }
                }
                sVar.f29871d = Integer.valueOf(intExtra);
                sVar.f29874g = intExtra2;
                sVar.f29872e = longExtra;
                sVar.f29873f = stringExtra2;
                C9860m9 m9Var = this.f18785d;
                if (m9Var != null) {
                    ((FinderTimelinePresenter) m9Var).f13285z.f13845h.f29914i = sVar;
                    if (m9Var != null) {
                        C9860m9.C9861a.m9618a(m9Var, true, true, 0, 4, (Object) null);
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
    }

    public void onPause() {
        String str;
        C51384te1 te12;
        super.onPause();
        C9860m9 m9Var = this.f18785d;
        if (m9Var != null) {
            C20480e0 e0Var = C20480e0.f57583a;
            e0Var.mo32030c();
            ((FinderTimelinePresenter) m9Var).f13275r.dead();
            e0Var.mo32045t(-1);
            C7453v vVar = C7453v.f25647a;
            Activity context = getContext();
            int e3 = mo5173e3();
            int d3 = mo5172d3();
            C87412m.m108594g(context, "context");
            if (!vVar.mo8600a() && e3 == C7453v.f25651e) {
                vVar.mo8605f(context, e3, d3);
            }
            C13442s8 f = C13442s8.f38060Q0.mo12873f(getContext());
            int i = f != null ? f.mo12853i3(mo5173e3()).f134675i : 0;
            C13383r a = C13383r.f37907d.mo12791a();
            a.mo12789a(i, "FinderHomeTabPause");
            ArrayList arrayList = new ArrayList();
            Collection<C13383r.C13386c> values = a.f37910a.values();
            C87412m.m108593f(values, "dispatchFeedMap.values");
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = values.iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (((C13383r.C13386c) next).f37915b != i) {
                    z = false;
                }
                if (z) {
                    arrayList2.add(next);
                }
            }
            arrayList.addAll(arrayList2);
            if (!arrayList.isEmpty()) {
                Iterator it4 = arrayList.iterator();
                while (it4.hasNext()) {
                    C13383r.C13386c cVar = (C13383r.C13386c) it4.next();
                    if (cVar.f37924k < cVar.f37919f) {
                        JSONObject jSONObject = new JSONObject();
                        int i2 = cVar.f37919f;
                        if (i2 == 0) {
                            str = "None";
                        } else if (i2 == 1) {
                            str = "Dispatched";
                        } else if (i2 == 2) {
                            str = "Consumed";
                        } else if (i2 == 3) {
                            str = "Focused";
                        } else if (i2 != 4) {
                            str = "Unknown#" + i2;
                        } else {
                            str = "UnFocused";
                        }
                        jSONObject.put("status", str);
                        jSONObject.put("dispatchFeed", cVar.mo12792a());
                        C10500a aVar = C10500a.f31736a;
                        FinderObject finderObject = cVar.f37914a;
                        long j = finderObject.f164794id;
                        int i3 = cVar.f37915b;
                        C50124kf1 kf12 = finderObject.object_extend;
                        long j2 = (kf12 == null || (te12 = kf12.f136749h) == null) ? 0 : te12.f142157e;
                        String jSONObject2 = jSONObject.toString();
                        C87412m.m108593f(jSONObject2, "jsonObj.toString()");
                        C10500a.m10435a(aVar, 6, j, i3, j2, false, "feed-status", 0, 0, false, jSONObject2, FileUtils.S_IRWXU, (Object) null);
                        cVar.f37924k = cVar.f37919f;
                    }
                }
                return;
            }
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [androidx.recyclerview.widget.RecyclerView$LayoutManager] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r11 = this;
            super.onResume()
            kf1.m9 r0 = r11.f18785d
            r1 = 0
            if (r0 == 0) goto L_0x00c5
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r0 = (com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter) r0
            r0.mo2607Q1()
            boolean r0 = f18784i
            r2 = 0
            if (r0 == 0) goto L_0x0094
            int r0 = r11.mo5173e3()
            r3 = 3
            if (r0 != r3) goto L_0x0094
            java.lang.String r0 = "Finder.TimelineUIC"
            java.lang.String r3 = "[onResume] shouldScrollToPostingItem"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            kf1.n9 r0 = r11.f18786e
            if (r0 == 0) goto L_0x008d
            kf1.nb r0 = (kf1.C9881nb) r0
            androidx.recyclerview.widget.RecyclerView r0 = r0.getRecyclerView()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()
            boolean r3 = r0 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r3 == 0) goto L_0x0035
            r1 = r0
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
        L_0x0035:
            if (r1 == 0) goto L_0x008a
            k20.a r0 = new k20.a
            r0.<init>()
            java.lang.ThreadLocal<k20.a> r3 = k20.C60958c.f173611a
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.mo10233c(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.mo10233c(r3)
            java.lang.Object[] r4 = r0.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC"
            java.lang.String r6 = "onResume"
            java.lang.String r7 = "()V"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "scrollToPositionWithOffset"
            java.lang.String r10 = "(II)V"
            r3 = r1
            j20.C117292a.m165358d(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Object r3 = r0.mo10231a(r2)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = 1
            java.lang.Object r0 = r0.mo10231a(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1.mo16973V(r3, r0)
            java.lang.String r4 = "com/tencent/mm/plugin/finder/viewmodel/component/FinderTimelineUIC"
            java.lang.String r5 = "onResume"
            java.lang.String r6 = "()V"
            java.lang.String r7 = "Undefined"
            java.lang.String r8 = "scrollToPositionWithOffset"
            java.lang.String r9 = "(II)V"
            r3 = r1
            j20.C117292a.m165359e(r3, r4, r5, r6, r7, r8, r9)
        L_0x008a:
            f18784i = r2
            goto L_0x0094
        L_0x008d:
            java.lang.String r0 = "viewCallback"
            gy3.C87412m.m108603p(r0)
            throw r1
        L_0x0094:
            dp1.e0 r0 = dp1.C20480e0.f57583a
            int r1 = r11.mo5173e3()
            r0.mo32043q(r1)
            dp1.v r0 = dp1.C7453v.f25647a
            android.app.Activity r1 = r11.getContext()
            int r3 = r11.mo5173e3()
            int r4 = r11.mo5172d3()
            java.lang.String r5 = "context"
            gy3.C87412m.m108594g(r1, r5)
            boolean r5 = r0.mo8600a()
            if (r5 == 0) goto L_0x00b7
            goto L_0x00c4
        L_0x00b7:
            int r5 = dp1.C7453v.f25651e
            if (r3 != r5) goto L_0x00c2
            boolean r5 = dp1.C7453v.f25649c
            if (r5 != 0) goto L_0x00c2
            r0.mo8604e(r1, r3, r4)
        L_0x00c2:
            dp1.C7453v.f25649c = r2
        L_0x00c4:
            return
        L_0x00c5:
            java.lang.String r0 = "presenter"
            gy3.C87412m.m108603p(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC.onResume():void");
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("Finder.TimelineUIC", "errType " + i + ", errCode " + i2 + ", errMsg " + str);
    }

    public void onStop() {
        super.onStop();
        if (getActivity().isFinishing()) {
            C20480e0 e0Var = C20480e0.f57583a;
            int e3 = mo5173e3();
            C13442s8 f = C13442s8.f38060Q0.mo12873f(getActivity());
            e0Var.mo32047v(e3, f != null ? f.mo12861q3() : null);
            return;
        }
        C20480e0.f57583a.mo32036i(mo5173e3(), false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:202:0x046f  */
    /* JADX WARNING: Removed duplicated region for block: B:212:0x04af  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04e4  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x056f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onUserVisibleFocused() {
        /*
            r38 = this;
            r0 = r38
            java.lang.Class<dp1.y0> r1 = dp1.C58417y0.class
            java.lang.Class<ht1.j5> r2 = ht1.C8777j5.class
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r3 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            super.onUserVisibleFocused()
            boolean r4 = r0.f18789h
            r5 = 4
            if (r4 == 0) goto L_0x0016
            int r4 = r38.mo5173e3()
            if (r4 == r5) goto L_0x002a
        L_0x0016:
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r4 = r4.mo62446e(r3)
            java.lang.Class<os1.f> r6 = os1.C11739f.class
            androidx.lifecycle.i0 r4 = r4.mo75002a(r6)
            os1.f r4 = (os1.C11739f) r4
            r38.mo5173e3()
            r4.getClass()
        L_0x002a:
            bl3.r r4 = bl3.C39818r.f106831a
            bl3.r$a r6 = r4.mo62446e(r3)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler> r7 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler.class
            androidx.lifecycle.i0 r6 = r6.mo75002a(r7)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderVideoRecycler r6 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler) r6
            com.tencent.mm.plugin.finder.viewmodel.component.FinderTimelineUIC$b r7 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC.C4322b.f18792d
            r6.mo80066B0(r7)
            kf1.m9 r6 = r0.f18785d
            java.lang.String r7 = "presenter"
            if (r6 == 0) goto L_0x0597
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r6 = (com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter) r6
            com.tencent.mm.plugin.finder.video.FinderVideoCore r6 = r6.f13242B
            hr1.k r6 = r6.f161828n
            r9 = 1
            r10 = 0
            if (r6 == 0) goto L_0x0071
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            androidx.fragment.app.Fragment r12 = r38.getFragment()
            if (r12 == 0) goto L_0x0061
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getSimpleName()
            goto L_0x0062
        L_0x0061:
            r12 = 0
        L_0x0062:
            r11.append(r12)
            java.lang.String r12 = "#onViewFocused"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            r6.mo9562M0(r11, r10, r9)
        L_0x0071:
            kf1.m9 r6 = r0.f18785d
            if (r6 == 0) goto L_0x0592
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r6 = (com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter) r6
            di3.d r11 = di3.C86312j.m106911c(r2)
            ht1.j5 r11 = (ht1.C8777j5) r11
            ak1.f0 r11 = r11.getConfig()
            java.lang.ref.WeakReference r12 = new java.lang.ref.WeakReference
            kf1.n9 r13 = r6.f13269j
            if (r13 == 0) goto L_0x008c
            androidx.recyclerview.widget.RecyclerView r13 = r13.getRecyclerView()
            goto L_0x008d
        L_0x008c:
            r13 = 0
        L_0x008d:
            r12.<init>(r13)
            r11.f151456f0 = r12
            int r11 = r6.f13272p
            if (r11 != r9) goto L_0x00c1
            di3.d r11 = di3.C86312j.m106911c(r2)
            java.lang.String r12 = "getService(IHellLiveReport::class.java)"
            gy3.C87412m.m108593f(r11, r12)
            r13 = r11
            ht1.j5 r13 = (ht1.C8777j5) r13
            kf1.n9 r11 = r6.f13269j
            if (r11 == 0) goto L_0x00ac
            androidx.recyclerview.widget.RecyclerView r11 = r11.getRecyclerView()
            r14 = r11
            goto L_0x00ad
        L_0x00ac:
            r14 = 0
        L_0x00ad:
            ak1.f0$q r15 = ak1.C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR
            ak1.i r17 = ak1.C0075i.EVENT_ON_RESUME
            r18 = 0
            r19 = 0
            r21 = 0
            r22 = 112(0x70, float:1.57E-43)
            r23 = 0
            java.lang.String r16 = "temp_9"
            ht1.C8777j5.C8778a.m8602c(r13, r14, r15, r16, r17, r18, r19, r21, r22, r23)
        L_0x00c1:
            kf1.o9 r11 = kf1.C9912o9.f30536a
            int r12 = r6.f13272p
            os1.f r13 = r6.f13270n
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r14 = r6.f13285z
            java.lang.String r15 = "tlCache"
            gy3.C87412m.m108594g(r13, r15)
            boolean r13 = r13.mo11603f3(r12)
            if (r13 == 0) goto L_0x0106
            up1.f r13 = up1.C37521f.f99374d
            r13.getClass()
            pe1.c<java.lang.Integer> r13 = up1.C37521f.f99347Z5
            java.lang.Object r13 = r13.mo60266n()
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            if (r13 != r9) goto L_0x00e9
            goto L_0x0106
        L_0x00e9:
            boolean r13 = r11.mo10448b(r12)
            if (r13 == 0) goto L_0x00f5
            if (r14 == 0) goto L_0x0106
            r14.mo2802d()
            goto L_0x0106
        L_0x00f5:
            boolean r13 = r11.mo10449c(r12)
            if (r13 == 0) goto L_0x0106
            boolean r11 = r11.mo10447a(r12)
            if (r11 == 0) goto L_0x0106
            if (r14 == 0) goto L_0x0106
            r14.mo2802d()
        L_0x0106:
            r6.mo2618t3()
            int r11 = r6.f13272p
            r12 = -1
            if (r11 != r5) goto L_0x01e3
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r5 = r6.f13267h
            if (r5 == 0) goto L_0x0120
            android.os.Bundle r5 = r5.f17335p
            if (r5 == 0) goto L_0x0120
            java.lang.String r11 = "RequestScene"
            int r5 = r5.getInt(r11, r12)
            if (r5 != r9) goto L_0x0120
            r5 = 1
            goto L_0x0121
        L_0x0120:
            r5 = 0
        L_0x0121:
            if (r5 == 0) goto L_0x01e3
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r5 = r6.f13285z
            r5.requestInit(r9)
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r5 = r6.f13267h
            android.os.Bundle r5 = r5.f17335p
            if (r5 == 0) goto L_0x0135
            java.lang.String r11 = "ScrollPosition"
            int r5 = r5.getInt(r11, r12)
            goto L_0x0136
        L_0x0135:
            r5 = -1
        L_0x0136:
            java.lang.String r11 = r6.f13249I
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "[onUserVisibleFocused] requestInit after scroll to position["
            r13.append(r14)
            r13.append(r5)
            r14 = 93
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r13)
            jq3.l r11 = r6.mo2599I1()
            if (r11 == 0) goto L_0x015c
            int r11 = r11.mo85796c6()
            goto L_0x015d
        L_0x015c:
            r11 = 0
        L_0x015d:
            int r5 = r5 + r11
            kf1.n9 r11 = r6.f13269j
            if (r11 == 0) goto L_0x016d
            androidx.recyclerview.widget.RecyclerView r11 = r11.getRecyclerView()
            if (r11 == 0) goto L_0x016d
            androidx.recyclerview.widget.RecyclerView$LayoutManager r11 = r11.getLayoutManager()
            goto L_0x016e
        L_0x016d:
            r11 = 0
        L_0x016e:
            boolean r13 = r11 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r13 == 0) goto L_0x0175
            androidx.recyclerview.widget.LinearLayoutManager r11 = (androidx.recyclerview.widget.LinearLayoutManager) r11
            goto L_0x0176
        L_0x0175:
            r11 = 0
        L_0x0176:
            if (r11 == 0) goto L_0x01cb
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r13 = k20.C60958c.f173611a
            java.lang.Integer r13 = java.lang.Integer.valueOf(r10)
            r15.mo10233c(r13)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r15.mo10233c(r5)
            java.lang.Object[] r14 = r15.mo10232b()
            java.lang.String r5 = "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter"
            java.lang.String r16 = "onUserVisibleFocused"
            java.lang.String r17 = "()V"
            java.lang.String r18 = "Undefined"
            java.lang.String r19 = "scrollToPositionWithOffset"
            java.lang.String r20 = "(II)V"
            r13 = r11
            r12 = r15
            r15 = r5
            j20.C117292a.m165358d(r13, r14, r15, r16, r17, r18, r19, r20)
            java.lang.Object r5 = r12.mo10231a(r10)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.Object r12 = r12.mo10231a(r9)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r11.mo16973V(r5, r12)
            java.lang.String r14 = "com/tencent/mm/plugin/finder/feed/FinderTimelinePresenter"
            java.lang.String r15 = "onUserVisibleFocused"
            java.lang.String r16 = "()V"
            java.lang.String r17 = "Undefined"
            java.lang.String r18 = "scrollToPositionWithOffset"
            java.lang.String r19 = "(II)V"
            j20.C117292a.m165359e(r13, r14, r15, r16, r17, r18, r19)
        L_0x01cb:
            com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment r5 = r6.f13267h
            android.os.Bundle r5 = r5.f17335p
            if (r5 == 0) goto L_0x01db
            java.lang.String r11 = "RequestLoadMore"
            boolean r5 = r5.getBoolean(r11, r10)
            if (r5 != r9) goto L_0x01db
            r5 = 1
            goto L_0x01dc
        L_0x01db:
            r5 = 0
        L_0x01dc:
            if (r5 == 0) goto L_0x01e3
            r11 = 0
            r6.mo2606P1(r11)
        L_0x01e3:
            int r5 = r6.f13272p
            java.lang.String r11 = "KEY_FINDER_POST_FINISH_JUMP_FOLLOW_TAB"
            r12 = 3
            if (r5 != r12) goto L_0x0206
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r5 = r6.f13285z
            boolean r5 = r5.f13846i
            if (r5 == 0) goto L_0x0206
            java.lang.String r5 = r6.f13249I
            java.lang.String r13 = "postFeedFlag true"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r5, r13)
            com.tencent.mm.ui.MMActivity r5 = r6.f13266g
            android.content.Intent r5 = r5.getIntent()
            if (r5 == 0) goto L_0x0202
            r5.putExtra(r11, r9)
        L_0x0202:
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r5 = r6.f13285z
            r5.f13846i = r10
        L_0x0206:
            di3.d r5 = di3.C86312j.m106911c(r3)
            com.tencent.mm.plugin.FinderCommonFeatureService r5 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r5
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r5 = r5.Nt0()
            java.lang.String r13 = "TLWxBubble"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r5 = r5.mo77227G5(r13)
            if (r5 == 0) goto L_0x021d
            te3.nn1 r13 = r5.mo77308o2(r13)
            goto L_0x021e
        L_0x021d:
            r13 = 0
        L_0x021e:
            int r14 = r6.f13272p
            java.lang.String r15 = "getService(FinderReportLogic::class.java)"
            if (r9 != r14) goto L_0x02b7
            if (r5 == 0) goto L_0x02b7
            if (r13 == 0) goto L_0x02b7
            er1.m3 r22 = er1.C7832m3.f26372a
            com.tencent.mm.ui.MMActivity r14 = r6.f13266g
            cm1.h r8 = r6.f13255P
            int r12 = r8.f1756g
            int r10 = r8.f1754e
            int r9 = r8.f1755f
            int r8 = r8.f1753d
            r23 = r14
            r24 = r12
            r25 = r10
            r26 = r9
            r27 = r8
            java.lang.CharSequence r8 = r22.mo8947o(r23, r24, r25, r26, r27)
            java.lang.String r29 = r8.toString()
            dp1.v0 r22 = dp1.C58413v0.f167346a
            r26 = 1
            rs1.s8$a r8 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMActivity r9 = r6.f13266g
            rs1.s8 r9 = r8.mo12873f(r9)
            if (r9 == 0) goto L_0x025d
            te3.hj1 r9 = r9.mo12861q3()
            r27 = r9
            goto L_0x025f
        L_0x025d:
            r27 = 0
        L_0x025f:
            cm1.h r9 = r6.f13255P
            int r9 = r9.f1753d
            int r10 = r6.f13272p
            r31 = 0
            r32 = 256(0x100, float:3.59E-43)
            r33 = 0
            java.lang.String r23 = "7"
            r24 = r5
            r25 = r13
            r28 = r9
            r30 = r10
            dp1.C58413v0.m67781i(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            di3.d r5 = di3.C86312j.m106911c(r1)
            gy3.C87412m.m108593f(r5, r15)
            r22 = r5
            dp1.y0 r22 = (dp1.C58417y0) r22
            r24 = 5
            r25 = 1
            int r5 = r13.f184502d
            r27 = 0
            cm1.h r9 = r6.f13255P
            int r9 = r9.f1753d
            r29 = 0
            r30 = 0
            r31 = 0
            com.tencent.mm.ui.MMActivity r10 = r6.f13266g
            rs1.s8 r8 = r8.mo12873f(r10)
            if (r8 == 0) goto L_0x02a4
            te3.hj1 r8 = r8.mo12861q3()
            r33 = r8
            goto L_0x02a6
        L_0x02a4:
            r33 = 0
        L_0x02a6:
            r34 = 0
            r35 = 0
            r36 = 3520(0xdc0, float:4.933E-42)
            r37 = 0
            java.lang.String r23 = "7"
            r26 = r5
            r28 = r9
            dp1.C58417y0.Nx0(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r34, r35, r36, r37)
        L_0x02b7:
            di3.d r5 = di3.C86312j.m106911c(r3)
            com.tencent.mm.plugin.FinderCommonFeatureService r5 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r5
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r5 = r5.Nt0()
            java.lang.String r8 = "TLWxPrivateMsgBubble"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r5 = r5.mo77227G5(r8)
            if (r5 == 0) goto L_0x02d0
            te3.nn1 r8 = r5.mo77308o2(r8)
            r25 = r8
            goto L_0x02d2
        L_0x02d0:
            r25 = 0
        L_0x02d2:
            int r8 = r6.f13272p
            r9 = 1
            if (r9 != r8) goto L_0x0305
            if (r5 == 0) goto L_0x0305
            if (r25 == 0) goto L_0x0305
            dp1.v0 r22 = dp1.C58413v0.f167346a
            r26 = 1
            rs1.s8$a r8 = rs1.C13442s8.f38060Q0
            com.tencent.mm.ui.MMActivity r6 = r6.f13266g
            rs1.s8 r6 = r8.mo12873f(r6)
            if (r6 == 0) goto L_0x02f0
            te3.hj1 r6 = r6.mo12861q3()
            r27 = r6
            goto L_0x02f2
        L_0x02f0:
            r27 = 0
        L_0x02f2:
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 480(0x1e0, float:6.73E-43)
            r33 = 0
            java.lang.String r23 = "7"
            r24 = r5
            dp1.C58413v0.m67781i(r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
        L_0x0305:
            kf1.m9 r5 = r0.f18785d
            if (r5 == 0) goto L_0x058d
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r5 = (com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter) r5
            com.tencent.mm.ui.MMActivity r5 = r5.f13266g
            if (r5 == 0) goto L_0x031b
            android.content.Intent r5 = r5.getIntent()
            if (r5 == 0) goto L_0x031b
            r6 = 0
            boolean r5 = r5.getBooleanExtra(r11, r6)
            goto L_0x031c
        L_0x031b:
            r5 = 0
        L_0x031c:
            kf1.m9 r6 = r0.f18785d
            if (r6 == 0) goto L_0x0588
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r6 = (com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter) r6
            com.tencent.mm.ui.MMActivity r6 = r6.f13266g
            if (r6 == 0) goto L_0x032f
            android.content.Intent r6 = r6.getIntent()
            if (r6 == 0) goto L_0x032f
            r6.removeExtra(r11)
        L_0x032f:
            kf1.m9 r6 = r0.f18785d
            if (r6 == 0) goto L_0x0583
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r6 = (com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter) r6
            com.tencent.mm.ui.MMActivity r6 = r6.f13266g
            java.lang.String r8 = "KEY_FINDER_IS_NEED_REFRESH_TAB"
            if (r6 == 0) goto L_0x0347
            android.content.Intent r6 = r6.getIntent()
            if (r6 == 0) goto L_0x0347
            r9 = 0
            boolean r6 = r6.getBooleanExtra(r8, r9)
            goto L_0x0348
        L_0x0347:
            r6 = 0
        L_0x0348:
            kf1.m9 r9 = r0.f18785d
            if (r9 == 0) goto L_0x057e
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r9 = (com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter) r9
            com.tencent.mm.ui.MMActivity r9 = r9.f13266g
            if (r9 == 0) goto L_0x035b
            android.content.Intent r9 = r9.getIntent()
            if (r9 == 0) goto L_0x035b
            r9.removeExtra(r8)
        L_0x035b:
            kf1.m9 r8 = r0.f18785d
            if (r8 == 0) goto L_0x0579
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r8 = (com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter) r8
            com.tencent.mm.ui.MMActivity r8 = r8.f13266g
            java.lang.String r9 = "KEY_FORCE_NOT_REFRESH_FIRST_TIME"
            if (r8 == 0) goto L_0x0373
            android.content.Intent r8 = r8.getIntent()
            if (r8 == 0) goto L_0x0373
            r10 = 0
            boolean r8 = r8.getBooleanExtra(r9, r10)
            goto L_0x0374
        L_0x0373:
            r8 = 0
        L_0x0374:
            kf1.m9 r10 = r0.f18785d
            if (r10 == 0) goto L_0x0574
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r10 = (com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter) r10
            com.tencent.mm.ui.MMActivity r10 = r10.f13266g
            if (r10 == 0) goto L_0x0387
            android.content.Intent r10 = r10.getIntent()
            if (r10 == 0) goto L_0x0387
            r10.removeExtra(r9)
        L_0x0387:
            java.lang.String r9 = "#onAttach"
            java.lang.String r10 = "Finder.TimelineUIC"
            if (r8 != 0) goto L_0x0454
            di3.d r3 = di3.C86312j.m106911c(r3)
            com.tencent.mm.plugin.FinderCommonFeatureService r3 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r3
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r3 = r3.Nt0()
            int r11 = r38.mo5173e3()
            boolean r3 = r3.mo77268h(r11)
            if (r5 == 0) goto L_0x0405
            int r11 = r38.mo5173e3()
            r12 = 3
            if (r11 == r12) goto L_0x03a9
            goto L_0x0405
        L_0x03a9:
            if (r5 == 0) goto L_0x0454
            int r1 = r38.mo5173e3()
            if (r1 != r12) goto L_0x0454
            kf1.m9 r1 = r0.f18785d
            if (r1 == 0) goto L_0x0400
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r1 = (com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter) r1
            com.tencent.mm.plugin.finder.video.FinderVideoCore r1 = r1.f13242B
            hr1.k r1 = r1.f161828n
            if (r1 == 0) goto L_0x03e1
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            androidx.fragment.app.Fragment r5 = r38.getFragment()
            if (r5 == 0) goto L_0x03d1
            java.lang.Class r5 = r5.getClass()
            java.lang.String r5 = r5.getSimpleName()
            goto L_0x03d2
        L_0x03d1:
            r5 = 0
        L_0x03d2:
            r3.append(r5)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r5 = 1
            r11 = 0
            r1.mo9562M0(r3, r11, r5)
        L_0x03e1:
            kf1.m9 r1 = r0.f18785d
            if (r1 == 0) goto L_0x03fb
            r23 = 1
            r25 = 0
            r27 = 4
            r28 = 0
            r22 = r1
            r24 = r6
            boolean r1 = kf1.C9860m9.C9861a.m9618a(r22, r23, r24, r25, r27, r28)
            java.lang.String r3 = "[onUserVisibleFocused] pass this check"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r3)
            goto L_0x0455
        L_0x03fb:
            gy3.C87412m.m108603p(r7)
            r1 = 0
            throw r1
        L_0x0400:
            r1 = 0
            gy3.C87412m.m108603p(r7)
            throw r1
        L_0x0405:
            kf1.m9 r5 = r0.f18785d
            if (r5 == 0) goto L_0x044f
            r23 = 0
            r24 = 1
            r25 = 0
            r27 = 4
            r28 = 0
            r22 = r5
            boolean r5 = kf1.C9860m9.C9861a.m9618a(r22, r23, r24, r25, r27, r28)
            up1.f r11 = up1.C37521f.f99374d
            r11.getClass()
            pe1.c<java.lang.Integer> r11 = up1.C37521f.f99420i1
            java.lang.Object r11 = r11.mo60266n()
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            r12 = 1
            if (r11 != r12) goto L_0x044d
            if (r3 == 0) goto L_0x044d
            rs1.s8$a r3 = rs1.C13442s8.f38060Q0
            androidx.appcompat.app.AppCompatActivity r11 = r38.getActivity()
            rs1.s8 r3 = r3.mo12873f(r11)
            if (r3 == 0) goto L_0x044d
            di3.d r1 = di3.C86312j.m106911c(r1)
            gy3.C87412m.m108593f(r1, r15)
            dp1.y0 r1 = (dp1.C58417y0) r1
            te3.hj1 r3 = r3.mo12861q3()
            r11 = 6
            r12 = 0
            r1.zx0(r3, r11, r12)
        L_0x044d:
            r1 = r5
            goto L_0x0455
        L_0x044f:
            gy3.C87412m.m108603p(r7)
            r1 = 0
            throw r1
        L_0x0454:
            r1 = 0
        L_0x0455:
            androidx.appcompat.app.AppCompatActivity r3 = r38.getActivity()
            bl3.r$a r3 = r4.mo62444c(r3)
            java.lang.Class<rs1.s8> r4 = rs1.C13442s8.class
            androidx.lifecycle.i0 r3 = r3.mo75002a(r4)
            rs1.s8 r3 = (rs1.C13442s8) r3
            int r4 = r38.mo5173e3()
            ef1.c r3 = r3.mo12867y3(r4)
            if (r3 == 0) goto L_0x04a7
            ef1.o r4 = new ef1.o
            int r5 = r38.mo5173e3()
            r4.<init>(r5)
            kf1.n9 r5 = r0.f18786e
            if (r5 == 0) goto L_0x049f
            kf1.nb r5 = (kf1.C9881nb) r5
            androidx.recyclerview.widget.RecyclerView r5 = r5.getRecyclerView()
            androidx.recyclerview.widget.RecyclerView$LayoutManager r11 = r5.getLayoutManager()
            boolean r12 = r11 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r12 == 0) goto L_0x049b
            androidx.recyclerview.widget.LinearLayoutManager r11 = (androidx.recyclerview.widget.LinearLayoutManager) r11
            int r12 = r11.mo16957C()
            int r11 = r11.mo16959E()
            er1.w3 r13 = er1.C58784w3.f168295a
            java.util.Set<java.lang.Integer> r14 = er1.C58784w3.f168298d
            r13.mo83859C(r5, r12, r11, r14)
        L_0x049b:
            r3.mo83451b(r4)
            goto L_0x04a7
        L_0x049f:
            java.lang.String r1 = "viewCallback"
            gy3.C87412m.m108603p(r1)
            r1 = 0
            throw r1
        L_0x04a7:
            androidx.appcompat.app.AppCompatActivity r3 = r38.getActivity()
            boolean r3 = r3 instanceof com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI
            if (r3 == 0) goto L_0x04cf
            androidx.appcompat.app.AppCompatActivity r3 = r38.getActivity()
            boolean r4 = r3 instanceof com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI
            if (r4 == 0) goto L_0x04ba
            com.tencent.mm.plugin.finder.ui.MMFinderUI r3 = (com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI) r3
            goto L_0x04bb
        L_0x04ba:
            r3 = 0
        L_0x04bb:
            if (r3 == 0) goto L_0x04c2
            int r3 = r3.mo2194I7()
            goto L_0x04c3
        L_0x04c2:
            r3 = 0
        L_0x04c3:
            di3.d r2 = di3.C86312j.m106911c(r2)
            ht1.j5 r2 = (ht1.C8777j5) r2
            ak1.f0 r2 = r2.getConfig()
            r2.f151419A = r3
        L_0x04cf:
            dp1.v r2 = dp1.C7453v.f25647a
            android.app.Activity r3 = r38.getContext()
            int r4 = r38.mo5173e3()
            int r5 = r38.mo5172d3()
            r2.mo8604e(r3, r4, r5)
            kf1.m9 r2 = r0.f18785d
            if (r2 == 0) goto L_0x056f
            r3 = r1 ^ 1
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = (com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter) r2
            java.lang.String r4 = r2.f13249I
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r11 = "setCanAutoPreloadMore: canAutoPreloadMore = "
            r5.append(r11)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r5)
            if (r3 == 0) goto L_0x0503
            r12 = 1
            goto L_0x0504
        L_0x0503:
            r12 = -1
        L_0x0504:
            r2.f13265Z = r12
            if (r1 != 0) goto L_0x053e
            kf1.m9 r2 = r0.f18785d
            if (r2 == 0) goto L_0x0539
            com.tencent.mm.plugin.finder.feed.FinderTimelinePresenter r2 = (com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter) r2
            com.tencent.mm.plugin.finder.video.FinderVideoCore r2 = r2.f13242B
            hr1.k r2 = r2.f161828n
            if (r2 == 0) goto L_0x053e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            androidx.fragment.app.Fragment r4 = r38.getFragment()
            if (r4 == 0) goto L_0x0528
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getSimpleName()
            goto L_0x0529
        L_0x0528:
            r4 = 0
        L_0x0529:
            r3.append(r4)
            r3.append(r9)
            java.lang.String r3 = r3.toString()
            r4 = 1
            r5 = 0
            r2.mo9562M0(r3, r5, r4)
            goto L_0x053e
        L_0x0539:
            gy3.C87412m.m108603p(r7)
            r1 = 0
            throw r1
        L_0x053e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "[onUserVisibleFocused] tabType="
            r2.append(r3)
            int r3 = r38.mo5173e3()
            r2.append(r3)
            java.lang.String r3 = " isAutoFlintToRefresh="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " forceNotRefreshFirstTime="
            r2.append(r1)
            r2.append(r8)
            java.lang.String r1 = " isNeedRefresh="
            r2.append(r1)
            r2.append(r6)
            java.lang.String r1 = r2.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r1)
            return
        L_0x056f:
            gy3.C87412m.m108603p(r7)
            r1 = 0
            throw r1
        L_0x0574:
            r1 = 0
            gy3.C87412m.m108603p(r7)
            throw r1
        L_0x0579:
            r1 = 0
            gy3.C87412m.m108603p(r7)
            throw r1
        L_0x057e:
            r1 = 0
            gy3.C87412m.m108603p(r7)
            throw r1
        L_0x0583:
            r1 = 0
            gy3.C87412m.m108603p(r7)
            throw r1
        L_0x0588:
            r1 = 0
            gy3.C87412m.m108603p(r7)
            throw r1
        L_0x058d:
            r1 = 0
            gy3.C87412m.m108603p(r7)
            throw r1
        L_0x0592:
            r1 = 0
            gy3.C87412m.m108603p(r7)
            throw r1
        L_0x0597:
            r1 = 0
            gy3.C87412m.m108603p(r7)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC.onUserVisibleFocused():void");
    }

    public void onUserVisibleUnFocused() {
        Class cls = C11739f.class;
        Class<FinderCommonFeatureService> cls2 = FinderCommonFeatureService.class;
        super.onUserVisibleUnFocused();
        if (!this.f18789h || mo5173e3() != 4) {
            ((C11739f) C39818r.f106831a.mo62446e(cls2).mo75002a(cls)).mo11604g3(mo5173e3());
        } else {
            C11739f.C11740a c3 = ((C11739f) C39818r.f106831a.mo62446e(cls2).mo75002a(cls)).mo11600c3(mo5173e3());
            c3.f34376i = C11739f.C11742c.ShareRecommend;
            c3.f34375h = System.currentTimeMillis();
        }
        C9860m9 m9Var = this.f18785d;
        if (m9Var != null) {
            ((FinderTimelinePresenter) m9Var).mo2608R1();
            C20480e0 e0Var = C20480e0.f57583a;
            e0Var.mo32045t(mo5173e3());
            e0Var.mo32036i(mo5173e3(), true);
            C58356b0.f167106a.getClass();
            C7453v.f25647a.mo8605f(getContext(), mo5173e3(), mo5172d3());
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTimelineUIC(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
        this.f18787f = (C11739f) a;
    }
}
