package r92;

import android.graphics.Bitmap;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.plugin.multitask.p079ui.base.MultiTaskViewPager;
import com.tencent.p014mm.sdk.platformtools.Log;
import hn3.C108252a;
import k92.C108974b;

/* renamed from: r92.d */
public final class C110560d implements ViewPager.OnPageChangeListener {

    /* renamed from: d */
    public final /* synthetic */ C110559c f330696d;

    public C110560d(C110559c cVar) {
        this.f330696d = cVar;
    }

    public void onPageScrollStateChanged(int i) {
        C108974b bVar;
        C108974b bVar2;
        if (i == 1) {
            C110559c cVar = this.f330696d;
            if (cVar.f330695e == 0 && (bVar2 = cVar.f330693c) != null) {
                bVar2.mo67897d();
            }
        }
        if (i == 0) {
            MultiTaskViewPager multiTaskViewPager = this.f330696d.f330692b;
            if (multiTaskViewPager != null && multiTaskViewPager.getCurrentItem() == 1) {
                try {
                    C110559c cVar2 = this.f330696d;
                    FrameLayout frameLayout = cVar2.f330694d;
                    if (!(frameLayout == null || (bVar = cVar2.f330693c) == null)) {
                        bVar.mo74193c(bVar != null ? bVar.mo160089o(C108252a.m146586d(frameLayout, (int) (((float) frameLayout.getWidth()) / 1.0f), (int) (((float) frameLayout.getHeight()) / 1.0f), true, Bitmap.Config.RGB_565)) : null);
                    }
                } catch (Throwable th) {
                    this.f330696d.getClass();
                    Log.m105921e("MicroMsg.MultiTaskWrapper", "snapshot bitmap failed", th);
                }
                MultiTaskViewPager multiTaskViewPager2 = this.f330696d.f330692b;
                if (multiTaskViewPager2 != null) {
                    multiTaskViewPager2.setCanSlide(false);
                }
                C108974b bVar3 = this.f330696d.f330693c;
                if (bVar3 != null) {
                    bVar3.mo160081f();
                }
            }
        }
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        this.f330696d.f330695e = i;
    }
}
