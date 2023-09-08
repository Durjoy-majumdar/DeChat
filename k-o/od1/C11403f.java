package od1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.finder.p056ui.MMFinderUI;
import com.tencent.p014mm.plugin.finder.view.FinderViewPager;
import com.tencent.p014mm.plugin.finder.view.tabcomp.IFinderTabProvider;
import com.tencent.p014mm.plugin.finder.viewmodel.component.FinderTabUIC;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.Set;
import ld1.C10486a;
import ls1.C61391g;
import nd1.C11149a;
import nd1.C61676c;
import od1.C11405h;
import pe3.C47465a;

/* renamed from: od1.f */
public abstract class C11403f<T extends C47465a> extends FinderTabUIC implements C11405h {

    /* renamed from: t */
    public T f33558t;

    /* renamed from: u */
    public boolean f33559u = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11403f(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: l4 */
    public static /* synthetic */ void m11231l4(C11403f fVar, String str, int i, int i2, int i3, Object obj) {
        if (obj == null) {
            if ((i3 & 4) != 0) {
                i2 = 0;
            }
            fVar.mo322k4(str, i, i2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportTab");
    }

    /* renamed from: R3 */
    public void mo11412R3(int i) {
        if (this.f33559u) {
            this.f33559u = false;
        } else if (i >= 0 && i < mo80041M3().size()) {
            C61391g gVar = mo80041M3().get(i);
            if (gVar instanceof C11149a) {
                C11149a aVar = (C11149a) gVar;
                mo322k4(aVar.mo10907i(getContext()).toString(), aVar.f32927k, 1);
            }
        }
    }

    /* renamed from: c2 */
    public void mo513c2() {
        TabLayout tabLayout = this.f162508f;
        if (tabLayout != null) {
            tabLayout.setSelectedTabIndicatorColor(getResources().getColor(C0966R.color.f3390r5));
        }
        mo11418o4(true);
    }

    /* renamed from: d4 */
    public abstract int mo2227d4();

    /* renamed from: e4 */
    public final Set<UIComponent> mo11413e4() {
        AppCompatActivity activity = getActivity();
        MMFinderUI mMFinderUI = activity instanceof MMFinderUI ? (MMFinderUI) activity : null;
        if (mMFinderUI != null) {
            return mMFinderUI.getUiComponents();
        }
        return null;
    }

    /* renamed from: f4 */
    public void mo2228f4() {
    }

    /* renamed from: g4 */
    public boolean mo2229g4(int i) {
        return false;
    }

    public String getCoverImgUrl() {
        C11396b V3;
        String a;
        AppCompatActivity activity = getActivity();
        C10486a aVar = activity instanceof C10486a ? (C10486a) activity : null;
        return (aVar == null || (V3 = aVar.mo2195V3()) == null || (a = V3.mo495a()) == null) ? "" : a;
    }

    /* renamed from: h4 */
    public void mo11415h4(int i, String str) {
        if (mo2229g4(i)) {
            Set<UIComponent> e4 = mo11413e4();
            if (e4 != null) {
                for (UIComponent uIComponent : e4) {
                    C11407i iVar = uIComponent instanceof C11407i ? (C11407i) uIComponent : null;
                    if (iVar != null) {
                        iVar.mo498c3(i, str);
                    }
                }
                return;
            }
            return;
        }
        Set<UIComponent> e44 = mo11413e4();
        if (e44 != null) {
            for (UIComponent uIComponent2 : e44) {
                C11407i iVar2 = uIComponent2 instanceof C11407i ? (C11407i) uIComponent2 : null;
                if (iVar2 != null) {
                    iVar2.mo327d3(i, str);
                }
            }
        }
    }

    /* renamed from: i0 */
    public boolean mo11416i0() {
        return C11405h.C11406a.m11253a(this);
    }

    /* renamed from: j4 */
    public void mo321j4(T t) {
        Set<UIComponent> e4 = mo11413e4();
        if (e4 != null) {
            for (UIComponent uIComponent : e4) {
                C11407i iVar = uIComponent instanceof C11407i ? (C11407i) uIComponent : null;
                if (iVar != null) {
                    iVar.mo492g3(t);
                }
            }
        }
    }

    /* renamed from: k4 */
    public void mo322k4(String str, int i, int i2) {
        C87412m.m108594g(str, "tabName");
    }

    /* renamed from: m3 */
    public IFinderTabProvider mo11417m3() {
        return new C61676c(mo2227d4());
    }

    /* renamed from: m4 */
    public void mo323m4() {
    }

    /* renamed from: n4 */
    public void mo324n4() {
        C11405h.C11406a.m11254b(this);
    }

    /* renamed from: o4 */
    public final void mo11418o4(boolean z) {
        int n3 = mo80060n3();
        int i = 0;
        for (C61391g next : mo80041M3()) {
            int i2 = i + 1;
            if (next instanceof C11149a) {
                boolean z2 = true;
                if (z) {
                    C11149a aVar = (C11149a) next;
                    boolean z3 = i == n3;
                    aVar.f32926j = true;
                    aVar.mo3857k(z3);
                } else {
                    C11149a aVar2 = (C11149a) next;
                    if (i != n3) {
                        z2 = false;
                    }
                    aVar2.f32926j = false;
                    aVar2.mo3857k(z2);
                }
            }
            i = i2;
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewPager viewPager = this.f162509g;
        if (viewPager instanceof FinderViewPager) {
            ((FinderViewPager) viewPager).setEnableViewPagerScroll(true);
        }
        mo2228f4();
        mo324n4();
        mo323m4();
    }

    public void setNormalStyle() {
        TabLayout tabLayout = this.f162508f;
        if (tabLayout != null) {
            tabLayout.setSelectedTabIndicatorColor(getResources().getColor(C0966R.color.FG_0));
        }
        mo11418o4(false);
    }
}
