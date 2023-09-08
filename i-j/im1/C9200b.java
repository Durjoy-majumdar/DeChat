package im1;

import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.finder.nearby.base.AbsNearByFragment;
import com.tencent.p014mm.plugin.finder.view.FinderFragmentChangeObserver;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C87412m;
import java.util.List;
import sx3.C64197v;

/* renamed from: im1.b */
public abstract class C9200b implements ViewPager.OnPageChangeListener, C9199a {

    /* renamed from: d */
    public final MMActivity f28936d;

    /* renamed from: e */
    public final List<AbsNearByFragment> f28937e;

    /* renamed from: f */
    public int f28938f = -1;

    /* renamed from: g */
    public int f28939g = -1;

    public C9200b(MMActivity mMActivity, List<? extends AbsNearByFragment> list) {
        C87412m.m108594g(mMActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(list, "fragments");
        this.f28936d = mMActivity;
        this.f28937e = list;
    }

    public void onPageScrollStateChanged(int i) {
        Log.m105924i(FinderFragmentChangeObserver.TAG, "onPageScrollStateChanged position:" + i);
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        if (this.f28938f != i) {
            AbsNearByFragment absNearByFragment = null;
            int i2 = 0;
            for (T next : this.f28937e) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    AbsNearByFragment absNearByFragment2 = (AbsNearByFragment) next;
                    if (i == i2) {
                        absNearByFragment = absNearByFragment2;
                    } else if (this.f28938f == i2) {
                        absNearByFragment2.mo3550P();
                        mo3546a(false, i2, absNearByFragment2);
                    }
                    i2 = i3;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            mo3547k(this.f28938f, i, this.f28939g, this.f28937e.get(i).f15527o);
            if (absNearByFragment != null) {
                absNearByFragment.mo2202O();
                mo3546a(true, i, absNearByFragment);
            }
        }
        this.f28938f = i;
        this.f28939g = this.f28937e.get(i).f15527o;
    }
}
