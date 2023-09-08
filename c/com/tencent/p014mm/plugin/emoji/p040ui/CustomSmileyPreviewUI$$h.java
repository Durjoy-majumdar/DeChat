package com.tencent.p014mm.plugin.emoji.p040ui;

import com.tencent.p014mm.plugin.emoji.p040ui.widget.ScaleRelativeLayout;

/* renamed from: com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$h */
public class CustomSmileyPreviewUI$$h implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CustomSmileyPreviewUI f268375d;

    public CustomSmileyPreviewUI$$h(CustomSmileyPreviewUI customSmileyPreviewUI) {
        this.f268375d = customSmileyPreviewUI;
    }

    public void run() {
        CustomSmileyPreviewUI customSmileyPreviewUI = this.f268375d;
        customSmileyPreviewUI.f268307A.setScaleChild(customSmileyPreviewUI.f268309C);
        CustomSmileyPreviewUI customSmileyPreviewUI2 = this.f268375d;
        ScaleRelativeLayout scaleRelativeLayout = customSmileyPreviewUI2.f268307A;
        float min = Math.min(Math.min(((float) scaleRelativeLayout.getMeasuredWidth()) / ((float) customSmileyPreviewUI2.f268309C.getMeasuredWidth()), ((float) scaleRelativeLayout.getMeasuredHeight()) / ((float) this.f268375d.f268309C.getMeasuredHeight())), 3.0f);
        scaleRelativeLayout.f269105d = min;
        scaleRelativeLayout.f269111j = min * 1.5f;
    }
}
