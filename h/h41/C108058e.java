package h41;

import androidx.viewpager.widget.ViewPager;

/* renamed from: h41.e */
public class C108058e implements ViewPager.OnPageChangeListener {

    /* renamed from: d */
    public long f323579d;

    /* renamed from: e */
    public final /* synthetic */ C117067b f323580e;

    public C108058e(C117067b bVar) {
        this.f323580e = bVar;
    }

    public void onPageScrollStateChanged(int i) {
        long currentTimeMillis = System.currentTimeMillis();
        this.f323580e.zx0(1, 251);
        if (currentTimeMillis - this.f323579d >= 251) {
            this.f323579d = currentTimeMillis;
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
    }
}
