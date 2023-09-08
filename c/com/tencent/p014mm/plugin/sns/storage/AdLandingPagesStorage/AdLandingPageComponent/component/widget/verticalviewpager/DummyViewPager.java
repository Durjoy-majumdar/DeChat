package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import java.io.Serializable;
import xs2.C15894a;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager */
public class DummyViewPager extends AdLandingViewPager implements Serializable {

    /* renamed from: a1 */
    public int f276459a1;

    /* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager$a */
    public class C95259a extends ViewPager.C39631j {
        public C95259a() {
        }

        public void onPageScrollStateChanged(int i) {
            SnsMethodCalculate.markStartTimeMs("onPageScrollStateChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager$1");
            if (i == 0) {
                DummyViewPager dummyViewPager = DummyViewPager.this;
                dummyViewPager.f276459a1 = dummyViewPager.getScrollX();
            }
            SnsMethodCalculate.markEndTimeMs("onPageScrollStateChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager$1");
        }
    }

    public DummyViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C15894a aVar = new C15894a();
        SnsMethodCalculate.markStartTimeMs("setPageTransformer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        boolean z = true != (this.f316225Q0 != null);
        this.f316225Q0 = aVar;
        setChildrenDrawingOrderEnabledCompat(true);
        this.f316229S0 = 1;
        if (z) {
            mo151971x();
        }
        SnsMethodCalculate.markEndTimeMs("setPageTransformer", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.AdLandingViewPager");
        setOnPageChangeListener(new C95259a());
    }

    public int getBaseScrollX() {
        SnsMethodCalculate.markStartTimeMs("getBaseScrollX", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager");
        int i = this.f276459a1;
        SnsMethodCalculate.markEndTimeMs("getBaseScrollX", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager");
        return i;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager");
        SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager");
        return false;
    }

    public void setBaseScrollX(int i) {
        SnsMethodCalculate.markStartTimeMs("setBaseScrollX", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager");
        this.f276459a1 = i;
        SnsMethodCalculate.markEndTimeMs("setBaseScrollX", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.widget.verticalviewpager.DummyViewPager");
    }
}
