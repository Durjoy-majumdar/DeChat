package com.tencent.p014mm.plugin.sns.p104ad.widget.dragad;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout */
public class AdLinearLayout extends LinearLayout {

    /* renamed from: d */
    public FrameLayout f21121d;

    public AdLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
        super.onLayout(z, i, i2, i3, i4);
        FrameLayout frameLayout = this.f21121d;
        if (frameLayout != null) {
            SnsMethodCalculate.markStartTimeMs("getParentPaddingLeft", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
            int i5 = 0;
            for (ViewParent parent = frameLayout.getParent(); parent instanceof View; parent = parent.getParent()) {
                i5 += ((View) parent).getPaddingLeft();
            }
            SnsMethodCalculate.markEndTimeMs("getParentPaddingLeft", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
            FrameLayout frameLayout2 = this.f21121d;
            SnsMethodCalculate.markStartTimeMs("getParentPaddingRight", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
            int i6 = 0;
            for (ViewParent parent2 = frameLayout2.getParent(); parent2 instanceof View; parent2 = parent2.getParent()) {
                i6 += ((View) parent2).getPaddingRight();
            }
            SnsMethodCalculate.markEndTimeMs("getParentPaddingRight", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
            int i7 = this.f21121d.getLayoutParams().height;
            if (i7 <= 0) {
                i7 = getHeight();
            }
            this.f21121d.layout(-i5, 0, getWidth() + i6, i7);
            Log.m105924i("AdLinearLayout", "w=" + getWidth() + ",h=" + getHeight() + ", container.w=" + this.f21121d.getWidth() + ", container.h=" + this.f21121d.getHeight() + ", paddingLeft=" + i5 + ", paddingRight=" + i6);
        }
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
    }

    public void setAdFullFrameContainer(FrameLayout frameLayout) {
        SnsMethodCalculate.markStartTimeMs("setAdFullFrameContainer", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
        this.f21121d = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(0, 0));
        SnsMethodCalculate.markEndTimeMs("setAdFullFrameContainer", "com.tencent.mm.plugin.sns.ad.widget.dragad.AdLinearLayout");
    }

    public AdLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
