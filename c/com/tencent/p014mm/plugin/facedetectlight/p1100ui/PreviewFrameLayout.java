package com.tencent.p014mm.plugin.facedetectlight.p1100ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* renamed from: com.tencent.mm.plugin.facedetectlight.ui.PreviewFrameLayout */
public class PreviewFrameLayout extends RelativeLayout {

    /* renamed from: d */
    public double f312699d = 1.3333333333333333d;

    public PreviewFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public double getmAspectRatio() {
        return this.f312699d;
    }

    public void setAspectRatio(double d) {
        if (d <= 0.0d) {
            throw new IllegalArgumentException();
        } else if (this.f312699d != d) {
            this.f312699d = d;
            requestLayout();
        }
    }
}
