package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.p136ui.base.MMFrameLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.AdFrameLayout */
public class AdFrameLayout extends MMFrameLayout {

    /* renamed from: e */
    public FrameLayout f206064e;

    public AdFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void addView(View view) {
        SnsMethodCalculate.markStartTimeMs("addView", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.addView(view);
        SnsMethodCalculate.markEndTimeMs("addView", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    public void draw(Canvas canvas) {
        SnsMethodCalculate.markStartTimeMs("draw", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.draw(canvas);
        SnsMethodCalculate.markEndTimeMs("draw", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    public FrameLayout getAdFullFrameAnimContainer() {
        SnsMethodCalculate.markStartTimeMs("getAdFullFrameAnimContainer", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        if (this.f206064e == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.f206064e = frameLayout;
            addView(frameLayout);
        }
        FrameLayout frameLayout2 = this.f206064e;
        SnsMethodCalculate.markEndTimeMs("getAdFullFrameAnimContainer", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        return frameLayout2;
    }

    public void onDetachedFromWindow() {
        SnsMethodCalculate.markStartTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.onDetachedFromWindow();
        SnsMethodCalculate.markEndTimeMs("onDetachedFromWindow", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        System.currentTimeMillis();
        super.onLayout(z, i, i2, i3, i4);
        FrameLayout frameLayout = this.f206064e;
        if (frameLayout != null) {
            frameLayout.layout(0, 0, getWidth(), getHeight());
        }
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.onMeasure(i, i2);
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.onSizeChanged(i, i2, i3, i4);
        SnsMethodCalculate.markEndTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    public void removeView(View view) {
        SnsMethodCalculate.markStartTimeMs("removeView", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.removeView(view);
        SnsMethodCalculate.markEndTimeMs("removeView", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }

    public void requestLayout() {
        SnsMethodCalculate.markStartTimeMs("requestLayout", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
        super.requestLayout();
        SnsMethodCalculate.markEndTimeMs("requestLayout", "com.tencent.mm.plugin.sns.ui.AdFrameLayout");
    }
}
