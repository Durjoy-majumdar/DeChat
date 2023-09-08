package com.tencent.p014mm.plugin.sns.p106ui.previewimageview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView */
public class WrappingGridView extends GridView {
    public WrappingGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void invalidate() {
        SnsMethodCalculate.markStartTimeMs("invalidate", "com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView");
        super.invalidate();
        SnsMethodCalculate.markEndTimeMs("invalidate", "com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView");
        if (getLayoutParams().height == -2) {
            i2 = View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView");
    }

    public void requestLayout() {
        SnsMethodCalculate.markStartTimeMs("requestLayout", "com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView");
        super.requestLayout();
        SnsMethodCalculate.markEndTimeMs("requestLayout", "com.tencent.mm.plugin.sns.ui.previewimageview.WrappingGridView");
    }

    public WrappingGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
