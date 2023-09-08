package com.tencent.p014mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView */
public abstract class ChartGridView extends View {
    public ChartGridView(Context context) {
        super(context);
    }

    /* renamed from: a */
    public abstract int mo131460a();

    /* renamed from: b */
    public abstract int mo131461b();

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
        super.onLayout(z, i, i2, i3, i4);
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
        int mode = View.MeasureSpec.getMode(i);
        SnsMethodCalculate.markStartTimeMs("logSpec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
        if (mode == 0) {
            SnsMethodCalculate.markEndTimeMs("logSpec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
        } else if (mode == Integer.MIN_VALUE) {
            SnsMethodCalculate.markEndTimeMs("logSpec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
        } else if (mode == 1073741824) {
            SnsMethodCalculate.markEndTimeMs("logSpec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
        } else {
            SnsMethodCalculate.markEndTimeMs("logSpec", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
        }
        SnsMethodCalculate.markStartTimeMs("getImprovedDefaultWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
        int mode2 = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode2 == Integer.MIN_VALUE) {
            SnsMethodCalculate.markStartTimeMs("hGetMinimumWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
            int suggestedMinimumWidth = getSuggestedMinimumWidth();
            SnsMethodCalculate.markEndTimeMs("hGetMinimumWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
            SnsMethodCalculate.markEndTimeMs("getImprovedDefaultWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
            size = suggestedMinimumWidth;
        } else if (mode2 == 0) {
            size = mo131461b();
            SnsMethodCalculate.markEndTimeMs("getImprovedDefaultWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
        } else if (mode2 != 1073741824) {
            SnsMethodCalculate.markEndTimeMs("getImprovedDefaultWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
        } else {
            SnsMethodCalculate.markEndTimeMs("getImprovedDefaultWidth", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
        }
        SnsMethodCalculate.markStartTimeMs("getImprovedDefaultHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
        int mode3 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode3 == Integer.MIN_VALUE) {
            SnsMethodCalculate.markStartTimeMs("hGetMinimumHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
            int suggestedMinimumHeight = getSuggestedMinimumHeight();
            SnsMethodCalculate.markEndTimeMs("hGetMinimumHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
            SnsMethodCalculate.markEndTimeMs("getImprovedDefaultHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
            size2 = suggestedMinimumHeight;
        } else if (mode3 == 0) {
            size2 = mo131460a();
            SnsMethodCalculate.markEndTimeMs("getImprovedDefaultHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
        } else if (mode3 != 1073741824) {
            SnsMethodCalculate.markEndTimeMs("getImprovedDefaultHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
        } else {
            SnsMethodCalculate.markEndTimeMs("getImprovedDefaultHeight", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
        }
        setMeasuredDimension(size, size2);
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
        super.onSizeChanged(i, i2, i3, i4);
        SnsMethodCalculate.markEndTimeMs("onSizeChanged", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.chart.baseview.ChartGridView");
    }

    public ChartGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChartGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
