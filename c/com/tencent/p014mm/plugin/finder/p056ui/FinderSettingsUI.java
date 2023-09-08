package com.tencent.p014mm.plugin.finder.p056ui;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.C39622i0;
import androidx.viewpager.widget.ViewPager;
import bl3.C39818r;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.tools.C106742j1;
import com.tencent.p014mm.plugin.finder.view.FinderViewPager;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.view.HardTouchableLayout;
import f40.C86709a0;
import f40.C86737h0;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import kotlin.Metadata;
import p192l4.C10462b;
import pe1.C35464c;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sr1.C64164c;
import sx3.C64197v;
import up1.C37521f;
import ye1.C66629k;
import z04.C112550d0;

@Metadata(mo182092bv = {}, mo182093d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, mo182094d2 = {"Lcom/tencent/mm/plugin/finder/ui/FinderSettingsUI;", "Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "<init>", "()V", "plugin-finder_release"}, mo182095k = 1, mo182096mv = {1, 7, 1})
@C86737h0
/* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingsUI */
public final class FinderSettingsUI extends MMFinderUI {

    /* renamed from: r */
    public static final /* synthetic */ int f161137r = 0;

    /* renamed from: o */
    public final C13601g f161138o = C36568h.m40985a(new C56367e(this));

    /* renamed from: p */
    public int f161139p;

    /* renamed from: q */
    public final ArrayList<SettingFragment> f161140q;

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingsUI$a */
    public static final class C56363a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSettingsUI f161141d;

        public C56363a(FinderSettingsUI finderSettingsUI) {
            this.f161141d = finderSettingsUI;
        }

        public final boolean onMenuItemClick(MenuItem menuItem) {
            this.f161141d.finish();
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingsUI$b */
    public static final class C56364b implements ViewPager.OnPageChangeListener {

        /* renamed from: d */
        public final /* synthetic */ FinderSettingsUI f161142d;

        public C56364b(FinderSettingsUI finderSettingsUI) {
            this.f161142d = finderSettingsUI;
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            FinderSettingsUI finderSettingsUI = this.f161142d;
            finderSettingsUI.f161139p = i;
            TabLayout.C55061f k = finderSettingsUI.mo79119N7().f191590a.mo146907k(i);
            if (k != null) {
                k.mo76121b();
            }
            this.f161142d.f161140q.get(i).mo79128X();
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingsUI$c */
    public static final class C56365c implements TabLayout.C104470c<TabLayout.C55061f> {

        /* renamed from: a */
        public final /* synthetic */ FinderSettingsUI f161143a;

        public C56365c(FinderSettingsUI finderSettingsUI) {
            this.f161143a = finderSettingsUI;
        }

        /* renamed from: a */
        public void mo9213a(TabLayout.C55061f fVar) {
        }

        /* renamed from: b */
        public void mo9214b(TabLayout.C55061f fVar) {
            C87412m.m108594g(fVar, "p0");
            FinderSettingsUI finderSettingsUI = this.f161143a;
            int i = FinderSettingsUI.f161137r;
            finderSettingsUI.mo79119N7().f191591b.setCurrentItem(fVar.f154604e);
        }

        /* renamed from: c */
        public void mo9215c(TabLayout.C55061f fVar) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingsUI$d */
    public static final class C56366d implements C106742j1.C106756o {

        /* renamed from: d */
        public SettingFragment f161144d;

        /* renamed from: e */
        public final /* synthetic */ FinderSettingsUI f161145e;

        public C56366d(FinderSettingsUI finderSettingsUI) {
            this.f161145e = finderSettingsUI;
        }

        /* renamed from: H5 */
        public void mo1321H5() {
            SettingFragment settingFragment = this.f161144d;
            if (settingFragment != null) {
                C39622i0 a = C39818r.f106831a.mo62445d(settingFragment).mo75002a(ViewBindUIC.class);
                C87412m.m108593f(a, "UICProvider.of(fragment)…(ViewBindUIC::class.java)");
                ((ViewBindUIC) a).mo79129c3(settingFragment.f161165q);
            }
        }

        /* renamed from: S6 */
        public boolean mo1322S6(String str) {
            return false;
        }

        /* renamed from: i7 */
        public void mo1323i7() {
            FinderSettingsUI finderSettingsUI = this.f161145e;
            this.f161144d = finderSettingsUI.f161140q.get(finderSettingsUI.f161139p);
        }

        /* renamed from: l3 */
        public void mo1324l3(String str) {
            C87412m.m108594g(str, "searchText");
            SettingFragment settingFragment = this.f161144d;
            if (settingFragment != null) {
                C39622i0 a = C39818r.f106831a.mo62445d(settingFragment).mo75002a(ViewBindUIC.class);
                C87412m.m108593f(a, "UICProvider.of(fragment)…(ViewBindUIC::class.java)");
                ViewBindUIC viewBindUIC = (ViewBindUIC) a;
                ArrayList<C35464c<?>> arrayList = settingFragment.f161165q;
                ArrayList arrayList2 = new ArrayList();
                for (T next : arrayList) {
                    if (C112550d0.m153801u(((C35464c) next).f94903d, str, true)) {
                        arrayList2.add(next);
                    }
                }
                viewBindUIC.mo79129c3(arrayList2);
            }
        }

        /* renamed from: l5 */
        public void mo1325l5() {
        }

        /* renamed from: y4 */
        public void mo1326y4() {
        }
    }

    /* renamed from: com.tencent.mm.plugin.finder.ui.FinderSettingsUI$e */
    public static final class C56367e extends C87413o implements C32224a<C66629k> {

        /* renamed from: d */
        public final /* synthetic */ FinderSettingsUI f161146d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C56367e(FinderSettingsUI finderSettingsUI) {
            super(0);
            this.f161146d = finderSettingsUI;
        }

        public Object invoke() {
            View findViewById = this.f161146d.findViewById(C0966R.C0970id.f358509mt0);
            LinearLayout linearLayout = (LinearLayout) findViewById;
            int i = C0966R.C0970id.kci;
            TabLayout tabLayout = (TabLayout) C10462b.m10395a(findViewById, C0966R.C0970id.kci);
            if (tabLayout != null) {
                i = C0966R.C0970id.kcj;
                HardTouchableLayout hardTouchableLayout = (HardTouchableLayout) C10462b.m10395a(findViewById, C0966R.C0970id.kcj);
                if (hardTouchableLayout != null) {
                    i = C0966R.C0970id.l89;
                    FinderViewPager finderViewPager = (FinderViewPager) C10462b.m10395a(findViewById, C0966R.C0970id.l89);
                    if (finderViewPager != null) {
                        return new C66629k(linearLayout, linearLayout, tabLayout, hardTouchableLayout, finderViewPager);
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(findViewById.getResources().getResourceName(i)));
        }
    }

    public FinderSettingsUI() {
        ArrayList<SettingFragment> arrayList = new ArrayList<>();
        arrayList.add(new AllFragment());
        arrayList.add(new FavFragment());
        this.f161140q = arrayList;
    }

    /* renamed from: N7 */
    public final C66629k mo79119N7() {
        return (C66629k) ((C36570n) this.f161138o).getValue();
    }

    public int getLayoutId() {
        return C0966R.C0971layout.csa;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!C86709a0.m107522a()) {
            finish();
        }
        setMMTitle("视频号维修厂");
        C37521f.f99374d.getClass();
        C37521f.f99564y1.getClass();
        Log.m105924i("Finder.FinderSettingsUI", "");
        setBackBtn(new C56363a(this));
        C56366d dVar = new C56366d(this);
        C106742j1 j1Var = new C106742j1(true, true);
        j1Var.f319122j = dVar;
        addSearchMenu(true, j1Var);
        FinderViewPager finderViewPager = mo79119N7().f191591b;
        finderViewPager.setEnableViewPagerScroll(true);
        finderViewPager.setAdapter(new C64164c(getSupportFragmentManager(), this.f161140q, 0, 4, (C8480h) null));
        finderViewPager.setOffscreenPageLimit(2);
        finderViewPager.addOnPageChangeListener(new C56364b(this));
        TabLayout tabLayout = mo79119N7().f191590a;
        int i = 0;
        for (T next : this.f161140q) {
            int i2 = i + 1;
            if (i >= 0) {
                TabLayout.C55061f l = tabLayout.mo146908l();
                l.mo76123d(((SettingFragment) next).f17333n);
                tabLayout.mo146888c(l, i, i == 0);
                i = i2;
            } else {
                C64197v.m75542k();
                throw null;
            }
        }
        tabLayout.mo146882a(new C56365c(this));
    }
}
