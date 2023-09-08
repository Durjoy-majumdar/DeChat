package com.tencent.p014mm.plugin.appbrand.page.capsulebar;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.appbrand.page.C83896q4;

/* renamed from: com.tencent.mm.plugin.appbrand.page.capsulebar.AppBrandCapsuleBarPlaceHolderView */
public final class AppBrandCapsuleBarPlaceHolderView extends View implements C83896q4 {

    /* renamed from: d */
    public int f244529d = -1;

    public AppBrandCapsuleBarPlaceHolderView(Context context) {
        super(context);
    }

    /* renamed from: D */
    public boolean mo63301D(Canvas canvas) {
        return true;
    }

    public void onMeasure(int i, int i2) {
        if (getVisibility() == 0) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.max(this.f244529d, 0), 1073741824), i2);
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setFixedWidth(int i) {
        int max = Math.max(i, 0);
        if (max != this.f244529d) {
            this.f244529d = max;
            if (max != getMeasuredWidth()) {
                requestLayout();
            }
        }
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean z = getLayoutParams() == null;
        super.setLayoutParams(layoutParams);
        if (z) {
            int i = layoutParams.width;
            this.f244529d = i;
            this.f244529d = Math.max(0, i);
        }
    }

    public AppBrandCapsuleBarPlaceHolderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AppBrandCapsuleBarPlaceHolderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AppBrandCapsuleBarPlaceHolderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
