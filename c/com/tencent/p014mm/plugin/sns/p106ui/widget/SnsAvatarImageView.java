package com.tencent.p014mm.plugin.sns.p106ui.widget;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.p136ui.tools.MaskImageButton;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.sdk.platformtools.Log;

/* renamed from: com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView */
public class SnsAvatarImageView extends MaskImageButton {

    /* renamed from: q */
    public String f281528q = "";

    public SnsAvatarImageView(Context context) {
        super(context);
        getContext();
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
    }

    public void onMeasure(int i, int i2) {
        SnsMethodCalculate.markStartTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
        super.onMeasure(i, i2);
        SnsMethodCalculate.markEndTimeMs("onMeasure", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
    }

    /* renamed from: q */
    public void mo134068q(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("setUserNameAndPageNumber", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
        if (!this.f281528q.equals(str)) {
            this.f281528q = str;
        }
        SnsMethodCalculate.markEndTimeMs("setUserNameAndPageNumber", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
    }

    public void setUserName(String str) {
        SnsMethodCalculate.markStartTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
        mo134068q(str, -1);
        SnsMethodCalculate.markEndTimeMs("setUserName", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
    }

    public void setWeakContext(Context context) {
        SnsMethodCalculate.markStartTimeMs("setWeakContext", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
        if (!(context instanceof Activity)) {
            Log.m105928w("MicroMsg.SnsAvatarImageView", "weakContext is not activity");
        }
        SnsMethodCalculate.markEndTimeMs("setWeakContext", "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
    }

    public SnsAvatarImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        SnsMethodCalculate.markStartTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
        SnsMethodCalculate.markEndTimeMs(APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "com.tencent.mm.plugin.sns.ui.widget.SnsAvatarImageView");
    }
}
