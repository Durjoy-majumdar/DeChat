package com.tencent.p014mm.plugin.finder.viewmodel.component;

import a14.C53934p0;
import ak1.C0075i;
import ak1.C54067f0;
import android.app.Activity;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.C112919c0;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C39622i0;
import androidx.lifecycle.C39623j;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.C103853a;
import bl3.C0317e;
import bl3.C39818r;
import cm1.C55012e1;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.FinderTabSelectedEvent;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.FinderCommonFeatureService;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2483o0;
import com.tencent.p014mm.plugin.finder.extension.reddot.C2490t;
import com.tencent.p014mm.plugin.finder.extension.reddot.C55718s0;
import com.tencent.p014mm.plugin.finder.extension.reddot.FinderRedDotManager;
import com.tencent.p014mm.plugin.finder.feed.p052ui.FinderProfileUI;
import com.tencent.p014mm.plugin.finder.feed.p052ui.OccupyFinderUI5;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeAffinityUI;
import com.tencent.p014mm.plugin.finder.p056ui.FinderHomeUI;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderCareTabFragment;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderFollowTabFragment;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderFriendTabFragment;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderMachineTabFragment;
import com.tencent.p014mm.plugin.finder.utils.FinderFolderClearManager;
import com.tencent.p014mm.plugin.finder.view.C4194v2;
import com.tencent.p014mm.plugin.finder.view.FinderFragmentChangeObserver;
import com.tencent.p014mm.plugin.finder.view.FinderViewPager;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.xlog.app.XLogSetup;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import dp1.C20480e0;
import dp1.C58358d0;
import dp1.C58413v0;
import dp1.C7437g0;
import dp1.C7453v;
import eb0.C31543z5;
import eb0.C75592q0;
import f40.C86709a0;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C8478d0;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60165e4;
import ht1.C60204t3;
import ht1.C8777j5;
import ht1.C8808v4;
import j20.C117292a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import k20.C9557b;
import kf1.C9878n9;
import kf1.C9916p2;
import kf1.C9934q2;
import kotlin.Metadata;
import ky2.C10432i;
import ky2.C10439o;
import lc3.C10485b;
import m53.C10756c;
import m53.C10762h;
import o40.C61926c;
import os1.C11739f;
import os1.C62163m;
import os1.C62170x;
import p192l4.C10462b;
import rs1.C13392r4;
import rs1.C13442s8;
import rs1.C36472fb;
import rs1.C63555gb;
import rx3.C13598b0;
import rx3.C13601g;
import rx3.C13604l;
import rx3.C36568h;
import sr1.C64164c;
import sx3.C64186f0;
import sx3.C64197v;
import t91.C64208c;
import te3.C50687oi1;
import te3.C64586nn1;
import up1.C37521f;
import wx3.C15601d;
import wx3.C66212f;
import ye1.C15977q;
import zc1.C66785b;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0004j\b\u0012\u0004\u0012\u00020\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC;", "Lcom/tencent/mm/ui/component/UIComponent;", "Lcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;", "getActiveFragment", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "fragments", "Ljava/util/ArrayList;", "f3", "()Ljava/util/ArrayList;", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC */
public final class FinderHomeUIC extends UIComponent {

    /* renamed from: d */
    public boolean f18647d;

    /* renamed from: e */
    public boolean f18648e;

    /* renamed from: f */
    public boolean f18649f;
    private final ArrayList<FinderHomeTabFragment> fragments;

    /* renamed from: g */
    public final C13601g f18650g = C36568h.m40985a(new C4274i(this));

    /* renamed from: h */
    public final List<Integer> f18651h;

    /* renamed from: i */
    public final C11739f f18652i;

    /* renamed from: j */
    public final CopyOnWriteArraySet<C4194v2> f18653j;

    /* renamed from: n */
    public final C4265a f18654n;

    /* renamed from: o */
    public final IListener<FinderTabSelectedEvent> f18655o;

    /* renamed from: p */
    public boolean f18656p;

    /* renamed from: q */
    public final FinderHomeUIC$networkReceiver$1 f18657q;

    /* renamed from: r */
    public boolean f18658r;

    /* renamed from: s */
    public boolean f18659s;

    /* renamed from: t */
    public C10439o f18660t;

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC$a */
    public static final class C4265a extends FinderFragmentChangeObserver {

        /* renamed from: d */
        public final /* synthetic */ AppCompatActivity f18661d;

        /* renamed from: e */
        public final /* synthetic */ FinderHomeUIC f18662e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4265a(AppCompatActivity appCompatActivity, FinderHomeUIC finderHomeUIC, ArrayList<FinderHomeTabFragment> arrayList) {
            super((MMActivity) appCompatActivity, arrayList);
            this.f18661d = appCompatActivity;
            this.f18662e = finderHomeUIC;
            C87412m.m108592e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        }

