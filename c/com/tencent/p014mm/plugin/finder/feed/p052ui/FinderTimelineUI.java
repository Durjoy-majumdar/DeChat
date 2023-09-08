package com.tencent.p014mm.plugin.finder.feed.p052ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.MenuItem;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0120a0;
import androidx.lifecycle.C39622i0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bl3.C39818r;
import cm1.C0763p;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2479n0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2492u0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.feed.FinderTimelinePresenter;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.view.C56597e1;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTimelineUIC;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72994y1;
import di3.C7335d;
import di3.C86312j;
import dp1.C20480e0;
import dp1.C58413v0;
import dp1.C58417y0;
import er1.C58739j4;
import er1.C58784w3;
import f40.C86709a0;
import fe1.C45770k;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.util.HashMap;
import je1.C9318i2;
import k20.C60958c;
import k20.C9556a;
import kf1.C9860m9;
import kf1.C9878n9;
import kf1.C9881nb;
import kotlin.Metadata;
import lc3.C10485b;
import o40.C61926c;
import ob0.C11385n;
import ob0.C117747y;
import os1.C62153d;
import p599lr.C61381b;
import p646pn.C110234e;
import p823sg.C101614i;
import pe3.C89349b;
import rs1.C13442s8;
import rs1.C63545b1;
import rx3.C13598b0;
import te3.C49712hj1;
import te3.C50401mh0;
import te3.C51827wf3;
import te3.C64586nn1;
import up1.C37521f;
import uq1.C65430c;
import ve1.C14609q3;
import vf1.C14763f5;
import vf1.C14768g5;
import vf1.C14774h5;
import vf1.C14778i5;
import vo3.C90852c;
import wc3.C78538u;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderTimelineUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lfe1/k;", "Lob0/n;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTimelineUI */
public final class FinderTimelineUI extends MMFinderUI implements C45770k, C11385n {

    /* renamed from: x */
    public static final /* synthetic */ int f14865x = 0;

    /* renamed from: o */
    public C9860m9 f14866o;

    /* renamed from: p */
    public C9878n9 f14867p;

    /* renamed from: q */
    public String f14868q;

    /* renamed from: r */
    public final int f14869r = 1;

    /* renamed from: s */
    public final int f14870s = 2;

    /* renamed from: t */
    public final int f14871t = 3;

    /* renamed from: u */
    public boolean f14872u;

    /* renamed from: v */
    public final C62153d f14873v;

    /* renamed from: w */
    public HashMap<Integer, C51827wf3> f14874w;

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTimelineUI$a */
    public static final class C3073a extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C3073a f14875d = new C3073a();

        public C3073a() {
            super(0);
        }

