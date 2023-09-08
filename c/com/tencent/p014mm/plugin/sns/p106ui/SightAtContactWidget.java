package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SightAtContactWidget */
public class SightAtContactWidget extends AtContactWidget {
    public SightAtContactWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public int getLayoutResource() {
        SnsMethodCalculate.markStartTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.SightAtContactWidget");
        SnsMethodCalculate.markEndTimeMs("getLayoutResource", "com.tencent.mm.plugin.sns.ui.SightAtContactWidget");
        return C0966R.C0971layout.bzg;
    }

    public int getWithDrawableId() {
        SnsMethodCalculate.markStartTimeMs("getWithDrawableId", "com.tencent.mm.plugin.sns.ui.SightAtContactWidget");
        SnsMethodCalculate.markEndTimeMs("getWithDrawableId", "com.tencent.mm.plugin.sns.ui.SightAtContactWidget");
        return C0966R.raw.sight_icon_mention;
    }

    public int getWithEmptyDrawableId() {
        SnsMethodCalculate.markStartTimeMs("getWithEmptyDrawableId", "com.tencent.mm.plugin.sns.ui.SightAtContactWidget");
        SnsMethodCalculate.markEndTimeMs("getWithEmptyDrawableId", "com.tencent.mm.plugin.sns.ui.SightAtContactWidget");
        return C0966R.raw.sight_icon_mention;
    }

    public SightAtContactWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
