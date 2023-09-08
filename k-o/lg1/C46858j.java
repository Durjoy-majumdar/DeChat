package lg1;

import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: lg1.j */
public final class C46858j implements ViewPager.OnPageChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C46854h f126041d;

    public C46858j(C46854h hVar) {
        this.f126041d = hVar;
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
        Log.m105924i("FinderLiveViewPagerComm", "onPageSelected: " + i + " positionOffset: " + f);
    }

    public void onPageSelected(int i) {
        Log.m105924i("FinderLiveViewPagerComm", "onPageSelected: " + i);
        this.f126041d.mo72063a1(this.f126041d.f126034v.f126867e.get(i).f30842d);
    }
}
