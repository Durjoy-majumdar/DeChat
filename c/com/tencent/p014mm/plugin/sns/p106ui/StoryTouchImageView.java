package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;

/* renamed from: com.tencent.mm.plugin.sns.ui.StoryTouchImageView */
public class StoryTouchImageView extends TouchImageView {
    public StoryTouchImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.StoryTouchImageView");
        setLayerType(1, (Paint) null);
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.StoryTouchImageView");
    }
}