        public Object invoke() {
            Log.m105925i("Finder.FinderTimelineUI", "initialize packageInfo:%s", BuildInfo.info());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTimelineUI$b */
    public static final class C3074b implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelineUI f14876d;

        public C3074b(FinderTimelineUI finderTimelineUI) {
            this.f14876d = finderTimelineUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f14876d.onBackPressed();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTimelineUI$c */
    public static final class C3075c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelineUI f14877d;

        public C3075c(FinderTimelineUI finderTimelineUI) {
            this.f14877d = finderTimelineUI;
        }

        public final void run() {
            C9878n9 n9Var = this.f14877d.f14867p;
            if (n9Var != null) {
                RecyclerView.LayoutManager layoutManager = ((C9881nb) n9Var).getRecyclerView().getLayoutManager();
                C87412m.m108592e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                if (((LinearLayoutManager) layoutManager).mo16957C() <= 12) {
                    C9878n9 n9Var2 = this.f14877d.f14867p;
                    if (n9Var2 != null) {
                        RecyclerView recyclerView = ((C9881nb) n9Var2).getRecyclerView();
                        C9556a aVar = new C9556a();
                        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                        aVar.mo10233c(1);
                        RecyclerView recyclerView2 = recyclerView;
                        C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderTimelineUI$onCreate$3", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                        recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                        C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/feed/ui/FinderTimelineUI$onCreate$3", "run", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                } else {
                    C9878n9 n9Var3 = this.f14877d.f14867p;
                    if (n9Var3 != null) {
                        RecyclerView recyclerView3 = ((C9881nb) n9Var3).getRecyclerView();
                        C9556a aVar2 = new C9556a();
                        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                        aVar2.mo10233c(1);
                        RecyclerView recyclerView4 = recyclerView3;
                        C117292a.m165358d(recyclerView4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderTimelineUI$onCreate$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                        recyclerView3.mo17115r1(((Integer) aVar2.mo10231a(0)).intValue());
                        C117292a.m165359e(recyclerView4, "com/tencent/mm/plugin/finder/feed/ui/FinderTimelineUI$onCreate$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                    } else {
                        C87412m.m108603p("viewCallback");
                        throw null;
                    }
                }
                C14609q3.C14610a aVar3 = C14609q3.f40444e;
                FinderTimelineUI finderTimelineUI = this.f14877d;
                C9878n9 n9Var4 = finderTimelineUI.f14867p;
                if (n9Var4 != null) {
                    C9860m9 m9Var = finderTimelineUI.f14866o;
                    if (m9Var != null) {
                        aVar3.mo13829a((View) null, n9Var4, ((FinderTimelinePresenter) m9Var).f13272p);
                    } else {
                        C87412m.m108603p("presenter");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            } else {
                C87412m.m108603p("viewCallback");
                throw null;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTimelineUI$d */
    public static final class C3076d implements Runnable {

        /* renamed from: d */
        public static final C3076d f14878d = new C3076d();

        public final void run() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTimelineUI$e */
    public static final class C3077e extends C2492u0 {

        /* renamed from: e */
        public final /* synthetic */ FinderTimelineUI f14879e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C3077e(FinderTimelineUI finderTimelineUI) {
            super(false, 1, (C8480h) null);
            this.f14879e = finderTimelineUI;
        }

        /* renamed from: a */
        public void mo2472a(C2479n0.C2480a aVar) {
            StringBuilder sb = new StringBuilder();
            sb.append("[MENU_ID_PROFILE] red=");
            sb.append(aVar != null && aVar.f12908a);
            Log.m105924i("Finder.FinderTimelineUI", sb.toString());
            if (aVar != null && aVar.f12908a) {
                if (C2483o0.C2484a.m2362a(C2483o0.f12984a, (String) null, 1, (Object) null)[3] > 0) {
                    this.f14879e.getController().mo177057M0(this.f14879e.f14869r, true);
                    return;
                }
                this.f14879e.getController().mo177057M0(this.f14879e.f14869r, false);
                Log.m105928w("Finder.FinderTimelineUI", "has red dot,but not count.");
                C115669n.INSTANCE.mo175913w(1347, 1, 1);
                return;
            }
            this.f14879e.getController().mo177057M0(this.f14879e.f14869r, false);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderTimelineUI$f */
    public static final class C3078f<T> implements C0120a0 {

        /* renamed from: d */
        public final /* synthetic */ FinderTimelineUI f14880d;

        public C3078f(FinderTimelineUI finderTimelineUI) {
            this.f14880d = finderTimelineUI;
        }

        public void onChanged(Object obj) {
            C2479n0.C2480a aVar = (C2479n0.C2480a) obj;
            StringBuilder sb = new StringBuilder();
            sb.append("[MENU_ID_POST] red=");
            sb.append(aVar != null && aVar.f12908a);
            Log.m105924i("Finder.FinderTimelineUI", sb.toString());
            if (aVar != null && aVar.f12908a) {
                this.f14880d.getController().mo177057M0(this.f14880d.f14870s, true);
            } else {
                this.f14880d.getController().mo177057M0(this.f14880d.f14870s, false);
            }
        }
    }

    public FinderTimelineUI() {
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62153d.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…alLocationVM::class.java)");
        this.f14873v = (C62153d) a;
        this.f14874w = new HashMap<>();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.aqn;
    }

    /* renamed from: i4 */
    public void mo3121i4(C50401mh0 mh02, int i, int i2) {
        C87412m.m108594g(mh02, "cmdItem");
        if (mh02.f138028d == 108) {
            C9860m9 m9Var = this.f14866o;
            if (m9Var != null) {
                m9Var.mo2618t3();
            } else {
                C87412m.m108603p("presenter");
                throw null;
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        Log.m105924i("Finder.FinderTimelineUI", "[onActivityResult] requestCode=" + i + " resultCode=" + i2);
        if (i == 500) {
            C56597e1 e1Var = ((C63545b1) C39818r.f106831a.mo62444c(this).mo75002a(C63545b1.class)).f180225d;
            if (e1Var != null) {
                e1Var.mo79925c(i, i2, intent);
            }
        } else if (i == 563) {
            this.f14873v.mo9105q2(false);
        } else if (i != 564) {
            super.onActivityResult(i, i2, intent);
        } else {
            this.f14872u = this.f14873v.mo9103H();
        }
    }

    public void onBackPressed() {
        C9860m9 m9Var = this.f14866o;
        if (m9Var != null) {
            C9878n9 n9Var = ((FinderTimelinePresenter) m9Var).f13269j;
            if (n9Var != null) {
                n9Var.onBackPressed();
                return;
            }
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        Class cls = C58417y0.class;
        Class cls2 = FinderCommonFeatureService.class;
        supportRequestWindowFeature(109);
        super.onCreate(bundle);
        String stringExtra = getIntent().getStringExtra("key_context_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f14868q = stringExtra;
        C58417y0 y0Var = (C58417y0) C86312j.m106911c(cls);
        String str = this.f14868q;
        C49712hj1 hj12 = null;
        if (str != null) {
            y0Var.N40(str, "OnCreate");
            boolean z = false;
            ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77273m(getIntent().getIntExtra("FROM_SCENE_KEY", 2), false);
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
            setMMTitle(getContext().getResources().getString(C0966R.string.esc));
            C61926c.m72658C((String) null, C3073a.f14875d, 1, (Object) null);
            setBackBtn(new C3074b(this));
            FinderTimelinePresenter finderTimelinePresenter = new FinderTimelinePresenter(this, (FinderHomeTabFragment) null, (C89349b) null);
            this.f14866o = finderTimelinePresenter;
            View contentView = getContentView();
            C87412m.m108593f(contentView, "contentView");
            C9881nb nbVar = new C9881nb(this, finderTimelinePresenter, contentView, (Fragment) null);
            this.f14867p = nbVar;
            C9860m9 m9Var = this.f14866o;
            if (m9Var != null) {
                m9Var.onAttach(nbVar);
                ((C61381b) C86312j.m106911c(C61381b.class)).mo78545UQ().mo12419l();
                ((FinderCommonFeatureService) C86312j.m106911c(cls2)).f157802n.mo84535d(104, this);
                ((FinderCommonFeatureService) C86312j.m106911c(cls2)).f157802n.mo84535d(108, this);
                C78538u.m94868d(this);
                setTitleBarClickListener(new C3075c(this), C3076d.f14878d);
                if (((FinderCommonFeatureService) C86312j.m106911c(cls2)).mo76879tO()) {
                    C64586nn1 R5 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77246R5("TLCamera");
                    C55718s0 G5 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77227G5("TLCamera");
                    C58784w3 w3Var = C58784w3.f168295a;
                    C58739j4 j4Var = C58739j4.f168176a;
                    if (!(R5 == null || G5 == null)) {
                        C58413v0 v0Var = C58413v0.f167346a;
                        C13442s8.C13443a aVar = C13442s8.f38060Q0;
                        C13442s8 f = aVar.mo12873f(this);
                        C58413v0.m67781i(v0Var, "2", G5, R5, 1, f != null ? f.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
                        C7335d c = C86312j.m106911c(cls);
                        C87412m.m108593f(c, "getService(FinderReportLogic::class.java)");
                        C58417y0 y0Var2 = (C58417y0) c;
                        C13442s8 f2 = aVar.mo12873f(this);
                        C58417y0.Nx0(y0Var2, "2", 2, 1, 1, 1, 0, (String) null, (String) null, 0, f2 != null ? f2.mo12861q3() : null, 0, 0, 3520, (Object) null);
                    }
                    removeOptionMenu(this.f14870s);
                    addIconOptionMenu(this.f14870s, -1, (int) C0966R.raw.icons_outlined_camera, (MenuItem.OnMenuItemClickListener) new C14763f5(R5, G5, this));
                } else {
                    removeOptionMenu(this.f14871t);
                    C37521f.f99374d.getClass();
                    if (((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107404b("FinderFeedCameraShowPostEducation", 1) == 1) {
                        z = true;
                    }
                    if (z) {
                        addIconOptionMenu(this.f14871t, -1, (int) C0966R.raw.finder_no_permission_post_camera, (MenuItem.OnMenuItemClickListener) new C14778i5(this));
                    }
                }
                removeOptionMenu(this.f14869r);
                C64586nn1 R52 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77246R5("TLPersonalCenter");
                C55718s0 G52 = ((FinderCommonFeatureService) C86312j.m106911c(cls2)).Nt0().mo77227G5("TLPersonalCenter");
                addIconOptionMenu(this.f14869r, -1, (int) C0966R.raw.icons_outlined_me, (MenuItem.OnMenuItemClickListener) new C14768g5(R52, G52, this), (View.OnLongClickListener) C14774h5.f40755d);
                C58784w3 w3Var2 = C58784w3.f168295a;
                C58739j4 j4Var2 = C58739j4.f168176a;
                if (!(R52 == null || G52 == null)) {
                    C58413v0 v0Var2 = C58413v0.f167346a;
                    C13442s8.C13443a aVar2 = C13442s8.f38060Q0;
                    C13442s8 f3 = aVar2.mo12873f(this);
                    C58413v0.m67781i(v0Var2, "2", G52, R52, 1, f3 != null ? f3.mo12861q3() : null, 0, (String) null, 0, 0, 480, (Object) null);
                    C7335d c2 = C86312j.m106911c(cls);
                    C87412m.m108593f(c2, "getService(FinderReportLogic::class.java)");
                    C58417y0 y0Var3 = (C58417y0) c2;
                    String str2 = G52.field_tipsId;
                    C13442s8 f4 = aVar2.mo12873f(this);
                    if (f4 != null) {
                        hj12 = f4.mo12861q3();
                    }
                    C58417y0.Nx0(y0Var3, "2", 1, 1, 1, 2, 0, str2, (String) null, 0, hj12, 0, 0, 3456, (Object) null);
                }
                C2479n0 n0Var = C2479n0.f12955a;
                C61926c.m72695t(C2479n0.f12965k, this, new C3077e(this));
                C61926c.m72695t(C2479n0.f12958d, this, new C3078f(this));
                return;
            }
            C87412m.m108603p("presenter");
            throw null;
        }
        C87412m.m108603p("contextId");
        throw null;
    }

    public void onDestroy() {
        Class cls = FinderCommonFeatureService.class;
        super.onDestroy();
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).f157802n.mo84540i(104, this);
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).f157802n.mo84540i(108, this);
        C9860m9 m9Var = this.f14866o;
        if (m9Var != null) {
            ((FinderTimelinePresenter) m9Var).onDetach();
            C101614i<String, SpannableString> iVar = C0763p.f1802a;
            C0763p.f1802a.clear();
            C58417y0 y0Var = (C58417y0) C86312j.m106911c(C58417y0.class);
            String str = this.f14868q;
            if (str != null) {
                y0Var.N40(str, "Exit");
            } else {
                C87412m.m108603p("contextId");
                throw null;
            }
        } else {
            C87412m.m108603p("presenter");
            throw null;
        }
    }

    public void onPause() {
        Class cls = C110234e.class;
        super.onPause();
        C9860m9 m9Var = this.f14866o;
        if (m9Var != null) {
            C20480e0.f57583a.mo32030c();
            ((FinderTimelinePresenter) m9Var).f13275r.dead();
            if (((C110234e) C86312j.m106911c(cls)).mo161398Zc() != null) {
                ((C110234e) C86312j.m106911c(cls)).mo161398Zc().mo22761a(102, false, false);
                return;
            }
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public void onResume() {
        super.onResume();
        boolean z = this.f14872u;
        boolean H = this.f14873v.mo9103H();
        this.f14872u = H;
        if (H && !z) {
            this.f14873v.mo9105q2(false);
        }
        C9860m9 m9Var = this.f14866o;
        if (m9Var != null) {
            ((FinderTimelinePresenter) m9Var).mo2607Q1();
            if (FinderTimelineUIC.f18784i) {
                C9878n9 n9Var = this.f14867p;
                if (n9Var != null) {
                    RecyclerView recyclerView = ((C9881nb) n9Var).getRecyclerView();
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(1);
                    RecyclerView recyclerView2 = recyclerView;
                    C117292a.m165358d(recyclerView2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/ui/FinderTimelineUI", "onResume", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                    recyclerView.mo17149t1(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(recyclerView2, "com/tencent/mm/plugin/finder/feed/ui/FinderTimelineUI", "onResume", "()V", "Undefined", "smoothScrollToPosition", "(I)V");
                    FinderTimelineUIC.f18784i = false;
                    return;
                }
                C87412m.m108603p("viewCallback");
                throw null;
            }
            return;
        }
        C87412m.m108603p("presenter");
        throw null;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Log.m105924i("Finder.FinderTimelineUI", "errType " + i + ", errCode " + i2 + ", errMsg " + str);
    }
}
