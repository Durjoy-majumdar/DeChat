package com.tencent.p014mm.plugin.sns.p104ad.landingpage.component.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.view.RelativeLayoutWithInterceptor */
public class RelativeLayoutWithInterceptor extends RelativeLayout {

    /* renamed from: com.tencent.mm.plugin.sns.ad.landingpage.component.view.RelativeLayoutWithInterceptor$a */
    public interface C5426a {
        /* renamed from: a */
        boolean mo6400a(MotionEvent motionEvent);
    }

    public RelativeLayoutWithInterceptor(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        SnsMethodCalculate.markStartTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.RelativeLayoutWithInterceptor");
        SnsMethodCalculate.markEndTimeMs("onInterceptTouchEvent", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.RelativeLayoutWithInterceptor");
        return true;
    }

    public void setEventInterceptor(C5426a aVar) {
        SnsMethodCalculate.markStartTimeMs("setEventInterceptor", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.RelativeLayoutWithInterceptor");
        SnsMethodCalculate.markEndTimeMs("setEventInterceptor", "com.tencent.mm.plugin.sns.ad.landingpage.component.view.RelativeLayoutWithInterceptor");
    }

    public RelativeLayoutWithInterceptor(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
