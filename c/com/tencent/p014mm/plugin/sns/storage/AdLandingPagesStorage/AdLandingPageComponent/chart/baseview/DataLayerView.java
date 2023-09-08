package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView */
public abstract class DataLayerView extends View {
    public DataLayerView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public abstract int mo131465a();

    /* renamed from: b */
    public abstract int mo131466b();

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
        super.onLayout(z, i, i2, i3, i4);
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
        int mode = View.MeasureSpec.getMode(i);
        SnsMethodCalculate.markStartTimeMs("logSpec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
        if (mode == 0) {
            SnsMethodCalculate.markEndTimeMs("logSpec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
        } else if (mode == Integer.MIN_VALUE) {
            SnsMethodCalculate.markEndTimeMs("logSpec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
        } else if (mode == 1073741824) {
            SnsMethodCalculate.markEndTimeMs("logSpec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
        } else {
            SnsMethodCalculate.markEndTimeMs("logSpec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
        }
        SnsMethodCalculate.markStartTimeMs("getImprovedDefaultWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode2 == Integer.MIN_VALUE) {
            SnsMethodCalculate.markStartTimeMs("hGetMinimumWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
            int suggestedMinimumWidth = getSuggestedMinimumWidth();
            SnsMethodCalculate.markEndTimeMs("hGetMinimumWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
            SnsMethodCalculate.markEndTimeMs("getImprovedDefaultWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
            size = suggestedMinimumWidth;
        } else if (mode2 == 0) {
            size = mo131466b();
            SnsMethodCalculate.markEndTimeMs("getImprovedDefaultWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
        } else if (mode2 != 1073741824) {
            SnsMethodCalculate.markEndTimeMs("getImprovedDefaultWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
        } else {
            SnsMethodCalculate.markEndTimeMs("getImprovedDefaultWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
        }
        SnsMethodCalculate.markStartTimeMs("getImprovedDefaultHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
        int mode3 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode3 == Integer.MIN_VALUE) {
            SnsMethodCalculate.markStartTimeMs("hGetMinimumHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
            int suggestedMinimumHeight = getSuggestedMinimumHeight();
            SnsMethodCalculate.markEndTimeMs("hGetMinimumHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
            SnsMethodCalculate.markEndTimeMs("getImprovedDefaultHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
            size2 = suggestedMinimumHeight;
        } else if (mode3 == 0) {
            size2 = mo131465a();
            SnsMethodCalculate.markEndTimeMs("getImprovedDefaultHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
        } else if (mode3 != 1073741824) {
            SnsMethodCalculate.markEndTimeMs("getImprovedDefaultHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
        } else {
            SnsMethodCalculate.markEndTimeMs("getImprovedDefaultHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
        }
        setMeasuredDimension(size, size2);
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
        super.onSizeChanged(i, i2, i3, i4);
        SnsMethodCalculate.markEndTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.DataLayerView");
    }

    public DataLayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DataLayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
