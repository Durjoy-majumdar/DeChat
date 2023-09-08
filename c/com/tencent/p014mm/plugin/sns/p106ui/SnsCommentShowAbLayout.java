package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AbsoluteLayout;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsCommentShowAbLayout */
public class SnsCommentShowAbLayout extends AbsoluteLayout {
    public SnsCommentShowAbLayout(Context context) {
        super(context);
    }

    public void buildDrawingCache(boolean z) {
        SnsMethodCalculate.markStartTimeMs("buildDrawingCache", "com.tencent.mm.plugin.sns.ui.SnsCommentShowAbLayout");
        super.buildDrawingCache(z);
        SnsMethodCalculate.markEndTimeMs("buildDrawingCache", "com.tencent.mm.plugin.sns.ui.SnsCommentShowAbLayout");
    }

    public void destroyDrawingCache() {
        SnsMethodCalculate.markStartTimeMs("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.SnsCommentShowAbLayout");
        super.destroyDrawingCache();
        SnsMethodCalculate.markEndTimeMs("destroyDrawingCache", "com.tencent.mm.plugin.sns.ui.SnsCommentShowAbLayout");
    }

    public SnsCommentShowAbLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SnsCommentShowAbLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
