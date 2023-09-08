package n61;

import androidx.fragment.app.C112911a0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.p136ui.MMFragment;
import com.tencent.p014mm.p136ui.mogic.WxViewPager;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import fy3.C32226l;
import gy3.C87412m;

/* renamed from: n61.o */
public final class C47161o extends C112911a0 {

    /* renamed from: d */
    public final boolean f126694d;

    /* renamed from: e */
    public final C32226l<Integer, MMFragment> f126695e;

    /* renamed from: f */
    public final int f126696f = 2;

    /* renamed from: g */
    public final int f126697g = 1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47161o(FragmentActivity fragmentActivity, int i, ViewPager.OnPageChangeListener onPageChangeListener, WxViewPager wxViewPager, boolean z, C32226l<? super Integer, ? extends MMFragment> lVar) {
        super(fragmentActivity.getSupportFragmentManager());
        C87412m.m108594g(fragmentActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        C87412m.m108594g(onPageChangeListener, "pageChangedListener");
        C87412m.m108594g(wxViewPager, "pager");
        C87412m.m108594g(lVar, "fragmentRequest");
        this.f126694d = z;
        this.f126695e = lVar;
        wxViewPager.setAdapter(this);
        wxViewPager.setOnPageChangeListener(onPageChangeListener);
        wxViewPager.setCurrentItem(i);
    }

    public int getCount() {
        return this.f126694d ? this.f126696f : this.f126697g;
    }

    public Fragment getItem(int i) {
        return this.f126695e.invoke(Integer.valueOf(i));
    }
}
