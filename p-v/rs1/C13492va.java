package rs1;

import ak1.C0075i;
import ak1.C54067f0;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0740i2;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.feed.model.FinderLbsLoader;
import com.tencent.p014mm.plugin.finder.feed.model.internal.BaseFeedLoader;
import com.tencent.p014mm.plugin.finder.model.BaseFinderFeed;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderVideoRecycler;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.RefreshLoadMoreLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import com.tencent.xweb.util.WXWebReporter;
import di3.C7335d;
import di3.C86312j;
import dp1.C20480e0;
import dp1.C58417y0;
import eb0.C31543z5;
import fe1.C8014g;
import fy3.C32226l;
import gr1.C59670o2;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ht1.C8777j5;
import java.util.ArrayList;
import java.util.Iterator;
import jq3.C9496f;
import kf1.C10004u9;
import kf1.C10017v9;
import kf1.C10028w9;
import kf1.C10045x9;
import kf1.C9675ca;
import kf1.C9720fa;
import kf1.C9749ga;
import kf1.C9782ha;
import kf1.C9880na;
import kf1.C9941qa;
import kf1.C9957r9;
import kf1.C9976s9;
import kf1.C9988t9;
import o40.C61926c;
import os1.C11739f;
import os1.C62153d;
import pe3.C89349b;
import up1.C37521f;

/* renamed from: rs1.va */
public final class C13492va extends UIComponent {

    /* renamed from: d */
    public C9720fa f38222d;

    /* renamed from: e */
    public C9957r9 f38223e;

    /* renamed from: f */
    public C9941qa f38224f;

    /* renamed from: g */
    public final C62153d f38225g;

    /* renamed from: h */
    public boolean f38226h = true;

    /* renamed from: i */
    public boolean f38227i = true;

    /* renamed from: rs1.va$a */
    public static final class C13493a extends C87413o implements C32226l<C59670o2, Boolean> {

        /* renamed from: d */
        public static final C13493a f38228d = new C13493a();

        public C13493a() {
            super(1);
        }

        public Object invoke(Object obj) {
            C87412m.m108594g((C59670o2) obj, LocaleUtil.ITALIAN);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13492va(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…alLocationVM::class.java)");
        this.f38225g = (C62153d) a;
    }