        /* renamed from: k */
        public void mo5077k(int i, int i2, int i3, int i4) {
            C9557b bVar = new C9557b();
            bVar.mo10235b(i);
            bVar.mo10235b(i2);
            bVar.mo10235b(i3);
            bVar.mo10235b(i4);
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$1", "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$com/tencent/mm/plugin/finder/view/FinderFragmentChangeObserver", "onFragmentChange", "(IIII)V", this, bVar.mo10234a());
            if (i != -1) {
                C58358d0.m67593e(C58358d0.f167115a, true, false, 2, (Object) null);
            }
            FinderHomeUIC finderHomeUIC = this.f18662e;
            C11739f fVar = finderHomeUIC.f18652i;
            fVar.f34362i = i4;
            fVar.f34363j = i4;
            finderHomeUIC.getClass();
            C39622i0 a = C39818r.f106831a.mo62444c(this.f18661d).mo75002a(C13392r4.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…ActionBarUIC::class.java)");
            ((C13392r4) a).mo12806l3(i2);
            for (C4194v2 k : this.f18662e.f18653j) {
                k.mo5077k(i, i2, i3, i4);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$1", "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$com/tencent/mm/plugin/finder/view/FinderFragmentChangeObserver", "onFragmentChange", "(IIII)V");
        }

        public void onPageScrollStateChanged(int i) {
            for (C4194v2 onPageScrollStateChanged : this.f18662e.f18653j) {
                onPageScrollStateChanged.onPageScrollStateChanged(i);
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
            for (C4194v2 onPageScrolled : this.f18662e.f18653j) {
                onPageScrolled.onPageScrolled(i, f, i2);
            }
        }

        /* renamed from: v */
        public void mo5078v(boolean z, int i, FinderHomeTabFragment finderHomeTabFragment) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Boolean.valueOf(z));
            arrayList.add(Integer.valueOf(i));
            arrayList.add(finderHomeTabFragment);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$1", "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$com/tencent/mm/plugin/finder/view/FinderFragmentChangeObserver", "onUserVisibleFragmentChange", "(ZILcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;)V", this, array);
            C87412m.m108594g(finderHomeTabFragment, "fragment");
            if (z) {
                AppCompatActivity appCompatActivity = this.f18661d;
                FinderProfileUI finderProfileUI = appCompatActivity instanceof FinderProfileUI ? (FinderProfileUI) appCompatActivity : null;
                boolean N7 = finderProfileUI != null ? finderProfileUI.mo3097N7() : false;
                String str = ((C8777j5) C86312j.m106911c(C8777j5.class)).getConfig().f151431M.get(finderHomeTabFragment.getClass().getName());
                if (!N7 && str != null) {
                    C64208c.f181960j = finderHomeTabFragment.getClass().getName();
                }
            }
            for (C4194v2 v : this.f18662e.f18653j) {
                v.mo5078v(z, i, finderHomeTabFragment);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$1", "com/tencent/mm/plugin/finder/viewmodel/component/FinderHomeUIC$fragmentChangeObserver$com/tencent/mm/plugin/finder/view/FinderFragmentChangeObserver", "onUserVisibleFragmentChange", "(ZILcom/tencent/mm/plugin/finder/ui/fragment/FinderHomeTabFragment;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC$b */
    public static final class C4266b extends C87413o implements C32226l<FinderHomeTabFragment, Boolean> {

        /* renamed from: d */
        public final /* synthetic */ FinderHomeUIC f18663d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4266b(FinderHomeUIC finderHomeUIC) {
            super(1);
            this.f18663d = finderHomeUIC;
        }

        public Object invoke(Object obj) {
            FinderHomeTabFragment finderHomeTabFragment = (FinderHomeTabFragment) obj;
            C87412m.m108594g(finderHomeTabFragment, LocaleUtil.ITALIAN);
            return Boolean.valueOf(this.f18663d.f18651h.contains(Integer.valueOf(finderHomeTabFragment.f17334o)));
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC$c */
    public static final class C4267c extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderHomeUIC f18664d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4267c(FinderHomeUIC finderHomeUIC) {
            super(0);
            this.f18664d = finderHomeUIC;
        }

        public Object invoke() {
            boolean isFinishing = this.f18664d.getActivity().isFinishing();
            Log.m105924i("Finder.HomeUIC", "initOtherTabFragment: isActivityFinishing=" + isFinishing);
            if (!isFinishing) {
                FinderHomeTabFragment activeFragment = this.f18664d.getActiveFragment();
                C103853a adapter = this.f18664d.mo5133i3().f42966a.getAdapter();
                C64164c cVar = adapter instanceof C64164c ? (C64164c) adapter : null;
                if (cVar != null) {
                    ArrayList<FinderHomeTabFragment> f3 = this.f18664d.mo5130f3();
                    ArrayList arrayList = new ArrayList();
                    for (T next : f3) {
                        if (!C87412m.m108589b((FinderHomeTabFragment) next, activeFragment)) {
                            arrayList.add(next);
                        }
                    }
                    Log.m105924i("FinderFragmentPagerAdapter", "setFragmentMaxLifeToResume: fragmentSize=" + arrayList.size());
                    if (!arrayList.isEmpty()) {
                        if (cVar.f181883i.isStateSaved()) {
                            Log.m105928w("FinderFragmentPagerAdapter", "setFragmentMaxLifeToResume: fragmentManager is save state");
                        } else {
                            try {
                                C112919c0 beginTransaction = cVar.f181883i.beginTransaction();
                                C87412m.m108593f(beginTransaction, "fm.beginTransaction()");
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    Fragment fragment = (Fragment) it.next();
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("setFragmentMaxLifeToResume: tabType=");
                                    FinderHomeTabFragment finderHomeTabFragment = fragment instanceof FinderHomeTabFragment ? (FinderHomeTabFragment) fragment : null;
                                    sb.append(finderHomeTabFragment != null ? Integer.valueOf(finderHomeTabFragment.f17334o) : null);
                                    sb.append(", attachedFragmentManager=");
                                    sb.append(fragment.getFragmentManager());
                                    sb.append(", currentFragmentManager=");
                                    sb.append(cVar.f181883i);
                                    Log.m105924i("FinderFragmentPagerAdapter", sb.toString());
                                    beginTransaction.mo165170n(fragment, C39623j.C39626c.RESUMED);
                                }
                                beginTransaction.mo165162d();
                            } catch (Throwable th) {
                                Log.printErrStackTrace("FinderFragmentPagerAdapter", th, "setFragmentMaxLifeToResume: ", new Object[0]);
                                if (BuildInfo.IS_FLAVOR_PURPLE || BuildInfo.IS_FLAVOR_RED || BuildInfo.DEBUG) {
                                    throw new RuntimeException("setFragmentMaxLifeToResume: crash, ", th);
                                }
                            }
                        }
                    }
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC$d */
    public static final class C4268d extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C4268d f18665d = new C4268d();

        public C4268d() {
            super(0);
        }

        public Object invoke() {
            Log.m105924i("Finder.HomeUIC", "buildInfo=" + BuildInfo.info() + ", LogSync=" + XLogSetup.appendIsSync + " isExDeviceEnv=" + C75592q0.m90795y() + " inTabletEnv=" + C85875k4.m106210y());
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC$e */
    public static final class C4269e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderHomeUIC f18666d;

        /* renamed from: e */
        public final /* synthetic */ C8478d0 f18667e;

        public C4269e(FinderHomeUIC finderHomeUIC, C8478d0 d0Var) {
            this.f18666d = finderHomeUIC;
            this.f18667e = d0Var;
        }

        public final void run() {
            C39622i0 a = C39818r.f106831a.mo62444c(this.f18666d.getActivity()).mo75002a(C13392r4.class);
            C87412m.m108593f(a, "UICProvider.of(activity)…ActionBarUIC::class.java)");
            ((C13392r4) a).mo12806l3(this.f18666d.mo5131g3(this.f18667e.f27483d));
            FinderHomeUIC finderHomeUIC = this.f18666d;
            finderHomeUIC.f18654n.onPageSelected(finderHomeUIC.mo5131g3(this.f18667e.f27483d));
            this.f18666d.mo5127c3(true);
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC$f */
    public static final class C4270f implements Runnable {

        /* renamed from: d */
        public static final C4270f f18668d = new C4270f();

        /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC$f$a */
        public static final class C4271a implements C10762h<Long> {
            /* renamed from: a */
            public void mo605a(int i, int i2, String str) {
            }

            public void onSuccess(Object obj) {
                if (((Number) obj).longValue() > 0) {
                    ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0().mo77231I5();
                }
            }
        }

        public final void run() {
            if (!C86709a0.m107535s().mo121142i().mo119686g(C72994y1.C72995a.USERINFO_FINDER_LIVE_HAS_GET_REWARD_BOOLEAN_SYNC, false)) {
                C37521f.f99374d.getClass();
                if (C37521f.f99397f5.mo60266n().intValue() == 1) {
                    ((C10756c) C86709a0.m107533q(C10756c.class)).mo10996d4(new C4271a());
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC$g */
    public static final class C4272g extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public static final C4272g f18669d = new C4272g();

        public C4272g() {
            super(0);
        }

        public Object invoke() {
            FinderFolderClearManager.f161637a.mo79382a();
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC$h */
    public static final class C4273h implements C10439o {

        /* renamed from: d */
        public final /* synthetic */ FinderHomeUIC f18670d;

        public C4273h(FinderHomeUIC finderHomeUIC) {
            this.f18670d = finderHomeUIC;
        }

        public final void onDataChanged() {
            if (((C10432i) C86312j.m106911c(C10432i.class)).mo10750e()) {
                this.f18670d.f18647d = true;
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC$i */
    public static final class C4274i extends C87413o implements C32224a<C15977q> {

        /* renamed from: d */
        public final /* synthetic */ FinderHomeUIC f18671d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4274i(FinderHomeUIC finderHomeUIC) {
            super(0);
            this.f18671d = finderHomeUIC;
        }

        public Object invoke() {
            View findViewById = this.f18671d.findViewById(C0966R.C0970id.kkz);
            int i = C0966R.C0970id.f358291e83;
            FrameLayout frameLayout = (FrameLayout) C10462b.m10395a(findViewById, C0966R.C0970id.f358291e83);
            if (frameLayout != null) {
                FrameLayout frameLayout2 = (FrameLayout) findViewById;
                i = C0966R.C0970id.l89;
                FinderViewPager finderViewPager = (FinderViewPager) C10462b.m10395a(findViewById, C0966R.C0970id.l89);
                if (finderViewPager != null) {
                    i = C0966R.C0970id.lq6;
                    TextView textView = (TextView) C10462b.m10395a(findViewById, C0966R.C0970id.lq6);
                    if (textView != null) {
                        return new C15977q(frameLayout2, frameLayout, frameLayout2, finderViewPager, textView);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderHomeUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C66785b bVar = C66785b.f191882e;
        C50687oi1 oi12 = bVar.mo90673n0().mo62397b().f140461E;
        Integer num = null;
        List<Integer> list = oi12 != null ? oi12.f139197e : null;
        this.f18651h = list == null ? C64186f0.f181907d : list;
        FinderHomeTabFragment[] finderHomeTabFragmentArr = new FinderHomeTabFragment[3];
        C37521f.f99374d.getClass();
        finderHomeTabFragmentArr[0] = C37521f.f99315W0.mo60266n().intValue() == 2 ? new FinderCareTabFragment() : new FinderFollowTabFragment();
        finderHomeTabFragmentArr[1] = new FinderFriendTabFragment();
        finderHomeTabFragmentArr[2] = new FinderMachineTabFragment();
        ArrayList<FinderHomeTabFragment> c = C64197v.m75534c(finderHomeTabFragmentArr);
        C50687oi1 oi13 = bVar.mo90673n0().mo62397b().f140461E;
        StringBuilder sb = new StringBuilder();
        sb.append("close_recommend=");
        sb.append(oi13 != null ? Integer.valueOf(oi13.f139196d) : null);
        sb.append(" tab_type_to_close=");
        sb.append(oi13 != null ? oi13.f139197e : null);
        sb.append(" follow_tab_style=");
        sb.append(oi13 != null ? Integer.valueOf(oi13.f139198f) : num);
        sb.append(' ');
        Log.m105924i("Finder.HomeUIC", sb.toString());
        C61926c.m72673R(c, new C4266b(this));
        this.fragments = c;
        C39622i0 a = C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class);
        C87412m.m108593f(a, "UICProvider.of(FinderCom…meTabStateVM::class.java)");
        this.f18652i = (C11739f) a;
        this.f18653j = new CopyOnWriteArraySet<>();
        this.f18654n = new C4265a(appCompatActivity, this, c);
        this.f18655o = new FinderHomeUIC$eventListener$1(this, C40008f.f107254d);
        this.f18657q = new FinderHomeUIC$networkReceiver$1(this);
        this.f18659s = true;
        this.f18660t = new C4273h(this);
    }

    /* renamed from: c3 */
    public final void mo5127c3(boolean z) {
        C63555gb gbVar = (C63555gb) C39818r.f106831a.mo62444c(getActivity()).mo75002a(C63555gb.class);
        gbVar.f180242f = this.fragments;
        C0317e.launch$default(gbVar, (C66212f) null, (C53934p0) null, new C36472fb(gbVar, z, (C15601d<? super C36472fb>) null), 3, (Object) null);
    }

    /* renamed from: d3 */
    public final int mo5128d3() {
        int i = 1;
        if (getActivity() instanceof OccupyFinderUI5) {
            return 1;
        }
        if (this.f18658r) {
            return getActiveFragment().f17334o;
        }
        if (!(getIntent().getBooleanExtra("KEY_FINDER_POST_FINISH_JUMP_FOLLOW_TAB", false) || getIntent().getBooleanExtra("KEY_FINDER_POST_FINISH_JUMP_FRIEND_TAB", false) || getIntent().getBooleanExtra("KEY_FINDER_POST_FINISH_JUMP_HOT_TAB", false))) {
            return ((C11739f) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C11739f.class)).mo11602e3();
        }
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_FINDER_POST_FINISH_JUMP_FOLLOW_TAB", false);
        boolean booleanExtra2 = getIntent().getBooleanExtra("KEY_FINDER_POST_FINISH_JUMP_FRIEND_TAB", false);
        boolean booleanExtra3 = getIntent().getBooleanExtra("KEY_FINDER_POST_FINISH_JUMP_HOT_TAB", false);
        if (booleanExtra) {
            i = 3;
        } else if (!booleanExtra2) {
            i = booleanExtra3 ? 4 : -1;
        }
        return i;
    }

    /* renamed from: e3 */
    public final FinderHomeTabFragment mo5129e3(int i) {
        Iterator<FinderHomeTabFragment> it = this.fragments.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().f17334o == i) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return this.fragments.get(i2);
        }
        Log.m105920e("Finder.HomeUIC", "[getFragmentByTabType] type=" + i + " is invalid.");
        return null;
    }

    /* renamed from: f3 */
    public final ArrayList<FinderHomeTabFragment> mo5130f3() {
        return this.fragments;
    }

    /* renamed from: g3 */
    public final int mo5131g3(int i) {
        Iterator<FinderHomeTabFragment> it = this.fragments.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            if (it.next().f17334o == i) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        Log.m105920e("Finder.HomeUIC", "[getIndex] type=" + i + " is invalid.");
        C50687oi1 oi12 = C66785b.f191882e.mo90673n0().mo62397b().f140461E;
        return (oi12 == null || oi12.f139196d != 1) ? 0 : 1;
    }

    public final FinderHomeTabFragment getActiveFragment() {
        FinderViewPager finderViewPager = mo5133i3().f42966a;
        C87412m.m108593f(finderViewPager, "uiBinding.viewPager");
        FinderHomeTabFragment finderHomeTabFragment = this.fragments.get(finderViewPager.getCurrentItem());
        C87412m.m108593f(finderHomeTabFragment, "fragments[index]");
        return finderHomeTabFragment;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359695ad0;
    }

    /* renamed from: i3 */
    public final C15977q mo5133i3() {
        return (C15977q) this.f18650g.getValue();
    }

    /* renamed from: j3 */
    public final void mo5134j3() {
        if (getActivity() instanceof FinderHomeUI) {
            C37521f.f99374d.getClass();
            if (C37521f.f99398f6.mo60266n().intValue() == 1 && !this.f18649f) {
                this.f18649f = true;
                C61926c.m72666K(0, new C4267c(this));
            }
        }
    }

    /* renamed from: k3 */
    public final void mo5135k3(int i, Bundle bundle) {
        int g3 = mo5131g3(i);
        boolean z = false;
        if (g3 >= 0 && g3 < this.fragments.size()) {
            z = true;
        }
        if (z) {
            if (bundle != null) {
                this.fragments.get(g3).f17335p = bundle;
            }
            C11739f fVar = this.f18652i;
            fVar.f34362i = i;
            fVar.f34363j = i;
            mo5133i3().f42966a.setCurrentItem(g3);
        }
    }

    /* renamed from: l3 */
    public final void mo5136l3(int i, boolean z, Bundle bundle) {
        int g3 = mo5131g3(i);
        boolean z2 = false;
        if (g3 >= 0 && g3 < this.fragments.size()) {
            z2 = true;
        }
        if (z2) {
            if (bundle != null) {
                this.fragments.get(g3).f17335p = bundle;
            }
            C11739f fVar = this.f18652i;
            fVar.f34362i = i;
            fVar.f34363j = i;
            mo5133i3().f42966a.setCurrentItem(g3, z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01b0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r1 = r22
            java.lang.Class<com.tencent.mm.plugin.FinderCommonFeatureService> r2 = com.tencent.p014mm.plugin.FinderCommonFeatureService.class
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC$d r0 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC.C4268d.f18665d
            r3 = 0
            r4 = 1
            o40.C61926c.m72658C(r3, r0, r4, r3)
            kt1.a r0 = kt1.C61166a.f174128a
            r0.mo86103b()
            up1.f r0 = up1.C37521f.f99374d
            r0.getClass()
            f40.o r0 = f40.C86709a0.m107535s()
            com.tencent.mm.storage.v1 r0 = r0.mo121142i()
            com.tencent.mm.storage.y1$a r5 = com.tencent.p014mm.storage.C72994y1.C72995a.USERINFO_FINDER_HAS_ENTER_MULTI_TAB_INT_SYNC
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)
            r0.mo119677K(r5, r6)
            gy3.d0 r5 = new gy3.d0
            r5.<init>()
            androidx.appcompat.app.AppCompatActivity r0 = r22.getActivity()
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r6 = "KEY_FINDER_POST_FINISH_JUMP_FOLLOW_TAB"
            r7 = 0
            boolean r0 = r0.getBooleanExtra(r6, r7)
            r6 = 4
            if (r0 == 0) goto L_0x003f
            r0 = 3
            goto L_0x0069
        L_0x003f:
            androidx.appcompat.app.AppCompatActivity r0 = r22.getActivity()
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r8 = "KEY_FINDER_POST_FINISH_JUMP_FRIEND_TAB"
            boolean r0 = r0.getBooleanExtra(r8, r7)
            if (r0 == 0) goto L_0x0051
            r0 = 1
            goto L_0x0069
        L_0x0051:
            androidx.appcompat.app.AppCompatActivity r0 = r22.getActivity()
            android.content.Intent r0 = r0.getIntent()
            java.lang.String r8 = "KEY_FINDER_POST_FINISH_JUMP_HOT_TAB"
            boolean r0 = r0.getBooleanExtra(r8, r7)
            if (r0 == 0) goto L_0x0063
            r0 = 4
            goto L_0x0069
        L_0x0063:
            os1.f r0 = r1.f18652i
            int r0 = r0.mo11602e3()
        L_0x0069:
            r5.f27483d = r0
            os1.f r8 = r1.f18652i
            boolean r8 = r8.mo11603f3(r0)
            com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderTabSelectedEvent> r0 = r1.f18655o
            r0.alive()
            java.lang.String r9 = "Finder.HomeUIC"
            if (r8 == 0) goto L_0x01bf
            android.content.Intent r0 = r22.getIntent()
            java.lang.String r10 = "FLOAT_BALL_KEY"
            java.lang.String r0 = r0.getStringExtra(r10)
            if (r0 == 0) goto L_0x008f
            int r0 = r0.length()
            if (r0 != 0) goto L_0x008d
            goto L_0x008f
        L_0x008d:
            r0 = 0
            goto L_0x0090
        L_0x008f:
            r0 = 1
        L_0x0090:
            r0 = r0 ^ r4
            int r10 = r5.f27483d
            pe1.c<java.lang.Integer> r11 = up1.C37521f.f99416h6
            java.lang.Object r11 = r11.mo60266n()
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            if (r11 != r4) goto L_0x00cf
            bl3.r r11 = bl3.C39818r.f106831a
            bl3.r$a r11 = r11.mo62446e(r2)
            java.lang.Class<com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore> r12 = com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore.class
            androidx.lifecycle.i0 r11 = r11.mo75002a(r12)
            com.tencent.mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore r11 = (com.tencent.p014mm.plugin.finder.preload.tabPreload.FinderStreamTabPreloadCore) r11
            do1.h r10 = r11.mo78457f3(r10)
            if (r10 == 0) goto L_0x00ca
            do1.h$a r10 = r10.f167040p
            if (r10 == 0) goto L_0x00ca
            je1.n1$d r10 = r10.f167044b
            if (r10 == 0) goto L_0x00ca
            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderObject> r10 = r10.f146069d
            if (r10 == 0) goto L_0x00ca
            boolean r10 = r10.isEmpty()
            r10 = r10 ^ r4
            if (r10 != r4) goto L_0x00ca
            r10 = 1
            goto L_0x00cb
        L_0x00ca:
            r10 = 0
        L_0x00cb:
            if (r10 != 0) goto L_0x00cf
            r10 = 1
            goto L_0x00d0
        L_0x00cf:
            r10 = 0
        L_0x00d0:
            if (r0 != 0) goto L_0x00f9
            if (r10 == 0) goto L_0x00f9
            di3.d r11 = di3.C86312j.m106911c(r2)
            com.tencent.mm.plugin.FinderCommonFeatureService r11 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r11
            com.tencent.mm.plugin.finder.extension.reddot.FinderRedDotManager r11 = r11.Nt0()
            java.lang.String r12 = "FinderEntrance"
            com.tencent.mm.plugin.finder.extension.reddot.s0 r11 = r11.mo77227G5(r12)
            if (r11 == 0) goto L_0x00ed
            te3.yi1 r12 = r11.f158585F
            if (r12 == 0) goto L_0x00ed
            int r12 = r12.f186541C
            goto L_0x00ee
        L_0x00ed:
            r12 = 0
        L_0x00ee:
            if (r11 == 0) goto L_0x00f2
            r11 = 1
            goto L_0x00f3
        L_0x00f2:
            r11 = 0
        L_0x00f3:
            if (r11 == 0) goto L_0x00f7
            if (r12 != r4) goto L_0x00fb
        L_0x00f7:
            r13 = 1
            goto L_0x00fc
        L_0x00f9:
            r11 = 0
            r12 = 0
        L_0x00fb:
            r13 = 0
        L_0x00fc:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "onCreate: showUnreadCacheFeed="
            r14.append(r15)
            r14.append(r13)
            java.lang.String r15 = ", withoutPreloadAndOpenSwitch="
            r14.append(r15)
            r14.append(r10)
            java.lang.String r10 = ", refreshPrefetchStatus="
            r14.append(r10)
            r14.append(r12)
            java.lang.String r10 = ", hasEntranceRedDot="
            r14.append(r10)
            r14.append(r11)
            java.lang.String r10 = ", isFromFloatBall="
            r14.append(r10)
            r14.append(r0)
            java.lang.String r0 = r14.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r0)
            bl3.r r0 = bl3.C39818r.f106831a
            bl3.r$a r10 = r0.mo62446e(r2)
            java.lang.Class<os1.u> r11 = os1.C62168u.class
            androidx.lifecycle.i0 r10 = r10.mo75002a(r11)
            os1.u r10 = (os1.C62168u) r10
            r10.getClass()
            java.lang.String r11 = "Finder.VideoStateCacheVM"
            java.lang.String r12 = "[clearProgress]"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r11, r12)
            java.util.HashMap<java.lang.String, os1.u$a> r10 = r10.f176747f
            r10.clear()
            android.app.Activity r10 = r22.getContext()
            bl3.r$a r10 = r0.mo62443b(r10)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC> r11 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.class
            bl3.t r10 = r10.mo62449e(r11)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderDescPanelUIC r10 = (com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC) r10
            if (r10 == 0) goto L_0x019e
            java.util.Map<java.lang.Long, java.lang.Integer> r11 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderDescPanelUIC.f18610J
            java.util.LinkedHashMap r11 = (java.util.LinkedHashMap) r11
            r11.clear()
            android.app.Activity r11 = r10.getContext()
            bl3.r$a r11 = r0.mo62443b(r11)
            java.lang.Class<rs1.j2> r12 = rs1.C13282j2.class
            bl3.t r11 = r11.mo62449e(r12)
            rs1.j2 r11 = (rs1.C13282j2) r11
            if (r11 == 0) goto L_0x017d
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, androidx.lifecycle.z<java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderCommentInfo>>> r11 = rs1.C13282j2.f37698o
            r11.clear()
        L_0x017d:
            android.app.Activity r10 = r10.getContext()
            bl3.r$a r10 = r0.mo62443b(r10)
            java.lang.Class<rs1.d3> r11 = rs1.C13181d3.class
            bl3.t r10 = r10.mo62449e(r11)
            rs1.d3 r10 = (rs1.C13181d3) r10
            if (r10 == 0) goto L_0x019e
            rx3.g r10 = r10.f37489f
            rx3.n r10 = (rx3.C36570n) r10
            java.lang.Object r10 = r10.getValue()
            pf1.n r10 = (pf1.C62273n) r10
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, androidx.lifecycle.z<te3.dl>> r10 = r10.f177026n
            r10.clear()
        L_0x019e:
            android.app.Activity r10 = r22.getContext()
            bl3.r$a r0 = r0.mo62443b(r10)
            java.lang.Class<rs1.w6> r10 = rs1.C13502w6.class
            bl3.t r0 = r0.mo62449e(r10)
            rs1.w6 r0 = (rs1.C13502w6) r0
            if (r0 == 0) goto L_0x01c0
            java.lang.String r10 = "Finder.FinderNpsSurveyUIC"
            java.lang.String r11 = "whenAutoRefresh disable all tabs"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r10, r11)
            r0.f38277i = r7
            r0.f38278j = r7
            r0.f38279n = r7
            goto L_0x01c0
        L_0x01bf:
            r13 = 0
        L_0x01c0:
            ye1.q r0 = r22.mo5133i3()
            com.tencent.mm.plugin.finder.view.FinderViewPager r0 = r0.f42966a
            pe1.c<java.lang.Integer> r10 = up1.C37521f.f99411h1
            java.lang.Object r10 = r10.mo60266n()
            java.lang.Number r10 = (java.lang.Number) r10
            int r10 = r10.intValue()
            if (r10 != r4) goto L_0x01d6
            r10 = 1
            goto L_0x01d7
        L_0x01d6:
            r10 = 0
        L_0x01d7:
            r0.setEnableViewPagerScroll(r10)
            sr1.c r10 = new sr1.c
            androidx.appcompat.app.AppCompatActivity r11 = r22.getActivity()
            androidx.fragment.app.FragmentManager r11 = r11.getSupportFragmentManager()
            java.lang.String r12 = "activity.supportFragmentManager"
            gy3.C87412m.m108593f(r11, r12)
            java.util.ArrayList<com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment> r12 = r1.fragments
            pe1.c<java.lang.Integer> r14 = up1.C37521f.f99398f6
            java.lang.Object r14 = r14.mo60266n()
            java.lang.Number r14 = (java.lang.Number) r14
            int r14 = r14.intValue()
            if (r14 != r4) goto L_0x01fb
            r14 = 1
            goto L_0x01fc
        L_0x01fb:
            r14 = 0
        L_0x01fc:
            r10.<init>(r11, r12, r14)
            r0.setAdapter(r10)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC$a r10 = r1.f18654n
            r0.addOnPageChangeListener(r10)
            r0.setOffscreenPageLimit(r6)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC$e r6 = new com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC$e
            r6.<init>(r1, r5)
            r0.post(r6)
            pe1.c<java.lang.Integer> r6 = up1.C37521f.f99421i2
            java.lang.Object r6 = r6.mo60266n()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            java.lang.String r10 = ""
            if (r6 <= 0) goto L_0x0247
            android.content.Context r11 = r0.getContext()
            java.lang.Class<androidx.viewpager.widget.ViewPager> r12 = androidx.viewpager.widget.ViewPager.class
            java.lang.String r14 = "mScroller"
            java.lang.reflect.Field r12 = r12.getDeclaredField(r14)     // Catch:{ Exception -> 0x023f }
            java.lang.String r14 = "ViewPager::class.java.ge…eclaredField(\"mScroller\")"
            gy3.C87412m.m108593f(r12, r14)     // Catch:{ Exception -> 0x023f }
            r12.setAccessible(r4)     // Catch:{ Exception -> 0x023f }
            er1.r5 r14 = new er1.r5     // Catch:{ Exception -> 0x023f }
            r14.<init>(r11, r6)     // Catch:{ Exception -> 0x023f }
            r12.set(r0, r14)     // Catch:{ Exception -> 0x023f }
            goto L_0x0247
        L_0x023f:
            r0 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r7]
            java.lang.String r11 = "ViewPageUtils"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r11, r0, r10, r6)
        L_0x0247:
            cm1.e1 r0 = cm1.C55012e1.f154468d
            r0.mo76066j()
            r1.f18658r = r4
            pe1.c<java.lang.Integer> r0 = up1.C37521f.f99195I3
            java.lang.Object r0 = r0.mo60266n()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != r4) goto L_0x025e
            r0 = 1
            goto L_0x025f
        L_0x025e:
            r0 = 0
        L_0x025f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r11 = "onCreate: index="
            r6.append(r11)
            int r11 = r5.f27483d
            int r11 = r1.mo5131g3(r11)
            r6.append(r11)
            java.lang.String r11 = " tabType="
            r6.append(r11)
            int r11 = r5.f27483d
            r6.append(r11)
            java.lang.String r11 = ", isAutoRefresh="
            r6.append(r11)
            r6.append(r8)
            java.lang.String r8 = ", FIX_REINIT_SELECTOR_ENABLE_VALUE="
            r6.append(r8)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r9, r6)
            android.content.Intent r6 = r22.getIntent()
            r8 = 2
            java.lang.String r9 = "FROM_SCENE_KEY"
            int r6 = r6.getIntExtra(r9, r8)
            r9 = 6
            if (r6 != r9) goto L_0x02a3
            r6 = 1
            goto L_0x02a4
        L_0x02a3:
            r6 = 0
        L_0x02a4:
            r1.f18648e = r6
            r6 = 7
            if (r0 == 0) goto L_0x02ca
            di3.d r0 = di3.C86312j.m106911c(r2)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            gf1.i r0 = r0.f157802n
            r2 = 506877(0x7bbfd, float:7.10286E-40)
            rs1.s8$a r9 = rs1.C13442s8.f38060Q0
            android.app.Activity r11 = r22.getContext()
            rs1.s8 r9 = r9.mo12873f(r11)
            if (r9 == 0) goto L_0x02c5
            te3.hj1 r9 = r9.mo12861q3()
            goto L_0x02c6
        L_0x02c5:
            r9 = r3
        L_0x02c6:
            r0.mo84538g(r2, r6, r9)
            goto L_0x02ea
        L_0x02ca:
            di3.d r0 = di3.C86312j.m106911c(r2)
            com.tencent.mm.plugin.FinderCommonFeatureService r0 = (com.tencent.p014mm.plugin.FinderCommonFeatureService) r0
            gf1.i r0 = r0.f157802n
            r2 = 506365(0x7b9fd, float:7.09568E-40)
            rs1.s8$a r9 = rs1.C13442s8.f38060Q0
            android.app.Activity r11 = r22.getContext()
            rs1.s8 r9 = r9.mo12873f(r11)
            if (r9 == 0) goto L_0x02e6
            te3.hj1 r9 = r9.mo12861q3()
            goto L_0x02e7
        L_0x02e6:
            r9 = r3
        L_0x02e7:
            r0.mo84538g(r2, r6, r9)
        L_0x02ea:
            int r0 = r5.f27483d
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r5 = "Source"
            r2.putInt(r5, r4)
            java.lang.String r5 = "IsFirstEnterTab"
            r2.putBoolean(r5, r4)
            java.lang.String r4 = "showUnreadCacheFeed"
            r2.putBoolean(r4, r13)
            rx3.b0 r4 = rx3.C13598b0.f38549a
            r1.mo5135k3(r0, r2)
            java.lang.Class<ir.n> r0 = p565ir.C60606n.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ir.n r0 = (p565ir.C60606n) r0
            androidx.appcompat.app.AppCompatActivity r2 = r22.getActivity()
            r0.mo85052c7(r2, r3)
            java.lang.Class<ky2.i> r0 = ky2.C10432i.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            ky2.i r0 = (ky2.C10432i) r0
            ky2.o r2 = r1.f18660t
            r0.mo10739MV(r2)
            zt3.t r0 = zt3.C119157j.f356862d
            com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC$f r2 = com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC.C4270f.f18668d
            zt3.j r0 = (zt3.C119157j) r0
            r0.mo183870a(r2)
            android.app.Activity r0 = r22.getContext()
            java.lang.String r2 = "context"
            gy3.C87412m.m108594g(r0, r2)
            a14.h0 r2 = a14.C53872d1.f151119c
            a14.n0 r11 = a14.C53930o0.m60554a(r2)
            r12 = 0
            r13 = 0
            dp1.k r14 = new dp1.k
            r14.<init>(r0, r3)
            r15 = 3
            r16 = 0
            a14.C53895h.m60466d(r11, r12, r13, r14, r15, r16)
            boolean r0 = r1.f18648e
            if (r0 == 0) goto L_0x03a2
            android.content.Intent r0 = r22.getIntent()
            java.lang.String r2 = "from_user"
            java.lang.String r0 = r0.getStringExtra(r2)
            android.content.Intent r2 = r22.getIntent()
            java.lang.String r4 = "report_scene"
            int r14 = r2.getIntExtra(r4, r7)
            android.content.Intent r2 = r22.getIntent()
            java.lang.String r4 = "report_uitype"
            int r19 = r2.getIntExtra(r4, r8)
            android.content.Intent r2 = r22.getIntent()
            r4 = 0
            java.lang.String r6 = "KEY_OBJECT_ID"
            long r12 = r2.getLongExtra(r6, r4)
            java.lang.Class<dp1.y0> r2 = dp1.C58417y0.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            r11 = r2
            dp1.y0 r11 = (dp1.C58417y0) r11
            r15 = 1
            if (r0 != 0) goto L_0x0385
            r17 = r10
            goto L_0x0387
        L_0x0385:
            r17 = r0
        L_0x0387:
            r18 = 1
            r20 = 0
            rs1.s8$a r0 = rs1.C13442s8.f38060Q0
            android.app.Activity r2 = r22.getContext()
            rs1.s8 r0 = r0.mo12873f(r2)
            if (r0 == 0) goto L_0x039d
            te3.hj1 r0 = r0.mo12861q3()
            java.lang.String r3 = r0.f134671e
        L_0x039d:
            r21 = r3
            r11.iy0(r12, r14, r15, r17, r18, r19, r20, r21)
        L_0x03a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.FinderHomeUIC.onCreate(android.os.Bundle):void");
    }

    public void onCreateAfter(Bundle bundle) {
        Class cls = FinderCommonFeatureService.class;
        super.onCreateAfter(bundle);
        if (getIntent().getBooleanExtra("KEY_POST_DIRECTLY_FROM_SNS", false) || getIntent().getBooleanExtra("KEY_FROM_SHARE_REL", false)) {
            String stringExtra = getIntent().getStringExtra("key_context_id");
            if (stringExtra == null) {
                stringExtra = "";
            }
            C2483o0.f12984a.mo2454d(stringExtra, 1, getIntent().getIntExtra("key_auto_trigger_type", 0), new C60165e4.C46105a(0, 0, 3, (C8480h) null));
        }
        ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0().mo77273m(getIntent().getIntExtra("FROM_SCENE_KEY", 2), (getIntent().getFlags() & 1048576) > 0);
        String stringExtra2 = getIntent().getStringExtra("KEY_TASK_ID");
        if (!(stringExtra2 == null || stringExtra2.length() == 0)) {
            C115669n.INSTANCE.mo160131h(23669, stringExtra2, "finder_home_ui_create_after", Long.valueOf(System.currentTimeMillis()), "", 1, 1);
        }
        if (C87412m.m108589b(getActivity().getIntent().getStringExtra("KEY_FROM_PATH"), "FinderEntrance")) {
            C62163m mVar = (C62163m) C39818r.f106831a.mo62446e(cls).mo75002a(C62163m.class);
            if (mVar.mo87214j3()) {
                Log.m105924i("Finder.RedDotSessionVM", "[clickFinderEntrance]");
                mVar.f176739g = true;
                mVar.mo87213i3("clickFinderEntrance");
                mVar.mo87212g3(mVar.mo87209d3(2));
                mVar.mo87208c3().f176766k = System.currentTimeMillis();
            }
        }
    }

    public void onDestroy() {
        C0075i iVar = C0075i.EVENT_ON_DESTROY;
        C54067f0.C54078q qVar = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR;
        Class cls = C8777j5.class;
        super.onDestroy();
        int i = this.f18652i.f34362i;
        int i2 = 3;
        if (i == 1) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8602c((C8777j5) c, (RecyclerView) null, qVar, "temp_9", iVar, 0, 0, 0, 112, (Object) null);
        } else if (i == 3) {
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(IHellLiveReport::class.java)");
            C8777j5.C8778a.m8602c((C8777j5) c2, (RecyclerView) null, qVar, "temp_1", iVar, 0, 0, 0, 112, (Object) null);
        }
        if (!this.f18648e || getActiveFragment().f17334o != 4) {
            this.f18652i.mo11606k3(getActiveFragment().f17334o, C11739f.C11741b.SOURCE_EXIT);
        }
        if (this.f18648e) {
            this.f18652i.mo11600c3(4).f34376i = C11739f.C11742c.Default;
        }
        this.f18655o.dead();
        C55012e1.f154468d.mo76067k();
        FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(FinderCommonFeatureService.class)).Nt0();
        Class cls2 = C10485b.class;
        C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_FINDER_CURRENT_FAST_ENTER_LEVEL_INT_SYNC;
        Nx0.f158530g.clear();
        long c3 = C31543z5.m39453c() - Nx0.f158538o;
        Nx0.f158537n = c3;
        if (Nx0.f158540q && Nx0.f158539p == 2 && c3 <= ((long) ((C10485b) C86709a0.m107533q(cls2)).vh0().mo107404b("FinderFastEnterTime", 0)) * 1000) {
            int j = C86709a0.m107535s().mo121142i().mo119689j(aVar, 0) + 1;
            if (j <= 3) {
                i2 = j;
            }
            Log.m105928w("Finder.RedDotManager", "[exitFinder] current fastLevel=" + i2);
            C86709a0.m107535s().mo121142i().mo119677K(aVar, Integer.valueOf(i2));
        } else if (Nx0.f158537n > ((long) ((C10485b) C86709a0.m107533q(cls2)).vh0().mo107404b("FinderFastEnterTime", 0)) * 1000) {
            Log.m105928w("Finder.RedDotManager", "[exitFinder] revert fastLevel=0");
            C86709a0.m107535s().mo121142i().mo119677K(aVar, 0);
        }
        C86709a0.m107535s().mo121142i().mo119677K(C72994y1.C72995a.USERINFO_FINDER_EXIT_FINDER_TL_LONG_SYNC, Long.valueOf(C31543z5.m39453c()));
        if (!C7453v.f25647a.mo8600a()) {
            C7453v.f25648b = false;
            C7453v.f25649c = true;
            C7453v.f25650d = 0;
            C7453v.f25651e = 0;
            C7453v.f25652f.clear();
            C7453v.f25653g.clear();
        }
        ((C10432i) C86312j.m106911c(C10432i.class)).mo10756rY(this.f18660t);
        C61926c.m72658C((String) null, C4272g.f18669d, 1, (Object) null);
    }

    public void onFinished() {
        super.onFinished();
        if (C87412m.m108589b(getActivity().getIntent().getStringExtra("KEY_FROM_PATH"), "FinderEntrance")) {
            C62163m mVar = (C62163m) C39818r.f106831a.mo62446e(FinderCommonFeatureService.class).mo75002a(C62163m.class);
            if (mVar.mo87214j3()) {
                C62170x c3 = mVar.mo87208c3();
                c3.f176756a.f185972h = (int) ((System.currentTimeMillis() - c3.f176766k) / ((long) 1000));
                mVar.mo87212g3(mVar.mo87209d3(3));
            }
        }
    }

    public void onPause() {
        C54067f0.C54078q qVar = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR;
        C0075i iVar = C0075i.EVENT_ON_PAUSE;
        Class cls = C8777j5.class;
        super.onPause();
        MMApplicationContext.getContext().unregisterReceiver(this.f18657q);
        int i = this.f18652i.f34362i;
        RecyclerView recyclerView = null;
        if (i == 1) {
            C7335d c = C86312j.m106911c(cls);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5 j5Var = (C8777j5) c;
            WeakReference<RecyclerView> weakReference = ((C8777j5) C86312j.m106911c(cls)).getConfig().f151456f0;
            if (weakReference != null) {
                recyclerView = weakReference.get();
            }
            C8777j5.C8778a.m8602c(j5Var, recyclerView, qVar, "temp_9", iVar, 0, 0, 0, 112, (Object) null);
        } else if (i == 3) {
            C7335d c2 = C86312j.m106911c(cls);
            C87412m.m108593f(c2, "getService(IHellLiveReport::class.java)");
            C8777j5 j5Var2 = (C8777j5) c2;
            WeakReference<RecyclerView> weakReference2 = ((C8777j5) C86312j.m106911c(cls)).getConfig().f151456f0;
            if (weakReference2 != null) {
                recyclerView = weakReference2.get();
            }
            C8777j5.C8778a.m8602c(j5Var2, recyclerView, qVar, "temp_1", iVar, 0, 0, 0, 112, (Object) null);
        } else if (i == 4) {
            C7335d c3 = C86312j.m106911c(cls);
            C87412m.m108593f(c3, "getService(IHellLiveReport::class.java)");
            C8777j5 j5Var3 = (C8777j5) c3;
            WeakReference<RecyclerView> weakReference3 = ((C8777j5) C86312j.m106911c(cls)).getConfig().f151456f0;
            C8777j5.C8778a.m8602c(j5Var3, weakReference3 != null ? weakReference3.get() : null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR, "20", iVar, 0, 0, 0, 112, (Object) null);
        }
        C7453v vVar = C7453v.f25647a;
        Activity context = getContext();
        int i2 = this.f18652i.f34362i;
        C87412m.m108594g(context, "context");
        if (!vVar.mo8600a()) {
            Log.m105924i("Finder.HomeActionReporter", "[onLeavePage] tabType:" + i2);
            C7453v.f25651e = i2;
            C7453v.f25648b = false;
            vVar.mo8607h(i2, 2, false);
            vVar.mo8606g(context, i2, new C13604l(2, 1), true);
        }
    }

    public void onResume() {
        boolean z;
        boolean z2;
        C54067f0.C54078q qVar = C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_SINGLE_AVATAR;
        Class cls = C8808v4.class;
        C0075i iVar = C0075i.EVENT_ON_RESUME;
        Class cls2 = C8777j5.class;
        super.onResume();
        if (this.f18659s) {
            C20480e0 e0Var = C20480e0.f57583a;
            int i = this.f18652i.f34362i;
            FinderViewPager finderViewPager = mo5133i3().f42966a;
            C87412m.m108593f(finderViewPager, "uiBinding.viewPager");
            finderViewPager.post(new C7437g0(i));
            this.f18659s = false;
        }
        this.f18656p = NetStatusUtil.isMobile(MMApplicationContext.getContext());
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        MMApplicationContext.getContext().registerReceiver(this.f18657q, intentFilter);
        if (((C8808v4) C86312j.m106911c(cls)).Sn0()) {
            Log.m105924i("Finder.HomeUIC", "onResume: isTeenModeAndViewNothing finish, isMultiTaskOpen = " + (getActivity() instanceof FinderHomeAffinityUI));
            if (getActivity() instanceof FinderHomeAffinityUI) {
                getActivity().finishAndRemoveTask();
            } else {
                getActivity().finish();
            }
        }
        int i2 = this.f18652i.f34362i;
        if (i2 == 1) {
            z2 = false;
            z = true;
            C7335d c = C86312j.m106911c(cls2);
            C87412m.m108593f(c, "getService(IHellLiveReport::class.java)");
            C8777j5 j5Var = (C8777j5) c;
            WeakReference<RecyclerView> weakReference = ((C8777j5) C86312j.m106911c(cls2)).getConfig().f151456f0;
            C8777j5.C8778a.m8602c(j5Var, weakReference != null ? weakReference.get() : null, qVar, "temp_9", iVar, 0, 0, 0, 112, (Object) null);
        } else if (i2 != 3) {
            if (i2 == 4) {
                C7335d c2 = C86312j.m106911c(cls2);
                C87412m.m108593f(c2, "getService(IHellLiveReport::class.java)");
                C8777j5 j5Var2 = (C8777j5) c2;
                WeakReference<RecyclerView> weakReference2 = ((C8777j5) C86312j.m106911c(cls2)).getConfig().f151456f0;
                C8777j5.C8778a.m8602c(j5Var2, weakReference2 != null ? weakReference2.get() : null, C54067f0.C54078q.LIVE_AUDIENCE_EXPLORE_FEED_CARD_LIVING_AVATAR, "20", iVar, 0, 0, 0, 112, (Object) null);
            }
            z2 = false;
            z = true;
        } else {
            C7335d c3 = C86312j.m106911c(cls2);
            C87412m.m108593f(c3, "getService(IHellLiveReport::class.java)");
            C8777j5 j5Var3 = (C8777j5) c3;
            WeakReference<RecyclerView> weakReference3 = ((C8777j5) C86312j.m106911c(cls2)).getConfig().f151456f0;
            z = true;
            z2 = false;
            C8777j5.C8778a.m8602c(j5Var3, weakReference3 != null ? weakReference3.get() : null, qVar, "temp_1", iVar, 0, 0, 0, 112, (Object) null);
        }
        C7453v vVar = C7453v.f25647a;
        Activity context = getContext();
        int i3 = this.f18652i.f34362i;
        C87412m.m108594g(context, "context");
        if (!vVar.mo8600a()) {
            Log.m105924i("Finder.HomeActionReporter", "[onEnterPage] tabType:" + i3);
            C7453v.f25650d = i3;
            C7453v.f25651e = i3;
            C7453v.f25648b = z;
            vVar.mo8607h(i3, z ? 1 : 0, z2);
            vVar.mo8606g(context, i3, new C13604l(Integer.valueOf(z), Integer.valueOf(z2 ? 1 : 0)), z2);
        }
        if (this.f18647d && ((C8808v4) C86312j.m106911c(cls)).mo9636zX()) {
            FinderHomeTabFragment activeFragment = getActiveFragment();
            C39818r rVar = C39818r.f106831a;
            FinderTimelineUIC finderTimelineUIC = (FinderTimelineUIC) rVar.mo62445d(activeFragment).mo62449e(FinderTimelineUIC.class);
            if (finderTimelineUIC != null) {
                C9878n9 n9Var = finderTimelineUIC.f18786e;
                if (n9Var != null) {
                    C9878n9.C9879a.m9643a(n9Var, 150, false, false, 4, (Object) null);
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            }
            FinderTwoFlowTimelineUIC finderTwoFlowTimelineUIC = (FinderTwoFlowTimelineUIC) rVar.mo62445d(activeFragment).mo62449e(FinderTwoFlowTimelineUIC.class);
            if (finderTwoFlowTimelineUIC != null) {
                C9916p2 p2Var = finderTwoFlowTimelineUIC.f18797f;
                if (p2Var != null) {
                    p2Var.f30220j.postDelayed(new C9934q2(p2Var, z2), 150);
                } else {
                    C87412m.m108603p("viewCallback");
                    throw null;
                }
            }
        }
        this.f18647d = z2;
    }

    public void onStop() {
        Class cls = FinderCommonFeatureService.class;
        super.onStop();
        if (getActivity().isFinishing()) {
            FinderRedDotManager Nx0 = ((FinderCommonFeatureService) C86312j.m106911c(cls)).Nt0();
            AppCompatActivity activity = getActivity();
            C87412m.m108594g(activity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
            if (C37521f.f99374d.mo61188n() && Nx0.mo77281u() && ((C60204t3) C86312j.m106911c(C60204t3.class)).iu0(activity)) {
                C55718s0 G5 = Nx0.mo77227G5("FinderEntrance");
                C64586nn1 o2 = G5 != null ? G5.mo77308o2("FinderEntrance") : null;
                if (!(G5 == null || o2 == null)) {
                    C58413v0 v0Var = C58413v0.f167346a;
                    C13442s8 f = C13442s8.f38060Q0.mo12873f(activity);
                    C58413v0.m67780h(v0Var, "2", G5, o2, 2, f != null ? f.mo12861q3() : null, 1, 0, (String) null, 0, 1, (String) null, 0, (C60165e4.C46105a) null, 7616, (Object) null);
                }
            }
            int e3 = ((C11739f) C39818r.f106831a.mo62446e(cls).mo75002a(C11739f.class)).mo11602e3();
            boolean z = activity.getIntent().getIntExtra("FROM_SCENE_KEY", 2) == 6;
            if (!z && Nx0.mo77281u()) {
                Nx0.mo77239M5("FinderEntrance");
                Nx0.mo77239M5("Discovery");
            }
            C2490t.f13006a.mo2469a((C55718s0) null);
            Log.m105924i("Finder.RedDotManager", "[exitFinderBefore] isSourceFromShareToTimeline=" + z + " needClearRedDotWhenEnter=" + Nx0.mo77281u() + ", tabType=" + e3);
        }
        if (!this.f18648e || getActiveFragment().f17334o != 4) {
            this.f18652i.mo11604g3(getActiveFragment().f17334o);
            return;
        }
        C11739f.C11740a c3 = this.f18652i.mo11600c3(getActiveFragment().f17334o);
        c3.f34376i = C11739f.C11742c.ShareRecommend;
        c3.f34375h = System.currentTimeMillis();
    }
}
