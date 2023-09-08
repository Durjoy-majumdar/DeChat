package com.tencent.p014mm.plugin.sns.p106ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.p106ui.widget.AbsSnsUploadSayFooter;
import com.tencent.p014mm.sdk.platformtools.KeyBoardUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import p206nj.C76865k;

/* renamed from: com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter */
public class SnsUploadSayFooter extends AbsSnsUploadSayFooter {
    public SnsUploadSayFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    public void mo97973c() {
        SnsMethodCalculate.markStartTimeMs("refreshBottomPanelHeight", "com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter");
        int validPanelHeight = KeyBoardUtil.getValidPanelHeight(getContext());
        this.f206206g.setPortHeightPx(validPanelHeight);
        this.f206206g.mo100190c();
        ViewGroup.LayoutParams layoutParams = this.f206206g.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = validPanelHeight;
        }
        Log.m105925i("MicroMsg.SnsUploadSayFooter", "refreshBottomPanelHeight: smileyPanel height=%d", Integer.valueOf(validPanelHeight));
        SnsMethodCalculate.markEndTimeMs("refreshBottomPanelHeight", "com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter");
    }

    /* renamed from: d */
    public void mo97974d(boolean z, int i) {
        SnsMethodCalculate.markStartTimeMs("refreshUIOnInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter");
        if (!(this.f206211o == i || i == 0)) {
            this.f206211o = i;
            SnsMethodCalculate.markStartTimeMs("saveKeyboardHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            C76865k.m92671b(getContext(), i);
            SnsMethodCalculate.markEndTimeMs("saveKeyboardHeight", "com.tencent.mm.plugin.sns.ui.widget.AbsSnsUploadSayFooter");
            mo97973c();
        }
        if (z) {
            mo98024f();
            setTranslationY((float) (-i));
        } else {
            mo98023e();
            setTranslationY(0.0f);
        }
        SnsMethodCalculate.markEndTimeMs("refreshUIOnInputPanelChange", "com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter");
    }

    public int getSoftInputMode() {
        SnsMethodCalculate.markStartTimeMs("getSoftInputMode", "com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter");
        SnsMethodCalculate.markEndTimeMs("getSoftInputMode", "com.tencent.mm.plugin.sns.ui.SnsUploadSayFooter");
        return 32;
    }
}
