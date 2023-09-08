package com.tencent.p014mm.plugin.emoji.p040ui;

import android.text.TextUtils;
import di3.C86312j;
import i61.C98602h;
import te3.C101866x70;
import te3.C50330lz1;
import z51.C39315g;

/* renamed from: com.tencent.mm.plugin.emoji.ui.CustomSmileyPreviewUI$$d */
public class CustomSmileyPreviewUI$$d implements Runnable {

    /* renamed from: d */
    public final /* synthetic */ CustomSmileyPreviewUI f268371d;

    public CustomSmileyPreviewUI$$d(CustomSmileyPreviewUI customSmileyPreviewUI) {
        this.f268371d = customSmileyPreviewUI;
    }

    public void run() {
        C101866x70 x702;
        CustomSmileyPreviewUI customSmileyPreviewUI = this.f268371d;
        if (customSmileyPreviewUI.f268308B != null) {
            C50330lz1 lz12 = customSmileyPreviewUI.f268330U;
            boolean z = false;
            if (!(lz12 == null || (x702 = lz12.f137724d) == null || (x702.f299857i == 0 && TextUtils.isEmpty(x702.f299856h)))) {
                z = true;
            }
            if (!z) {
                this.f268371d.f268308B.setText(((C98602h) ((C39315g) C86312j.m106911c(C39315g.class)).mo58035cm()).mo138012T(this.f268371d.f268364z.getMd5()));
            }
        }
    }
}
