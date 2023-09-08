package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.p136ui.widget.QFadeImageView;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.TagImageView */
public class TagImageView extends QFadeImageView {

    /* renamed from: J */
    public int f279054J = -1;

    public TagImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public int getPosition() {
        SnsMethodCalculate.markStartTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.TagImageView");
        int i = this.f279054J;
        SnsMethodCalculate.markEndTimeMs("getPosition", "com.tencent.mm.plugin.sns.ui.TagImageView");
        return i;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        SnsMethodCalculate.markStartTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.TagImageView");
        super.onLayout(z, i, i2, i3, i4);
        SnsMethodCalculate.markEndTimeMs("onLayout", "com.tencent.mm.plugin.sns.ui.TagImageView");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.TagImageView");
        super.onMeasure(i, i2);
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.TagImageView");
    }

    public void setPosition(int i) {
        SnsMethodCalculate.markStartTimeMs("setPosition", "com.tencent.mm.plugin.sns.ui.TagImageView");
        this.f279054J = i;
        SnsMethodCalculate.markEndTimeMs("setPosition", "com.tencent.mm.plugin.sns.ui.TagImageView");
    }

    public TagImageView(Context context) {
        super(context);
    }
}
