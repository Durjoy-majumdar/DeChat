package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager */
public class AdlandingDummyViewPager extends DummyViewPager {

    /* renamed from: d1 */
    public static final /* synthetic */ int f276455d1 = 0;

    /* renamed from: b1 */
    public C95258b f276456b1 = new C95258b((C95257a) null);

    /* renamed from: c1 */
    public Set<ViewPager.OnPageChangeListener> f276457c1 = new HashSet();

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager$b */
    public class C95258b implements ViewPager.OnPageChangeListener {
        public C95258b(C95257a aVar) {
        }

        public void onPageScrollStateChanged(int i) {
            SnsMethodCalculate.markStartTimeMs("onPageScrollStateChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager$MultiPageChangeListener");
            if (i == 0) {
                AdlandingDummyViewPager adlandingDummyViewPager = AdlandingDummyViewPager.this;
                adlandingDummyViewPager.f276459a1 = adlandingDummyViewPager.getScrollX();
            }
            AdlandingDummyViewPager adlandingDummyViewPager2 = AdlandingDummyViewPager.this;
            int i2 = AdlandingDummyViewPager.f276455d1;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager");
            Set<ViewPager.OnPageChangeListener> set = adlandingDummyViewPager2.f276457c1;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager");
            Iterator it = ((HashSet) set).iterator();
            while (it.hasNext()) {
                ((ViewPager.OnPageChangeListener) it.next()).onPageScrollStateChanged(i);
            }
            SnsMethodCalculate.markEndTimeMs("onPageScrollStateChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager$MultiPageChangeListener");
        }

        public void onPageScrolled(int i, float f, int i2) {
            SnsMethodCalculate.markStartTimeMs("onPageScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager$MultiPageChangeListener");
            AdlandingDummyViewPager adlandingDummyViewPager = AdlandingDummyViewPager.this;
            int i3 = AdlandingDummyViewPager.f276455d1;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager");
            Set<ViewPager.OnPageChangeListener> set = adlandingDummyViewPager.f276457c1;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager");
            Iterator it = ((HashSet) set).iterator();
            while (it.hasNext()) {
                ((ViewPager.OnPageChangeListener) it.next()).onPageScrolled(i, f, i2);
            }
            SnsMethodCalculate.markEndTimeMs("onPageScrolled", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager$MultiPageChangeListener");
        }

        public void onPageSelected(int i) {
            SnsMethodCalculate.markStartTimeMs("onPageSelected", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager$MultiPageChangeListener");
            AdlandingDummyViewPager adlandingDummyViewPager = AdlandingDummyViewPager.this;
            int i2 = AdlandingDummyViewPager.f276455d1;
            SnsMethodCalculate.markStartTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager");
            Set<ViewPager.OnPageChangeListener> set = adlandingDummyViewPager.f276457c1;
            SnsMethodCalculate.markEndTimeMs("access$100", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager");
            Iterator it = ((HashSet) set).iterator();
            while (it.hasNext()) {
                ((ViewPager.OnPageChangeListener) it.next()).onPageSelected(i);
            }
            SnsMethodCalculate.markEndTimeMs("onPageSelected", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdlandingDummyViewPager$MultiPageChangeListener");
        }
    }

    public AdlandingDummyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnPageChangeListener(this.f276456b1);
    }
}
