package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SightRangeWidget */
public class SightRangeWidget extends RangeWidget {
    public SightRangeWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: b */
    public boolean mo132078b(int i, int i2, Intent intent, AtContactWidget atContactWidget) {
        SnsMethodCalculate.markStartTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightRangeWidget");
        super.mo132078b(i, i2, intent, atContactWidget);
        if (atContactWidget != null) {
            if (getLabelRange() == 1) {
                atContactWidget.setVisibility(4);
                atContactWidget.mo132061a();
            } else {
                atContactWidget.setVisibility(0);
            }
        }
        SnsMethodCalculate.markEndTimeMs("onActivityResult", "com.tencent.mm.plugin.sns.ui.SightRangeWidget");
        return true;
    }

    public int getLayoutResource() {
        SnsMethodCalculate.markStartTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.SightRangeWidget");
        SnsMethodCalculate.markEndTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.SightRangeWidget");
        return C0966R.C0971layout.bzs;
    }

    public int getMaxTagNameLen() {
        SnsMethodCalculate.markStartTimeMs("getMaxTagNameLen", "com.tencent.mm.plugin.sns.ui.SightRangeWidget");
        SnsMethodCalculate.markEndTimeMs("getMaxTagNameLen", "com.tencent.mm.plugin.sns.ui.SightRangeWidget");
        return 10;
    }

    public SightRangeWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
