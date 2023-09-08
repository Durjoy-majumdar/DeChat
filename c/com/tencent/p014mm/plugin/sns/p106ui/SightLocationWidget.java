package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SightLocationWidget */
public class SightLocationWidget extends LocationWidget {
    public SightLocationWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public int getLayoutResource() {
        SnsMethodCalculate.markStartTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.SightLocationWidget");
        SnsMethodCalculate.markEndTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.SightLocationWidget");
        return C0966R.C0971layout.b88;
    }

    public int getNormalStateImageResource() {
        SnsMethodCalculate.markStartTimeMs("getNormalStateImageResource", "com.tencent.mm.plugin.sns.ui.SightLocationWidget");
        SnsMethodCalculate.markEndTimeMs("getNormalStateImageResource", "com.tencent.mm.plugin.sns.ui.SightLocationWidget");
        return C0966R.raw.sight_icon_location_normal;
    }

    public int getSelectedStateImageResource() {
        SnsMethodCalculate.markStartTimeMs("getSelectedStateImageResource", "com.tencent.mm.plugin.sns.ui.SightLocationWidget");
        SnsMethodCalculate.markEndTimeMs("getSelectedStateImageResource", "com.tencent.mm.plugin.sns.ui.SightLocationWidget");
        return C0966R.raw.sight_icon_location_selected;
    }

    public SightLocationWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
