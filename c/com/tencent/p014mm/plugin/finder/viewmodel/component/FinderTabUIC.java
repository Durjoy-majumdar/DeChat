package com.tencent.p014mm.plugin.finder.viewmodel.component;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.fragment.FinderHomeTabFragment;
import com.tencent.p014mm.plugin.finder.profile.uic.FinderProfileTabUIC;
import com.tencent.p014mm.plugin.finder.view.C4194v2;
import com.tencent.p014mm.plugin.finder.view.FinderFragmentChangeObserver;
import com.tencent.p014mm.plugin.finder.view.tabcomp.IFinderTabProvider;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.HardTouchableLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import er1.C75653r5;
import fy3.C32224a;
import gy3.C24564k0;
import gy3.C87412m;
import gy3.C87413o;
import j20.C117292a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import ls1.C10647i;
import ls1.C61391g;
import ls1.C61394l;
import ls1.C61395m;
import ls1.C61396n;
import o40.C61926c;
import p329d3.C106986f;
import rs1.C13447sa;
import rs1.C63623ra;
import rx3.C13598b0;
import sr1.C118286a;
import sr1.C64164c;
import sx3.C64197v;
import up1.C37521f;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/viewmodel/component/FinderTabUIC;", "Lcom/tencent/mm/ui/component/UIComponent;", "Lcom/tencent/mm/plugin/finder/view/tabcomp/IFinderTabProvider;", "tabProvider", "Lcom/tencent/mm/plugin/finder/view/tabcomp/IFinderTabProvider;", "K3", "()Lcom/tencent/mm/plugin/finder/view/tabcomp/IFinderTabProvider;", "setTabProvider", "(Lcom/tencent/mm/plugin/finder/view/tabcomp/IFinderTabProvider;)V", "Landroidx/appcompat/app/AppCompatActivity;", "activity", "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;)V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
/* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC */
public abstract class FinderTabUIC extends UIComponent {

    /* renamed from: d */
    public int f162506d = -1;

    /* renamed from: e */
    public boolean f162507e;

    /* renamed from: f */
    public TabLayout f162508f;

    /* renamed from: g */
    public ViewPager f162509g;

    /* renamed from: h */
    public C118286a<FinderHomeTabFragment> f162510h;

    /* renamed from: i */
    public C61396n f162511i;

    /* renamed from: j */
    public final CopyOnWriteArraySet<C4194v2> f162512j = new CopyOnWriteArraySet<>();

    /* renamed from: n */
    public List<? extends FinderHomeTabFragment> f162513n;

    /* renamed from: o */
    public List<? extends C61391g> f162514o;

    /* renamed from: p */
    public C61394l f162515p;

    /* renamed from: q */
    public C61395m f162516q;

    /* renamed from: r */
    public FinderFragmentChangeObserver f162517r;

    /* renamed from: s */
    public boolean f162518s;
    public IFinderTabProvider tabProvider;

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC$f */
    public static final class C4320f extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ FinderTabUIC f18783d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C4320f(FinderTabUIC finderTabUIC) {
            super(0);
            this.f18783d = finderTabUIC;
        }

