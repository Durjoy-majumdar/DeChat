package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.l$$j */
public class l$$j extends FrameLayout {
    public l$$j(C95136l lVar, Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$5");
        requestDisallowInterceptTouchEvent(true);
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingNewH5Comp$5");
        return onInterceptTouchEvent;
    }
}