    /* renamed from: c3 */
    public final void mo12901c3() {
        if (this.f38227i) {
            this.f38227i = false;
            C9720fa faVar = this.f38222d;
            if (faVar != null) {
                faVar.mo10319e(100, false);
            }
            C9957r9 r9Var = this.f38223e;
            if (r9Var != null) {
                r9Var.mo10457e(100, false);
            }
            ((C58417y0) C86312j.m106911c(C58417y0.class)).Hx0(getActivity(), 5);
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aqj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r7 = r7.f14080b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            r0 = 501(0x1f5, float:7.02E-43)
            if (r7 != r0) goto L_0x0044
            r7 = -1
            if (r8 != r7) goto L_0x0044
            if (r9 == 0) goto L_0x0044
            kf1.fa r7 = r6.f38222d
            if (r7 == 0) goto L_0x0044
            kf1.q9 r8 = r7.mo10325q()
            androidx.recyclerview.widget.RecyclerView r2 = r8.getRecyclerView()
            if (r2 == 0) goto L_0x0044
            er1.w3 r8 = er1.C58784w3.f168295a
            com.tencent.mm.plugin.finder.feed.model.FinderTimelineFeedLoader r3 = r7.f30152i
            r4 = 0
            kf1.oa r5 = kf1.C9913oa.f30537d
            r0 = r8
            r1 = r9
            com.tencent.mm.plugin.finder.feed.model.w0 r7 = r0.mo83951n1(r1, r2, r3, r4, r5)
            f40.o r9 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r9 = r9.mo121142i()
            r0 = 2
            com.tencent.mm.storage.y1$a r8 = r8.mo83914a0(r0)
            if (r7 == 0) goto L_0x003c
            pe3.b r7 = r7.f14080b
            if (r7 == 0) goto L_0x003c
            byte[] r7 = r7.mo123703f()
            goto L_0x003d
        L_0x003c:
            r7 = 0
        L_0x003d:
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.encodeHexString(r7)
            r9.mo119677K(r8, r7)
        L_0x0044:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rs1.C13492va.onActivityResult(int, int, android.content.Intent):void");
    }

    public void onCreate(Bundle bundle) {
        Class cls = C8014g.class;
        Class<C60200t1> cls2 = C60200t1.class;
        super.onCreate(bundle);
        C37521f.f99374d.getClass();
        if (C37521f.f99306V0.mo60266n().intValue() == 1) {
            AppCompatActivity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            C9720fa faVar = new C9720fa((MMActivity) activity, (FinderHomeTabFragment) getFragment());
            this.f38222d = faVar;
            AppCompatActivity activity2 = getActivity();
            C87412m.m108592e(activity2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            C9941qa qaVar = new C9941qa((MMActivity) activity2, faVar, getRootView());
            faVar.f30148e = qaVar;
            faVar.mo10325q().mo10294d(faVar.f30152i.getDataListJustForAdapter());
            faVar.f30152i.register(faVar.f30153j);
            if (((C8014g) C39818r.f106831a.mo62446e(cls2).mo62447c(cls)).mo9103H()) {
                faVar.f30149f.mo11600c3(2).f34369b.size();
                BaseFeedLoader.requestInit$default(faVar.f30152i, false, 1, (Object) null);
                RecyclerView recyclerView = faVar.mo10325q().getRecyclerView();
                if (recyclerView != null) {
                    recyclerView.mo17043c(new C9782ha(faVar));
                }
            } else {
                RefreshLoadMoreLayout.C7080c cVar = new RefreshLoadMoreLayout.C7080c(0);
                cVar.f24947b = -2;
                C61926c.m72668M(new C9749ga(cVar, faVar));
            }
            this.f38224f = qaVar;
            return;
        }
        AppCompatActivity activity3 = getActivity();
        C87412m.m108592e(activity3, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C9957r9 r9Var = new C9957r9((MMActivity) activity3, (FinderHomeTabFragment) getFragment());
        this.f38223e = r9Var;
        AppCompatActivity activity4 = getActivity();
        C87412m.m108592e(activity4, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        C9675ca caVar = new C9675ca((MMActivity) activity4, r9Var, getRootView());
        r9Var.f30612j = C31543z5.m39453c();
        r9Var.f30608f = caVar;
        C39818r rVar = C39818r.f106831a;
        FinderLbsLoader finderLbsLoader = new FinderLbsLoader(((C13442s8) rVar.mo62444c(r9Var.f30606d).mo75002a(C13442s8.class)).mo12861q3());
        finderLbsLoader.setInitDone(new C9988t9(finderLbsLoader, r9Var));
        finderLbsLoader.f13670d = new C10004u9(r9Var);
        r9Var.f30607e = finderLbsLoader;
        r9Var.mo10460t().mo10294d(r9Var.mo10459q().getDataListJustForAdapter());
        r9Var.mo10459q().register(r9Var.f30616q);
        if (((C8014g) rVar.mo62446e(cls2).mo62447c(cls)).mo9103H()) {
            r9Var.f30609g.mo11600c3(1000).f34370c.size();
            r9Var.mo10459q().requestInit(false);
            RecyclerView recyclerView2 = r9Var.mo10460t().getRecyclerView();
            if (recyclerView2 != null) {
                recyclerView2.mo17043c(new C10017v9(r9Var));
            }
        } else {
            RefreshLoadMoreLayout.C7080c cVar2 = new RefreshLoadMoreLayout.C7080c(0);
            cVar2.f24947b = -2;
            C61926c.m72668M(new C9976s9(cVar2, r9Var));
        }
        RecyclerView recyclerView3 = r9Var.mo10460t().getRecyclerView();
        if (recyclerView3 != null) {
            C9496f.m9181b(recyclerView3, new C10028w9(r9Var), C10045x9.f30785d);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5.C8778a.m8602c((C8777j5) c, (RecyclerView) null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR, "temp_10", C0075i.EVENT_ON_DESTROY, 0, 0, 0, 112, (Object) null);
        C9720fa faVar = this.f38222d;
        if (faVar != null) {
            faVar.onDetach();
        }
        C9957r9 r9Var = this.f38223e;
        if (r9Var != null) {
            r9Var.onDetach();
        }
        C20480e0 e0Var = C20480e0.f57583a;
        C13442s8 f = C13442s8.f38060Q0.mo12873f(getActivity());
        e0Var.mo32047v(2, f != null ? f.mo12861q3() : null);
    }

    public void onFinished() {
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        super.onFinished();
        C9720fa faVar = this.f38222d;
        if (!(faVar == null || (recyclerView2 = faVar.mo10325q().getRecyclerView()) == null)) {
            int n = faVar.mo10321n(recyclerView2);
            Log.m105924i("Finder.TimelineLbsPresenter", "[onFinishing] position=" + n + " totalDy=" + faVar.f30151h);
            Iterator it = faVar.f30152i.getDataListJustForAdapter().iterator();
            while (it.hasNext()) {
                C0740i2 i2Var = (C0740i2) it.next();
                if (i2Var instanceof BaseFinderFeed) {
                    ((BaseFinderFeed) i2Var).mo3482P();
                }
            }
            C11739f.m11436j3(faVar.f30149f, 2, 0, faVar.f30151h, faVar.f30152i.getDataListJustForAdapter(), (ArrayList) null, (C89349b) null, false, false, 240, (Object) null);
        }
        C9957r9 r9Var = this.f38223e;
        if (r9Var != null && (recyclerView = r9Var.mo10460t().getRecyclerView()) != null) {
            int n2 = r9Var.mo10458n(recyclerView);
            Log.m105924i("Finder.FinderTimelineLbsMixPresenter", "[onFinishing] position=" + n2 + " totalDy=" + r9Var.f30611i);
            C11739f.m11436j3(r9Var.f30609g, 1000, n2, r9Var.f30611i, new ArrayList(0), r9Var.mo10459q().getDataListJustForAdapter(), (C89349b) null, false, false, WXWebReporter.WXWEB_IDKEY_DEBUG_LINK_ALL, (Object) null);
        }
    }

    public void onPause() {
        super.onPause();
        this.f38226h = this.f38225g.mo9103H();
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        C9941qa qaVar = this.f38224f;
        C8777j5.C8778a.m8602c(j5Var, qaVar != null ? qaVar.getRecyclerView() : null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR, "temp_10", C0075i.EVENT_ON_PAUSE, 0, 0, 0, 112, (Object) null);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C87412m.m108594g(strArr, "permissions");
        C87412m.m108594g(iArr, "grantResults");
        if (i != 79) {
            return;
        }
        if (iArr[0] == 0) {
            mo12901c3();
        } else {
            ((C58417y0) C86312j.m106911c(C58417y0.class)).Hx0(getActivity(), 3);
        }
    }

    public void onResume() {
        super.onResume();
        if (!this.f38226h && this.f38225g.mo9103H()) {
            mo12901c3();
        }
        C20480e0.f57583a.mo32043q(2);
        C7335d c = C86312j.m106911c(C8777j5.class);
        C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
        C8777j5 j5Var = (C8777j5) c;
        C9941qa qaVar = this.f38224f;
        C8777j5.C8778a.m8602c(j5Var, qaVar != null ? qaVar.getRecyclerView() : null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR, "temp_10", C0075i.EVENT_ON_RESUME, 0, 0, 0, 112, (Object) null);
    }

    public void onUserVisibleFocused() {
        C13442s8 f;
        Class cls = C58417y0.class;
        Class cls2 = FinderCommonFeatureService.class;
        super.onUserVisibleFocused();
        C39818r rVar = C39818r.f106831a;
        ((C11739f) rVar.mo62446e(cls2).mo75002a(C11739f.class)).getClass();
        C9720fa faVar = this.f38222d;
        if (faVar != null) {
            C61926c.m72656A((String) null, new C9880na(faVar));
            if (faVar.f30155o) {
                ((C58417y0) C86312j.m106911c(cls)).Hx0(faVar.f30147d, 1);
            }
        }
        C9957r9 r9Var = this.f38223e;
        if (r9Var != null) {
            if (r9Var.f30614o) {
                ((C58417y0) C86312j.m106911c(cls)).Hx0(r9Var.f30606d, 1);
            }
            ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77239M5("finder_tl_nearby_tab");
            ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77263e("finder_tl_nearby_tab", "onRefreshEnd");
        }
        ((FinderVideoRecycler) rVar.mo62446e(cls2).mo75002a(FinderVideoRecycler.class)).mo80066B0(C13493a.f38228d);
        this.f38225g.mo9105q2(false);
        if (((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77268h(2)) {
            Log.m105924i("Finder.TimelineLbsUIC", "[onUserVisibleFocused] tabType=2 autoFlingToRefresh");
            C9720fa faVar2 = this.f38222d;
            if (faVar2 != null) {
                faVar2.mo10319e(0, false);
            }
            C9957r9 r9Var2 = this.f38223e;
            if (r9Var2 != null) {
                r9Var2.mo10457e(0, false);
            }
            C37521f.f99374d.getClass();
            if (C37521f.f99420i1.mo60266n().intValue() == 1 && (f = C13442s8.f38060Q0.mo12873f(getActivity())) != null) {
                C7335d c = C86312j.m106911c(cls);
                C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                ((C58417y0) c).zx0(f.mo12861q3(), 6, 0);
            }
        }
        ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77239M5("finder_tl_nearby_tab");
    }

    public void onUserVisibleUnFocused() {
        super.onUserVisibleUnFocused();
        ((C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class)).mo11604g3(2);
    }
}