        public Object invoke() {
            ViewPager viewPager = this.f18783d.f162509g;
            if ((viewPager != null && viewPager.getCurrentItem() == 0) && (!this.f18783d.mo80041M3().isEmpty())) {
                FinderFragmentChangeObserver finderFragmentChangeObserver = this.f18783d.f162517r;
                if (finderFragmentChangeObserver != null) {
                    finderFragmentChangeObserver.onPageSelected(0);
                } else {
                    C87412m.m108603p("fragmentChangeObserver");
                    throw null;
                }
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC$a */
    public static final class C56692a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderTabUIC f162519d;

        public C56692a(FinderTabUIC finderTabUIC) {
            this.f162519d = finderTabUIC;
        }

        public final void run() {
            this.f162519d.mo80057i3();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC$b */
    public static final class C56693b implements TabLayout.C104470c<TabLayout.C55061f> {

        /* renamed from: a */
        public final /* synthetic */ FinderTabUIC f162520a;

        /* renamed from: b */
        public final /* synthetic */ TabLayout f162521b;

        public C56693b(FinderTabUIC finderTabUIC, TabLayout tabLayout) {
            this.f162520a = finderTabUIC;
            this.f162521b = tabLayout;
        }

        /* renamed from: a */
        public void mo9213a(TabLayout.C55061f fVar) {
            if (fVar != null) {
                FinderTabUIC finderTabUIC = this.f162520a;
                TabLayout tabLayout = this.f162521b;
                if (fVar.f154600a instanceof C61391g) {
                    C61394l L3 = finderTabUIC.mo80040L3();
                    Context context = tabLayout.getContext();
                    C87412m.m108593f(context, "context");
                    Object obj = fVar.f154600a;
                    C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
                    L3.mo3859b(context, (C61391g) obj);
                    Object obj2 = fVar.f154600a;
                    C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
                    View view = fVar.f154605f;
                    C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
                    ((C61391g) obj2).mo3855d(false, (ViewGroup) view);
                }
            }
        }

        /* renamed from: b */
        public void mo9214b(TabLayout.C55061f fVar) {
            if (fVar != null) {
                FinderTabUIC finderTabUIC = this.f162520a;
                TabLayout tabLayout = this.f162521b;
                C61394l L3 = finderTabUIC.mo80040L3();
                Context context = tabLayout.getContext();
                C87412m.m108593f(context, "context");
                Object obj = fVar.f154600a;
                C87412m.m108592e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
                L3.mo3858a(context, (C61391g) obj);
                Object obj2 = fVar.f154600a;
                C87412m.m108592e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
                View view = fVar.f154605f;
                C87412m.m108592e(view, "null cannot be cast to non-null type android.view.ViewGroup");
                ((C61391g) obj2).mo3855d(true, (ViewGroup) view);
                Object obj3 = fVar.f154600a;
                C87412m.m108592e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab");
                int indexOf = finderTabUIC.mo80041M3().indexOf((C61391g) obj3);
                Log.m105924i("Finder.FinderTabUIC", "setCurrentPage:" + indexOf);
                if (indexOf == -1) {
                    indexOf = 0;
                }
                finderTabUIC.mo80051b4(indexOf);
            }
        }

        /* renamed from: c */
        public void mo9215c(TabLayout.C55061f fVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC$c */
    public static final class C56694c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderTabUIC f162522d;

        public C56694c(FinderTabUIC finderTabUIC) {
            this.f162522d = finderTabUIC;
        }

        public final void run() {
            FinderTabUIC finderTabUIC = this.f162522d;
            finderTabUIC.getClass();
            Log.m105924i("Finder.FinderTabUIC", "onActionbarDoubleClick");
            C61391g I3 = finderTabUIC.mo80037I3(finderTabUIC.mo80036G3());
            if (I3 != null) {
                finderTabUIC.mo80040L3().mo10909c(finderTabUIC.getActivity(), I3);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC$d */
    public static final class C56695d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ FinderTabUIC f162523d;

        public C56695d(FinderTabUIC finderTabUIC) {
            this.f162523d = finderTabUIC;
        }

        public final void run() {
            FinderTabUIC finderTabUIC = this.f162523d;
            finderTabUIC.getClass();
            Log.m105924i("Finder.FinderTabUIC", "onActionbarClick");
            C61391g I3 = finderTabUIC.mo80037I3(finderTabUIC.mo80036G3());
            if (I3 != null) {
                finderTabUIC.mo80040L3().mo10910d(finderTabUIC.getActivity(), I3);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.viewmodel.component.FinderTabUIC$e */
    public static final class C56696e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderTabUIC f162524d;

        public C56696e(FinderTabUIC finderTabUIC) {
            this.f162524d = finderTabUIC;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/viewmodel/component/FinderTabUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f162524d.mo80045Q3();
            if (!this.f162524d.getActivity().isFinishing()) {
                this.f162524d.getActivity().finish();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/viewmodel/component/FinderTabUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTabUIC(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C37521f.f99374d.getClass();
        this.f162518s = C37521f.f99424i5.mo60266n().intValue() != 1 ? false : true;
    }

    /* renamed from: U3 */
    public static /* synthetic */ void m65391U3(FinderTabUIC finderTabUIC, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = -1;
            }
            finderTabUIC.mo80046T3(i, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeTabAndFragment");
    }

    /* renamed from: W3 */
    public static /* synthetic */ void m65392W3(FinderTabUIC finderTabUIC, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 2) != 0) {
                i2 = -1;
            }
            finderTabUIC.mo80047V3(i, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeTabAndFragmentByTabType");
    }

    /* renamed from: a4 */
    public static /* synthetic */ void m65393a4(FinderTabUIC finderTabUIC, int i, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 2) != 0) {
                z = false;
            }
            finderTabUIC.mo80050Z3(i, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectTab");
    }

    /* renamed from: e3 */
    public static /* synthetic */ void m65394e3(FinderTabUIC finderTabUIC, int i, C61391g gVar, FinderHomeTabFragment finderHomeTabFragment, boolean z, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 8) != 0) {
                z = false;
            }
            finderTabUIC.mo80054d3(i, gVar, finderHomeTabFragment, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addTabAndFragment");
    }

    /* renamed from: f3 */
    public static void m65395f3(FinderTabUIC finderTabUIC, C61391g gVar, FinderHomeTabFragment finderHomeTabFragment, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                z = false;
            }
            finderTabUIC.getClass();
            C87412m.m108594g(gVar, "tab");
            C87412m.m108594g(finderHomeTabFragment, "fragment");
            finderTabUIC.mo80054d3(finderTabUIC.mo80041M3().size(), gVar, finderHomeTabFragment, z);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addTabAndFragment");
    }

    /* renamed from: F3 */
    public ViewGroup mo80035F3() {
        View childAt;
        TabLayout tabLayout = this.f162508f;
        if (tabLayout == null || (childAt = tabLayout.getChildAt(0)) == null) {
            return null;
        }
        return (ViewGroup) childAt;
    }

    /* renamed from: G3 */
    public int mo80036G3() {
        TabLayout tabLayout = this.f162508f;
        return tabLayout != null ? tabLayout.getSelectedTabPosition() : this.f162506d;
    }

    /* renamed from: I3 */
    public final C61391g mo80037I3(int i) {
        List<C61391g> M3 = mo80041M3();
        if (!(i >= 0 && i < M3.size())) {
            M3 = null;
        }
        if (M3 != null) {
            return mo80041M3().get(i);
        }
        return null;
    }

    /* renamed from: J3 */
    public final C61395m mo80038J3() {
        C61395m mVar = this.f162516q;
        if (mVar != null) {
            return mVar;
        }
        C87412m.m108603p("tabContainer");
        throw null;
    }

    /* renamed from: K3 */
    public final IFinderTabProvider mo80039K3() {
        IFinderTabProvider iFinderTabProvider = this.tabProvider;
        if (iFinderTabProvider != null) {
            return iFinderTabProvider;
        }
        C87412m.m108603p("tabProvider");
        throw null;
    }

    /* renamed from: L3 */
    public final C61394l mo80040L3() {
        C61394l lVar = this.f162515p;
        if (lVar != null) {
            return lVar;
        }
        C87412m.m108603p("tabViewAction");
        throw null;
    }

    /* renamed from: M3 */
    public final List<C61391g> mo80041M3() {
        List<? extends C61391g> list = this.f162514o;
        if (list != null) {
            return list;
        }
        C87412m.m108603p("tabs");
        throw null;
    }

    /* renamed from: N3 */
    public void mo80042N3() {
    }

    /* renamed from: O3 */
    public void mo80043O3() {
    }

    /* renamed from: P3 */
    public final void mo80044P3() {
        if (!(this.tabProvider != null)) {
            IFinderTabProvider m3 = mo11417m3();
            C87412m.m108594g(m3, "<set-?>");
            this.tabProvider = m3;
            List<FinderHomeTabFragment> fragments = mo80039K3().fragments();
            C87412m.m108594g(fragments, "<set-?>");
            this.f162513n = fragments;
            List<C61391g> tabs = mo80039K3().tabs();
            C87412m.m108594g(tabs, "<set-?>");
            this.f162514o = tabs;
            C61394l tabViewAction = mo80039K3().tabViewAction();
            C87412m.m108594g(tabViewAction, "<set-?>");
            this.f162515p = tabViewAction;
            C61395m tabContainer = mo80039K3().tabContainer();
            C87412m.m108594g(tabContainer, "<set-?>");
            this.f162516q = tabContainer;
            this.f162507e = mo80039K3().isDynamic();
            mo80042N3();
        }
    }

    /* renamed from: Q3 */
    public void mo80045Q3() {
    }

    /* renamed from: R3 */
    public void mo11412R3(int i) {
    }

    /* renamed from: T3 */
    public final void mo80046T3(int i, int i2) {
        if (!this.f162507e || !C24564k0.m30743g(mo80041M3())) {
            Log.m105920e("Finder.FinderTabUIC", "removeTabAndFragment param error");
            return;
        }
        if (this.f162507e && i >= 0 && i < mo80041M3().size()) {
            C24564k0.m30738b(mo80041M3()).remove(i);
            mo80048X3(i);
            C118286a<FinderHomeTabFragment> aVar = this.f162510h;
            if (aVar != null) {
                aVar.mo183059a(new C118286a.C64160a(false, i), null);
            }
            if (i2 <= -1 || i2 >= mo80041M3().size()) {
                int i3 = i - 1;
                if (i3 < 0) {
                    i3 = 0;
                }
                m65393a4(this, i3, false, 2, (Object) null);
            } else {
                m65393a4(this, i2, false, 2, (Object) null);
            }
        }
        mo78525l3();
    }

    /* renamed from: V3 */
    public final void mo80047V3(int i, int i2) {
        int i3 = -1;
        for (FinderHomeTabFragment next : mo80061o3()) {
            if (next.f17334o == i) {
                i3 = mo80061o3().indexOf(next);
            }
        }
        if (i3 >= 0) {
            mo80046T3(i3, i2);
        }
        mo78525l3();
    }

    /* renamed from: X3 */
    public void mo80048X3(int i) {
        TabLayout tabLayout = this.f162508f;
        if (tabLayout != null) {
            TabLayout.C55061f fVar = tabLayout.f309502e;
            int i2 = fVar != null ? fVar.f154604e : 0;
            tabLayout.mo146911o(i);
            TabLayout.C55061f remove = tabLayout.f309501d.remove(i);
            TabLayout.C55061f fVar2 = null;
            if (remove != null) {
                remove.f154606g = null;
                remove.f154607h = null;
                remove.f154600a = null;
                remove.f154601b = null;
                remove.f154602c = null;
                remove.f154603d = null;
                remove.f154604e = -1;
                remove.f154605f = null;
                ((C106986f) TabLayout.f309480V).mo157420b(remove);
            }
            int size = tabLayout.f309501d.size();
            for (int i3 = i; i3 < size; i3++) {
                tabLayout.f309501d.get(i3).f154604e = i3;
            }
            if (i2 == i) {
                if (!tabLayout.f309501d.isEmpty()) {
                    fVar2 = tabLayout.f309501d.get(Math.max(0, i - 1));
                }
                tabLayout.mo146916p(fVar2, true);
            }
        }
    }

    /* renamed from: Y3 */
    public final void mo80049Y3() {
        C61926c.m72666K(0, new C4320f(this));
    }

    /* renamed from: Z3 */
    public void mo80050Z3(int i, boolean z) {
        TabLayout.C55061f k;
        TabLayout tabLayout = this.f162508f;
        if (tabLayout != null) {
            if (!(i >= 0 && i < tabLayout.getTabCount())) {
                tabLayout = null;
            }
            if (tabLayout != null && (k = tabLayout.mo146907k(i)) != null) {
                if (z || !k.mo76120a()) {
                    Log.m105924i("Finder.FinderTabUIC", "select :" + i);
                    k.mo76121b();
                }
                mo11412R3(i);
            }
        }
    }

    /* renamed from: b4 */
    public final void mo80051b4(int i) {
        ViewPager viewPager;
        if (i > -1 && (viewPager = this.f162509g) != null) {
            viewPager.setCurrentItem(i);
        }
        Log.m105924i("Finder.FinderTabUIC", "setCurrentPage :" + i);
    }

    /* renamed from: c3 */
    public void mo80052c3(C61391g gVar, int i) {
        TabLayout tabLayout = this.f162508f;
        if (tabLayout != null) {
            TabLayout.C55061f l = tabLayout.mo146908l();
            if (gVar != null) {
                l.mo76122c(gVar.mo3852a());
                gVar.mo3854c((ViewGroup) l.f154605f);
                gVar.mo9047e(false);
                if (gVar instanceof C10647i) {
                    l.f154603d = ((C10647i) gVar).mo10907i(getContext());
                    l.mo76124e();
                }
            }
            l.f154600a = gVar;
            if (i >= 0) {
                tabLayout.mo146888c(l, i, tabLayout.f309501d.isEmpty());
            } else {
                tabLayout.mo146887b(l);
            }
        }
    }

    /* renamed from: c4 */
    public final void mo80053c4(ViewGroup viewGroup, int i, int i2, int i3) {
        if (i2 != 0 || i3 != 0) {
            if (viewGroup != null) {
                ViewGroup.LayoutParams layoutParams = null;
                if (!(viewGroup.getChildCount() > i && i >= 0)) {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt != null) {
                        layoutParams = childAt.getLayoutParams();
                    }
                    if (layoutParams instanceof LinearLayout.LayoutParams) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                        layoutParams2.leftMargin = i2;
                        layoutParams2.rightMargin = i3;
                    }
                }
            }
            Log.m105924i("Finder.FinderTabUIC", "setMargins : invalidate" + i);
        }
    }

    /* renamed from: d3 */
    public final void mo80054d3(int i, C61391g gVar, FinderHomeTabFragment finderHomeTabFragment, boolean z) {
        int i2;
        int i3;
        int i4 = i;
        C61391g gVar2 = gVar;
        FinderHomeTabFragment finderHomeTabFragment2 = finderHomeTabFragment;
        C87412m.m108594g(gVar2, "tab");
        C87412m.m108594g(finderHomeTabFragment2, "fragment");
        if (!this.f162507e || !C24564k0.m30743g(mo80041M3())) {
            Log.m105920e("Finder.FinderTabUIC", "addTabAndFragment param error");
            return;
        }
        if (i4 <= mo80041M3().size()) {
            i2 = i4;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("reoderTabPos ");
            FinderProfileTabUIC.C3524c cVar = gVar2 instanceof FinderProfileTabUIC.C3524c ? (FinderProfileTabUIC.C3524c) gVar2 : null;
            sb.append(cVar != null ? Integer.valueOf(cVar.f32063h) : null);
            sb.append(" pos from:");
            sb.append(i4);
            sb.append(" to:");
            sb.append(mo80041M3().size());
            sb.append('!');
            Log.m105920e("Finder.FinderTabUIC", sb.toString());
            i2 = mo80041M3().size();
        }
        if (this.f162518s && (i3 = gVar2.f174601b) >= 0 && i3 < Integer.MAX_VALUE) {
            Iterator<T> it = mo80041M3().iterator();
            int i5 = 0;
            while (true) {
                if (it.hasNext()) {
                    T next = it.next();
                    int i6 = i5 + 1;
                    if (i5 < 0) {
                        C64197v.m75542k();
                        throw null;
                    } else if (((C61391g) next).f174601b > gVar2.f174601b) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("reoderTabPos ");
                        FinderProfileTabUIC.C3524c cVar2 = gVar2 instanceof FinderProfileTabUIC.C3524c ? (FinderProfileTabUIC.C3524c) gVar2 : null;
                        sb4.append(cVar2 != null ? Integer.valueOf(cVar2.f32063h) : null);
                        sb4.append(" pos from:");
                        sb4.append(i2);
                        sb4.append(" to:");
                        sb4.append(i5);
                        sb4.append('!');
                        Log.m105924i("Finder.FinderTabUIC", sb4.toString());
                        i2 = i5;
                    } else {
                        i5 = i6;
                    }
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("reoderTabPos  ");
                    FinderProfileTabUIC.C3524c cVar3 = gVar2 instanceof FinderProfileTabUIC.C3524c ? (FinderProfileTabUIC.C3524c) gVar2 : null;
                    sb5.append(cVar3 != null ? Integer.valueOf(cVar3.f32063h) : null);
                    sb5.append(" priority is max, pos from:");
                    sb5.append(i2);
                    sb5.append(" to:");
                    sb5.append(mo80041M3().size());
                    sb5.append('!');
                    Log.m105924i("Finder.FinderTabUIC", sb5.toString());
                    i2 = mo80041M3().size();
                }
            }
        }
        Log.m105924i("Finder.FinderTabUIC", "after reoderTabPos position from:" + i4 + " to " + i2);
        if (i2 >= 0 && i2 <= mo80041M3().size()) {
            int n3 = mo80060n3();
            gVar2.f174600a = i2;
            C24564k0.m30738b(mo80041M3()).add(i2, gVar2);
            if (this.f162508f != null) {
                mo80052c3(gVar2, i2);
            }
            C118286a<FinderHomeTabFragment> aVar = this.f162510h;
            if (aVar != null) {
                aVar.mo183059a(new C118286a.C64160a(true, i2), finderHomeTabFragment2);
            }
            if (z) {
                m65393a4(this, i2, false, 2, (Object) null);
            } else if (n3 >= i2) {
                mo80050Z3(n3 + 1, true);
            }
        }
        mo78525l3();
    }

    /* renamed from: g3 */
    public void mo80055g3() {
        TabLayout tabLayout = this.f162508f;
        if (tabLayout != null) {
            Log.m105924i("Finder.FinderTabUIC", "ajustIndicator:" + tabLayout.getTabCount());
            if (tabLayout.getTabCount() > 1) {
                tabLayout.post(new C56692a(this));
            }
        }
    }

    public final FinderHomeTabFragment getActiveFragment() {
        ViewPager viewPager = this.f162509g;
        int currentItem = viewPager != null ? viewPager.getCurrentItem() : this.f162506d;
        if (currentItem < 0 || currentItem >= mo80061o3().size()) {
            currentItem = 0;
        }
        return mo80061o3().get(currentItem);
    }

    public int getLayoutId() {
        mo80044P3();
        return mo80038J3().getLayoutId();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        r5 = r5.mo146907k(r3);
     */
    /* renamed from: i3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo80057i3() {
        /*
            r8 = this;
            com.google.android.material.tabs.TabLayout r0 = r8.f162508f
            if (r0 == 0) goto L_0x0055
            int r0 = r0.getTabCount()
            android.view.ViewGroup r1 = r8.mo80035F3()
            if (r1 == 0) goto L_0x0055
            r2 = 0
            r3 = 0
            r4 = 0
        L_0x0011:
            if (r3 >= r0) goto L_0x0050
            com.google.android.material.tabs.TabLayout r5 = r8.f162508f
            if (r5 == 0) goto L_0x0020
            com.google.android.material.tabs.TabLayout$f r5 = r5.mo146907k(r3)
            if (r5 == 0) goto L_0x0020
            java.lang.Object r5 = r5.f154600a
            goto L_0x0021
        L_0x0020:
            r5 = 0
        L_0x0021:
            java.lang.String r6 = "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.tabcomp.FinderBaseTab"
            gy3.C87412m.m108592e(r5, r6)
            ls1.g r5 = (ls1.C61391g) r5
            int[] r5 = r5.mo3853b()
            r6 = r5[r2]
            r7 = 1
            if (r6 > 0) goto L_0x0035
            r6 = r5[r7]
            if (r6 <= 0) goto L_0x004d
        L_0x0035:
            android.content.Context r4 = r1.getContext()
            r6 = r5[r2]
            int r4 = kg3.C76577a.m92151b(r4, r6)
            android.content.Context r6 = r1.getContext()
            r5 = r5[r7]
            int r5 = kg3.C76577a.m92151b(r6, r5)
            r8.mo80053c4(r1, r3, r4, r5)
            r4 = 1
        L_0x004d:
            int r3 = r3 + 1
            goto L_0x0011
        L_0x0050:
            if (r4 == 0) goto L_0x0055
            r1.requestLayout()
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC.mo80057i3():void");
    }

    /* renamed from: j3 */
    public void mo80058j3() {
        TabLayout tabLayout = this.f162508f;
        if (tabLayout != null) {
            tabLayout.mo146882a(new C56693b(this, tabLayout));
            int i = 0;
            for (T next : mo80041M3()) {
                int i2 = i + 1;
                if (i >= 0) {
                    C61391g gVar = (C61391g) next;
                    gVar.f174600a = i;
                    mo80052c3(gVar, -1);
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            mo80055g3();
        }
    }

    /* renamed from: k3 */
    public final boolean mo80059k3(int i) {
        for (FinderHomeTabFragment finderHomeTabFragment : mo80061o3()) {
            if (finderHomeTabFragment.f17334o == i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: l3 */
    public void mo78525l3() {
        if (mo80041M3().size() <= 1) {
            HardTouchableLayout f = mo80038J3().mo86338f();
            if (f != null) {
                f.setVisibility(8);
                return;
            }
            return;
        }
        HardTouchableLayout f2 = mo80038J3().mo86338f();
        if (f2 != null) {
            f2.setVisibility(0);
        }
    }

    /* renamed from: m3 */
    public abstract IFinderTabProvider mo11417m3();

    /* renamed from: n3 */
    public final int mo80060n3() {
        ViewPager viewPager = this.f162509g;
        return viewPager != null ? viewPager.getCurrentItem() : this.f162506d;
    }

    /* renamed from: o3 */
    public final List<FinderHomeTabFragment> mo80061o3() {
        List<? extends FinderHomeTabFragment> list = this.f162513n;
        if (list != null) {
            return list;
        }
        C87412m.m108603p("fragments");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        FragmentManager fragmentManager;
        mo80044P3();
        super.onCreate(bundle);
        if (mo80061o3().size() == mo80041M3().size()) {
            C61395m J3 = mo80038J3();
            Window window = getActivity().getWindow();
            C87412m.m108593f(window, "activity.window");
            J3.mo86335b(window);
            if (this.tabProvider != null) {
                this.f162508f = mo80038J3().mo86337e();
                this.f162509g = mo80038J3().mo86336c();
                mo80043O3();
            }
            AppCompatActivity activity = getActivity();
            C87412m.m108592e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            ((MMActivity) activity).setTitleBarClickListener(new C56694c(this), new C56695d(this));
            View d = mo80038J3().mo78527d();
            if (d != null) {
                d.setOnClickListener(new C56696e(this));
            }
            this.f162517r = new C13447sa(this, getActivity(), mo80061o3());
            ViewPager viewPager = this.f162509g;
            if (viewPager != null) {
                if (getFragment() != null) {
                    Fragment fragment = getFragment();
                    C87412m.m108591d(fragment);
                    fragmentManager = fragment.getChildFragmentManager();
                } else {
                    fragmentManager = getActivity().getSupportFragmentManager();
                }
                C87412m.m108593f(fragmentManager, "if (fragment != null) {\n…mentManager\n            }");
                if (this.f162507e) {
                    C118286a<FinderHomeTabFragment> aVar = new C118286a<>(viewPager, fragmentManager, C24564k0.m30738b(mo80061o3()));
                    this.f162510h = aVar;
                    viewPager.setAdapter(aVar);
                    int size = mo80041M3().size() + 3;
                    if (size > 5) {
                        size = 5;
                    }
                    viewPager.setOffscreenPageLimit(size);
                } else {
                    viewPager.setAdapter(new C64164c(fragmentManager, mo80061o3(), 0));
                    viewPager.setOffscreenPageLimit(mo80041M3().size() + 1);
                }
                FinderFragmentChangeObserver finderFragmentChangeObserver = this.f162517r;
                if (finderFragmentChangeObserver != null) {
                    viewPager.addOnPageChangeListener(finderFragmentChangeObserver);
                    C37521f.f99374d.getClass();
                    int intValue = C37521f.f99421i2.mo60266n().intValue();
                    if (intValue > 0) {
                        Context context = viewPager.getContext();
                        try {
                            Field declaredField = ViewPager.class.getDeclaredField("mScroller");
                            C87412m.m108593f(declaredField, "ViewPager::class.java.ge…eclaredField(\"mScroller\")");
                            declaredField.setAccessible(true);
                            declaredField.set(viewPager, new C75653r5(context, intValue));
                        } catch (Exception e) {
                            Log.printErrStackTrace("ViewPageUtils", e, "", new Object[0]);
                        }
                    }
                } else {
                    C87412m.m108603p("fragmentChangeObserver");
                    throw null;
                }
            }
            mo80058j3();
            HardTouchableLayout f = mo80038J3().mo86338f();
            if (f != null) {
                f.setOnDoubleClickListener(new C63623ra(this));
            }
            m65393a4(this, 0, false, 2, (Object) null);
            mo80049Y3();
            return;
        }
        Log.m105920e("Finder.FinderTabUIC", "fragments size must not be equal to tabs");
        throw new IllegalArgumentException("FinderTabUIC: fragments size must not be equal to tabs");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.m105924i("Finder.FinderTabUIC", "onDestroy");
        C118286a<FinderHomeTabFragment> aVar = this.f162510h;
        if (aVar != null) {
            Log.m105924i("Finder.DynamicAdapter", "removePendingActions");
            ((ArrayList) aVar.f353530o).clear();
            ((ArrayList) aVar.f353531p).clear();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FinderTabUIC(Fragment fragment) {
        super(fragment);
        C87412m.m108594g(fragment, "fragment");
        C37521f.f99374d.getClass();
        this.f162518s = C37521f.f99424i5.mo60266n().intValue() != 1 ? false : true;
    }
}
